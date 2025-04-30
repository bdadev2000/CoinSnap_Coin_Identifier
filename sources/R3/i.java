package R3;

/* loaded from: classes2.dex */
public final class i extends y8.a {
    @Override // y8.a
    public final void h(u uVar, float f9, float f10) {
        uVar.d(f10 * f9, 180.0f, 90.0f);
        float f11 = f10 * 2.0f * f9;
        q qVar = new q(0.0f, 0.0f, f11, f11);
        qVar.f2723f = 180.0f;
        qVar.f2724g = 90.0f;
        uVar.f2733g.add(qVar);
        o oVar = new o(qVar);
        uVar.a(180.0f);
        uVar.f2734h.add(oVar);
        uVar.f2731e = 270.0f;
        float f12 = (0.0f + f11) * 0.5f;
        float f13 = (f11 - 0.0f) / 2.0f;
        double d2 = 270.0f;
        uVar.f2729c = (((float) Math.cos(Math.toRadians(d2))) * f13) + f12;
        uVar.f2730d = (f13 * ((float) Math.sin(Math.toRadians(d2)))) + f12;
    }
}
