package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class zzfpe {
    private static final zzfpe zza = new zzfpe();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzfpe() {
    }

    public static zzfpe zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(zzfon zzfonVar) {
        this.zzb.add(zzfonVar);
    }

    public final void zze(zzfon zzfonVar) {
        ArrayList arrayList = this.zzb;
        boolean zzg = zzg();
        arrayList.remove(zzfonVar);
        this.zzc.remove(zzfonVar);
        if (zzg && !zzg()) {
            zzfpm.zzb().zzg();
        }
    }

    public final void zzf(zzfon zzfonVar) {
        ArrayList arrayList = this.zzc;
        boolean zzg = zzg();
        arrayList.add(zzfonVar);
        if (!zzg) {
            zzfpm.zzb().zzf();
        }
    }

    public final boolean zzg() {
        if (this.zzc.size() > 0) {
            return true;
        }
        return false;
    }
}
