package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import x.l;

/* loaded from: classes2.dex */
public final class zzdme {
    public static final zzdme zza = new zzdme(new zzdmc());

    @Nullable
    private final zzbiw zzb;

    @Nullable
    private final zzbit zzc;

    @Nullable
    private final zzbjj zzd;

    @Nullable
    private final zzbjg zze;

    @Nullable
    private final zzboi zzf;
    private final l zzg;
    private final l zzh;

    @Nullable
    public final zzbit zza() {
        return this.zzc;
    }

    @Nullable
    public final zzbiw zzb() {
        return this.zzb;
    }

    @Nullable
    public final zzbiz zzc(String str) {
        return (zzbiz) this.zzh.getOrDefault(str, null);
    }

    @Nullable
    public final zzbjc zzd(String str) {
        return (zzbjc) this.zzg.getOrDefault(str, null);
    }

    @Nullable
    public final zzbjg zze() {
        return this.zze;
    }

    @Nullable
    public final zzbjj zzf() {
        return this.zzd;
    }

    @Nullable
    public final zzboi zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList(this.zzg.f24086d);
        int i9 = 0;
        while (true) {
            l lVar = this.zzg;
            if (i9 < lVar.f24086d) {
                arrayList.add((String) lVar.h(i9));
                i9++;
            } else {
                return arrayList;
            }
        }
    }

    public final ArrayList zzi() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    private zzdme(zzdmc zzdmcVar) {
        this.zzb = zzdmcVar.zza;
        this.zzc = zzdmcVar.zzb;
        this.zzd = zzdmcVar.zzc;
        this.zzg = new l(zzdmcVar.zzf);
        this.zzh = new l(zzdmcVar.zzg);
        this.zze = zzdmcVar.zzd;
        this.zzf = zzdmcVar.zze;
    }
}
