package com.bytedance.sdk.openadsdk.component.reward.YFl;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.View;
import com.bytedance.sdk.component.utils.bZ;
import com.bytedance.sdk.openadsdk.utils.GS;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public class YoT {
    private YFl AlY;
    private final com.bytedance.sdk.openadsdk.component.reward.YFl.YFl Sg;
    protected int YFl;
    private boolean tN = true;

    /* loaded from: classes.dex */
    public static abstract class YFl implements View.OnLayoutChangeListener {
        private int Sg;
        private int YFl;

        private YFl() {
        }

        public abstract void YFl(int i10, int i11);

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int i18 = i12 - i10;
            int i19 = i13 - i11;
            if (i18 != this.YFl || i19 != this.Sg) {
                this.YFl = i18;
                this.Sg = i19;
                YFl(i18, i19);
            }
        }
    }

    public YoT(com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl) {
        this.YFl = 0;
        this.Sg = yFl;
        tN();
        if (yFl.YFl == 2) {
            return;
        }
        try {
            this.YFl = GS.AlY(yFl.UI, GS.YFl());
            if (!yFl.UI.getWindow().hasFeature(1)) {
                yFl.UI.requestWindowFeature(1);
            }
            yFl.UI.getWindow().addFlags(16777344);
            if (yFl.Cqy == 2 || !GS.tN(yFl.UI)) {
                yFl.UI.getWindow().addFlags(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            }
        } catch (Throwable th2) {
            Log.e("TTAD.RFSM", "init: ", th2);
        }
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void AlY() {
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.Sg;
        if (yFl.Cqy == 2) {
            if (yFl.tQ) {
                YFl(yFl.UI, 8);
                return;
            } else {
                YFl(yFl.UI, 0);
                return;
            }
        }
        YFl(yFl.UI, 1);
    }

    private void tN() {
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.Sg;
        yFl.VB = yFl.Sg.qjy();
        if (26 == Build.VERSION.SDK_INT) {
            if (this.Sg.UI.getResources().getConfiguration().orientation == 1) {
                this.Sg.Cqy = 1;
                return;
            } else {
                this.Sg.Cqy = 2;
                return;
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = this.Sg;
        yFl2.Cqy = yFl2.Sg.SVa();
    }

    private float vc() {
        return GS.AlY(this.Sg.UI, GS.NjR(this.Sg.UI));
    }

    private float wN() {
        return GS.AlY(this.Sg.UI, GS.nc(this.Sg.UI));
    }

    public void Sg(bZ bZVar) {
        try {
            com.bytedance.sdk.openadsdk.activity.vc vcVar = this.Sg.UT;
            if (vcVar == null || vcVar.NjR <= 0) {
                final boolean z10 = true;
                final boolean z11 = this.tN && com.bytedance.sdk.openadsdk.core.lG.AlY().GS() == 1;
                if (!this.tN || !GS.tN(this.Sg.UI)) {
                    z10 = false;
                }
                if (z10 || z11) {
                    if (this.AlY == null) {
                        this.AlY = new YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.YoT.2
                            boolean YFl;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super();
                            }

                            /* JADX WARN: Removed duplicated region for block: B:17:0x00e9 A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x001f, B:7:0x006a, B:9:0x0088, B:11:0x0097, B:13:0x00ab, B:14:0x00af, B:15:0x00e3, B:17:0x00e9, B:18:0x00ee, B:20:0x00fc, B:24:0x00b2, B:26:0x00bc, B:28:0x00d0, B:30:0x00d4, B:31:0x00da, B:33:0x00de, B:34:0x0102, B:36:0x0106, B:39:0x0045), top: B:1:0x0000 }] */
                            /* JADX WARN: Removed duplicated region for block: B:20:0x00fc A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x001f, B:7:0x006a, B:9:0x0088, B:11:0x0097, B:13:0x00ab, B:14:0x00af, B:15:0x00e3, B:17:0x00e9, B:18:0x00ee, B:20:0x00fc, B:24:0x00b2, B:26:0x00bc, B:28:0x00d0, B:30:0x00d4, B:31:0x00da, B:33:0x00de, B:34:0x0102, B:36:0x0106, B:39:0x0045), top: B:1:0x0000 }] */
                            /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
                            @Override // com.bytedance.sdk.openadsdk.component.reward.YFl.YoT.YFl
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public void YFl(int r7, int r8) {
                                /*
                                    Method dump skipped, instructions count: 269
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.YFl.YoT.AnonymousClass2.YFl(int, int):void");
                            }
                        };
                    }
                    this.Sg.UI.getWindow().getDecorView().addOnLayoutChangeListener(this.AlY);
                }
                this.tN = false;
            }
        } catch (Exception unused) {
        }
    }

    public void YFl(bZ bZVar) {
        if (bZVar == null) {
            return;
        }
        bZVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.YoT.1
            @Override // java.lang.Runnable
            public void run() {
                View findViewById;
                try {
                    View decorView = YoT.this.Sg.UI.getWindow().getDecorView();
                    if (decorView != null && (findViewById = decorView.findViewById(R.id.statusBarBackground)) != null) {
                        findViewById.setVisibility(8);
                    }
                } catch (Exception unused) {
                }
            }
        }, 300L);
    }

    public void YFl(boolean z10) {
        float min;
        float max;
        int max2;
        int i10;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 != 26) {
            if (i12 == 27) {
                try {
                    AlY();
                } catch (Throwable unused) {
                }
            } else {
                AlY();
            }
        }
        float wN = wN();
        float vc2 = vc();
        if (this.Sg.Cqy == 2) {
            min = Math.max(wN, vc2);
            max = Math.min(wN, vc2);
        } else {
            min = Math.min(wN, vc2);
            max = Math.max(wN, vc2);
        }
        Activity activity = this.Sg.UI;
        int AlY = GS.AlY(activity, GS.YFl());
        if (this.Sg.Cqy != 2) {
            if (GS.tN(activity)) {
                max -= AlY;
            }
        } else if (GS.tN(activity)) {
            min -= AlY;
        }
        if (z10) {
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.Sg;
            yFl.Jc = (int) min;
            yFl.RX = (int) max;
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = this.Sg;
        int i13 = 20;
        if (yFl2.Cqy != 2) {
            float f10 = yFl2.VB;
            if (f10 != 0.0f && f10 != 100.0f) {
                i10 = (int) Math.max((max - (((min - 20.0f) - 20.0f) / f10)) / 2.0f, 0.0f);
                i11 = i10;
                max2 = 20;
            }
            i13 = 0;
            max2 = 0;
            i10 = 0;
            i11 = 0;
        } else {
            float f11 = yFl2.VB;
            if (f11 != 0.0f && f11 != 100.0f) {
                max2 = (int) Math.max((min - (((max - 20.0f) - 20.0f) * f11)) / 2.0f, 0.0f);
                i10 = 20;
                i11 = 20;
                i13 = max2;
            }
            i13 = 0;
            max2 = 0;
            i10 = 0;
            i11 = 0;
        }
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl3 = this.Sg;
        float f12 = i13;
        float f13 = max2;
        yFl3.Jc = (int) ((min - f12) - f13);
        float f14 = i10;
        float f15 = i11;
        yFl3.RX = (int) ((max - f14) - f15);
        activity.getWindow().getDecorView().setPadding(GS.tN(activity, f12), GS.tN(activity, f14), GS.tN(activity, f13), GS.tN(activity, f15));
    }

    private float[] Sg(int i10) {
        float vc2 = vc();
        float wN = wN();
        int i11 = this.Sg.Cqy;
        if ((i11 == 1) != (vc2 > wN)) {
            float f10 = vc2 + wN;
            wN = f10 - wN;
            vc2 = f10 - wN;
        }
        if (i11 == 1) {
            vc2 -= i10;
        } else {
            wN -= i10;
        }
        return new float[]{wN, vc2};
    }

    public void Sg() {
        if (this.AlY != null) {
            this.Sg.UI.getWindow().getDecorView().removeOnLayoutChangeListener(this.AlY);
            this.AlY = null;
        }
    }

    public float[] YFl(int i10) {
        float[] fArr = new float[2];
        Activity activity = this.Sg.UI;
        View decorView = activity.getWindow().getDecorView();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 35 && this.Sg.Sg.qjy() == 100.0f) {
            fArr[0] = decorView.getWidth() - decorView.getPaddingLeft();
            fArr[1] = decorView.getHeight() - decorView.getPaddingTop();
        } else {
            fArr[0] = decorView.getWidth() - (decorView.getPaddingLeft() * 2);
            fArr[1] = decorView.getHeight() - (decorView.getPaddingTop() * 2);
        }
        fArr[0] = GS.AlY(activity, fArr[0]);
        float AlY = GS.AlY(activity, fArr[1]);
        fArr[1] = AlY;
        if (fArr[0] < 10.0f || AlY < 10.0f) {
            fArr = Sg(this.YFl);
        }
        if (i11 != 26 && i11 != 27 && activity.getResources() != null && activity.getResources().getConfiguration() != null) {
            if ((activity.getResources().getConfiguration().orientation == 2 ? 2 : 1) != i10) {
                if (i10 == 2) {
                    float f10 = fArr[0];
                    float f11 = fArr[1];
                    if (f10 < f11) {
                        fArr[1] = f10;
                        fArr[0] = f11;
                    }
                } else {
                    float f12 = fArr[0];
                    float f13 = fArr[1];
                    if (f12 > f13) {
                        fArr[1] = f12;
                        fArr[0] = f13;
                    }
                }
            }
        }
        return fArr;
    }

    public void YFl() {
        GS.YFl(this.Sg.UI);
        this.Sg.UI.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.YoT.3
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i10) {
                if (i10 == 0) {
                    try {
                        if (YoT.this.Sg.UI.isFinishing()) {
                            return;
                        }
                        YoT.this.Sg.UI.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.YoT.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                GS.YFl(YoT.this.Sg.UI);
                            }
                        }, 2500L);
                    } catch (Exception e2) {
                        com.bytedance.sdk.component.utils.YoT.YFl("TTAD.RFSM", e2.getMessage());
                    }
                }
            }
        });
    }

    private static void YFl(Activity activity, int i10) {
        if (activity.getRequestedOrientation() == i10) {
            return;
        }
        activity.setRequestedOrientation(i10);
    }
}
