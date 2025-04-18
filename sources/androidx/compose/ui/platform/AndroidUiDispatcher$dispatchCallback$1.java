package androidx.compose.ui.platform;

import android.view.Choreographer;
import java.util.List;

/* loaded from: classes4.dex */
public final class AndroidUiDispatcher$dispatchCallback$1 implements Choreographer.FrameCallback, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidUiDispatcher f16384a;

    public AndroidUiDispatcher$dispatchCallback$1(AndroidUiDispatcher androidUiDispatcher) {
        this.f16384a = androidUiDispatcher;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        this.f16384a.d.removeCallbacks(this);
        AndroidUiDispatcher.l0(this.f16384a);
        AndroidUiDispatcher androidUiDispatcher = this.f16384a;
        synchronized (androidUiDispatcher.f16375f) {
            if (androidUiDispatcher.f16380k) {
                androidUiDispatcher.f16380k = false;
                List list = androidUiDispatcher.f16377h;
                androidUiDispatcher.f16377h = androidUiDispatcher.f16378i;
                androidUiDispatcher.f16378i = list;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((Choreographer.FrameCallback) list.get(i2)).doFrame(j2);
                }
                list.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        AndroidUiDispatcher.l0(this.f16384a);
        AndroidUiDispatcher androidUiDispatcher = this.f16384a;
        synchronized (androidUiDispatcher.f16375f) {
            if (androidUiDispatcher.f16377h.isEmpty()) {
                androidUiDispatcher.f16374c.removeFrameCallback(this);
                androidUiDispatcher.f16380k = false;
            }
        }
    }
}
