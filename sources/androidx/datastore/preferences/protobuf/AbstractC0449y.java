package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0449y {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f4610a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        if ((0 - 0) + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw A.f();
        } catch (A e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }

    public static AbstractC0446v c(Object obj, Object obj2) {
        AbstractC0446v abstractC0446v = (AbstractC0446v) ((AbstractC0425a) obj);
        AbstractC0444t abstractC0444t = (AbstractC0444t) abstractC0446v.d(5);
        abstractC0444t.c();
        AbstractC0444t.d(abstractC0444t.f4607c, abstractC0446v);
        AbstractC0425a abstractC0425a = (AbstractC0425a) obj2;
        if (abstractC0444t.b.getClass().isInstance(abstractC0425a)) {
            abstractC0444t.c();
            AbstractC0444t.d(abstractC0444t.f4607c, (AbstractC0446v) abstractC0425a);
            return abstractC0444t.b();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
