package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.NativeProtocol;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class FacebookBroadcastReceiver extends BroadcastReceiver {
    public void onFailedAppCall(@NotNull String str, @NotNull String str2, @NotNull Bundle bundle) {
        p0.a.s(str, "appCallId");
        p0.a.s(str2, "action");
        p0.a.s(bundle, "extras");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        p0.a.s(context, "context");
        p0.a.s(intent, SDKConstants.PARAM_INTENT);
        String stringExtra = intent.getStringExtra(NativeProtocol.EXTRA_PROTOCOL_CALL_ID);
        String stringExtra2 = intent.getStringExtra(NativeProtocol.EXTRA_PROTOCOL_ACTION);
        Bundle extras = intent.getExtras();
        if (stringExtra == null || stringExtra2 == null || extras == null) {
            return;
        }
        if (NativeProtocol.isErrorResult(intent)) {
            onFailedAppCall(stringExtra, stringExtra2, extras);
        } else {
            onSuccessfulAppCall(stringExtra, stringExtra2, extras);
        }
    }

    public void onSuccessfulAppCall(@NotNull String str, @NotNull String str2, @NotNull Bundle bundle) {
        p0.a.s(str, "appCallId");
        p0.a.s(str2, "action");
        p0.a.s(bundle, "extras");
    }
}
