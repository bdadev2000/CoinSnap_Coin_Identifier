package androidx.privacysandbox.ads.adservices.topics;

import p0.a;

/* loaded from: classes2.dex */
public final class GetTopicsRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f20860a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20861b;

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f20862a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f20863b;
    }

    public GetTopicsRequest(String str, boolean z2) {
        a.s(str, "adsSdkName");
        this.f20860a = str;
        this.f20861b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTopicsRequest)) {
            return false;
        }
        GetTopicsRequest getTopicsRequest = (GetTopicsRequest) obj;
        return a.g(this.f20860a, getTopicsRequest.f20860a) && this.f20861b == getTopicsRequest.f20861b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20861b) + (this.f20860a.hashCode() * 31);
    }

    public final String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f20860a + ", shouldRecordObservation=" + this.f20861b;
    }
}
