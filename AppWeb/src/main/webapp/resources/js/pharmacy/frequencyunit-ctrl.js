angular.module('pharmacy.controllers').controller('frequencyunit', ['$scope', 'ReloadList', 'Frequencyunit', function($scope, ReloadList, Frequencyunit) {

        $scope.view = function(id) {
            $scope.current = Frequencyunit.REST.get({id: id});
        }

        $scope.add = function() {
            $scope.current = new Frequencyunit.REST();
        }

        $scope.load = function() {
            $scope.list = Frequencyunit.REST.query();
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