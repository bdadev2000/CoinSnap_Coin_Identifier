package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
final class zzfs implements Comparable {
    private long zzc;
    private long zzb = C.TIME_UNSET;
    private final zzed zza = new zzed();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzfs zzfsVar = (zzfs) obj;
        int compare = Long.compare(this.zzb, zzfsVar.zzb);
        if (compare != 0) {
            return compare;
        }
        return Long.compare(this.zzc, zzfsVar.zzc);
    }

    public final void zzc(long j3, long j10, zzed zzedVar) {
        boolean z10;
        if (j3 != C.TIME_UNSET) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzf(z10);
        this.zzb = j3;
        this.zzc = j10;
        this.zza.zzI(zzedVar.zzb());
        System.arraycopy(zzedVar.zzN(), zzedVar.zzd(), this.zza.zzN(), 0, zzedVar.zzb());
    }
}
