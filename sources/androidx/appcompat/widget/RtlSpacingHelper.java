package androidx.appcompat.widget;

/* loaded from: classes3.dex */
class RtlSpacingHelper {

    /* renamed from: a, reason: collision with root package name */
    public int f1175a;

    /* renamed from: b, reason: collision with root package name */
    public int f1176b;

    /* renamed from: c, reason: collision with root package name */
    public int f1177c;
    public int d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f1178f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1179g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1180h;

    public final void a(int i2, int i3) {
        this.f1177c = i2;
        this.d = i3;
        this.f1180h = true;
        if (this.f1179g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f1175a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f1176b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1175a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f1176b = i3;
        }
    }
}
