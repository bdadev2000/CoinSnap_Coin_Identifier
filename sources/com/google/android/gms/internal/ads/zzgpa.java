package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgpa extends zzgmn {
    private static final zzgpa zza = new zzgpa();

    private zzgpa() {
    }

    public static zzgpa zzd() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgmn
    public final Class zza(Class cls) {
        return zzggm.zza(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzgmn
    public final Object zzb(zzgfw zzgfwVar, Class cls) throws GeneralSecurityException {
        return zzgnw.zza().zzc(zzgfwVar, cls);
    }

    @Override // com.google.android.gms.internal.ads.zzgmn
    public final Object zzc(zzgou zzgouVar, Class cls) throws GeneralSecurityException {
        int i10 = zzggm.zza;
        return zzgnw.zza().zzd(zzgouVar, cls);
    }
}
