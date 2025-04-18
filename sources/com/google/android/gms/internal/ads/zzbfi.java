package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzbfi extends zzbfq {
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

    public zzbfi(String str, List list, Integer num, Integer num2, Integer num3, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        int i14;
        this.zzd = str;
        for (int i15 = 0; i15 < list.size(); i15++) {
            zzbfl zzbflVar = (zzbfl) list.get(i15);
            this.zze.add(zzbflVar);
            this.zzf.add(zzbflVar);
        }
        if (num != null) {
            i12 = num.intValue();
        } else {
            i12 = zza;
        }
        this.zzg = i12;
        if (num2 != null) {
            i13 = num2.intValue();
        } else {
            i13 = zzb;
        }
        this.zzh = i13;
        if (num3 != null) {
            i14 = num3.intValue();
        } else {
            i14 = 12;
        }
        this.zzi = i14;
        this.zzj = i10;
        this.zzk = i11;
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

    @Override // com.google.android.gms.internal.ads.zzbfr
    public final String zzg() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbfr
    public final List zzh() {
        return this.zzf;
    }

    public final List zzi() {
        return this.zze;
    }
}
