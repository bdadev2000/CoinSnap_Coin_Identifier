package com.mbridge.msdk.playercommon.exoplayer2.video;

import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.util.CodecSpecificDataUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class AvcConfig {
    public final int height;
    public final List<byte[]> initializationData;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthAspectRatio;
    public final int width;

    private AvcConfig(List<byte[]> list, int i9, int i10, int i11, float f9) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i9;
        this.width = i10;
        this.height = i11;
        this.pixelWidthAspectRatio = f9;
    }

    private static byte[] buildNalUnitForChild(ParsableByteArray parsableByteArray) {
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(readUnsignedShort);
        return CodecSpecificDataUtil.buildNalUnit(parsableByteArray.data, position, readUnsignedShort);
    }

    public static AvcConfig parse(ParsableByteArray parsableByteArray) throws ParserException {
        int i9;
        int i10;
        float f9;
        try {
            parsableByteArray.skipBytes(4);
            int readUnsignedByte = (parsableByteArray.readUnsignedByte() & 3) + 1;
            if (readUnsignedByte != 3) {
                ArrayList arrayList = new ArrayList();
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte() & 31;
                for (int i11 = 0; i11 < readUnsignedByte2; i11++) {
                    arrayList.add(buildNalUnitForChild(parsableByteArray));
                }
                int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                for (int i12 = 0; i12 < readUnsignedByte3; i12++) {
                    arrayList.add(buildNalUnitForChild(parsableByteArray));
                }
                if (readUnsignedByte2 > 0) {
                    NalUnitUtil.SpsData parseSpsNalUnit = NalUnitUtil.parseSpsNalUnit((byte[]) arrayList.get(0), readUnsignedByte, ((byte[]) arrayList.get(0)).length);
                    int i13 = parseSpsNalUnit.width;
                    int i14 = parseSpsNalUnit.height;
                    f9 = parseSpsNalUnit.pixelWidthAspectRatio;
                    i9 = i13;
                    i10 = i14;
                } else {
                    i9 = -1;
                    i10 = -1;
                    f9 = 1.0f;
                }
                return new AvcConfig(arrayList, readUnsignedByte, i9, i10, f9);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw new ParserException("Error parsing AVC config", e4);
        }
    }
}
