package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class o extends B {
    public static final Parcelable.Creator<o> CREATOR = new com.facebook.y(7);

    /* renamed from: g, reason: collision with root package name */
    public final String f13737g;

    public o(t tVar) {
        super(tVar);
        this.f13737g = "katana_proxy_auth";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.z
    public final String f() {
        return this.f13737g;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x010f  */
    @Override // com.facebook.login.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int l(com.facebook.login.q r35) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.o.l(com.facebook.login.q):int");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Parcel parcel) {
        super(parcel, 0);
        G7.j.e(parcel, "source");
        this.f13737g = "katana_proxy_auth";
    }
}
