package s7;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class b1 implements i {

    /* renamed from: k, reason: collision with root package name */
    public static final String f24284k = n9.h0.E(0);

    /* renamed from: l, reason: collision with root package name */
    public static final String f24285l = n9.h0.E(1);

    /* renamed from: m, reason: collision with root package name */
    public static final String f24286m = n9.h0.E(2);

    /* renamed from: n, reason: collision with root package name */
    public static final String f24287n = n9.h0.E(3);

    /* renamed from: o, reason: collision with root package name */
    public static final String f24288o = n9.h0.E(4);

    /* renamed from: p, reason: collision with root package name */
    public static final String f24289p = n9.h0.E(5);

    /* renamed from: q, reason: collision with root package name */
    public static final String f24290q = n9.h0.E(6);

    /* renamed from: r, reason: collision with root package name */
    public static final String f24291r = n9.h0.E(7);

    /* renamed from: s, reason: collision with root package name */
    public static final com.facebook.appevents.m f24292s = new com.facebook.appevents.m(26);

    /* renamed from: b, reason: collision with root package name */
    public final UUID f24293b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f24294c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.common.collect.u0 f24295d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24296f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f24297g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f24298h;

    /* renamed from: i, reason: collision with root package name */
    public final com.google.common.collect.r0 f24299i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f24300j;

    public b1(a1 a1Var) {
        boolean z10;
        byte[] bArr;
        if (a1Var.f24261f && a1Var.f24257b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        v8.u0.m(z10);
        UUID uuid = a1Var.a;
        uuid.getClass();
        this.f24293b = uuid;
        this.f24294c = a1Var.f24257b;
        this.f24295d = a1Var.f24258c;
        this.f24296f = a1Var.f24259d;
        this.f24298h = a1Var.f24261f;
        this.f24297g = a1Var.f24260e;
        this.f24299i = a1Var.f24262g;
        byte[] bArr2 = a1Var.f24263h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        } else {
            bArr = null;
        }
        this.f24300j = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        if (this.f24293b.equals(b1Var.f24293b) && n9.h0.a(this.f24294c, b1Var.f24294c) && n9.h0.a(this.f24295d, b1Var.f24295d) && this.f24296f == b1Var.f24296f && this.f24298h == b1Var.f24298h && this.f24297g == b1Var.f24297g && this.f24299i.equals(b1Var.f24299i) && Arrays.equals(this.f24300j, b1Var.f24300j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f24293b.hashCode() * 31;
        Uri uri = this.f24294c;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f24300j) + ((this.f24299i.hashCode() + ((((((((this.f24295d.hashCode() + ((hashCode + i10) * 31)) * 31) + (this.f24296f ? 1 : 0)) * 31) + (this.f24298h ? 1 : 0)) * 31) + (this.f24297g ? 1 : 0)) * 31)) * 31);
    }
}
