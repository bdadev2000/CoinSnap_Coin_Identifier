package androidx.work.impl.foreground;

import A4.e;
import C.c;
import V0.k;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractServiceC0514y;
import androidx.work.o;
import c1.C0588c;
import c1.InterfaceC0587b;
import e1.C2209a;
import java.util.UUID;

/* loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC0514y implements InterfaceC0587b {

    /* renamed from: h, reason: collision with root package name */
    public static final String f5233h = o.g("SystemFgService");

    /* renamed from: c, reason: collision with root package name */
    public Handler f5234c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5235d;

    /* renamed from: f, reason: collision with root package name */
    public C0588c f5236f;

    /* renamed from: g, reason: collision with root package name */
    public NotificationManager f5237g;

    public final void a() {
        this.f5234c = new Handler(Looper.getMainLooper());
        this.f5237g = (NotificationManager) getApplicationContext().getSystemService("notification");
        C0588c c0588c = new C0588c(getApplicationContext());
        this.f5236f = c0588c;
        if (c0588c.l != null) {
            o.e().d(C0588c.m, "A callback already exists.", new Throwable[0]);
        } else {
            c0588c.l = this;
        }
    }

    @Override // androidx.lifecycle.AbstractServiceC0514y, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.AbstractServiceC0514y, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f5236f.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i9, int i10) {
        super.onStartCommand(intent, i9, i10);
        boolean z8 = this.f5235d;
        String str = f5233h;
        if (z8) {
            o.e().f(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f5236f.g();
            a();
            this.f5235d = false;
        }
        if (intent != null) {
            C0588c c0588c = this.f5236f;
            c0588c.getClass();
            String action = intent.getAction();
            boolean equals = "ACTION_START_FOREGROUND".equals(action);
            String str2 = C0588c.m;
            k kVar = c0588c.f5377c;
            if (equals) {
                o.e().f(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
                ((c) c0588c.f5378d).p(new e(c0588c, kVar.f3418c, intent.getStringExtra("KEY_WORKSPEC_ID"), 8));
                c0588c.e(intent);
                return 3;
            }
            if ("ACTION_NOTIFY".equals(action)) {
                c0588c.e(intent);
                return 3;
            }
            if ("ACTION_CANCEL_WORK".equals(action)) {
                o.e().f(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                    UUID fromString = UUID.fromString(stringExtra);
                    kVar.getClass();
                    ((c) kVar.f3419d).p(new C2209a(kVar, fromString));
                    return 3;
                }
                return 3;
            }
            if ("ACTION_STOP_FOREGROUND".equals(action)) {
                o.e().f(str2, "Stopping foreground service", new Throwable[0]);
                InterfaceC0587b interfaceC0587b = c0588c.l;
                if (interfaceC0587b != null) {
                    SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC0587b;
                    systemForegroundService.f5235d = true;
                    o.e().b(str, "All commands completed.", new Throwable[0]);
                    if (Build.VERSION.SDK_INT >= 26) {
                        systemForegroundService.stopForeground(true);
                    }
                    systemForegroundService.stopSelf();
                    return 3;
                }
                return 3;
            }
            return 3;
        }
        return 3;
    }
}
