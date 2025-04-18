package com.google.android.gms.ads.internal.util;

import android.content.SharedPreferences;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbz implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzca zza;
    private final String zzb;

    public zzbz(zzca zzcaVar, String str) {
        this.zza = zzcaVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<zzby> list;
        synchronized (this.zza) {
            list = this.zza.zzb;
            for (zzby zzbyVar : list) {
                String str2 = this.zzb;
                Map map = zzbyVar.zza;
                if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzi().zzE(false);
                }
            }
        }
    }
}
