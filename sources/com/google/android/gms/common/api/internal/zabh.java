package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import eb.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zabh extends com.google.android.gms.internal.base.zau {
    final /* synthetic */ zabi zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zabh(zabi zabiVar, Looper looper) {
        super(looper);
        this.zaa = zabiVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 != 2) {
                j.v("Unknown message id: ", i10, "GACStateManager");
                return;
            }
            throw ((RuntimeException) message.obj);
        }
        ((zabg) message.obj).zab(this.zaa);
    }
}
