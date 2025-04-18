package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.qsH.qsH;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.multipro.aidl.YFl.AlY;
import com.bytedance.sdk.openadsdk.multipro.aidl.YFl.DSW;
import com.bytedance.sdk.openadsdk.multipro.aidl.YFl.vc;
import com.bytedance.sdk.openadsdk.multipro.aidl.YFl.wN;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.mn;

/* loaded from: classes.dex */
public class YFl {
    private static final YFl Sg = new YFl();
    private IBinderPool YFl;
    private Sg tN;
    private long AlY = 0;
    private final ServiceConnection wN = new ServiceConnection() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.YFl.2
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            mn.YFl(new qsH("onServiceConnected") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.YFl.2.1
                @Override // java.lang.Runnable
                public void run() {
                    YFl.this.YFl = IBinderPool.Stub.asInterface(iBinder);
                    try {
                        YFl.this.YFl.asBinder().linkToDeath(YFl.this.f10777vc, 0);
                    } catch (RemoteException e2) {
                        YoT.YFl("TTAD.BinderPool", "onServiceConnected throws :", e2);
                    }
                    System.currentTimeMillis();
                    long unused = YFl.this.AlY;
                    if (YFl.this.tN != null) {
                        YFl.this.tN.onServiceConnected();
                    }
                }
            }, 5);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* renamed from: vc, reason: collision with root package name */
    private final IBinder.DeathRecipient f10777vc = new IBinder.DeathRecipient() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.YFl.3
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            mn.YFl(new qsH("binderDied") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.YFl.3.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (YFl.this.YFl.asBinder().isBinderAlive()) {
                            YFl.this.YFl.asBinder().unlinkToDeath(YFl.this.f10777vc, 0);
                        }
                    } catch (Exception e2) {
                        YoT.YFl("TTAD.BinderPool", e2.getMessage());
                    }
                    YFl.this.YFl = null;
                    YFl.this.AlY();
                }
            }, 5);
        }
    };

    private YFl() {
        AlY();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AlY() {
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            tN();
        }
    }

    public void Sg() {
        try {
            Context YFl = lG.YFl();
            YFl.startService(new Intent(YFl, (Class<?>) BinderPoolService.class));
        } catch (Exception unused) {
        }
    }

    public void tN() {
        try {
            Context YFl = lG.YFl();
            YFl.bindService(new Intent(YFl, (Class<?>) BinderPoolService.class), this.wN, 1);
            this.AlY = System.currentTimeMillis();
        } catch (Throwable unused) {
        }
    }

    public static YFl YFl() {
        return Sg;
    }

    public void YFl(Sg sg2) {
        this.tN = sg2;
        if (this.YFl != null) {
            mn.YFl(new qsH("onServiceConnected2") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.YFl.1
                @Override // java.lang.Runnable
                public void run() {
                    if (YFl.this.tN != null) {
                        YFl.this.tN.onServiceConnected();
                    }
                }
            }, 5);
        }
    }

    public IBinder YFl(int i10) {
        try {
            if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                try {
                    IBinderPool iBinderPool = this.YFl;
                    if (iBinderPool != null) {
                        return iBinderPool.queryBinder(i10);
                    }
                    return null;
                } catch (RemoteException e2) {
                    YoT.YFl("TTAD.BinderPool", e2.getMessage());
                    Sco.qsH("queryBinder error");
                    return null;
                }
            }
            if (i10 == 0) {
                return DSW.YFl();
            }
            if (i10 == 1) {
                return wN.YFl();
            }
            if (i10 == 5) {
                return vc.Sg();
            }
            if (i10 == 6) {
                return AlY.YFl();
            }
            if (i10 != 7) {
                return null;
            }
            return com.bytedance.sdk.openadsdk.multipro.aidl.YFl.Sg.YFl();
        } catch (Throwable unused) {
            return null;
        }
    }
}
