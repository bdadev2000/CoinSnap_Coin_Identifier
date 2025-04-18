package androidx.privacysandbox.ads.adservices.appsetid;

import p0.a;

/* loaded from: classes.dex */
public final class AppSetId {

    /* renamed from: a, reason: collision with root package name */
    public final String f20811a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20812b;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public AppSetId(String str, int i2) {
        this.f20811a = str;
        this.f20812b = i2;
        if (i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("Scope undefined.".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppSetId)) {
            return false;
        }
        AppSetId appSetId = (AppSetId) obj;
        return a.g(this.f20811a, appSetId.f20811a) && this.f20812b == appSetId.f20812b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20812b) + (this.f20811a.hashCode() * 31);
    }

    public final String toString() {
        return "AppSetId: id=" + this.f20811a + ", scope=" + (this.f20812b == 1 ? "SCOPE_APP" : "SCOPE_DEVELOPER");
    }
}
