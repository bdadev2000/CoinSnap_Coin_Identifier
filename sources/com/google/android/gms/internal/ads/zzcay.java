package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcay implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzcaz zza;
    private final String zzb;

    public zzcay(zzcaz zzcazVar, String str) {
        this.zza = zzcazVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<zzcax> list;
        synchronized (this.zza) {
            try {
                list = this.zza.zzb;
                for (zzcax zzcaxVar : list) {
                    zzcaxVar.zza.zzb(zzcaxVar.zzb, sharedPreferences, this.zzb, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
