angular.module('pharmacy.services')
        .service('ResponseStatus', [function() {
                return {
                    success: {code: '001'},
                    error: {code: '002'},
                }
            }])
        .service('ReloadList', ['ResponseStatus','$state',function(ResponseStatus,$state) {
                return{
                    reload: function(res) {
                        console.log('Res Ponse '+JSON.stringify(res));
                        if (ResponseStatus.success.code == res.code) {
                            $state.reload();
                        } else {
                           console.log('not reloaded');
                        }
                    }
                }
            }]);

