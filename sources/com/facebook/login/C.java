package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.EnumC1828f;
import com.facebook.internal.AbstractC1839h;
import com.facebook.internal.C1841j;
import com.facebook.internal.H;
import com.facebook.internal.O;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class C extends B {
    public static final Parcelable.Creator<C> CREATOR = new com.facebook.y(11);

    /* renamed from: g, reason: collision with root package name */
    public O f13690g;

    /* renamed from: h, reason: collision with root package name */
    public String f13691h;

    /* renamed from: i, reason: collision with root package name */
    public final String f13692i;

    /* renamed from: j, reason: collision with root package name */
    public final EnumC1828f f13693j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Parcel parcel) {
        super(parcel, 1);
        G7.j.e(parcel, "source");
        this.f13692i = "web_view";
        this.f13693j = EnumC1828f.WEB_VIEW;
        this.f13691h = parcel.readString();
    }

    @Override // com.facebook.login.z
    public final void c() {
        O o3 = this.f13690g;
        if (o3 != null) {
            if (o3 != null) {
                o3.cancel();
            }
            this.f13690g = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.z
    public final String f() {
        return this.f13692i;
    }

    @Override // com.facebook.login.z
    public final int l(q qVar) {
        String str;
        String str2;
        G7.j.e(qVar, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
        Bundle n2 = n(qVar);
        E1.d dVar = new E1.d(23, this, qVar);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        G7.j.d(jSONObject2, "e2e.toString()");
        this.f13691h = jSONObject2;
        a("e2e", jSONObject2);
        FragmentActivity f9 = e().f();
        if (f9 == null) {
            return 0;
        }
        boolean y4 = H.y(f9);
        String str3 = qVar.f13746f;
        G7.j.e(str3, "applicationId");
        AbstractC1839h.j(str3, "applicationId");
        String str4 = this.f13691h;
        if (str4 != null) {
            if (y4) {
                str = "fbconnect://chrome_os_success";
            } else {
                str = "fbconnect://success";
            }
            String str5 = qVar.f13750j;
            G7.j.e(str5, "authType");
            p pVar = qVar.b;
            G7.j.e(pVar, "loginBehavior");
            A a6 = qVar.f13752n;
            G7.j.e(a6, "targetApp");
            boolean z8 = qVar.f13753o;
            boolean z9 = qVar.f13754p;
            n2.putString("redirect_uri", str);
            n2.putString("client_id", str3);
            n2.putString("e2e", str4);
            if (a6 == A.INSTAGRAM) {
                str2 = "token,signed_request,graph_domain,granted_scopes";
            } else {
                str2 = "token,signed_request,graph_domain";
            }
            n2.putString("response_type", str2);
            n2.putString("return_scopes", "true");
            n2.putString("auth_type", str5);
            n2.putString("login_behavior", pVar.name());
            if (z8) {
                n2.putString("fx_app", a6.b);
            }
            if (z9) {
                n2.putString("skip_dedupe", "true");
            }
            int i9 = O.f13594o;
            O.b(f9);
            this.f13690g = new O(f9, "oauth", n2, a6, dVar);
            C1841j c1841j = new C1841j();
            c1841j.setRetainInstance(true);
            c1841j.b = this.f13690g;
            c1841j.show(f9.getSupportFragmentManager(), "FacebookDialogFragment");
            return 1;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @Override // com.facebook.login.B
    public final EnumC1828f o() {
        return this.f13693j;
    }

    @Override // com.facebook.login.z, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        G7.j.e(parcel, "dest");
        super.writeToParcel(parcel, i9);
        parcel.writeString(this.f13691h);
    }

    public C(t tVar) {
        this.f13788c = tVar;
        this.f13692i = "web_view";
        this.f13693j = EnumC1828f.WEB_VIEW;
    }
}
