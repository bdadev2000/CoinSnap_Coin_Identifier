package com.android.billingclient.api;

import androidx.compose.foundation.text.input.a;
import com.android.billingclient.api.BillingResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbk {
    static final BillingResult zzA;
    static final BillingResult zzB;
    static final BillingResult zzC;
    static final BillingResult zzD;
    static final BillingResult zzE;
    public static final /* synthetic */ int zzF = 0;
    static final BillingResult zza = a.e(3, "Google Play In-app Billing API version is less than 3");
    static final BillingResult zzb = a.e(3, "Google Play In-app Billing API version is less than 9");
    static final BillingResult zzc = a.e(3, "Billing service unavailable on device.");
    static final BillingResult zzd = a.e(5, "Client is already in the process of connecting to billing service.");
    static final BillingResult zze = a.e(5, "The list of SKUs can't be empty.");
    static final BillingResult zzf = a.e(5, "SKU type can't be empty.");
    static final BillingResult zzg = a.e(5, "Product type can't be empty.");
    static final BillingResult zzh = a.e(-2, "Client does not support extra params.");
    static final BillingResult zzi = a.e(5, "Invalid purchase token.");
    static final BillingResult zzj = a.e(6, "An internal error occurred.");
    static final BillingResult zzk = a.e(5, "SKU can't be null.");
    static final BillingResult zzl;
    static final BillingResult zzm;
    static final BillingResult zzn;
    static final BillingResult zzo;
    static final BillingResult zzp;
    static final BillingResult zzq;
    static final BillingResult zzr;
    static final BillingResult zzs;
    static final BillingResult zzt;
    static final BillingResult zzu;
    static final BillingResult zzv;
    static final BillingResult zzw;
    static final BillingResult zzx;
    static final BillingResult zzy;
    static final BillingResult zzz;

    static {
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(0);
        zzl = newBuilder.build();
        zzm = a.e(-1, "Service connection is disconnected.");
        zzn = a.e(2, "Timeout communicating with service.");
        zzo = a.e(-2, "Client does not support subscriptions.");
        zzp = a.e(-2, "Client does not support subscriptions update.");
        zzq = a.e(-2, "Client does not support get purchase history.");
        zzr = a.e(-2, "Client does not support price change confirmation.");
        zzs = a.e(-2, "Play Store version installed does not support cross selling products.");
        zzt = a.e(-2, "Client does not support multi-item purchases.");
        zzu = a.e(-2, "Client does not support offer_id_token.");
        zzv = a.e(-2, "Client does not support ProductDetails.");
        zzw = a.e(-2, "Client does not support in-app messages.");
        zzx = a.e(-2, "Client does not support user choice billing.");
        zzy = a.e(5, "Unknown feature");
        zzz = a.e(-2, "Play Store version installed does not support get billing config.");
        zzA = a.e(-2, "Query product details with serialized docid is not supported.");
        zzB = a.e(4, "Item is unavailable for purchase.");
        zzC = a.e(-2, "Query product details with developer specified account is not supported.");
        zzD = a.e(-2, "Play Store version installed does not support alternative billing only.");
        zzE = a.e(5, "To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
    }

    public static BillingResult zza(int i2, String str) {
        return a.e(i2, str);
    }
}
