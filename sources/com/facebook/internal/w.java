package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import u7.AbstractC2817h;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f13674a = new Object();
    public static final List b = AbstractC2817h.B("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules");

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f13675c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReference f13676d = new AtomicReference(v.b);

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f13677e = new ConcurrentLinkedQueue();

    /* renamed from: f, reason: collision with root package name */
    public static boolean f13678f;

    public static JSONObject a() {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(b);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        String str = com.facebook.C.f13380j;
        com.facebook.C w2 = R3.e.w(null, MBridgeConstans.DYNAMIC_VIEW_WX_APP, null);
        w2.f13389i = true;
        w2.f13384d = bundle;
        JSONObject jSONObject = w2.c().f13408d;
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    public static final t b(String str) {
        return (t) f13675c.get(str);
    }

    public static final void c() {
        Context a6 = com.facebook.r.a();
        String b8 = com.facebook.r.b();
        boolean B5 = H.B(b8);
        v vVar = v.f13672f;
        w wVar = f13674a;
        AtomicReference atomicReference = f13676d;
        if (B5) {
            atomicReference.set(vVar);
            wVar.e();
            return;
        }
        if (f13675c.containsKey(b8)) {
            atomicReference.set(v.f13671d);
            wVar.e();
            return;
        }
        v vVar2 = v.b;
        v vVar3 = v.f13670c;
        while (true) {
            if (atomicReference.compareAndSet(vVar2, vVar3)) {
                break;
            }
            if (atomicReference.get() != vVar2) {
                while (!atomicReference.compareAndSet(vVar, vVar3)) {
                    if (atomicReference.get() != vVar) {
                        wVar.e();
                        return;
                    }
                }
            }
        }
        com.facebook.r.c().execute(new G2.a(a6, String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{b8}, 1)), b8));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0224 A[LOOP:1: B:38:0x0150->B:47:0x0224, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0230 A[EDGE_INSN: B:48:0x0230->B:80:0x0230 BREAK  A[LOOP:1: B:38:0x0150->B:47:0x0224], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, J1.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.internal.t d(java.lang.String r37, org.json.JSONObject r38) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.w.d(java.lang.String, org.json.JSONObject):com.facebook.internal.t");
    }

    public static final t f(String str, boolean z8) {
        G7.j.e(str, "applicationId");
        if (!z8) {
            ConcurrentHashMap concurrentHashMap = f13675c;
            if (concurrentHashMap.containsKey(str)) {
                return (t) concurrentHashMap.get(str);
            }
        }
        w wVar = f13674a;
        t d2 = d(str, a());
        if (str.equals(com.facebook.r.b())) {
            f13676d.set(v.f13671d);
            wVar.e();
        }
        return d2;
    }

    public final synchronized void e() {
        v vVar = (v) f13676d.get();
        if (v.b != vVar && v.f13670c != vVar) {
            t tVar = (t) f13675c.get(com.facebook.r.b());
            Handler handler = new Handler(Looper.getMainLooper());
            if (v.f13672f == vVar) {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = f13677e;
                    if (!concurrentLinkedQueue.isEmpty()) {
                        handler.post(new u((com.facebook.appevents.m) concurrentLinkedQueue.poll()));
                    } else {
                        return;
                    }
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = f13677e;
                    if (!concurrentLinkedQueue2.isEmpty()) {
                        handler.post(new u((com.facebook.appevents.m) concurrentLinkedQueue2.poll(), tVar));
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
