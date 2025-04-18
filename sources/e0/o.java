package e0;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class o implements Iterable, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30213a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30214b;

    public /* synthetic */ o(Object obj, int i2) {
        this.f30213a = i2;
        this.f30214b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i2 = this.f30213a;
        Object obj = this.f30214b;
        switch (i2) {
            case 0:
                return kotlin.jvm.internal.e.t((Object[]) obj);
            case 1:
                int[] iArr = (int[]) obj;
                p0.a.s(iArr, "array");
                return new kotlin.jvm.internal.d(iArr);
            case 2:
                long[] jArr = (long[]) obj;
                p0.a.s(jArr, "array");
                return new kotlin.jvm.internal.f(jArr);
            case 3:
                float[] fArr = (float[]) obj;
                p0.a.s(fArr, "array");
                return new kotlin.jvm.internal.c(fArr);
            case 4:
                double[] dArr = (double[]) obj;
                p0.a.s(dArr, "array");
                return new kotlin.jvm.internal.b(dArr);
            case 5:
                return new a0((Iterator) ((q0.a) obj).invoke());
            default:
                return ((y0.j) obj).iterator();
        }
    }

    public o(g.b bVar) {
        this.f30213a = 5;
        this.f30214b = bVar;
    }
}
