package n1;

/* loaded from: classes3.dex */
public final class e1 extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final e1 f31069c = new z0(f1.f31072a);

    @Override // n1.a
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        p0.a.s(sArr, "<this>");
        return sArr.length;
    }

    @Override // n1.z0
    public final void e(p0.a aVar, Object obj, int i2) {
        short[] sArr = (short[]) obj;
        p0.a.s(aVar, "encoder");
        p0.a.s(sArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            short s2 = sArr[i3];
            y0 y0Var = this.f31162b;
            p0.a.s(y0Var, "descriptor");
            aVar.S(y0Var, i3);
            aVar.a0(s2);
        }
    }
}
