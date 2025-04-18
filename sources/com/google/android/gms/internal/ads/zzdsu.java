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

/* loaded from: classes3.dex */
public class zzdsu {
    protected final Map zza;
    protected final Context zzb;
    protected final Executor zzc;
    protected final com.google.android.gms.ads.internal.util.client.zzr zzd;
    protected final boolean zze;
    private final CsiUrlBuilder zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final AtomicBoolean zzi;
    private final AtomicReference zzj;

    public zzdsu(Executor executor, com.google.android.gms.ads.internal.util.client.zzr zzrVar, CsiUrlBuilder csiUrlBuilder, Context context) {
        this.zza = new HashMap();
        this.zzi = new AtomicBoolean();
        this.zzj = new AtomicReference(new Bundle());
        this.zzc = executor;
        this.zzd = zzrVar;
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcd)).booleanValue();
        this.zzf = csiUrlBuilder;
        this.zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcg)).booleanValue();
        this.zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgP)).booleanValue();
        this.zzb = context;
    }

    private final void zza(Map map, boolean z10) {
        if (!map.isEmpty()) {
            if (map.isEmpty()) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Empty or null paramMap.");
            } else {
                if (!this.zzi.getAndSet(true)) {
                    final String str = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkh);
                    this.zzj.set(com.google.android.gms.ads.internal.util.zzac.zza(this.zzb, str, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.zzdst
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                            zzdsu.this.zzd(str, sharedPreferences, str2);
                        }
                    }));
                }
                Bundle bundle = (Bundle) this.zzj.get();
                for (String str2 : bundle.keySet()) {
                    map.put(str2, String.valueOf(bundle.get(str2)));
                }
            }
            final String generateUrl = this.zzf.generateUrl(map);
            com.google.android.gms.ads.internal.util.zze.zza(generateUrl);
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
            if (this.zze) {
                if (!z10 || this.zzg) {
                    if (!parseBoolean || this.zzh) {
                        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdss
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdsu.this.zzd.zza(generateUrl);
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
        return this.zzf.generateUrl(map);
    }

    public final ConcurrentHashMap zzc() {
        return new ConcurrentHashMap(this.zza);
    }

    public final /* synthetic */ void zzd(String str, SharedPreferences sharedPreferences, String str2) {
        this.zzj.set(com.google.android.gms.ads.internal.util.zzac.zzb(this.zzb, str));
    }

    public final void zze(Map map) {
        zza(map, true);
    }

    public final void zzf(Map map) {
        zza(map, false);
    }
}
