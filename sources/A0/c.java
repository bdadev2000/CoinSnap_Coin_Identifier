package A0;

import java.util.concurrent.Executor;
import r.C2650a;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Executor {
    public final /* synthetic */ int b;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.b) {
            case 0:
                runnable.run();
                return;
            default:
                C2650a.v().f22808a.b.execute(runnable);
                return;
        }
    }
}
