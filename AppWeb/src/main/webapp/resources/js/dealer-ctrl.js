angular.module('pharmacy.controllers').controller('dealer', ['$scope', 'ReloadList','Dealer', function($scope, ReloadList,Dealer) {
       
        $scope.view = function(id) {
            $scope.current = Dealer.REST.get({id: id});
        }

        $scope.add = function() {
            $scope.current = new Dealer.REST();
        }
        
        $scope.load = function() {
           $scope.list = Dealer.REST.query();
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