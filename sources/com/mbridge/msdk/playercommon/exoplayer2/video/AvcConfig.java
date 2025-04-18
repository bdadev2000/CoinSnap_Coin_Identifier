package com.mbridge.msdk.playercommon.exoplayer2.video;

import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.util.CodecSpecificDataUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class AvcConfig {
    public final int height;
    public final List<byte[]> initializationData;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthAspectRatio;
    public final int width;

    private AvcConfig(List<byte[]> list, int i10, int i11, int i12, float f10) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i10;
        this.width = i11;
        this.height = i12;
        this.pixelWidthAspectRatio = f10;
    }

    private static byte[] buildNalUnitForChild(ParsableByteArray parsableByteArray) {
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(readUnsignedShort);
        return CodecSpecificDataUtil.buildNalUnit(parsableByteArray.data, position, readUnsignedShort);
    }

    public static AvcConfig parse(ParsableByteArray parsableByteArray) throws ParserException {
        int i10;
        int i11;
        float f10;
        try {
            parsableByteArray.skipBytes(4);
            int readUnsignedByte = (parsableByteArray.readUnsignedByte() & 3) + 1;
            if (readUnsignedByte != 3) {
                ArrayList arrayList = new ArrayList();
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte() & 31;
                for (int i12 = 0; i12 < readUnsignedByte2; i12++) {
                    arrayList.add(buildNalUnitForChild(parsableByteArray));
                }
                int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                for (int i13 = 0; i13 < readUnsignedByte3; i13++) {
                    arrayList.add(buildNalUnitForChild(parsableByteArray));
                }
                if (readUnsignedByte2 > 0) {
                    NalUnitUtil.SpsData parseSpsNalUnit = NalUnitUtil.parseSpsNalUnit((byte[]) arrayList.get(0), readUnsignedByte, ((byte[]) arrayList.get(0)).length);
                    int i14 = parseSpsNalUnit.width;
                    int i15 = parseSpsNalUnit.height;
                    f10 = parseSpsNalUnit.pixelWidthAspectRatio;
                    i10 = i14;
                    i11 = i15;
                } else {
                    i10 = -1;
                    i11 = -1;
                    f10 = 1.0f;
                }
                return new AvcConfig(arrayList, readUnsignedByte, i10, i11, f10);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ParserException("Error parsing AVC config", e2);
        }
    }
}
