package k8;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class v {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20380b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20381c;

    public v(String str, boolean z10, boolean z11) {
        this.a = str;
        this.f20380b = z10;
        this.f20381c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != v.class) {
            return false;
        }
        v vVar = (v) obj;
        if (TextUtils.equals(this.a, vVar.a) && this.f20380b == vVar.f20380b && this.f20381c == vVar.f20381c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int c10 = vd.e.c(this.a, 31, 31);
        int i11 = 1231;
        if (this.f20380b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (c10 + i10) * 31;
        if (!this.f20381c) {
            i11 = 1237;
        }
        return i12 + i11;
    }
}
