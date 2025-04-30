package B4;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f309a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f310c;

    public a(boolean z8, boolean z9, boolean z10) {
        this.f309a = z8;
        this.b = z9;
        this.f310c = z10;
    }

    public boolean a() {
        if ((this.f310c || this.b) && this.f309a) {
            return true;
        }
        return false;
    }
}
