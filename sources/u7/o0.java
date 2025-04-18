package u7;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25596b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Handler f25597c;

    public /* synthetic */ o0(int i10, Handler handler) {
        this.f25596b = i10;
        this.f25597c = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i10 = this.f25596b;
        this.f25597c.post(runnable);
    }
}
