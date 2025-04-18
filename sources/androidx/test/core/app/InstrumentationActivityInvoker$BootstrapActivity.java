package androidx.test.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.test.internal.util.Checks;

/* loaded from: classes.dex */
public class InstrumentationActivityInvoker$BootstrapActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f2104b = new BroadcastReceiver() { // from class: androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity.1
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            InstrumentationActivityInvoker$BootstrapActivity instrumentationActivityInvoker$BootstrapActivity = InstrumentationActivityInvoker$BootstrapActivity.this;
            instrumentationActivityInvoker$BootstrapActivity.finishActivity(0);
            instrumentationActivityInvoker$BootstrapActivity.finish();
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public boolean f2105c;

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 0) {
            Intent intent2 = new Intent("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_RECEIVED");
            intent2.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_CODE_KEY", i11);
            if (intent != null) {
                intent2.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_DATA_KEY", intent);
            }
            sendBroadcast(intent2);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z10;
        super.onCreate(bundle);
        BroadcastReceiver broadcastReceiver = this.f2104b;
        IntentFilter intentFilter = new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_BOOTSTRAP_ACTIVITY");
        if (Build.VERSION.SDK_INT < 33) {
            registerReceiver(broadcastReceiver, intentFilter);
        } else {
            registerReceiver(broadcastReceiver, intentFilter, 2);
        }
        if (bundle != null && bundle.getBoolean("IS_TARGET_ACTIVITY_STARTED_KEY", false)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f2105c = z10;
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f2104b);
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!this.f2105c) {
            this.f2105c = true;
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("androidx.test.core.app.InstrumentationActivityInvoker.START_TARGET_ACTIVITY_INTENT_KEY");
            int i10 = Checks.a;
            pendingIntent.getClass();
            Bundle bundleExtra = getIntent().getBundleExtra("androidx.test.core.app.InstrumentationActivityInvoker.TARGET_ACTIVITY_OPTIONS_BUNDLE_KEY");
            try {
                if (bundleExtra != null) {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 0, null, 268435456, 0, 0, bundleExtra);
                } else {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 0, null, 268435456, 0, 0);
                }
            } catch (IntentSender.SendIntentException e2) {
                Log.e("androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity", "Failed to start target activity.", e2);
                throw new RuntimeException(e2);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("IS_TARGET_ACTIVITY_STARTED_KEY", this.f2105c);
    }
}
