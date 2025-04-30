package com.pgl.ssdk;

import android.os.HandlerThread;
import com.pgl.ssdk.P;

/* loaded from: classes3.dex */
public class M extends P implements N {
    private final HandlerThread b;

    public M(HandlerThread handlerThread, P.a aVar) {
        super(handlerThread.getLooper(), aVar);
        this.b = handlerThread;
    }

    public void a(String str) {
        HandlerThread handlerThread = this.b;
        if (handlerThread != null) {
            handlerThread.setName(str);
        }
    }
}
