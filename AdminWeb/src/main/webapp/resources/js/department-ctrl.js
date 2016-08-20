angular.module('department.controller', []).controller('department', ['$scope', '$state','ReloadList','Department','Institution', function($scope, $state,ReloadList,Department,Institution) {
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