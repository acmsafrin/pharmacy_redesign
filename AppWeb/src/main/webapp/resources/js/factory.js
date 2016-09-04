angular.module('pharmacy.factories')
        .factory('AdminProperty', [function() {
                //http://www.tutorialspoint.com/angular_material/angular_material_autocomplete.htm
                //http://stackoverflow.com/questions/17134401/angular-extending-resource-subobject-with-custom-methods
                return{
                    root: 'http://localhost:8080/AdminAPI/',
                    entity: {
                        category: 'category',
                        itemDistributor: 'itemDistributor',
                        department: 'department',
                        institution: 'institution',
                        dealer: 'dealer',
                        importer: 'importer',
                        manufacturer: 'manufacturer',
                        webuser: 'webuser'
                    }
                }
            }])
        .factory('Category', ['$resource', 'AdminProperty', function($resource, AdminProperty) {
                return{
                    REST: $resource(AdminProperty.root + AdminProperty.entity.category + '/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    })
                }
            }])
        .factory('Itemdistributer', ['$resource', 'AdminProperty', function($resource, AdminProperty) {
                return{
                    REST: $resource(AdminProperty.root + AdminProperty.entity.itemDistributor + '/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        },
                        count: {
                            url: AdminProperty.root + AdminProperty.entity.itemDistributor + '/count',
                            method: 'GET'
                        },
                        bydealer: {
                            url: AdminProperty.root + AdminProperty.entity.itemDistributor + '/dealer',
                            method: 'GET',
                            isArray: true,
                        },
                    })
                }
            }])
        .factory('Department', ['$resource', 'AdminProperty', function($resource, AdminProperty) {
                return{
                    REST: $resource(AdminProperty.root + AdminProperty.entity.department + '/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        },
                    })
                }
            }])
        .factory('Institution', ['$resource', '$q', '$http', 'AdminProperty', function($resource, $q, $http, AdminProperty) {
                return{
                    REST: $resource(AdminProperty.root + AdminProperty.entity.institution + '/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    }),
                    FILTER: {
                        filterByName: function(query) {
                            var deferred = $q.defer();
                            $http.get(AdminProperty.root + AdminProperty.entity.institution + '/name/' + query)
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
        .factory('Dealer', ['$resource', '$q', '$http', 'AdminProperty', function($resource, $q, $http, AdminProperty) {
                return{
                    REST: $resource(AdminProperty.root + AdminProperty.entity.dealer + '/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        },
                        query: {
                            method: 'GET',
                            isArray: true,
                            transformResponse: function(data, header) {
                                var wrapped = angular.fromJson(data);
                                return wrapped.items;
                            }
                        }
                    }),
                    FILTER: {
                        filterByName: function(query) {
                            var deferred = $q.defer();
                            $http.get(AdminProperty.root + AdminProperty.entity.dealer + '/name/' + query)
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
                        },
                    }
                }
            }])
        .factory('Importer', ['$resource', '$q', '$http', 'AdminProperty', function($resource, $q, $http, AdminProperty) {
                return{
                    REST: $resource(AdminProperty.root + AdminProperty.entity.importer + '/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    }),
                    FILTER: {
                        filterByName: function(query) {
                            var deferred = $q.defer();
                            $http.get(AdminProperty.root + AdminProperty.entity.importer + '/name/' + query)
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
        .factory('Manufacturer', ['$resource', '$q', '$http', 'AdminProperty', function($resource, $q, $http, AdminProperty) {
                return{
                    REST: $resource(AdminProperty.root + AdminProperty.entity.manufacturer + '/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    }),
                    FILTER: {
                        filterByName: function(query) {
                            var deferred = $q.defer();
                            $http.get(AdminProperty.root + AdminProperty.entity.manufacturer + '/name/' + query)
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
        .factory('Webuser', ['$resource', 'AdminProperty', function($resource, AdminProperty) {
                return{
                    REST: $resource(AdminProperty.root + AdminProperty.entity.webuser + '/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    })
                }
            }]);
         