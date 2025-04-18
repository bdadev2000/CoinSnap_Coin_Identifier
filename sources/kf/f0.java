package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class f0 extends e0 {
    public static final SparseIntArray L;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.camera, 2);
        sparseIntArray.put(R.id.layoutToolTop, 3);
        sparseIntArray.put(R.id.icBack, 4);
        sparseIntArray.put(R.id.icFlash, 5);
        sparseIntArray.put(R.id.layoutToolBottom, 6);
        sparseIntArray.put(R.id.viewCenter, 7);
        sparseIntArray.put(R.id.btnIdentify, 8);
        sparseIntArray.put(R.id.btnDiagnose, 9);
        sparseIntArray.put(R.id.imgTakePhoto, 10);
        sparseIntArray.put(R.id.layoutCountScan, 11);
        sparseIntArray.put(R.id.tvCountScan, 12);
        sparseIntArray.put(R.id.tvTotalScan, 13);
        sparseIntArray.put(R.id.btnAlbum, 14);
        sparseIntArray.put(R.id.btnSnapTips, 15);
        sparseIntArray.put(R.id.layoutSnapTips, 16);
        sparseIntArray.put(R.id.tvSnapTips, 17);
        sparseIntArray.put(R.id.imgPass, 18);
        sparseIntArray.put(R.id.tvGuideTitle, 19);
        sparseIntArray.put(R.id.viewLineTextGuide, 20);
        sparseIntArray.put(R.id.viewCenterVerticalSupported, 21);
        sparseIntArray.put(R.id.imgTooDark, 22);
        sparseIntArray.put(R.id.tvTooDark, 23);
        sparseIntArray.put(R.id.imgTooFar, 24);
        sparseIntArray.put(R.id.tvTooFar, 25);
        sparseIntArray.put(R.id.imgBlurry, 26);
        sparseIntArray.put(R.id.tvBlurry, 27);
        sparseIntArray.put(R.id.imgMu, 28);
        sparseIntArray.put(R.id.tvMu, 29);
        sparseIntArray.put(R.id.btnUnderStand, 30);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f0(android.view.View r22) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.f0.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.K = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.K != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.K = 1L;
        }
        L();
    }
}
