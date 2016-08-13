angular.module('institution.controllers', []).controller('institution_list', ['$scope', '$window', 'Institution',function($scope, $window, Institution) {
  $scope.list = Institution.REST.query();
  $scope.delete= function(obj) {    
      obj.$delete(function() {
        $window.location.href = ''; 
      });    
  };
}]).controller('institution_view',['$scope', '$stateParams', 'Institution', function($scope, $stateParams, Institution) {
  $scope.current = Institution.REST.get({ id: $stateParams.id }); 
}]).controller('institution_new',['$scope', '$state', 'Institution',function($scope, $state, Institution) {
  $scope.current = new Institution.REST();  

  $scope.add = function() { 
    $scope.current.$save(function() {
      $state.go('institution_list'); 
    });
  };
}]).controller('institution_edit',['$scope', '$state', '$stateParams', 'Institution', function($scope, $state, $stateParams, Institution) {
  $scope.update = function() { 
    $scope.current.$update(function() {
      $state.go('institution_list'); 
    });
  };

  $scope.load = function() { 
    $scope.current = Institution.REST.get({ id: $stateParams.id });
  };

  $scope.load(); 
}]);