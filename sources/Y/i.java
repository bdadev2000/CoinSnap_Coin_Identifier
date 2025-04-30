package y;

import f1.C2253b;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public Object f24270a;
    public k b;

    /* renamed from: c, reason: collision with root package name */
    public l f24271c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24272d;

    public final void finalize() {
        l lVar;
        k kVar = this.b;
        if (kVar != null) {
            j jVar = kVar.f24274c;
            if (!jVar.isDone()) {
                jVar.i(new C2253b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f24270a, 2));
            }
        }
        if (!this.f24272d && (lVar = this.f24271c) != null) {
            lVar.h(null);
        }
    }
}
