package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzeix {
    private final zzfgg zza;
    private final zzdqa zzb;
    private final zzdsm zzc;

    public zzeix(zzfgg zzfggVar, zzdqa zzdqaVar, zzdsm zzdsmVar) {
        this.zza = zzfggVar;
        this.zzb = zzdqaVar;
        this.zzc = zzdsmVar;
    }

    public final void zza(zzfew zzfewVar, zzfet zzfetVar, int i10, zzeff zzeffVar, long j3) {
        zzdpz zzdpzVar;
        zzdsl zza = this.zzc.zza();
        zza.zzd(zzfewVar);
        zza.zzc(zzfetVar);
        zza.zzb("action", "adapter_status");
        zza.zzb("adapter_l", String.valueOf(j3));
        zza.zzb("sc", Integer.toString(i10));
        if (zzeffVar != null) {
            zza.zzb("arec", Integer.toString(zzeffVar.zzb().zza));
            String zza2 = this.zza.zza(zzeffVar.getMessage());
            if (zza2 != null) {
                zza.zzb("areec", zza2);
            }
        }
        zzdqa zzdqaVar = this.zzb;
        Iterator it = zzfetVar.zzt.iterator();
        while (true) {
            if (it.hasNext()) {
                zzdpzVar = zzdqaVar.zza((String) it.next());
                if (zzdpzVar != null) {
                    break;
                }
            } else {
                zzdpzVar = null;
                break;
            }
        }
        if (zzdpzVar != null) {
            zza.zzb("ancn", zzdpzVar.zza);
            zzbru zzbruVar = zzdpzVar.zzb;
            if (zzbruVar != null) {
                zza.zzb("adapter_v", zzbruVar.toString());
            }
            zzbru zzbruVar2 = zzdpzVar.zzc;
            if (zzbruVar2 != null) {
                zza.zzb("adapter_sv", zzbruVar2.toString());
            }
        }
        zza.zzf();
    }
}
