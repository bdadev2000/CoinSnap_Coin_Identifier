package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class v extends u {
    public static final SparseIntArray I;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.layoutWeatherInformation, 1);
        sparseIntArray.put(R.id.bgWeather, 2);
        sparseIntArray.put(R.id.icLocationHome, 3);
        sparseIntArray.put(R.id.tvLocationUnavailable, 4);
        sparseIntArray.put(R.id.tvTapToEnable, 5);
        sparseIntArray.put(R.id.tvCityName, 6);
        sparseIntArray.put(R.id.tvWeatherInformation, 7);
        sparseIntArray.put(R.id.icSettingHome, 8);
        sparseIntArray.put(R.id.icVip, 9);
        sparseIntArray.put(R.id.layoutBottomBar, 10);
        sparseIntArray.put(R.id.btnTabHome, 11);
        sparseIntArray.put(R.id.icTabHome, 12);
        sparseIntArray.put(R.id.tvTabHome, 13);
        sparseIntArray.put(R.id.btnTabMyPlant, 14);
        sparseIntArray.put(R.id.icTabMyPlant, 15);
        sparseIntArray.put(R.id.tvTabMyPlant, 16);
        sparseIntArray.put(R.id.imgAdd, 17);
        sparseIntArray.put(R.id.vpgHome, 18);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public v(android.view.View r19) {
        /*
            r18 = this;
            r15 = r18
            r14 = r19
            r0 = r18
            r2 = r19
            r1 = 0
            android.util.SparseIntArray r3 = kf.v.I
            r4 = 19
            r13 = 0
            java.lang.Object[] r17 = androidx.databinding.e.K(r14, r4, r13, r3)
            r3 = 2
            r3 = r17[r3]
            com.makeramen.roundedimageview.RoundedImageView r3 = (com.makeramen.roundedimageview.RoundedImageView) r3
            r3 = 11
            r3 = r17[r3]
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r4 = 14
            r4 = r17[r4]
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r5 = 3
            r5 = r17[r5]
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r5 = 8
            r5 = r17[r5]
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r6 = 12
            r6 = r17[r6]
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r7 = 15
            r7 = r17[r7]
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r8 = 9
            r8 = r17[r8]
            com.airbnb.lottie.LottieAnimationView r8 = (com.airbnb.lottie.LottieAnimationView) r8
            r9 = 17
            r9 = r17[r9]
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r10 = 10
            r10 = r17[r10]
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r10 = 1
            r10 = r17[r10]
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r10 = 6
            r10 = r17[r10]
            android.widget.TextView r10 = (android.widget.TextView) r10
            r11 = 4
            r11 = r17[r11]
            android.widget.TextView r11 = (android.widget.TextView) r11
            r12 = 13
            r12 = r17[r12]
            android.widget.TextView r12 = (android.widget.TextView) r12
            r16 = 16
            r16 = r17[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r13 = r16
            r16 = 5
            r16 = r17[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r14 = r16
            r16 = 7
            r16 = r17[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r15 = r16
            r16 = 18
            r16 = r17[r16]
            androidx.viewpager2.widget.ViewPager2 r16 = (androidx.viewpager2.widget.ViewPager2) r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = -1
            r2 = r18
            r2.H = r0
            r0 = 0
            r0 = r17[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r1 = 0
            r0.setTag(r1)
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r1 = r19
            r1.setTag(r0, r2)
            r18.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.v.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.H = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.H != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.H = 1L;
        }
        L();
    }
}
