package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.i4;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.AdError;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class h4 implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {

    /* renamed from: a */
    private final com.applovin.impl.sdk.j f24219a;

    /* renamed from: b */
    private final n4 f24220b;

    /* renamed from: c */
    private List f24221c;

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24222a;

        static {
            int[] iArr = new int[i4.a.values().length];
            f24222a = iArr;
            try {
                iArr[i4.a.UNIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24222a[i4.a.TERMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        private boolean f24223a;

        /* renamed from: b */
        private f4 f24224b;

        public b() {
        }

        public b(f4 f4Var) {
            this.f24224b = f4Var;
        }

        public f4 a() {
            return this.f24224b;
        }

        public boolean b() {
            return this.f24223a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.a((Object) this) || b() != bVar.b()) {
                return false;
            }
            f4 a2 = a();
            f4 a3 = bVar.a();
            return a2 != null ? a2.equals(a3) : a3 == null;
        }

        public int hashCode() {
            int i2 = b() ? 79 : 97;
            f4 a2 = a();
            return ((i2 + 59) * 59) + (a2 == null ? 43 : a2.hashCode());
        }

        public String toString() {
            return "ConsentFlowManager.FlowCompletionStatus(cmpPromptShown=" + b() + ", error=" + a() + ")";
        }

        public void a(f4 f4Var) {
            this.f24224b = f4Var;
        }

        public void a(boolean z2) {
            this.f24223a = z2;
        }

        public boolean a(Object obj) {
            return obj instanceof b;
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(b bVar);
    }

    public h4(com.applovin.impl.sdk.j jVar) {
        this.f24219a = jVar;
        this.f24220b = new n4(jVar);
    }

    public static i4 b(JSONObject jSONObject) {
        Boolean bool = JsonUtils.getBoolean(jSONObject, "consent_flow_enabled", Boolean.FALSE);
        String string = JsonUtils.getString(jSONObject, "consent_flow_debug_user_geography", "");
        String string2 = JsonUtils.getString(jSONObject, "consent_flow_terms_of_service", null);
        Uri parse = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        String string3 = JsonUtils.getString(jSONObject, "consent_flow_privacy_policy", null);
        return new i4(bool.booleanValue(), a(string), i4.a.UNIFIED, StringUtils.isValidString(string3) ? Uri.parse(string3) : null, parse);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "consent_flow_manager";
    }

    public Uri h() {
        return d().getPrivacyPolicyUri();
    }

    public Uri i() {
        return d().getTermsOfServiceUri();
    }

    public boolean j() {
        com.applovin.impl.sdk.j jVar = com.applovin.impl.sdk.j.f26635v0;
        if (!jVar.A0()) {
            return false;
        }
        h4 u2 = jVar.u();
        List list = u2.f24221c;
        return u2.f24220b.b() || (list != null && list.size() > 0);
    }

    public boolean k() {
        Map<String, String> extraParameters = this.f24219a.g0().getExtraParameters();
        return extraParameters.containsKey("consent_flow_enabled") ? Boolean.parseBoolean(extraParameters.get("consent_flow_enabled")) : d().isEnabled();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (i() == null || !appLovinCommunicatorMessage.getMessageData().getBoolean("include_tos")) {
            this.f24221c = o4.a(this.f24219a);
        } else {
            this.f24221c = o4.b(this.f24219a);
        }
        if (this.f24221c.size() == 0) {
            yp.a("No Consent Flow Available", (String) null, this.f24219a.n0());
        } else {
            b(this.f24219a.n0(), new is(this, 9));
        }
    }

    public static i4 a(JSONObject jSONObject) {
        Boolean bool = JsonUtils.getBoolean(jSONObject, "terms_flow_enabled", Boolean.FALSE);
        String string = JsonUtils.getString(jSONObject, "terms_flow_terms_of_service", null);
        Uri parse = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        String string2 = JsonUtils.getString(jSONObject, "terms_flow_privacy_policy", null);
        return new i4(bool.booleanValue(), AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN, i4.a.TERMS, StringUtils.isValidString(string2) ? Uri.parse(string2) : null, parse);
    }

    public JSONObject c() {
        i4 d = d();
        Uri privacyPolicyUri = d.getPrivacyPolicyUri();
        Uri termsOfServiceUri = d.getTermsOfServiceUri();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "enabled", String.valueOf(k()));
        JsonUtils.putString(jSONObject, "privacy_policy_url", privacyPolicyUri != null ? privacyPolicyUri.toString() : "");
        JsonUtils.putString(jSONObject, "terms_of_service_url", termsOfServiceUri != null ? termsOfServiceUri.toString() : "");
        return jSONObject;
    }

    public i4 d() {
        return (i4) this.f24219a.v();
    }

    public i4.a e() {
        return d().a();
    }

    public AppLovinSdkConfiguration.ConsentFlowUserGeography f() {
        return d().getDebugUserGeography();
    }

    public String g() {
        d();
        Object h2 = h();
        Object i2 = i();
        StringBuilder sb = new StringBuilder("\nConsent Flow Enabled - ");
        sb.append(k());
        sb.append("\nPrivacy Policy - ");
        if (h2 == null) {
            h2 = AdError.UNDEFINED_DOMAIN;
        }
        sb.append(h2);
        sb.append("\nTerms of Service - ");
        if (i2 == null) {
            i2 = AdError.UNDEFINED_DOMAIN;
        }
        sb.append(i2);
        return sb.toString();
    }

    public static i4 a(Context context) {
        if (context == null) {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "Failed to get default terms flow settings.");
            return new i4(false, AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN, i4.a.TERMS, null, null);
        }
        String a2 = yp.a(context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName()), context, (com.applovin.impl.sdk.j) null);
        JSONObject jsonObjectFromJsonString = StringUtils.isValidString(a2) ? JsonUtils.jsonObjectFromJsonString(a2, new JSONObject()) : new JSONObject();
        i4.a c2 = c(jsonObjectFromJsonString);
        int i2 = a.f24222a[c2.ordinal()];
        if (i2 == 1) {
            return b(JsonUtils.getJSONObject(jsonObjectFromJsonString, "consent_flow_settings", new JSONObject()));
        }
        if (i2 == 2) {
            return a(JsonUtils.getJSONObject(jsonObjectFromJsonString, "terms_flow_settings", new JSONObject()));
        }
        throw new IllegalStateException("Unknown consent flow type: " + c2);
    }

    private Uri b() {
        return Uri.parse((String) this.f24219a.a(this.f24219a.B0() ? sj.B6 : sj.A6));
    }

    private static i4.a c(JSONObject jSONObject) {
        return jSONObject.has("consent_flow_settings") ? i4.a.UNIFIED : i4.a.TERMS;
    }

    public void b(Activity activity, c cVar) {
        if (!k()) {
            cVar.a(new b(new f4(f4.d, "Failed to start consent flow. Please make sure that the consent flow is enabled.")));
            return;
        }
        List list = this.f24221c;
        if (list != null && list.size() != 0) {
            a(activity, new ks(this, 7, activity, cVar));
        } else {
            this.f24219a.b(uj.f27340o, Boolean.FALSE);
            cVar.a(new b(new f4(f4.f23811c, "User may not be eligible for flow.")));
        }
    }

    public static /* synthetic */ void b(Uri uri, DialogInterface dialogInterface, int i2) {
        throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uri.toString());
    }

    public void a() {
        if (k()) {
            if (d().a() == i4.a.UNIFIED) {
                this.f24219a.J();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f24219a.J().a("AppLovinSdk", "Generating Unified Consent Flow...");
                }
                this.f24221c = g4.c(this.f24219a);
            } else {
                this.f24219a.J();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f24219a.J().a("AppLovinSdk", "Generating Terms Flow...");
                }
                this.f24221c = g4.a(this.f24219a);
            }
        }
        if (yp.i(com.applovin.impl.sdk.j.l())) {
            AppLovinCommunicator.getInstance(com.applovin.impl.sdk.j.l()).subscribe(this, "start_sdk_consent_flow");
        }
    }

    public /* synthetic */ void a(Uri uri, DialogInterface dialogInterface, int i2) {
        tp.a(uri, com.applovin.impl.sdk.j.l(), this.f24219a);
        throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uri.toString());
    }

    public /* synthetic */ void a(Activity activity) {
        final Uri b2 = b();
        new AlertDialog.Builder(activity).setTitle("Missing Privacy Policy URL").setMessage("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL").setNeutralButton("Go To Documentation", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.xt
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                h4.this.a(b2, dialogInterface, i2);
            }
        }).setNegativeButton("DISMISS", new yt(b2, 0)).create().show();
    }

    public /* synthetic */ void a(c cVar, b bVar) {
        if (bVar.f24224b != null) {
            if (bVar.f24224b.a() != f4.e) {
                this.f24221c = null;
            }
        } else {
            this.f24219a.b(uj.f27340o, Boolean.FALSE);
            this.f24221c = null;
        }
        cVar.a(bVar);
    }

    public /* synthetic */ void a(Activity activity, c cVar) {
        this.f24219a.J();
        if (com.applovin.impl.sdk.n.a()) {
            this.f24219a.J().a("ConsentFlowManager", "Starting consent flow with states: " + this.f24221c);
        }
        if (!this.f24219a.t0()) {
            this.f24219a.b(uj.f27340o, Boolean.TRUE);
        }
        this.f24220b.a(this.f24221c, activity, new zs(1, this, cVar));
    }

    private void a(Activity activity, Runnable runnable) {
        if (d().getPrivacyPolicyUri() != null) {
            runnable.run();
        } else {
            AppLovinSdkUtils.runOnUiThread(new ms(16, this, activity));
        }
    }

    private static AppLovinSdkConfiguration.ConsentFlowUserGeography a(String str) {
        if ("gdpr".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
        }
        if ("other".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER;
        }
        return AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
    }

    public /* synthetic */ void a(b bVar) {
        AppLovinCommunicator.getInstance(com.applovin.impl.sdk.j.l()).getMessagingService().publish(new AppLovinCommunicatorMessage(new Bundle(), "sdk_consent_flow_finished", this));
    }
}
