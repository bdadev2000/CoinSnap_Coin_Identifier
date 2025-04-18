package lb;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d {
    public final HashMap a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final int f21303b = 64;

    /* renamed from: c, reason: collision with root package name */
    public final int f21304c;

    public d(int i10) {
        this.f21304c = i10;
    }

    public static String a(int i10, String str) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() > i10) {
                return trim.substring(0, i10);
            }
            return trim;
        }
        return str;
    }

    public final synchronized boolean b(String str) {
        boolean equals;
        String a = a(this.f21304c, "com.crashlytics.version-control-info");
        if (this.a.size() >= this.f21303b && !this.a.containsKey(a)) {
            b6.a.f2288f.i("Ignored entry \"com.crashlytics.version-control-info\" when adding custom keys. Maximum allowable: " + this.f21303b, null);
            return false;
        }
        String a10 = a(this.f21304c, str);
        String str2 = (String) this.a.get(a);
        if (str2 == null) {
            if (a10 == null) {
                equals = true;
            } else {
                equals = false;
            }
        } else {
            equals = str2.equals(a10);
        }
        if (equals) {
            return false;
        }
        this.a.put(a, a10);
        return true;
    }

    public final synchronized void c(Map map) {
        String a;
        int i10 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String a10 = a(this.f21304c, str);
                if (this.a.size() >= this.f21303b && !this.a.containsKey(a10)) {
                    i10++;
                }
                String str2 = (String) entry.getValue();
                HashMap hashMap = this.a;
                if (str2 == null) {
                    a = "";
                } else {
                    a = a(this.f21304c, str2);
                }
                hashMap.put(a10, a);
            } else {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
        }
        if (i10 > 0) {
            b6.a.f2288f.i("Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f21303b, null);
        }
    }
}
