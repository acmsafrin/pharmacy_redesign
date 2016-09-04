angular.module('pharmacy.controllers').controller('itemdistributer', ['$scope', 'ReloadList', 'Paginate', 'Itemdistributer','Dealer','Amp', function($scope, ReloadList, Paginate, Itemdistributer,Dealer,Amp) {
        $scope.dealerFilter = Dealer.FILTER;    
        $scope.ampFilter=Amp.FILTER;
        $scope.autocomplete={};       
        $scope.selectedItemChange=function(){
            if($scope.autocomplete!=null && $scope.autocomplete.institution!=null){
                $scope.list = Itemdistributer.REST.bydealer({id:$scope.autocomplete.institution.id});             
            }
        };

        $scope.view = function(id) {
            $scope.current = Itemdistributer.REST.get({id: id});
        }

        $scope.add = function() {
            $scope.current = new Itemdistributer.REST();
            $scope.current.institution=$scope.autocomplete.institution;
        }

        $scope.delete = function() {
            $scope.current.$delete(function(res) {
                ReloadList.reload(res);
            });
        };

        $scope.save = function() {
            if (angular.isUndefined($scope.current.id)) {
                $scope.current.$save(function(res) {
                    //ReloadList.reload(res);
                    $scope.selectedItemChange();
                });
            } else {
                $scope.current.$update(function(res) {
                    //ReloadList.reload(res);
                    $scope.selectedItemChange();
                });
            }
        }

        $scope.add();
     //   $scope.load();
    }]);