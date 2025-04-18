package u1;

import android.view.Choreographer;

/* loaded from: classes.dex */
public abstract class f {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new e(runnable, 0));
    }
}
