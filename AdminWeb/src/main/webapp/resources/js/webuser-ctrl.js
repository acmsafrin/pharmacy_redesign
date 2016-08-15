angular.module('webuser.controller', []).controller('webuser', ['$scope', '$state','Session', 'Webuser','Institution', function($scope, $state,Session, Webuser,Institution) {
        $scope.institutionFilter = Institution.FILTER;
        $scope.view = function(id) {
            $scope.current = Webuser.REST.get({id: id});
        }

        $scope.add = function() {
            $scope.current = new Webuser.REST();
            $scope.current.creater=Session.getLoggedUser();
        }
        
        $scope.load = function() {
           $scope.list = Webuser.REST.query();
        }

        $scope.delete = function() {
            $scope.current.retirer=Session.getLoggedUser();
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