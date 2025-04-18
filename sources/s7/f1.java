package s7;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class f1 implements i {

    /* renamed from: d, reason: collision with root package name */
    public static final f1 f24351d = new f1(new h.c(23, (Object) null));

    /* renamed from: f, reason: collision with root package name */
    public static final String f24352f = n9.h0.E(0);

    /* renamed from: g, reason: collision with root package name */
    public static final String f24353g = n9.h0.E(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f24354h = n9.h0.E(2);

    /* renamed from: i, reason: collision with root package name */
    public static final nb.a f24355i = new nb.a(0);

    /* renamed from: b, reason: collision with root package name */
    public final Uri f24356b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24357c;

    public f1(h.c cVar) {
        this.f24356b = (Uri) cVar.f18523c;
        this.f24357c = (String) cVar.f18524d;
        Object obj = cVar.f18525f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        if (n9.h0.a(this.f24356b, f1Var.f24356b) && n9.h0.a(this.f24357c, f1Var.f24357c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Uri uri = this.f24356b;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i11 = hashCode * 31;
        String str = this.f24357c;
        if (str != null) {
            i10 = str.hashCode();
        }
        return i11 + i10;
    }
}
