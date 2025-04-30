package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbhf extends zzbhn {
    static final int zza;
    static final int zzb;
    private static final int zzc;
    private final String zzd;
    private final List zze = new ArrayList();
    private final List zzf = new ArrayList();
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;

    static {
        int rgb = Color.rgb(12, 174, 206);
        zzc = rgb;
        zza = Color.rgb(204, 204, 204);
        zzb = rgb;
    }

    public zzbhf(String str, List list, Integer num, Integer num2, Integer num3, int i9, int i10, boolean z8) {
        int i11;
        int i12;
        int i13;
        this.zzd = str;
        for (int i14 = 0; i14 < list.size(); i14++) {
            zzbhi zzbhiVar = (zzbhi) list.get(i14);
            this.zze.add(zzbhiVar);
            this.zzf.add(zzbhiVar);
        }
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = zza;
        }
        this.zzg = i11;
        if (num2 != null) {
            i12 = num2.intValue();
        } else {
            i12 = zzb;
        }
        this.zzh = i12;
        if (num3 != null) {
            i13 = num3.intValue();
        } else {
            i13 = 12;
        }
        this.zzi = i13;
        this.zzj = i9;
        this.zzk = i10;
    }

    public final int zzb() {
        return this.zzj;
    }

    public final int zzc() {
        return this.zzk;
    }

    public final int zzd() {
        return this.zzg;
    }

    public final int zze() {
        return this.zzh;
    }

    public final int zzf() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzbho
    public final String zzg() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbho
    public final List zzh() {
        return this.zzf;
    }

    public final List zzi() {
        return this.zze;
    }
}
