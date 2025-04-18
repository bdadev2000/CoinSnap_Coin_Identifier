package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;
import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzh {
    private final Context zza;
    private final zzg zzb;

    public zzh(Context context, zzbq zzbqVar, zzbi zzbiVar) {
        this.zza = context;
        this.zzb = new zzg(this, null, zzbiVar, 0 == true ? 1 : 0);
    }

    @Nullable
    public final zzbq zzc() {
        zzg.zza(this.zzb);
        return null;
    }

    @Nullable
    public final PurchasesUpdatedListener zzd() {
        return zzg.zzb(this.zzb);
    }

    public final void zze() {
        this.zzb.zzd(this.zza);
    }

    public final void zzf(boolean z2) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        this.zza.getApplicationContext().getPackageName();
        intentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.zzb.zzc(this.zza, intentFilter, null, null);
    }

    public zzh(Context context, PurchasesUpdatedListener purchasesUpdatedListener, AlternativeBillingListener alternativeBillingListener, zzbi zzbiVar) {
        this.zza = context;
        this.zzb = new zzg(this, purchasesUpdatedListener, alternativeBillingListener, zzbiVar, (zzf) null);
    }

    public zzh(Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener, zzbi zzbiVar) {
        this.zza = context;
        this.zzb = new zzg(this, purchasesUpdatedListener, userChoiceBillingListener, zzbiVar, (zzf) null);
    }
}
