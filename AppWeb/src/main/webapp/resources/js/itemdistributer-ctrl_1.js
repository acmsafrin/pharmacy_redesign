angular.module('pharmacy.controllers').controller('itemdistributer', ['$scope', 'ReloadList', 'Paginate', 'Itemdistributer', function($scope, ReloadList, Paginate, Itemdistributer) {
       
        $scope.prev = function() {
            if (Paginate.checkPrev()) {
                return;
            }
            Paginate.decrement();
            $scope.list = Itemdistributer.REST.query({offset: Paginate.offset.prev, pagesize: Paginate.pagesize});
        }

        $scope.next = function() {
            if (Paginate.checkNext($scope.list)) {
                return;
            }            
            $scope.list = Itemdistributer.REST.query({offset: Paginate.offset.next, pagesize: Paginate.pagesize});
            Paginate.increment();
        }
       
        $scope.load = function() {
           $scope.countstatus=Itemdistributer.REST.count();
           $scope.next();
        }

        $scope.view = function(id) {
            $scope.current = Itemdistributer.REST.get({id: id});
        }

        $scope.add = function() {
            $scope.current = new Itemdistributer.REST();
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