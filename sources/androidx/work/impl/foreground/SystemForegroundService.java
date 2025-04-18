package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.y;
import androidx.work.p;
import java.util.UUID;
import k0.a;
import m2.k;
import t2.b;
import t2.c;

/* loaded from: classes.dex */
public class SystemForegroundService extends y implements b {

    /* renamed from: h, reason: collision with root package name */
    public static final String f2214h = p.g("SystemFgService");

    /* renamed from: c, reason: collision with root package name */
    public Handler f2215c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2216d;

    /* renamed from: f, reason: collision with root package name */
    public c f2217f;

    /* renamed from: g, reason: collision with root package name */
    public NotificationManager f2218g;

    public final void a() {
        this.f2215c = new Handler(Looper.getMainLooper());
        this.f2218g = (NotificationManager) getApplicationContext().getSystemService("notification");
        c cVar = new c(getApplicationContext());
        this.f2217f = cVar;
        if (cVar.f25190l != null) {
            p.e().c(c.f25180m, "A callback already exists.", new Throwable[0]);
        } else {
            cVar.f25190l = this;
        }
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        c cVar = this.f2217f;
        cVar.f25190l = null;
        synchronized (cVar.f25184f) {
            cVar.f25189k.c();
        }
        m2.b bVar = cVar.f25182c.f21463n;
        synchronized (bVar.f21443m) {
            bVar.f21442l.remove(cVar);
        }
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        boolean z10 = this.f2216d;
        String str = f2214h;
        int i12 = 0;
        if (z10) {
            p.e().f(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            c cVar = this.f2217f;
            cVar.f25190l = null;
            synchronized (cVar.f25184f) {
                cVar.f25189k.c();
            }
            m2.b bVar = cVar.f25182c.f21463n;
            synchronized (bVar.f21443m) {
                bVar.f21442l.remove(cVar);
            }
            a();
            this.f2216d = false;
        }
        if (intent != null) {
            c cVar2 = this.f2217f;
            cVar2.getClass();
            String action = intent.getAction();
            boolean equals = "ACTION_START_FOREGROUND".equals(action);
            String str2 = c.f25180m;
            k kVar = cVar2.f25182c;
            if (equals) {
                p.e().f(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
                ((h.c) cVar2.f25183d).r(new a(6, cVar2, kVar.f21460k, intent.getStringExtra("KEY_WORKSPEC_ID")));
                cVar2.e(intent);
                return 3;
            }
            if ("ACTION_NOTIFY".equals(action)) {
                cVar2.e(intent);
                return 3;
            }
            if ("ACTION_CANCEL_WORK".equals(action)) {
                p.e().f(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                    UUID fromString = UUID.fromString(stringExtra);
                    kVar.getClass();
                    ((h.c) kVar.f21461l).r(new v2.a(kVar, fromString, i12));
                    return 3;
                }
                return 3;
            }
            if ("ACTION_STOP_FOREGROUND".equals(action)) {
                p.e().f(str2, "Stopping foreground service", new Throwable[0]);
                b bVar2 = cVar2.f25190l;
                if (bVar2 != null) {
                    SystemForegroundService systemForegroundService = (SystemForegroundService) bVar2;
                    systemForegroundService.f2216d = true;
                    p.e().b(str, "All commands completed.", new Throwable[0]);
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
