package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/CurrentAccessTokenExpirationBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", intent.getAction()) && x.h()) {
            j B = j.f11145f.B();
            a aVar = B.f11148c;
            B.b(aVar, aVar);
        }
    }
}
