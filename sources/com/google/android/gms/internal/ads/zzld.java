package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class zzld implements zzku {
    public final zzum zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzld(zzut zzutVar, boolean z10) {
        this.zza = new zzum(zzutVar, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzku
    public final zzbv zza() {
        return this.zza.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzku
    public final Object zzb() {
        return this.zzb;
    }

    public final void zzc(int i10) {
        this.zzd = i10;
        this.zze = false;
        this.zzc.clear();
    }
}
