package n1;

/* loaded from: classes4.dex */
public final class f extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final f f31070c = new z0(g.f31074a);

    @Override // n1.a
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        p0.a.s(bArr, "<this>");
        return bArr.length;
    }

    @Override // n1.z0
    public final void e(p0.a aVar, Object obj, int i2) {
        byte[] bArr = (byte[]) obj;
        p0.a.s(aVar, "encoder");
        p0.a.s(bArr, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            byte b2 = bArr[i3];
            y0 y0Var = this.f31162b;
            p0.a.s(y0Var, "descriptor");
            aVar.S(y0Var, i3);
            aVar.P(b2);
        }
    }
}
