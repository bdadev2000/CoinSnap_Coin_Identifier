package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzbep;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzcf {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final Context zzc;

    public zzcf(Context context) {
        this.zzc = context;
    }

    public final synchronized void zzb(String str) {
        SharedPreferences sharedPreferences;
        try {
            if (this.zza.containsKey(str)) {
                return;
            }
            if (Objects.equals(str, "__default__")) {
                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.zzc);
            } else {
                sharedPreferences = this.zzc.getSharedPreferences(str, 0);
            }
            zzce zzceVar = new zzce(this, str);
            this.zza.put(str, zzceVar);
            sharedPreferences.registerOnSharedPreferenceChangeListener(zzceVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zzc() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkt)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        Map zzv = zzt.zzv((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzky));
        Iterator it = zzv.keySet().iterator();
        while (it.hasNext()) {
            zzb((String) it.next());
        }
        zzd(new zzcd(zzv));
    }

    public final synchronized void zzd(zzcd zzcdVar) {
        this.zzb.add(zzcdVar);
    }
}
