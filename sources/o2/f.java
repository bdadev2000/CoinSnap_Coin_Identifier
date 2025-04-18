package o2;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.p;
import v2.i;
import v2.k;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22987b;

    /* renamed from: c, reason: collision with root package name */
    public final h f22988c;

    public /* synthetic */ f(h hVar, int i10) {
        this.f22987b = i10;
        this.f22988c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        h hVar;
        f fVar;
        int i10 = 1;
        switch (this.f22987b) {
            case 0:
                synchronized (this.f22988c.f22997j) {
                    h hVar2 = this.f22988c;
                    hVar2.f22998k = (Intent) hVar2.f22997j.get(0);
                }
                Intent intent = this.f22988c.f22998k;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.f22988c.f22998k.getIntExtra("KEY_START_ID", 0);
                    p e2 = p.e();
                    String str = h.f22989m;
                    e2.b(str, String.format("Processing command %s, %s", this.f22988c.f22998k, Integer.valueOf(intExtra)), new Throwable[0]);
                    PowerManager.WakeLock a = k.a(this.f22988c.f22990b, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                    try {
                        p.e().b(str, String.format("Acquiring operation wake lock (%s) %s", action, a), new Throwable[0]);
                        a.acquire();
                        h hVar3 = this.f22988c;
                        hVar3.f22995h.c(hVar3.f22998k, intExtra, hVar3);
                        p.e().b(str, String.format("Releasing operation wake lock (%s) %s", action, a), new Throwable[0]);
                        a.release();
                        hVar = this.f22988c;
                        fVar = new f(hVar, i10);
                    } catch (Throwable th2) {
                        try {
                            p e10 = p.e();
                            String str2 = h.f22989m;
                            e10.c(str2, "Unexpected error in onHandleIntent", th2);
                            p.e().b(str2, String.format("Releasing operation wake lock (%s) %s", action, a), new Throwable[0]);
                            a.release();
                            hVar = this.f22988c;
                            fVar = new f(hVar, i10);
                        } catch (Throwable th3) {
                            p.e().b(h.f22989m, String.format("Releasing operation wake lock (%s) %s", action, a), new Throwable[0]);
                            a.release();
                            h hVar4 = this.f22988c;
                            hVar4.e(new f(hVar4, i10));
                            throw th3;
                        }
                    }
                    hVar.e(fVar);
                    return;
                }
                return;
            default:
                h hVar5 = this.f22988c;
                hVar5.getClass();
                p e11 = p.e();
                String str3 = h.f22989m;
                e11.b(str3, "Checking if commands are complete.", new Throwable[0]);
                hVar5.b();
                synchronized (hVar5.f22997j) {
                    if (hVar5.f22998k != null) {
                        p.e().b(str3, String.format("Removing command %s", hVar5.f22998k), new Throwable[0]);
                        if (((Intent) hVar5.f22997j.remove(0)).equals(hVar5.f22998k)) {
                            hVar5.f22998k = null;
                        } else {
                            throw new IllegalStateException("Dequeue-d command is not the first.");
                        }
                    }
                    i iVar = (i) ((h.c) hVar5.f22991c).f18523c;
                    b bVar = hVar5.f22995h;
                    synchronized (bVar.f22973d) {
                        if (!bVar.f22972c.isEmpty()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    if (!z10 && hVar5.f22997j.isEmpty()) {
                        synchronized (iVar.f25988d) {
                            if (iVar.f25986b.isEmpty()) {
                                i10 = 0;
                            }
                        }
                        if (i10 == 0) {
                            p.e().b(str3, "No more commands & intents.", new Throwable[0]);
                            g gVar = hVar5.f22999l;
                            if (gVar != null) {
                                ((SystemAlarmService) gVar).b();
                            }
                        }
                    }
                    if (!hVar5.f22997j.isEmpty()) {
                        hVar5.f();
                    }
                }
                return;
        }
    }
}
