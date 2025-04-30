package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.ku;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.settings.dQp;
import com.bytedance.sdk.openadsdk.multipro.aidl.zp.COT;
import com.bytedance.sdk.openadsdk.multipro.aidl.zp.HWF;
import com.bytedance.sdk.openadsdk.multipro.aidl.zp.QR;
import com.bytedance.sdk.openadsdk.multipro.aidl.zp.jU;

/* loaded from: classes.dex */
public class BinderPoolService extends Service {
    private static boolean KS;
    public static volatile boolean zp;
    private final Binder lMd = new zp();

    /* loaded from: classes.dex */
    public static class zp extends IBinderPool.Stub {
        @Override // com.bytedance.sdk.openadsdk.IBinderPool
        public IBinder queryBinder(int i9) throws RemoteException {
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            if (i9 != 6) {
                                if (i9 != 7) {
                                    return null;
                                }
                                return com.bytedance.sdk.openadsdk.multipro.aidl.zp.lMd.zp();
                            }
                            return jU.zp();
                        }
                        return HWF.lMd();
                    }
                    return com.bytedance.sdk.openadsdk.multipro.aidl.zp.KS.zp();
                }
                return COT.zp();
            }
            return QR.zp();
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return this.lMd;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        KVG.zp(getApplicationContext());
        zp = true;
        if (!KS) {
            ku.lMd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService.1
                @Override // java.lang.Runnable
                public void run() {
                    dQp.etV().zp(BinderPoolService.this.getApplicationContext());
                }
            });
        }
        KS = true;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }
}
