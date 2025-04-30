package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzazh extends zzazs {
    public zzazh(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i9, int i10) {
        super(zzayeVar, "0njjbCFUq6vJ1UgnErUI7KEtLgZLN7V9IJ5yZ3QtzXmjMaTjzKInpeDNakYTgh0P", "C8NIMy/t/HZjKrbJt0Xe/Cv+czK1jvEhHHQsIVfXSJE=", zzatpVar, i9, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzavc zzavcVar;
        try {
            boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
            zzatp zzatpVar = this.zze;
            if (booleanValue) {
                zzavcVar = zzavc.ENUM_TRUE;
            } else {
                zzavcVar = zzavc.ENUM_FALSE;
            }
            zzatpVar.zzI(zzavcVar);
        } catch (InvocationTargetException unused) {
            this.zze.zzI(zzavc.ENUM_FAILURE);
        }
    }
}
