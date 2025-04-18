package m9;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f21705k = 0;
    public final Uri a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21706b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21707c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f21708d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f21709e;

    /* renamed from: f, reason: collision with root package name */
    public final long f21710f;

    /* renamed from: g, reason: collision with root package name */
    public final long f21711g;

    /* renamed from: h, reason: collision with root package name */
    public final String f21712h;

    /* renamed from: i, reason: collision with root package name */
    public final int f21713i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f21714j;

    static {
        s7.p0.a("goog.exo.datasource");
    }

    public p(Uri uri, long j3, int i10, byte[] bArr, Map map, long j10, long j11, String str, int i11, Object obj) {
        boolean z10;
        boolean z11;
        byte[] bArr2 = bArr;
        boolean z12 = true;
        if (j3 + j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        v8.u0.d(z10);
        if (j10 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        v8.u0.d(z11);
        if (j11 <= 0 && j11 != -1) {
            z12 = false;
        }
        v8.u0.d(z12);
        this.a = uri;
        this.f21706b = j3;
        this.f21707c = i10;
        this.f21708d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f21709e = Collections.unmodifiableMap(new HashMap(map));
        this.f21710f = j10;
        this.f21711g = j11;
        this.f21712h = str;
        this.f21713i = i11;
        this.f21714j = obj;
    }

    public final p a(long j3) {
        long j10 = this.f21711g;
        long j11 = -1;
        if (j10 != -1) {
            j11 = j10 - j3;
        }
        long j12 = j11;
        if (j3 == 0 && j10 == j12) {
            return this;
        }
        return new p(this.a, this.f21706b, this.f21707c, this.f21708d, this.f21709e, this.f21710f + j3, j12, this.f21712h, this.f21713i, this.f21714j);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f21707c;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    str = "HEAD";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str = "POST";
            }
        } else {
            str = "GET";
        }
        sb2.append(str);
        sb2.append(" ");
        sb2.append(this.a);
        sb2.append(", ");
        sb2.append(this.f21710f);
        sb2.append(", ");
        sb2.append(this.f21711g);
        sb2.append(", ");
        sb2.append(this.f21712h);
        sb2.append(", ");
        return vd.e.g(sb2, this.f21713i, "]");
    }
}
