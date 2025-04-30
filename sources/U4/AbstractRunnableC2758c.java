package u4;

import android.os.Process;

/* renamed from: u4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC2758c implements Runnable {
    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
