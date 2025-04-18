package ki;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes5.dex */
public interface j extends i0, WritableByteChannel {
    j E(l lVar);

    long L(k0 k0Var);

    j P(int i10, int i11, String str);

    j S(int i10, int i11, byte[] bArr);

    j emitCompleteSegments();

    @Override // ki.i0, java.io.Flushable
    void flush();

    j write(byte[] bArr);

    j writeByte(int i10);

    j writeDecimalLong(long j3);

    j writeHexadecimalUnsignedLong(long j3);

    j writeInt(int i10);

    j writeShort(int i10);

    j writeUtf8(String str);

    i y();
}
