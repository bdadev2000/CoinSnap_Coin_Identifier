package com.bytedance.sdk.openadsdk.multipro.aidl.Sg;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import com.bytedance.sdk.openadsdk.core.tN.AlY;
import com.bytedance.sdk.openadsdk.tN.nc;
import com.bytedance.sdk.openadsdk.utils.mn;

/* loaded from: classes.dex */
public class Sg extends IDislikeClosedListener.Stub {
    private final String Sg;
    private final AlY.YFl YFl;

    public Sg(String str, AlY.YFl yFl) {
        this.Sg = str;
        this.YFl = yFl;
    }

    @Override // com.bytedance.sdk.openadsdk.IDislikeClosedListener
    public void onItemClickClosed() throws RemoteException {
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.Sg.Sg.1
            @Override // java.lang.Runnable
            public void run() {
                if (Sg.this.YFl != null) {
                    Sg.this.YFl.YFl();
                    nc.YFl(6, Sg.this.Sg);
                }
            }
        });
    }
}
