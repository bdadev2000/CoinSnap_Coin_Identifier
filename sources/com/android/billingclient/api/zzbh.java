package com.android.billingclient.api;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzhy;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzic;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzii;

/* loaded from: classes3.dex */
public final /* synthetic */ class zzbh {
    @Nullable
    public static zzhy zza(int i2, int i3, BillingResult billingResult) {
        try {
            zzhx zzv = zzhy.zzv();
            zzie zzv2 = zzii.zzv();
            zzv2.zzk(billingResult.getResponseCode());
            zzv2.zzj(billingResult.getDebugMessage());
            zzv2.zzl(i2);
            zzv.zzi(zzv2);
            zzv.zzk(i3);
            return (zzhy) zzv.zzc();
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }

    @Nullable
    public static zzic zzb(int i2) {
        try {
            zzib zzv = zzic.zzv();
            zzv.zzj(i2);
            return (zzic) zzv.zzc();
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
