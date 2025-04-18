package com.safedk.android.utils;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.safedk.android.analytics.reporters.CrashReporter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f30071a = "sdk_key";

    /* renamed from: b, reason: collision with root package name */
    public static final String f30072b = "userUUID";

    /* renamed from: c, reason: collision with root package name */
    public static final String f30073c = "configuration";
    public static final String d = "last_reported_device_at";
    public static final String e = "last_reported_version";

    /* renamed from: f, reason: collision with root package name */
    public static final String f30074f = "configETag";

    /* renamed from: g, reason: collision with root package name */
    public static final String f30075g = "sdk_version";

    /* renamed from: h, reason: collision with root package name */
    public static final String f30076h = "versionCode";

    /* renamed from: i, reason: collision with root package name */
    public static final String f30077i = "randomToken";

    /* renamed from: j, reason: collision with root package name */
    public static final int f30078j = -1;

    /* renamed from: k, reason: collision with root package name */
    public static final String f30079k = "";

    /* renamed from: l, reason: collision with root package name */
    private static final String f30080l = "SharedPreferencesUtils";

    /* renamed from: m, reason: collision with root package name */
    private static final String f30081m = "offlineMode";

    /* renamed from: n, reason: collision with root package name */
    private static final String f30082n = "age";

    /* renamed from: o, reason: collision with root package name */
    private static final String f30083o = "region";

    /* renamed from: p, reason: collision with root package name */
    private static final String f30084p = "last_foreground_time";

    /* renamed from: q, reason: collision with root package name */
    private static final String f30085q = "last_foreground_report";

    /* renamed from: r, reason: collision with root package name */
    private static final String f30086r = "sdk_versions";

    /* renamed from: s, reason: collision with root package name */
    private static final String f30087s = "is_reported";
    private static final String w = "safedk_stored_version";
    private static final String x = "§§";

    /* renamed from: t, reason: collision with root package name */
    private final SharedPreferences f30088t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f30089u;

    /* renamed from: v, reason: collision with root package name */
    private JSONObject f30090v;

    public i(SharedPreferences sharedPreferences, boolean z2) {
        this.f30088t = sharedPreferences;
        this.f30089u = z2;
    }

    private void a(Map<String, String> map) {
        try {
            this.f30090v = new JSONObject(this.f30088t.getString(f30086r, JsonUtils.EMPTY_JSON));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(key);
                Logger.d(f30080l, "addDiscoveredVersionsToVersionsJson sdkPackage=" + key + ", version=" + value + ", uuid=" + sdkUUIDByPackage);
                if (sdkUUIDByPackage != null) {
                    try {
                    } catch (JSONException e2) {
                        Logger.d(f30080l, "error in addDiscoveredVersionsToVersionsJson", e2);
                    }
                    if (sdkUUIDByPackage.length() > 0 && value != null && value.length() > 0) {
                        this.f30090v.put(sdkUUIDByPackage, value);
                    }
                }
                Logger.d(f30080l, "UUID for sdkPackage " + key + "is empty and will not be added to sdkVersionsJson");
            }
            a(this.f30090v);
        } catch (Throwable th) {
            Logger.e(f30080l, "Exception in addDiscoveredVersionsToVersionsJson", th);
        }
    }

    private void a(JSONObject jSONObject) {
        SharedPreferences.Editor edit = this.f30088t.edit();
        edit.putString(f30086r, jSONObject.toString());
        Logger.d(f30080l, "saveSdkVersions saved (" + jSONObject.length() + " items) : " + jSONObject.toString());
        edit.commit();
    }

    public String a() {
        return this.f30088t.getString(f30072b, null);
    }

    public boolean b() {
        return this.f30088t.getBoolean(f30081m, this.f30089u);
    }

    public Integer c() {
        int i2 = this.f30088t.getInt(f30082n, -1);
        if (i2 < 0) {
            return null;
        }
        return new Integer(i2);
    }

    public String d() {
        return this.f30088t.getString(f30083o, null);
    }

    public Bundle e() {
        Logger.d(f30080l, "getConfiguration started");
        return a(this.f30088t, f30073c);
    }

    public long f() {
        return this.f30088t.getLong(d, 0L);
    }

    public int g() {
        return this.f30088t.getInt(e, 0);
    }

    public long h() {
        return this.f30088t.getLong(f30084p, 0L);
    }

    public long i() {
        return this.f30088t.getLong(f30085q, 0L);
    }

    public JSONObject j() {
        return this.f30090v;
    }

    public void a(long j2) {
        SharedPreferences.Editor edit = this.f30088t.edit();
        edit.putLong(f30084p, j2);
        edit.commit();
    }

    public String k() {
        return this.f30088t.getString(f30074f, null);
    }

    public boolean a(String str) {
        SharedPreferences.Editor edit = this.f30088t.edit();
        edit.putString(f30072b, str);
        return edit.commit();
    }

    public boolean l() {
        return this.f30088t.contains(f30073c);
    }

    public boolean a(Bundle bundle) {
        try {
            SharedPreferences.Editor edit = this.f30088t.edit();
            String p2 = p();
            String a2 = a();
            edit.clear();
            a(edit, f30073c, bundle);
            if (p2 != null) {
                edit.putString(w, p2);
            }
            if (a2 != null) {
                edit.putString(f30072b, a2);
            }
            return edit.commit();
        } catch (Throwable th) {
            Logger.e(f30080l, "Caught exception", th);
            new CrashReporter().caughtException(th);
            return false;
        }
    }

    public static void a(SharedPreferences.Editor editor, String str, Bundle bundle) {
        String str2 = str + x;
        for (String str3 : bundle.keySet()) {
            Object obj = bundle.get(str3);
            if (obj == null) {
                editor.remove(str2 + str3);
            } else if (obj instanceof Integer) {
                editor.putInt(str2 + str3, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                editor.putLong(str2 + str3, ((Long) obj).longValue());
            } else if (obj instanceof Boolean) {
                editor.putBoolean(str2 + str3, ((Boolean) obj).booleanValue());
            } else if (obj instanceof CharSequence) {
                editor.putString(str2 + str3, ((CharSequence) obj).toString());
            } else if ((obj instanceof ArrayList) && ((ArrayList) obj).size() > 0 && (((ArrayList) obj).get(0) instanceof String)) {
                editor.putStringSet(str2 + str3, new HashSet((ArrayList) obj));
            } else if (obj instanceof Bundle) {
                a(editor, str2 + str3, (Bundle) obj);
            }
        }
    }

    public static Bundle a(SharedPreferences sharedPreferences, String str) {
        Logger.d(f30080l, "loadPreferencesBundle started, key=" + str);
        Bundle bundle = new Bundle();
        Map<String, ?> all = sharedPreferences.getAll();
        String str2 = str + x;
        HashSet<String> hashSet = new HashSet();
        for (String str3 : all.keySet()) {
            if (str3.startsWith(str2)) {
                String b2 = b(str3, str2);
                if (!b2.contains(x)) {
                    Object obj = all.get(str3);
                    if (obj != null) {
                        if (obj instanceof Integer) {
                            bundle.putInt(b2, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(b2, ((Long) obj).longValue());
                        } else if (obj instanceof Boolean) {
                            bundle.putBoolean(b2, ((Boolean) obj).booleanValue());
                        } else if (obj instanceof CharSequence) {
                            bundle.putString(b2, ((CharSequence) obj).toString());
                        } else if (obj instanceof HashSet) {
                            bundle.putStringArrayList(b2, new ArrayList<>((HashSet) obj));
                        }
                    }
                } else {
                    hashSet.add(a(b2, x));
                }
            }
        }
        for (String str4 : hashSet) {
            bundle.putBundle(str4, a(sharedPreferences, str2 + str4));
        }
        return bundle;
    }

    public static String a(String str, String str2) {
        if (!b(str) && str2 != null) {
            if (str2.length() == 0) {
                return "";
            }
            int indexOf = str.indexOf(str2);
            return indexOf != -1 ? str.substring(0, indexOf) : str;
        }
        return str;
    }

    public static boolean b(String str) {
        return str == null || str.length() == 0;
    }

    public static String b(String str, String str2) {
        if (!b(str) && !b(str2) && str.startsWith(str2)) {
            return str.substring(str2.length());
        }
        return str;
    }

    public boolean a(int i2, String str, String str2) {
        try {
            SharedPreferences.Editor edit = this.f30088t.edit();
            edit.putInt(f30076h, i2);
            edit.putString(f30077i, str);
            edit.putString("sdk_key", str2);
            Logger.d(f30080l, "save sdk key " + str2 + ", token " + str + ", version code " + i2);
            return edit.commit();
        } catch (Throwable th) {
            Logger.d(f30080l, "Caught exception", th);
            new CrashReporter().caughtException(th);
            return false;
        }
    }

    public String m() {
        String string = this.f30088t.getString("sdk_key", null);
        Logger.d(f30080l, "read sdk key " + string);
        return string;
    }

    public int n() {
        int i2 = this.f30088t.getInt(f30076h, 0);
        Logger.d(f30080l, "read version code " + i2);
        return i2;
    }

    public String o() {
        String string = this.f30088t.getString(f30077i, null);
        Logger.d(f30080l, "read token " + string);
        return string;
    }

    public boolean c(String str) {
        SharedPreferences.Editor edit = this.f30088t.edit();
        edit.putString(w, str);
        return edit.commit();
    }

    public String p() {
        return this.f30088t.getString(w, null);
    }
}
