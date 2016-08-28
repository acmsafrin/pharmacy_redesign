angular.module('pharmacy.controllers').controller('itemdistributer', ['$scope', '$state','ReloadList', 'Itemdistributer', function($scope, $state,ReloadList, Itemdistributer) {
        
        $scope.view = function(id) {
            $scope.current = Itemdistributer.REST.get({id: id});
        }

        $scope.add = function() {
            $scope.current = new Itemdistributer.REST();
        }
        
        $scope.load = function() {
           $scope.list = Itemdistributer.REST.query();
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