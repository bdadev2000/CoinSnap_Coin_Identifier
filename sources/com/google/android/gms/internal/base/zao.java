package com.google.android.gms.internal.base;

import I.h;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes2.dex */
public final class zao extends h {
    @Nullable
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static Intent zaa(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i9;
        Intent registerReceiver;
        if (zan.zaa()) {
            if (true != zan.zaa()) {
                i9 = 0;
            } else {
                i9 = 2;
            }
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, i9);
            return registerReceiver;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
