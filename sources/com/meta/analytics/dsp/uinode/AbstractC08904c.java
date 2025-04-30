package com.meta.analytics.dsp.uinode;

import android.view.ViewGroup;
import com.meta.analytics.dsp.uinode.AnonymousClass56;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC08904c<VH extends AnonymousClass56> {
    public static byte[] A02;
    public static String[] A03 = {"W324oDAhe3QD27ZyNAxx1dE4409WhTwA", "Ikg10MzvREcGgl38", "tAS262iMJzRr57vvpxPoG7SYxewns3xN", "rCt", "3uu7", "cbDGC8uMMSmc1mSYy17nilWnTwttZfvA", "2T", "U5f6pdP97"};
    public final C08914d A01 = new C08914d();
    public boolean A00 = false;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[2].charAt(21) != '7') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[1] = "WHsKZN6zyncpMK6d";
            strArr[4] = "wlW4";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 32);
            i12++;
        }
    }

    public static void A01() {
        A02 = new byte[]{-48, -44, -98, -63, -16, -29, -33, -14, -29, -44, -25, -29, -11, -54, -50, -104, -57, -26, -70, -31, -26, -36, -50, -31, -35, -17};
    }

    public abstract VH A0C(ViewGroup viewGroup, int i9);

    public abstract void A0D(VH vh, int i9);

    public abstract int A0E();

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    private final void A02(VH holder, int i9, List<Object> payloads) {
        A0D(holder, i9);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    public final int A03(int i9) {
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    public final long A04(int i9) {
        return -1L;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    public final VH A05(ViewGroup viewGroup, int i9) {
        AbstractC08532q.A01(A00(0, 13, 94));
        VH holder = A0C(viewGroup, i9);
        holder.A00 = i9;
        AbstractC08532q.A00();
        return holder;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    public final void A06() {
        this.A01.A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    public final void A07(AbstractC08924e abstractC08924e) {
        this.A01.registerObserver(abstractC08924e);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    public final void A08(AbstractC08924e abstractC08924e) {
        this.A01.unregisterObserver(abstractC08924e);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    public final void A09(VH vh, int i9) {
        vh.A03 = i9;
        if (A0A()) {
            long A04 = A04(i9);
            String[] strArr = A03;
            if (strArr[7].length() != strArr[6].length()) {
                String[] strArr2 = A03;
                strArr2[7] = "OgtetI94x";
                strArr2[6] = "QU";
                vh.A05 = A04;
            }
            throw new RuntimeException();
        }
        vh.A0U(1, 519);
        AbstractC08532q.A01(A00(13, 13, 88));
        A02(vh, i9, vh.A0L());
        vh.A0N();
        ViewGroup.LayoutParams layoutParams = vh.A0H.getLayoutParams();
        if (layoutParams instanceof C09034p) {
            ((C09034p) layoutParams).A01 = true;
        }
        AbstractC08532q.A00();
        String[] strArr3 = A03;
        if (strArr3[5].charAt(31) == strArr3[0].charAt(31)) {
            String[] strArr4 = A03;
            strArr4[7] = "GQKIQ0ZEK";
            strArr4[6] = "Zf";
            return;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    public final boolean A0A() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.56> */
    public final boolean A0B(VH holder) {
        return false;
    }
}
