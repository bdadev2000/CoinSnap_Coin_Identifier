package org.jacoco.core.internal.data;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class CompactDataOutput extends DataOutputStream {
    public CompactDataOutput(OutputStream outputStream) {
        super(outputStream);
    }

    public void writeBooleanArray(boolean[] zArr) throws IOException {
        writeVarInt(zArr.length);
        int i2 = 0;
        int i3 = 0;
        for (boolean z2 : zArr) {
            if (z2) {
                i3 |= 1 << i2;
            }
            i2++;
            if (i2 == 8) {
                writeByte(i3);
                i2 = 0;
                i3 = 0;
            }
        }
        if (i2 > 0) {
            writeByte(i3);
        }
    }

    public void writeVarInt(int i2) throws IOException {
        if ((i2 & (-128)) == 0) {
            writeByte(i2);
        } else {
            writeByte((i2 & 127) | 128);
            writeVarInt(i2 >>> 7);
        }
    }
}
