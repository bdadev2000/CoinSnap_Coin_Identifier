package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* loaded from: classes2.dex */
final class zzqw {
    private final AudioTrack zza;
    private final AudioTimestamp zzb = new AudioTimestamp();
    private long zzc;
    private long zzd;
    private long zze;

    public zzqw(AudioTrack audioTrack) {
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
            long j7 = this.zzb.framePosition;
            if (this.zzd > j7) {
                this.zzc++;
            }
            this.zzd = j7;
            this.zze = j7 + (this.zzc << 32);
        }
        return timestamp;
    }
}
