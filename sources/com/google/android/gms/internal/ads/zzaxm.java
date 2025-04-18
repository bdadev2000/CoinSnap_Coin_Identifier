package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzaxm extends zzaxt {
    public zzaxm(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i10, int i11) {
        super(zzawfVar, "p9pmeac90yMVCcN4sojWc0dcIOIcXaFrjT0spFQThk7HqJv1zzltubfYUBxGBSKx", "zyTzUjCmOTi6owBt6QTGC9Xa/1geFdM1/vAgrH362Ug=", zzasfVar, i10, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.zzd) {
            zzawa zzawaVar = new zzawa((String) this.zze.invoke(null, new Object[0]));
            this.zzd.zzp(zzawaVar.zza.longValue());
            this.zzd.zzq(zzawaVar.zzb.longValue());
        }
    }
}
