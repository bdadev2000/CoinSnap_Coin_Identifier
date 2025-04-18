package he;

/* loaded from: classes4.dex */
public final class t implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19080b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f19081c;

    public /* synthetic */ t(v vVar, int i10) {
        this.f19080b = i10;
        this.f19081c = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f19080b;
        v vVar = this.f19081c;
        switch (i10) {
            case 0:
                vVar.o();
                return;
            default:
                ze.b J = vVar.J();
                if (J.equals(vVar.f19090j)) {
                    a0.f19026e.a(1, "onSurfaceChanged:", "The computed preview size is identical. No op.");
                    return;
                }
                a0.f19026e.a(1, "onSurfaceChanged:", "Computed a new preview size. Calling onPreviewStreamSizeChanged().");
                vVar.f19090j = J;
                vVar.R();
                return;
        }
    }
}
