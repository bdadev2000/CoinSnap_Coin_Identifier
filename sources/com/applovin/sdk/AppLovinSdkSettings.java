package com.applovin.sdk;

import a4.j;
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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinSdkSettings extends AppLovinSdkSettingsBase {
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9585b;

    /* renamed from: g, reason: collision with root package name */
    private String f9590g;

    /* renamed from: h, reason: collision with root package name */
    private String f9591h;

    /* renamed from: l, reason: collision with root package name */
    private k f9595l;

    /* renamed from: m, reason: collision with root package name */
    private String f9596m;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9589f = true;
    private final Map<String, Object> localSettings = new HashMap();
    private final Map<String, String> metaData = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private List f9592i = Collections.emptyList();

    /* renamed from: j, reason: collision with root package name */
    private List f9593j = Collections.emptyList();

    /* renamed from: k, reason: collision with root package name */
    private final Map f9594k = j.r();

    /* renamed from: c, reason: collision with root package name */
    private boolean f9586c = true;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9587d = true;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9588e = true;

    public AppLovinSdkSettings(Context context) {
        this.f9596m = "";
        if (context == null) {
            t.h("AppLovinSdkSettings", "context cannot be null. Please provide a valid context.");
        }
        Context d10 = zp.d(context);
        this.a = zp.k(d10);
        this.backingConsentFlowSettings = f4.a(d10);
        this.f9596m = d10.getPackageName();
        a(d10);
    }

    private void a(Context context) {
        JSONObject jSONObject;
        int identifier = context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName());
        if (identifier == 0) {
            return;
        }
        String a = zp.a(identifier, context, (k) null);
        if (StringUtils.isValidString(a)) {
            jSONObject = JsonUtils.jsonObjectFromJsonString(a, new JSONObject());
        } else {
            jSONObject = new JSONObject();
        }
        this.f9594k.putAll(JsonUtils.tryToStringMap(jSONObject));
    }

    public void attachAppLovinSdk(k kVar) {
        this.f9595l = kVar;
        if (StringUtils.isValidString(this.f9590g)) {
            kVar.n0().a(Arrays.asList(this.f9590g.split(",")));
            this.f9590g = null;
        }
        if (this.f9591h != null) {
            kVar.L();
            if (t.a()) {
                kVar.L().a("AppLovinSdkSettings", "Setting user id: " + this.f9591h);
            }
            kVar.t0().a(this.f9591h);
            this.f9591h = null;
        }
    }

    public Map<String, String> getExtraParameters() {
        Map<String, String> map;
        synchronized (this.f9594k) {
            map = CollectionUtils.map(this.f9594k);
        }
        return map;
    }

    @Deprecated
    public List<String> getInitializationAdUnitIds() {
        return this.f9593j;
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
        return this.f9592i;
    }

    @Nullable
    public String getUserIdentifier() {
        k kVar = this.f9595l;
        if (kVar == null) {
            return this.f9591h;
        }
        return kVar.t0().c();
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f9586c;
    }

    @Deprecated
    public boolean isExceptionHandlerEnabled() {
        return this.f9587d;
    }

    public boolean isLocationCollectionEnabled() {
        return this.f9588e;
    }

    public boolean isMuted() {
        return this.f9585b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.a;
    }

    public void setCreativeDebuggerEnabled(boolean z10) {
        t.e("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z10 + ")");
        if (this.f9586c == z10) {
            return;
        }
        this.f9586c = z10;
        k kVar = this.f9595l;
        if (kVar == null) {
            return;
        }
        if (z10) {
            kVar.v().l();
        } else {
            kVar.v().k();
        }
    }

    @Deprecated
    public void setExceptionHandlerEnabled(boolean z10) {
        t.e("AppLovinSdkSettings", "setExceptionHandlerEnabled(exceptionHandlerEnabled=" + z10 + ")");
        this.f9587d = z10;
    }

    public void setExtraParameter(String str, @Nullable String str2) {
        String str3;
        t.e("AppLovinSdkSettings", j.h("setExtraParameter(key=", str, ", value=", str2, ")"));
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
            if (this.f9595l != null) {
                if (StringUtils.isValidString(str3)) {
                    this.f9595l.n0().a(Arrays.asList(str3.split(",")));
                } else {
                    this.f9595l.n0().a((String) null);
                }
            } else {
                this.f9590g = str3;
            }
        } else if (!"fan".equals(str) && !"esc".equals(str)) {
            if ("disable_all_logs".equals(str)) {
                t.a(Boolean.parseBoolean(str3));
            }
        } else if (!this.f9596m.startsWith("com.unity.")) {
            return;
        }
        this.f9594k.put(str, str3);
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
            this.f9593j = arrayList;
            return;
        }
        this.f9593j = Collections.emptyList();
    }

    public void setLocationCollectionEnabled(boolean z10) {
        t.e("AppLovinSdkSettings", "setLocationCollectionEnabled(locationCollectionEnabled=" + z10 + ")");
        this.f9588e = z10;
    }

    public void setMuted(boolean z10) {
        t.e("AppLovinSdkSettings", "setMuted(muted=" + z10 + ")");
        this.f9585b = z10;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z10) {
        t.e("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z10 + ")");
        this.f9589f = z10;
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
            this.f9592i = arrayList;
            return;
        }
        this.f9592i = Collections.emptyList();
    }

    public void setUserIdentifier(String str) {
        t.e("AppLovinSdkSettings", "setUserIdentifier(userIdentifier=" + str + ")");
        if (StringUtils.isValidString(str) && str.length() > zp.b(8)) {
            t.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + zp.b(8) + " maximum)");
        }
        k kVar = this.f9595l;
        if (kVar != null) {
            kVar.L();
            if (t.a()) {
                j.v("Setting user id: ", str, this.f9595l.L(), "AppLovinSdkSettings");
            }
            this.f9595l.t0().a(str);
            return;
        }
        this.f9591h = str;
    }

    public void setVerboseLogging(boolean z10) {
        t.e("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z10 + ")");
        if (zp.k()) {
            t.h("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
            if (zp.k(null) != z10) {
                t.h("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
                return;
            }
            return;
        }
        this.a = z10;
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f9589f;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AppLovinSdkSettings{isVerboseLoggingEnabled=");
        sb2.append(this.a);
        sb2.append(", muted=");
        sb2.append(this.f9585b);
        sb2.append(", testDeviceAdvertisingIds=");
        sb2.append(this.f9592i.toString());
        sb2.append(", initializationAdUnitIds=");
        sb2.append(this.f9593j.toString());
        sb2.append(", creativeDebuggerEnabled=");
        sb2.append(this.f9586c);
        sb2.append(", exceptionHandlerEnabled=");
        sb2.append(this.f9587d);
        sb2.append(", locationCollectionEnabled=");
        return j.l(sb2, this.f9588e, AbstractJsonLexerKt.END_OBJ);
    }
}
