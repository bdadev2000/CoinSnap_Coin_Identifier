package com.google.android.gms.internal.ads;

import Q7.n0;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class zzix {
    public int zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    public int zzj;
    public long zzk;
    public int zzl;

    public final String toString() {
        int i9 = this.zza;
        int i10 = this.zzb;
        int i11 = this.zzc;
        int i12 = this.zzd;
        int i13 = this.zze;
        int i14 = this.zzf;
        int i15 = this.zzg;
        int i16 = this.zzh;
        int i17 = this.zzi;
        int i18 = this.zzj;
        long j7 = this.zzk;
        int i19 = this.zzl;
        Locale locale = Locale.US;
        StringBuilder o3 = n0.o(i9, i10, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        n0.t(o3, i11, "\n skippedInputBuffers=", i12, "\n renderedOutputBuffers=");
        n0.t(o3, i13, "\n skippedOutputBuffers=", i14, "\n droppedBuffers=");
        n0.t(o3, i15, "\n droppedInputBuffers=", i16, "\n maxConsecutiveDroppedBuffers=");
        n0.t(o3, i17, "\n droppedToKeyframeEvents=", i18, "\n totalVideoFrameProcessingOffsetUs=");
        o3.append(j7);
        o3.append("\n videoFrameProcessingOffsetCount=");
        o3.append(i19);
        o3.append("\n}");
        return o3.toString();
    }

    public final synchronized void zza() {
    }
}
