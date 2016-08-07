angular.module('pharmacyApp.services', [])
        .factory('Category', ['$resource',function($resource) {
            return $resource('http://localhost:8080/AdminAPI/category/:id', {id: '@id'}, {
                update: {
                     method: 'PUT'
                }
            });
        }])
        .factory('Department', ['$resource',function($resource) {
            return $resource('http://localhost:8080/AdminAPI/department/:id', {id: '@id'}, {
                update: {
                     method: 'PUT'
                }
            });
        }]);
         