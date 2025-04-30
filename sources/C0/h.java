package C0;

import android.view.Choreographer;

/* loaded from: classes.dex */
public abstract class h {
    public static void a(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: C0.g
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j7) {
                runnable.run();
            }
        });
    }
}
