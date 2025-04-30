package y;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f24273j;

    public j(k kVar) {
        this.f24273j = kVar;
    }

    @Override // y.h
    public final String f() {
        i iVar = (i) this.f24273j.b.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f24270a + "]";
    }
}
