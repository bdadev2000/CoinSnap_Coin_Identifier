package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
final class zzdo extends zzdq {
    private zzdo() {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdq
    public final void zza(Object obj, long j7) {
        ((zzcz) zzfp.zzf(obj, j7)).zzb();
    }

    @Override // com.google.android.gms.internal.play_billing.zzdq
    public final void zzb(Object obj, Object obj2, long j7) {
        zzcz zzczVar = (zzcz) zzfp.zzf(obj, j7);
        zzcz zzczVar2 = (zzcz) zzfp.zzf(obj2, j7);
        int size = zzczVar.size();
        int size2 = zzczVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzczVar.zzc()) {
                zzczVar = zzczVar.zzd(size2 + size);
            }
            zzczVar.addAll(zzczVar2);
        }
        if (size > 0) {
            zzczVar2 = zzczVar;
        }
        zzfp.zzs(obj, j7, zzczVar2);
    }

    public /* synthetic */ zzdo(zzdn zzdnVar) {
        super(null);
    }
}
