package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
final class zzfy implements zzfa {

    @Nullable
    private Message zza;

    @Nullable
    private zzfz zzb;

    private zzfy() {
        throw null;
    }

    private final void zzd() {
        this.zza = null;
        this.zzb = null;
        zzfz.zzl(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfa
    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        zzd();
    }

    public final zzfy zzb(Message message, zzfz zzfzVar) {
        this.zza = message;
        this.zzb = zzfzVar;
        return this;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        zzd();
        return sendMessageAtFrontOfQueue;
    }

    public /* synthetic */ zzfy(zzfx zzfxVar) {
    }
}
