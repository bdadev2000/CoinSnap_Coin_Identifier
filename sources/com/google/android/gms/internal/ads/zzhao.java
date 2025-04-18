package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzhao {
    static final zzhao zza = new zzhao(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc;
    private static volatile zzhao zzd;
    private final Map zze;

    public zzhao() {
        this.zze = new HashMap();
    }

    public static zzhao zza() {
        int i2 = zzhcz.zza;
        return zza;
    }

    public static zzhao zzb() {
        zzhao zzhaoVar = zzd;
        if (zzhaoVar != null) {
            return zzhaoVar;
        }
        synchronized (zzhao.class) {
            try {
                zzhao zzhaoVar2 = zzd;
                if (zzhaoVar2 != null) {
                    return zzhaoVar2;
                }
                int i2 = zzhcz.zza;
                zzhao zzb2 = zzhaw.zzb(zzhao.class);
                zzd = zzb2;
                return zzb2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzhbc zzc(zzhcp zzhcpVar, int i2) {
        return (zzhbc) this.zze.get(new zzhan(zzhcpVar, i2));
    }

    public zzhao(boolean z2) {
        this.zze = Collections.emptyMap();
    }
}
