package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzej {
    static final zzej zza = new zzej(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc;
    private static volatile zzej zzd;
    private final Map zze;

    public zzej() {
        this.zze = new HashMap();
    }

    public static zzej zza() {
        zzej zzejVar = zzd;
        if (zzejVar != null) {
            return zzejVar;
        }
        synchronized (zzej.class) {
            try {
                zzej zzejVar2 = zzd;
                if (zzejVar2 != null) {
                    return zzejVar2;
                }
                zzej zzb2 = zzer.zzb(zzej.class);
                zzd = zzb2;
                return zzb2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzev zzb(zzgc zzgcVar, int i2) {
        return (zzev) this.zze.get(new zzei(zzgcVar, i2));
    }

    public zzej(boolean z2) {
        this.zze = Collections.emptyMap();
    }
}
