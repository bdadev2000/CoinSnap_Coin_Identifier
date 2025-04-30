package p8;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class l extends l8.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f22423e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f22424f = false;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ D f22425g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, m mVar, D d2) {
        super(str, true);
        this.f22423e = mVar;
        this.f22425g = d2;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [G7.r, java.lang.Object] */
    @Override // l8.a
    public final long a() {
        long a6;
        int i9;
        z[] zVarArr;
        m mVar = this.f22423e;
        boolean z8 = this.f22424f;
        D d2 = this.f22425g;
        mVar.getClass();
        G7.j.e(d2, "settings");
        ?? obj = new Object();
        s sVar = mVar.f22426c;
        synchronized (sVar.f22445A) {
            synchronized (sVar) {
                try {
                    D d9 = sVar.f22463u;
                    if (!z8) {
                        D d10 = new D();
                        d10.b(d9);
                        d10.b(d2);
                        d2 = d10;
                    }
                    obj.b = d2;
                    a6 = d2.a() - d9.a();
                    i9 = 0;
                    if (a6 != 0 && !sVar.f22449d.isEmpty()) {
                        Object[] array = sVar.f22449d.values().toArray(new z[0]);
                        if (array != null) {
                            zVarArr = (z[]) array;
                            D d11 = (D) obj.b;
                            G7.j.e(d11, "<set-?>");
                            sVar.f22463u = d11;
                            sVar.m.c(new j(G7.j.j(" onSettings", sVar.f22450f), sVar, obj, 0), 0L);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                    }
                    zVarArr = null;
                    D d112 = (D) obj.b;
                    G7.j.e(d112, "<set-?>");
                    sVar.f22463u = d112;
                    sVar.m.c(new j(G7.j.j(" onSettings", sVar.f22450f), sVar, obj, 0), 0L);
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                sVar.f22445A.a((D) obj.b);
            } catch (IOException e4) {
                sVar.b(e4);
            }
        }
        if (zVarArr != null) {
            int length = zVarArr.length;
            while (i9 < length) {
                z zVar = zVarArr[i9];
                i9++;
                synchronized (zVar) {
                    zVar.f22497f += a6;
                    if (a6 > 0) {
                        zVar.notifyAll();
                    }
                }
            }
            return -1L;
        }
        return -1L;
    }
}
