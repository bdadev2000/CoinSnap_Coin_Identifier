package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class zzdaj extends zzddr implements zzcyu, zzczz {
    private final zzfgh zzb;
    private final AtomicBoolean zzc;

    public zzdaj(Set set, zzfgh zzfghVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfghVar;
    }

    private final void zzb() {
        com.google.android.gms.ads.internal.client.zzu zzuVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhv)).booleanValue() && this.zzc.compareAndSet(false, true) && (zzuVar = this.zzb.zzae) != null && zzuVar.zza == 3) {
            zzq(new zzddq() { // from class: com.google.android.gms.internal.ads.zzdai
                @Override // com.google.android.gms.internal.ads.zzddq
                public final void zza(Object obj) {
                    zzdaj.this.zza((zzdal) obj);
                }
            });
        }
    }

    public final /* synthetic */ void zza(zzdal zzdalVar) throws Exception {
        zzdalVar.zzh(this.zzb.zzae);
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void zzg() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final void zzr() {
        int i2 = this.zzb.zzb;
        if (i2 == 2 || i2 == 5 || i2 == 4 || i2 == 6 || i2 == 7) {
            zzb();
        }
    }
}
