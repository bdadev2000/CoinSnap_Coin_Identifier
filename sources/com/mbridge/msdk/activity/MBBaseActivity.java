package com.mbridge.msdk.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.mbridge.msdk.foundation.d.b;
import com.mbridge.msdk.foundation.tools.ad;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes4.dex */
public abstract class MBBaseActivity extends Activity {
    private Display a;

    /* renamed from: b, reason: collision with root package name */
    private OrientationEventListener f12335b;

    /* renamed from: c, reason: collision with root package name */
    private int f12336c = -1;

    public static /* synthetic */ void e(MBBaseActivity mBBaseActivity) {
        OrientationEventListener orientationEventListener = new OrientationEventListener(mBBaseActivity, 1) { // from class: com.mbridge.msdk.activity.MBBaseActivity.2
            @Override // android.view.OrientationEventListener
            public final void onOrientationChanged(int i10) {
                int i11;
                if (MBBaseActivity.this.a != null) {
                    i11 = MBBaseActivity.this.a.getRotation();
                } else {
                    i11 = 0;
                }
                if (i11 == 1 && MBBaseActivity.this.f12336c != 1) {
                    MBBaseActivity.this.f12336c = 1;
                    MBBaseActivity.this.getNotchParams();
                    ad.b("MBBaseActivity", "Orientation Left");
                    return;
                }
                if (i11 == 3 && MBBaseActivity.this.f12336c != 2) {
                    MBBaseActivity.this.f12336c = 2;
                    MBBaseActivity.this.getNotchParams();
                    ad.b("MBBaseActivity", "Orientation Right");
                } else if (i11 == 0 && MBBaseActivity.this.f12336c != 3) {
                    MBBaseActivity.this.f12336c = 3;
                    MBBaseActivity.this.getNotchParams();
                    ad.b("MBBaseActivity", "Orientation Top");
                } else if (i11 == 2 && MBBaseActivity.this.f12336c != 4) {
                    MBBaseActivity.this.f12336c = 4;
                    MBBaseActivity.this.getNotchParams();
                    ad.b("MBBaseActivity", "Orientation Bottom");
                }
            }
        };
        mBBaseActivity.f12335b = orientationEventListener;
        if (orientationEventListener.canDetectOrientation()) {
            mBBaseActivity.f12335b.enable();
        } else {
            mBBaseActivity.f12335b.disable();
            mBBaseActivity.f12335b = null;
        }
    }

    public void getNotchParams() {
        getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.mbridge.msdk.activity.MBBaseActivity.1
            /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
            
                r2 = r3.getDisplayCutout();
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 235
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.activity.MBBaseActivity.AnonymousClass1.run():void");
            }
        }, 500L);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
            getWindow().setFlags(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            getWindow().addFlags(512);
            a();
            b();
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                getWindow().setAttributes(attributes);
            }
        } catch (Exception e2) {
            ad.b("MBBaseActivity", e2.getMessage());
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        OrientationEventListener orientationEventListener = this.f12335b;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.f12335b = null;
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (b.f13103c) {
            return;
        }
        getNotchParams();
        a();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        a();
    }

    public abstract void setTopControllerPadding(int i10, int i11, int i12, int i13, int i14);

    /* JADX INFO: Access modifiers changed from: private */
    public int b() {
        if (this.a == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.a = getDisplay();
            } else {
                this.a = ((WindowManager) getSystemService("window")).getDefaultDisplay();
            }
        }
        Display display = this.a;
        if (display != null) {
            return display.getRotation();
        }
        return -1;
    }

    private void a() {
        try {
            getWindow().addFlags(67108864);
            getWindow().getDecorView().setSystemUiVisibility(4098);
        } catch (Throwable th2) {
            ad.b("MBBaseActivity", th2.getMessage());
        }
    }
}
