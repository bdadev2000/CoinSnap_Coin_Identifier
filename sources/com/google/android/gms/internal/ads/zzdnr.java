package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
final class zzdnr implements zzgfp {
    final /* synthetic */ zzdns zza;

    public zzdnr(zzdns zzdnsVar) {
        this.zza = zzdnsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfj)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            zzchd zzchdVar = (zzchd) list.get(0);
            if (zzchdVar != null) {
                this.zza.zzb(zzchdVar);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e4) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfj)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "omid native display exp");
            }
        }
    }
}
