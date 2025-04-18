package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbyz implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzbza zza;
    private final String zzb;

    public zzbyz(zzbza zzbzaVar, String str) {
        this.zza = zzbzaVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<zzbyy> list;
        synchronized (this.zza) {
            list = this.zza.zzb;
            for (zzbyy zzbyyVar : list) {
                zzbyyVar.zza.zzb(zzbyyVar.zzb, sharedPreferences, this.zzb, str);
            }
        }
    }
}
