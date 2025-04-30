package p5;

import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final String f22285a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22286c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22287d;

    /* renamed from: e, reason: collision with root package name */
    public final C2559j f22288e;

    /* renamed from: f, reason: collision with root package name */
    public final String f22289f;

    /* renamed from: g, reason: collision with root package name */
    public final String f22290g;

    public N(String str, String str2, int i9, long j7, C2559j c2559j, String str3, String str4) {
        G7.j.e(str, "sessionId");
        G7.j.e(str2, "firstSessionId");
        G7.j.e(str4, "firebaseAuthenticationToken");
        this.f22285a = str;
        this.b = str2;
        this.f22286c = i9;
        this.f22287d = j7;
        this.f22288e = c2559j;
        this.f22289f = str3;
        this.f22290g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n2 = (N) obj;
        if (G7.j.a(this.f22285a, n2.f22285a) && G7.j.a(this.b, n2.b) && this.f22286c == n2.f22286c && this.f22287d == n2.f22287d && G7.j.a(this.f22288e, n2.f22288e) && G7.j.a(this.f22289f, n2.f22289f) && G7.j.a(this.f22290g, n2.f22290g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22290g.hashCode() + AbstractC2914a.b((this.f22288e.hashCode() + ((Long.hashCode(this.f22287d) + ((Integer.hashCode(this.f22286c) + AbstractC2914a.b(this.f22285a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31, 31, this.f22289f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.f22285a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.f22286c);
        sb.append(", eventTimestampUs=");
        sb.append(this.f22287d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.f22288e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f22289f);
        sb.append(", firebaseAuthenticationToken=");
        return com.applovin.impl.L.k(sb, this.f22290g, ')');
    }
}
