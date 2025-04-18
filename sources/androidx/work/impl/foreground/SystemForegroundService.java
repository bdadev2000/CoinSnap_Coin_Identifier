package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.CancelWorkRunnable;
import java.util.UUID;

@RestrictTo
/* loaded from: classes4.dex */
public class SystemForegroundService extends LifecycleService implements SystemForegroundDispatcher.Callback {

    /* renamed from: g, reason: collision with root package name */
    public static final String f22111g = Logger.e("SystemFgService");

    /* renamed from: b, reason: collision with root package name */
    public Handler f22112b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22113c;
    public SystemForegroundDispatcher d;

    /* renamed from: f, reason: collision with root package name */
    public NotificationManager f22114f;

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public final void a(final int i2, final Notification notification) {
        this.f22112b.post(new Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundService.2
            @Override // java.lang.Runnable
            public final void run() {
                SystemForegroundService.this.f22114f.notify(i2, notification);
            }
        });
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public final void c(final int i2, final int i3, final Notification notification) {
        this.f22112b.post(new Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundService.1
            @Override // java.lang.Runnable
            public final void run() {
                int i4 = Build.VERSION.SDK_INT;
                Notification notification2 = notification;
                int i5 = i2;
                SystemForegroundService systemForegroundService = SystemForegroundService.this;
                if (i4 >= 29) {
                    systemForegroundService.startForeground(i5, notification2, i3);
                } else {
                    systemForegroundService.startForeground(i5, notification2);
                }
            }
        });
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public final void d(final int i2) {
        this.f22112b.post(new Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundService.3
            @Override // java.lang.Runnable
            public final void run() {
                SystemForegroundService.this.f22114f.cancel(i2);
            }
        });
    }

    public final void e() {
        this.f22112b = new Handler(Looper.getMainLooper());
        this.f22114f = (NotificationManager) getApplicationContext().getSystemService("notification");
        SystemForegroundDispatcher systemForegroundDispatcher = new SystemForegroundDispatcher(getApplicationContext());
        this.d = systemForegroundDispatcher;
        if (systemForegroundDispatcher.f22107j == null) {
            systemForegroundDispatcher.f22107j = this;
        } else {
            Logger.c().b(SystemForegroundDispatcher.f22099k, "A callback already exists.", new Throwable[0]);
        }
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        e();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.d.g();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        if (this.f22113c) {
            Logger.c().d(f22111g, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.d.g();
            e();
            this.f22113c = false;
        }
        if (intent == null) {
            return 3;
        }
        final SystemForegroundDispatcher systemForegroundDispatcher = this.d;
        systemForegroundDispatcher.getClass();
        String action = intent.getAction();
        boolean equals = "ACTION_START_FOREGROUND".equals(action);
        String str = SystemForegroundDispatcher.f22099k;
        WorkManagerImpl workManagerImpl = systemForegroundDispatcher.f22100a;
        if (equals) {
            Logger.c().d(str, String.format("Started foreground service %s", intent), new Throwable[0]);
            final String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            final WorkDatabase workDatabase = workManagerImpl.f21971c;
            systemForegroundDispatcher.f22101b.b(new Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundDispatcher.1

                /* renamed from: a */
                public final /* synthetic */ WorkDatabase f22108a;

                /* renamed from: b */
                public final /* synthetic */ String f22109b;

                public AnonymousClass1(final WorkDatabase workDatabase2, final String stringExtra2) {
                    r2 = workDatabase2;
                    r3 = stringExtra2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    WorkSpec j2 = r2.h().j(r3);
                    if (j2 == null || !j2.b()) {
                        return;
                    }
                    synchronized (SystemForegroundDispatcher.this.f22102c) {
                        SystemForegroundDispatcher.this.f22104g.put(r3, j2);
                        SystemForegroundDispatcher.this.f22105h.add(j2);
                        SystemForegroundDispatcher systemForegroundDispatcher2 = SystemForegroundDispatcher.this;
                        systemForegroundDispatcher2.f22106i.d(systemForegroundDispatcher2.f22105h);
                    }
                }
            });
            systemForegroundDispatcher.d(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            systemForegroundDispatcher.d(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            Logger.c().d(str, "Stopping foreground service", new Throwable[0]);
            SystemForegroundDispatcher.Callback callback = systemForegroundDispatcher.f22107j;
            if (callback == null) {
                return 3;
            }
            callback.stop();
            return 3;
        }
        Logger.c().d(str, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
            return 3;
        }
        UUID fromString = UUID.fromString(stringExtra2);
        workManagerImpl.getClass();
        workManagerImpl.d.b(CancelWorkRunnable.b(workManagerImpl, fromString));
        return 3;
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public final void stop() {
        this.f22113c = true;
        Logger.c().a(f22111g, "All commands completed.", new Throwable[0]);
        stopForeground(true);
        stopSelf();
    }
}
