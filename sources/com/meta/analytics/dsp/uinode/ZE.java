package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class ZE extends C08703h {
    public static String[] A01 = {"OZnJYNnF6iNpWafuL0M1gR4fftLtNKLH", "jp3I09eVvza8VUO8I2V9bgD0uqoo2eoT", "o0dN6TNbDPM1OFHwgByg4fes3ij5f0X", "koNydS70AznyGH22QswPXmmCOWqgW7Lp", "FfQJA5dgq067zFURnAgi95yx0TDwU15M", "ldbJEvhnHaVxGyPD7qN3mcBmJCgMtAqs", "ixVhzklDdFphFwHpdcaKVfByjOKIZSaQ", "Bo7wQ6HJBqNsqngGB"};
    public int A00;

    public ZE(Context context) {
        super(context);
        this.A00 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00(int i9) {
        this.A00 = i9;
    }

    @Override // com.meta.analytics.dsp.uinode.C08703h, android.view.View
    public final void onMeasure(int i9, int i10) {
        int height;
        int h6 = this.A00;
        int i11 = 0;
        while (true) {
            int childCount = getChildCount();
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[0];
            int i12 = str.charAt(3);
            int height2 = str2.charAt(3);
            if (i12 != height2) {
                throw new RuntimeException();
            }
            A01[2] = "oQM5as2Hx349sp";
            if (i11 < childCount) {
                View childAt = getChildAt(i11);
                int height3 = View.MeasureSpec.makeMeasureSpec(0, 0);
                childAt.measure(i9, height3);
                int i13 = A01[3].charAt(2);
                if (i13 != 78) {
                    height = childAt.getMeasuredHeight();
                    if (height <= h6) {
                        i11++;
                    }
                    h6 = height;
                    i11++;
                } else {
                    A01[7] = "8uJesuWryF1bocGxs";
                    height = childAt.getMeasuredHeight();
                    if (height <= h6) {
                        i11++;
                    }
                    h6 = height;
                    i11++;
                }
            } else {
                int height4 = View.MeasureSpec.makeMeasureSpec(h6, 1073741824);
                super.onMeasure(i9, height4);
                return;
            }
        }
    }
}
