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
import com.applovin.impl.g4;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.AdError;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f4 implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {

    /* renamed from: a */
    private final com.applovin.impl.sdk.k f7554a;
    private final l4 b;

    /* renamed from: c */
    private List f7555c;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7556a;

        static {
            int[] iArr = new int[g4.a.values().length];
            f7556a = iArr;
            try {
                iArr[g4.a.UNIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7556a[g4.a.TERMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private boolean f7557a;
        private d4 b;

        public b() {
        }

        public boolean b() {
            return this.f7557a;
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
            d4 a6 = a();
            d4 a9 = bVar.a();
            if (a6 != null ? a6.equals(a9) : a9 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i9;
            int hashCode;
            if (b()) {
                i9 = 79;
            } else {
                i9 = 97;
            }
            d4 a6 = a();
            int i10 = (i9 + 59) * 59;
            if (a6 == null) {
                hashCode = 43;
            } else {
                hashCode = a6.hashCode();
            }
            return i10 + hashCode;
        }

        public String toString() {
            return "ConsentFlowManager.FlowCompletionStatus(cmpPromptShown=" + b() + ", error=" + a() + ")";
        }

        public b(d4 d4Var) {
            this.b = d4Var;
        }

        public boolean a(Object obj) {
            return obj instanceof b;
        }

        public d4 a() {
            return this.b;
        }

        public void a(boolean z8) {
            this.f7557a = z8;
        }

        public void a(d4 d4Var) {
            this.b = d4Var;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(b bVar);
    }

    public f4(com.applovin.impl.sdk.k kVar) {
        this.f7554a = kVar;
        this.b = new l4(kVar);
    }

    public String g() {
        d();
        Object h6 = h();
        Object i9 = i();
        StringBuilder sb = new StringBuilder("\nConsent Flow Enabled - ");
        sb.append(k());
        sb.append("\nPrivacy Policy - ");
        if (h6 == null) {
            h6 = AdError.UNDEFINED_DOMAIN;
        }
        sb.append(h6);
        sb.append("\nTerms of Service - ");
        if (i9 == null) {
            i9 = AdError.UNDEFINED_DOMAIN;
        }
        sb.append(i9);
        return sb.toString();
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
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.f10832A0;
        if (!kVar.D0()) {
            return false;
        }
        f4 t9 = kVar.t();
        List list = t9.f7555c;
        if (!t9.b.b() && (list == null || list.size() <= 0)) {
            return false;
        }
        return true;
    }

    public boolean k() {
        Map<String, String> extraParameters = this.f7554a.g0().getExtraParameters();
        if (extraParameters.containsKey("consent_flow_enabled")) {
            return Boolean.parseBoolean(extraParameters.get("consent_flow_enabled"));
        }
        return d().isEnabled();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (i() != null && appLovinCommunicatorMessage.getMessageData().getBoolean("include_tos")) {
            this.f7555c = m4.b(this.f7554a);
        } else {
            this.f7555c = m4.a(this.f7554a);
        }
        if (this.f7555c.size() == 0) {
            zp.a("No Consent Flow Available", (String) null, this.f7554a.p0());
        } else {
            b(this.f7554a.p0(), new C(this, 8));
        }
    }

    public static g4 a(JSONObject jSONObject) {
        Boolean bool = JsonUtils.getBoolean(jSONObject, "terms_flow_enabled", Boolean.FALSE);
        String string = JsonUtils.getString(jSONObject, "terms_flow_terms_of_service", null);
        Uri parse = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        String string2 = JsonUtils.getString(jSONObject, "terms_flow_privacy_policy", null);
        return new g4(bool.booleanValue(), AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN, g4.a.TERMS, StringUtils.isValidString(string2) ? Uri.parse(string2) : null, parse);
    }

    public static g4 b(JSONObject jSONObject) {
        Boolean bool = JsonUtils.getBoolean(jSONObject, "consent_flow_enabled", Boolean.FALSE);
        String string = JsonUtils.getString(jSONObject, "consent_flow_debug_user_geography", "");
        String string2 = JsonUtils.getString(jSONObject, "consent_flow_terms_of_service", null);
        Uri parse = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        String string3 = JsonUtils.getString(jSONObject, "consent_flow_privacy_policy", null);
        return new g4(bool.booleanValue(), a(string), g4.a.UNIFIED, StringUtils.isValidString(string3) ? Uri.parse(string3) : null, parse);
    }

    public JSONObject c() {
        g4 d2 = d();
        Uri privacyPolicyUri = d2.getPrivacyPolicyUri();
        Uri termsOfServiceUri = d2.getTermsOfServiceUri();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "enabled", String.valueOf(k()));
        String str = "";
        JsonUtils.putString(jSONObject, "privacy_policy_url", privacyPolicyUri != null ? privacyPolicyUri.toString() : "");
        if (termsOfServiceUri != null) {
            str = termsOfServiceUri.toString();
        }
        JsonUtils.putString(jSONObject, "terms_of_service_url", str);
        return jSONObject;
    }

    public g4 d() {
        return (g4) this.f7554a.u();
    }

    public g4.a e() {
        return d().a();
    }

    public AppLovinSdkConfiguration.ConsentFlowUserGeography f() {
        return d().getDebugUserGeography();
    }

    public static g4 a(Context context) {
        if (context == null) {
            com.applovin.impl.sdk.t.h("AppLovinSdk", "Failed to get default terms flow settings.");
            return new g4(false, AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN, g4.a.TERMS, null, null);
        }
        String a6 = zp.a(context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName()), context, (com.applovin.impl.sdk.k) null);
        JSONObject jsonObjectFromJsonString = StringUtils.isValidString(a6) ? JsonUtils.jsonObjectFromJsonString(a6, new JSONObject()) : new JSONObject();
        g4.a c9 = c(jsonObjectFromJsonString);
        int i9 = a.f7556a[c9.ordinal()];
        if (i9 == 1) {
            return b(JsonUtils.getJSONObject(jsonObjectFromJsonString, "consent_flow_settings", new JSONObject()));
        }
        if (i9 == 2) {
            return a(JsonUtils.getJSONObject(jsonObjectFromJsonString, "terms_flow_settings", new JSONObject()));
        }
        throw new IllegalStateException("Unknown consent flow type: " + c9);
    }

    private Uri b() {
        return Uri.parse((String) this.f7554a.a(this.f7554a.E0() ? oj.v6 : oj.f9865u6));
    }

    private static g4.a c(JSONObject jSONObject) {
        return jSONObject.has("consent_flow_settings") ? g4.a.UNIFIED : g4.a.TERMS;
    }

    public void b(Activity activity, c cVar) {
        if (!k()) {
            cVar.a(new b(new d4(d4.f7175d, "Failed to start consent flow. Please make sure that the consent flow is enabled.")));
            return;
        }
        List list = this.f7555c;
        if (list != null && list.size() != 0) {
            a(activity, new O2(this, activity, cVar, 5));
        } else {
            this.f7554a.b(qj.f10377o, Boolean.FALSE);
            cVar.a(new b(new d4(d4.f7174c, "User may not be eligible for flow.")));
        }
    }

    public void a() {
        if (k()) {
            if (d().a() == g4.a.UNIFIED) {
                this.f7554a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f7554a.L().a("AppLovinSdk", "Generating Unified Consent Flow...");
                }
                this.f7555c = e4.c(this.f7554a);
            } else {
                this.f7554a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f7554a.L().a("AppLovinSdk", "Generating Terms Flow...");
                }
                this.f7555c = e4.a(this.f7554a);
            }
        }
        if (zp.i(com.applovin.impl.sdk.k.k())) {
            AppLovinCommunicator.getInstance(com.applovin.impl.sdk.k.k()).subscribe(this, "start_sdk_consent_flow");
        }
    }

    public static /* synthetic */ void b(Uri uri, DialogInterface dialogInterface, int i9) {
        throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uri.toString());
    }

    public /* synthetic */ void a(Uri uri, DialogInterface dialogInterface, int i9) {
        up.a(uri, com.applovin.impl.sdk.k.k(), this.f7554a);
        throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uri.toString());
    }

    public /* synthetic */ void a(Activity activity) {
        final Uri b8 = b();
        new AlertDialog.Builder(activity).setTitle("Missing Privacy Policy URL").setMessage("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL").setNeutralButton("Go To Documentation", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.I0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                f4.this.a(b8, dialogInterface, i9);
            }
        }).setNegativeButton("DISMISS", new J0(b8, 0)).create().show();
    }

    public /* synthetic */ void a(c cVar, b bVar) {
        if (bVar.b != null) {
            if (bVar.b.a() != d4.f7176e) {
                this.f7555c = null;
            }
        } else {
            this.f7554a.b(qj.f10377o, Boolean.FALSE);
            this.f7555c = null;
        }
        cVar.a(bVar);
    }

    public /* synthetic */ void a(Activity activity, c cVar) {
        this.f7554a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f7554a.L().a("ConsentFlowManager", "Starting consent flow with states: " + this.f7555c);
        }
        if (!this.f7554a.w0()) {
            this.f7554a.b(qj.f10377o, Boolean.TRUE);
        }
        this.b.a(this.f7555c, activity, new B(1, this, cVar));
    }

    private void a(Activity activity, Runnable runnable) {
        if (d().getPrivacyPolicyUri() != null) {
            runnable.run();
        } else {
            AppLovinSdkUtils.runOnUiThread(new F(16, this, activity));
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
        AppLovinCommunicator.getInstance(com.applovin.impl.sdk.k.k()).getMessagingService().publish(new AppLovinCommunicatorMessage(new Bundle(), "sdk_consent_flow_finished", this));
    }
}
