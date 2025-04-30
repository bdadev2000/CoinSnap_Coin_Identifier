package com.facebook.login;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import c.C0578b;
import com.facebook.CustomTabMainActivity;
import com.facebook.EnumC1828f;
import com.facebook.internal.AbstractC1839h;
import com.facebook.internal.H;
import com.google.android.gms.common.Scopes;
import com.mbridge.msdk.MBridgeConstans;
import java.math.BigInteger;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;
import u.C2744m;

/* renamed from: com.facebook.login.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1851b extends B {
    public static final Parcelable.Creator<C1851b> CREATOR = new com.facebook.y(2);
    public static boolean l;

    /* renamed from: g, reason: collision with root package name */
    public String f13694g;

    /* renamed from: h, reason: collision with root package name */
    public final String f13695h;

    /* renamed from: i, reason: collision with root package name */
    public final String f13696i;

    /* renamed from: j, reason: collision with root package name */
    public final String f13697j;

    /* renamed from: k, reason: collision with root package name */
    public final EnumC1828f f13698k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1851b(Parcel parcel) {
        super(parcel, 1);
        G7.j.e(parcel, "source");
        this.f13697j = "custom_tab";
        this.f13698k = EnumC1828f.CHROME_CUSTOM_TAB;
        this.f13695h = parcel.readString();
        this.f13696i = AbstractC1839h.e(super.g());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.z
    public final String f() {
        return this.f13697j;
    }

    @Override // com.facebook.login.z
    public final String g() {
        return this.f13696i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fd  */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.facebook.l, java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r8v11, types: [com.facebook.l, java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r8v12, types: [com.facebook.l, java.lang.RuntimeException] */
    @Override // com.facebook.login.B, com.facebook.login.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(int r7, int r8, android.content.Intent r9) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.C1851b.i(int, int, android.content.Intent):boolean");
    }

    @Override // com.facebook.login.z
    public final void k(JSONObject jSONObject) {
        jSONObject.put("7_challenge", this.f13695h);
    }

    @Override // com.facebook.login.z
    public final int l(q qVar) {
        String name;
        String str;
        Uri a6;
        String str2 = this.f13696i;
        G7.j.e(qVar, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
        t e4 = e();
        if (str2.length() == 0) {
            return 0;
        }
        Bundle n2 = n(qVar);
        n2.putString("redirect_uri", str2);
        boolean d2 = qVar.d();
        String str3 = qVar.f13746f;
        if (d2) {
            n2.putString(MBridgeConstans.APP_ID, str3);
        } else {
            n2.putString("client_id", str3);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        G7.j.d(jSONObject2, "e2e.toString()");
        n2.putString("e2e", jSONObject2);
        if (qVar.d()) {
            n2.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (qVar.f13744c.contains(Scopes.OPEN_ID)) {
                n2.putString("nonce", qVar.f13755q);
            }
            n2.putString("response_type", "id_token,token,signed_request,graph_domain");
        }
        n2.putString("code_challenge", qVar.f13757s);
        EnumC1850a enumC1850a = qVar.f13758t;
        if (enumC1850a == null) {
            name = null;
        } else {
            name = enumC1850a.name();
        }
        n2.putString("code_challenge_method", name);
        n2.putString("return_scopes", "true");
        n2.putString("auth_type", qVar.f13750j);
        n2.putString("login_behavior", qVar.b.name());
        com.facebook.r rVar = com.facebook.r.f13801a;
        n2.putString("sdk", G7.j.j("16.1.3", "android-"));
        n2.putString("sso", "chrome_custom_tab");
        String str4 = "0";
        if (com.facebook.r.l) {
            str = "1";
        } else {
            str = "0";
        }
        n2.putString("cct_prefetching", str);
        boolean z8 = qVar.f13753o;
        A a9 = qVar.f13752n;
        if (z8) {
            n2.putString("fx_app", a9.b);
        }
        if (qVar.f13754p) {
            n2.putString("skip_dedupe", "true");
        }
        String str5 = qVar.l;
        if (str5 != null) {
            n2.putString("messenger_page_id", str5);
            if (qVar.m) {
                str4 = "1";
            }
            n2.putString("reset_messenger_state", str4);
        }
        if (l) {
            n2.putString("cct_over_app_switch", "1");
        }
        if (com.facebook.r.l) {
            if (qVar.d()) {
                C2744m c2744m = AbstractC1852c.f13699c;
                if ("oauth".equals("oauth")) {
                    a6 = H.a(H.q(), "oauth/authorize", n2);
                } else {
                    a6 = H.a(H.q(), com.facebook.r.d() + "/dialog/oauth", n2);
                }
                ReentrantLock reentrantLock = AbstractC1852c.f13700d;
                reentrantLock.lock();
                reentrantLock.unlock();
                reentrantLock.lock();
                C2744m c2744m2 = AbstractC1852c.f13699c;
                if (c2744m2 != null) {
                    Bundle bundle = new Bundle();
                    PendingIntent pendingIntent = c2744m2.f23056e;
                    if (pendingIntent != null) {
                        bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                    }
                    try {
                        ((C0578b) c2744m2.b).c(c2744m2.f23054c, a6, bundle, null);
                    } catch (RemoteException unused2) {
                    }
                }
                reentrantLock.unlock();
            } else {
                C2744m c2744m3 = AbstractC1852c.f13699c;
                Uri a10 = H.a(H.o(), com.facebook.r.d() + "/dialog/oauth", n2);
                ReentrantLock reentrantLock2 = AbstractC1852c.f13700d;
                reentrantLock2.lock();
                reentrantLock2.unlock();
                reentrantLock2.lock();
                C2744m c2744m4 = AbstractC1852c.f13699c;
                if (c2744m4 != null) {
                    Bundle bundle2 = new Bundle();
                    PendingIntent pendingIntent2 = c2744m4.f23056e;
                    if (pendingIntent2 != null) {
                        bundle2.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent2);
                    }
                    try {
                        ((C0578b) c2744m4.b).c(c2744m4.f23054c, a10, bundle2, null);
                    } catch (RemoteException unused3) {
                    }
                }
                reentrantLock2.unlock();
            }
        }
        FragmentActivity f9 = e4.f();
        if (f9 == null) {
            return 0;
        }
        Intent intent = new Intent(f9, (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f13392d, "oauth");
        intent.putExtra(CustomTabMainActivity.f13393f, n2);
        String str6 = CustomTabMainActivity.f13394g;
        String str7 = this.f13694g;
        if (str7 == null) {
            str7 = AbstractC1839h.c();
            this.f13694g = str7;
        }
        intent.putExtra(str6, str7);
        intent.putExtra(CustomTabMainActivity.f13396i, a9.b);
        Fragment fragment = e4.f13771d;
        if (fragment != null) {
            fragment.startActivityForResult(intent, 1);
        }
        return 1;
    }

    @Override // com.facebook.login.B
    public final EnumC1828f o() {
        return this.f13698k;
    }

    @Override // com.facebook.login.z, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        G7.j.e(parcel, "dest");
        super.writeToParcel(parcel, i9);
        parcel.writeString(this.f13695h);
    }

    public C1851b(t tVar) {
        this.f13788c = tVar;
        this.f13697j = "custom_tab";
        this.f13698k = EnumC1828f.CHROME_CUSTOM_TAB;
        String bigInteger = new BigInteger(100, new Random()).toString(32);
        G7.j.d(bigInteger, "BigInteger(length * 5, r).toString(32)");
        this.f13695h = bigInteger;
        l = false;
        this.f13696i = AbstractC1839h.e(super.g());
    }
}
