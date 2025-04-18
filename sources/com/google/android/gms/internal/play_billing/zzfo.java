package com.google.android.gms.internal.play_billing;

/* loaded from: classes3.dex */
final class zzfo extends zzfq {
    public /* synthetic */ zzfo(zzfn zzfnVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfq
    public final void zza(Object obj, long j2) {
        ((zzfc) zzhn.zzf(obj, j2)).zzb();
    }

    @Override // com.google.android.gms.internal.play_billing.zzfq
    public final void zzb(Object obj, Object obj2, long j2) {
        zzfc zzfcVar = (zzfc) zzhn.zzf(obj, j2);
        zzfc zzfcVar2 = (zzfc) zzhn.zzf(obj2, j2);
        int size = zzfcVar.size();
        int size2 = zzfcVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzfcVar.zzc()) {
                zzfcVar = zzfcVar.zzd(size2 + size);
            }
            zzfcVar.addAll(zzfcVar2);
        }
        if (size > 0) {
            zzfcVar2 = zzfcVar;
        }
        zzhn.zzs(obj, j2, zzfcVar2);
    }

    private zzfo() {
        super(null);
    }
}
