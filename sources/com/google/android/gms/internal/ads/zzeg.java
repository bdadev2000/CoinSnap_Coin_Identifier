package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class zzeg implements zzdl {

    @Nullable
    private Message zza;

    private zzeg() {
        throw null;
    }

    public /* synthetic */ zzeg(zzeh zzehVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        this.zza = null;
        zzei.zzl(this);
    }

    public final zzeg zzb(Message message, zzei zzeiVar) {
        this.zza = message;
        return this;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.zza = null;
        zzei.zzl(this);
        return sendMessageAtFrontOfQueue;
    }
}
