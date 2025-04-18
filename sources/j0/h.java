package j0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class h implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19712b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f19713c;

    public h(Handler handler) {
        this.f19712b = 0;
        this.f19713c = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i10 = this.f19712b;
        Handler handler = this.f19713c;
        switch (i10) {
            case 0:
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                handler.post(runnable);
                return;
        }
    }

    public h() {
        this.f19712b = 1;
        this.f19713c = new Handler(Looper.getMainLooper());
    }
}
