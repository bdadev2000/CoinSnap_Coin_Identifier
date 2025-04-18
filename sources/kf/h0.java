package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class h0 extends g0 {
    public static final SparseIntArray J;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.imgResult, 1);
        sparseIntArray.put(R.id.scanLine, 2);
        sparseIntArray.put(R.id.imgFocus, 3);
        sparseIntArray.put(R.id.layoutLoading, 4);
        sparseIntArray.put(R.id.tvProcessing, 5);
        sparseIntArray.put(R.id.btnCancel, 6);
        sparseIntArray.put(R.id.btnPlantIdentifier, 7);
        sparseIntArray.put(R.id.tvBtnIdentify, 8);
        sparseIntArray.put(R.id.icBack, 9);
        sparseIntArray.put(R.id.viewCenterHorizontal, 10);
        sparseIntArray.put(R.id.viewCenterSupport1, 11);
        sparseIntArray.put(R.id.layoutResultNotFound, 12);
        sparseIntArray.put(R.id.tvSnapTips, 13);
        sparseIntArray.put(R.id.imgPass, 14);
        sparseIntArray.put(R.id.tvGuideTitle, 15);
        sparseIntArray.put(R.id.viewLineTextGuide, 16);
        sparseIntArray.put(R.id.viewCenterVerticalSupported, 17);
        sparseIntArray.put(R.id.imgTooDark, 18);
        sparseIntArray.put(R.id.tvTooDark, 19);
        sparseIntArray.put(R.id.imgTooFar, 20);
        sparseIntArray.put(R.id.tvTooFar, 21);
        sparseIntArray.put(R.id.imgBlurry, 22);
        sparseIntArray.put(R.id.tvBlurry, 23);
        sparseIntArray.put(R.id.imgMu, 24);
        sparseIntArray.put(R.id.tvMu, 25);
        sparseIntArray.put(R.id.btnRetake, 26);
        sparseIntArray.put(R.id.btnBackToHome, 27);
        sparseIntArray.put(R.id.tvBackToHome, 28);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h0(android.view.View r20) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.h0.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.I = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.I != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.I = 1L;
        }
        L();
    }
}
