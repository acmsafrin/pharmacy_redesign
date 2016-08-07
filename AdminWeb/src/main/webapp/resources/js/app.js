angular.module('pharmacyApp', ['ui.router', 'ngResource', 'pharmacyApp.controllers', 'pharmacyApp.services']);

angular.module('pharmacyApp').config(function($stateProvider) {
  $stateProvider.state('categories', { // state for showing all movies
    url: '/categories',
    templateUrl: 'AdminWeb/partials/categories.html',
    controller: 'CategoryListController'
  }).state('viewCategory', { //state for showing single movie
    url: '/categories/:id/view',
    templateUrl: 'AdminWeb/partials/category-view.html',
    controller: 'CategoryViewController'
  }).state('newCategory', { //state for adding a new movie
    url: '/categories/new',
    templateUrl: 'AdminWeb/partials/category-add.html',
    controller: 'CategoryCreateController'
  }).state('editCategory', { //state for updating a movie
    url: '/categories/:id/edit',
    templateUrl: 'AdminWeb/partials/category-edit.html',
    controller: 'CategoryEditController'
  });
}).run(function($state) {
  $state.go('categories'); //make a transition to movies state when app starts
});