package androidx.test.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public class InstrumentationActivityInvoker$BootstrapActivity extends Activity {
    public final BroadcastReceiver b = new BroadcastReceiver() { // from class: androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity.1
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            InstrumentationActivityInvoker$BootstrapActivity instrumentationActivityInvoker$BootstrapActivity = InstrumentationActivityInvoker$BootstrapActivity.this;
            instrumentationActivityInvoker$BootstrapActivity.finishActivity(0);
            instrumentationActivityInvoker$BootstrapActivity.finish();
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public boolean f5149c;

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i9, int i10, Intent intent) {
        if (i9 == 0) {
            Intent intent2 = new Intent("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_RECEIVED");
            intent2.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_CODE_KEY", i10);
            if (intent != null) {
                intent2.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_DATA_KEY", intent);
            }
            sendBroadcast(intent2);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z8;
        super.onCreate(bundle);
        BroadcastReceiver broadcastReceiver = this.b;
        IntentFilter intentFilter = new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_BOOTSTRAP_ACTIVITY");
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(broadcastReceiver, intentFilter, 2);
        } else {
            registerReceiver(broadcastReceiver, intentFilter);
        }
        if (bundle != null && bundle.getBoolean("IS_TARGET_ACTIVITY_STARTED_KEY", false)) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f5149c = z8;
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.b);
    }

    @Override // android.app.Activity
    public final void onResume() {
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        Bundle bundle;
        super.onResume();
        if (!this.f5149c) {
            this.f5149c = true;
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("androidx.test.core.app.InstrumentationActivityInvoker.START_TARGET_ACTIVITY_INTENT_KEY");
            pendingIntent.getClass();
            Bundle bundleExtra = getIntent().getBundleExtra("androidx.test.core.app.InstrumentationActivityInvoker.TARGET_ACTIVITY_OPTIONS_BUNDLE_KEY");
            if (Build.VERSION.SDK_INT >= 34) {
                pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                Bundle bundle2 = pendingIntentBackgroundActivityStartMode.toBundle();
                if (bundleExtra != null) {
                    bundle2.putAll(bundleExtra);
                }
                bundle = bundle2;
            } else {
                bundle = bundleExtra;
            }
            try {
                if (bundle == null) {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 0, null, 268435456, 0, 0);
                } else {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 0, null, 268435456, 0, 0, bundle);
                }
            } catch (IntentSender.SendIntentException e4) {
                Log.e("androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity", "Failed to start target activity.", e4);
                throw new RuntimeException(e4);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("IS_TARGET_ACTIVITY_STARTED_KEY", this.f5149c);
    }
}
