package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class a implements m, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f30911a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f30912b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30913c;
    public final String d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f30914f;

    /* renamed from: g, reason: collision with root package name */
    public final int f30915g;

    /* renamed from: h, reason: collision with root package name */
    public final int f30916h;

    public a(int i2, Object obj, Class cls, String str, String str2, int i3) {
        this.f30911a = obj;
        this.f30912b = cls;
        this.f30913c = str;
        this.d = str2;
        this.f30914f = (i3 & 1) == 1;
        this.f30915g = i2;
        this.f30916h = i3 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f30914f == aVar.f30914f && this.f30915g == aVar.f30915g && this.f30916h == aVar.f30916h && p0.a.g(this.f30911a, aVar.f30911a) && p0.a.g(this.f30912b, aVar.f30912b) && this.f30913c.equals(aVar.f30913c) && this.d.equals(aVar.d);
    }

    @Override // kotlin.jvm.internal.m
    public final int getArity() {
        return this.f30915g;
    }

    public final int hashCode() {
        Object obj = this.f30911a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f30912b;
        return ((((androidx.compose.foundation.text.input.a.b(this.d, androidx.compose.foundation.text.input.a.b(this.f30913c, (hashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31), 31) + (this.f30914f ? 1231 : 1237)) * 31) + this.f30915g) * 31) + this.f30916h;
    }

    public final String toString() {
        g0.f30932a.getClass();
        return h0.a(this);
    }
}
