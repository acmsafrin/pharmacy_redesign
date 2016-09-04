angular.module('pharmacy.factories')
        .factory('PharmacyProperty', [function() {
                //http://www.tutorialspoint.com/angular_material/angular_material_autocomplete.htm
                return{
                    root: 'http://localhost:8080/PharmacyAPI/',
                    entity: {
                        pharmaceuticalItemCategory: 'pharmaceuticalItemCategory',
                        pharmaceuticalItemType: 'pharmaceuticalItemType',
                        vtm: 'vtm',
                        vmp: 'vmp',
                        amp: 'amp',
                        ampp: 'ampp',
                        measurementUnit: 'measurementUnit',
                        frequencyUnit: 'frequencyUnit'
                    }
                }
            }])
        .factory('Pharmaceuticalitemcategory', ['$resource', 'PharmacyProperty', function($resource, PharmacyProperty) {
                return{
                    REST: $resource(PharmacyProperty.root + PharmacyProperty.entity.pharmaceuticalItemCategory + '/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    })
                }
            }])
        .factory('Pharmaceuticalitemtype', ['$resource', 'PharmacyProperty', function($resource, PharmacyProperty) {
                return{
                    REST: $resource(PharmacyProperty.root + PharmacyProperty.entity.pharmaceuticalItemType + '/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    })
                }
            }])
        .factory('Vtm', ['$resource', 'PharmacyProperty', function($resource, PharmacyProperty) {
                return{
                    REST: $resource(PharmacyProperty.root + PharmacyProperty.entity.vtm + '/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    })
                }
            }])
        .factory('Vmp', ['$resource', 'PharmacyProperty', function($resource, PharmacyProperty) {
                return{
                    REST: $resource(PharmacyProperty.root + PharmacyProperty.entity.vmp + '/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    })
                }
            }])
        .factory('Amp', ['$resource', '$q', '$http' , 'PharmacyProperty', function($resource,$q,$http, PharmacyProperty) {
                return{
                    REST: $resource(PharmacyProperty.root + PharmacyProperty.entity.amp + '/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        },
                    }),
                    FILTER: {
                        filterByName: function(query) {
                            var deferred = $q.defer();
                            $http.get(PharmacyProperty.root + PharmacyProperty.entity.amp + '/name/' + query)
                                    .success(function(data) {
                                        deferred.resolve(angular.forEach(data, function(obj, key) {
                                            return{value: {id: obj.id},
                                                name: obj.name
                                            }
                                        }));
                                    }).error(function(msg, code) {
                                deferred.reject(msg);
                            });
                            return deferred.promise;
                        }
                    }
                }
            }])
        .factory('Ampp', ['$resource', 'PharmacyProperty', function($resource, PharmacyProperty) {
                return{
                    REST: $resource(PharmacyProperty.root + PharmacyProperty.entity.ampp + '/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    })
                }
            }])
        .factory('Measurementunit', ['$resource', 'PharmacyProperty', function($resource, PharmacyProperty) {
                return{
                    REST: $resource(PharmacyProperty.root + PharmacyProperty.entity.measurementUnit + '/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    })
                }
            }])
        .factory('Frequencyunit', ['$resource', 'PharmacyProperty', function($resource, PharmacyProperty) {
                return{
                    REST: $resource(PharmacyProperty.root + PharmacyProperty.entity.frequencyUnit + '/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    })
                }
            }]);
        