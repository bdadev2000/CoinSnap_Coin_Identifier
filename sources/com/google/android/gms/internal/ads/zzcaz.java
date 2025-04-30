package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcaz {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final Context zzc;
    private final zzcak zzd;

    public zzcaz(Context context, zzcak zzcakVar) {
        this.zzc = context;
        this.zzd = zzcakVar;
    }

    public final /* synthetic */ void zzb(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.zzd.zzd();
        }
    }

    public final synchronized void zzc(String str) {
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
            zzcay zzcayVar = new zzcay(this, str);
            this.zza.put(str, zzcayVar);
            sharedPreferences.registerOnSharedPreferenceChangeListener(zzcayVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(zzcax zzcaxVar) {
        this.zzb.add(zzcaxVar);
    }
}
