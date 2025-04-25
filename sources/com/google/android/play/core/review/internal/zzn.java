package com.google.android.play.core.review.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes12.dex */
public final class zzn extends zzj {
    final /* synthetic */ zzt zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(zzt zztVar) {
        this.zza = zztVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void zza() {
        IInterface iInterface;
        zzi zziVar;
        Context context;
        ServiceConnection serviceConnection;
        zzt zztVar = this.zza;
        iInterface = zztVar.zzn;
        if (iInterface != null) {
            zziVar = zztVar.zzc;
            zziVar.zzd("Unbind from service.", new Object[0]);
            zzt zztVar2 = this.zza;
            context = zztVar2.zzb;
            serviceConnection = zztVar2.zzm;
            context.unbindService(serviceConnection);
            this.zza.zzh = false;
            this.zza.zzn = null;
            this.zza.zzm = null;
        }
        this.zza.zzt();
    }
}
