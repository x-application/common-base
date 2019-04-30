package x.app.common

import org.axonframework.commandhandling.gateway.CommandGateway

/**
 *   @Project: base
 *   @Package: x.app.common
 *   @Author:  Iamee
 *   @Date:    2019-04-27 23:10
 */
abstract class AbstractCommand<T : AbstractResult> : Identifiable {

    @Suppress("UNCHECKED_CAST")
    fun covert(obj: Any): T {
        return obj as T
    }

}

infix fun <T : AbstractResult> AbstractCommand<T>.sendTo(commandGateway: CommandGateway): T = this.covert(commandGateway.sendAndWait(this))