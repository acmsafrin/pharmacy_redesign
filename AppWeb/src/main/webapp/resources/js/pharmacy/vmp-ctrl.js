angular.module('pharmacy.controllers').controller('vmp', ['$scope', 'ReloadList', 'Vmp', function($scope, ReloadList, Vmp) {

        $scope.view = function(id) {
            $scope.current = Vmp.REST.get({id: id});
        }

        $scope.add = function() {
            $scope.current = new Vmp.REST();
        }

        $scope.load = function() {
            $scope.list = Vmp.REST.query();
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