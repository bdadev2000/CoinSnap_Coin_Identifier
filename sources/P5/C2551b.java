package p5;

import x0.AbstractC2914a;

/* renamed from: p5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2551b {

    /* renamed from: a, reason: collision with root package name */
    public final String f22307a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22308c;

    /* renamed from: d, reason: collision with root package name */
    public final C2550a f22309d;

    public C2551b(String str, String str2, String str3, C2550a c2550a) {
        G7.j.e(str, "appId");
        this.f22307a = str;
        this.b = str2;
        this.f22308c = str3;
        this.f22309d = c2550a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2551b)) {
            return false;
        }
        C2551b c2551b = (C2551b) obj;
        if (G7.j.a(this.f22307a, c2551b.f22307a) && G7.j.a(this.b, c2551b.b) && "2.0.3".equals("2.0.3") && G7.j.a(this.f22308c, c2551b.f22308c) && G7.j.a(this.f22309d, c2551b.f22309d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22309d.hashCode() + ((r.LOG_ENVIRONMENT_PROD.hashCode() + AbstractC2914a.b((((this.b.hashCode() + (this.f22307a.hashCode() * 31)) * 31) + 47594041) * 31, 31, this.f22308c)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f22307a + ", deviceModel=" + this.b + ", sessionSdkVersion=2.0.3, osVersion=" + this.f22308c + ", logEnvironment=" + r.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.f22309d + ')';
    }
}
