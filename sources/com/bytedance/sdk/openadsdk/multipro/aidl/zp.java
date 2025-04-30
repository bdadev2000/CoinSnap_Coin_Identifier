package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.ku.ku;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.multipro.aidl.zp.COT;
import com.bytedance.sdk.openadsdk.multipro.aidl.zp.HWF;
import com.bytedance.sdk.openadsdk.multipro.aidl.zp.QR;
import com.bytedance.sdk.openadsdk.multipro.aidl.zp.jU;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.YhE;

/* loaded from: classes.dex */
public class zp {
    private static final zp lMd = new zp();
    private lMd KS;
    private IBinderPool zp;
    private long jU = 0;
    private final ServiceConnection COT = new ServiceConnection() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.zp.2
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            QUv.zp(new ku("onServiceConnected") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.zp.2.1
                @Override // java.lang.Runnable
                public void run() {
                    zp.this.zp = IBinderPool.Stub.asInterface(iBinder);
                    try {
                        zp.this.zp.asBinder().linkToDeath(zp.this.HWF, 0);
                    } catch (RemoteException e4) {
                        tG.zp("TTAD.BinderPool", "onServiceConnected throws :", e4);
                    }
                    System.currentTimeMillis();
                    long unused = zp.this.jU;
                    if (zp.this.KS != null) {
                        zp.this.KS.onServiceConnected();
                    }
                }
            }, 5);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };
    private final IBinder.DeathRecipient HWF = new IBinder.DeathRecipient() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.zp.3
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            QUv.zp(new ku("binderDied") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.zp.3.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (zp.this.zp.asBinder().isBinderAlive()) {
                            zp.this.zp.asBinder().unlinkToDeath(zp.this.HWF, 0);
                        }
                    } catch (Exception e4) {
                        tG.zp("TTAD.BinderPool", e4.getMessage());
                    }
                    zp.this.zp = null;
                    zp.this.jU();
                }
            }, 5);
        }
    };

    private zp() {
        jU();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jU() {
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            KS();
        }
    }

    public void KS() {
        try {
            Context zp = KVG.zp();
            zp.bindService(new Intent(zp, (Class<?>) BinderPoolService.class), this.COT, 1);
            this.jU = System.currentTimeMillis();
        } catch (Throwable unused) {
        }
    }

    public void lMd() {
        try {
            Context zp = KVG.zp();
            zp.startService(new Intent(zp, (Class<?>) BinderPoolService.class));
        } catch (Exception unused) {
        }
    }

    public static zp zp() {
        return lMd;
    }

    public void zp(lMd lmd) {
        this.KS = lmd;
        if (this.zp != null) {
            QUv.zp(new ku("onServiceConnected2") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.zp.1
                @Override // java.lang.Runnable
                public void run() {
                    if (zp.this.KS != null) {
                        zp.this.KS.onServiceConnected();
                    }
                }
            }, 5);
        }
    }

    public IBinder zp(int i9) {
        try {
            if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                try {
                    IBinderPool iBinderPool = this.zp;
                    if (iBinderPool != null) {
                        return iBinderPool.queryBinder(i9);
                    }
                    return null;
                } catch (RemoteException e4) {
                    tG.zp("TTAD.BinderPool", e4.getMessage());
                    YhE.ku("queryBinder error");
                    return null;
                }
            }
            if (i9 == 0) {
                return QR.zp();
            }
            if (i9 == 1) {
                return COT.zp();
            }
            if (i9 == 5) {
                return HWF.lMd();
            }
            if (i9 == 6) {
                return jU.zp();
            }
            if (i9 != 7) {
                return null;
            }
            return com.bytedance.sdk.openadsdk.multipro.aidl.zp.lMd.zp();
        } catch (Throwable unused) {
            return null;
        }
    }
}
