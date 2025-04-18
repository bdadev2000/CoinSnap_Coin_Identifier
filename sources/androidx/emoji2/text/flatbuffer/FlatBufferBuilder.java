package androidx.emoji2.text.flatbuffer;

import java.io.InputStream;

/* loaded from: classes.dex */
public class FlatBufferBuilder {

    /* loaded from: classes.dex */
    public static class ByteBufferBackedInputStream extends InputStream {
        @Override // java.io.InputStream
        public final int read() {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class ByteBufferFactory {
    }

    /* loaded from: classes.dex */
    public static final class HeapByteBufferFactory extends ByteBufferFactory {
    }
}
