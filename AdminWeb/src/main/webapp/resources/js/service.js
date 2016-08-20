angular.module('pharmacyApp.services', [])
        .service('ResponseStatus', [function() {
                return {
                    success: {code: '001'},
                    error: {code: '002'},
                }
            }])
        .service('ReloadList', ['ResponseStatus','$state',function(ResponseStatus,$state) {
                return{
                    reload: function(res) {
                        if (ResponseStatus.success.code == res.code) {
                            $state.reload();
                        } else {
                            //Error Handle
                        }
                    }
                }
            }]);

