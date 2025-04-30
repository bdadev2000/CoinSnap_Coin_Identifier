package com.mbridge.msdk.playercommon.exoplayer2.video;

import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class HevcConfig {
    public final List<byte[]> initializationData;
    public final int nalUnitLengthFieldLength;

    private HevcConfig(List<byte[]> list, int i9) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i9;
    }

    public static HevcConfig parse(ParsableByteArray parsableByteArray) throws ParserException {
        List singletonList;
        try {
            parsableByteArray.skipBytes(21);
            int readUnsignedByte = parsableByteArray.readUnsignedByte() & 3;
            int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition();
            int i9 = 0;
            for (int i10 = 0; i10 < readUnsignedByte2; i10++) {
                parsableByteArray.skipBytes(1);
                int readUnsignedShort = parsableByteArray.readUnsignedShort();
                for (int i11 = 0; i11 < readUnsignedShort; i11++) {
                    int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
                    i9 += readUnsignedShort2 + 4;
                    parsableByteArray.skipBytes(readUnsignedShort2);
                }
            }
            parsableByteArray.setPosition(position);
            byte[] bArr = new byte[i9];
            int i12 = 0;
            for (int i13 = 0; i13 < readUnsignedByte2; i13++) {
                parsableByteArray.skipBytes(1);
                int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
                for (int i14 = 0; i14 < readUnsignedShort3; i14++) {
                    int readUnsignedShort4 = parsableByteArray.readUnsignedShort();
                    byte[] bArr2 = NalUnitUtil.NAL_START_CODE;
                    System.arraycopy(bArr2, 0, bArr, i12, bArr2.length);
                    int length = i12 + bArr2.length;
                    System.arraycopy(parsableByteArray.data, parsableByteArray.getPosition(), bArr, length, readUnsignedShort4);
                    i12 = length + readUnsignedShort4;
                    parsableByteArray.skipBytes(readUnsignedShort4);
                }
            }
            if (i9 == 0) {
                singletonList = null;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new HevcConfig(singletonList, readUnsignedByte + 1);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw new ParserException("Error parsing HEVC config", e4);
        }
    }
}
