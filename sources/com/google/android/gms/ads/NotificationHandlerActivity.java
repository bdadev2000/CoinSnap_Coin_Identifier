package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzbuz;

@KeepForSdk
/* loaded from: classes2.dex */
public final class NotificationHandlerActivity extends Activity {

    @NonNull
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.NotificationHandlerActivity";

    @Override // android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        try {
            zzbuz zzm = zzay.zza().zzm(this, new zzbrb());
            if (zzm == null) {
                zzm.zzg("OfflineUtils is null");
            } else {
                zzm.zze(getIntent());
            }
        } catch (RemoteException e4) {
            zzm.zzg("RemoteException calling handleNotificationIntent: ".concat(e4.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
