package com.google.android.gms.measurement.internal;

import java.util.List;

/* loaded from: classes3.dex */
final class zzhr implements com.google.android.gms.internal.measurement.zzv {
    private final /* synthetic */ zzhl zza;

    public zzhr(zzhl zzhlVar) {
        this.zza = zzhlVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public final void zza(com.google.android.gms.internal.measurement.zzs zzsVar, String str, List<String> list, boolean z10, boolean z11) {
        zzgq zzc;
        int i10 = zzht.zza[zzsVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        zzc = this.zza.zzj().zzo();
                    } else {
                        zzc = this.zza.zzj().zzp();
                    }
                } else if (z10) {
                    zzc = this.zza.zzj().zzw();
                } else if (!z11) {
                    zzc = this.zza.zzj().zzv();
                } else {
                    zzc = this.zza.zzj().zzu();
                }
            } else if (z10) {
                zzc = this.zza.zzj().zzn();
            } else if (!z11) {
                zzc = this.zza.zzj().zzm();
            } else {
                zzc = this.zza.zzj().zzg();
            }
        } else {
            zzc = this.zza.zzj().zzc();
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    zzc.zza(str);
                    return;
                } else {
                    zzc.zza(str, list.get(0), list.get(1), list.get(2));
                    return;
                }
            }
            zzc.zza(str, list.get(0), list.get(1));
            return;
        }
        zzc.zza(str, list.get(0));
    }
}
