package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f13654a;
    public static final ConcurrentLinkedQueue b;

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f13655c;

    /* renamed from: d, reason: collision with root package name */
    public static Long f13656d;

    /* renamed from: e, reason: collision with root package name */
    public static K2.b f13657e;

    static {
        G7.s.a(s.class).b();
        f13654a = new AtomicBoolean(false);
        b = new ConcurrentLinkedQueue();
        f13655c = new ConcurrentHashMap();
    }

    public static JSONObject a() {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        com.facebook.r rVar = com.facebook.r.f13801a;
        bundle.putString("sdk_version", "16.1.3");
        bundle.putString("fields", "gatekeepers");
        String str = com.facebook.C.f13380j;
        com.facebook.C w2 = R3.e.w(null, String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1)), null);
        w2.f13384d = bundle;
        JSONObject jSONObject = w2.c().f13408d;
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    public static final boolean b(String str, String str2, boolean z8) {
        HashMap hashMap;
        ConcurrentHashMap concurrentHashMap;
        G7.j.e(str, "name");
        ArrayList<K2.a> arrayList = null;
        c(null);
        ConcurrentHashMap concurrentHashMap2 = f13655c;
        if (!concurrentHashMap2.containsKey(str2)) {
            hashMap = new HashMap();
        } else {
            K2.b bVar = f13657e;
            if (bVar != null && (concurrentHashMap = (ConcurrentHashMap) bVar.f1645a.get(str2)) != null) {
                arrayList = new ArrayList(concurrentHashMap.size());
                Iterator it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((K2.a) ((Map.Entry) it.next()).getValue());
                }
            }
            if (arrayList != null) {
                hashMap = new HashMap();
                for (K2.a aVar : arrayList) {
                    hashMap.put(aVar.f1644a, Boolean.valueOf(aVar.b));
                }
            } else {
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject = (JSONObject) concurrentHashMap2.get(str2);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    G7.j.d(next, "key");
                    hashMap2.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
                }
                K2.b bVar2 = f13657e;
                if (bVar2 == null) {
                    bVar2 = new K2.b(0);
                }
                ArrayList arrayList2 = new ArrayList(hashMap2.size());
                for (Map.Entry entry : hashMap2.entrySet()) {
                    arrayList2.add(new K2.a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    K2.a aVar2 = (K2.a) it2.next();
                    concurrentHashMap3.put(aVar2.f1644a, aVar2);
                }
                bVar2.f1645a.put(str2, concurrentHashMap3);
                f13657e = bVar2;
                hashMap = hashMap2;
            }
        }
        if (hashMap.containsKey(str)) {
            Boolean bool = (Boolean) hashMap.get(str);
            if (bool == null) {
                return z8;
            }
            return bool.booleanValue();
        }
        return z8;
    }

    public static final synchronized void c(q qVar) {
        synchronized (s.class) {
            if (qVar != null) {
                try {
                    b.add(qVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            String b8 = com.facebook.r.b();
            Long l = f13656d;
            if (l != null && System.currentTimeMillis() - l.longValue() < 3600000 && f13655c.containsKey(b8)) {
                e();
                return;
            }
            Context a6 = com.facebook.r.a();
            String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{b8}, 1));
            JSONObject jSONObject = null;
            String string = a6.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format, null);
            if (!H.B(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException unused) {
                    com.facebook.r rVar = com.facebook.r.f13801a;
                }
                if (jSONObject != null) {
                    d(b8, jSONObject);
                }
            }
            Executor c9 = com.facebook.r.c();
            if (!f13654a.compareAndSet(false, true)) {
                return;
            }
            c9.execute(new G2.a(b8, a6, format));
        }
    }

    public static final synchronized JSONObject d(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject optJSONObject;
        synchronized (s.class) {
            try {
                jSONObject2 = (JSONObject) f13655c.get(str);
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                JSONArray optJSONArray = jSONObject.optJSONArray(DataSchemeDataSource.SCHEME_DATA);
                int i9 = 0;
                if (optJSONArray == null) {
                    optJSONObject = null;
                } else {
                    optJSONObject = optJSONArray.optJSONObject(0);
                }
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("gatekeepers");
                if (optJSONArray2 == null) {
                    optJSONArray2 = new JSONArray();
                }
                int length = optJSONArray2.length();
                if (length > 0) {
                    while (true) {
                        int i10 = i9 + 1;
                        try {
                            JSONObject jSONObject3 = optJSONArray2.getJSONObject(i9);
                            jSONObject2.put(jSONObject3.getString("key"), jSONObject3.getBoolean(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        } catch (JSONException unused) {
                            com.facebook.r rVar = com.facebook.r.f13801a;
                        }
                        if (i10 >= length) {
                            break;
                        }
                        i9 = i10;
                    }
                }
                f13655c.put(str, jSONObject2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject2;
    }

    public static void e() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = b;
            if (!concurrentLinkedQueue.isEmpty()) {
                q qVar = (q) concurrentLinkedQueue.poll();
                if (qVar != null) {
                    handler.post(new D3.b(qVar, 26));
                }
            } else {
                return;
            }
        }
    }
}
