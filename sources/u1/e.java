package u1;

import android.view.Choreographer;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.android.HandlerDispatcherKt;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Choreographer.FrameCallback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25434b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25435c;

    public /* synthetic */ e(Object obj, int i10) {
        this.f25434b = i10;
        this.f25435c = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        int i10 = this.f25434b;
        Object obj = this.f25435c;
        switch (i10) {
            case 0:
                ((Runnable) obj).run();
                return;
            default:
                HandlerDispatcherKt.a((CancellableContinuation) obj, j3);
                return;
        }
    }
}
