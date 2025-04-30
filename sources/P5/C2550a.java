package p5;

import java.util.ArrayList;
import java.util.List;
import x0.AbstractC2914a;

/* renamed from: p5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2550a {

    /* renamed from: a, reason: collision with root package name */
    public final String f22302a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22303c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22304d;

    /* renamed from: e, reason: collision with root package name */
    public final C2567s f22305e;

    /* renamed from: f, reason: collision with root package name */
    public final List f22306f;

    public C2550a(String str, String str2, String str3, String str4, C2567s c2567s, ArrayList arrayList) {
        G7.j.e(str2, "versionName");
        G7.j.e(str3, "appBuildVersion");
        this.f22302a = str;
        this.b = str2;
        this.f22303c = str3;
        this.f22304d = str4;
        this.f22305e = c2567s;
        this.f22306f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2550a)) {
            return false;
        }
        C2550a c2550a = (C2550a) obj;
        if (G7.j.a(this.f22302a, c2550a.f22302a) && G7.j.a(this.b, c2550a.b) && G7.j.a(this.f22303c, c2550a.f22303c) && G7.j.a(this.f22304d, c2550a.f22304d) && G7.j.a(this.f22305e, c2550a.f22305e) && G7.j.a(this.f22306f, c2550a.f22306f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22306f.hashCode() + ((this.f22305e.hashCode() + AbstractC2914a.b(AbstractC2914a.b(AbstractC2914a.b(this.f22302a.hashCode() * 31, 31, this.b), 31, this.f22303c), 31, this.f22304d)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f22302a + ", versionName=" + this.b + ", appBuildVersion=" + this.f22303c + ", deviceManufacturer=" + this.f22304d + ", currentProcessDetails=" + this.f22305e + ", appProcessDetails=" + this.f22306f + ')';
    }
}
