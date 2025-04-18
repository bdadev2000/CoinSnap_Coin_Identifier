package com.vungle.ads.internal.network;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class c {
    private c() {
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void throwIfFatal(Throwable th2) {
        if (!(th2 instanceof VirtualMachineError)) {
            if (!(th2 instanceof ThreadDeath)) {
                if (!(th2 instanceof LinkageError)) {
                    return;
                } else {
                    throw th2;
                }
            }
            throw th2;
        }
        throw th2;
    }
}
