package com.meta.analytics.dsp.uinode;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class O2 extends LinearLayout {
    public static String[] A05 = {"JiUd07qZ", "phaLMHqUBlp6P5RZzzm", "VtPMRXbuUkVLmtGCwM", "RgvNiIo52t", "FYi9K2JmgPw1hqWSXD3EPgcEPQmLRiB", "yPPKnDMDveXTdnfoUUkFxo3t2NtgVDwK", "Cr", "5lHXxybE2bQiDNmNKuHItJ8Sueck67l"};
    public int A00;
    public List<GradientDrawable> A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public O2(C1636Yn c1636Yn, C1P c1p, int i9) {
        super(c1636Yn);
        this.A00 = -1;
        setOrientation(0);
        setGravity(17);
        float f9 = LD.A02;
        int i10 = (int) (8.0f * f9);
        int i11 = (int) (6.0f * f9);
        this.A02 = (int) (1.0f * f9);
        int A04 = c1p.A04(false);
        this.A04 = A04;
        this.A03 = AbstractC08522p.A01(A04, 128);
        this.A01 = new ArrayList();
        for (int margin = 0; margin < i9; margin++) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setSize(i10, i10);
            gradientDrawable.setStroke(this.A02, 0);
            ImageView imageView = new ImageView(c1636Yn);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, i11, 0);
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageDrawable(gradientDrawable);
            this.A01.add(gradientDrawable);
            addView(imageView);
        }
        A00(0);
    }

    public final void A00(int i9) {
        int i10;
        int i11;
        if (this.A00 == i9) {
            return;
        }
        this.A00 = i9;
        if (A05[2].length() == 22) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[4] = "BJqXxH8n0fuaHx3JVwGHjWVcPjmBGjI";
        strArr[7] = "ZUGfW6Md7SIL60yz7Eq8Bq3LU56iFcm";
        for (int i12 = 0; i12 < this.A01.size(); i12++) {
            if (i12 == i9) {
                i10 = this.A04;
                i11 = this.A04;
            } else {
                i10 = this.A03;
                i11 = 0;
            }
            GradientDrawable gradientDrawable = this.A01.get(i12);
            int bgColor = this.A02;
            gradientDrawable.setStroke(bgColor, i11);
            this.A01.get(i12).setColor(i10);
            this.A01.get(i12).invalidateSelf();
        }
    }
}
