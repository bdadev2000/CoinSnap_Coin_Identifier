package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import r.k;

/* loaded from: classes3.dex */
public final class zzdjj {
    public static final zzdjj zza = new zzdjj(new zzdjh());

    @Nullable
    private final zzbgz zzb;

    @Nullable
    private final zzbgw zzc;

    @Nullable
    private final zzbhm zzd;

    @Nullable
    private final zzbhj zze;

    @Nullable
    private final zzbmk zzf;
    private final k zzg;
    private final k zzh;

    @Nullable
    public final zzbgw zza() {
        return this.zzc;
    }

    @Nullable
    public final zzbgz zzb() {
        return this.zzb;
    }

    @Nullable
    public final zzbhc zzc(String str) {
        return (zzbhc) this.zzh.getOrDefault(str, null);
    }

    @Nullable
    public final zzbhf zzd(String str) {
        return (zzbhf) this.zzg.getOrDefault(str, null);
    }

    @Nullable
    public final zzbhj zze() {
        return this.zze;
    }

    @Nullable
    public final zzbhm zzf() {
        return this.zzd;
    }

    @Nullable
    public final zzbmk zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList(this.zzg.f23955d);
        int i10 = 0;
        while (true) {
            k kVar = this.zzg;
            if (i10 < kVar.f23955d) {
                arrayList.add((String) kVar.h(i10));
                i10++;
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

    private zzdjj(zzdjh zzdjhVar) {
        this.zzb = zzdjhVar.zza;
        this.zzc = zzdjhVar.zzb;
        this.zzd = zzdjhVar.zzc;
        this.zzg = new k(zzdjhVar.zzf);
        this.zzh = new k(zzdjhVar.zzg);
        this.zze = zzdjhVar.zzd;
        this.zzf = zzdjhVar.zze;
    }
}
