angular.module('pharmacy').config(['$stateProvider', function($stateProvider) {
        //pharmaceuticalitemcategory
        $stateProvider.state('pharmaceuticalitemcategory', {
            url: '/pharmaceuticalitemcategory',
            templateUrl: 'partials/pharmacy/pharmaceuticalitemcategory/index.html',
            controller: 'pharmaceuticalitemcategory'
        })
    }]);