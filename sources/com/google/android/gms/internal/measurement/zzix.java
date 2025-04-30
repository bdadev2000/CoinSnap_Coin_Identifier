package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class zzix {
    static final zzix zza = new zzix(true);
    private static volatile boolean zzb = false;
    private static volatile zzix zzc;
    private final Map<zza, zzjk.zzf<?, ?>> zzd;

    /* loaded from: classes2.dex */
    public static final class zza {
        private final Object zza;
        private final int zzb;

        public zza(Object obj, int i9) {
            this.zza = obj;
            this.zzb = i9;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zzaVar = (zza) obj;
            if (this.zza != zzaVar.zza || this.zzb != zzaVar.zzb) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.zza) * 65535) + this.zzb;
        }
    }

    public zzix() {
        this.zzd = new HashMap();
    }

    public static zzix zza() {
        zzix zzixVar = zzc;
        if (zzixVar != null) {
            return zzixVar;
        }
        synchronized (zzix.class) {
            try {
                zzix zzixVar2 = zzc;
                if (zzixVar2 != null) {
                    return zzixVar2;
                }
                zzix zza2 = zzji.zza(zzix.class);
                zzc = zza2;
                return zza2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private zzix(boolean z8) {
        this.zzd = Collections.emptyMap();
    }

    public final <ContainingType extends zzkt> zzjk.zzf<ContainingType, ?> zza(ContainingType containingtype, int i9) {
        return (zzjk.zzf) this.zzd.get(new zza(containingtype, i9));
    }
}
