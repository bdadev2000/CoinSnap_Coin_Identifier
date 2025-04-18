package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j extends a0 {

    /* renamed from: g, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f11236g;

    /* renamed from: d, reason: collision with root package name */
    public final String f11237d;

    /* renamed from: f, reason: collision with root package name */
    public static final ni.a f11235f = new ni.a();

    @JvmField
    public static final Parcelable.Creator<j> CREATOR = new android.support.v4.media.a(29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f11237d = "device_auth";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.a0
    public final String h() {
        return this.f11237d;
    }

    @Override // com.facebook.login.a0
    public final int n(r request) {
        Intrinsics.checkNotNullParameter(request, "request");
        FragmentActivity h10 = f().h();
        if (h10 != null && !h10.isFinishing()) {
            i iVar = new i();
            iVar.show(h10.getSupportFragmentManager(), "login_with_facebook");
            iVar.m(request);
            return 1;
        }
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f11237d = "device_auth";
    }
}
