angular.module('pharmacyApp', ['ui.router', 'ngResource', 'category.controllers','department.controllers', 'pharmacyApp.services']);

angular.module('pharmacyApp').config(['$stateProvider',function($stateProvider) {
  //Category
  $stateProvider.state('category_list', { 
    url: '/category',
    templateUrl: 'partials/category/list.html',
    controller: 'category_list'
  }).state('category_view', { 
    url: '/category/:id/view',
    templateUrl: 'partials/category/view.html',
    controller: 'category_view'
  }).state('category_new', {
    url: '/category/new',
    templateUrl: 'partials/category/new.html',
    controller: 'category_new'
  }).state('category_edit', { 
    url: '/category/:id/edit',
    templateUrl: 'partials/category/edit.html',
    controller: 'category_edit'
 //Deparmtent
  }).state('department_list', { 
    url: '/department',
    templateUrl: 'partials/department/list.html',
    controller: 'department_list'
  }).state('department_view', { 
    url: '/department/:id/view',
    templateUrl: 'partials/department/view.html',
    controller: 'department_view'
  }).state('department_new', {
    url: '/department/new',
    templateUrl: 'partials/department/new.html',
    controller: 'department_new'
  }).state('department_edit', { 
    url: '/department/:id/edit',
    templateUrl: 'partials/department/edit.html',
    controller: 'department_edit'
  })
}]).run(['$state',function($state) {
  $state.go('category_list'); //make a transition to movies state when app starts
}]);