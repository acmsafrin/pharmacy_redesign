angular.module('pharmacy.controllers').controller('pharmaceuticalitemcategory', ['$scope', '$state','ReloadList', 'Pharmaceuticalitemcategory', function($scope, $state,ReloadList, Pharmaceuticalitemcategory) {
        
        $scope.view = function(id) {
            $scope.current = Pharmaceuticalitemcategory.REST.get({id: id});
        }

        $scope.add = function() {
            $scope.current = new Pharmaceuticalitemcategory.REST();
        }
        
        $scope.load = function() {
           $scope.list = Pharmaceuticalitemcategory.REST.query();
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