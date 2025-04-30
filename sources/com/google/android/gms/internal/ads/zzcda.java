package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* loaded from: classes2.dex */
final class zzcda implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcdi zzb;

    public zzcda(zzcdi zzcdiVar, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        this.zzb = zzcdiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcdj zzcdjVar;
        zzcdj zzcdjVar2;
        zzcdi.zzl(this.zzb, this.zza);
        zzcdi zzcdiVar = this.zzb;
        zzcdjVar = zzcdiVar.zzq;
        if (zzcdjVar != null) {
            zzcdjVar2 = zzcdiVar.zzq;
            zzcdjVar2.zzf();
        }
    }
}
