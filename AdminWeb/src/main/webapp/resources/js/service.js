angular.module('pharmacyApp.services', [])
        .service('Session',[function (){
                return {
                    loggedUser:{id:1},
                    getLoggedUser:function(){
                        return this.loggedUser;
                    },
                }
        }]);

