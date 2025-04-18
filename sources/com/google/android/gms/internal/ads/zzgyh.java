package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgyh {
    static final zzgyh zza = new zzgyh(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzgyh zzd;
    private final Map zze;

    public zzgyh() {
        this.zze = new HashMap();
    }

    public static zzgyh zza() {
        int i10 = zzhas.zza;
        return zza;
    }

    public static zzgyh zzb() {
        zzgyh zzgyhVar = zzd;
        if (zzgyhVar != null) {
            return zzgyhVar;
        }
        synchronized (zzgyh.class) {
            zzgyh zzgyhVar2 = zzd;
            if (zzgyhVar2 != null) {
                return zzgyhVar2;
            }
            int i10 = zzhas.zza;
            zzgyh zzb2 = zzgyp.zzb(zzgyh.class);
            zzd = zzb2;
            return zzb2;
        }
    }

    public final zzgyv zzc(zzhai zzhaiVar, int i10) {
        return (zzgyv) this.zze.get(new zzgyg(zzhaiVar, i10));
    }

    public zzgyh(boolean z10) {
        this.zze = Collections.emptyMap();
    }
}
