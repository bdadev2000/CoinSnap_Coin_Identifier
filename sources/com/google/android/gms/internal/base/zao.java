package com.google.android.gms.internal.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import d0.h;

/* loaded from: classes3.dex */
public final class zao extends h {
    @Nullable
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static Intent zaa(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i10;
        Intent registerReceiver;
        if (zan.zaa()) {
            if (true != zan.zaa()) {
                i10 = 0;
            } else {
                i10 = 2;
            }
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, i10);
            return registerReceiver;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
