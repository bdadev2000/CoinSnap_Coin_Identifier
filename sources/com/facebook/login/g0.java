package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.internal.m0;
import com.facebook.internal.v0;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g0 extends d0 {

    @JvmField
    public static final Parcelable.Creator<g0> CREATOR = new l(6);

    /* renamed from: f, reason: collision with root package name */
    public v0 f11218f;

    /* renamed from: g, reason: collision with root package name */
    public String f11219g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11220h;

    /* renamed from: i, reason: collision with root package name */
    public final com.facebook.k f11221i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(u loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f11220h = "web_view";
        this.f11221i = com.facebook.k.WEB_VIEW;
    }

    @Override // com.facebook.login.a0
    public final void c() {
        v0 v0Var = this.f11218f;
        if (v0Var != null) {
            if (v0Var != null) {
                v0Var.cancel();
            }
            this.f11218f = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.a0
    public final String h() {
        return this.f11220h;
    }

    @Override // com.facebook.login.a0
    public final int n(r request) {
        String str;
        Intrinsics.checkNotNullParameter(request, "request");
        Bundle o10 = o(request);
        f0 f0Var = new f0(this, request);
        String r6 = ni.a.r();
        this.f11219g = r6;
        a(r6, "e2e");
        FragmentActivity h10 = f().h();
        if (h10 == null) {
            return 0;
        }
        boolean w10 = m0.w(h10);
        e0 e0Var = new e0(this, h10, request.f11267f, o10);
        String e2e = this.f11219g;
        if (e2e != null) {
            Intrinsics.checkNotNullParameter(e2e, "e2e");
            Intrinsics.checkNotNullParameter(e2e, "<set-?>");
            e0Var.f11204l = e2e;
            if (w10) {
                str = "fbconnect://chrome_os_success";
            } else {
                str = "fbconnect://success";
            }
            e0Var.f11199g = str;
            String authType = request.f11271j;
            Intrinsics.checkNotNullParameter(authType, "authType");
            Intrinsics.checkNotNullParameter(authType, "<set-?>");
            e0Var.f11205m = authType;
            q loginBehavior = request.f11264b;
            Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            e0Var.f11200h = loginBehavior;
            b0 targetApp = request.f11275n;
            Intrinsics.checkNotNullParameter(targetApp, "targetApp");
            e0Var.f11201i = targetApp;
            e0Var.f11202j = request.f11276o;
            e0Var.f11203k = request.f11277p;
            e0Var.f11062d = f0Var;
            this.f11218f = e0Var.a();
            com.facebook.internal.n nVar = new com.facebook.internal.n();
            nVar.setRetainInstance(true);
            nVar.f11058b = this.f11218f;
            nVar.show(h10.getSupportFragmentManager(), "FacebookDialogFragment");
            return 1;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @Override // com.facebook.login.d0
    public final com.facebook.k q() {
        return this.f11221i;
    }

    @Override // com.facebook.login.a0, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, i10);
        dest.writeString(this.f11219g);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f11220h = "web_view";
        this.f11221i = com.facebook.k.WEB_VIEW;
        this.f11219g = source.readString();
    }
}
