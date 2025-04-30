package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzdvm {
    private final String zze;
    private final zzdvh zzf;
    private final List zzb = new ArrayList();
    private boolean zzc = false;
    private boolean zzd = false;
    private final com.google.android.gms.ads.internal.util.zzg zza = com.google.android.gms.ads.internal.zzu.zzo().zzi();

    public zzdvm(String str, zzdvh zzdvhVar) {
        this.zze = str;
        this.zzf = zzdvhVar;
    }

    private final Map zzg() {
        String str;
        Map zza = this.zzf.zza();
        zza.put("tms", Long.toString(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime(), 10));
        if (this.zza.zzS()) {
            str = "";
        } else {
            str = this.zze;
        }
        zza.put("tid", str);
        return zza;
    }

    public final synchronized void zza(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzca)).booleanValue()) {
            return;
        }
        Map zzg = zzg();
        zzg.put("action", "aaia");
        zzg.put("aair", "MalformedJson");
        this.zzb.add(zzg);
    }

    public final synchronized void zzb(String str, String str2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzca)).booleanValue()) {
            return;
        }
        Map zzg = zzg();
        zzg.put("action", "adapter_init_finished");
        zzg.put("ancn", str);
        zzg.put("rqe", str2);
        this.zzb.add(zzg);
    }

    public final synchronized void zzc(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzca)).booleanValue()) {
            return;
        }
        Map zzg = zzg();
        zzg.put("action", "adapter_init_started");
        zzg.put("ancn", str);
        this.zzb.add(zzg);
    }

    public final synchronized void zzd(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzca)).booleanValue()) {
            return;
        }
        Map zzg = zzg();
        zzg.put("action", "adapter_init_finished");
        zzg.put("ancn", str);
        this.zzb.add(zzg);
    }

    public final synchronized void zze() {
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzca)).booleanValue() && !this.zzd) {
                Map zzg = zzg();
                zzg.put("action", "init_finished");
                this.zzb.add(zzg);
                Iterator it = this.zzb.iterator();
                while (it.hasNext()) {
                    this.zzf.zzf((Map) it.next());
                }
                this.zzd = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzca)).booleanValue() && !this.zzc) {
            Map zzg = zzg();
            zzg.put("action", "init_started");
            this.zzb.add(zzg);
            this.zzc = true;
        }
    }
}
