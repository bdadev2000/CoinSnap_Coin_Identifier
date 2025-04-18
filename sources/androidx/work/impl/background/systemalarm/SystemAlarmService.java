package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.y;
import androidx.work.p;
import java.util.HashMap;
import java.util.WeakHashMap;
import o2.g;
import o2.h;
import v2.k;

/* loaded from: classes.dex */
public class SystemAlarmService extends y implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final String f2208f = p.g("SystemAlarmService");

    /* renamed from: c, reason: collision with root package name */
    public h f2209c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2210d;

    public final void a() {
        h hVar = new h(this);
        this.f2209c = hVar;
        if (hVar.f22999l != null) {
            p.e().c(h.f22989m, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            hVar.f22999l = this;
        }
    }

    public final void b() {
        this.f2210d = true;
        p.e().b(f2208f, "All commands completed in dispatcher", new Throwable[0]);
        String str = k.a;
        HashMap hashMap = new HashMap();
        WeakHashMap weakHashMap = k.f25994b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                p.e().h(k.a, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
        this.f2210d = false;
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f2210d = true;
        this.f2209c.c();
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f2210d) {
            p.e().f(f2208f, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f2209c.c();
            a();
            this.f2210d = false;
        }
        if (intent != null) {
            this.f2209c.a(i11, intent);
            return 3;
        }
        return 3;
    }
}
