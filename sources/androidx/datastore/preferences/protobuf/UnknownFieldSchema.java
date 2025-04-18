package androidx.datastore.preferences.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class UnknownFieldSchema<T, B> {
    public abstract void a(int i2, int i3, Object obj);

    public abstract void b(int i2, long j2, Object obj);

    public abstract void c(int i2, Object obj, Object obj2);

    public abstract void d(Object obj, int i2, ByteString byteString);

    public abstract void e(int i2, long j2, Object obj);

    public abstract UnknownFieldSetLite f(Object obj);

    public abstract UnknownFieldSetLite g(Object obj);

    public abstract int h(Object obj);

    public abstract int i(Object obj);

    public abstract void j(Object obj);

    public abstract UnknownFieldSetLite k(Object obj, Object obj2);

    public final boolean l(Object obj, Reader reader) {
        int l2 = reader.l();
        int i2 = l2 >>> 3;
        int i3 = l2 & 7;
        if (i3 == 0) {
            e(i2, reader.M(), obj);
            return true;
        }
        if (i3 == 1) {
            b(i2, reader.b(), obj);
            return true;
        }
        if (i3 == 2) {
            d(obj, i2, reader.p());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            a(i2, reader.x(), obj);
            return true;
        }
        UnknownFieldSetLite m2 = m();
        int i4 = (i2 << 3) | 4;
        while (reader.E() != Integer.MAX_VALUE && l(m2, reader)) {
        }
        if (i4 != reader.l()) {
            throw InvalidProtocolBufferException.a();
        }
        c(i2, obj, q(m2));
        return true;
    }

    public abstract UnknownFieldSetLite m();

    public abstract void n(Object obj, Object obj2);

    public abstract void o(Object obj, Object obj2);

    public abstract void p();

    public abstract UnknownFieldSetLite q(Object obj);

    public abstract void r(Object obj, Writer writer);

    public abstract void s(Object obj, Writer writer);
}
