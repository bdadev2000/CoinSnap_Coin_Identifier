package com.google.android.gms.measurement.internal;

import java.util.List;

/* loaded from: classes3.dex */
final class zzhr implements com.google.android.gms.internal.measurement.zzv {
    private final /* synthetic */ zzhl zza;

    public zzhr(zzhl zzhlVar) {
        this.zza = zzhlVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public final void zza(com.google.android.gms.internal.measurement.zzs zzsVar, String str, List<String> list, boolean z2, boolean z3) {
        int i2 = zzht.zza[zzsVar.ordinal()];
        zzgq zzo = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? this.zza.zzj().zzo() : this.zza.zzj().zzp() : z2 ? this.zza.zzj().zzw() : !z3 ? this.zza.zzj().zzv() : this.zza.zzj().zzu() : z2 ? this.zza.zzj().zzn() : !z3 ? this.zza.zzj().zzm() : this.zza.zzj().zzg() : this.zza.zzj().zzc();
        int size = list.size();
        if (size == 1) {
            zzo.zza(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzo.zza(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzo.zza(str);
        } else {
            zzo.zza(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
