package ki;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public interface k extends k0, ReadableByteChannel {
    long c(l lVar);

    int e(z zVar);

    boolean exhausted();

    long f(l lVar);

    boolean h(l lVar);

    g inputStream();

    long l(i iVar);

    byte readByte();

    byte[] readByteArray();

    l readByteString();

    l readByteString(long j3);

    long readHexadecimalUnsignedLong();

    int readInt();

    int readIntLe();

    long readLongLe();

    short readShort();

    String readString(Charset charset);

    String readUtf8LineStrict();

    String readUtf8LineStrict(long j3);

    boolean request(long j3);

    void require(long j3);

    void skip(long j3);

    i y();
}
