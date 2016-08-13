angular.module('institution.controller', []).controller('institution', ['$scope', '$state', 'Institution', function($scope, $state, Institution) {
        
        $scope.view = function(id) {
            $scope.current = Institution.REST.get({id: id});
        }

        $scope.add = function() {
            $scope.current = new Institution.REST();
        }
        
        $scope.load = function() {
           $scope.list = Institution.REST.query();
        }

        $scope.delete = function() {
            $scope.$delete(function() {
                $state.reload();
            });
        };

        $scope.save = function() {           
            if (angular.isUndefined($scope.current.id)) {
                $scope.current.$save(function() {
                    $state.reload();
                });
            } else {
                $scope.current.$update(function() {
                    $state.reload();
                });
            }
        }

        $scope.add();
        $scope.load();
    }]);