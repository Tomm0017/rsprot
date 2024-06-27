package net.rsprot.protocol.game.outgoing.misc.client

import net.rsprot.protocol.ServerProtCategory
import net.rsprot.protocol.game.outgoing.GameServerProtCategory
import net.rsprot.protocol.message.OutgoingGameMessage

/**
 * Hide player ops packet is used to hide the right-click menu of all players across the game.
 * @property hidden whether to hide all the click options of players.
 */
public class HidePlayerOps(
    public val hidden: Boolean,
) : OutgoingGameMessage {
    override val category: ServerProtCategory
        get() = GameServerProtCategory.HIGH_PRIORITY_PROT

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as HidePlayerOps

        return hidden == other.hidden
    }

    override fun hashCode(): Int = hidden.hashCode()

    override fun toString(): String = "HidePlayerOps(hidden=$hidden)"
}
