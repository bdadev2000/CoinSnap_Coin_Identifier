package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzlh implements zzky {
    public final zzut zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzlh(zzva zzvaVar, boolean z2) {
        this.zza = new zzut(zzvaVar, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzky
    public final zzcc zza() {
        return this.zza.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzky
    public final Object zzb() {
        return this.zzb;
    }

    public final void zzc(int i2) {
        this.zzd = i2;
        this.zze = false;
        this.zzc.clear();
    }
}
