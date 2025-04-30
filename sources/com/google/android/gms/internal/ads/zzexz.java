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

/* loaded from: classes2.dex */
public final class zzexz {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfmn zzd;
    private final zzdvc zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzexz(Context context, Executor executor, Set set, zzfmn zzfmnVar, zzdvc zzdvcVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfmnVar;
        this.zze = zzdvcVar;
    }

    public final f4.c zza(final Object obj, @Nullable final Bundle bundle) {
        zzfmc zza = zzfmb.zza(this.zza, zzfmu.CUI_NAME_ADREQUEST_SIGNALS);
        zza.zzj();
        final ArrayList arrayList = new ArrayList(this.zzb.size());
        List arrayList2 = new ArrayList();
        zzbeg zzbegVar = zzbep.zzlM;
        if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbegVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbegVar)).split(","));
        }
        this.zzf = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue() && bundle != null) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
            if (obj instanceof Bundle) {
                bundle.putLong(zzdul.CLIENT_SIGNALS_START.zza(), currentTimeMillis);
            } else {
                bundle.putLong(zzdul.GMS_SIGNALS_START.zza(), currentTimeMillis);
            }
        }
        for (final zzexw zzexwVar : this.zzb) {
            if (!arrayList2.contains(String.valueOf(zzexwVar.zza()))) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzge)).booleanValue() || zzexwVar.zza() != 44) {
                    final long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
                    f4.c zzb = zzexwVar.zzb();
                    zzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexx
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzexz.this.zzb(elapsedRealtime, zzexwVar, bundle2);
                        }
                    }, zzcci.zzf);
                    arrayList.add(zzb);
                }
            }
        }
        f4.c zza2 = zzgft.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzexy
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
                    zzexv zzexvVar = (zzexv) ((f4.c) it.next()).get();
                    if (zzexvVar != null) {
                        zzexvVar.zzj(obj2);
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue() && (bundle3 = bundle) != null) {
                    Bundle bundle4 = bundle2;
                    long currentTimeMillis2 = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
                    if (obj2 instanceof Bundle) {
                        bundle3.putLong(zzdul.CLIENT_SIGNALS_END.zza(), currentTimeMillis2);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                    } else {
                        bundle3.putLong(zzdul.GMS_SIGNALS_END.zza(), currentTimeMillis2);
                        bundle3.putBundle("gms_sig_latency_key", bundle4);
                    }
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfmq.zza()) {
            zzfmm.zzb(zza2, this.zzd, zza);
        }
        return zza2;
    }

    public final void zzb(long j7, zzexw zzexwVar, Bundle bundle) {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - j7;
        if (((Boolean) zzbgm.zza.zze()).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal runtime (ms) : " + zzfyv.zzc(zzexwVar.getClass().getCanonicalName()) + " = " + elapsedRealtime);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzce)).booleanValue()) {
                synchronized (this) {
                    bundle.putLong("sig" + zzexwVar.zza(), elapsedRealtime);
                }
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcb)).booleanValue()) {
            return;
        }
        zzdvb zza = this.zze.zza();
        zza.zzb("action", "lat_ms");
        zza.zzb("lat_grp", "sig_lat_grp");
        zza.zzb("lat_id", String.valueOf(zzexwVar.zza()));
        zza.zzb("clat_ms", String.valueOf(elapsedRealtime));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcc)).booleanValue()) {
            synchronized (this) {
                this.zzg++;
            }
            zza.zzb("seq_num", com.google.android.gms.ads.internal.zzu.zzo().zzh().zzd());
            synchronized (this) {
                try {
                    if (this.zzg == this.zzb.size() && this.zzf != 0) {
                        this.zzg = 0;
                        String valueOf = String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzf);
                        if (zzexwVar.zza() > 39 && zzexwVar.zza() < 52) {
                            zza.zzb("lat_gmssg", valueOf);
                        } else {
                            zza.zzb("lat_clsg", valueOf);
                        }
                    }
                } finally {
                }
            }
        }
        zza.zzg();
    }
}
