package it.digifox03.variedmobs.props.string

import it.digifox03.variedmobs.VariedMobs
import it.digifox03.variedmobs.props.EntityBasedProp
import it.digifox03.variedmobs.props.entity.EntityProp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import net.minecraft.util.Identifier

@Serializable
@SerialName("${VariedMobs.modId}:name")
internal class NameStringProp(override val entity: EntityProp? = null) : EntityBasedProp<String>(), StringProp {
    override fun read(context: Map<Identifier, Any>): String {
        val entity = getEntity(context)
        return entity.name.asString()
    }
}

