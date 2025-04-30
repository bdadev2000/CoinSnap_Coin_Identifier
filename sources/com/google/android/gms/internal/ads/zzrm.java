package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzrm {
    public final zzan zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final zzdw zzi;
    public final boolean zzj = false;
    public final boolean zzk = false;
    public final boolean zzl = false;

    public zzrm(zzan zzanVar, int i9, int i10, int i11, int i12, int i13, int i14, int i15, zzdw zzdwVar, boolean z8, boolean z9, boolean z10) {
        this.zza = zzanVar;
        this.zzb = i9;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = i13;
        this.zzg = i14;
        this.zzh = i15;
        this.zzi = zzdwVar;
    }

    public final AudioTrack zza(zzk zzkVar, int i9) throws zzqr {
        AudioTrack audioTrack;
        boolean z8;
        AudioTrack.Builder offloadedPlayback;
        try {
            if (zzgd.zza >= 29) {
                AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(zzkVar.zza().zza).setAudioFormat(zzgd.zzw(this.zze, this.zzf, this.zzg)).setTransferMode(1).setBufferSizeInBytes(this.zzh).setSessionId(i9);
                if (this.zzc == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                offloadedPlayback = sessionId.setOffloadedPlayback(z8);
                audioTrack = offloadedPlayback.build();
            } else {
                audioTrack = new AudioTrack(zzkVar.zza().zza, zzgd.zzw(this.zze, this.zzf, this.zzg), this.zzh, 1, i9);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zzqr(state, this.zze, this.zzf, this.zzh, this.zza, zzc(), null);
        } catch (IllegalArgumentException e4) {
            e = e4;
            throw new zzqr(0, this.zze, this.zzf, this.zzh, this.zza, zzc(), e);
        } catch (UnsupportedOperationException e9) {
            e = e9;
            throw new zzqr(0, this.zze, this.zzf, this.zzh, this.zza, zzc(), e);
        }
    }

    public final zzqp zzb() {
        boolean z8 = this.zzc == 1;
        return new zzqp(this.zzg, this.zze, this.zzf, false, z8, this.zzh);
    }

    public final boolean zzc() {
        return this.zzc == 1;
    }
}
