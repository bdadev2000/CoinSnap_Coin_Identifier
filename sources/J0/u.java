package j0;

import U4.y;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f21003d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f21004a;
    public final y b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f21005c = 0;

    public u(y yVar, int i9) {
        this.b = yVar;
        this.f21004a = i9;
    }

    public final int a(int i9) {
        k0.a c9 = c();
        int a6 = c9.a(16);
        if (a6 != 0) {
            ByteBuffer byteBuffer = c9.b;
            int i10 = a6 + c9.f21396a;
            return byteBuffer.getInt((i9 * 4) + byteBuffer.getInt(i10) + i10 + 4);
        }
        return 0;
    }

    public final int b() {
        k0.a c9 = c();
        int a6 = c9.a(16);
        if (a6 != 0) {
            int i9 = a6 + c9.f21396a;
            return c9.b.getInt(c9.b.getInt(i9) + i9);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, k0.c] */
    public final k0.a c() {
        ThreadLocal threadLocal = f21003d;
        k0.a aVar = (k0.a) threadLocal.get();
        k0.a aVar2 = aVar;
        if (aVar == null) {
            ?? cVar = new k0.c();
            threadLocal.set(cVar);
            aVar2 = cVar;
        }
        k0.b bVar = (k0.b) this.b.f3334a;
        int a6 = bVar.a(6);
        if (a6 != 0) {
            int i9 = a6 + bVar.f21396a;
            int i10 = (this.f21004a * 4) + bVar.b.getInt(i9) + i9 + 4;
            int i11 = bVar.b.getInt(i10) + i10;
            ByteBuffer byteBuffer = bVar.b;
            aVar2.b = byteBuffer;
            if (byteBuffer != null) {
                aVar2.f21396a = i11;
                int i12 = i11 - byteBuffer.getInt(i11);
                aVar2.f21397c = i12;
                aVar2.f21398d = aVar2.b.getShort(i12);
            } else {
                aVar2.f21396a = 0;
                aVar2.f21397c = 0;
                aVar2.f21398d = 0;
            }
        }
        return aVar2;
    }

    public final String toString() {
        int i9;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        k0.a c9 = c();
        int a6 = c9.a(4);
        if (a6 != 0) {
            i9 = c9.b.getInt(a6 + c9.f21396a);
        } else {
            i9 = 0;
        }
        sb.append(Integer.toHexString(i9));
        sb.append(", codepoints:");
        int b = b();
        for (int i10 = 0; i10 < b; i10++) {
            sb.append(Integer.toHexString(a(i10)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
