package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final class u2 {
    public int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f1050b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f1051c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f1052d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f1053e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f1054f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1055g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1056h = false;

    public final void a(int i10, int i11) {
        this.f1051c = i10;
        this.f1052d = i11;
        this.f1056h = true;
        if (this.f1055g) {
            if (i11 != Integer.MIN_VALUE) {
                this.a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1050b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1050b = i11;
        }
    }
}
