package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap<String, m> f15403b = new ConcurrentHashMap<>();
    private final k a;

    private m(String str, Context context, w wVar) {
        k kVar = new k(str, this);
        this.a = kVar;
        kVar.a(context);
        kVar.a(wVar);
    }

    public static m[] d() {
        ConcurrentHashMap<String, m> concurrentHashMap = f15403b;
        m[] mVarArr = new m[concurrentHashMap.size()];
        try {
            Iterator<Map.Entry<String, m>> it = concurrentHashMap.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                mVarArr[i10] = it.next().getValue();
                i10++;
            }
        } catch (Exception e2) {
            if (a.a) {
                Log.e("TrackManager", "getAllTrackManager error", e2);
            }
        }
        return mVarArr;
    }

    public final String b() {
        return this.a.b();
    }

    public final String c() {
        return this.a.c();
    }

    public final boolean e() {
        return !this.a.r();
    }

    public final void f() {
        try {
            this.a.i().a(new Runnable() { // from class: com.mbridge.msdk.tracker.m.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        t.a().c();
                        m.this.a.o().b();
                    } catch (Exception e2) {
                        if (a.a) {
                            Log.e("TrackManager", "flush error", e2);
                        }
                    }
                }
            });
        } catch (Exception e2) {
            if (a.a) {
                Log.e("TrackManager", "flush error", e2);
            }
        }
    }

    public final JSONObject g() {
        return this.a.f();
    }

    public final long[] h() {
        return this.a.h().a();
    }

    public final void i() {
        this.a.s();
    }

    private boolean b(e eVar) {
        try {
            return c(eVar);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(e eVar) {
        if (y.a(eVar) || TextUtils.isEmpty(eVar.a())) {
            return false;
        }
        return this.a.a(eVar);
    }

    public static m a(String str, Context context, w wVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, m> concurrentHashMap = f15403b;
        m mVar = concurrentHashMap.get(str);
        if (!y.a(mVar)) {
            return mVar;
        }
        m mVar2 = new m(str, context, wVar);
        concurrentHashMap.put(str, mVar2);
        return mVar2;
    }

    public final String a() {
        if (e()) {
            if (a.a) {
                Log.e("TrackManager", "MBridgeTrackManager is already running");
            }
            return this.a.b();
        }
        return this.a.a();
    }

    public final void a(JSONObject jSONObject) {
        this.a.a(jSONObject);
    }

    public final boolean a(String str) {
        return b(new e(str));
    }

    public final void a(final e eVar) {
        if (this.a.r()) {
            if (a.a) {
                Log.d("TrackManager", "SDK is shutdown, track event will not be processed");
                return;
            }
            return;
        }
        try {
            this.a.i().a(new Runnable() { // from class: com.mbridge.msdk.tracker.m.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (!m.this.c(eVar)) {
                        return;
                    }
                    m.this.a.h().a(eVar);
                    eVar.c(m.this.a.d().f15553f);
                    JSONObject d10 = eVar.d();
                    if (d10 != null) {
                        try {
                            d10.put("session_id", m.this.b());
                            long[] h10 = m.this.h();
                            d10.put("track_time", h10[0]);
                            d10.put("track_count", h10[1]);
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        eVar.a(d10);
                    }
                    m.this.a.h().b(eVar);
                }
            });
        } catch (Exception e2) {
            if (a.a) {
                Log.e("TrackManager", "trackEvent error", e2);
            }
        }
    }
}
