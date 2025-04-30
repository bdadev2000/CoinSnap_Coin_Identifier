package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzdbu extends zzdez implements zzdaf, zzdbk {
    private final zzfgt zzb;
    private final AtomicBoolean zzc;

    public zzdbu(Set set, zzfgt zzfgtVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfgtVar;
    }

    private final void zzb() {
        com.google.android.gms.ads.internal.client.zzs zzsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhT)).booleanValue() && this.zzc.compareAndSet(false, true) && (zzsVar = this.zzb.zzaf) != null && zzsVar.zza == 3) {
            zzq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzdbt
                @Override // com.google.android.gms.internal.ads.zzdey
                public final void zza(Object obj) {
                    zzdbu.this.zza((zzdbw) obj);
                }
            });
        }
    }

    public final /* synthetic */ void zza(zzdbw zzdbwVar) throws Exception {
        zzdbwVar.zzh(this.zzb.zzaf);
    }

    @Override // com.google.android.gms.internal.ads.zzdbk
    public final void zzg() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdaf
    public final void zzr() {
        int i9 = this.zzb.zzb;
        if (i9 != 2 && i9 != 5 && i9 != 4 && i9 != 6 && i9 != 7) {
            return;
        }
        zzb();
    }
}
