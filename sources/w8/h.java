package w8;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public interface h extends y, ReadableByteChannel {
    long e(i iVar);

    boolean exhausted();

    long f(f fVar);

    int g(q qVar);

    InputStream inputStream();

    byte readByte();

    byte[] readByteArray();

    i readByteString();

    i readByteString(long j7);

    long readHexadecimalUnsignedLong();

    int readInt();

    short readShort();

    String readString(Charset charset);

    String readUtf8LineStrict();

    String readUtf8LineStrict(long j7);

    boolean request(long j7);

    void require(long j7);

    void skip(long j7);

    f y();
}
