package com.mbridge.msdk.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.mbridge.msdk.foundation.d.b;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes3.dex */
public abstract class MBBaseActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private Display f14596a;
    private OrientationEventListener b;

    /* renamed from: c, reason: collision with root package name */
    private int f14597c = -1;

    public static /* synthetic */ void e(MBBaseActivity mBBaseActivity) {
        OrientationEventListener orientationEventListener = new OrientationEventListener(mBBaseActivity, 1) { // from class: com.mbridge.msdk.activity.MBBaseActivity.2
            @Override // android.view.OrientationEventListener
            public final void onOrientationChanged(int i9) {
                int i10;
                if (MBBaseActivity.this.f14596a != null) {
                    i10 = MBBaseActivity.this.f14596a.getRotation();
                } else {
                    i10 = 0;
                }
                if (i10 == 1 && MBBaseActivity.this.f14597c != 1) {
                    MBBaseActivity.this.f14597c = 1;
                    MBBaseActivity.this.getNotchParams();
                    ad.b("MBBaseActivity", "Orientation Left");
                    return;
                }
                if (i10 == 3 && MBBaseActivity.this.f14597c != 2) {
                    MBBaseActivity.this.f14597c = 2;
                    MBBaseActivity.this.getNotchParams();
                    ad.b("MBBaseActivity", "Orientation Right");
                } else if (i10 == 0 && MBBaseActivity.this.f14597c != 3) {
                    MBBaseActivity.this.f14597c = 3;
                    MBBaseActivity.this.getNotchParams();
                    ad.b("MBBaseActivity", "Orientation Top");
                } else if (i10 == 2 && MBBaseActivity.this.f14597c != 4) {
                    MBBaseActivity.this.f14597c = 4;
                    MBBaseActivity.this.getNotchParams();
                    ad.b("MBBaseActivity", "Orientation Bottom");
                }
            }
        };
        mBBaseActivity.b = orientationEventListener;
        if (orientationEventListener.canDetectOrientation()) {
            mBBaseActivity.b.enable();
        } else {
            mBBaseActivity.b.disable();
            mBBaseActivity.b = null;
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
                    Method dump skipped, instructions count: 237
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
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(512);
            a();
            b();
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                getWindow().setAttributes(attributes);
            }
        } catch (Exception e4) {
            ad.b("MBBaseActivity", e4.getMessage());
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        OrientationEventListener orientationEventListener = this.b;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.b = null;
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (b.f15467c) {
            return;
        }
        getNotchParams();
        a();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        a();
    }

    public abstract void setTopControllerPadding(int i9, int i10, int i11, int i12, int i13);

    /* JADX INFO: Access modifiers changed from: private */
    public int b() {
        Display display;
        if (this.f14596a == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                display = getDisplay();
                this.f14596a = display;
            } else {
                this.f14596a = ((WindowManager) getSystemService("window")).getDefaultDisplay();
            }
        }
        Display display2 = this.f14596a;
        if (display2 != null) {
            return display2.getRotation();
        }
        return -1;
    }

    private void a() {
        try {
            getWindow().addFlags(67108864);
            getWindow().getDecorView().setSystemUiVisibility(4098);
        } catch (Throwable th) {
            ad.b("MBBaseActivity", th.getMessage());
        }
    }
}
