package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.ads.e;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.Preconditions;

@KeepName
/* loaded from: classes3.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    protected int zaa = 0;

    @NonNull
    public static Intent zaa(@NonNull Context context, @NonNull PendingIntent pendingIntent, int i10, boolean z10) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra(CloudMessagingReceiver.IntentKeys.PENDING_INTENT, pendingIntent);
        intent.putExtra("failing_client_id", i10);
        intent.putExtra("notify_manager", z10);
        return intent;
    }

    private final void zab() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get(CloudMessagingReceiver.IntentKeys.PENDING_INTENT);
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent != null) {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                this.zaa = 1;
                return;
            } catch (ActivityNotFoundException e2) {
                if (extras.getBoolean("notify_manager", true)) {
                    GoogleApiManager.zak(this).zax(new ConnectionResult(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String f10 = e.f("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        f10 = f10.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", f10, e2);
                }
                this.zaa = 1;
                finish();
                return;
            } catch (IntentSender.SendIntentException e10) {
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e10);
                finish();
                return;
            }
        }
        GoogleApiAvailability.getInstance().showErrorDialogFragment(this, ((Integer) Preconditions.checkNotNull(num)).intValue(), 2, this);
        this.zaa = 1;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, @NonNull Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.zaa = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                GoogleApiManager zak = GoogleApiManager.zak(this);
                if (i11 != -1) {
                    if (i11 == 0) {
                        zak.zax(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    zak.zay();
                }
            }
        } else if (i10 == 2) {
            this.zaa = 0;
            setResult(i11, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        this.zaa = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.zaa = bundle.getInt("resolution");
        }
        if (this.zaa != 1) {
            zab();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        bundle.putInt("resolution", this.zaa);
        super.onSaveInstanceState(bundle);
    }
}
