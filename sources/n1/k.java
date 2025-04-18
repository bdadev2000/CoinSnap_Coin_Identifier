package n1;

/* loaded from: classes4.dex */
public final class k extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final k f31093c = new z0(l.f31098a);

    @Override // n1.a
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        p0.a.s(cArr, "<this>");
        return cArr.length;
    }

    @Override // n1.z0
    public final void e(p0.a aVar, Object obj, int i2) {
        char[] cArr = (char[]) obj;
        p0.a.s(aVar, "encoder");
        p0.a.s(cArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i3];
            y0 y0Var = this.f31162b;
            p0.a.s(y0Var, "descriptor");
            aVar.S(y0Var, i3);
            aVar.Q(c2);
        }
    }
}
