angular.module('pharmacy.controllers').controller('measurementunit', ['$scope', 'ReloadList', 'Measurementunit', function($scope, ReloadList, Measurementunit) {

        $scope.view = function(id) {
            $scope.current = Measurementunit.REST.get({id: id});
        }

        $scope.add = function() {
            $scope.current = new Measurementunit.REST();
        }

        $scope.load = function() {
            $scope.list = Measurementunit.REST.query();
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