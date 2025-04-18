package h;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import e1.t0;
import java.util.HashMap;
import okio.BufferedSource;
import okio.Okio;

/* loaded from: classes2.dex */
public final class a0 extends kotlin.jvm.internal.r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30645c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i2, Object obj, Object obj2) {
        super(0);
        this.f30643a = i2;
        this.f30644b = obj;
        this.f30645c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [l1.f] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l1.f] */
    /* JADX WARN: Type inference failed for: r0v4, types: [n1.x0, n1.v] */
    public final l1.f b() {
        int i2 = this.f30643a;
        Object obj = this.f30645c;
        int i3 = 0;
        Object obj2 = this.f30644b;
        switch (i2) {
            case 2:
                n1.w wVar = (n1.w) obj2;
                ?? r02 = (l1.f) wVar.d;
                if (r02 == 0) {
                    Enum[] enumArr = (Enum[]) wVar.f31146c;
                    r02 = new n1.v((String) obj, enumArr.length);
                    for (Enum r03 : enumArr) {
                        String name = r03.name();
                        p0.a.s(name, "name");
                        int i4 = r02.d + 1;
                        r02.d = i4;
                        String[] strArr = r02.e;
                        strArr[i4] = name;
                        r02.f31154g[i4] = false;
                        r02.f31153f[i4] = null;
                        if (i4 == r02.f31152c - 1) {
                            HashMap hashMap = new HashMap();
                            int length = strArr.length;
                            for (int i5 = 0; i5 < length; i5++) {
                                hashMap.put(strArr[i5], Integer.valueOf(i5));
                            }
                            r02.f31155h = hashMap;
                        }
                    }
                }
                return r02;
            default:
                return t0.h((String) obj2, l1.c.e, new l1.f[0], new n1.t0((n1.w) obj, i3));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    @Override // q0.a
    public final Object invoke() {
        Drawable decodeDrawable;
        int i2 = this.f30643a;
        Object obj = this.f30645c;
        Object obj2 = this.f30644b;
        switch (i2) {
            case 0:
                ?? obj3 = new Object();
                c0 c0Var = (c0) obj2;
                d0 d0Var = c0Var.f30652a;
                if (c0Var.f30654c) {
                    BufferedSource h2 = d0Var.h();
                    if (h2.rangeEquals(0L, r.f30695b) || h2.rangeEquals(0L, r.f30694a)) {
                        d0Var = new g0(Okio.buffer(new q(d0Var.h())), new e0(c0Var.f30653b.f31314a, 0), null);
                    }
                }
                try {
                    decodeDrawable = ImageDecoder.decodeDrawable(c0.b((c0) obj2, d0Var), new z(obj3, (c0) obj2, (kotlin.jvm.internal.b0) obj));
                    return decodeDrawable;
                } finally {
                    ImageDecoder f2 = v.f(obj3.f30930a);
                    if (f2 != null) {
                        f2.close();
                    }
                    d0Var.close();
                }
            case 1:
                return new n1.h((k1.a) ((n1.m) obj2).f31104b.invoke((x0.c) obj));
            case 2:
                return b();
            default:
                return b();
        }
    }
}
