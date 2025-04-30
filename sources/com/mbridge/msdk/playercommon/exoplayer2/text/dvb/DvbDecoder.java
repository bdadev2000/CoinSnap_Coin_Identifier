package com.mbridge.msdk.playercommon.exoplayer2.text.dvb;

import com.mbridge.msdk.playercommon.exoplayer2.text.SimpleSubtitleDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.util.List;

/* loaded from: classes3.dex */
public final class DvbDecoder extends SimpleSubtitleDecoder {
    private final DvbParser parser;

    public DvbDecoder(List<byte[]> list) {
        super("DvbDecoder");
        ParsableByteArray parsableByteArray = new ParsableByteArray(list.get(0));
        this.parser = new DvbParser(parsableByteArray.readUnsignedShort(), parsableByteArray.readUnsignedShort());
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.SimpleSubtitleDecoder
    public final DvbSubtitle decode(byte[] bArr, int i9, boolean z8) {
        if (z8) {
            this.parser.reset();
        }
        return new DvbSubtitle(this.parser.decode(bArr, i9));
    }
}
