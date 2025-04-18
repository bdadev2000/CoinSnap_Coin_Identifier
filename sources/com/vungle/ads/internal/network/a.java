package com.vungle.ads.internal.network;

import java.io.IOException;

/* loaded from: classes4.dex */
public interface a {
    void cancel();

    void enqueue(b bVar);

    j execute() throws IOException;

    boolean isCanceled();
}
