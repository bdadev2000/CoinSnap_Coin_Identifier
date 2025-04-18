package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o extends c0 {

    @JvmField
    public static final Parcelable.Creator<o> CREATOR = new l(1);

    /* renamed from: f, reason: collision with root package name */
    public final String f11253f;

    /* renamed from: g, reason: collision with root package name */
    public final com.facebook.k f11254g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(u loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f11253f = "instagram_login";
        this.f11254g = com.facebook.k.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.a0
    public final String h() {
        return this.f11253f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
    
        if (com.facebook.internal.q.a(r15, r4) == false) goto L42;
     */
    @Override // com.facebook.login.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int n(com.facebook.login.r r26) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.o.n(com.facebook.login.r):int");
    }

    @Override // com.facebook.login.c0
    public final com.facebook.k q() {
        return this.f11254g;
    }

    @Override // com.facebook.login.a0, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f11253f = "instagram_login";
        this.f11254g = com.facebook.k.INSTAGRAM_APPLICATION_WEB;
    }
}
