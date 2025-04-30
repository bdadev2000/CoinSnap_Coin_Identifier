package androidx.work.impl.background.systemalarm;

import X0.g;
import X0.h;
import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.AbstractServiceC0514y;
import androidx.work.o;
import e1.k;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC0514y implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final String f5227f = o.g("SystemAlarmService");

    /* renamed from: c, reason: collision with root package name */
    public h f5228c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5229d;

    public final void a() {
        this.f5229d = true;
        o.e().b(f5227f, "All commands completed in dispatcher", new Throwable[0]);
        String str = k.f20043a;
        HashMap hashMap = new HashMap();
        WeakHashMap weakHashMap = k.b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                o.e().h(k.f20043a, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.AbstractServiceC0514y, android.app.Service
    public final void onCreate() {
        super.onCreate();
        h hVar = new h(this);
        this.f5228c = hVar;
        if (hVar.l != null) {
            o.e().d(h.m, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            hVar.l = this;
        }
        this.f5229d = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC0514y, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f5229d = true;
        this.f5228c.d();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i9, int i10) {
        super.onStartCommand(intent, i9, i10);
        if (this.f5229d) {
            o.e().f(f5227f, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f5228c.d();
            h hVar = new h(this);
            this.f5228c = hVar;
            if (hVar.l != null) {
                o.e().d(h.m, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            } else {
                hVar.l = this;
            }
            this.f5229d = false;
        }
        if (intent != null) {
            this.f5228c.a(i10, intent);
            return 3;
        }
        return 3;
    }
}
