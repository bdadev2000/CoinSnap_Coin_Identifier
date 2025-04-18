package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzql {
    public final zzad zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final zzcj zzi;
    public final boolean zzj = false;
    public final boolean zzk = false;
    public final boolean zzl = false;

    public zzql(zzad zzadVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, zzcj zzcjVar, boolean z10, boolean z11, boolean z12) {
        this.zza = zzadVar;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = i14;
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = zzcjVar;
    }

    public final AudioTrack zza(zzg zzgVar, int i10) throws zzpq {
        AudioTrack audioTrack;
        boolean z10;
        AudioTrack.Builder offloadedPlayback;
        try {
            if (zzen.zza >= 29) {
                AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(zzgVar.zza().zza).setAudioFormat(zzen.zzx(this.zze, this.zzf, this.zzg)).setTransferMode(1).setBufferSizeInBytes(this.zzh).setSessionId(i10);
                if (this.zzc == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                offloadedPlayback = sessionId.setOffloadedPlayback(z10);
                audioTrack = offloadedPlayback.build();
            } else {
                audioTrack = new AudioTrack(zzgVar.zza().zza, zzen.zzx(this.zze, this.zzf, this.zzg), this.zzh, 1, i10);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zzpq(state, this.zze, this.zzf, this.zzh, this.zza, zzc(), null);
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            throw new zzpq(0, this.zze, this.zzf, this.zzh, this.zza, zzc(), e2);
        }
    }

    public final zzpo zzb() {
        boolean z10 = this.zzc == 1;
        return new zzpo(this.zzg, this.zze, this.zzf, false, z10, this.zzh);
    }

    public final boolean zzc() {
        return this.zzc == 1;
    }
}
