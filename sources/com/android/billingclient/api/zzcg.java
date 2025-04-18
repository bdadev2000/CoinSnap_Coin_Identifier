package com.android.billingclient.api;

import android.os.Bundle;
import androidx.compose.foundation.text.input.a;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcg {
    public static zzcf zza(Bundle bundle, String str, String str2) {
        BillingResult billingResult = zzbk.zzj;
        if (bundle == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", String.format("%s got null owned items list", str2));
            return new zzcf(billingResult, 54);
        }
        int zzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        BillingResult e = a.e(zzb, com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient"));
        if (zzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(zzb)));
            return new zzcf(e, 23);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return new zzcf(billingResult, 55);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
            return new zzcf(billingResult, 56);
        }
        if (stringArrayList2 == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
            return new zzcf(billingResult, 57);
        }
        if (stringArrayList3 != null) {
            return new zzcf(zzbk.zzl, 1);
        }
        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
        return new zzcf(billingResult, 58);
    }
}
