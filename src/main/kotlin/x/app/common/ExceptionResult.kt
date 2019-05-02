package x.app.common

/**
 *   @Project: service-account
 *   @Package: x.app.common
 *   @Author:  Iamee
 *   @Date:    2019-04-29 23:47
 */
class ExceptionResult : AbstractResult {

    override val success: Boolean = false

    constructor()

    constructor(cause: Throwable) {
        if (cause is AbstractException) {
            this.exception = cause
        } else {
            this.exception = UnCatchException(cause)
        }
    }

}