package com.mbridge.msdk.tracker.network.toolbox;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.tracker.network.v;
import com.mbridge.msdk.tracker.network.x;

/* loaded from: classes4.dex */
public final class n {
    public static v a(com.mbridge.msdk.tracker.network.n nVar, x xVar, int i10, com.mbridge.msdk.tracker.network.b bVar) {
        if (nVar == null) {
            nVar = new b(new h());
        }
        if (xVar == null) {
            xVar = new com.mbridge.msdk.tracker.network.g(new Handler(Looper.getMainLooper()));
        }
        if (i10 <= 0) {
            i10 = 4;
        }
        if (bVar == null) {
            bVar = new j();
        }
        return new v(nVar, xVar, i10, bVar);
    }
}
