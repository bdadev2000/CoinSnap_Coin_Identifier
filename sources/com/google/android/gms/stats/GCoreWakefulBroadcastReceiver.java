package com.google.android.gms.stats;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import q0.AbstractC2638a;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class GCoreWakefulBroadcastReceiver extends AbstractC2638a {
    @KeepForSdk
    public static boolean completeWakefulIntent(@NonNull Context context, @Nullable Intent intent) {
        if (intent == null) {
            return false;
        }
        return AbstractC2638a.completeWakefulIntent(intent);
    }
}
