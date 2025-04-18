package wh;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f27066n = 0;
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27067b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27068c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27069d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27070e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27071f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27072g;

    /* renamed from: h, reason: collision with root package name */
    public final int f27073h;

    /* renamed from: i, reason: collision with root package name */
    public final int f27074i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f27075j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f27076k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f27077l;

    /* renamed from: m, reason: collision with root package name */
    public String f27078m;

    static {
        new v5.a();
        new v5.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public i(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.a = z10;
        this.f27067b = z11;
        this.f27068c = i10;
        this.f27069d = i11;
        this.f27070e = z12;
        this.f27071f = z13;
        this.f27072g = z14;
        this.f27073h = i12;
        this.f27074i = i13;
        this.f27075j = z15;
        this.f27076k = z16;
        this.f27077l = z17;
        this.f27078m = str;
    }

    public final String toString() {
        boolean z10;
        String str = this.f27078m;
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            if (this.a) {
                sb2.append("no-cache, ");
            }
            if (this.f27067b) {
                sb2.append("no-store, ");
            }
            int i10 = this.f27068c;
            if (i10 != -1) {
                sb2.append("max-age=");
                sb2.append(i10);
                sb2.append(", ");
            }
            int i11 = this.f27069d;
            if (i11 != -1) {
                sb2.append("s-maxage=");
                sb2.append(i11);
                sb2.append(", ");
            }
            if (this.f27070e) {
                sb2.append("private, ");
            }
            if (this.f27071f) {
                sb2.append("public, ");
            }
            if (this.f27072g) {
                sb2.append("must-revalidate, ");
            }
            int i12 = this.f27073h;
            if (i12 != -1) {
                sb2.append("max-stale=");
                sb2.append(i12);
                sb2.append(", ");
            }
            int i13 = this.f27074i;
            if (i13 != -1) {
                sb2.append("min-fresh=");
                sb2.append(i13);
                sb2.append(", ");
            }
            if (this.f27075j) {
                sb2.append("only-if-cached, ");
            }
            if (this.f27076k) {
                sb2.append("no-transform, ");
            }
            if (this.f27077l) {
                sb2.append("immutable, ");
            }
            if (sb2.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return "";
            }
            sb2.delete(sb2.length() - 2, sb2.length());
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
            this.f27078m = sb3;
            return sb3;
        }
        return str;
    }
}
