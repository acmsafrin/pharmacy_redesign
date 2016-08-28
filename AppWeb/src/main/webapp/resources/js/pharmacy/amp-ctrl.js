angular.module('pharmacy.controllers').controller('amp', ['$scope', 'ReloadList', 'Amp', function($scope, ReloadList, Amp) {
        $scope.paginate = {
            pagesize: 1000,
            offset: {
                next: 0,
                prev: 0,
            },
            checkPrev: function() {
                return $scope.paginate.offset.prev == 0;
            },
            checkNext: function() {
                return ($scope.paginate.offset.next != 0 && $scope.list.length == 0);
            },
            decrement: function() {
                $scope.paginate.offset.next = $scope.paginate.offset.prev;
                $scope.paginate.offset.prev = $scope.paginate.offset.prev - $scope.paginate.pagesize;
            },
            increment: function() {
                $scope.paginate.offset.prev = $scope.paginate.offset.next;
                $scope.paginate.offset.next = $scope.paginate.offset.next + $scope.paginate.pagesize;
            },
        };

        $scope.prev = function() {
            if ($scope.paginate.checkPrev()) {
                return;
            }
            $scope.paginate.decrement();
            $scope.list = Amp.REST.query({offset: $scope.paginate.offset.prev, pagesize: $scope.paginate.pagesize});
        }

        $scope.next = function() {
            if ($scope.paginate.checkNext()) {
                return;
            }
            $scope.list = Amp.REST.query({offset: $scope.paginate.offset.next, pagesize: $scope.paginate.pagesize});
            $scope.paginate.increment();
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