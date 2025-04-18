package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbze {

    @GuardedBy
    private final Map zza = new HashMap();

    @GuardedBy
    private final List zzb = new ArrayList();
    private final Context zzc;
    private final zzbyp zzd;

    public zzbze(Context context, zzbyp zzbypVar) {
        this.zzc = context;
        this.zzd = zzbypVar;
    }

    public final /* synthetic */ void zzb(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.zzd.zzd();
        }
    }

    public final synchronized void zzc(String str) {
        try {
            if (this.zza.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(str, 0);
            zzbzd zzbzdVar = new zzbzd(this, str);
            this.zza.put(str, zzbzdVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzbzdVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(zzbzc zzbzcVar) {
        this.zzb.add(zzbzcVar);
    }
}
