package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;
import com.safedk.android.utils.Logger;

/* loaded from: classes2.dex */
final class zad extends zag {
    final /* synthetic */ Intent zaa;
    final /* synthetic */ Activity zab;
    final /* synthetic */ int zac;

    public zad(Intent intent, Activity activity, int i2) {
        this.zaa = intent;
        this.zab = activity;
        this.zac = i2;
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p02, Intent p12, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p12 == null) {
            return;
        }
        p02.startActivityForResult(p12, p2);
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.zaa;
        if (intent != null) {
            safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(this.zab, intent, this.zac);
        }
    }
}
