package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.C1849l;
import com.facebook.F;
import com.facebook.G;
import com.facebook.N;
import com.facebook.internal.H;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import u7.AbstractC2829t;

/* loaded from: classes.dex */
public abstract class z implements Parcelable {
    public HashMap b;

    /* renamed from: c, reason: collision with root package name */
    public t f13788c;

    public z(Parcel parcel) {
        HashMap hashMap;
        G7.j.e(parcel, "source");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            if (readInt > 0) {
                int i9 = 0;
                do {
                    i9++;
                    hashMap.put(parcel.readString(), parcel.readString());
                } while (i9 < readInt);
            }
        }
        this.b = hashMap != null ? AbstractC2829t.d0(hashMap) : null;
    }

    public final void a(String str, String str2) {
        String obj;
        if (this.b == null) {
            this.b = new HashMap();
        }
        HashMap hashMap = this.b;
        if (hashMap != null) {
            if (str2 == null) {
                obj = null;
            } else {
                obj = str2.toString();
            }
        }
    }

    public void c() {
    }

    public final String d(String str) {
        G7.j.e(str, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", f());
            k(jSONObject);
        } catch (JSONException e4) {
            Log.w("LoginMethodHandler", G7.j.j(e4.getMessage(), "Error creating client state json: "));
        }
        String jSONObject2 = jSONObject.toString();
        G7.j.d(jSONObject2, "param.toString()");
        return jSONObject2;
    }

    public final t e() {
        t tVar = this.f13788c;
        if (tVar != null) {
            return tVar;
        }
        G7.j.k("loginClient");
        throw null;
    }

    public abstract String f();

    public String g() {
        return "fb" + com.facebook.r.b() + "://authorize/";
    }

    public final void h(String str) {
        String str2;
        q qVar = e().f13775i;
        if (qVar == null) {
            str2 = null;
        } else {
            str2 = qVar.f13746f;
        }
        if (str2 == null) {
            str2 = com.facebook.r.b();
        }
        com.facebook.appevents.l lVar = new com.facebook.appevents.l(e().f(), str2);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString(MBridgeConstans.APP_ID, str2);
        com.facebook.r rVar = com.facebook.r.f13801a;
        if (N.b()) {
            lVar.f(bundle, "fb_dialogs_web_login_dialog_complete");
        }
    }

    public boolean i(int i9, int i10, Intent intent) {
        return false;
    }

    public final void j(q qVar, Bundle bundle) {
        com.facebook.C w2;
        G7.j.e(qVar, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
        String string = bundle.getString("code");
        if (!H.B(string)) {
            String str = null;
            if (string == null) {
                w2 = null;
            } else {
                String g9 = g();
                String str2 = qVar.f13756r;
                if (str2 == null) {
                    str2 = "";
                }
                G g10 = G.b;
                G7.j.e(g9, "redirectUri");
                Bundle bundle2 = new Bundle();
                bundle2.putString("code", string);
                bundle2.putString("client_id", com.facebook.r.b());
                bundle2.putString("redirect_uri", g9);
                bundle2.putString("code_verifier", str2);
                String str3 = com.facebook.C.f13380j;
                w2 = R3.e.w(null, "oauth/access_token", null);
                w2.f13388h = g10;
                w2.f13384d = bundle2;
            }
            if (w2 != null) {
                F c9 = w2.c();
                com.facebook.p pVar = c9.f13407c;
                if (pVar == null) {
                    try {
                        JSONObject jSONObject = c9.b;
                        if (jSONObject != null) {
                            str = jSONObject.getString("access_token");
                        }
                        if (jSONObject != null && !H.B(str)) {
                            bundle.putString("access_token", str);
                            if (jSONObject.has("id_token")) {
                                bundle.putString("id_token", jSONObject.getString("id_token"));
                                return;
                            }
                            return;
                        }
                        throw new C1849l("No access token found from result");
                    } catch (JSONException e4) {
                        throw new C1849l(G7.j.j(e4.getMessage(), "Fail to process code exchange response: "));
                    }
                }
                throw new com.facebook.t(pVar, pVar.c());
            }
            throw new C1849l("Failed to create code exchange request");
        }
        throw new C1849l("No code param found from the request");
    }

    public void k(JSONObject jSONObject) {
    }

    public abstract int l(q qVar);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        G7.j.e(parcel, "dest");
        HashMap hashMap = this.b;
        if (hashMap == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }
}
