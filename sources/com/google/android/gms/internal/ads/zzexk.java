package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzexk {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfma zzd;
    private final zzdud zze;
    private long zzf = 0;

    @GuardedBy
    private int zzg = 0;

    public zzexk(Context context, Executor executor, Set set, zzfma zzfmaVar, zzdud zzdudVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfmaVar;
        this.zze = zzdudVar;
    }

    public final ListenableFuture zza(final Object obj, @Nullable final Bundle bundle) {
        zzflp zza = zzflo.zza(this.zza, 8);
        zza.zzi();
        final ArrayList arrayList = new ArrayList(this.zzb.size());
        List arrayList2 = new ArrayList();
        zzbcm zzbcmVar = zzbcv.zzls;
        if (!((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).split(","));
        }
        this.zzf = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcf)).booleanValue() && bundle != null) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
            if (obj instanceof Bundle) {
                bundle.putLong(zzdtm.CLIENT_SIGNALS_START.zza(), currentTimeMillis);
            } else {
                bundle.putLong(zzdtm.GMS_SIGNALS_START.zza(), currentTimeMillis);
            }
        }
        for (final zzexh zzexhVar : this.zzb) {
            if (!arrayList2.contains(String.valueOf(zzexhVar.zza()))) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfK)).booleanValue() || zzexhVar.zza() != 44) {
                    final long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
                    ListenableFuture zzb = zzexhVar.zzb();
                    zzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzexk.this.zzb(elapsedRealtime, zzexhVar, bundle2);
                        }
                    }, zzcan.zzf);
                    arrayList.add(zzb);
                }
            }
        }
        ListenableFuture zza2 = zzgfo.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzexj
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
                    zzexg zzexgVar = (zzexg) ((ListenableFuture) it.next()).get();
                    if (zzexgVar != null) {
                        zzexgVar.zzj(obj2);
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcf)).booleanValue() && (bundle3 = bundle) != null) {
                    Bundle bundle4 = bundle2;
                    long currentTimeMillis2 = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
                    if (obj2 instanceof Bundle) {
                        bundle3.putLong(zzdtm.CLIENT_SIGNALS_END.zza(), currentTimeMillis2);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                    } else {
                        bundle3.putLong(zzdtm.GMS_SIGNALS_END.zza(), currentTimeMillis2);
                        bundle3.putBundle("gms_sig_latency_key", bundle4);
                    }
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfmd.zza()) {
            zzflz.zza(zza2, this.zzd, zza);
        }
        return zza2;
    }

    public final void zzb(long j2, zzexh zzexhVar, Bundle bundle) {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - j2;
        if (((Boolean) zzbet.zza.zze()).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal runtime (ms) : " + zzfyo.zzc(zzexhVar.getClass().getCanonicalName()) + " = " + elapsedRealtime);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcf)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcj)).booleanValue()) {
                synchronized (this) {
                    bundle.putLong("sig" + zzexhVar.zza(), elapsedRealtime);
                }
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcd)).booleanValue()) {
            zzduc zza = this.zze.zza();
            zza.zzb("action", "lat_ms");
            zza.zzb("lat_grp", "sig_lat_grp");
            zza.zzb("lat_id", String.valueOf(zzexhVar.zza()));
            zza.zzb("clat_ms", String.valueOf(elapsedRealtime));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzce)).booleanValue()) {
                synchronized (this) {
                    this.zzg++;
                }
                zza.zzb("seq_num", com.google.android.gms.ads.internal.zzu.zzo().zzh().zzd());
                synchronized (this) {
                    try {
                        if (this.zzg == this.zzb.size() && this.zzf != 0) {
                            this.zzg = 0;
                            String valueOf = String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzf);
                            if (zzexhVar.zza() <= 39 || zzexhVar.zza() >= 52) {
                                zza.zzb("lat_clsg", valueOf);
                            } else {
                                zza.zzb("lat_gmssg", valueOf);
                            }
                        }
                    } finally {
                    }
                }
            }
            zza.zzg();
        }
    }
}
