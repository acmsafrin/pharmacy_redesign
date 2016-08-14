angular.module('department.controller', []).controller('department', ['$scope', '$state', 'Department','Institution', function($scope, $state, Department,Institution) {
        $scope.institutionFilter = Institution.FILTER;
        
        $scope.view = function(id) {
            $scope.current = Department.REST.get({id: id});
        }

        $scope.add = function() {            
            $scope.current = new Department.REST();  
        }
        
        $scope.load = function() {
           $scope.list = Department.REST.query();
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