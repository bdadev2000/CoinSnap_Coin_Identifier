package q7;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class b implements a {
    public final /* synthetic */ int a;

    public final long a() {
        switch (this.a) {
            case 0:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }
}
