package n1;

/* loaded from: classes3.dex */
public final class d0 extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f31061c = new z0(e0.f31067a);

    @Override // n1.a
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        p0.a.s(iArr, "<this>");
        return iArr.length;
    }

    @Override // n1.z0
    public final void e(p0.a aVar, Object obj, int i2) {
        int[] iArr = (int[]) obj;
        p0.a.s(aVar, "encoder");
        p0.a.s(iArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = iArr[i3];
            y0 y0Var = this.f31162b;
            p0.a.s(y0Var, "descriptor");
            aVar.S(y0Var, i3);
            aVar.V(i4);
        }
    }
}
