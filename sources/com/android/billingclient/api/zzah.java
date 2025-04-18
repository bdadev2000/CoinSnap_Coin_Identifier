package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzah implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ PurchasesResponseListener zzb;
    final /* synthetic */ BillingClientImpl zzc;

    public zzah(BillingClientImpl billingClientImpl, String str, PurchasesResponseListener purchasesResponseListener) {
        this.zzc = billingClientImpl;
        this.zza = str;
        this.zzb = purchasesResponseListener;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzce zzX = BillingClientImpl.zzX(this.zzc, this.zza, 9);
        if (zzX.zzb() != null) {
            this.zzb.onQueryPurchasesResponse(zzX.zza(), zzX.zzb());
            return null;
        }
        this.zzb.onQueryPurchasesResponse(zzX.zza(), com.google.android.gms.internal.play_billing.zzaf.zzk());
        return null;
    }
}
