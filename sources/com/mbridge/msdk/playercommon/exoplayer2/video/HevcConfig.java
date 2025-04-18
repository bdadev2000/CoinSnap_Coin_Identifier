package com.mbridge.msdk.playercommon.exoplayer2.video;

import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class HevcConfig {
    public final List<byte[]> initializationData;
    public final int nalUnitLengthFieldLength;

    private HevcConfig(List<byte[]> list, int i10) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i10;
    }

    public static HevcConfig parse(ParsableByteArray parsableByteArray) throws ParserException {
        List singletonList;
        try {
            parsableByteArray.skipBytes(21);
            int readUnsignedByte = parsableByteArray.readUnsignedByte() & 3;
            int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition();
            int i10 = 0;
            for (int i11 = 0; i11 < readUnsignedByte2; i11++) {
                parsableByteArray.skipBytes(1);
                int readUnsignedShort = parsableByteArray.readUnsignedShort();
                for (int i12 = 0; i12 < readUnsignedShort; i12++) {
                    int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
                    i10 += readUnsignedShort2 + 4;
                    parsableByteArray.skipBytes(readUnsignedShort2);
                }
            }
            parsableByteArray.setPosition(position);
            byte[] bArr = new byte[i10];
            int i13 = 0;
            for (int i14 = 0; i14 < readUnsignedByte2; i14++) {
                parsableByteArray.skipBytes(1);
                int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
                for (int i15 = 0; i15 < readUnsignedShort3; i15++) {
                    int readUnsignedShort4 = parsableByteArray.readUnsignedShort();
                    byte[] bArr2 = NalUnitUtil.NAL_START_CODE;
                    System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                    int length = i13 + bArr2.length;
                    System.arraycopy(parsableByteArray.data, parsableByteArray.getPosition(), bArr, length, readUnsignedShort4);
                    i13 = length + readUnsignedShort4;
                    parsableByteArray.skipBytes(readUnsignedShort4);
                }
            }
            if (i10 == 0) {
                singletonList = null;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new HevcConfig(singletonList, readUnsignedByte + 1);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ParserException("Error parsing HEVC config", e2);
        }
    }
}
