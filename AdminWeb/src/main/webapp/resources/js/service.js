angular
        .module('pharmacyApp.services', []).factory('Category', function($resource) {
    return $resource('http://localhost:8080/AdminAPI/category/:id', {id: '@id'}, {
        update: {
            method: 'PUT'
        }
    });
});