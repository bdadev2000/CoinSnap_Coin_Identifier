package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzfv implements Comparable {
    private long zzc;
    private long zzb = -9223372036854775807L;
    private final zzek zza = new zzek();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzfv zzfvVar = (zzfv) obj;
        int compare = Long.compare(this.zzb, zzfvVar.zzb);
        return compare != 0 ? compare : Long.compare(this.zzc, zzfvVar.zzc);
    }

    public final void zzc(long j2, long j3, zzek zzekVar) {
        zzdi.zzf(j2 != -9223372036854775807L);
        this.zzb = j2;
        this.zzc = j3;
        this.zza.zzI(zzekVar.zzb());
        System.arraycopy(zzekVar.zzN(), zzekVar.zzd(), this.zza.zzN(), 0, zzekVar.zzb());
    }
}
