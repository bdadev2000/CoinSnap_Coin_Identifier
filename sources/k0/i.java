package k0;

import android.os.Process;

/* loaded from: classes.dex */
public final class i extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public final int f20208b;

    public i(Runnable runnable, String str, int i10) {
        super(runnable, str);
        this.f20208b = i10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f20208b);
        super.run();
    }
}
