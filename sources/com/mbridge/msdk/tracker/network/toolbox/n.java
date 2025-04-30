package com.mbridge.msdk.tracker.network.toolbox;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.tracker.network.v;
import com.mbridge.msdk.tracker.network.x;

/* loaded from: classes3.dex */
public final class n {
    public static v a(com.mbridge.msdk.tracker.network.n nVar, x xVar, int i9, com.mbridge.msdk.tracker.network.b bVar) {
        if (nVar == null) {
            nVar = new b(new h());
        }
        if (xVar == null) {
            xVar = new com.mbridge.msdk.tracker.network.g(new Handler(Looper.getMainLooper()));
        }
        if (i9 <= 0) {
            i9 = 4;
        }
        if (bVar == null) {
            bVar = new j();
        }
        return new v(nVar, xVar, i9, bVar);
    }
}
