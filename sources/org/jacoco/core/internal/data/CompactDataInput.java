package org.jacoco.core.internal.data;

import com.google.common.primitives.UnsignedBytes;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class CompactDataInput extends DataInputStream {
    public CompactDataInput(InputStream inputStream) {
        super(inputStream);
    }

    public boolean[] readBooleanArray() throws IOException {
        int readVarInt = readVarInt();
        boolean[] zArr = new boolean[readVarInt];
        int i2 = 0;
        for (int i3 = 0; i3 < readVarInt; i3++) {
            if (i3 % 8 == 0) {
                i2 = readByte();
            }
            zArr[i3] = (i2 & 1) != 0;
            i2 >>>= 1;
        }
        return zArr;
    }

    public int readVarInt() throws IOException {
        byte readByte = readByte();
        return (readByte & UnsignedBytes.MAX_POWER_OF_TWO) == 0 ? readByte & UnsignedBytes.MAX_VALUE : (readByte & Byte.MAX_VALUE) | (readVarInt() << 7);
    }
}
