package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzewc {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfkl zzd;
    private final zzdsm zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzewc(Context context, Executor executor, Set set, zzfkl zzfklVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfklVar;
        this.zze = zzdsmVar;
    }

    public final ua.b zza(final Object obj, @Nullable final Bundle bundle) {
        zzfka zza = zzfjz.zza(this.zza, 8);
        zza.zzi();
        final ArrayList arrayList = new ArrayList(this.zzb.size());
        List arrayList2 = new ArrayList();
        zzbce zzbceVar = zzbcn.zzlt;
        if (!((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).split(","));
        }
        this.zzf = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzci)).booleanValue() && bundle != null) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            if (obj instanceof Bundle) {
                bundle.putLong(zzdrv.CLIENT_SIGNALS_START.zza(), currentTimeMillis);
            } else {
                bundle.putLong(zzdrv.GMS_SIGNALS_START.zza(), currentTimeMillis);
            }
        }
        for (final zzevz zzevzVar : this.zzb) {
            if (!arrayList2.contains(String.valueOf(zzevzVar.zza()))) {
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
                ua.b zzb = zzevzVar.zzb();
                zzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewa
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzewc.this.zzb(elapsedRealtime, zzevzVar, bundle2);
                    }
                }, zzcaj.zzf);
                arrayList.add(zzb);
            }
        }
        ua.b zza2 = zzgei.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzewb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2;
                Bundle bundle3;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzevy zzevyVar = (zzevy) ((ua.b) it.next()).get();
                    if (zzevyVar != null) {
                        zzevyVar.zzj(obj2);
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzci)).booleanValue() && (bundle3 = bundle) != null) {
                    Bundle bundle4 = bundle2;
                    long currentTimeMillis2 = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
                    if (obj2 instanceof Bundle) {
                        bundle3.putLong(zzdrv.CLIENT_SIGNALS_END.zza(), currentTimeMillis2);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                    } else {
                        bundle3.putLong(zzdrv.GMS_SIGNALS_END.zza(), currentTimeMillis2);
                        bundle3.putBundle("gms_sig_latency_key", bundle4);
                    }
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfko.zza()) {
            zzfkk.zza(zza2, this.zzd, zza);
        }
        return zza2;
    }

    public final void zzb(long j3, zzevz zzevzVar, Bundle bundle) {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - j3;
        if (((Boolean) zzbep.zza.zze()).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal runtime (ms) : " + zzfxf.zzc(zzevzVar.getClass().getCanonicalName()) + " = " + elapsedRealtime);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzci)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcm)).booleanValue()) {
                synchronized (this) {
                    bundle.putLong("sig" + zzevzVar.zza(), elapsedRealtime);
                }
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcg)).booleanValue()) {
            return;
        }
        zzdsl zza = this.zze.zza();
        zza.zzb("action", "lat_ms");
        zza.zzb("lat_grp", "sig_lat_grp");
        zza.zzb("lat_id", String.valueOf(zzevzVar.zza()));
        zza.zzb("clat_ms", String.valueOf(elapsedRealtime));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzch)).booleanValue()) {
            synchronized (this) {
                this.zzg++;
            }
            zza.zzb("seq_num", com.google.android.gms.ads.internal.zzv.zzp().zzh().zzd());
            synchronized (this) {
                if (this.zzg == this.zzb.size() && this.zzf != 0) {
                    this.zzg = 0;
                    String valueOf = String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zzf);
                    if (zzevzVar.zza() > 39 && zzevzVar.zza() < 52) {
                        zza.zzb("lat_gmssg", valueOf);
                    } else {
                        zza.zzb("lat_clsg", valueOf);
                    }
                }
            }
        }
        zza.zzg();
    }
}
