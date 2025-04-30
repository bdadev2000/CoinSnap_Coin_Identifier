package P;

import P1.RunnableC0227a;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class h implements Executor {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2262c;

    public /* synthetic */ h(Object obj, int i9) {
        this.b = i9;
        this.f2262c = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.b) {
            case 0:
                runnable.getClass();
                Handler handler = (Handler) this.f2262c;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                ((Handler) ((C.c) this.f2262c).f348d).post(runnable);
                return;
            default:
                ((Executor) this.f2262c).execute(new RunnableC0227a(runnable, 1));
                return;
        }
    }
}
