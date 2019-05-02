package x.app.common

/**
 *   @Project: utils-safe-command-handler
 *   @Package: x.app.common
 *   @Author:  Iamee
 *   @Date:    2019-05-02 22:43
 */
class UnCatchException : AbstractException {

    override val code: Int = 500

    constructor()

    constructor(cause: Throwable) : super(cause)

}