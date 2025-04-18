package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: b, reason: collision with root package name */
    public final f0 f1786b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1787c;

    /* renamed from: d, reason: collision with root package name */
    public int f1788d = -1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ LiveData f1789f;

    public c0(LiveData liveData, f0 f0Var) {
        this.f1789f = liveData;
        this.f1786b = f0Var;
    }

    public final void c(boolean z10) {
        int i10;
        if (z10 == this.f1787c) {
            return;
        }
        this.f1787c = z10;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        LiveData liveData = this.f1789f;
        liveData.changeActiveCounter(i10);
        if (this.f1787c) {
            liveData.dispatchingValue(this);
        }
    }

    public void d() {
    }

    public boolean e(v vVar) {
        return false;
    }

    public abstract boolean f();
}
