package h7;

/* loaded from: classes3.dex */
public final class m extends a {
    public final Integer a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18837b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18838c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18839d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18840e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18841f;

    /* renamed from: g, reason: collision with root package name */
    public final String f18842g;

    /* renamed from: h, reason: collision with root package name */
    public final String f18843h;

    /* renamed from: i, reason: collision with root package name */
    public final String f18844i;

    /* renamed from: j, reason: collision with root package name */
    public final String f18845j;

    /* renamed from: k, reason: collision with root package name */
    public final String f18846k;

    /* renamed from: l, reason: collision with root package name */
    public final String f18847l;

    public m(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.a = num;
        this.f18837b = str;
        this.f18838c = str2;
        this.f18839d = str3;
        this.f18840e = str4;
        this.f18841f = str5;
        this.f18842g = str6;
        this.f18843h = str7;
        this.f18844i = str8;
        this.f18845j = str9;
        this.f18846k = str10;
        this.f18847l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.a;
        if (num != null ? num.equals(((m) aVar).a) : ((m) aVar).a == null) {
            String str = this.f18837b;
            if (str != null ? str.equals(((m) aVar).f18837b) : ((m) aVar).f18837b == null) {
                String str2 = this.f18838c;
                if (str2 != null ? str2.equals(((m) aVar).f18838c) : ((m) aVar).f18838c == null) {
                    String str3 = this.f18839d;
                    if (str3 != null ? str3.equals(((m) aVar).f18839d) : ((m) aVar).f18839d == null) {
                        String str4 = this.f18840e;
                        if (str4 != null ? str4.equals(((m) aVar).f18840e) : ((m) aVar).f18840e == null) {
                            String str5 = this.f18841f;
                            if (str5 != null ? str5.equals(((m) aVar).f18841f) : ((m) aVar).f18841f == null) {
                                String str6 = this.f18842g;
                                if (str6 != null ? str6.equals(((m) aVar).f18842g) : ((m) aVar).f18842g == null) {
                                    String str7 = this.f18843h;
                                    if (str7 != null ? str7.equals(((m) aVar).f18843h) : ((m) aVar).f18843h == null) {
                                        String str8 = this.f18844i;
                                        if (str8 != null ? str8.equals(((m) aVar).f18844i) : ((m) aVar).f18844i == null) {
                                            String str9 = this.f18845j;
                                            if (str9 != null ? str9.equals(((m) aVar).f18845j) : ((m) aVar).f18845j == null) {
                                                String str10 = this.f18846k;
                                                if (str10 != null ? str10.equals(((m) aVar).f18846k) : ((m) aVar).f18846k == null) {
                                                    String str11 = this.f18847l;
                                                    if (str11 == null) {
                                                        if (((m) aVar).f18847l == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(((m) aVar).f18847l)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int i10 = 0;
        Integer num = this.a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        String str = this.f18837b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str2 = this.f18838c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        String str3 = this.f18839d;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        String str4 = this.f18840e;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i15 = (i14 ^ hashCode5) * 1000003;
        String str5 = this.f18841f;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i16 = (i15 ^ hashCode6) * 1000003;
        String str6 = this.f18842g;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i17 = (i16 ^ hashCode7) * 1000003;
        String str7 = this.f18843h;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i18 = (i17 ^ hashCode8) * 1000003;
        String str8 = this.f18844i;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i19 = (i18 ^ hashCode9) * 1000003;
        String str9 = this.f18845j;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int i20 = (i19 ^ hashCode10) * 1000003;
        String str10 = this.f18846k;
        if (str10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str10.hashCode();
        }
        int i21 = (i20 ^ hashCode11) * 1000003;
        String str11 = this.f18847l;
        if (str11 != null) {
            i10 = str11.hashCode();
        }
        return i10 ^ i21;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.a);
        sb2.append(", model=");
        sb2.append(this.f18837b);
        sb2.append(", hardware=");
        sb2.append(this.f18838c);
        sb2.append(", device=");
        sb2.append(this.f18839d);
        sb2.append(", product=");
        sb2.append(this.f18840e);
        sb2.append(", osBuild=");
        sb2.append(this.f18841f);
        sb2.append(", manufacturer=");
        sb2.append(this.f18842g);
        sb2.append(", fingerprint=");
        sb2.append(this.f18843h);
        sb2.append(", locale=");
        sb2.append(this.f18844i);
        sb2.append(", country=");
        sb2.append(this.f18845j);
        sb2.append(", mccMnc=");
        sb2.append(this.f18846k);
        sb2.append(", applicationBuild=");
        return vd.e.h(sb2, this.f18847l, "}");
    }
}
