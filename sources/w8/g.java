package w8;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes3.dex */
public interface g extends x, WritableByteChannel {
    g A(i iVar);

    g B(int i9, int i10, byte[] bArr);

    g emitCompleteSegments();

    @Override // w8.x, java.io.Flushable
    void flush();

    g write(byte[] bArr);

    g writeByte(int i9);

    g writeDecimalLong(long j7);

    g writeHexadecimalUnsignedLong(long j7);

    g writeInt(int i9);

    g writeShort(int i9);

    g writeUtf8(String str);

    f y();

    long z(y yVar);
}
