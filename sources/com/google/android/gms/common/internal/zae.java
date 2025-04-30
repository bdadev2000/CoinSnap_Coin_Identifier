package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* loaded from: classes2.dex */
final class zae extends zag {
    final /* synthetic */ Intent zaa;
    final /* synthetic */ Fragment zab;
    final /* synthetic */ int zac;

    public zae(Intent intent, Fragment fragment, int i9) {
        this.zaa = intent;
        this.zab = fragment;
        this.zac = i9;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.zaa;
        if (intent != null) {
            this.zab.startActivityForResult(intent, this.zac);
        }
    }
}
