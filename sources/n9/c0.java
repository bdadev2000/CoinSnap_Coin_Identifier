package n9;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class c0 implements a {
    public final e0 a(Looper looper, Handler.Callback callback) {
        return new e0(new Handler(looper, callback));
    }
}
