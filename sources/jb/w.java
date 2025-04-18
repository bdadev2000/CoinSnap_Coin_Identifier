package jb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class w {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19965b;

    public w(String str, String str2) {
        this.a = str;
        this.f19965b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.areEqual(this.a, wVar.a) && Intrinsics.areEqual(this.f19965b, wVar.f19965b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19965b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FirebaseInstallationId(fid=");
        sb2.append(this.a);
        sb2.append(", authToken=");
        return com.applovin.impl.mediation.ads.e.g(sb2, this.f19965b, ')');
    }
}
