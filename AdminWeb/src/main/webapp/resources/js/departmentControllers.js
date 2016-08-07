angular.module('department.controllers', []).controller('department_list', ['$scope', '$window', 'Department',function($scope, $window, Department) {
  $scope.list = Department.query();
  $scope.delete= function(obj) {    
      obj.$delete(function() {
        $window.location.href = ''; 
      });    
  };
}]).controller('department_view',['$scope', '$stateParams', 'Department', function($scope, $stateParams, Department) {
  $scope.current = Department.get({ id: $stateParams.id }); 
}]).controller('department_new',['$scope', '$state', 'Department',function($scope, $state, Department) {
  $scope.current = new Department();  

  $scope.add = function() { 
    $scope.current.$save(function() {
      $state.go('department_list'); 
    });
  };
}]).controller('department_edit',['$scope', '$state', '$stateParams', 'Department', function($scope, $state, $stateParams, Department) {
  $scope.update = function() { 
    $scope.current.$update(function() {
      $state.go('department_list'); 
    });
  };

  $scope.load = function() { 
    $scope.current = Department.get({ id: $stateParams.id });
  };

  $scope.load(); 
}]);