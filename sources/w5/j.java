package w5;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26777b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26778c;

    public j(String datasetID, String cloudBridgeURL, String accessKey) {
        Intrinsics.checkNotNullParameter(datasetID, "datasetID");
        Intrinsics.checkNotNullParameter(cloudBridgeURL, "cloudBridgeURL");
        Intrinsics.checkNotNullParameter(accessKey, "accessKey");
        this.a = datasetID;
        this.f26777b = cloudBridgeURL;
        this.f26778c = accessKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.a, jVar.a) && Intrinsics.areEqual(this.f26777b, jVar.f26777b) && Intrinsics.areEqual(this.f26778c, jVar.f26778c);
    }

    public final int hashCode() {
        return this.f26778c.hashCode() + vd.e.c(this.f26777b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CloudBridgeCredentials(datasetID=");
        sb2.append(this.a);
        sb2.append(", cloudBridgeURL=");
        sb2.append(this.f26777b);
        sb2.append(", accessKey=");
        return com.applovin.impl.mediation.ads.e.g(sb2, this.f26778c, ')');
    }
}
