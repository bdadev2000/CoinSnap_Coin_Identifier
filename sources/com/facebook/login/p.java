package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p extends c0 {

    @JvmField
    public static final Parcelable.Creator<p> CREATOR = new l(2);

    /* renamed from: f, reason: collision with root package name */
    public final String f11255f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f11255f = "katana_proxy_auth";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.a0
    public final String h() {
        return this.f11255f;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0106  */
    @Override // com.facebook.login.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int n(com.facebook.login.r r34) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.p.n(com.facebook.login.r):int");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f11255f = "katana_proxy_auth";
    }
}
