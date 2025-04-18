package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzdla {
    public static final zzdla zza = new zzdla(new zzdky());

    @Nullable
    private final zzbhd zzb;

    @Nullable
    private final zzbha zzc;

    @Nullable
    private final zzbhq zzd;

    @Nullable
    private final zzbhn zze;

    @Nullable
    private final zzbmp zzf;
    private final SimpleArrayMap zzg;
    private final SimpleArrayMap zzh;

    @Nullable
    public final zzbha zza() {
        return this.zzc;
    }

    @Nullable
    public final zzbhd zzb() {
        return this.zzb;
    }

    @Nullable
    public final zzbhg zzc(String str) {
        return (zzbhg) this.zzh.get(str);
    }

    @Nullable
    public final zzbhj zzd(String str) {
        return (zzbhj) this.zzg.get(str);
    }

    @Nullable
    public final zzbhn zze() {
        return this.zze;
    }

    @Nullable
    public final zzbhq zzf() {
        return this.zzd;
    }

    @Nullable
    public final zzbmp zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList(this.zzg.size());
        for (int i2 = 0; i2 < this.zzg.size(); i2++) {
            arrayList.add((String) this.zzg.g(i2));
        }
        return arrayList;
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

    private zzdla(zzdky zzdkyVar) {
        this.zzb = zzdkyVar.zza;
        this.zzc = zzdkyVar.zzb;
        this.zzd = zzdkyVar.zzc;
        this.zzg = new SimpleArrayMap(zzdkyVar.zzf);
        this.zzh = new SimpleArrayMap(zzdkyVar.zzg);
        this.zze = zzdkyVar.zzd;
        this.zzf = zzdkyVar.zze;
    }
}
