package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzqp {
    public final zzaf zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final zzcq zzi;
    public final boolean zzj = false;
    public final boolean zzk = false;
    public final boolean zzl = false;

    public zzqp(zzaf zzafVar, int i2, int i3, int i4, int i5, int i6, int i7, int i8, zzcq zzcqVar, boolean z2, boolean z3, boolean z4) {
        this.zza = zzafVar;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = i6;
        this.zzg = i7;
        this.zzh = i8;
        this.zzi = zzcqVar;
    }

    public final AudioTrack zza(zzh zzhVar, int i2) throws zzpu {
        AudioTrack audioTrack;
        AudioTrack.Builder offloadedPlayback;
        try {
            if (zzeu.zza >= 29) {
                offloadedPlayback = new AudioTrack.Builder().setAudioAttributes(zzhVar.zza().zza).setAudioFormat(zzeu.zzw(this.zze, this.zzf, this.zzg)).setTransferMode(1).setBufferSizeInBytes(this.zzh).setSessionId(i2).setOffloadedPlayback(this.zzc == 1);
                audioTrack = offloadedPlayback.build();
            } else {
                audioTrack = new AudioTrack(zzhVar.zza().zza, zzeu.zzw(this.zze, this.zzf, this.zzg), this.zzh, 1, i2);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zzpu(state, this.zze, this.zzf, this.zzh, this.zza, zzc(), null);
        } catch (IllegalArgumentException e) {
            e = e;
            throw new zzpu(0, this.zze, this.zzf, this.zzh, this.zza, zzc(), e);
        } catch (UnsupportedOperationException e2) {
            e = e2;
            throw new zzpu(0, this.zze, this.zzf, this.zzh, this.zza, zzc(), e);
        }
    }

    public final zzps zzb() {
        boolean z2 = this.zzc == 1;
        return new zzps(this.zzg, this.zze, this.zzf, false, z2, this.zzh);
    }

    public final boolean zzc() {
        return this.zzc == 1;
    }
}
