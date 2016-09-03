angular.module('pharmacy.controllers').controller('amp', ['$scope', 'ReloadList', 'Paginate', 'Amp', function($scope, ReloadList,Paginate, Amp) {
        $scope.prev = function() {
            if (Paginate.checkPrev()) {
                return;
            }
            Paginate.decrement();
            $scope.list = Amp.REST.query({offset: Paginate.offset.prev, pagesize: Paginate.pagesize}).list;
        }

        $scope.next = function() {
            if (Paginate.checkNext($scope.list)) {
                return;
            }
            $scope.list = Amp.REST.query({offset: Paginate.offset.next, pagesize: Paginate.pagesize}).list;
            Paginate.increment();
        }

        $scope.view = function(id) {
            $scope.current = Amp.REST.get({id: id});
        }

        $scope.add = function() {
            $scope.current = new Amp.REST();
        }

        $scope.load = function() {
            $scope.next();
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