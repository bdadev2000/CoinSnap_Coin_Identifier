package n1;

/* loaded from: classes3.dex */
public final class i0 extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final i0 f31086c = new z0(j0.f31089a);

    @Override // n1.a
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        p0.a.s(jArr, "<this>");
        return jArr.length;
    }

    @Override // n1.z0
    public final void e(p0.a aVar, Object obj, int i2) {
        long[] jArr = (long[]) obj;
        p0.a.s(aVar, "encoder");
        p0.a.s(jArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = jArr[i3];
            y0 y0Var = this.f31162b;
            p0.a.s(y0Var, "descriptor");
            aVar.S(y0Var, i3);
            aVar.W(j2);
        }
    }
}
