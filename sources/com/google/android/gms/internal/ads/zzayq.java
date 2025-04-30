package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzayq extends zzazs {
    public zzayq(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i9, int i10) {
        super(zzayeVar, "d7YRusR2mxxBt1bBYjK2gXVvJl/MfqFw2IiZZVeFOFqksQBErGXLOKgf56kYtWpK", "q4VBjxb/Ij/RcUKEcmQK+TpC64QFNLpq6sfIawaWN1g=", zzatpVar, i9, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzavc zzavcVar;
        this.zze.zzf(zzavc.ENUM_FAILURE);
        try {
            boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
            zzatp zzatpVar = this.zze;
            if (booleanValue) {
                zzavcVar = zzavc.ENUM_TRUE;
            } else {
                zzavcVar = zzavc.ENUM_FALSE;
            }
            zzatpVar.zzf(zzavcVar);
        } catch (InvocationTargetException e4) {
            if (e4.getTargetException() instanceof Settings.SettingNotFoundException) {
            } else {
                throw e4;
            }
        }
    }
}
