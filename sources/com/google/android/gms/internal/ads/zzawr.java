package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzawr extends zzaxt {
    public zzawr(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i10, int i11) {
        super(zzawfVar, "cASF9v3LVjFjcts3pzkxEpbZ/yZ0Z6rgUJw8wYZADCZYBHbsegUqurxqMOQQnwLa", "YV8d9qma0OL6XD+53oet9uRH00OzaYnpRo+iusl6DCM=", zzasfVar, i10, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzaa(3);
        try {
            int i10 = 1;
            boolean booleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
            zzasf zzasfVar = this.zzd;
            if (true == booleanValue) {
                i10 = 2;
            }
            zzasfVar.zzaa(i10);
        } catch (InvocationTargetException e2) {
            if (e2.getTargetException() instanceof Settings.SettingNotFoundException) {
            } else {
                throw e2;
            }
        }
    }
}
