package com.pgl.ssdk;

import android.os.HandlerThread;
import com.pgl.ssdk.Q;

/* loaded from: classes4.dex */
public class N extends Q implements O {

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f16527b;

    public N(HandlerThread handlerThread, Q.a aVar) {
        super(handlerThread.getLooper(), aVar);
        this.f16527b = handlerThread;
    }

    public void a(String str) {
        HandlerThread handlerThread = this.f16527b;
        if (handlerThread != null) {
            handlerThread.setName(str);
        }
    }
}
