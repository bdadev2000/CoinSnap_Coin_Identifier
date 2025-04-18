package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ao, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1102ao implements C4B {
    public static byte[] A01;
    public final /* synthetic */ FL A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 72);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-26, 4, 15, 15, 8, 7, -61, 4, 23, 23, 4, 6, 11, -61, 18, 17, -61, 4, -61, 6, 11, 12, 15, 7, -61, 26, 11, 12, 6, 11, -61, 12, 22, -61, 17, 18, 23, -61, 7, 8, 23, 4, 6, 11, 8, 7, -35, -61, -53, -55, -44, -44, -51, -52, -120, -52, -51, -36, -55, -53, -48, -120, -41, -42, -120, -55, -42, -120, -55, -44, -38, -51, -55, -52, -31, -120, -52, -51, -36, -55, -53, -48, -51, -52, -120, -53, -48, -47, -44, -52, -120};
    }

    public C1102ao(FL fl) {
        this.A00 = fl;
    }

    @Override // com.instagram.common.viewpoint.core.C4B
    public final void A40(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        AnonymousClass56 A0F = FL.A0F(view);
        if (A0F != null) {
            if (A0F.A0c() || A0F.A0f()) {
                A0F.A0P();
            } else {
                throw new IllegalArgumentException(A00(0, 48, 91) + A0F + this.A00.A1H());
            }
        }
        this.A00.attachViewToParent(view, i2, layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.C4B
    public final void A5T(int i2) {
        AnonymousClass56 A0F;
        View view = A6k(i2);
        if (view != null && (A0F = FL.A0F(view)) != null) {
            if (!A0F.A0c() || A0F.A0f()) {
                A0F.A0T(256);
            } else {
                throw new IllegalArgumentException(A00(48, 43, 32) + A0F + this.A00.A1H());
            }
        }
        this.A00.detachViewFromParent(i2);
    }

    @Override // com.instagram.common.viewpoint.core.C4B
    public final View A6k(int i2) {
        return this.A00.getChildAt(i2);
    }

    @Override // com.instagram.common.viewpoint.core.C4B
    public final int A6l() {
        return this.A00.getChildCount();
    }

    @Override // com.instagram.common.viewpoint.core.C4B
    public final AnonymousClass56 A6o(View view) {
        return FL.A0F(view);
    }

    @Override // com.instagram.common.viewpoint.core.C4B
    public final int A9C(View view) {
        return this.A00.indexOfChild(view);
    }

    @Override // com.instagram.common.viewpoint.core.C4B
    public final void ABr(View view) {
        AnonymousClass56 A0F = FL.A0F(view);
        if (A0F != null) {
            A0F.A07(this.A00);
        }
    }

    @Override // com.instagram.common.viewpoint.core.C4B
    public final void ACO(View view) {
        AnonymousClass56 A0F = FL.A0F(view);
        if (A0F != null) {
            A0F.A08(this.A00);
        }
    }

    @Override // com.instagram.common.viewpoint.core.C4B
    public final void AFZ() {
        int A6l = A6l();
        for (int i2 = 0; i2 < A6l; i2++) {
            View A6k = A6k(i2);
            this.A00.A1e(A6k);
            A6k.clearAnimation();
        }
        this.A00.removeAllViews();
    }

    @Override // com.instagram.common.viewpoint.core.C4B
    public final void AFd(int i2) {
        View childAt = this.A00.getChildAt(i2);
        if (childAt != null) {
            this.A00.A1e(childAt);
            childAt.clearAnimation();
        }
        this.A00.removeViewAt(i2);
    }

    @Override // com.instagram.common.viewpoint.core.C4B
    public final void addView(View view, int i2) {
        this.A00.addView(view, i2);
        this.A00.A1d(view);
    }
}
