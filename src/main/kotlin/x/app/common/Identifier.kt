package x.app.common

import com.fasterxml.jackson.annotation.JsonIgnore
import org.axonframework.commandhandling.TargetAggregateIdentifier

/**
 *   @Project: base
 *   @Package: x.app.common
 *   @Author:  Iamee
 *   @Date:    2019-04-27 23:09
 */
interface Identifier {

    @JsonIgnore
    @TargetAggregateIdentifier
    fun getIdentifier(): String

}