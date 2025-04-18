package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f1522d = new ThreadLocal();
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final s2.h f1523b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f1524c = 0;

    public r(int i10, s2.h hVar) {
        this.f1523b = hVar;
        this.a = i10;
    }

    public final int a(int i10) {
        d1.a c10 = c();
        int a = c10.a(16);
        if (a != 0) {
            Object obj = c10.f16791d;
            int i11 = a + c10.a;
            return ((ByteBuffer) obj).getInt((i10 * 4) + ((ByteBuffer) obj).getInt(i11) + i11 + 4);
        }
        return 0;
    }

    public final int b() {
        d1.a c10 = c();
        int a = c10.a(16);
        if (a != 0) {
            int i10 = a + c10.a;
            return ((ByteBuffer) c10.f16791d).getInt(((ByteBuffer) c10.f16791d).getInt(i10) + i10);
        }
        return 0;
    }

    public final d1.a c() {
        ThreadLocal threadLocal = f1522d;
        d1.a aVar = (d1.a) threadLocal.get();
        if (aVar == null) {
            aVar = new d1.a();
            threadLocal.set(aVar);
        }
        d1.b bVar = (d1.b) this.f1523b.f24169b;
        int a = bVar.a(6);
        if (a != 0) {
            int i10 = a + bVar.a;
            int i11 = (this.a * 4) + ((ByteBuffer) bVar.f16791d).getInt(i10) + i10 + 4;
            aVar.b(((ByteBuffer) bVar.f16791d).getInt(i11) + i11, (ByteBuffer) bVar.f16791d);
        }
        return aVar;
    }

    public final String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        d1.a c10 = c();
        int a = c10.a(4);
        if (a != 0) {
            i10 = ((ByteBuffer) c10.f16791d).getInt(a + c10.a);
        } else {
            i10 = 0;
        }
        sb2.append(Integer.toHexString(i10));
        sb2.append(", codepoints:");
        int b3 = b();
        for (int i11 = 0; i11 < b3; i11++) {
            sb2.append(Integer.toHexString(a(i11)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
