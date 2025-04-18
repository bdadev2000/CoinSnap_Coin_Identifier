package x2;

import android.os.Handler;
import androidx.activity.i;
import h.c;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27347b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27348c;

    public /* synthetic */ b(Object obj, int i10) {
        this.f27347b = i10;
        this.f27348c = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i10 = this.f27347b;
        Object obj = this.f27348c;
        switch (i10) {
            case 0:
                ((Handler) ((c) obj).f18524d).post(runnable);
                return;
            case 1:
                ((Executor) obj).execute(new i(runnable, 20));
                return;
            default:
                te.i iVar = (te.i) obj;
                iVar.getClass();
                if (Thread.currentThread() == iVar.f25393b) {
                    runnable.run();
                    return;
                } else {
                    iVar.f25394c.post(runnable);
                    return;
                }
        }
    }
}
