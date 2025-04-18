package com.instagram.common.viewpoint.core;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class CG extends C1106as {
    public static String[] A01 = {"5vbH5h", "J", "C4GDfN5QjjsYSTm6MxZFmUsCMcA9wBBJ", "6VFwzkwOMMM2Di2Z85K5QmwqwgWhrd8W", "uhhUuQP5WsjWPtKrx", "v18Pv4VwePGedZr395LFzqQB6yfdWBSj", "eHjrumjSh1wPfIUStRl2rH8Zl9vSSm7d", "psLA63BrOeuZ89bQmrhMweOfIVNK7DGd"};
    public final /* synthetic */ CD A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.C1106as
    public final int A0O(View view, int i2) {
        int i3;
        AbstractC02804o A08 = A08();
        if (!A08.A20()) {
            return 0;
        }
        C02814p c02814p = (C02814p) view.getLayoutParams();
        int A0N = A0N(A08.A0k(view) - c02814p.leftMargin, A08.A0n(view) + c02814p.rightMargin, A08.A0e(), A08.A0h() - A08.A0f(), i2);
        i3 = this.A00.A02;
        int i4 = A0N + i3;
        if (A01[0].length() != 6) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "LE8phwfR0RxAHMOOl0X9IEx3wOgwcDNd";
        strArr[7] = "Bj9ROfqsKQjGAcpCTsOWpU0U4DTJlpud";
        return i4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CG(CD cd, C1045Zs c1045Zs) {
        super(c1045Zs);
        this.A00 = cd;
    }

    @Override // com.instagram.common.viewpoint.core.C1106as
    public final float A0J(DisplayMetrics displayMetrics) {
        float f2;
        f2 = this.A00.A00;
        return f2 / displayMetrics.densityDpi;
    }

    @Override // com.instagram.common.viewpoint.core.C1106as
    public final int A0K() {
        return -1;
    }

    @Override // com.instagram.common.viewpoint.core.C1106as
    public final PointF A0P(int i2) {
        return this.A00.A4k(i2);
    }
}
