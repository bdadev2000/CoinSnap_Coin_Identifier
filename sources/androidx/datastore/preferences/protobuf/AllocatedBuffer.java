package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
abstract class AllocatedBuffer {

    /* renamed from: androidx.datastore.preferences.protobuf.AllocatedBuffer$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass2 extends AllocatedBuffer {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.preferences.protobuf.AllocatedBuffer$1] */
    public static AnonymousClass1 a(ByteBuffer byteBuffer) {
        Charset charset = Internal.f19251a;
        if (byteBuffer != null) {
            return new AllocatedBuffer(byteBuffer) { // from class: androidx.datastore.preferences.protobuf.AllocatedBuffer.1
            };
        }
        throw new NullPointerException("buffer");
    }

    public static void b(int i2, byte[] bArr, int i3) {
        if (i2 < 0 || i3 < 0 || i2 + i3 > bArr.length) {
            throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }
}
