angular.module('pharmacyApp', ['ui.router', 'ngResource',
    'ngMaterial', 'ngMessages',
    'category.controller', 'department.controller',
    'institution.controller', 'webuser.controller',
    'pharmacyApp.services', 'pharmacyApp.factories']);

angular.module('pharmacyApp').config(['$stateProvider', '$mdIconProvider', function($stateProvider, $mdIconProvider) {
        $mdIconProvider
                .defaultIconSet('img/icons/sets/core-icons.svg', 24);

        //Category
        $stateProvider.state('category', {
            url: '/category',
            templateUrl: 'partials/category/index.html',
            controller: 'category'
        })
                .state('department', {
                    url: '/department',
                    templateUrl: 'partials/department/index.html',
                    controller: 'department'
                })
                .state('institution', {
                    url: '/institution',
                    templateUrl: 'partials/institution/index.html',
                    controller: 'institution'
                })
                .state('webuser', {
                    url: '/webuser',
                    templateUrl: 'partials/webuser/index.html',
                    controller: 'webuser'
                })
    }]).run(['$state', '$rootScope', function($state, $rootScope) {    
        $rootScope.global={loaded:true};
        $state.go('category'); //make a transition to movies state when app starts  
    }]);