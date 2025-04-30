package Q;

import android.os.Process;

/* loaded from: classes.dex */
public final class h extends Thread {
    public final int b;

    public h(Runnable runnable, String str, int i9) {
        super(runnable, str);
        this.b = i9;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.b);
        super.run();
    }
}
