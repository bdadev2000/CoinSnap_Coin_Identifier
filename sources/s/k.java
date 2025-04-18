package s;

/* loaded from: classes.dex */
public final class k extends i {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f24149j;

    public k(l lVar) {
        this.f24149j = lVar;
    }

    @Override // s.i
    public final String f() {
        j jVar = (j) this.f24149j.f24150b.get();
        if (jVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + jVar.a + "]";
    }
}
