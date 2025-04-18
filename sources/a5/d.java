package a5;

import java.util.Map;

/* loaded from: classes.dex */
public final class d {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f176b;

    /* renamed from: c, reason: collision with root package name */
    public final int f177c;

    /* renamed from: d, reason: collision with root package name */
    public final String f178d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f179e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f180f;

    public d(boolean z10, boolean z11, int i10, String str, Map map, String[] strArr) {
        this.a = z10;
        this.f176b = z11;
        this.f177c = i10;
        this.f178d = str;
        this.f179e = map;
        this.f180f = strArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.a != dVar.a || this.f176b != dVar.f176b || this.f177c != dVar.f177c) {
            return false;
        }
        return this.f178d.equals(dVar.f178d);
    }

    public final int hashCode() {
        return this.f178d.hashCode() + ((((((this.a ? 1 : 0) * 31) + (this.f176b ? 1 : 0)) * 31) + this.f177c) * 31);
    }
}
