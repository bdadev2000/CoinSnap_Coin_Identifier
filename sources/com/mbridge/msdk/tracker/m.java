package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class m {
    private static final ConcurrentHashMap<String, m> b = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private final k f18144a;

    private m(String str, Context context, w wVar) {
        k kVar = new k(str, this);
        this.f18144a = kVar;
        kVar.a(context);
        kVar.a(wVar);
    }

    public static m[] d() {
        ConcurrentHashMap<String, m> concurrentHashMap = b;
        m[] mVarArr = new m[concurrentHashMap.size()];
        try {
            Iterator<Map.Entry<String, m>> it = concurrentHashMap.entrySet().iterator();
            int i9 = 0;
            while (it.hasNext()) {
                mVarArr[i9] = it.next().getValue();
                i9++;
            }
        } catch (Exception e4) {
            if (a.f18098a) {
                Log.e("TrackManager", "getAllTrackManager error", e4);
            }
        }
        return mVarArr;
    }

    public final String b() {
        return this.f18144a.b();
    }

    public final String c() {
        return this.f18144a.c();
    }

    public final boolean e() {
        return !this.f18144a.r();
    }

    public final void f() {
        try {
            this.f18144a.i().a(new Runnable() { // from class: com.mbridge.msdk.tracker.m.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        t.a().c();
                        m.this.f18144a.o().b();
                    } catch (Exception e4) {
                        if (a.f18098a) {
                            Log.e("TrackManager", "flush error", e4);
                        }
                    }
                }
            });
        } catch (Exception e4) {
            if (a.f18098a) {
                Log.e("TrackManager", "flush error", e4);
            }
        }
    }

    public final JSONObject g() {
        return this.f18144a.f();
    }

    public final long[] h() {
        return this.f18144a.h().a();
    }

    public final void i() {
        this.f18144a.s();
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
        return this.f18144a.a(eVar);
    }

    public static m a(String str, Context context, w wVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, m> concurrentHashMap = b;
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
            if (a.f18098a) {
                Log.e("TrackManager", "MBridgeTrackManager is already running");
            }
            return this.f18144a.b();
        }
        return this.f18144a.a();
    }

    public final void a(JSONObject jSONObject) {
        this.f18144a.a(jSONObject);
    }

    public final boolean a(String str) {
        return b(new e(str));
    }

    public final void a(final e eVar) {
        if (this.f18144a.r()) {
            if (a.f18098a) {
                Log.d("TrackManager", "SDK is shutdown, track event will not be processed");
                return;
            }
            return;
        }
        try {
            this.f18144a.i().a(new Runnable() { // from class: com.mbridge.msdk.tracker.m.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (!m.this.c(eVar)) {
                        return;
                    }
                    m.this.f18144a.h().a(eVar);
                    eVar.c(m.this.f18144a.d().f18319f);
                    JSONObject d2 = eVar.d();
                    if (d2 != null) {
                        try {
                            d2.put("session_id", m.this.b());
                            long[] h6 = m.this.h();
                            d2.put("track_time", h6[0]);
                            d2.put("track_count", h6[1]);
                        } catch (JSONException e4) {
                            e4.printStackTrace();
                        }
                        eVar.a(d2);
                    }
                    m.this.f18144a.h().b(eVar);
                }
            });
        } catch (Exception e4) {
            if (a.f18098a) {
                Log.e("TrackManager", "trackEvent error", e4);
            }
        }
    }
}
