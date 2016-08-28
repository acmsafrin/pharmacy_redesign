angular.module('pharmacy.controllers').controller('importer', ['$scope','ReloadList','Importer', function($scope,ReloadList,Importer) {
       
        $scope.view = function(id) {
            $scope.current = Importer.REST.get({id: id});
        }

        $scope.add = function() {
            $scope.current = new Importer.REST();
        }
        
        $scope.load = function() {
           $scope.list = Importer.REST.query();
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