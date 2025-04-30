package com.mbridge.msdk.thrid.okhttp;

import java.net.Socket;

/* loaded from: classes3.dex */
public interface Connection {
    Handshake handshake();

    Protocol protocol();

    Route route();

    Socket socket();
}
