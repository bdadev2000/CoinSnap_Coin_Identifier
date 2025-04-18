package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.settings.rkt;
import com.bytedance.sdk.openadsdk.multipro.aidl.YFl.AlY;
import com.bytedance.sdk.openadsdk.multipro.aidl.YFl.DSW;
import com.bytedance.sdk.openadsdk.multipro.aidl.YFl.vc;
import com.bytedance.sdk.openadsdk.multipro.aidl.YFl.wN;

/* loaded from: classes.dex */
public class BinderPoolService extends Service {
    public static volatile boolean YFl;
    private static boolean tN;
    private final Binder Sg = new YFl();

    /* loaded from: classes.dex */
    public static class YFl extends IBinderPool.Stub {
        @Override // com.bytedance.sdk.openadsdk.IBinderPool
        public IBinder queryBinder(int i10) throws RemoteException {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    return null;
                                }
                                return com.bytedance.sdk.openadsdk.multipro.aidl.YFl.Sg.YFl();
                            }
                            return AlY.YFl();
                        }
                        return vc.Sg();
                    }
                    return com.bytedance.sdk.openadsdk.multipro.aidl.YFl.tN.YFl();
                }
                return wN.YFl();
            }
            return DSW.YFl();
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return this.Sg;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        lG.Sg(getApplicationContext());
        YFl = true;
        if (!tN) {
            com.bytedance.sdk.component.utils.DSW.Sg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService.1
                @Override // java.lang.Runnable
                public void run() {
                    rkt.JwO().YFl(BinderPoolService.this.getApplicationContext());
                }
            });
        }
        tN = true;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }
}
