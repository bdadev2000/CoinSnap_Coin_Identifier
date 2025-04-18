package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zziz;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzao implements ServiceConnection {
    final /* synthetic */ BillingClientImpl zza;
    private final Object zzb = new Object();
    private boolean zzc = false;
    private BillingClientStateListener zzd;

    public /* synthetic */ zzao(BillingClientImpl billingClientImpl, BillingClientStateListener billingClientStateListener, zzan zzanVar) {
        this.zza = billingClientImpl;
        this.zzd = billingClientStateListener;
    }

    private final void zzd(BillingResult billingResult) {
        synchronized (this.zzb) {
            try {
                BillingClientStateListener billingClientStateListener = this.zzd;
                if (billingClientStateListener != null) {
                    billingClientStateListener.onBillingSetupFinished(billingResult);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Billing service connected.");
        BillingClientImpl.zzJ(this.zza, com.google.android.gms.internal.play_billing.zzl.zzr(iBinder));
        Callable callable = new Callable() { // from class: com.android.billingclient.api.zzal
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzao.this.zza();
                return null;
            }
        };
        Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.zzam
            @Override // java.lang.Runnable
            public final void run() {
                zzao.this.zzb();
            }
        };
        BillingClientImpl billingClientImpl = this.zza;
        if (BillingClientImpl.zzt(billingClientImpl, callable, 30000L, runnable, BillingClientImpl.zze(billingClientImpl)) == null) {
            BillingClientImpl billingClientImpl2 = this.zza;
            BillingResult zzi = BillingClientImpl.zzi(billingClientImpl2);
            BillingClientImpl.zzh(billingClientImpl2).zza(zzbh.zza(25, 6, zzi));
            zzd(zzi);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing service disconnected.");
        BillingClientImpl.zzh(this.zza).zzc(zziz.zzw());
        BillingClientImpl.zzJ(this.zza, null);
        BillingClientImpl.zzu(this.zza, 0);
        synchronized (this.zzb) {
            try {
                BillingClientStateListener billingClientStateListener = this.zzd;
                if (billingClientStateListener != null) {
                    billingClientStateListener.onBillingServiceDisconnected();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object zza() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.zzao.zza():java.lang.Object");
    }

    public final /* synthetic */ void zzb() {
        BillingClientImpl.zzu(this.zza, 0);
        BillingClientImpl.zzJ(this.zza, null);
        zzbi zzh = BillingClientImpl.zzh(this.zza);
        BillingResult billingResult = zzbk.zzn;
        zzh.zza(zzbh.zza(24, 6, billingResult));
        zzd(billingResult);
    }

    public final void zzc() {
        synchronized (this.zzb) {
            this.zzd = null;
            this.zzc = true;
        }
    }
}
