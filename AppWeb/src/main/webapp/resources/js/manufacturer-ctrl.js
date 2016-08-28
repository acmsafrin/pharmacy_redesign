angular.module('pharmacy.controllers').controller('manufacturer', ['$scope','ReloadList','Manufacturer', function($scope,ReloadList,Manufacturer) {
       
        $scope.view = function(id) {
            $scope.current = Manufacturer.REST.get({id: id});
        }

        $scope.add = function() {
            $scope.current = new Manufacturer.REST();
        }
        
        $scope.load = function() {
           $scope.list = Manufacturer.REST.query();
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