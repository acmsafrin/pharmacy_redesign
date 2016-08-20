angular.module('pharmacy.controllers').controller('category', ['$scope', '$state','ReloadList', 'Category', function($scope, $state,ReloadList, Category) {
        
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