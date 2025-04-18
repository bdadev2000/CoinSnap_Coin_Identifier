package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes3.dex */
final class zzbyb implements zzgee {
    final /* synthetic */ ua.b zza;

    public zzbyb(zzbyc zzbycVar, ua.b bVar) {
        this.zza = bVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        List list;
        list = zzbyc.zzc;
        list.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list;
        list = zzbyc.zzc;
        list.remove(this.zza);
    }
}
