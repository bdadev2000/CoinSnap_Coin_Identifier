package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* loaded from: classes3.dex */
final class zzcbf implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcbn zzb;

    public zzcbf(zzcbn zzcbnVar, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        this.zzb = zzcbnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbo zzcboVar;
        zzcbo zzcboVar2;
        zzcbn.zzl(this.zzb, this.zza);
        zzcbn zzcbnVar = this.zzb;
        zzcboVar = zzcbnVar.zzq;
        if (zzcboVar != null) {
            zzcboVar2 = zzcbnVar.zzq;
            zzcboVar2.zzf();
        }
    }
}
