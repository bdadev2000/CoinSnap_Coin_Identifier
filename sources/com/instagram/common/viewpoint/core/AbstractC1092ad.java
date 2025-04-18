package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ad, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1092ad extends AbstractC02834r {
    public static byte[] A03;
    public static String[] A04 = {"VI3k6vbyE", "wbKxmRtdnLanYPPQlq0AQ7UHjncjxjam", "7rHsxeXjhwTRluKKUSI3i7DNAgzyS", "RLsJgHk6VqLvU3GrilIJimxIkswsMvKT", "sHDfA32w1RYOD3HMFDMkWGxW2yjuY1ZH", "JEcuqbBofZsfD30FS8fTTaggCipMDK", "8NUawD4TiWbh8YzDjR1LHPIBKq0RidcG", "8EIjrQLLrDPWSel1MFlzfXR6TVhPBcGW"};
    public FL A00;
    public Scroller A01;
    public final AbstractC02854t A02 = new C1093ae(this);

    public static String A06(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 15);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A03 = new byte[]{-120, -75, 103, -80, -75, -70, -69, -88, -75, -86, -84, 103, -74, -83, 103, -106, -75, -115, -77, -80, -75, -82, -109, -80, -70, -69, -84, -75, -84, -71, 103, -88, -77, -71, -84, -88, -85, -64, 103, -70, -84, -69, 117};
    }

    public abstract int A0C(AbstractC02804o abstractC02804o, int i2, int i3);

    public abstract View A0D(AbstractC02804o abstractC02804o);

    @Deprecated
    public abstract C1106as A0E(AbstractC02804o abstractC02804o);

    public abstract int[] A0H(AbstractC02804o abstractC02804o, View view);

    static {
        A09();
    }

    private final C1106as A05(AbstractC02804o abstractC02804o) {
        return A0E(abstractC02804o);
    }

    private void A07() {
        this.A00.A1g(this.A02);
        this.A00.setOnFlingListener(null);
    }

    private void A08() throws IllegalStateException {
        if (this.A00.getOnFlingListener() == null) {
            this.A00.A1f(this.A02);
            this.A00.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException(A06(0, 43, 56));
    }

    private boolean A0A(AbstractC02804o abstractC02804o, int i2, int i3) {
        C1106as A05;
        int A0C;
        if (!(abstractC02804o instanceof AnonymousClass50) || (A05 = A05(abstractC02804o)) == null || (A0C = A0C(abstractC02804o, i2, i3)) == -1) {
            return false;
        }
        A05.A0A(A0C);
        abstractC02804o.A1L(A05);
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02834r
    public final boolean A0B(int i2, int i3) {
        AbstractC02804o layoutManager = this.A00.getLayoutManager();
        if (layoutManager == null || this.A00.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.A00.getMinFlingVelocity();
        return (Math.abs(i3) > minFlingVelocity || Math.abs(i2) > minFlingVelocity) && A0A(layoutManager, i2, i3);
    }

    public final void A0F() {
        AbstractC02804o layoutManager;
        View A0D;
        if (this.A00 == null || (layoutManager = this.A00.getLayoutManager()) == null || (A0D = A0D(layoutManager)) == null) {
            return;
        }
        int[] A0H = A0H(layoutManager, A0D);
        if (A0H[0] != 0 || A0H[1] != 0) {
            this.A00.A1c(A0H[0], A0H[1]);
        }
    }

    public final void A0G(FL fl) throws IllegalStateException {
        if (this.A00 == fl) {
            return;
        }
        FL fl2 = this.A00;
        if (A04[3].charAt(14) == 'w') {
            throw new RuntimeException();
        }
        A04[4] = "xzKGxret4GzWIxaR6oK37PWpSNYAUaFQ";
        if (fl2 != null) {
            A07();
        }
        this.A00 = fl;
        if (this.A00 != null) {
            A08();
            this.A01 = new Scroller(this.A00.getContext(), new DecelerateInterpolator());
            A0F();
        }
    }
}
