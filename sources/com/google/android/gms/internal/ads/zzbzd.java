package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbzd implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzbze zza;
    private final String zzb;

    public zzbzd(zzbze zzbzeVar, String str) {
        this.zza = zzbzeVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<zzbzc> list;
        synchronized (this.zza) {
            try {
                list = this.zza.zzb;
                for (zzbzc zzbzcVar : list) {
                    zzbzcVar.zza.zzb(zzbzcVar.zzb, sharedPreferences, this.zzb, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
