package com.bytedance.sdk.openadsdk.core.act;

import android.content.ComponentName;
import androidx.annotation.NonNull;
import u.AbstractC2736e;
import u.AbstractServiceConnectionC2741j;

/* loaded from: classes.dex */
public class ActServiceConnection extends AbstractServiceConnectionC2741j {
    private lMd mConnectionCallback;

    public ActServiceConnection(lMd lmd) {
        this.mConnectionCallback = lmd;
    }

    @Override // u.AbstractServiceConnectionC2741j
    public void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull AbstractC2736e abstractC2736e) {
        lMd lmd = this.mConnectionCallback;
        if (lmd != null) {
            lmd.zp(abstractC2736e);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        lMd lmd = this.mConnectionCallback;
        if (lmd != null) {
            lmd.zp();
        }
    }
}
