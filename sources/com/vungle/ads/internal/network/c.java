package com.vungle.ads.internal.network;

/* loaded from: classes3.dex */
public final class c {
    public /* synthetic */ c(G7.f fVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void throwIfFatal(Throwable th) {
        if (!(th instanceof VirtualMachineError)) {
            if (!(th instanceof ThreadDeath)) {
                if (!(th instanceof LinkageError)) {
                    return;
                } else {
                    throw th;
                }
            }
            throw th;
        }
        throw th;
    }

    private c() {
    }
}
