angular.module('category.controller', []).controller('category', ['$scope', '$state','Session', 'Category', function($scope, $state,Session, Category) {
        
        $scope.view = function(id) {
            $scope.current = Category.REST.get({id: id});
        }

        $scope.add = function() {
            $scope.current = new Category.REST();
            $scope.current.creater=Session.getLoggedUser();
        }
        
        $scope.load = function() {
           $scope.list = Category.REST.query();
        }

        $scope.delete = function() {
            $scope.current.retirer=Session.getLoggedUser();
            console.log(JSON.stringify($scope.current));
            $scope.current.$delete(function() {
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