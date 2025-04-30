package f8;

import Q7.n0;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20385a;
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20386c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f20387d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20388e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f20389f;

    /* renamed from: g, reason: collision with root package name */
    public final String f20390g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f20391h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f20392i;

    /* renamed from: j, reason: collision with root package name */
    public final String f20393j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f20394k;
    public final boolean l;

    public h(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, String str, boolean z14, boolean z15, String str2, boolean z16, boolean z17) {
        G7.j.e(str, "prettyPrintIndent");
        G7.j.e(str2, "classDiscriminator");
        this.f20385a = z8;
        this.b = z9;
        this.f20386c = z10;
        this.f20387d = z11;
        this.f20388e = z12;
        this.f20389f = z13;
        this.f20390g = str;
        this.f20391h = z14;
        this.f20392i = z15;
        this.f20393j = str2;
        this.f20394k = z16;
        this.l = z17;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonConfiguration(encodeDefaults=");
        sb.append(this.f20385a);
        sb.append(", ignoreUnknownKeys=");
        sb.append(this.b);
        sb.append(", isLenient=");
        sb.append(this.f20386c);
        sb.append(", allowStructuredMapKeys=");
        sb.append(this.f20387d);
        sb.append(", prettyPrint=");
        sb.append(this.f20388e);
        sb.append(", explicitNulls=");
        sb.append(this.f20389f);
        sb.append(", prettyPrintIndent='");
        sb.append(this.f20390g);
        sb.append("', coerceInputValues=");
        sb.append(this.f20391h);
        sb.append(", useArrayPolymorphism=");
        sb.append(this.f20392i);
        sb.append(", classDiscriminator='");
        sb.append(this.f20393j);
        sb.append("', allowSpecialFloatingPointValues=");
        return n0.n(sb, this.f20394k, ')');
    }
}
