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
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private final l4 f4602b;

    /* renamed from: c, reason: collision with root package name */
    private List f4603c;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g4.a.values().length];
            a = iArr;
            try {
                iArr[g4.a.UNIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[g4.a.TERMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        private boolean a;

        /* renamed from: b, reason: collision with root package name */
        private d4 f4604b;

        public b() {
        }

        public b(d4 d4Var) {
            this.f4604b = d4Var;
        }

        public boolean b() {
            return this.a;
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
            d4 a = a();
            d4 a10 = bVar.a();
            return a != null ? a.equals(a10) : a10 == null;
        }

        public int hashCode() {
            int i10 = b() ? 79 : 97;
            d4 a = a();
            return ((i10 + 59) * 59) + (a == null ? 43 : a.hashCode());
        }

        public String toString() {
            return "ConsentFlowManager.FlowCompletionStatus(cmpPromptShown=" + b() + ", error=" + a() + ")";
        }

        public boolean a(Object obj) {
            return obj instanceof b;
        }

        public d4 a() {
            return this.f4604b;
        }

        public void a(boolean z10) {
            this.a = z10;
        }

        public void a(d4 d4Var) {
            this.f4604b = d4Var;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(b bVar);
    }

    public f4(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.f4602b = new l4(kVar);
    }

    public String g() {
        d();
        Object h10 = h();
        Object i10 = i();
        StringBuilder sb2 = new StringBuilder("\nConsent Flow Enabled - ");
        sb2.append(k());
        sb2.append("\nPrivacy Policy - ");
        if (h10 == null) {
            h10 = AdError.UNDEFINED_DOMAIN;
        }
        sb2.append(h10);
        sb2.append("\nTerms of Service - ");
        if (i10 == null) {
            i10 = AdError.UNDEFINED_DOMAIN;
        }
        sb2.append(i10);
        return sb2.toString();
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
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.A0;
        if (!kVar.D0()) {
            return false;
        }
        f4 t5 = kVar.t();
        List list = t5.f4603c;
        if (!t5.f4602b.b() && (list == null || list.size() <= 0)) {
            return false;
        }
        return true;
    }

    public boolean k() {
        Map<String, String> extraParameters = this.a.g0().getExtraParameters();
        if (extraParameters.containsKey("consent_flow_enabled")) {
            return Boolean.parseBoolean(extraParameters.get("consent_flow_enabled"));
        }
        return d().isEnabled();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (i() != null && appLovinCommunicatorMessage.getMessageData().getBoolean("include_tos")) {
            this.f4603c = m4.b(this.a);
        } else {
            this.f4603c = m4.a(this.a);
        }
        if (this.f4603c.size() == 0) {
            zp.a("No Consent Flow Available", (String) null, this.a.p0());
        } else {
            b(this.a.p0(), new js(this, 8));
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
        g4 d10 = d();
        Uri privacyPolicyUri = d10.getPrivacyPolicyUri();
        Uri termsOfServiceUri = d10.getTermsOfServiceUri();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "enabled", String.valueOf(k()));
        JsonUtils.putString(jSONObject, "privacy_policy_url", privacyPolicyUri != null ? privacyPolicyUri.toString() : "");
        JsonUtils.putString(jSONObject, "terms_of_service_url", termsOfServiceUri != null ? termsOfServiceUri.toString() : "");
        return jSONObject;
    }

    public g4 d() {
        return (g4) this.a.u();
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
        String a10 = zp.a(context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName()), context, (com.applovin.impl.sdk.k) null);
        JSONObject jsonObjectFromJsonString = StringUtils.isValidString(a10) ? JsonUtils.jsonObjectFromJsonString(a10, new JSONObject()) : new JSONObject();
        g4.a c10 = c(jsonObjectFromJsonString);
        int i10 = a.a[c10.ordinal()];
        if (i10 == 1) {
            return b(JsonUtils.getJSONObject(jsonObjectFromJsonString, "consent_flow_settings", new JSONObject()));
        }
        if (i10 == 2) {
            return a(JsonUtils.getJSONObject(jsonObjectFromJsonString, "terms_flow_settings", new JSONObject()));
        }
        throw new IllegalStateException("Unknown consent flow type: " + c10);
    }

    private Uri b() {
        return Uri.parse((String) this.a.a(this.a.E0() ? oj.f6777v6 : oj.f6769u6));
    }

    private static g4.a c(JSONObject jSONObject) {
        return jSONObject.has("consent_flow_settings") ? g4.a.UNIFIED : g4.a.TERMS;
    }

    public void b(Activity activity, c cVar) {
        if (!k()) {
            cVar.a(new b(new d4(d4.f4200d, "Failed to start consent flow. Please make sure that the consent flow is enabled.")));
            return;
        }
        List list = this.f4603c;
        if (list != null && list.size() != 0) {
            a(activity, new yv(5, this, activity, cVar));
        } else {
            this.a.b(qj.f7234o, Boolean.FALSE);
            cVar.a(new b(new d4(d4.f4199c, "User may not be eligible for flow.")));
        }
    }

    public void a() {
        if (k()) {
            if (d().a() == g4.a.UNIFIED) {
                this.a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.a.L().a("AppLovinSdk", "Generating Unified Consent Flow...");
                }
                this.f4603c = e4.c(this.a);
            } else {
                this.a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.a.L().a("AppLovinSdk", "Generating Terms Flow...");
                }
                this.f4603c = e4.a(this.a);
            }
        }
        if (zp.i(com.applovin.impl.sdk.k.k())) {
            AppLovinCommunicator.getInstance(com.applovin.impl.sdk.k.k()).subscribe(this, "start_sdk_consent_flow");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Uri uri, DialogInterface dialogInterface, int i10) {
        throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uri.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Uri uri, DialogInterface dialogInterface, int i10) {
        up.a(uri, com.applovin.impl.sdk.k.k(), this.a);
        throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uri.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        final Uri b3 = b();
        new AlertDialog.Builder(activity).setTitle("Missing Privacy Policy URL").setMessage("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL").setNeutralButton("Go To Documentation", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.qt
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                f4.this.a(b3, dialogInterface, i10);
            }
        }).setNegativeButton("DISMISS", new rt(b3, 0)).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c cVar, b bVar) {
        if (bVar.f4604b != null) {
            if (bVar.f4604b.a() != d4.f4201e) {
                this.f4603c = null;
            }
        } else {
            this.a.b(qj.f7234o, Boolean.FALSE);
            this.f4603c = null;
        }
        cVar.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, c cVar) {
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.a.L().a("ConsentFlowManager", "Starting consent flow with states: " + this.f4603c);
        }
        if (!this.a.w0()) {
            this.a.b(qj.f7234o, Boolean.TRUE);
        }
        this.f4602b.a(this.f4603c, activity, new os(1, this, cVar));
    }

    private void a(Activity activity, Runnable runnable) {
        if (d().getPrivacyPolicyUri() != null) {
            runnable.run();
        } else {
            AppLovinSdkUtils.runOnUiThread(new rs(16, this, activity));
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        AppLovinCommunicator.getInstance(com.applovin.impl.sdk.k.k()).getMessagingService().publish(new AppLovinCommunicatorMessage(new Bundle(), "sdk_consent_flow_finished", this));
    }
}
