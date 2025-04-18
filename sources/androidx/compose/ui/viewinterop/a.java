package androidx.compose.ui.viewinterop;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f17594b;

    public /* synthetic */ a(q0.a aVar, int i2) {
        this.f17593a = i2;
        this.f17594b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f17593a;
        q0.a aVar = this.f17594b;
        switch (i2) {
            case 0:
                aVar.invoke();
                return;
            default:
                int i3 = AndroidViewHolder.x;
                aVar.invoke();
                return;
        }
    }
}
