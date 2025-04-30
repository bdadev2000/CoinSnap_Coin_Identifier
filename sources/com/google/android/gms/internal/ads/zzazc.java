package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzazc extends zzazs {
    private final zzaxw zzi;

    public zzazc(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i9, int i10, zzaxw zzaxwVar) {
        super(zzayeVar, "QcEEfK1PwFv2Eb+NZQ+4kWKAUUVvycYqoBzmAjBexJV/sKEjaFlajeD5MAZYWXy5", "361aY1ErIwpwsXwpamiiDSCpkl/IcdBM93dd8sW9a/Y=", zzatpVar, i9, 94);
        this.zzi = zzaxwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int intValue = ((Integer) this.zzf.invoke(null, this.zzi.zza())).intValue();
        synchronized (this.zze) {
            this.zze.zzD(zzauh.zzb(intValue));
        }
    }
}
