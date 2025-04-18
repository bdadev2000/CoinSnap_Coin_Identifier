package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjt;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class zzjg {
    static final zzjg zza = new zzjg(true);
    private static volatile boolean zzb = false;
    private static volatile zzjg zzc;
    private final Map<zza, zzjt.zzf<?, ?>> zzd;

    /* loaded from: classes3.dex */
    public static final class zza {
        private final Object zza;
        private final int zzb;

        public zza(Object obj, int i10) {
            this.zza = obj;
            this.zzb = i10;
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

    public zzjg() {
        this.zzd = new HashMap();
    }

    public static zzjg zza() {
        zzjg zzjgVar = zzc;
        if (zzjgVar != null) {
            return zzjgVar;
        }
        synchronized (zzjg.class) {
            zzjg zzjgVar2 = zzc;
            if (zzjgVar2 != null) {
                return zzjgVar2;
            }
            zzjg zza2 = zzjr.zza(zzjg.class);
            zzc = zza2;
            return zza2;
        }
    }

    private zzjg(boolean z10) {
        this.zzd = Collections.emptyMap();
    }

    public final <ContainingType extends zzlc> zzjt.zzf<ContainingType, ?> zza(ContainingType containingtype, int i10) {
        return (zzjt.zzf) this.zzd.get(new zza(containingtype, i10));
    }
}
