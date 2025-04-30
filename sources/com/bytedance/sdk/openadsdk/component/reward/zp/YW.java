package com.bytedance.sdk.openadsdk.component.reward.zp;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.View;
import com.bytedance.sdk.component.utils.RCv;
import com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.utils.WNy;

/* loaded from: classes.dex */
public class YW {
    private boolean KS = true;
    private zp jU;
    private final com.bytedance.sdk.openadsdk.component.reward.zp.zp lMd;
    protected int zp;

    /* loaded from: classes.dex */
    public static abstract class zp implements View.OnLayoutChangeListener {
        private int lMd;
        private int zp;

        private zp() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            int i17 = i11 - i9;
            int i18 = i12 - i10;
            if (i17 != this.zp || i18 != this.lMd) {
                this.zp = i17;
                this.lMd = i18;
                zp(i17, i18);
            }
        }

        public abstract void zp(int i9, int i10);
    }

    public YW(com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar) {
        this.zp = 0;
        this.lMd = zpVar;
        KS();
        try {
            this.zp = WNy.KS(zpVar.oB, WNy.zp());
            zpVar.oB.requestWindowFeature(1);
            zpVar.oB.getWindow().addFlags(16777344);
            if (zpVar.dT != 2 && WNy.KS((Activity) zpVar.oB)) {
                return;
            }
            zpVar.oB.getWindow().addFlags(1024);
        } catch (Throwable th) {
            Log.e("TTAD.RFSM", "init: ", th);
        }
    }

    private float COT() {
        return WNy.KS(this.lMd.oB, WNy.dT(this.lMd.oB));
    }

    private float HWF() {
        return WNy.KS(this.lMd.oB, WNy.YW(this.lMd.oB));
    }

    private void KS() {
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.lMd;
        zpVar.Bj = zpVar.zp.CZ();
        if (26 == Build.VERSION.SDK_INT) {
            if (this.lMd.oB.getResources().getConfiguration().orientation == 1) {
                this.lMd.dT = 1;
                return;
            } else {
                this.lMd.dT = 2;
                return;
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar2 = this.lMd;
        zpVar2.dT = zpVar2.zp.bX();
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void jU() {
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.lMd;
        if (zpVar.dT == 2) {
            if (zpVar.rV) {
                zpVar.oB.setRequestedOrientation(8);
                return;
            } else {
                zpVar.oB.setRequestedOrientation(0);
                return;
            }
        }
        zpVar.oB.setRequestedOrientation(1);
    }

    public void lMd(RCv rCv) {
        try {
            final boolean z8 = true;
            final boolean z9 = this.KS && KVG.jU().Pxi() == 1;
            if (!this.KS || !WNy.KS((Activity) this.lMd.oB)) {
                z8 = false;
            }
            if (z8 || z9) {
                if (this.jU == null) {
                    this.jU = new zp() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.YW.2
                        boolean zp;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        /* JADX WARN: Removed duplicated region for block: B:17:0x00e9 A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x001f, B:7:0x006a, B:9:0x0088, B:11:0x0097, B:13:0x00ab, B:14:0x00af, B:15:0x00e3, B:17:0x00e9, B:18:0x00ee, B:20:0x00fc, B:24:0x00b2, B:26:0x00bc, B:28:0x00d0, B:30:0x00d4, B:31:0x00da, B:33:0x00de, B:34:0x0102, B:36:0x0106, B:39:0x0045), top: B:1:0x0000 }] */
                        /* JADX WARN: Removed duplicated region for block: B:20:0x00fc A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x001f, B:7:0x006a, B:9:0x0088, B:11:0x0097, B:13:0x00ab, B:14:0x00af, B:15:0x00e3, B:17:0x00e9, B:18:0x00ee, B:20:0x00fc, B:24:0x00b2, B:26:0x00bc, B:28:0x00d0, B:30:0x00d4, B:31:0x00da, B:33:0x00de, B:34:0x0102, B:36:0x0106, B:39:0x0045), top: B:1:0x0000 }] */
                        /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
                        @Override // com.bytedance.sdk.openadsdk.component.reward.zp.YW.zp
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public void zp(int r7, int r8) {
                            /*
                                Method dump skipped, instructions count: 269
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.zp.YW.AnonymousClass2.zp(int, int):void");
                        }
                    };
                }
                this.lMd.oB.getWindow().getDecorView().addOnLayoutChangeListener(this.jU);
            }
            this.KS = false;
        } catch (Exception unused) {
        }
    }

    public void zp(RCv rCv) {
        if (rCv == null) {
            return;
        }
        rCv.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.YW.1
            @Override // java.lang.Runnable
            public void run() {
                View findViewById;
                try {
                    View decorView = YW.this.lMd.oB.getWindow().getDecorView();
                    if (decorView != null && (findViewById = decorView.findViewById(R.id.statusBarBackground)) != null) {
                        findViewById.setVisibility(8);
                    }
                } catch (Exception unused) {
                }
            }
        }, 300L);
    }

    public void zp(boolean z8) {
        float min;
        float max;
        int max2;
        int i9;
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 != 26) {
            if (i11 == 27) {
                try {
                    jU();
                } catch (Throwable unused) {
                }
            } else {
                jU();
            }
        }
        float COT = COT();
        float HWF = HWF();
        if (this.lMd.dT == 2) {
            min = Math.max(COT, HWF);
            max = Math.min(COT, HWF);
        } else {
            min = Math.min(COT, HWF);
            max = Math.max(COT, HWF);
        }
        TTBaseVideoActivity tTBaseVideoActivity = this.lMd.oB;
        int KS = WNy.KS(tTBaseVideoActivity, WNy.zp());
        if (this.lMd.dT != 2) {
            if (WNy.KS((Activity) tTBaseVideoActivity)) {
                max -= KS;
            }
        } else if (WNy.KS((Activity) tTBaseVideoActivity)) {
            min -= KS;
        }
        if (z8) {
            com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.lMd;
            zpVar.vDp = (int) min;
            zpVar.tG = (int) max;
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar2 = this.lMd;
        int i12 = 20;
        if (zpVar2.dT != 2) {
            float f9 = zpVar2.Bj;
            if (f9 != 0.0f && f9 != 100.0f) {
                i9 = (int) Math.max((max - (((min - 20.0f) - 20.0f) / f9)) / 2.0f, 0.0f);
                i10 = i9;
                max2 = 20;
            }
            i12 = 0;
            max2 = 0;
            i9 = 0;
            i10 = 0;
        } else {
            float f10 = zpVar2.Bj;
            if (f10 != 0.0f && f10 != 100.0f) {
                max2 = (int) Math.max((min - (((max - 20.0f) - 20.0f) * f10)) / 2.0f, 0.0f);
                i9 = 20;
                i10 = 20;
                i12 = max2;
            }
            i12 = 0;
            max2 = 0;
            i9 = 0;
            i10 = 0;
        }
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar3 = this.lMd;
        float f11 = i12;
        float f12 = max2;
        zpVar3.vDp = (int) ((min - f11) - f12);
        float f13 = i9;
        float f14 = i10;
        zpVar3.tG = (int) ((max - f13) - f14);
        tTBaseVideoActivity.getWindow().getDecorView().setPadding(WNy.lMd(tTBaseVideoActivity, f11), WNy.lMd(tTBaseVideoActivity, f13), WNy.lMd(tTBaseVideoActivity, f12), WNy.lMd(tTBaseVideoActivity, f14));
    }

    private float[] lMd(int i9) {
        float HWF = HWF();
        float COT = COT();
        int i10 = this.lMd.dT;
        if ((i10 == 1) != (HWF > COT)) {
            float f9 = HWF + COT;
            COT = f9 - COT;
            HWF = f9 - COT;
        }
        if (i10 == 1) {
            HWF -= i9;
        } else {
            COT -= i9;
        }
        return new float[]{COT, HWF};
    }

    public void lMd() {
        if (this.jU != null) {
            this.lMd.oB.getWindow().getDecorView().removeOnLayoutChangeListener(this.jU);
            this.jU = null;
        }
    }

    public float[] zp(int i9) {
        TTBaseVideoActivity tTBaseVideoActivity = this.lMd.oB;
        View decorView = tTBaseVideoActivity.getWindow().getDecorView();
        float[] fArr = {decorView.getWidth() - (decorView.getPaddingLeft() * 2), decorView.getHeight() - (decorView.getPaddingTop() * 2)};
        fArr[0] = WNy.KS(tTBaseVideoActivity, fArr[0]);
        float KS = WNy.KS(tTBaseVideoActivity, fArr[1]);
        fArr[1] = KS;
        if (fArr[0] < 10.0f || KS < 10.0f) {
            fArr = lMd(this.zp);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 != 26 && i10 != 27 && tTBaseVideoActivity.getResources() != null && tTBaseVideoActivity.getResources().getConfiguration() != null) {
            if ((tTBaseVideoActivity.getResources().getConfiguration().orientation == 2 ? 2 : 1) != i9) {
                if (i9 == 2) {
                    float f9 = fArr[0];
                    float f10 = fArr[1];
                    if (f9 < f10) {
                        fArr[1] = f9;
                        fArr[0] = f10;
                    }
                } else {
                    float f11 = fArr[0];
                    float f12 = fArr[1];
                    if (f11 > f12) {
                        fArr[1] = f11;
                        fArr[0] = f12;
                    }
                }
            }
        }
        return fArr;
    }

    public void zp() {
        WNy.zp((Activity) this.lMd.oB);
        this.lMd.oB.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.YW.3
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i9) {
                if (i9 == 0) {
                    try {
                        if (YW.this.lMd.oB.isFinishing()) {
                            return;
                        }
                        YW.this.lMd.oB.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.YW.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                WNy.zp((Activity) YW.this.lMd.oB);
                            }
                        }, 2500L);
                    } catch (Exception e4) {
                        com.bytedance.sdk.component.utils.tG.zp("TTAD.RFSM", e4.getMessage());
                    }
                }
            }
        });
    }
}
