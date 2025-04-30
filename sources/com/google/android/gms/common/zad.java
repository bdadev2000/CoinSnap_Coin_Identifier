package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Message;
import com.google.android.gms.internal.base.zau;
import com.mbridge.msdk.foundation.entity.o;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes2.dex */
public final class zad extends zau {
    final /* synthetic */ GoogleApiAvailability zaa;
    private final Context zab;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zad(com.google.android.gms.common.GoogleApiAvailability r1, android.content.Context r2) {
        /*
            r0 = this;
            r0.zaa = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto Ld
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L11
        Ld:
            android.os.Looper r1 = android.os.Looper.myLooper()
        L11:
            r0.<init>(r1)
            android.content.Context r1 = r2.getApplicationContext()
            r0.zab = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.zad.<init>(com.google.android.gms.common.GoogleApiAvailability, android.content.Context):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i9 = message.what;
        if (i9 != 1) {
            o.z(i9, "Don't know how to handle this message: ", "GoogleApiAvailability");
            return;
        }
        GoogleApiAvailability googleApiAvailability = this.zaa;
        int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(this.zab);
        if (googleApiAvailability.isUserResolvableError(isGooglePlayServicesAvailable)) {
            this.zaa.showErrorNotification(this.zab, isGooglePlayServicesAvailable);
        }
    }
}
