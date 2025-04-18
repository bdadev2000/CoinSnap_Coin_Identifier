package com.mbridge.msdk.playercommon.exoplayer2.text.webvtt;

import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;
import com.mbridge.msdk.playercommon.exoplayer2.text.SimpleSubtitleDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoderException;
import com.mbridge.msdk.playercommon.exoplayer2.text.webvtt.WebvttCue;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes4.dex */
public final class Mp4WebvttDecoder extends SimpleSubtitleDecoder {
    private static final int BOX_HEADER_SIZE = 8;
    private static final int TYPE_payl = Util.getIntegerCodeForString("payl");
    private static final int TYPE_sttg = Util.getIntegerCodeForString("sttg");
    private static final int TYPE_vttc = Util.getIntegerCodeForString("vttc");
    private final WebvttCue.Builder builder;
    private final ParsableByteArray sampleData;

    public Mp4WebvttDecoder() {
        super("Mp4WebvttDecoder");
        this.sampleData = new ParsableByteArray();
        this.builder = new WebvttCue.Builder();
    }

    private static Cue parseVttCueBox(ParsableByteArray parsableByteArray, WebvttCue.Builder builder, int i10) throws SubtitleDecoderException {
        builder.reset();
        while (i10 > 0) {
            if (i10 >= 8) {
                int readInt = parsableByteArray.readInt();
                int readInt2 = parsableByteArray.readInt();
                int i11 = readInt - 8;
                String fromUtf8Bytes = Util.fromUtf8Bytes(parsableByteArray.data, parsableByteArray.getPosition(), i11);
                parsableByteArray.skipBytes(i11);
                i10 = (i10 - 8) - i11;
                if (readInt2 == TYPE_sttg) {
                    WebvttCueParser.parseCueSettingsList(fromUtf8Bytes, builder);
                } else if (readInt2 == TYPE_payl) {
                    WebvttCueParser.parseCueText(null, fromUtf8Bytes.trim(), builder, Collections.emptyList());
                }
            } else {
                throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
            }
        }
        return builder.build();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.SimpleSubtitleDecoder
    public final Mp4WebvttSubtitle decode(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        this.sampleData.reset(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (this.sampleData.bytesLeft() > 0) {
            if (this.sampleData.bytesLeft() >= 8) {
                int readInt = this.sampleData.readInt();
                if (this.sampleData.readInt() == TYPE_vttc) {
                    arrayList.add(parseVttCueBox(this.sampleData, this.builder, readInt - 8));
                } else {
                    this.sampleData.skipBytes(readInt - 8);
                }
            } else {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new Mp4WebvttSubtitle(arrayList);
    }
}
