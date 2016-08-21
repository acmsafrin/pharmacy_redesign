angular.module('pharmacy.factories')
        .factory('Pharmaceuticalitemcategory', ['$resource', function($resource) {
                return{
                    REST: $resource('http://localhost:8080/PharmacyAPI/pharmaceuticalItemCategory/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    })
                }
            }])
        .factory('Pharmaceuticalitemtype', ['$resource', function($resource) {
                return{
                    REST: $resource('http://localhost:8080/PharmacyAPI/pharmaceuticalItemType/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    })
                }
            }]);
        