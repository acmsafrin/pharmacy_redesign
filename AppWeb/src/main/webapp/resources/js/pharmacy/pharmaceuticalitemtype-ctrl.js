angular.module('pharmacy.controllers').controller('pharmaceuticalitemtype', ['$scope', 'ReloadList', 'Pharmaceuticalitemtype', function($scope, ReloadList, Pharmaceuticalitemtype) {

        $scope.view = function(id) {
            $scope.current = Pharmaceuticalitemtype.REST.get({id: id});
        }

        $scope.add = function() {
            $scope.current = new Pharmaceuticalitemtype.REST();
        }

        $scope.load = function() {
            $scope.list = Pharmaceuticalitemtype.REST.query();
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