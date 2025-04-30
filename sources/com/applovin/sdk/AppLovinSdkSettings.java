package com.applovin.sdk;

import Q7.n0;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.f4;
import com.applovin.impl.g4;
import com.applovin.impl.sdk.AppLovinSdkSettingsBase;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.zp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinSdkSettings extends AppLovinSdkSettingsBase {

    /* renamed from: a, reason: collision with root package name */
    private boolean f12769a;
    private boolean b;

    /* renamed from: g, reason: collision with root package name */
    private String f12774g;

    /* renamed from: h, reason: collision with root package name */
    private String f12775h;
    private k l;
    private String m;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12773f = true;
    private final Map<String, Object> localSettings = new HashMap();
    private final Map<String, String> metaData = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private List f12776i = Collections.emptyList();

    /* renamed from: j, reason: collision with root package name */
    private List f12777j = Collections.emptyList();

    /* renamed from: k, reason: collision with root package name */
    private final Map f12778k = n0.q();

    /* renamed from: c, reason: collision with root package name */
    private boolean f12770c = true;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12771d = true;

    /* renamed from: e, reason: collision with root package name */
    private boolean f12772e = true;

    public AppLovinSdkSettings(Context context) {
        this.m = "";
        if (context == null) {
            t.h("AppLovinSdkSettings", "context cannot be null. Please provide a valid context.");
        }
        Context d2 = zp.d(context);
        this.f12769a = zp.k(d2);
        this.backingConsentFlowSettings = f4.a(d2);
        this.m = d2.getPackageName();
        a(d2);
    }

    private void a(Context context) {
        JSONObject jSONObject;
        int identifier = context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName());
        if (identifier == 0) {
            return;
        }
        String a6 = zp.a(identifier, context, (k) null);
        if (StringUtils.isValidString(a6)) {
            jSONObject = JsonUtils.jsonObjectFromJsonString(a6, new JSONObject());
        } else {
            jSONObject = new JSONObject();
        }
        this.f12778k.putAll(JsonUtils.tryToStringMap(jSONObject));
    }

    public void attachAppLovinSdk(k kVar) {
        this.l = kVar;
        if (StringUtils.isValidString(this.f12774g)) {
            kVar.n0().a(Arrays.asList(this.f12774g.split(",")));
            this.f12774g = null;
        }
        if (this.f12775h != null) {
            kVar.L();
            if (t.a()) {
                kVar.L().a("AppLovinSdkSettings", "Setting user id: " + this.f12775h);
            }
            kVar.t0().a(this.f12775h);
            this.f12775h = null;
        }
    }

    public Map<String, String> getExtraParameters() {
        Map<String, String> map;
        synchronized (this.f12778k) {
            map = CollectionUtils.map(this.f12778k);
        }
        return map;
    }

    @Deprecated
    public List<String> getInitializationAdUnitIds() {
        return this.f12777j;
    }

    public AppLovinTermsAndPrivacyPolicyFlowSettings getTermsAndPrivacyPolicyFlowSettings() {
        ((g4) this.backingConsentFlowSettings).a(g4.a.UNIFIED);
        return this.backingConsentFlowSettings;
    }

    @Deprecated
    public AppLovinTermsFlowSettings getTermsFlowSettings() {
        ((g4) this.backingConsentFlowSettings).a(g4.a.TERMS);
        return this.backingConsentFlowSettings;
    }

    @Deprecated
    public List<String> getTestDeviceAdvertisingIds() {
        return this.f12776i;
    }

    @Nullable
    public String getUserIdentifier() {
        k kVar = this.l;
        if (kVar == null) {
            return this.f12775h;
        }
        return kVar.t0().c();
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f12770c;
    }

    @Deprecated
    public boolean isExceptionHandlerEnabled() {
        return this.f12771d;
    }

    public boolean isLocationCollectionEnabled() {
        return this.f12772e;
    }

    public boolean isMuted() {
        return this.b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f12769a;
    }

    public void setCreativeDebuggerEnabled(boolean z8) {
        t.e("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z8 + ")");
        if (this.f12770c == z8) {
            return;
        }
        this.f12770c = z8;
        k kVar = this.l;
        if (kVar == null) {
            return;
        }
        if (z8) {
            kVar.v().l();
        } else {
            kVar.v().k();
        }
    }

    @Deprecated
    public void setExceptionHandlerEnabled(boolean z8) {
        t.e("AppLovinSdkSettings", "setExceptionHandlerEnabled(exceptionHandlerEnabled=" + z8 + ")");
        this.f12771d = z8;
    }

    public void setExtraParameter(String str, @Nullable String str2) {
        String str3;
        t.e("AppLovinSdkSettings", n0.j("setExtraParameter(key=", str, ", value=", str2, ")"));
        if (TextUtils.isEmpty(str)) {
            t.h("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        if (str2 != null) {
            str3 = str2.trim();
        } else {
            str3 = null;
        }
        if ("test_mode_network".equalsIgnoreCase(str)) {
            if (this.l != null) {
                if (StringUtils.isValidString(str3)) {
                    this.l.n0().a(Arrays.asList(str3.split(",")));
                } else {
                    this.l.n0().a((String) null);
                }
            } else {
                this.f12774g = str3;
            }
        } else if (!"fan".equals(str) && !"esc".equals(str)) {
            if ("disable_all_logs".equals(str)) {
                t.a(Boolean.parseBoolean(str3));
            }
        } else if (!this.m.startsWith("com.unity.")) {
            return;
        }
        this.f12778k.put(str, str3);
    }

    @Deprecated
    public void setInitializationAdUnitIds(List<String> list) {
        t.e("AppLovinSdkSettings", "setInitializationAdUnitIds(initializationAdUnitIds=" + list + ")");
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (StringUtils.isValidString(str) && str.length() > 0) {
                    if (str.length() == 16) {
                        arrayList.add(str);
                    } else {
                        t.h("AppLovinSdkSettings", "Unable to set initialization ad unit id (" + str + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                    }
                }
            }
            this.f12777j = arrayList;
            return;
        }
        this.f12777j = Collections.emptyList();
    }

    public void setLocationCollectionEnabled(boolean z8) {
        t.e("AppLovinSdkSettings", "setLocationCollectionEnabled(locationCollectionEnabled=" + z8 + ")");
        this.f12772e = z8;
    }

    public void setMuted(boolean z8) {
        t.e("AppLovinSdkSettings", "setMuted(muted=" + z8 + ")");
        this.b = z8;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z8) {
        t.e("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z8 + ")");
        this.f12773f = z8;
    }

    @Deprecated
    public void setTestDeviceAdvertisingIds(List<String> list) {
        t.e("AppLovinSdkSettings", "setTestDeviceAdvertisingIds(testDeviceAdvertisingIds=" + list + ")");
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (str != null && str.length() == 36) {
                    arrayList.add(str);
                } else {
                    t.h("AppLovinSdkSettings", "Unable to set test device advertising id (" + str + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
                }
            }
            this.f12776i = arrayList;
            return;
        }
        this.f12776i = Collections.emptyList();
    }

    public void setUserIdentifier(String str) {
        t.e("AppLovinSdkSettings", "setUserIdentifier(userIdentifier=" + str + ")");
        if (StringUtils.isValidString(str) && str.length() > zp.b(8)) {
            t.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + zp.b(8) + " maximum)");
        }
        k kVar = this.l;
        if (kVar != null) {
            kVar.L();
            if (t.a()) {
                n0.s("Setting user id: ", str, this.l.L(), "AppLovinSdkSettings");
            }
            this.l.t0().a(str);
            return;
        }
        this.f12775h = str;
    }

    public void setVerboseLogging(boolean z8) {
        t.e("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z8 + ")");
        if (zp.k()) {
            t.h("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
            if (zp.k(null) != z8) {
                t.h("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
                return;
            }
            return;
        }
        this.f12769a = z8;
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f12773f;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AppLovinSdkSettings{isVerboseLoggingEnabled=");
        sb.append(this.f12769a);
        sb.append(", muted=");
        sb.append(this.b);
        sb.append(", testDeviceAdvertisingIds=");
        sb.append(this.f12776i.toString());
        sb.append(", initializationAdUnitIds=");
        sb.append(this.f12777j.toString());
        sb.append(", creativeDebuggerEnabled=");
        sb.append(this.f12770c);
        sb.append(", exceptionHandlerEnabled=");
        sb.append(this.f12771d);
        sb.append(", locationCollectionEnabled=");
        return n0.n(sb, this.f12772e, '}');
    }
}
