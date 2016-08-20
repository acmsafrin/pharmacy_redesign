angular.module('pharmacy').config(['$stateProvider', function($stateProvider) {
        //Category
        $stateProvider.state('category', {
            url: '/category',
            templateUrl: 'partials/category/index.html',
            controller: 'category'
        }).state('department', {
            url: '/department',
            templateUrl: 'partials/department/index.html',
            controller: 'department'
        }).state('institution', {
            url: '/institution',
            templateUrl: 'partials/institution/index.html',
            controller: 'institution'
        }).state('webuser', {
            url: '/webuser',
            templateUrl: 'partials/webuser/index.html',
            controller: 'webuser'
        })
    }]).run(['$state', '$rootScope', function($state, $rootScope) {
        $rootScope.global = {loaded: true};
        $state.go('category');
    }]);