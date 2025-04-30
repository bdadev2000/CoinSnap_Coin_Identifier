package com.google.android.gms.measurement.internal;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgy implements com.google.android.gms.internal.measurement.zzv {
    private final /* synthetic */ zzgt zza;

    public zzgy(zzgt zzgtVar) {
        this.zza = zzgtVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public final void zza(com.google.android.gms.internal.measurement.zzs zzsVar, String str, List<String> list, boolean z8, boolean z9) {
        zzfy zzc;
        int i9 = zzha.zza[zzsVar.ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        zzc = this.zza.zzj().zzn();
                    } else {
                        zzc = this.zza.zzj().zzp();
                    }
                } else if (z8) {
                    zzc = this.zza.zzj().zzw();
                } else if (!z9) {
                    zzc = this.zza.zzj().zzv();
                } else {
                    zzc = this.zza.zzj().zzu();
                }
            } else if (z8) {
                zzc = this.zza.zzj().zzm();
            } else if (!z9) {
                zzc = this.zza.zzj().zzh();
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
