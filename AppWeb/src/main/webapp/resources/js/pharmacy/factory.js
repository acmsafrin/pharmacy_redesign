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
            }])
        .factory('Vtm', ['$resource', function($resource) {
                return{
                    REST: $resource('http://localhost:8080/PharmacyAPI/vtm/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    })
                }
            }])
        .factory('Vmp', ['$resource', function($resource) {
                return{
                    REST: $resource('http://localhost:8080/PharmacyAPI/vmp/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    })
                }
            }])
        .factory('Amp', ['$resource', function($resource) {
                return{
                    REST: $resource('http://localhost:8080/PharmacyAPI/amp/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    })
                }
            }]);
        