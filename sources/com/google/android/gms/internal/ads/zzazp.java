package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzazp extends zzazs {
    private final View zzi;

    public zzazp(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i9, int i10, View view) {
        super(zzayeVar, "fHaUCxrr3fcbpdQPVJw6OSoHeHoizr6wmxmAsnLvDUhuNG2u8ebKX4VPxAoXSx4W", "K/sgHSTVeE1LLZ4HP+m5KF6ND+k7W4ID3M3VTul8bAI=", zzatpVar, i9, 57);
        this.zzi = view;
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzds);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkU);
            zzayi zzayiVar = new zzayi((String) this.zzf.invoke(null, this.zzi, this.zzb.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzauq zza = zzaur.zza();
            zza.zzb(zzayiVar.zza.longValue());
            zza.zzd(zzayiVar.zzb.longValue());
            zza.zze(zzayiVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zza.zzc(zzayiVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zza.zza(zzayiVar.zzd.longValue());
            }
            this.zze.zzaf((zzaur) zza.zzbr());
        }
    }
}
