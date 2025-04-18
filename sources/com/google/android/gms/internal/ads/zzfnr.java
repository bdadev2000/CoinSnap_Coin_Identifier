package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class zzfnr {
    private static final zzfnr zza = new zzfnr();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzfnr() {
    }

    public static zzfnr zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(zzfna zzfnaVar) {
        this.zzb.add(zzfnaVar);
    }

    public final void zze(zzfna zzfnaVar) {
        ArrayList arrayList = this.zzb;
        boolean zzg = zzg();
        arrayList.remove(zzfnaVar);
        this.zzc.remove(zzfnaVar);
        if (zzg && !zzg()) {
            zzfnz.zzb().zzg();
        }
    }

    public final void zzf(zzfna zzfnaVar) {
        ArrayList arrayList = this.zzc;
        boolean zzg = zzg();
        arrayList.add(zzfnaVar);
        if (!zzg) {
            zzfnz.zzb().zzf();
        }
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
