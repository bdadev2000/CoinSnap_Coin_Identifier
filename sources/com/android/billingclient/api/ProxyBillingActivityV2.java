package com.android.billingclient.api;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.ComponentActivity;
import androidx.activity.result.c;
import androidx.activity.result.i;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zzb;
import f.a;
import f.e;

@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends ComponentActivity {

    /* renamed from: b, reason: collision with root package name */
    public c f2938b;

    /* renamed from: c, reason: collision with root package name */
    public c f2939c;

    /* renamed from: d, reason: collision with root package name */
    public ResultReceiver f2940d;

    /* renamed from: f, reason: collision with root package name */
    public ResultReceiver f2941f;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.p, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2938b = registerForActivityResult(new e(), new kc.c(this, 16));
        this.f2939c = registerForActivityResult(new e(), new a(this, 16));
        if (bundle == null) {
            zzb.zzj("ProxyBillingActivityV2", "Launching Play Store billing dialog");
            if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
                PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
                this.f2940d = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
                this.f2938b.a(new i(pendingIntent).b());
                return;
            } else {
                if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
                    PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
                    this.f2941f = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
                    this.f2939c.a(new i(pendingIntent2).b());
                    return;
                }
                return;
            }
        }
        if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
            this.f2940d = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
        } else if (bundle.containsKey("external_payment_dialog_result_receiver")) {
            this.f2941f = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.p, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f2940d;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f2941f;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
