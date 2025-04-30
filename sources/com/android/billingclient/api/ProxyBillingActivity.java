package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zzb;

@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {
    public ResultReceiver b;

    /* renamed from: c, reason: collision with root package name */
    public ResultReceiver f5608c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5609d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5610f;

    public final Intent a() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i9;
        PendingIntent pendingIntent;
        int i10;
        super.onCreate(bundle);
        if (bundle == null) {
            zzb.zzj("ProxyBillingActivity", "Launching Play Store billing flow");
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
                if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                    this.f5610f = true;
                    i10 = 110;
                    i9 = i10;
                }
                i9 = 100;
            } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.b = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
                i9 = 100;
            } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                this.f5608c = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                i10 = 101;
                i9 = i10;
            } else {
                i9 = 100;
                pendingIntent = null;
            }
            try {
                this.f5609d = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), i9, new Intent(), 0, 0, 0);
                return;
            } catch (IntentSender.SendIntentException e4) {
                zzb.zzl("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e4);
                ResultReceiver resultReceiver = this.b;
                if (resultReceiver != null) {
                    resultReceiver.send(6, null);
                } else {
                    ResultReceiver resultReceiver2 = this.f5608c;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(0, null);
                    } else {
                        Intent a6 = a();
                        if (this.f5610f) {
                            a6.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        a6.putExtra("RESPONSE_CODE", 6);
                        a6.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        sendBroadcast(a6);
                    }
                }
                this.f5609d = false;
                finish();
                return;
            }
        }
        zzb.zzj("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
        this.f5609d = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
        if (bundle.containsKey("result_receiver")) {
            this.b = (ResultReceiver) bundle.getParcelable("result_receiver");
        } else if (bundle.containsKey("in_app_message_result_receiver")) {
            this.f5608c = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
        }
        this.f5610f = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f5609d) {
            Intent a6 = a();
            a6.putExtra("RESPONSE_CODE", 1);
            a6.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(a6);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.b;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f5608c;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f5609d);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f5610f);
    }
}
