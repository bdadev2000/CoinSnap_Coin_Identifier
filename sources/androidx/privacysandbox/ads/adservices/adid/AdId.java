package androidx.privacysandbox.ads.adservices.adid;

import p0.a;

/* loaded from: classes3.dex */
public final class AdId {

    /* renamed from: a, reason: collision with root package name */
    public final String f20803a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20804b;

    public AdId(String str, boolean z2) {
        this.f20803a = str;
        this.f20804b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdId)) {
            return false;
        }
        AdId adId = (AdId) obj;
        return a.g(this.f20803a, adId.f20803a) && this.f20804b == adId.f20804b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20804b) + (this.f20803a.hashCode() * 31);
    }

    public final String toString() {
        return "AdId: adId=" + this.f20803a + ", isLimitAdTrackingEnabled=" + this.f20804b;
    }
}
