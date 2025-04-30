package v4;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: v4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2852d {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f23612a = new HashMap();
    public final int b = 64;

    /* renamed from: c, reason: collision with root package name */
    public final int f23613c;

    public C2852d(int i9) {
        this.f23613c = i9;
    }

    public static String a(int i9, String str) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() > i9) {
                return trim.substring(0, i9);
            }
            return trim;
        }
        return str;
    }

    public final synchronized boolean b(String str) {
        boolean equals;
        String a6 = a(this.f23613c, "com.crashlytics.version-control-info");
        if (this.f23612a.size() >= this.b && !this.f23612a.containsKey(a6)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"com.crashlytics.version-control-info\" when adding custom keys. Maximum allowable: " + this.b, null);
            return false;
        }
        String a9 = a(this.f23613c, str);
        String str2 = (String) this.f23612a.get(a6);
        if (str2 == null) {
            if (a9 == null) {
                equals = true;
            } else {
                equals = false;
            }
        } else {
            equals = str2.equals(a9);
        }
        if (equals) {
            return false;
        }
        this.f23612a.put(a6, a9);
        return true;
    }

    public final synchronized void c(Map map) {
        String a6;
        try {
            int i9 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    String a9 = a(this.f23613c, str);
                    if (this.f23612a.size() >= this.b && !this.f23612a.containsKey(a9)) {
                        i9++;
                    }
                    String str2 = (String) entry.getValue();
                    HashMap hashMap = this.f23612a;
                    if (str2 == null) {
                        a6 = "";
                    } else {
                        a6 = a(this.f23613c, str2);
                    }
                    hashMap.put(a9, a6);
                } else {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
            }
            if (i9 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i9 + " entries when adding custom keys. Maximum allowable: " + this.b, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
