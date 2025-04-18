package n1;

/* loaded from: classes4.dex */
public final class d extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final d f31060c = new z0(e.f31065a);

    @Override // n1.a
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        p0.a.s(zArr, "<this>");
        return zArr.length;
    }

    @Override // n1.z0
    public final void e(p0.a aVar, Object obj, int i2) {
        boolean[] zArr = (boolean[]) obj;
        p0.a.s(aVar, "encoder");
        p0.a.s(zArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            boolean z2 = zArr[i3];
            y0 y0Var = this.f31162b;
            p0.a.s(y0Var, "descriptor");
            aVar.S(y0Var, i3);
            aVar.O(z2);
        }
    }
}
