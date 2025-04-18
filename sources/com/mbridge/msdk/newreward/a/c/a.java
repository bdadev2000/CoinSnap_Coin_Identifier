package com.mbridge.msdk.newreward.a.c;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class a {
    private static volatile a a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, c> f14377b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f14378c;

    /* renamed from: com.mbridge.msdk.newreward.a.c.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0185a {
        void a(String str, long j3);
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private final long f14379b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f14380c;

        public b(String str, long j3) {
            this.a = str;
            this.f14379b = j3;
        }
    }

    /* loaded from: classes4.dex */
    public static class c implements Runnable {
        private final b a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC0185a f14381b;

        public c(b bVar, InterfaceC0185a interfaceC0185a) {
            this.a = bVar;
            this.f14381b = interfaceC0185a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC0185a interfaceC0185a;
            if (MBridgeConstans.DEBUG) {
                ad.a("MBridgeTimer", "TimerTask run taskID: " + this.a.a + " isStop: " + this.a.f14380c);
            }
            if (this.a.f14380c || (interfaceC0185a = this.f14381b) == null) {
                return;
            }
            try {
                interfaceC0185a.a(this.a.a, this.a.f14379b);
            } catch (Exception unused) {
            }
        }
    }

    public a() {
        HandlerThread handlerThread = new HandlerThread("MBridgeTimerThread");
        handlerThread.start();
        this.f14378c = new Handler(handlerThread.getLooper());
        this.f14377b = new HashMap();
    }

    public static a a() {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a();
                }
            }
        }
        return a;
    }

    public final void a(String str, long j3, InterfaceC0185a interfaceC0185a) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeTimer", "startTimer taskID: " + str + " timeout: " + j3);
        }
        if (this.f14377b.containsKey(str)) {
            return;
        }
        c cVar = new c(new b(str, j3), interfaceC0185a);
        this.f14377b.put(str, cVar);
        this.f14378c.postDelayed(cVar, j3);
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c remove = this.f14377b.remove(str);
        if (MBridgeConstans.DEBUG) {
            e.A("stopTimer taskID: ", str, "MBridgeTimer");
        }
        if (remove != null) {
            remove.a.f14380c = true;
            this.f14378c.removeCallbacks(remove);
        }
    }
}
