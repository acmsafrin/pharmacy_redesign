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
            }])
        .factory('Ampp', ['$resource', function($resource) {
                return{
                    REST: $resource('http://localhost:8080/PharmacyAPI/ampp/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    })
                }
            }])
         .factory('Measurementunit', ['$resource', function($resource) {
                return{
                    REST: $resource('http://localhost:8080/PharmacyAPI/measurementUnit/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    })
                }
            }])
        .factory('Frequencyunit', ['$resource', function($resource) {
                return{
                    REST: $resource('http://localhost:8080/PharmacyAPI/frequencyUnit /:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    })
                }
            }]);
        