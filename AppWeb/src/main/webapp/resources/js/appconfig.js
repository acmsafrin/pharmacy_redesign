angular.module('pharmacy').config(['$stateProvider','$httpProvider', function($stateProvider) {
        //Category
        $stateProvider.state('category', {
            url: '/category',
            templateUrl: 'partials/category/index.html',
            controller: 'category'
        }).state('itemdistributer', {
            url: '/itemdistributer',
            templateUrl: 'partials/itemdistributer/index.html',
            controller: 'itemdistributer'
        }).state('department', {
            url: '/department',
            templateUrl: 'partials/department/index.html',
            controller: 'department'
        }).state('institution', {
            url: '/institution',
            templateUrl: 'partials/institution/index.html',
            controller: 'institution'
        }).state('dealer', {
            url: '/dealer',
            templateUrl: 'partials/dealer/index.html',
            controller: 'dealer'
        }).state('importer', {
            url: '/importer',
            templateUrl: 'partials/importer/index.html',
            controller: 'importer'
        }).state('manufacturer', {
            url: '/manufacturer',
            templateUrl: 'partials/manufacturer/index.html',
            controller: 'manufacturer'
        }).state('webuser', {
            url: '/webuser',
            templateUrl: 'partials/webuser/index.html',
            controller: 'webuser'
        })
        

    }]).run(['$state', '$rootScope', function($state, $rootScope) {
        $rootScope.global = {loaded: true};
        $state.go('institution');
    }]);