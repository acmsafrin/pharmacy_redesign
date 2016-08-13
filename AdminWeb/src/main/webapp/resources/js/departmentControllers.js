angular.module('department.controllers', []).controller('department_list', ['$scope', '$window', 'Department', function($scope, $window, Department) {
        $scope.list = Department.REST.query();
        $scope.delete = function(obj) {
            obj.$delete(function() {
                $window.location.href = '';
            });
        };
    }]).controller('department_view', ['$scope', '$stateParams', 'Department', function($scope, $stateParams, Department) {
        $scope.current = Department.REST.get({id: $stateParams.id});
    }]).controller('department_new', ['$scope', '$state', 'Department', 'Institution', function($scope, $state, Department, Institution) {
        $scope.current = new Department.REST();
        $scope.institutionFilter = Institution.FILTER;
        $scope.add = function() {
            $scope.current.$save(function() {
                $state.go('department_list');
            });
        };
    }]).controller('department_edit', ['$scope', '$state', '$stateParams', 'Department','Institution', function($scope, $state, $stateParams, Department,Institution) {    
        $scope.institutionFilter = Institution.FILTER;        
        $scope.update = function() {                          
            $scope.current.$update(function() {
                $state.go('department_list');
            });
        };

        $scope.load = function() {
            $scope.current = Department.REST.get({id: $stateParams.id});
        };

        $scope.load();
    }]);