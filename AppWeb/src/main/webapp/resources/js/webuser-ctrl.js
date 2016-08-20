angular.module('pharmacy.controllers').controller('webuser', ['$scope', '$state', 'ReloadList', 'Webuser', 'Institution', function($scope, $state, ReloadList, Webuser, Institution) {
        $scope.institutionFilter = Institution.FILTER;
        $scope.view = function(id) {
            $scope.current = Webuser.REST.get({id: id});
        }

        $scope.add = function() {
            $scope.current = new Webuser.REST();
        }

        $scope.load = function() {
            $scope.list = Webuser.REST.query();
        }

        $scope.delete = function() {
            $scope.current.$delete(function(res) {
                ReloadList.reload(res);
            });
        };

        $scope.save = function() {            
            if (angular.isUndefined($scope.current.id)) {
                $scope.current.$save(function(res) {
                    ReloadList.reload(res);
                });
            } else {
                $scope.current.$update(function(res) {
                    ReloadList.reload(res);
                });
            }
        }

        $scope.add();
        $scope.load();
    }]);