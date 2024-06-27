package net.rsprot.protocol.game.outgoing.codec.interfaces

import io.netty.channel.ChannelHandlerContext
import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ServerProt
import net.rsprot.protocol.game.outgoing.interfaces.IfSetPlayerModelBodyType
import net.rsprot.protocol.game.outgoing.prot.GameServerProt
import net.rsprot.protocol.message.codec.MessageEncoder
import net.rsprot.protocol.util.pCombinedIdAlt3

public class IfSetPlayerModelBodyTypeEncoder : MessageEncoder<IfSetPlayerModelBodyType> {
    override val prot: ServerProt = GameServerProt.IF_SETPLAYERMODEL_BODYTYPE

    override fun encode(
        ctx: ChannelHandlerContext,
        buffer: JagByteBuf,
        message: IfSetPlayerModelBodyType,
    ) {
        buffer.pCombinedIdAlt3(message.combinedId)
        buffer.p1Alt3(message.bodyType)
    }
}
