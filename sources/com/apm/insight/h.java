package com.apm.insight;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.MonitorCrash;
import com.apm.insight.l.l;
import com.apm.insight.l.v;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h {
    protected static MonitorCrash b;

    /* renamed from: c, reason: collision with root package name */
    protected static volatile ConcurrentHashMap<String, h> f5807c = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    protected MonitorCrash f5808a;

    private h(MonitorCrash monitorCrash) {
        this.f5808a = monitorCrash;
        com.apm.insight.entity.b.a(this);
        com.apm.insight.j.b.d();
        com.apm.insight.k.k.e();
    }

    public static h a(String str) {
        return f5807c.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f5808a.mConfig.mPackageName == null) {
                Context g9 = i.g();
                PackageInfo packageInfo = g9.getPackageManager().getPackageInfo(g9.getPackageName(), 128);
                if (packageInfo != null) {
                    MonitorCrash.Config config = this.f5808a.mConfig;
                    if (config.mVersionInt == -1) {
                        config.mVersionInt = packageInfo.versionCode;
                    }
                    if (config.mVersionStr == null) {
                        config.mVersionStr = packageInfo.versionName;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(this.f5808a.mConfig.mDeviceId) || "0".equals(this.f5808a.mConfig.mDeviceId)) {
            this.f5808a.mConfig.mDeviceId = i.c().a();
        }
        try {
            jSONObject.put("aid", String.valueOf(this.f5808a.mConfig.mAid));
            jSONObject.put("update_version_code", this.f5808a.mConfig.mVersionInt);
            jSONObject.put("version_code", this.f5808a.mConfig.mVersionInt);
            jSONObject.put("app_version", this.f5808a.mConfig.mVersionStr);
            jSONObject.put("channel", this.f5808a.mConfig.mChannel);
            jSONObject.put("package", l.a(this.f5808a.mConfig.mPackageName));
            jSONObject.put("device_id", this.f5808a.mConfig.mDeviceId);
            jSONObject.put("user_id", this.f5808a.mConfig.mUID);
            jSONObject.put("ssid", this.f5808a.mConfig.mSSID);
            jSONObject.put("os", "Android");
            jSONObject.put("so_list", l.a(this.f5808a.mConfig.mSoList));
            jSONObject.put("thread_list", l.a(this.f5808a.mConfig.mThreadList));
            jSONObject.put("single_upload", d() ? 1 : 0);
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    public String b() {
        return this.f5808a.mConfig.mAid;
    }

    public JSONObject c() {
        return e();
    }

    public boolean d() {
        return false;
    }

    public static Object a() {
        return b;
    }

    @Nullable
    private JSONObject b(CrashType crashType) {
        Map<? extends String, ? extends String> userData;
        AttachUserData attachUserData = this.f5808a.mCustomData;
        if (attachUserData == null || (userData = attachUserData.getUserData(crashType)) == null) {
            return null;
        }
        return new JSONObject(userData);
    }

    @NonNull
    private JSONObject c(CrashType crashType) {
        return new JSONObject(this.f5808a.mTagMap);
    }

    @Nullable
    public JSONArray a(StackTraceElement[] stackTraceElementArr, Throwable th) {
        return a(stackTraceElementArr, th, null);
    }

    @Nullable
    public JSONArray a(StackTraceElement[] stackTraceElementArr, Throwable th, String str) {
        String[] strArr = this.f5808a.mConfig.mPackageName;
        if (strArr == null) {
            return new JSONArray().put(new v.a(0, stackTraceElementArr.length).a());
        }
        if (th == null || stackTraceElementArr == null) {
            return null;
        }
        JSONArray a6 = v.a(stackTraceElementArr, strArr);
        if (str != null && this.f5808a.mConfig.mThreadList != null && l.a(a6)) {
            for (String str2 : this.f5808a.mConfig.mThreadList) {
                if (TextUtils.equals(str2, str)) {
                    a6.put(new v.a(0, stackTraceElementArr.length).a());
                }
            }
        }
        return a6;
    }

    public JSONArray a(String[] strArr) {
        return this.f5808a.config().mPackageName == null ? new JSONArray().put(new v.a(0, strArr.length).a()) : v.a(strArr, this.f5808a.mConfig.mPackageName);
    }

    public JSONObject a(CrashType crashType) {
        return a(crashType, (JSONArray) null);
    }

    public JSONObject a(CrashType crashType, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("header", e());
            if (crashType != null) {
                jSONObject.put("custom", b(crashType));
                jSONObject.put("filters", c(crashType));
            }
            jSONObject.put("line_num", jSONArray);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static void a(Context context, final MonitorCrash monitorCrash) {
        b = monitorCrash;
        h hVar = new h(monitorCrash);
        final com.apm.insight.runtime.d a6 = i.a();
        Npth.init(context, new ICommonParams() { // from class: com.apm.insight.h.1
            @Override // com.apm.insight.ICommonParams
            public Map<String, Object> getCommonParams() {
                return l.b(h.this.e());
            }

            @Override // com.apm.insight.ICommonParams
            public String getDeviceId() {
                return TextUtils.isEmpty(monitorCrash.mConfig.mDeviceId) ? a6.d() : monitorCrash.mConfig.mDeviceId;
            }

            @Override // com.apm.insight.ICommonParams
            public List<String> getPatchInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public Map<String, Integer> getPluginInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public String getSessionId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public long getUserId() {
                return 0L;
            }
        });
    }

    public static void a(MonitorCrash monitorCrash) {
        h hVar = new h(monitorCrash);
        if (monitorCrash == null || monitorCrash.mConfig == null) {
            return;
        }
        f5807c.put(monitorCrash.mConfig.mAid, hVar);
    }

    public boolean a(Object obj) {
        return this.f5808a == obj;
    }

    public boolean a(String str, String str2) {
        if (this.f5808a.config().mPackageName == null) {
            return true;
        }
        return com.apm.insight.entity.b.a(str, l.a(this.f5808a.mConfig.mSoList), str2, l.a(this.f5808a.mConfig.mThreadList));
    }
}
