package com.android.billingclient.api;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zzhy;
import com.google.android.gms.internal.play_billing.zzic;
import com.google.android.gms.internal.play_billing.zzio;
import com.google.android.gms.internal.play_billing.zziu;
import com.google.android.gms.internal.play_billing.zziv;
import com.google.android.gms.internal.play_billing.zziz;

/* loaded from: classes3.dex */
final class zzbn implements zzbi {
    private final zzio zza;
    private final zzbp zzb;

    public zzbn(Context context, zzio zzioVar) {
        this.zzb = new zzbp(context);
        this.zza = zzioVar;
    }

    @Override // com.android.billingclient.api.zzbi
    public final void zza(@Nullable zzhy zzhyVar) {
        if (zzhyVar == null) {
            return;
        }
        try {
            zziu zzv = zziv.zzv();
            zzio zzioVar = this.zza;
            if (zzioVar != null) {
                zzv.zzk(zzioVar);
            }
            zzv.zzi(zzhyVar);
            this.zzb.zza((zziv) zzv.zzc());
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingLogger", "Unable to log.");
        }
    }

    @Override // com.android.billingclient.api.zzbi
    public final void zzb(@Nullable zzic zzicVar) {
        if (zzicVar == null) {
            return;
        }
        try {
            zziu zzv = zziv.zzv();
            zzio zzioVar = this.zza;
            if (zzioVar != null) {
                zzv.zzk(zzioVar);
            }
            zzv.zzj(zzicVar);
            this.zzb.zza((zziv) zzv.zzc());
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingLogger", "Unable to log.");
        }
    }

    @Override // com.android.billingclient.api.zzbi
    public final void zzc(@Nullable zziz zzizVar) {
        if (zzizVar == null) {
            return;
        }
        try {
            zziu zzv = zziv.zzv();
            zzio zzioVar = this.zza;
            if (zzioVar != null) {
                zzv.zzk(zzioVar);
            }
            zzv.zzl(zzizVar);
            this.zzb.zza((zziv) zzv.zzc());
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingLogger", "Unable to log.");
        }
    }
}
