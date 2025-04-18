package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* loaded from: classes3.dex */
final class zzpv {
    private final AudioTrack zza;
    private final AudioTimestamp zzb = new AudioTimestamp();
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;

    public zzpv(AudioTrack audioTrack) {
        this.zza = audioTrack;
    }

    public final long zza() {
        return this.zze;
    }

    public final long zzb() {
        return this.zzb.nanoTime / 1000;
    }

    public final boolean zzc() {
        boolean timestamp = this.zza.getTimestamp(this.zzb);
        if (timestamp) {
            long j3 = this.zzb.framePosition;
            if (this.zzd > j3) {
                this.zzc++;
            }
            this.zzd = j3;
            this.zze = j3 + this.zzf + (this.zzc << 32);
        }
        return timestamp;
    }
}
