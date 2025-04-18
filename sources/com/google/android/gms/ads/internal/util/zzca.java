package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzbcn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzca {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final Context zzc;

    public zzca(Context context) {
        this.zzc = context;
    }

    public final synchronized void zzb(String str) {
        SharedPreferences sharedPreferences;
        if (this.zza.containsKey(str)) {
            return;
        }
        if (Objects.equals(str, "__default__")) {
            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.zzc);
        } else {
            sharedPreferences = this.zzc.getSharedPreferences(str, 0);
        }
        zzbz zzbzVar = new zzbz(this, str);
        this.zza.put(str, zzbzVar);
        sharedPreferences.registerOnSharedPreferenceChangeListener(zzbzVar);
    }

    public final void zzc() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkb)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        Map zzv = zzs.zzv((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkg));
        Iterator it = zzv.keySet().iterator();
        while (it.hasNext()) {
            zzb((String) it.next());
        }
        zzd(new zzby(zzv));
    }

    public final synchronized void zzd(zzby zzbyVar) {
        this.zzb.add(zzbyVar);
    }
}
