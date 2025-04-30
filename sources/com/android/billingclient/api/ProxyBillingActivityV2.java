package com.android.billingclient.api;

import G7.j;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.fragment.app.C0462f0;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.play_billing.zzb;
import f.l;
import h.c;
import h.k;
import j5.C2400c;

@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends l {
    public c b;

    /* renamed from: c, reason: collision with root package name */
    public c f5611c;

    /* renamed from: d, reason: collision with root package name */
    public ResultReceiver f5612d;

    /* renamed from: f, reason: collision with root package name */
    public ResultReceiver f5613f;

    @Override // f.l, androidx.core.app.AbstractActivityC0412m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b = registerForActivityResult(new C0462f0(4), new E1.c(this, 7));
        this.f5611c = registerForActivityResult(new C0462f0(4), new C2400c(this, 6));
        if (bundle == null) {
            zzb.zzj("ProxyBillingActivityV2", "Launching Play Store billing dialog");
            if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
                PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
                this.f5612d = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
                c cVar = this.b;
                j.e(pendingIntent, BaseGmsClient.KEY_PENDING_INTENT);
                IntentSender intentSender = pendingIntent.getIntentSender();
                j.d(intentSender, "pendingIntent.intentSender");
                cVar.a(new k(intentSender, null, 0, 0));
                return;
            }
            if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
                PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
                this.f5613f = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
                c cVar2 = this.f5611c;
                j.e(pendingIntent2, BaseGmsClient.KEY_PENDING_INTENT);
                IntentSender intentSender2 = pendingIntent2.getIntentSender();
                j.d(intentSender2, "pendingIntent.intentSender");
                cVar2.a(new k(intentSender2, null, 0, 0));
                return;
            }
            return;
        }
        if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
            this.f5612d = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
        } else if (bundle.containsKey("external_payment_dialog_result_receiver")) {
            this.f5613f = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
        }
    }

    @Override // f.l, androidx.core.app.AbstractActivityC0412m, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f5612d;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f5613f;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
