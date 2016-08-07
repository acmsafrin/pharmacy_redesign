angular.module('pharmacyApp.controllers', []).controller('CategoryListController', function($scope, $state, $window, Category) {
  $scope.categories = Category.query(); 

  $scope.deleteCategory = function(category) {    
      category.$delete(function() {
        $window.location.href = ''; 
      });    
  };
}).controller('CategoryViewController', function($scope, $stateParams, Category) {
  $scope.category = Category.get({ id: $stateParams.id }); 
}).controller('CategoryCreateController', function($scope, $state, $stateParams, Category) {
  $scope.category = new Category();  

  $scope.addCategory = function() { 
    $scope.category.$save(function() {
      $state.go('categories'); 
    });
  };
}).controller('CategoryEditController', function($scope, $state, $stateParams, Category) {
  $scope.updateCategory = function() { 
    $scope.category.$update(function() {
      $state.go('categories'); 
    });
  };

  $scope.loadCategory = function() { 
    $scope.category = Category.get({ id: $stateParams.id });
  };

  $scope.loadCategory(); 
});