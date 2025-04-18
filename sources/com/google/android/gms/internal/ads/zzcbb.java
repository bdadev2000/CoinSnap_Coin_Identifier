package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* loaded from: classes3.dex */
final class zzcbb implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcbj zzb;

    public zzcbb(zzcbj zzcbjVar, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        this.zzb = zzcbjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbk zzcbkVar;
        zzcbk zzcbkVar2;
        zzcbj.zzl(this.zzb, this.zza);
        zzcbj zzcbjVar = this.zzb;
        zzcbkVar = zzcbjVar.zzq;
        if (zzcbkVar != null) {
            zzcbkVar2 = zzcbjVar.zzq;
            zzcbkVar2.zzf();
        }
    }
}
