package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.internal.m0;
import com.facebook.k0;
import com.facebook.l0;
import com.facebook.u0;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class a0 implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public Map f11179b;

    /* renamed from: c, reason: collision with root package name */
    public u f11180c;

    public a0(u loginClient) {
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        Intrinsics.checkNotNullParameter(loginClient, "<set-?>");
        this.f11180c = loginClient;
    }

    public final void a(String str, String str2) {
        String obj;
        if (this.f11179b == null) {
            this.f11179b = new HashMap();
        }
        Map map = this.f11179b;
        if (map != null) {
            if (str == null) {
                obj = null;
            } else {
                obj = str.toString();
            }
        }
    }

    public void c() {
    }

    public final String e(String authId) {
        Intrinsics.checkNotNullParameter(authId, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", authId);
            jSONObject.put("3_method", h());
            m(jSONObject);
        } catch (JSONException e2) {
            Log.w("LoginMethodHandler", Intrinsics.stringPlus("Error creating client state json: ", e2.getMessage()));
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "param.toString()");
        return jSONObject2;
    }

    public final u f() {
        u uVar = this.f11180c;
        if (uVar != null) {
            return uVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loginClient");
        throw null;
    }

    public abstract String h();

    public String i() {
        return "fb" + com.facebook.x.b() + "://authorize/";
    }

    public final void j(String str) {
        String str2;
        r rVar = f().f11301i;
        if (rVar == null) {
            str2 = null;
        } else {
            str2 = rVar.f11267f;
        }
        if (str2 == null) {
            str2 = com.facebook.x.b();
        }
        com.facebook.appevents.r rVar2 = new com.facebook.appevents.r(f().h(), str2);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString(MBridgeConstans.APP_ID, str2);
        com.facebook.x xVar = com.facebook.x.a;
        if (u0.b()) {
            rVar2.a.f("fb_dialogs_web_login_dialog_complete", bundle);
        }
    }

    public boolean k(int i10, int i11, Intent intent) {
        return false;
    }

    public final void l(Bundle values, r request) {
        com.facebook.g0 y4;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(values, "values");
        String authorizationCode = values.getString("code");
        if (!m0.z(authorizationCode)) {
            String str = null;
            if (authorizationCode == null) {
                y4 = null;
            } else {
                String redirectUri = i();
                String codeVerifier = request.f11279r;
                if (codeVerifier == null) {
                    codeVerifier = "";
                }
                Intrinsics.checkNotNullParameter(authorizationCode, "authorizationCode");
                Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
                Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
                Bundle bundle = new Bundle();
                bundle.putString("code", authorizationCode);
                bundle.putString("client_id", com.facebook.x.b());
                bundle.putString("redirect_uri", redirectUri);
                bundle.putString("code_verifier", codeVerifier);
                String str2 = com.facebook.g0.f11000j;
                y4 = com.facebook.c.y(null, "oauth/access_token", null);
                y4.k(l0.GET);
                Intrinsics.checkNotNullParameter(bundle, "<set-?>");
                y4.f11006d = bundle;
            }
            if (y4 != null) {
                k0 c10 = y4.c();
                com.facebook.u uVar = c10.f11168c;
                if (uVar == null) {
                    try {
                        JSONObject jSONObject = c10.f11167b;
                        if (jSONObject != null) {
                            str = jSONObject.getString("access_token");
                        }
                        if (jSONObject != null && !m0.z(str)) {
                            values.putString("access_token", str);
                            if (jSONObject.has("id_token")) {
                                values.putString("id_token", jSONObject.getString("id_token"));
                                return;
                            }
                            return;
                        }
                        throw new com.facebook.q("No access token found from result");
                    } catch (JSONException e2) {
                        throw new com.facebook.q(Intrinsics.stringPlus("Fail to process code exchange response: ", e2.getMessage()));
                    }
                }
                throw new com.facebook.z(uVar, uVar.c());
            }
            throw new com.facebook.q("Failed to create code exchange request");
        }
        throw new com.facebook.q("No code param found from the request");
    }

    public void m(JSONObject param) {
        Intrinsics.checkNotNullParameter(param, "param");
    }

    public abstract int n(r rVar);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Map map = this.f11179b;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public a0(Parcel parcel) {
        HashMap hashMap;
        Intrinsics.checkNotNullParameter(parcel, "source");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            if (readInt > 0) {
                int i10 = 0;
                do {
                    i10++;
                    hashMap.put(parcel.readString(), parcel.readString());
                } while (i10 < readInt);
            }
        }
        this.f11179b = hashMap != null ? MapsKt.toMutableMap(hashMap) : null;
    }
}
