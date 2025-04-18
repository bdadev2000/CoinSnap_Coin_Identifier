package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzcyv extends zzdcc implements zzcxg, zzcyl {
    private final zzfet zzb;
    private final AtomicBoolean zzc;

    public zzcyv(Set set, zzfet zzfetVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfetVar;
    }

    private final void zzb() {
        com.google.android.gms.ads.internal.client.zzu zzuVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhx)).booleanValue() && this.zzc.compareAndSet(false, true) && (zzuVar = this.zzb.zzae) != null && zzuVar.zza == 3) {
            zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzcyu
                @Override // com.google.android.gms.internal.ads.zzdcb
                public final void zza(Object obj) {
                    zzcyv.this.zza((zzcyx) obj);
                }
            });
        }
    }

    public final /* synthetic */ void zza(zzcyx zzcyxVar) throws Exception {
        zzcyxVar.zzh(this.zzb.zzae);
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final void zzg() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzr() {
        int i10 = this.zzb.zzb;
        if (i10 == 2 || i10 == 5 || i10 == 4 || i10 == 6 || i10 == 7) {
            zzb();
        }
    }
}
