package s7;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class v0 implements i {

    /* renamed from: d, reason: collision with root package name */
    public static final String f24772d = n9.h0.E(0);

    /* renamed from: f, reason: collision with root package name */
    public static final com.facebook.appevents.m f24773f = new com.facebook.appevents.m(24);

    /* renamed from: b, reason: collision with root package name */
    public final Uri f24774b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f24775c;

    public v0(r4.c cVar) {
        this.f24774b = (Uri) cVar.f23999c;
        this.f24775c = cVar.f24000d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f24774b.equals(v0Var.f24774b) && n9.h0.a(this.f24775c, v0Var.f24775c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f24774b.hashCode() * 31;
        Object obj = this.f24775c;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
