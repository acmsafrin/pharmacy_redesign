angular.module('pharmacy.controllers').controller('institution', ['$scope', '$state','ReloadList','Institution', function($scope, $state,ReloadList,Institution) {
        $scope.institutionTypes = [{name: 'Manufacturer', value: 'Manufacturer'}, {name: 'Importer', value: 'Importer'},
            {name: 'CreditCompany', value: 'CreditCompany'}, {name: 'Bank', value: 'Bank'},
            {name: 'Lab', value: 'Lab'}, {name: 'Hospital', value: 'Hospital'},
            {name: 'Dealer', value: 'Dealer'}];
 
        $scope.view = function(id) {
            $scope.current = Institution.REST.get({id: id});
        }

        $scope.add = function() {
            $scope.current = new Institution.REST();
        }
        
        $scope.load = function() {
           $scope.list = Institution.REST.query();
        }

        $scope.delete = function() {
            $scope.current.$delete(function(res) {
                ReloadList.reload(res);
            });
        };

        $scope.save = function() {           
            if (angular.isUndefined($scope.current.id)) {
                $scope.current.$save(function(res) {
                    ReloadList.reload(res);
                });
            } else {
                $scope.current.$update(function(res) {
                    ReloadList.reload(res);
                });
            }
        }

        $scope.add();
        $scope.load();
    }]);