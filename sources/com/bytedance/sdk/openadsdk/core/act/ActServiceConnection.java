package com.bytedance.sdk.openadsdk.core.act;

import android.content.ComponentName;
import androidx.annotation.NonNull;
import o.h;
import o.o;

/* loaded from: classes.dex */
public class ActServiceConnection extends o {
    private Sg mConnectionCallback;

    public ActServiceConnection(Sg sg2) {
        this.mConnectionCallback = sg2;
    }

    @Override // o.o
    public void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull h hVar) {
        Sg sg2 = this.mConnectionCallback;
        if (sg2 != null) {
            sg2.YFl(hVar);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        Sg sg2 = this.mConnectionCallback;
        if (sg2 != null) {
            sg2.YFl();
        }
    }
}
