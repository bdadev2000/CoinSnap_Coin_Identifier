package com.facebook.internal;

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
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class w {
    public static final AtomicBoolean a;

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f11117b;

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f11118c;

    /* renamed from: d, reason: collision with root package name */
    public static Long f11119d;

    /* renamed from: e, reason: collision with root package name */
    public static f.a f11120e;

    static {
        Reflection.getOrCreateKotlinClass(w.class).getSimpleName();
        a = new AtomicBoolean(false);
        f11117b = new ConcurrentLinkedQueue();
        f11118c = new ConcurrentHashMap();
    }

    public static JSONObject a() {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        com.facebook.x xVar = com.facebook.x.a;
        bundle.putString("sdk_version", "16.1.3");
        bundle.putString("fields", "gatekeepers");
        String str = com.facebook.g0.f11000j;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        com.facebook.g0 y4 = com.facebook.c.y(null, format, null);
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        y4.f11006d = bundle;
        JSONObject jSONObject = y4.c().f11169d;
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    public static final boolean b(String name, String appId, boolean z10) {
        HashMap hashMap;
        Intrinsics.checkNotNullParameter(name, "name");
        ArrayList<i6.a> arrayList = null;
        c(null);
        ConcurrentHashMap concurrentHashMap = f11118c;
        if (!concurrentHashMap.containsKey(appId)) {
            hashMap = new HashMap();
        } else {
            f.a aVar = f11120e;
            if (aVar != null) {
                Intrinsics.checkNotNullParameter(appId, "appId");
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) ((ConcurrentHashMap) aVar.f17509c).get(appId);
                if (concurrentHashMap2 != null) {
                    arrayList = new ArrayList(concurrentHashMap2.size());
                    Iterator it = concurrentHashMap2.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add((i6.a) ((Map.Entry) it.next()).getValue());
                    }
                }
            }
            if (arrayList != null) {
                hashMap = new HashMap();
                for (i6.a aVar2 : arrayList) {
                    hashMap.put(aVar2.a, Boolean.valueOf(aVar2.f19155b));
                }
            } else {
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject = (JSONObject) concurrentHashMap.get(appId);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    hashMap2.put(key, Boolean.valueOf(jSONObject.optBoolean(key)));
                }
                f.a aVar3 = f11120e;
                if (aVar3 == null) {
                    aVar3 = new f.a(26);
                }
                ArrayList gateKeeperList = new ArrayList(hashMap2.size());
                for (Map.Entry entry : hashMap2.entrySet()) {
                    gateKeeperList.add(new i6.a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                Intrinsics.checkNotNullParameter(appId, "appId");
                Intrinsics.checkNotNullParameter(gateKeeperList, "gateKeeperList");
                ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
                Iterator it2 = gateKeeperList.iterator();
                while (it2.hasNext()) {
                    i6.a aVar4 = (i6.a) it2.next();
                    concurrentHashMap3.put(aVar4.a, aVar4);
                }
                ((ConcurrentHashMap) aVar3.f17509c).put(appId, concurrentHashMap3);
                f11120e = aVar3;
                hashMap = hashMap2;
            }
        }
        if (hashMap.containsKey(name)) {
            Boolean bool = (Boolean) hashMap.get(name);
            if (bool == null) {
                return z10;
            }
            return bool.booleanValue();
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[Catch: all -> 0x0087, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:37:0x0005, B:4:0x000a, B:9:0x002a, B:11:0x0032, B:15:0x0037, B:25:0x0061, B:28:0x006c, B:17:0x006f, B:21:0x007d, B:30:0x0068, B:33:0x0015), top: B:36:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized void c(com.facebook.internal.u r8) {
        /*
            java.lang.Class<com.facebook.internal.w> r0 = com.facebook.internal.w.class
            monitor-enter(r0)
            if (r8 == 0) goto La
            java.util.concurrent.ConcurrentLinkedQueue r1 = com.facebook.internal.w.f11117b     // Catch: java.lang.Throwable -> L87
            r1.add(r8)     // Catch: java.lang.Throwable -> L87
        La:
            java.lang.String r8 = com.facebook.x.b()     // Catch: java.lang.Throwable -> L87
            java.lang.Long r1 = com.facebook.internal.w.f11119d     // Catch: java.lang.Throwable -> L87
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L15
            goto L27
        L15:
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L87
            long r6 = r1.longValue()     // Catch: java.lang.Throwable -> L87
            long r4 = r4 - r6
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L27
            r1 = r2
            goto L28
        L27:
            r1 = r3
        L28:
            if (r1 == 0) goto L37
            java.util.concurrent.ConcurrentHashMap r1 = com.facebook.internal.w.f11118c     // Catch: java.lang.Throwable -> L87
            boolean r1 = r1.containsKey(r8)     // Catch: java.lang.Throwable -> L87
            if (r1 == 0) goto L37
            e()     // Catch: java.lang.Throwable -> L87
            monitor-exit(r0)
            return
        L37:
            android.content.Context r1 = com.facebook.x.a()     // Catch: java.lang.Throwable -> L87
            kotlin.jvm.internal.StringCompanionObject r4 = kotlin.jvm.internal.StringCompanionObject.INSTANCE     // Catch: java.lang.Throwable -> L87
            java.lang.String r4 = "com.facebook.internal.APP_GATEKEEPERS.%s"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L87
            r5[r3] = r8     // Catch: java.lang.Throwable -> L87
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r2)     // Catch: java.lang.Throwable -> L87
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch: java.lang.Throwable -> L87
            java.lang.String r5 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)     // Catch: java.lang.Throwable -> L87
            java.lang.String r5 = "com.facebook.internal.preferences.APP_GATEKEEPERS"
            android.content.SharedPreferences r5 = r1.getSharedPreferences(r5, r3)     // Catch: java.lang.Throwable -> L87
            r6 = 0
            java.lang.String r5 = r5.getString(r4, r6)     // Catch: java.lang.Throwable -> L87
            boolean r7 = com.facebook.internal.m0.z(r5)     // Catch: java.lang.Throwable -> L87
            if (r7 != 0) goto L6f
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: org.json.JSONException -> L68 java.lang.Throwable -> L87
            r7.<init>(r5)     // Catch: org.json.JSONException -> L68 java.lang.Throwable -> L87
            r6 = r7
            goto L6a
        L68:
            com.facebook.x r5 = com.facebook.x.a     // Catch: java.lang.Throwable -> L87
        L6a:
            if (r6 == 0) goto L6f
            d(r8, r6)     // Catch: java.lang.Throwable -> L87
        L6f:
            java.util.concurrent.Executor r5 = com.facebook.x.c()     // Catch: java.lang.Throwable -> L87
            java.util.concurrent.atomic.AtomicBoolean r6 = com.facebook.internal.w.a     // Catch: java.lang.Throwable -> L87
            boolean r2 = r6.compareAndSet(r3, r2)     // Catch: java.lang.Throwable -> L87
            if (r2 != 0) goto L7d
            monitor-exit(r0)
            return
        L7d:
            e6.a r2 = new e6.a     // Catch: java.lang.Throwable -> L87
            r2.<init>(r1, r8, r4)     // Catch: java.lang.Throwable -> L87
            r5.execute(r2)     // Catch: java.lang.Throwable -> L87
            monitor-exit(r0)
            return
        L87:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.w.c(com.facebook.internal.u):void");
    }

    public static final synchronized JSONObject d(String applicationId, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject optJSONObject;
        synchronized (w.class) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            jSONObject2 = (JSONObject) f11118c.get(applicationId);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            JSONArray optJSONArray = jSONObject.optJSONArray(DataSchemeDataSource.SCHEME_DATA);
            int i10 = 0;
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
                    int i11 = i10 + 1;
                    try {
                        JSONObject jSONObject3 = optJSONArray2.getJSONObject(i10);
                        jSONObject2.put(jSONObject3.getString("key"), jSONObject3.getBoolean(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                    } catch (JSONException unused) {
                        com.facebook.x xVar = com.facebook.x.a;
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            f11118c.put(applicationId, jSONObject2);
        }
        return jSONObject2;
    }

    public static void e() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = f11117b;
            if (!concurrentLinkedQueue.isEmpty()) {
                u uVar = (u) concurrentLinkedQueue.poll();
                if (uVar != null) {
                    handler.post(new androidx.activity.d(uVar, 23));
                }
            } else {
                return;
            }
        }
    }
}
