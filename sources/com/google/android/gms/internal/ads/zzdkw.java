package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes3.dex */
final class zzdkw implements zzgee {
    final /* synthetic */ zzdkx zza;

    public zzdkw(zzdkx zzdkxVar) {
        this.zza = zzdkxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfl)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th2, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            zzcfk zzcfkVar = (zzcfk) list.get(0);
            if (zzcfkVar != null) {
                this.zza.zzb(zzcfkVar);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfl)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "omid native display exp");
            }
        }
    }
}
