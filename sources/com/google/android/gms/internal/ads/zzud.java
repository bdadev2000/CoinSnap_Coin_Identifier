package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzud {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private zzgc zzc;

    public zzud(zzacw zzacwVar, zzakg zzakgVar) {
    }

    public final void zza(zzgc zzgcVar) {
        if (zzgcVar != this.zzc) {
            this.zzc = zzgcVar;
            this.zza.clear();
            this.zzb.clear();
        }
    }
}
