package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjt;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes12.dex */
public class zzjg {
    static final zzjg zza = new zzjg(true);
    private static volatile boolean zzb = false;
    private static volatile zzjg zzc;
    private final Map<zza, zzjt.zzf<?, ?>> zzd;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
    /* loaded from: classes12.dex */
    private static final class zza {
        private final Object zza;
        private final int zzb;

        public final int hashCode() {
            return (System.identityHashCode(this.zza) * 65535) + this.zzb;
        }

        zza(Object obj, int i) {
            this.zza = obj;
            this.zzb = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zzaVar = (zza) obj;
            return this.zza == zzaVar.zza && this.zzb == zzaVar.zzb;
        }
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

    public final <ContainingType extends zzlc> zzjt.zzf<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (zzjt.zzf) this.zzd.get(new zza(containingtype, i));
    }

    zzjg() {
        this.zzd = new HashMap();
    }

    private zzjg(boolean z) {
        this.zzd = Collections.emptyMap();
    }
}
