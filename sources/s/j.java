package s;

/* loaded from: classes.dex */
public final class j {
    public Object a;

    /* renamed from: b, reason: collision with root package name */
    public l f24146b;

    /* renamed from: c, reason: collision with root package name */
    public m f24147c = new m();

    /* renamed from: d, reason: collision with root package name */
    public boolean f24148d;

    public final void finalize() {
        m mVar;
        l lVar = this.f24146b;
        if (lVar != null && !lVar.isDone()) {
            lVar.f24151c.i(new c("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 1));
        }
        if (!this.f24148d && (mVar = this.f24147c) != null) {
            mVar.h(null);
        }
    }
}
