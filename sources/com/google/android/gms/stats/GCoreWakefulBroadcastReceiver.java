package com.google.android.gms.stats;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import j1.a;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes3.dex */
public abstract class GCoreWakefulBroadcastReceiver extends a {
    @KeepForSdk
    public static boolean completeWakefulIntent(@NonNull Context context, @Nullable Intent intent) {
        if (intent == null) {
            return false;
        }
        return a.completeWakefulIntent(intent);
    }
}
