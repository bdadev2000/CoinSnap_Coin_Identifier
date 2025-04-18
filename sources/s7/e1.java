package s7;

import android.net.Uri;
import java.util.List;

/* loaded from: classes3.dex */
public final class e1 implements i {

    /* renamed from: k, reason: collision with root package name */
    public static final String f24334k = n9.h0.E(0);

    /* renamed from: l, reason: collision with root package name */
    public static final String f24335l = n9.h0.E(1);

    /* renamed from: m, reason: collision with root package name */
    public static final String f24336m = n9.h0.E(2);

    /* renamed from: n, reason: collision with root package name */
    public static final String f24337n = n9.h0.E(3);

    /* renamed from: o, reason: collision with root package name */
    public static final String f24338o = n9.h0.E(4);

    /* renamed from: p, reason: collision with root package name */
    public static final String f24339p = n9.h0.E(5);

    /* renamed from: q, reason: collision with root package name */
    public static final String f24340q = n9.h0.E(6);

    /* renamed from: r, reason: collision with root package name */
    public static final com.facebook.appevents.m f24341r = new com.facebook.appevents.m(28);

    /* renamed from: b, reason: collision with root package name */
    public final Uri f24342b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24343c;

    /* renamed from: d, reason: collision with root package name */
    public final b1 f24344d;

    /* renamed from: f, reason: collision with root package name */
    public final v0 f24345f;

    /* renamed from: g, reason: collision with root package name */
    public final List f24346g;

    /* renamed from: h, reason: collision with root package name */
    public final String f24347h;

    /* renamed from: i, reason: collision with root package name */
    public final com.google.common.collect.r0 f24348i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f24349j;

    public e1(Uri uri, String str, b1 b1Var, v0 v0Var, List list, String str2, com.google.common.collect.r0 r0Var, Object obj) {
        this.f24342b = uri;
        this.f24343c = str;
        this.f24344d = b1Var;
        this.f24345f = v0Var;
        this.f24346g = list;
        this.f24347h = str2;
        this.f24348i = r0Var;
        com.google.common.collect.n0 n0Var = com.google.common.collect.r0.f12026c;
        com.google.common.collect.m0 m0Var = new com.google.common.collect.m0();
        for (int i10 = 0; i10 < r0Var.size(); i10++) {
            i1 i1Var = (i1) r0Var.get(i10);
            i1Var.getClass();
            m0Var.u(new g1(new h1(i1Var)));
        }
        m0Var.y();
        this.f24349j = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        if (this.f24342b.equals(e1Var.f24342b) && n9.h0.a(this.f24343c, e1Var.f24343c) && n9.h0.a(this.f24344d, e1Var.f24344d) && n9.h0.a(this.f24345f, e1Var.f24345f) && this.f24346g.equals(e1Var.f24346g) && n9.h0.a(this.f24347h, e1Var.f24347h) && this.f24348i.equals(e1Var.f24348i) && n9.h0.a(this.f24349j, e1Var.f24349j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.f24342b.hashCode() * 31;
        int i10 = 0;
        String str = this.f24343c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 + hashCode) * 31;
        b1 b1Var = this.f24344d;
        if (b1Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = b1Var.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        v0 v0Var = this.f24345f;
        if (v0Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = v0Var.hashCode();
        }
        int hashCode6 = (this.f24346g.hashCode() + ((i12 + hashCode3) * 31)) * 31;
        String str2 = this.f24347h;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int hashCode7 = (this.f24348i.hashCode() + ((hashCode6 + hashCode4) * 31)) * 31;
        Object obj = this.f24349j;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode7 + i10;
    }
}
