package com.facebook.login;

import a5.C0398b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class k extends z {

    /* renamed from: g, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f13723g;

    /* renamed from: d, reason: collision with root package name */
    public final String f13724d;

    /* renamed from: f, reason: collision with root package name */
    public static final C0398b f13722f = new Object();
    public static final Parcelable.Creator<k> CREATOR = new com.facebook.y(4);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Parcel parcel) {
        super(parcel);
        G7.j.e(parcel, "parcel");
        this.f13724d = "device_auth";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.z
    public final String f() {
        return this.f13724d;
    }

    @Override // com.facebook.login.z
    public final int l(q qVar) {
        G7.j.e(qVar, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
        FragmentActivity f9 = e().f();
        if (f9 != null && !f9.isFinishing()) {
            j jVar = new j();
            jVar.show(f9.getSupportFragmentManager(), "login_with_facebook");
            jVar.k(qVar);
            return 1;
        }
        return 1;
    }

    public k(t tVar) {
        this.f13788c = tVar;
        this.f13724d = "device_auth";
    }
}
