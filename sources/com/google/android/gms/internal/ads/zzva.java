package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
final class zzva {
    private final zzaea zza;
    private final Map zzb = new HashMap();
    private final Set zzc = new HashSet();
    private final Map zzd = new HashMap();
    private zzha zze;
    private final zzalt zzf;

    public zzva(zzaea zzaeaVar, zzalt zzaltVar) {
        this.zza = zzaeaVar;
        this.zzf = zzaltVar;
    }

    public final void zza(zzha zzhaVar) {
        if (zzhaVar != this.zze) {
            this.zze = zzhaVar;
            this.zzb.clear();
            this.zzd.clear();
        }
    }
}
