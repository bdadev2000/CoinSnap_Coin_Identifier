package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import androidx.work.Logger;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;
import androidx.work.impl.utils.WakeLocks;
import java.util.HashMap;
import java.util.WeakHashMap;

@RestrictTo
/* loaded from: classes4.dex */
public class SystemAlarmService extends LifecycleService implements SystemAlarmDispatcher.CommandsCompletedListener {
    public static final String d = Logger.e("SystemAlarmService");

    /* renamed from: b, reason: collision with root package name */
    public SystemAlarmDispatcher f22058b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22059c;

    @Override // androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.CommandsCompletedListener
    public final void b() {
        this.f22059c = true;
        Logger.c().a(d, "All commands completed in dispatcher", new Throwable[0]);
        String str = WakeLocks.f22208a;
        HashMap hashMap = new HashMap();
        WeakHashMap weakHashMap = WakeLocks.f22209b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                Logger.c().g(WakeLocks.f22208a, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        SystemAlarmDispatcher systemAlarmDispatcher = new SystemAlarmDispatcher(this);
        this.f22058b = systemAlarmDispatcher;
        if (systemAlarmDispatcher.f22051k != null) {
            Logger.c().b(SystemAlarmDispatcher.f22042l, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            systemAlarmDispatcher.f22051k = this;
        }
        this.f22059c = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f22059c = true;
        this.f22058b.c();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        if (this.f22059c) {
            Logger.c().d(d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f22058b.c();
            SystemAlarmDispatcher systemAlarmDispatcher = new SystemAlarmDispatcher(this);
            this.f22058b = systemAlarmDispatcher;
            if (systemAlarmDispatcher.f22051k != null) {
                Logger.c().b(SystemAlarmDispatcher.f22042l, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            } else {
                systemAlarmDispatcher.f22051k = this;
            }
            this.f22059c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f22058b.a(i3, intent);
        return 3;
    }
}
