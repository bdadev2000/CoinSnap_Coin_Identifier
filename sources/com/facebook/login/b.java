package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.CustomTabMainActivity;
import com.google.android.gms.common.Scopes;
import com.mbridge.msdk.MBridgeConstans;
import java.math.BigInteger;
import java.util.Random;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b extends d0 {

    @JvmField
    public static final Parcelable.Creator<b> CREATOR = new android.support.v4.media.a(27);

    /* renamed from: k, reason: collision with root package name */
    public static boolean f11181k;

    /* renamed from: f, reason: collision with root package name */
    public String f11182f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11183g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11184h;

    /* renamed from: i, reason: collision with root package name */
    public final String f11185i;

    /* renamed from: j, reason: collision with root package name */
    public final com.facebook.k f11186j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(u loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f11185i = "custom_tab";
        this.f11186j = com.facebook.k.CHROME_CUSTOM_TAB;
        String bigInteger = new BigInteger(100, new Random()).toString(32);
        Intrinsics.checkNotNullExpressionValue(bigInteger, "BigInteger(length * 5, r).toString(32)");
        this.f11183g = bigInteger;
        f11181k = false;
        this.f11184h = com.facebook.internal.i.y(super.i());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.a0
    public final String h() {
        return this.f11185i;
    }

    @Override // com.facebook.login.a0
    public final String i() {
        return this.f11184h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        if (r9 != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fd  */
    @Override // com.facebook.login.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(int r7, int r8, android.content.Intent r9) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.b.k(int, int, android.content.Intent):boolean");
    }

    @Override // com.facebook.login.a0
    public final void m(JSONObject param) {
        Intrinsics.checkNotNullParameter(param, "param");
        param.put("7_challenge", this.f11183g);
    }

    @Override // com.facebook.login.a0
    public final int n(r request) {
        boolean z10;
        boolean z11;
        boolean z12;
        String name;
        String str;
        boolean z13;
        Intrinsics.checkNotNullParameter(request, "request");
        u f10 = f();
        String str2 = this.f11184h;
        if (str2.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return 0;
        }
        Bundle parameters = o(request);
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(request, "request");
        parameters.putString("redirect_uri", str2);
        b0 b0Var = b0.INSTAGRAM;
        b0 b0Var2 = request.f11275n;
        if (b0Var2 == b0Var) {
            z11 = true;
        } else {
            z11 = false;
        }
        String str3 = request.f11267f;
        if (z11) {
            parameters.putString(MBridgeConstans.APP_ID, str3);
        } else {
            parameters.putString("client_id", str3);
        }
        parameters.putString("e2e", ni.a.r());
        if (b0Var2 == b0Var) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            parameters.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (request.f11265c.contains(Scopes.OPEN_ID)) {
                parameters.putString("nonce", request.f11278q);
            }
            parameters.putString("response_type", "id_token,token,signed_request,graph_domain");
        }
        parameters.putString("code_challenge", request.f11280s);
        a aVar = request.f11281t;
        if (aVar == null) {
            name = null;
        } else {
            name = aVar.name();
        }
        parameters.putString("code_challenge_method", name);
        parameters.putString("return_scopes", "true");
        parameters.putString("auth_type", request.f11271j);
        parameters.putString("login_behavior", request.f11264b.name());
        com.facebook.x xVar = com.facebook.x.a;
        parameters.putString("sdk", Intrinsics.stringPlus("android-", "16.1.3"));
        parameters.putString("sso", "chrome_custom_tab");
        String str4 = "0";
        if (com.facebook.x.f11432l) {
            str = "1";
        } else {
            str = "0";
        }
        parameters.putString("cct_prefetching", str);
        if (request.f11276o) {
            parameters.putString("fx_app", b0Var2.f11190b);
        }
        if (request.f11277p) {
            parameters.putString("skip_dedupe", "true");
        }
        String str5 = request.f11273l;
        if (str5 != null) {
            parameters.putString("messenger_page_id", str5);
            if (request.f11274m) {
                str4 = "1";
            }
            parameters.putString("reset_messenger_state", str4);
        }
        if (f11181k) {
            parameters.putString("cct_over_app_switch", "1");
        }
        if (com.facebook.x.f11432l) {
            if (b0Var2 == b0Var) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                o.s sVar = c.f11191c;
                com.facebook.internal.m.q(ni.a.s(parameters, "oauth"));
            } else {
                o.s sVar2 = c.f11191c;
                com.facebook.internal.m.q(com.facebook.c.u(parameters, "oauth"));
            }
        }
        FragmentActivity h10 = f10.h();
        if (h10 == null) {
            return 0;
        }
        Intent intent = new Intent(h10, (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f10870d, "oauth");
        intent.putExtra(CustomTabMainActivity.f10871f, parameters);
        String str6 = CustomTabMainActivity.f10872g;
        String str7 = this.f11182f;
        if (str7 == null) {
            str7 = com.facebook.internal.i.s();
            this.f11182f = str7;
        }
        intent.putExtra(str6, str7);
        intent.putExtra(CustomTabMainActivity.f10874i, b0Var2.f11190b);
        Fragment fragment = f10.f11297d;
        if (fragment != null) {
            fragment.startActivityForResult(intent, 1);
        }
        return 1;
    }

    @Override // com.facebook.login.d0
    public final com.facebook.k q() {
        return this.f11186j;
    }

    @Override // com.facebook.login.a0, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, i10);
        dest.writeString(this.f11183g);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f11185i = "custom_tab";
        this.f11186j = com.facebook.k.CHROME_CUSTOM_TAB;
        this.f11183g = source.readString();
        this.f11184h = com.facebook.internal.i.y(super.i());
    }
}
