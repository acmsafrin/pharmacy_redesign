angular.module('category.controllers', []).controller('category_list', ['$scope', '$window', 'Category',function($scope, $window, Category) {
  $scope.list = Category.query();
  $scope.delete= function(obj) {    
      obj.$delete(function() {
        $window.location.href = ''; 
      });    
  };
}]).controller('category_view',['$scope', '$stateParams', 'Category', function($scope, $stateParams, Category) {
  $scope.current = Category.get({ id: $stateParams.id }); 
}]).controller('category_new',['$scope', '$state', 'Category',function($scope, $state, Category) {
  $scope.current = new Category();  

  $scope.add = function() { 
    $scope.current.$save(function() {
      $state.go('category_list'); 
    });
  };
}]).controller('category_edit',['$scope', '$state', '$stateParams', 'Category', function($scope, $state, $stateParams, Category) {
  $scope.update = function() { 
    $scope.current.$update(function() {
      $state.go('category_list'); 
    });
  };

  $scope.load = function() { 
    $scope.current = Category.get({ id: $stateParams.id });
  };

  $scope.load(); 
}]);