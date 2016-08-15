angular.module('pharmacyApp.factories', [])
        .factory('Category', ['$resource', function($resource) {
                return{
                    REST: $resource('http://localhost:8080/AdminAPI/category/:id', {id: '@id'}, {
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
        .factory('Webuser', ['$resource', function($resource) {
                return{                    
                    REST: $resource('http://localhost:8080/AdminAPI/webuser/:id', {id: '@id'}, {
                        update: {
                            method: 'PUT'
                        }
                    })
                }
            }]);
         