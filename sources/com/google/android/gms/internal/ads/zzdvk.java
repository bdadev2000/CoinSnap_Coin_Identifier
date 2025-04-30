package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class zzdvk {
    protected final Context zzc;
    protected final Executor zzd;
    protected final com.google.android.gms.ads.internal.util.client.zzr zze;
    private final CsiUrlBuilder zzg;
    protected final String zza = (String) zzbge.zzb.zze();
    protected final Map zzb = new HashMap();
    private final AtomicBoolean zzj = new AtomicBoolean();
    private final AtomicReference zzk = new AtomicReference(new Bundle());
    protected final boolean zzf = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbY)).booleanValue();
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcb)).booleanValue();
    private final boolean zzi = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhk)).booleanValue();

    public zzdvk(Executor executor, com.google.android.gms.ads.internal.util.client.zzr zzrVar, CsiUrlBuilder csiUrlBuilder, Context context) {
        this.zzd = executor;
        this.zze = zzrVar;
        this.zzg = csiUrlBuilder;
        this.zzc = context;
    }

    private final void zza(Map map, boolean z8) {
        if (!map.isEmpty()) {
            if (map.isEmpty()) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Empty or null paramMap.");
            } else {
                if (!this.zzj.getAndSet(true)) {
                    final String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkz);
                    this.zzk.set(com.google.android.gms.ads.internal.util.zzad.zza(this.zzc, str, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.zzdvj
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                            zzdvk.this.zzd(str, sharedPreferences, str2);
                        }
                    }));
                }
                Bundle bundle = (Bundle) this.zzk.get();
                for (String str2 : bundle.keySet()) {
                    map.put(str2, String.valueOf(bundle.get(str2)));
                }
            }
            final String generateUrl = this.zzg.generateUrl(map);
            com.google.android.gms.ads.internal.util.zze.zza(generateUrl);
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
            if (this.zzf) {
                if (!z8 || this.zzh) {
                    if (!parseBoolean || this.zzi) {
                        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvi
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdvk.this.zze.zza(generateUrl);
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zze("Empty paramMap.");
    }

    public final String zzb(Map map) {
        return this.zzg.generateUrl(map);
    }

    public final ConcurrentHashMap zzc() {
        return new ConcurrentHashMap(this.zzb);
    }

    public final /* synthetic */ void zzd(String str, SharedPreferences sharedPreferences, String str2) {
        this.zzk.set(com.google.android.gms.ads.internal.util.zzad.zzb(this.zzc, str));
    }

    public final void zze(Map map) {
        zza(map, true);
    }

    public final void zzf(Map map) {
        zza(map, false);
    }
}
