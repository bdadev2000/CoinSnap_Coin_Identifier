package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzbuq extends zzbiy {
    final /* synthetic */ zzbut zza;

    public /* synthetic */ zzbuq(zzbut zzbutVar, zzbup zzbupVar) {
        this.zza = zzbutVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zze(zzbip zzbipVar, String str) {
        zzbut zzbutVar = this.zza;
        if (zzbut.zzc(zzbutVar) == null) {
            return;
        }
        zzbut.zzc(zzbutVar).onCustomClick(zzbut.zze(zzbutVar, zzbipVar), str);
    }
}
