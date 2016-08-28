angular.module('pharmacy.factories')
        .factory('Category', ['$resource', function($resource) {
                return{
                    REST: $resource('http://localhost:8080/AdminAPI/category/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    })
                }
            }])
         .factory('Itemdistributer', ['$resource', function($resource) {
                return{
                    REST: $resource('http://localhost:8080/AdminAPI/itemDistributor/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    })
                }
            }])
        .factory('Department', ['$resource', function($resource) {
                return{
                    REST: $resource('http://localhost:8080/AdminAPI/department/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    })
                }
            }])
        .factory('Institution', ['$resource', '$q', '$http', function($resource, $q, $http) {
                return{
                    REST: $resource('http://localhost:8080/AdminAPI/institution/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    }),
                    FILTER: {
                        //http://www.tutorialspoint.com/angular_material/angular_material_autocomplete.htm
                        filterByName: function(query) {
                            var deferred = $q.defer();
                            $http.get('http://localhost:8080/AdminAPI/institution/name/' + query)
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
        .factory('Dealer', ['$resource', '$q', '$http', function($resource, $q, $http) {
                return{
                    REST: $resource('http://localhost:8080/AdminAPI/dealer/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    }),
                    FILTER: {
                        //http://www.tutorialspoint.com/angular_material/angular_material_autocomplete.htm
                        filterByName: function(query) {
                            var deferred = $q.defer();
                            $http.get('http://localhost:8080/AdminAPI/dealer/name/' + query)
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
        .factory('Importer', ['$resource', '$q', '$http', function($resource, $q, $http) {
                return{
                    REST: $resource('http://localhost:8080/AdminAPI/importer/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    }),
                    FILTER: {
                        //http://www.tutorialspoint.com/angular_material/angular_material_autocomplete.htm
                        filterByName: function(query) {
                            var deferred = $q.defer();
                            $http.get('http://localhost:8080/AdminAPI/importer/name/' + query)
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
        .factory('Manufacturer', ['$resource', '$q', '$http', function($resource, $q, $http) {
                return{
                    REST: $resource('http://localhost:8080/AdminAPI/manufacturer/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    }),
                    FILTER: {
                        //http://www.tutorialspoint.com/angular_material/angular_material_autocomplete.htm
                        filterByName: function(query) {
                            var deferred = $q.defer();
                            $http.get('http://localhost:8080/AdminAPI/manufacturer/name/' + query)
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
        .factory('Webuser', ['$resource', function($resource) {
                return{                    
                    REST: $resource('http://localhost:8080/AdminAPI/webuser/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    })
                }
            }]);
         