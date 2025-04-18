package com.applovin.sdk;

import android.content.Context;
import android.support.v4.media.d;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.adview.t;
import com.applovin.impl.h4;
import com.applovin.impl.i4;
import com.applovin.impl.sdk.AppLovinSdkSettingsBase;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.yp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AppLovinSdkSettings extends AppLovinSdkSettingsBase {

    /* renamed from: a, reason: collision with root package name */
    private boolean f28486a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f28487b;

    /* renamed from: f, reason: collision with root package name */
    private String f28489f;

    /* renamed from: g, reason: collision with root package name */
    private String f28490g;

    /* renamed from: k, reason: collision with root package name */
    private j f28494k;

    /* renamed from: l, reason: collision with root package name */
    private String f28495l;
    private boolean e = true;
    private final Map<String, Object> localSettings = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private List f28491h = Collections.emptyList();

    /* renamed from: i, reason: collision with root package name */
    private List f28492i = Collections.emptyList();

    /* renamed from: j, reason: collision with root package name */
    private final Map f28493j = Collections.synchronizedMap(new HashMap());

    /* renamed from: c, reason: collision with root package name */
    private boolean f28488c = true;
    private boolean d = true;

    public AppLovinSdkSettings(Context context) {
        this.f28495l = "";
        if (context == null) {
            n.h("AppLovinSdkSettings", "context cannot be null. Please provide a valid context.");
        }
        Context d = yp.d(context);
        this.f28486a = yp.k(d);
        this.backingConsentFlowSettings = h4.a(d);
        this.f28495l = d.getPackageName();
        a(d);
    }

    private void a(Context context) {
        int identifier = context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName());
        if (identifier == 0) {
            return;
        }
        String a2 = yp.a(identifier, context, (j) null);
        this.f28493j.putAll(JsonUtils.tryToStringMap(StringUtils.isValidString(a2) ? JsonUtils.jsonObjectFromJsonString(a2, new JSONObject()) : new JSONObject()));
    }

    public void attachAppLovinSdk(j jVar) {
        this.f28494k = jVar;
        if (StringUtils.isValidString(this.f28489f)) {
            jVar.l0().a(Arrays.asList(this.f28489f.split(",")));
            this.f28489f = null;
        }
        if (this.f28490g != null) {
            jVar.J();
            if (n.a()) {
                jVar.J().a("AppLovinSdkSettings", "Setting user id: " + this.f28490g);
            }
            jVar.q0().a(this.f28490g);
            this.f28490g = null;
        }
    }

    public Map<String, String> getExtraParameters() {
        Map<String, String> map;
        synchronized (this.f28493j) {
            map = CollectionUtils.map(this.f28493j);
        }
        return map;
    }

    @Deprecated
    public List<String> getInitializationAdUnitIds() {
        return this.f28492i;
    }

    public AppLovinTermsAndPrivacyPolicyFlowSettings getTermsAndPrivacyPolicyFlowSettings() {
        ((i4) this.backingConsentFlowSettings).a(i4.a.UNIFIED);
        return this.backingConsentFlowSettings;
    }

    @Deprecated
    public AppLovinTermsFlowSettings getTermsFlowSettings() {
        ((i4) this.backingConsentFlowSettings).a(i4.a.TERMS);
        return this.backingConsentFlowSettings;
    }

    @Deprecated
    public List<String> getTestDeviceAdvertisingIds() {
        return this.f28491h;
    }

    @Nullable
    public String getUserIdentifier() {
        j jVar = this.f28494k;
        return jVar == null ? this.f28490g : jVar.q0().c();
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f28488c;
    }

    @Deprecated
    public boolean isExceptionHandlerEnabled() {
        return this.d;
    }

    public boolean isMuted() {
        return this.f28487b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f28486a;
    }

    public void setCreativeDebuggerEnabled(boolean z2) {
        n.e("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z2 + ")");
        if (this.f28488c == z2) {
            return;
        }
        this.f28488c = z2;
        j jVar = this.f28494k;
        if (jVar == null) {
            return;
        }
        if (z2) {
            jVar.w().l();
        } else {
            jVar.w().k();
        }
    }

    @Deprecated
    public void setExceptionHandlerEnabled(boolean z2) {
        n.e("AppLovinSdkSettings", "setExceptionHandlerEnabled(exceptionHandlerEnabled=" + z2 + ")");
        this.d = z2;
    }

    public void setExtraParameter(String str, @Nullable String str2) {
        n.e("AppLovinSdkSettings", androidx.compose.foundation.text.input.a.m("setExtraParameter(key=", str, ", value=", str2, ")"));
        if (TextUtils.isEmpty(str)) {
            n.h("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        String trim = str2 != null ? str2.trim() : null;
        if ("test_mode_network".equalsIgnoreCase(str)) {
            if (this.f28494k == null) {
                this.f28489f = trim;
            } else if (StringUtils.isValidString(trim)) {
                this.f28494k.l0().a(Arrays.asList(trim.split(",")));
            } else {
                this.f28494k.l0().a((String) null);
            }
        } else if ("fan".equals(str) || "esc".equals(str)) {
            if (!this.f28495l.startsWith("com.unity.")) {
                return;
            }
        } else if ("disable_all_logs".equals(str)) {
            n.a(Boolean.parseBoolean(trim));
        }
        this.f28493j.put(str, trim);
    }

    @Deprecated
    public void setInitializationAdUnitIds(List<String> list) {
        n.e("AppLovinSdkSettings", "setInitializationAdUnitIds(initializationAdUnitIds=" + list + ")");
        if (list == null) {
            this.f28492i = Collections.emptyList();
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            if (StringUtils.isValidString(str) && str.length() > 0) {
                if (str.length() == 16) {
                    arrayList.add(str);
                } else {
                    n.h("AppLovinSdkSettings", "Unable to set initialization ad unit id (" + str + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                }
            }
        }
        this.f28492i = arrayList;
    }

    public void setMuted(boolean z2) {
        n.e("AppLovinSdkSettings", "setMuted(muted=" + z2 + ")");
        this.f28487b = z2;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z2) {
        n.e("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z2 + ")");
        this.e = z2;
    }

    @Deprecated
    public void setTestDeviceAdvertisingIds(List<String> list) {
        n.e("AppLovinSdkSettings", "setTestDeviceAdvertisingIds(testDeviceAdvertisingIds=" + list + ")");
        if (list == null) {
            this.f28491h = Collections.emptyList();
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            if (str == null || str.length() != 36) {
                n.h("AppLovinSdkSettings", "Unable to set test device advertising id (" + str + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
            } else {
                arrayList.add(str);
            }
        }
        this.f28491h = arrayList;
    }

    public void setUserIdentifier(String str) {
        n.e("AppLovinSdkSettings", "setUserIdentifier(userIdentifier=" + str + ")");
        if (StringUtils.isValidString(str) && str.length() > yp.b(8)) {
            n.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + yp.b(8) + " maximum)");
        }
        j jVar = this.f28494k;
        if (jVar == null) {
            this.f28490g = str;
            return;
        }
        jVar.J();
        if (n.a()) {
            t.v("Setting user id: ", str, this.f28494k.J(), "AppLovinSdkSettings");
        }
        this.f28494k.q0().a(str);
    }

    public void setVerboseLogging(boolean z2) {
        n.e("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z2 + ")");
        if (!yp.k()) {
            this.f28486a = z2;
            return;
        }
        n.h("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
        if (yp.k(null) != z2) {
            n.h("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
        }
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.e;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AppLovinSdkSettings{isVerboseLoggingEnabled=");
        sb.append(this.f28486a);
        sb.append(", muted=");
        sb.append(this.f28487b);
        sb.append(", testDeviceAdvertisingIds=");
        sb.append(this.f28491h.toString());
        sb.append(", initializationAdUnitIds=");
        sb.append(this.f28492i.toString());
        sb.append(", creativeDebuggerEnabled=");
        sb.append(this.f28488c);
        sb.append(", exceptionHandlerEnabled=");
        return d.s(sb, this.d, '}');
    }
}
