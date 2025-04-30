package X0;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.o;
import e1.i;
import e1.k;

/* loaded from: classes.dex */
public final class f implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final h f3646c;

    public /* synthetic */ f(h hVar, int i9) {
        this.b = i9;
        this.f3646c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar;
        f fVar;
        boolean z8;
        boolean z9;
        switch (this.b) {
            case 0:
                synchronized (this.f3646c.f3653j) {
                    h hVar2 = this.f3646c;
                    hVar2.f3654k = (Intent) hVar2.f3653j.get(0);
                }
                Intent intent = this.f3646c.f3654k;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.f3646c.f3654k.getIntExtra("KEY_START_ID", 0);
                    o e4 = o.e();
                    String str = h.m;
                    e4.b(str, String.format("Processing command %s, %s", this.f3646c.f3654k, Integer.valueOf(intExtra)), new Throwable[0]);
                    PowerManager.WakeLock a6 = k.a(this.f3646c.b, action + " (" + intExtra + ")");
                    try {
                        o.e().b(str, "Acquiring operation wake lock (" + action + ") " + a6, new Throwable[0]);
                        a6.acquire();
                        h hVar3 = this.f3646c;
                        hVar3.f3651h.d(hVar3.f3654k, intExtra, hVar3);
                        o.e().b(str, "Releasing operation wake lock (" + action + ") " + a6, new Throwable[0]);
                        a6.release();
                        hVar = this.f3646c;
                        fVar = new f(hVar, 1);
                    } catch (Throwable th) {
                        try {
                            o e9 = o.e();
                            String str2 = h.m;
                            e9.d(str2, "Unexpected error in onHandleIntent", th);
                            o.e().b(str2, "Releasing operation wake lock (" + action + ") " + a6, new Throwable[0]);
                            a6.release();
                            hVar = this.f3646c;
                            fVar = new f(hVar, 1);
                        } catch (Throwable th2) {
                            o.e().b(h.m, "Releasing operation wake lock (" + action + ") " + a6, new Throwable[0]);
                            a6.release();
                            h hVar4 = this.f3646c;
                            hVar4.e(new f(hVar4, 1));
                            throw th2;
                        }
                    }
                    hVar.e(fVar);
                    return;
                }
                return;
            default:
                h hVar5 = this.f3646c;
                hVar5.getClass();
                o e10 = o.e();
                String str3 = h.m;
                e10.b(str3, "Checking if commands are complete.", new Throwable[0]);
                hVar5.b();
                synchronized (hVar5.f3653j) {
                    try {
                        if (hVar5.f3654k != null) {
                            o.e().b(str3, String.format("Removing command %s", hVar5.f3654k), new Throwable[0]);
                            if (((Intent) hVar5.f3653j.remove(0)).equals(hVar5.f3654k)) {
                                hVar5.f3654k = null;
                            } else {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                        }
                        i iVar = (i) ((C.c) hVar5.f3647c).f347c;
                        b bVar = hVar5.f3651h;
                        synchronized (bVar.f3633d) {
                            z8 = !bVar.f3632c.isEmpty();
                        }
                        if (!z8 && hVar5.f3653j.isEmpty()) {
                            synchronized (iVar.f20038d) {
                                z9 = !iVar.b.isEmpty();
                            }
                            if (!z9) {
                                o.e().b(str3, "No more commands & intents.", new Throwable[0]);
                                g gVar = hVar5.l;
                                if (gVar != null) {
                                    ((SystemAlarmService) gVar).a();
                                }
                            }
                        }
                        if (!hVar5.f3653j.isEmpty()) {
                            hVar5.f();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }
}
