angular.module('department.controller', []).controller('department', ['$scope', '$state','Session', 'Department','Institution', function($scope, $state,Session, Department,Institution) {
        $scope.institutionFilter = Institution.FILTER;
        
        $scope.view = function(id) {
            $scope.current = Department.REST.get({id: id});
        }

        $scope.add = function() {            
            $scope.current = new Department.REST();  
            $scope.current.creater=Session.getLoggedUser();
        }
        
        $scope.load = function() {
           $scope.list = Department.REST.query();
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