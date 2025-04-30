package com.vungle.ads.internal.network;

import java.io.IOException;

/* renamed from: com.vungle.ads.internal.network.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2099a {
    void cancel();

    void enqueue(InterfaceC2100b interfaceC2100b);

    j execute() throws IOException;

    boolean isCanceled();
}
