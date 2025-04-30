package com.google.android.gms.ads.internal.util;

import android.content.SharedPreferences;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzce implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzcf zza;
    private final String zzb;

    public zzce(zzcf zzcfVar, String str) {
        this.zza = zzcfVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<zzcd> list;
        synchronized (this.zza) {
            try {
                list = this.zza.zzb;
                for (zzcd zzcdVar : list) {
                    String str2 = this.zzb;
                    Map map = zzcdVar.zza;
                    if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                        com.google.android.gms.ads.internal.zzu.zzo().zzi().zzJ(false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
