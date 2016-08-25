angular.module('pharmacy.controllers').controller('amp', ['$scope', 'ReloadList', 'Amp', function($scope, ReloadList, Amp) {

        $scope.view = function(id) {
            $scope.current = Amp.REST.get({id: id});
        }

        $scope.add = function() {
            $scope.current = new Amp.REST();
        }

        $scope.load = function() {
            $scope.list = Amp.REST.query();
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