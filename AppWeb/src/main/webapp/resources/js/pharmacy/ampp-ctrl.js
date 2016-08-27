angular.module('pharmacy.controllers').controller('ampp', ['$scope', 'ReloadList', 'Ampp', function($scope, ReloadList, Ampp) {

        $scope.view = function(id) {
            $scope.current = Ampp.REST.get({id: id});
        }

        $scope.add = function() {
            $scope.current = new Ampp.REST();
        }

        $scope.load = function() {
            $scope.list = Ampp.REST.query();
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