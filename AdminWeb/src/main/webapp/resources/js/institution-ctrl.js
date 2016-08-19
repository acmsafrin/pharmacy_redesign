angular.module('institution.controller', []).controller('institution', ['$scope', '$state','Institution', function($scope, $state,Institution) {
        $scope.institutionTypes = [{name: 'Manufacturer', value: 'Manufacturer'}, {name: 'Importer', value: 'Importer'},
            {name: 'CreditCompany', value: 'CreditCompany'}, {name: 'Bank', value: 'Bank'},
            {name: 'Lab', value: 'Lab'}, {name: 'Hospital', value: 'Hospital'},
            {name: 'Dealer', value: 'Dealer'}];
 
        $scope.view = function(id) {
            $scope.current = Institution.REST.get({id: id});
        }

        $scope.add = function() {
            $scope.current = new Institution.REST();
            $scope.current.creater=Session.getLoggedUser();
        }
        
        $scope.load = function() {
           $scope.list = Institution.REST.query();
        }

        $scope.delete = function() {
            $scope.current.retirer=Session.getLoggedUser();
            $scope.current.$delete(function() {
                $state.reload();
            });
        };

        $scope.save = function() {           
            if (angular.isUndefined($scope.current.id)) {
                $scope.current.$save(function() {
                    $state.reload();
                });
            } else {
                $scope.current.$update(function() {
                    $state.reload();
                });
            }
        }

        $scope.add();
        $scope.load();
    }]);