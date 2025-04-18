package h;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class q0 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18647b;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f18647b) {
            case 0:
                new Thread(runnable).start();
                return;
            case 1:
                w4.m.e().post(runnable);
                return;
            case 2:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
