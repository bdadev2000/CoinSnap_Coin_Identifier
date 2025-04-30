package com.mbridge.msdk.newreward.a.c;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.applovin.impl.L;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f16969a;
    private Map<String, c> b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f16970c;

    /* renamed from: com.mbridge.msdk.newreward.a.c.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0173a {
        void a(String str, long j7);
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f16971a;
        private final long b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f16972c;

        public b(String str, long j7) {
            this.f16971a = str;
            this.b = j7;
        }
    }

    /* loaded from: classes3.dex */
    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final b f16973a;
        private final InterfaceC0173a b;

        public c(b bVar, InterfaceC0173a interfaceC0173a) {
            this.f16973a = bVar;
            this.b = interfaceC0173a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC0173a interfaceC0173a;
            if (MBridgeConstans.DEBUG) {
                ad.a("MBridgeTimer", "TimerTask run taskID: " + this.f16973a.f16971a + " isStop: " + this.f16973a.f16972c);
            }
            if (this.f16973a.f16972c || (interfaceC0173a = this.b) == null) {
                return;
            }
            try {
                interfaceC0173a.a(this.f16973a.f16971a, this.f16973a.b);
            } catch (Exception unused) {
            }
        }
    }

    public a() {
        HandlerThread handlerThread = new HandlerThread("MBridgeTimerThread");
        handlerThread.start();
        this.f16970c = new Handler(handlerThread.getLooper());
        this.b = new HashMap();
    }

    public static a a() {
        if (f16969a == null) {
            synchronized (a.class) {
                try {
                    if (f16969a == null) {
                        f16969a = new a();
                    }
                } finally {
                }
            }
        }
        return f16969a;
    }

    public final void a(String str, long j7, InterfaceC0173a interfaceC0173a) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeTimer", "startTimer taskID: " + str + " timeout: " + j7);
        }
        if (this.b.containsKey(str)) {
            return;
        }
        c cVar = new c(new b(str, j7), interfaceC0173a);
        this.b.put(str, cVar);
        this.f16970c.postDelayed(cVar, j7);
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c remove = this.b.remove(str);
        if (MBridgeConstans.DEBUG) {
            L.C("stopTimer taskID: ", str, "MBridgeTimer");
        }
        if (remove != null) {
            remove.f16973a.f16972c = true;
            this.f16970c.removeCallbacks(remove);
        }
    }
}
