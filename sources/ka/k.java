package ka;

/* loaded from: classes3.dex */
public final class k extends p6.a {
    @Override // p6.a
    public final void i(w wVar, float f10, float f11, float f12) {
        float q10 = c6.k.q(f11, f12, f10);
        wVar.d(q10, 180.0f, 90.0f);
        float f13 = q10 * 2.0f;
        s sVar = new s(0.0f, 0.0f, f13, f13);
        sVar.f20617f = 180.0f;
        sVar.f20618g = 90.0f;
        wVar.f20627g.add(sVar);
        q qVar = new q(sVar);
        wVar.a(180.0f);
        wVar.f20628h.add(qVar);
        wVar.f20625e = 270.0f;
        float f14 = (f13 + 0.0f) * 0.5f;
        float f15 = (f13 - 0.0f) / 2.0f;
        double d10 = 270.0f;
        wVar.f20623c = (((float) Math.cos(Math.toRadians(d10))) * f15) + f14;
        wVar.f20624d = (f15 * ((float) Math.sin(Math.toRadians(d10)))) + f14;
    }
}
