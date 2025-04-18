package com.instagram.common.viewpoint.core;

import android.graphics.PointF;
import android.view.View;
import com.google.android.gms.common.api.Api;

/* loaded from: assets/audience_network.dex */
public final class FM extends AbstractC1092ad {
    public static String[] A02 = {"ZvwGPtqIyq", "yiAZi4T0ry", "MW2e2TOPDP9pjEe4rTD", "HlrRgmhjIEURNOsi3rdB558cP", "dU7euze3hj2U1ev62XjIRTQ2vrQriAnf", "8gl08jl5gi3EpiFcU", "SXjkVQ4wGxN0zpwvt09Xfw5qzXSeRw0d", "Y5nQdyuIxyo1Orqk0oN6DnQ8XCev4LBn"};
    public C4Y A00;
    public C4Y A01;

    private int A00(AbstractC02804o abstractC02804o, View view, C4Y c4y) {
        int containerCenter;
        int A0F = c4y.A0F(view) + (c4y.A0D(view) / 2);
        if (abstractC02804o.A1T()) {
            int A0A = c4y.A0A();
            int childCenter = c4y.A0B();
            containerCenter = A0A + (childCenter / 2);
        } else {
            int childCenter2 = c4y.A06();
            containerCenter = childCenter2 / 2;
        }
        return A0F - containerCenter;
    }

    private View A01(AbstractC02804o abstractC02804o, C4Y c4y) {
        int i2;
        int A0W = abstractC02804o.A0W();
        if (A0W == 0) {
            return null;
        }
        View view = null;
        if (abstractC02804o.A1T()) {
            int A0A = c4y.A0A();
            int childCount = c4y.A0B();
            i2 = A0A + (childCount / 2);
        } else {
            int childCount2 = c4y.A06();
            i2 = childCount2 / 2;
        }
        int i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i4 = 0; i4 < A0W; i4++) {
            View A0t = abstractC02804o.A0t(i4);
            int A0F = c4y.A0F(A0t);
            int childCount3 = c4y.A0D(A0t);
            int childCount4 = Math.abs((A0F + (childCount3 / 2)) - i2);
            if (childCount4 < i3) {
                i3 = childCount4;
                String[] strArr = A02;
                String str = strArr[0];
                String str2 = strArr[1];
                int length = str.length();
                int childCount5 = str2.length();
                if (length != childCount5) {
                    throw new RuntimeException();
                }
                A02[5] = "j4bRVUHHACnikA";
                view = A0t;
            }
        }
        return view;
    }

    private View A02(AbstractC02804o abstractC02804o, C4Y c4y) {
        int A0W = abstractC02804o.A0W();
        if (A0W == 0) {
            return null;
        }
        View view = null;
        int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (A02[7].charAt(21) == '9') {
            throw new RuntimeException();
        }
        A02[7] = "DwjJFjjR1ioErHTPj2QZ0AbXqU5bWHnc";
        for (int childCount = 0; childCount < A0W; childCount++) {
            View A0t = abstractC02804o.A0t(childCount);
            int A0F = c4y.A0F(A0t);
            if (A0F < i2) {
                i2 = A0F;
                view = A0t;
            }
        }
        return view;
    }

    private C4Y A03(AbstractC02804o abstractC02804o) {
        if (this.A00 == null || this.A00.A02 != abstractC02804o) {
            this.A00 = C4Y.A00(abstractC02804o);
        }
        return this.A00;
    }

    private C4Y A04(AbstractC02804o abstractC02804o) {
        if (this.A01 == null || this.A01.A02 != abstractC02804o) {
            this.A01 = C4Y.A01(abstractC02804o);
        }
        return this.A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.instagram.common.viewpoint.core.AbstractC1092ad
    public final int A0C(AbstractC02804o abstractC02804o, int i2, int i3) {
        int A0p;
        int centerPosition;
        int A0Z = abstractC02804o.A0Z();
        if (A0Z == 0) {
            return -1;
        }
        View view = null;
        if (abstractC02804o.A21()) {
            view = A02(abstractC02804o, A04(abstractC02804o));
        } else if (abstractC02804o.A20()) {
            view = A02(abstractC02804o, A03(abstractC02804o));
        }
        if (view == null || (A0p = abstractC02804o.A0p(view)) == -1) {
            return -1;
        }
        if (abstractC02804o.A20()) {
            centerPosition = i2 > 0 ? 1 : 0;
        } else {
            centerPosition = i3 > 0 ? 1 : 0;
        }
        boolean z2 = false;
        if (abstractC02804o instanceof AnonymousClass50) {
            int itemCount = A0Z - 1;
            PointF A4k = ((AnonymousClass50) abstractC02804o).A4k(itemCount);
            if (A4k != null) {
                z2 = A4k.x < 0.0f || A4k.y < 0.0f;
            }
        }
        return z2 ? centerPosition != 0 ? A0p - 1 : A0p : centerPosition != 0 ? A0p + 1 : A0p;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1092ad
    public final View A0D(AbstractC02804o abstractC02804o) {
        if (abstractC02804o.A21()) {
            return A01(abstractC02804o, A04(abstractC02804o));
        }
        if (abstractC02804o.A20()) {
            View A01 = A01(abstractC02804o, A03(abstractC02804o));
            if (A02[4].charAt(24) != 'v') {
                throw new RuntimeException();
            }
            A02[5] = "ku3zp";
            return A01;
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1092ad
    public final C1106as A0E(AbstractC02804o abstractC02804o) {
        if (!(abstractC02804o instanceof AnonymousClass50)) {
            return null;
        }
        return new FN(this, super.A00.getContext());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1092ad
    public final int[] A0H(AbstractC02804o abstractC02804o, View view) {
        int[] iArr = new int[2];
        if (abstractC02804o.A20()) {
            iArr[0] = A00(abstractC02804o, view, A03(abstractC02804o));
        } else {
            iArr[0] = 0;
        }
        if (abstractC02804o.A21()) {
            iArr[1] = A00(abstractC02804o, view, A04(abstractC02804o));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
