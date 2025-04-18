package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import com.facebook.internal.m0;
import com.facebook.x;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static SharedPreferences f10979b;
    public static final w a = new w();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f10980c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f10981d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f10982e = new ConcurrentHashMap();

    public final HashMap a() {
        if (m6.a.b(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            CopyOnWriteArraySet copyOnWriteArraySet = v5.c.f26033d;
            HashSet hashSet = new HashSet();
            Iterator it = v5.c.a().iterator();
            while (it.hasNext()) {
                hashSet.add(((v5.c) it.next()).b());
            }
            ConcurrentHashMap concurrentHashMap = f10982e;
            for (String str : concurrentHashMap.keySet()) {
                if (hashSet.contains(str)) {
                    hashMap.put(str, concurrentHashMap.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }

    public final synchronized void b() {
        if (m6.a.b(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f10980c;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(x.a());
            Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(FacebookSdk.getApplicationContext())");
            f10979b = defaultSharedPreferences;
            if (defaultSharedPreferences != null) {
                String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
                if (string == null) {
                    string = "";
                }
                SharedPreferences sharedPreferences = f10979b;
                if (sharedPreferences != null) {
                    String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
                    if (string2 == null) {
                        string2 = "";
                    }
                    f10981d.putAll(m0.C(string));
                    f10982e.putAll(m0.C(string2));
                    atomicBoolean.set(true);
                    return;
                }
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            throw null;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }

    public final String c(String str, String str2) {
        boolean z10;
        String str3;
        int i10;
        boolean z11;
        if (m6.a.b(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i11 = 0;
            boolean z12 = false;
            while (i11 <= length) {
                if (!z12) {
                    i10 = i11;
                } else {
                    i10 = length;
                }
                if (Intrinsics.compare((int) str2.charAt(i10), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12) {
                    if (!z11) {
                        z12 = true;
                    } else {
                        i11++;
                    }
                } else {
                    if (!z11) {
                        break;
                    }
                    length--;
                }
            }
            String obj = str2.subSequence(i11, length + 1).toString();
            if (obj != null) {
                String lowerCase = obj.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                if (Intrinsics.areEqual("em", str)) {
                    if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                        Log.e("w", "Setting email failure: this is not a valid email address");
                        return "";
                    }
                    return lowerCase;
                }
                if (Intrinsics.areEqual("ph", str)) {
                    return new Regex("[^0-9]").replace(lowerCase, "");
                }
                if (Intrinsics.areEqual("ge", str)) {
                    if (lowerCase.length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        str3 = "";
                    } else if (lowerCase != null) {
                        str3 = lowerCase.substring(0, 1);
                        Intrinsics.checkNotNullExpressionValue(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    if (!Intrinsics.areEqual("f", str3) && !Intrinsics.areEqual("m", str3)) {
                        Log.e("w", "Setting gender failure: the supported value for gender is f or m");
                        return "";
                    }
                    return str3;
                }
                return lowerCase;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }
}
