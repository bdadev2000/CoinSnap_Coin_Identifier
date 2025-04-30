package g8;

/* loaded from: classes3.dex */
public final /* synthetic */ class i extends G7.h implements F7.p {
    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        boolean z8;
        c8.g gVar = (c8.g) obj;
        int intValue = ((Number) obj2).intValue();
        G7.j.e(gVar, "p0");
        j jVar = (j) this.f1322c;
        jVar.getClass();
        if (!gVar.k(intValue) && gVar.j(intValue).c()) {
            z8 = true;
        } else {
            z8 = false;
        }
        jVar.b = z8;
        return Boolean.valueOf(z8);
    }
}
