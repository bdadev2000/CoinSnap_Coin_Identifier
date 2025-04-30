package j2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f implements Executor {
    public final /* synthetic */ int b;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.b) {
            case 0:
                n.f().post(runnable);
                return;
            case 1:
                runnable.run();
                return;
            case 2:
                new Thread(runnable).start();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
