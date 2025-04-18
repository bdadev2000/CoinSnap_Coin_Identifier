package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzawp extends zzaxt {
    private final Activity zzh;
    private final View zzi;

    public zzawp(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i10, int i11, View view, Activity activity) {
        super(zzawfVar, "s0uE9hdlawP+tYGHYSI6i0EWhWy7Tdc9XW5A0finsHWGrmLjBRDuDmlHo7fmD8mf", "0+4i1BfON/tZfr/zJSlwHIdubE7ug8Met8dVp0E6y4I=", zzasfVar, i10, 62);
        this.zzi = view;
        this.zzh = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi == null) {
            return;
        }
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcI)).booleanValue();
        Object[] objArr = (Object[]) this.zze.invoke(null, this.zzi, this.zzh, Boolean.valueOf(booleanValue));
        synchronized (this.zzd) {
            this.zzd.zzc(((Long) objArr[0]).longValue());
            this.zzd.zze(((Long) objArr[1]).longValue());
            if (booleanValue) {
                this.zzd.zzd((String) objArr[2]);
            }
        }
    }
}
