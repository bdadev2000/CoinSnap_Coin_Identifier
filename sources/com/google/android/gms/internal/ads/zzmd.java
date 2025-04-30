package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzmd implements zzlu {
    public final zzvj zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzmd(zzvq zzvqVar, boolean z8) {
        this.zza = new zzvj(zzvqVar, z8);
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    public final zzdc zza() {
        return this.zza.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    public final Object zzb() {
        return this.zzb;
    }

    public final void zzc(int i9) {
        this.zzd = i9;
        this.zze = false;
        this.zzc.clear();
    }
}
