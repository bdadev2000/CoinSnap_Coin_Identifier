package p8;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.thrid.okhttp.internal.http2.Header;

/* renamed from: p8.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2575c {

    /* renamed from: d, reason: collision with root package name */
    public static final w8.i f22390d;

    /* renamed from: e, reason: collision with root package name */
    public static final w8.i f22391e;

    /* renamed from: f, reason: collision with root package name */
    public static final w8.i f22392f;

    /* renamed from: g, reason: collision with root package name */
    public static final w8.i f22393g;

    /* renamed from: h, reason: collision with root package name */
    public static final w8.i f22394h;

    /* renamed from: i, reason: collision with root package name */
    public static final w8.i f22395i;

    /* renamed from: a, reason: collision with root package name */
    public final w8.i f22396a;
    public final w8.i b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22397c;

    static {
        w8.i iVar = w8.i.f24015f;
        f22390d = r6.b.c(":");
        f22391e = r6.b.c(Header.RESPONSE_STATUS_UTF8);
        f22392f = r6.b.c(Header.TARGET_METHOD_UTF8);
        f22393g = r6.b.c(Header.TARGET_PATH_UTF8);
        f22394h = r6.b.c(Header.TARGET_SCHEME_UTF8);
        f22395i = r6.b.c(Header.TARGET_AUTHORITY_UTF8);
    }

    public C2575c(w8.i iVar, w8.i iVar2) {
        G7.j.e(iVar, "name");
        G7.j.e(iVar2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f22396a = iVar;
        this.b = iVar2;
        this.f22397c = iVar2.c() + iVar.c() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2575c)) {
            return false;
        }
        C2575c c2575c = (C2575c) obj;
        if (G7.j.a(this.f22396a, c2575c.f22396a) && G7.j.a(this.b, c2575c.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22396a.hashCode() * 31);
    }

    public final String toString() {
        return this.f22396a.j() + ": " + this.b.j();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2575c(String str, String str2) {
        this(r6.b.c(str), r6.b.c(str2));
        G7.j.e(str, "name");
        G7.j.e(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        w8.i iVar = w8.i.f24015f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2575c(w8.i iVar, String str) {
        this(iVar, r6.b.c(str));
        G7.j.e(iVar, "name");
        G7.j.e(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        w8.i iVar2 = w8.i.f24015f;
    }
}
