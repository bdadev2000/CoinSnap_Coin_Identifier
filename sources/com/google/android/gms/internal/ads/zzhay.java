package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzhay {
    static final zzhay zza = new zzhay(true);
    private static volatile boolean zzb = false;
    private static volatile zzhay zzc;
    private final Map zzd;

    public zzhay() {
        this.zzd = new HashMap();
    }

    public static zzhay zza() {
        return zza;
    }

    public static zzhay zzb() {
        zzhay zzhayVar = zzc;
        if (zzhayVar != null) {
            return zzhayVar;
        }
        synchronized (zzhay.class) {
            try {
                zzhay zzhayVar2 = zzc;
                if (zzhayVar2 != null) {
                    return zzhayVar2;
                }
                zzhay zzb2 = zzhbg.zzb(zzhay.class);
                zzc = zzb2;
                return zzb2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzhbm zzc(zzhde zzhdeVar, int i9) {
        return (zzhbm) this.zzd.get(new zzhax(zzhdeVar, i9));
    }

    public zzhay(boolean z8) {
        this.zzd = Collections.emptyMap();
    }
}
