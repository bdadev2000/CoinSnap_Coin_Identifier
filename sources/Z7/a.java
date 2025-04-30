package Z7;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class a implements Executor {
    public static final a b = new Object();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
