package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Kf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0649Kf {
    public static final AtomicReference<InterfaceC0648Ke> A00 = new AtomicReference<>(null);

    public static InterfaceC0648Ke A00() {
        InterfaceC0648Ke errorLogger = A00.get();
        if (errorLogger == null) {
            return new C0945Vs();
        }
        return errorLogger;
    }

    public static void A01(InterfaceC0648Ke interfaceC0648Ke) {
        A00.set(interfaceC0648Ke);
    }
}
