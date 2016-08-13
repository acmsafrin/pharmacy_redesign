angular.module('category.controller', []).controller('category', ['$scope', '$state', 'Category', function($scope, $state, Category) {
        
        $scope.view = function(id) {
            $scope.current = Category.REST.get({id: id});
        }

        $scope.add = function() {
            $scope.current = new Category.REST();
        }
        
        $scope.load = function() {
           $scope.list = Category.REST.query();
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