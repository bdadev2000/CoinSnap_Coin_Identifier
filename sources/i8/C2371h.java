package i8;

import java.util.concurrent.TimeUnit;

/* renamed from: i8.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2371h {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f20826n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20827a;
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20828c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20829d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20830e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f20831f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f20832g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20833h;

    /* renamed from: i, reason: collision with root package name */
    public final int f20834i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f20835j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f20836k;
    public final boolean l;
    public String m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        G7.j.e(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public C2371h(boolean z8, boolean z9, int i9, int i10, boolean z10, boolean z11, boolean z12, int i11, int i12, boolean z13, boolean z14, boolean z15, String str) {
        this.f20827a = z8;
        this.b = z9;
        this.f20828c = i9;
        this.f20829d = i10;
        this.f20830e = z10;
        this.f20831f = z11;
        this.f20832g = z12;
        this.f20833h = i11;
        this.f20834i = i12;
        this.f20835j = z13;
        this.f20836k = z14;
        this.l = z15;
        this.m = str;
    }

    public final String toString() {
        String str = this.m;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f20827a) {
                sb.append("no-cache, ");
            }
            if (this.b) {
                sb.append("no-store, ");
            }
            int i9 = this.f20828c;
            if (i9 != -1) {
                sb.append("max-age=");
                sb.append(i9);
                sb.append(", ");
            }
            int i10 = this.f20829d;
            if (i10 != -1) {
                sb.append("s-maxage=");
                sb.append(i10);
                sb.append(", ");
            }
            if (this.f20830e) {
                sb.append("private, ");
            }
            if (this.f20831f) {
                sb.append("public, ");
            }
            if (this.f20832g) {
                sb.append("must-revalidate, ");
            }
            int i11 = this.f20833h;
            if (i11 != -1) {
                sb.append("max-stale=");
                sb.append(i11);
                sb.append(", ");
            }
            int i12 = this.f20834i;
            if (i12 != -1) {
                sb.append("min-fresh=");
                sb.append(i12);
                sb.append(", ");
            }
            if (this.f20835j) {
                sb.append("only-if-cached, ");
            }
            if (this.f20836k) {
                sb.append("no-transform, ");
            }
            if (this.l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                return "";
            }
            sb.delete(sb.length() - 2, sb.length());
            String sb2 = sb.toString();
            G7.j.d(sb2, "StringBuilder().apply(builderAction).toString()");
            this.m = sb2;
            return sb2;
        }
        return str;
    }
}
