package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.mbridge.msdk.foundation.entity.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zabh extends com.google.android.gms.internal.base.zau {
    final /* synthetic */ zabi zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zabh(zabi zabiVar, Looper looper) {
        super(looper);
        this.zaa = zabiVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i9 = message.what;
        if (i9 != 1) {
            if (i9 != 2) {
                o.z(i9, "Unknown message id: ", "GACStateManager");
                return;
            }
            throw ((RuntimeException) message.obj);
        }
        ((zabg) message.obj).zab(this.zaa);
    }
}
