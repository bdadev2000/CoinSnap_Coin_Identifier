package S1;

import M0.C0219j;
import android.os.Process;

/* loaded from: classes.dex */
public final class a extends Thread {
    public final /* synthetic */ int b = 0;

    public /* synthetic */ a(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        w8.c g9;
        switch (this.b) {
            case 0:
                Process.setThreadPriority(9);
                super.run();
                return;
        }
        while (true) {
            try {
                synchronized (w8.c.class) {
                    w8.c cVar = w8.c.f24009j;
                    g9 = C0219j.g();
                    if (g9 == w8.c.f24009j) {
                        w8.c.f24009j = null;
                        return;
                    }
                }
                if (g9 != null) {
                    g9.k();
                }
            } catch (InterruptedException unused) {
            }
        }
    }

    public /* synthetic */ a(String str) {
        super(str);
    }
}
