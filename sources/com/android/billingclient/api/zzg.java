package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.play_billing.zzej;
import com.google.android.gms.internal.play_billing.zzhy;
import java.util.List;
import org.json.JSONException;

@VisibleForTesting
/* loaded from: classes.dex */
public final class zzg extends BroadcastReceiver {
    final /* synthetic */ zzh zza;
    private final PurchasesUpdatedListener zzb;
    private final zzbq zzc;
    private final AlternativeBillingListener zzd;
    private final UserChoiceBillingListener zze;
    private final zzbi zzf;
    private boolean zzg;

    public /* synthetic */ zzg(zzh zzhVar, zzbq zzbqVar, zzbi zzbiVar, zzf zzfVar) {
        this.zza = zzhVar;
        this.zzb = null;
        this.zzd = null;
        this.zze = null;
        this.zzc = null;
        this.zzf = zzbiVar;
    }

    public static /* bridge */ /* synthetic */ zzbq zza(zzg zzgVar) {
        zzbq zzbqVar = zzgVar.zzc;
        return null;
    }

    private final void zze(Bundle bundle, BillingResult billingResult, int i2) {
        if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
            this.zzf.zza(zzbh.zza(23, i2, billingResult));
            return;
        }
        try {
            this.zzf.zza(zzhy.zzx(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzej.zza()));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        int i2 = 1;
        if (extras == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "Bundle is null.");
            zzbi zzbiVar = this.zzf;
            BillingResult billingResult = zzbk.zzj;
            zzbiVar.zza(zzbh.zza(11, 1, billingResult));
            PurchasesUpdatedListener purchasesUpdatedListener = this.zzb;
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesUpdated(billingResult, null);
                return;
            }
            return;
        }
        BillingResult zze = com.google.android.gms.internal.play_billing.zzb.zze(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        String string = extras.getString("INTENT_SOURCE");
        if (string == "LAUNCH_BILLING_FLOW" || (string != null && string.equals("LAUNCH_BILLING_FLOW"))) {
            i2 = 2;
        }
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            List<Purchase> zzi = com.google.android.gms.internal.play_billing.zzb.zzi(extras);
            if (zze.getResponseCode() == 0) {
                this.zzf.zzb(zzbh.zzb(i2));
            } else {
                zze(extras, zze, i2);
            }
            this.zzb.onPurchasesUpdated(zze, zzi);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (zze.getResponseCode() != 0) {
                zze(extras, zze, i2);
                this.zzb.onPurchasesUpdated(zze, com.google.android.gms.internal.play_billing.zzaf.zzk());
                return;
            }
            if (this.zzd == null && this.zze == null) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                zzbi zzbiVar2 = this.zzf;
                BillingResult billingResult2 = zzbk.zzj;
                zzbiVar2.zza(zzbh.zza(77, i2, billingResult2));
                this.zzb.onPurchasesUpdated(billingResult2, com.google.android.gms.internal.play_billing.zzaf.zzk());
                return;
            }
            String string2 = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
            if (string2 == null) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                zzbi zzbiVar3 = this.zzf;
                BillingResult billingResult3 = zzbk.zzj;
                zzbiVar3.zza(zzbh.zza(16, i2, billingResult3));
                this.zzb.onPurchasesUpdated(billingResult3, com.google.android.gms.internal.play_billing.zzaf.zzk());
                return;
            }
            try {
                if (this.zze != null) {
                    this.zze.userSelectedAlternativeBilling(new UserChoiceDetails(string2));
                } else {
                    this.zzd.userSelectedAlternativeBilling(new AlternativeChoiceDetails(string2));
                }
                this.zzf.zzb(zzbh.zzb(i2));
            } catch (JSONException unused) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", String.format("Error when parsing invalid user choice data: [%s]", string2));
                zzbi zzbiVar4 = this.zzf;
                BillingResult billingResult4 = zzbk.zzj;
                zzbiVar4.zza(zzbh.zza(17, i2, billingResult4));
                this.zzb.onPurchasesUpdated(billingResult4, com.google.android.gms.internal.play_billing.zzaf.zzk());
            }
        }
    }

    public final synchronized void zzc(Context context, IntentFilter intentFilter, @Nullable String str, @Nullable IntentFilter intentFilter2) {
        Context context2;
        zzg zzgVar;
        zzg zzgVar2;
        try {
            if (this.zzg) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                zzgVar2 = this.zza.zzb;
                context.registerReceiver(zzgVar2, intentFilter, null, null, 2);
            } else {
                context2 = this.zza.zza;
                context2.getApplicationContext().getPackageName();
                zzgVar = this.zza.zzb;
                context.registerReceiver(zzgVar, intentFilter);
            }
            this.zzg = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(Context context) {
        zzg zzgVar;
        if (!this.zzg) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "Receiver is not registered.");
            return;
        }
        zzgVar = this.zza.zzb;
        context.unregisterReceiver(zzgVar);
        this.zzg = false;
    }

    public /* synthetic */ zzg(zzh zzhVar, PurchasesUpdatedListener purchasesUpdatedListener, AlternativeBillingListener alternativeBillingListener, zzbi zzbiVar, zzf zzfVar) {
        this.zza = zzhVar;
        this.zzb = purchasesUpdatedListener;
        this.zzf = zzbiVar;
        this.zzd = alternativeBillingListener;
        this.zze = null;
        this.zzc = null;
    }

    public /* synthetic */ zzg(zzh zzhVar, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener, zzbi zzbiVar, zzf zzfVar) {
        this.zza = zzhVar;
        this.zzb = purchasesUpdatedListener;
        this.zzf = zzbiVar;
        this.zze = userChoiceBillingListener;
        this.zzd = null;
        this.zzc = null;
    }
}
