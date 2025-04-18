package com.facebook.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class z {
    public static final z a = new z();

    /* renamed from: b, reason: collision with root package name */
    public static final List f11140b = CollectionsKt.listOf((Object[]) new String[]{"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules"});

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f11141c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReference f11142d = new AtomicReference(y.NOT_LOADED);

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f11143e = new ConcurrentLinkedQueue();

    /* renamed from: f, reason: collision with root package name */
    public static boolean f11144f;

    public static JSONObject a() {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f11140b);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        String str = com.facebook.g0.f11000j;
        com.facebook.g0 y4 = com.facebook.c.y(null, MBridgeConstans.DYNAMIC_VIEW_WX_APP, null);
        y4.f11011i = true;
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        y4.f11006d = bundle;
        JSONObject jSONObject = y4.c().f11169d;
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    public static final x b(String str) {
        return (x) f11141c.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r2 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r5.compareAndSet(r3, r6) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r5.get() == r3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r2 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r2 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        r4.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        r2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        com.facebook.x.c().execute(new e6.a(r0, com.applovin.impl.mediation.ads.e.h(new java.lang.Object[]{r1}, 1, "com.facebook.internal.APP_SETTINGS.%s", "java.lang.String.format(format, *args)"), r1, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0049, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0057, code lost:
    
        r2 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c() {
        /*
            android.content.Context r0 = com.facebook.x.a()
            java.lang.String r1 = com.facebook.x.b()
            boolean r2 = com.facebook.internal.m0.z(r1)
            com.facebook.internal.y r3 = com.facebook.internal.y.ERROR
            com.facebook.internal.z r4 = com.facebook.internal.z.a
            java.util.concurrent.atomic.AtomicReference r5 = com.facebook.internal.z.f11142d
            if (r2 == 0) goto L1b
            r5.set(r3)
            r4.e()
            return
        L1b:
            java.util.concurrent.ConcurrentHashMap r2 = com.facebook.internal.z.f11141c
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L2c
            com.facebook.internal.y r0 = com.facebook.internal.y.SUCCESS
            r5.set(r0)
            r4.e()
            return
        L2c:
            com.facebook.internal.y r2 = com.facebook.internal.y.NOT_LOADED
            com.facebook.internal.y r6 = com.facebook.internal.y.LOADING
        L30:
            boolean r7 = r5.compareAndSet(r2, r6)
            r8 = 0
            r9 = 1
            if (r7 == 0) goto L3a
            r2 = r9
            goto L41
        L3a:
            java.lang.Object r7 = r5.get()
            if (r7 == r2) goto L30
            r2 = r8
        L41:
            if (r2 != 0) goto L57
        L43:
            boolean r2 = r5.compareAndSet(r3, r6)
            if (r2 == 0) goto L4b
            r2 = r9
            goto L52
        L4b:
            java.lang.Object r2 = r5.get()
            if (r2 == r3) goto L43
            r2 = r8
        L52:
            if (r2 == 0) goto L55
            goto L57
        L55:
            r2 = r8
            goto L58
        L57:
            r2 = r9
        L58:
            if (r2 != 0) goto L5e
            r4.e()
            return
        L5e:
            kotlin.jvm.internal.StringCompanionObject r2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r2[r8] = r1
            java.lang.String r3 = "com.facebook.internal.APP_SETTINGS.%s"
            java.lang.String r4 = "java.lang.String.format(format, *args)"
            java.lang.String r2 = com.applovin.impl.mediation.ads.e.h(r2, r9, r3, r4)
            java.util.concurrent.Executor r3 = com.facebook.x.c()
            e6.a r4 = new e6.a
            r5 = 2
            r4.<init>(r0, r2, r1, r5)
            r3.execute(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.z.c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0220 A[LOOP:1: B:38:0x0155->B:48:0x0220, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x022a A[EDGE_INSN: B:49:0x022a->B:78:0x022a BREAK  A[LOOP:1: B:38:0x0155->B:48:0x0220], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.internal.x d(java.lang.String r36, org.json.JSONObject r37) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.z.d(java.lang.String, org.json.JSONObject):com.facebook.internal.x");
    }

    public static final x f(String applicationId, boolean z10) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        if (!z10) {
            ConcurrentHashMap concurrentHashMap = f11141c;
            if (concurrentHashMap.containsKey(applicationId)) {
                return (x) concurrentHashMap.get(applicationId);
            }
        }
        z zVar = a;
        x d10 = d(applicationId, a());
        if (Intrinsics.areEqual(applicationId, com.facebook.x.b())) {
            f11142d.set(y.SUCCESS);
            zVar.e();
        }
        return d10;
    }

    public final synchronized void e() {
        y yVar = (y) f11142d.get();
        if (y.NOT_LOADED != yVar && y.LOADING != yVar) {
            x xVar = (x) f11141c.get(com.facebook.x.b());
            Handler handler = new Handler(Looper.getMainLooper());
            if (y.ERROR == yVar) {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = f11143e;
                    if (!concurrentLinkedQueue.isEmpty()) {
                        handler.post(new androidx.activity.d((com.facebook.appevents.n) concurrentLinkedQueue.poll(), 24));
                    } else {
                        return;
                    }
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = f11143e;
                    if (!concurrentLinkedQueue2.isEmpty()) {
                        handler.post(new com.facebook.r0(11, (com.facebook.appevents.n) concurrentLinkedQueue2.poll(), xVar));
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
