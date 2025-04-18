package z8;

import n9.h0;

/* loaded from: classes3.dex */
public final class i {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28624b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28625c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28626d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28627e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.f28624b = str2;
        this.f28625c = str3;
        this.f28626d = str4;
        this.f28627e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (h0.a(this.a, iVar.a) && h0.a(this.f28624b, iVar.f28624b) && h0.a(this.f28625c, iVar.f28625c) && h0.a(this.f28626d, iVar.f28626d) && h0.a(this.f28627e, iVar.f28627e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        String str = this.a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (527 + i10) * 31;
        String str2 = this.f28624b;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str3 = this.f28625c;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        String str4 = this.f28626d;
        if (str4 != null) {
            i13 = str4.hashCode();
        } else {
            i13 = 0;
        }
        int i18 = (i17 + i13) * 31;
        String str5 = this.f28627e;
        if (str5 != null) {
            i14 = str5.hashCode();
        }
        return i18 + i14;
    }
}
