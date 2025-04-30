package j3;

import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class m extends AbstractC2386a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f21069a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21070c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21071d;

    /* renamed from: e, reason: collision with root package name */
    public final String f21072e;

    /* renamed from: f, reason: collision with root package name */
    public final String f21073f;

    /* renamed from: g, reason: collision with root package name */
    public final String f21074g;

    /* renamed from: h, reason: collision with root package name */
    public final String f21075h;

    /* renamed from: i, reason: collision with root package name */
    public final String f21076i;

    /* renamed from: j, reason: collision with root package name */
    public final String f21077j;

    /* renamed from: k, reason: collision with root package name */
    public final String f21078k;
    public final String l;

    public m(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f21069a = num;
        this.b = str;
        this.f21070c = str2;
        this.f21071d = str3;
        this.f21072e = str4;
        this.f21073f = str5;
        this.f21074g = str6;
        this.f21075h = str7;
        this.f21076i = str8;
        this.f21077j = str9;
        this.f21078k = str10;
        this.l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2386a)) {
            return false;
        }
        AbstractC2386a abstractC2386a = (AbstractC2386a) obj;
        Integer num = this.f21069a;
        if (num != null ? num.equals(((m) abstractC2386a).f21069a) : ((m) abstractC2386a).f21069a == null) {
            String str = this.b;
            if (str != null ? str.equals(((m) abstractC2386a).b) : ((m) abstractC2386a).b == null) {
                String str2 = this.f21070c;
                if (str2 != null ? str2.equals(((m) abstractC2386a).f21070c) : ((m) abstractC2386a).f21070c == null) {
                    String str3 = this.f21071d;
                    if (str3 != null ? str3.equals(((m) abstractC2386a).f21071d) : ((m) abstractC2386a).f21071d == null) {
                        String str4 = this.f21072e;
                        if (str4 != null ? str4.equals(((m) abstractC2386a).f21072e) : ((m) abstractC2386a).f21072e == null) {
                            String str5 = this.f21073f;
                            if (str5 != null ? str5.equals(((m) abstractC2386a).f21073f) : ((m) abstractC2386a).f21073f == null) {
                                String str6 = this.f21074g;
                                if (str6 != null ? str6.equals(((m) abstractC2386a).f21074g) : ((m) abstractC2386a).f21074g == null) {
                                    String str7 = this.f21075h;
                                    if (str7 != null ? str7.equals(((m) abstractC2386a).f21075h) : ((m) abstractC2386a).f21075h == null) {
                                        String str8 = this.f21076i;
                                        if (str8 != null ? str8.equals(((m) abstractC2386a).f21076i) : ((m) abstractC2386a).f21076i == null) {
                                            String str9 = this.f21077j;
                                            if (str9 != null ? str9.equals(((m) abstractC2386a).f21077j) : ((m) abstractC2386a).f21077j == null) {
                                                String str10 = this.f21078k;
                                                if (str10 != null ? str10.equals(((m) abstractC2386a).f21078k) : ((m) abstractC2386a).f21078k == null) {
                                                    String str11 = this.l;
                                                    if (str11 == null) {
                                                        if (((m) abstractC2386a).l == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(((m) abstractC2386a).l)) {
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
        int i9 = 0;
        Integer num = this.f21069a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        String str = this.b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str2 = this.f21070c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        String str3 = this.f21071d;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        String str4 = this.f21072e;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i14 = (i13 ^ hashCode5) * 1000003;
        String str5 = this.f21073f;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i15 = (i14 ^ hashCode6) * 1000003;
        String str6 = this.f21074g;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i16 = (i15 ^ hashCode7) * 1000003;
        String str7 = this.f21075h;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i17 = (i16 ^ hashCode8) * 1000003;
        String str8 = this.f21076i;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i18 = (i17 ^ hashCode9) * 1000003;
        String str9 = this.f21077j;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int i19 = (i18 ^ hashCode10) * 1000003;
        String str10 = this.f21078k;
        if (str10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str10.hashCode();
        }
        int i20 = (i19 ^ hashCode11) * 1000003;
        String str11 = this.l;
        if (str11 != null) {
            i9 = str11.hashCode();
        }
        return i9 ^ i20;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f21069a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", hardware=");
        sb.append(this.f21070c);
        sb.append(", device=");
        sb.append(this.f21071d);
        sb.append(", product=");
        sb.append(this.f21072e);
        sb.append(", osBuild=");
        sb.append(this.f21073f);
        sb.append(", manufacturer=");
        sb.append(this.f21074g);
        sb.append(", fingerprint=");
        sb.append(this.f21075h);
        sb.append(", locale=");
        sb.append(this.f21076i);
        sb.append(", country=");
        sb.append(this.f21077j);
        sb.append(", mccMnc=");
        sb.append(this.f21078k);
        sb.append(", applicationBuild=");
        return AbstractC2914a.h(sb, this.l, "}");
    }
}
