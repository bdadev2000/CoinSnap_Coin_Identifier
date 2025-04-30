package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import com.facebook.internal.H;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import x2.C2918c;

/* loaded from: classes.dex */
public final class t {
    public static SharedPreferences b;

    /* renamed from: a, reason: collision with root package name */
    public static final t f13517a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f13518c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f13519d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f13520e = new ConcurrentHashMap();

    public final HashMap a() {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            CopyOnWriteArraySet copyOnWriteArraySet = C2918c.f24219d;
            HashSet hashSet = new HashSet();
            Iterator it = C2918c.a().iterator();
            while (it.hasNext()) {
                hashSet.add(((C2918c) it.next()).c());
            }
            ConcurrentHashMap concurrentHashMap = f13520e;
            for (String str : concurrentHashMap.keySet()) {
                if (hashSet.contains(str)) {
                    hashMap.put(str, concurrentHashMap.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }

    public final synchronized void b() {
        if (O2.a.b(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f13518c;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.facebook.r.a());
            G7.j.d(defaultSharedPreferences, "getDefaultSharedPreferences(FacebookSdk.getApplicationContext())");
            b = defaultSharedPreferences;
            String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
            if (string == null) {
                string = "";
            }
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences != null) {
                String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
                if (string2 == null) {
                    string2 = "";
                }
                f13519d.putAll(H.E(string));
                f13520e.putAll(H.E(string2));
                atomicBoolean.set(true);
                return;
            }
            G7.j.k("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }

    public final String c(String str, String str2) {
        String str3;
        int i9;
        boolean z8;
        if (O2.a.b(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z9 = false;
            while (i10 <= length) {
                if (!z9) {
                    i9 = i10;
                } else {
                    i9 = length;
                }
                if (G7.j.f(str2.charAt(i9), 32) <= 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z9) {
                    if (!z8) {
                        z9 = true;
                    } else {
                        i10++;
                    }
                } else {
                    if (!z8) {
                        break;
                    }
                    length--;
                }
            }
            String obj = str2.subSequence(i10, length + 1).toString();
            if (obj != null) {
                String lowerCase = obj.toLowerCase();
                G7.j.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                if ("em".equals(str)) {
                    if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                        Log.e("t", "Setting email failure: this is not a valid email address");
                        return "";
                    }
                    return lowerCase;
                }
                if ("ph".equals(str)) {
                    Pattern compile = Pattern.compile("[^0-9]");
                    G7.j.d(compile, "compile(...)");
                    String replaceAll = compile.matcher(lowerCase).replaceAll("");
                    G7.j.d(replaceAll, "replaceAll(...)");
                    return replaceAll;
                }
                if ("ge".equals(str)) {
                    if (lowerCase.length() <= 0) {
                        str3 = "";
                    } else {
                        str3 = lowerCase.substring(0, 1);
                        G7.j.d(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    if (!"f".equals(str3) && !"m".equals(str3)) {
                        Log.e("t", "Setting gender failure: the supported value for gender is f or m");
                        return "";
                    }
                    return str3;
                }
                return lowerCase;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }
}
