package com.instagram.common.viewpoint.core;

import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.cE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1188cE extends AbstractC02684c<VW> {
    public static String[] A05 = {"BofGdT", "Cb8B81bPHxSAbCDzy4", "tLXqRIVVg6Ax3ByQPtTHAjuCLXMkMIv2", "Awqy8gsEnlsE3SarczMGKLCzZdtyeG5w", "c95zYEegXXkMe1M4f4KrlDKZ96YYHdKl", "dzB1VPy83al1mBxHBTo", "7fXNgxpNBgLKECdM7L4CyN3WmxsqHAeT", "HUwJOtf8ZOX36MmDYBkOhN0MiSikj2Pg"};
    public static final int A06 = (int) (LP.A02 * 4.0f);
    public C1A A00;
    public final List<W7> A01;
    public final int A02;
    public final C1045Zs A03;
    public final AbstractC0832Rj A04 = new C1190cG(this);

    public AbstractC1188cE(C3C c3c, List<W7> list, C1045Zs c1045Zs) {
        this.A03 = c1045Zs;
        this.A02 = c3c.getChildSpacing();
        this.A01 = list;
    }

    private ViewGroup.MarginLayoutParams A02(int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i3 = this.A02;
        if (i2 == 0) {
            i3 *= 2;
        }
        int size = this.A01.size() - 1;
        String[] strArr = A05;
        if (strArr[3].charAt(2) == strArr[4].charAt(2)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[7] = "KlchvvVcsY9zV3e8wqzNtTZQscUuxnqD";
        strArr2[1] = "gQBYn2ao1l5plthpQQ";
        marginLayoutParams.setMargins(i3, 0, i2 >= size ? this.A02 * 2 : this.A02, 0);
        return marginLayoutParams;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02684c
    public final int A0E() {
        return this.A01.size();
    }

    public final void A0F(ImageView imageView, int i2) {
        W7 w7 = this.A01.get(i2);
        JU adCoverImage = w7.getAdCoverImage();
        if (adCoverImage != null) {
            AsyncTaskC0914Un A04 = new AsyncTaskC0914Un(imageView, this.A03).A04();
            A04.A06(new C1189cF(this, i2, w7));
            A04.A07(adCoverImage.getUrl());
        }
    }

    public final void A0G(C1A c1a) {
        this.A00 = c1a;
    }

    public void A0H(VW vw, int i2) {
        vw.A0j().setLayoutParams(A02(i2));
    }
}
