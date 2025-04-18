package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.android.billingclient.BuildConfig;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
final class zzay extends com.google.android.gms.internal.play_billing.zzn {
    final WeakReference zza;
    final ResultReceiver zzb;

    public /* synthetic */ zzay(WeakReference weakReference, ResultReceiver resultReceiver, zzax zzaxVar) {
        this.zza = weakReference;
        this.zzb = resultReceiver;
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p02, Intent p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p12 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p12, BuildConfig.APPLICATION_ID);
        p02.startActivity(p12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzo
    public final void zza(Bundle bundle) throws RemoteException {
        ResultReceiver resultReceiver = this.zzb;
        if (resultReceiver == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Unable to send result for in-app messaging");
            return;
        }
        if (bundle == null) {
            resultReceiver.send(0, null);
            return;
        }
        Activity activity = (Activity) this.zza.get();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
        if (activity == null || pendingIntent == null) {
            this.zzb.send(0, null);
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Unable to launch intent for in-app messaging");
            return;
        }
        try {
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
            intent.putExtra("in_app_message_result_receiver", this.zzb);
            intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, intent);
        } catch (CancellationException e) {
            this.zzb.send(0, null);
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Exception caught while launching intent for in-app messaging.", e);
        }
    }
}
