angular.module('pharmacy.services')
        .service('ResponseStatus', [function() {
                return {
                    success: {code: '001'},
                    error: {code: '002'},
                }
            }])
        .service('ReloadList', ['ResponseStatus', '$state', function(ResponseStatus, $state) {
                return{
                    reload: function(res) {
                        if (ResponseStatus.success.code == res.code) {
                            $state.reload();
                        } else {
                            console.log('not reloaded');
                        }
                    }
                }
            }])
        .service('Paginate', [function() {
                return{
                    pagesize: 500,
                    offset: {
                        next: 0,
                        prev: 0,
                    },
                    checkPrev: function() {
                        return this.offset.prev == 0;
                    },
                    checkNext: function(list) {
                        return (this.offset.next != 0 && list!=null && list.length == 0);
                    },
                    decrement: function() {
                       this.offset.next = this.offset.prev;
                       this.offset.prev = this.offset.prev - this.pagesize;
                    },
                    increment: function() {
                        this.offset.prev = this.offset.next;
                        this.offset.next = this.offset.next + this.pagesize;
                    },
                }
            }]);

