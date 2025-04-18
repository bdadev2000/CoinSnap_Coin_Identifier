package n1;

/* loaded from: classes4.dex */
public final class x extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final x f31149c = new z0(y.f31159a);

    @Override // n1.a
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        p0.a.s(fArr, "<this>");
        return fArr.length;
    }

    @Override // n1.z0
    public final void e(p0.a aVar, Object obj, int i2) {
        float[] fArr = (float[]) obj;
        p0.a.s(aVar, "encoder");
        p0.a.s(fArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            float f2 = fArr[i3];
            y0 y0Var = this.f31162b;
            p0.a.s(y0Var, "descriptor");
            aVar.S(y0Var, i3);
            aVar.U(f2);
        }
    }
}
