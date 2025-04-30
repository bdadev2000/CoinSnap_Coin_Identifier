package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzazb extends zzazs {
    public zzazb(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i9, int i10) {
        super(zzayeVar, "SHfJbyMgI7MrHewwYoTmYsM7CTkziBSZ0pvzhPCRWcLGoNw6AaEZWLqlKa0dpKuD", "SxHy+zpC+eGmQUPW4BYYcldQdVxiSSVnY0gIrWauGKU=", zzatpVar, i9, 76);
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzavc zzavcVar;
        if (((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue()) {
            zzavcVar = zzavc.ENUM_TRUE;
        } else {
            zzavcVar = zzavc.ENUM_FALSE;
        }
        this.zze.zzC(zzavcVar);
    }
}
