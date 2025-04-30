package com.meta.analytics.dsp.uinode;

import android.graphics.Rect;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentTransaction;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C08813s {
    public static byte[] A02;
    public static String[] A03 = {"IVmNZ4K5ijrEy03SUyZllrwYfGsSidsw", "uaVeZCSsPKZMiFLhWQ93bkOuh7Bkr", "fj8UDgC4HzdO2kuBNBPUB7GtanmKKm25", "SYZpn4btE2JdKC0jqJVDdFV7Ab7Ex928", "9XKyAy0QwW2RAbyuAC0HJ7gQU9o6NjRH", "LWQKQsADjd8kwxodkBq3bJfZv3R2tuNQ", "ttD9SROXIamLqNqjpH0jHeP07ZacbL3Q", "0sQtHWJTsFmoyuVwvJXQHcjInEg1c"};
    public static final C08773o A04;
    public int A00 = -1;
    public final AccessibilityNodeInfo A01;

    public static String A08(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 123);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A02 = new byte[]{107, 103, 90, 65, 58, 53, 46, 108, 97, 123, 96, 106, 125, 71, 96, 94, 111, 124, 107, 96, 122, 52, 46, 43, 48, 114, Ascii.DEL, 101, 126, 116, 99, 89, 126, 67, 115, 98, 117, 117, 126, 42, 48, 52, 47, 108, 103, 106, 108, 100, 110, 109, 99, 106, 53, 47, 56, 35, 96, 107, 102, 96, 104, 102, 103, 57, 35, 59, 32, 99, 108, 97, 115, 115, 78, 97, 109, 101, 58, 32, 50, 41, 106, 101, 96, 106, 98, 104, 107, 101, 108, 51, 41, 88, 67, 0, Ascii.FF, Ascii.CR, Ascii.ETB, 6, Ascii.CR, Ascii.ETB, 39, 6, Ascii.DLE, 0, 17, 10, 19, Ascii.ETB, 10, Ascii.FF, Ascii.CR, 89, 67, 49, 42, 111, 100, 107, 104, 102, 111, 110, 48, 42, 64, 91, Ascii.GS, Ascii.DC4, Ascii.CAN, Ascii.SO, 8, Ascii.SUB, Ascii.EM, Ascii.ETB, Ascii.RS, 65, 91, 52, 47, 105, 96, 108, 122, 124, 106, 107, 53, 47, 60, 39, 107, 104, 105, 96, 68, 107, 110, 100, 108, 102, 101, 107, 98, 61, 39, 36, 63, 111, 126, 124, 116, 126, 120, 122, 81, 126, 114, 122, 37, 63, 7, Ascii.FS, 76, 93, 79, 79, 75, 83, 78, 88, 6, Ascii.FS, Ascii.SYN, Ascii.CR, 94, 78, 95, 66, 65, 65, 76, 79, 65, 72, Ascii.ETB, Ascii.CR, Ascii.GS, 6, 85, 67, 74, 67, 69, 82, 67, 66, Ascii.FS, 6, 80, 75, Ascii.US, Ascii.SO, 19, Ascii.US, 81, 75, Ascii.DEL, 100, 50, 45, 33, 51, Ascii.CR, 32, 126, 100, 33, 35, 52, 41, 47, 46, 63, 33, 35, 35, 37, 51, 51, 41, 34, 41, 44, 41, 52, 57, 63, 38, 47, 35, 53, 51, 109, 111, 120, 101, 99, 98, 115, 111, 96, 105, 109, 126, 115, 109, 111, 111, 105, Ascii.DEL, Ascii.DEL, 101, 110, 101, 96, 101, 120, 117, 115, 106, 99, 111, 121, Ascii.DEL, 32, 34, 53, 40, 46, 47, 62, 34, 45, 36, 32, 51, 62, 39, 46, 34, 52, 50, 51, 49, 38, 59, 61, 60, 45, 49, 62, 55, 51, 32, 45, 33, 55, 62, 55, 49, 38, 59, 61, 60, Ascii.EM, Ascii.ESC, Ascii.FF, 17, Ascii.ETB, Ascii.SYN, 7, Ascii.ESC, Ascii.DC4, 17, Ascii.ESC, 19, 69, 71, 80, 77, 75, 74, 91, 71, 75, 84, 93, 107, 105, 126, 99, 101, 100, 117, 105, Ascii.DEL, 126, 8, 10, Ascii.GS, 0, 6, 7, Ascii.SYN, Ascii.SI, 6, 10, Ascii.FS, Ascii.SUB, 63, 61, 42, 55, 49, 48, 33, 50, 49, 48, 57, 33, 61, 50, 55, 61, 53, 90, 88, 79, 82, 84, 85, 68, 85, 94, 67, 79, 68, 90, 79, 68, 86, 84, 77, 94, 86, 94, 85, 79, 68, 92, 73, 90, 85, 78, 87, 90, 73, 82, 79, 66, 78, 76, 91, 70, 64, 65, 80, 65, 74, 87, 91, 80, 71, 91, 66, 67, 80, 74, 67, 74, 66, 74, 65, 91, 34, 32, 55, 42, 44, 45, 60, 51, 34, 48, 55, 38, Ascii.NAK, Ascii.ETB, 0, Ascii.GS, Ascii.ESC, Ascii.SUB, Ascii.VT, 4, 6, 17, 2, Ascii.GS, Ascii.ESC, 1, 7, Ascii.VT, Ascii.NAK, 0, Ascii.VT, Ascii.EM, Ascii.ESC, 2, 17, Ascii.EM, 17, Ascii.SUB, 0, Ascii.VT, 19, 6, Ascii.NAK, Ascii.SUB, 1, Ascii.CAN, Ascii.NAK, 6, Ascii.GS, 0, Ascii.CR, 45, 47, 56, 37, 35, 34, 51, 60, 62, 41, 58, 37, 35, 57, 63, 51, 36, 56, 33, 32, 51, 41, 32, 41, 33, 41, 34, 56, Ascii.SO, Ascii.FF, Ascii.ESC, 6, 0, 1, Ascii.DLE, Ascii.FS, Ascii.FF, Ascii.GS, 0, 3, 3, Ascii.DLE, Ascii.CR, Ascii.SO, Ascii.FF, 4, Ascii.CAN, Ascii.SO, Ascii.GS, Ascii.VT, 4, 6, 17, Ascii.FF, 10, Ascii.VT, Ascii.SUB, Ascii.SYN, 6, Ascii.ETB, 10, 9, 9, Ascii.SUB, 3, 10, Ascii.ETB, Ascii.DC2, 4, Ascii.ETB, 1, 34, 32, 55, 42, 44, 45, 60, 48, 38, 47, 38, 32, 55, 52, 54, 33, 60, 58, 59, 42, 38, 48, 33, 42, 38, 48, 57, 48, 54, 33, 60, 58, 59, Ascii.CAN, Ascii.SUB, Ascii.CR, Ascii.DLE, Ascii.SYN, Ascii.ETB, 6, Ascii.FF, Ascii.ETB, Ascii.DC2, Ascii.ETB, Ascii.SYN, Ascii.SO, Ascii.ETB, 87};
    }

    static {
        A09();
        if (Build.VERSION.SDK_INT >= 24) {
            A04 = new C1D() { // from class: com.facebook.ads.redexgen.X.0c
            };
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            A04 = new C1D();
            return;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            A04 = new C08221l();
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            A04 = new C08372a();
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            A04 = new C3H();
            return;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            A04 = new C09486k();
            return;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            A04 = new C1125Eh();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A04 = new C1669Zv();
        } else {
            A04 = new C08773o();
        }
    }

    public C08813s(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.A01 = accessibilityNodeInfo;
    }

    private final int A00() {
        return this.A01.getActions();
    }

    public static C08813s A01(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C08813s(accessibilityNodeInfo);
    }

    private final CharSequence A02() {
        return this.A01.getClassName();
    }

    private final CharSequence A03() {
        return this.A01.getContentDescription();
    }

    private final CharSequence A04() {
        return this.A01.getPackageName();
    }

    private final CharSequence A05() {
        return this.A01.getText();
    }

    private final String A06() {
        return A04.A02(this.A01);
    }

    public static String A07(int i9) {
        switch (i9) {
            case 1:
                return A08(367, 12, 50);
            case 2:
                return A08(294, 18, 26);
            case 4:
                return A08(577, 13, 24);
            case 8:
                return A08(312, 22, 9);
            case 16:
                return A08(334, 12, 35);
            case 32:
                String[] strArr = A03;
                if (strArr[2].charAt(30) == strArr[6].charAt(30)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[0] = "Wsn1vJkw9zMZ1dCIcpdhA48NRIlsHibC";
                strArr2[3] = "yyZsxnBpb3hGEtLyBJQzoNk7OwP5So5E";
                return A08(379, 17, 5);
            case 64:
                return A08(236, 26, 27);
            case 128:
                return A08(262, 32, 87);
            case NotificationCompat.FLAG_LOCAL_ONLY /* 256 */:
                return A08(396, 35, 96);
            case 512:
                return A08(467, 39, 47);
            case 1024:
                return A08(431, 24, 116);
            case 2048:
                return A08(506, 28, 23);
            case 4096:
                return A08(556, 21, 62);
            case FragmentTransaction.TRANSIT_EXIT_MASK /* 8192 */:
                return A08(534, 22, 52);
            case 16384:
                return A08(346, 11, 127);
            case 32768:
                return A08(455, 12, 24);
            case 65536:
                return A08(357, 10, 81);
            case 131072:
                return A08(590, 20, 14);
            default:
                return A08(610, 14, 34);
        }
    }

    private final void A0A(Rect rect) {
        this.A01.getBoundsInParent(rect);
    }

    private final void A0B(Rect rect) {
        this.A01.getBoundsInScreen(rect);
    }

    private final boolean A0C() {
        return this.A01.isCheckable();
    }

    private final boolean A0D() {
        return this.A01.isChecked();
    }

    private final boolean A0E() {
        return this.A01.isClickable();
    }

    private final boolean A0F() {
        return this.A01.isEnabled();
    }

    private final boolean A0G() {
        return this.A01.isFocusable();
    }

    private final boolean A0H() {
        return this.A01.isFocused();
    }

    private final boolean A0I() {
        return this.A01.isLongClickable();
    }

    private final boolean A0J() {
        return this.A01.isPassword();
    }

    private final boolean A0K() {
        return this.A01.isScrollable();
    }

    private final boolean A0L() {
        return this.A01.isSelected();
    }

    public final AccessibilityNodeInfo A0M() {
        return this.A01;
    }

    public final void A0N(int i9) {
        this.A01.addAction(i9);
    }

    public final void A0O(CharSequence charSequence) {
        this.A01.setClassName(charSequence);
    }

    public final void A0P(Object obj) {
        A04.A03(this.A01, ((C08783p) obj).A00);
    }

    public final void A0Q(Object obj) {
        A04.A04(this.A01, ((C08793q) obj).A00);
    }

    public final void A0R(boolean z8) {
        this.A01.setScrollable(z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C08813s c08813s = (C08813s) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.A01;
        if (accessibilityNodeInfo == null) {
            if (c08813s.A01 != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c08813s.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.A01;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        A0A(rect);
        StringBuilder builder = new StringBuilder().append(A08(5, 18, 117));
        sb.append(builder.append(rect).toString());
        A0B(rect);
        StringBuilder builder2 = new StringBuilder().append(A08(23, 18, 107));
        sb.append(builder2.append(rect).toString());
        sb.append(A08(165, 15, 100)).append(A04());
        sb.append(A08(65, 13, 123)).append(A02());
        sb.append(A08(218, 8, 16)).append(A05());
        sb.append(A08(91, 22, 24)).append(A03());
        sb.append(A08(226, 10, 63)).append(A06());
        sb.append(A08(41, 13, 116)).append(A0C());
        sb.append(A08(54, 11, 120)).append(A0D());
        sb.append(A08(124, 13, 0)).append(A0G());
        sb.append(A08(137, 11, 116)).append(A0H());
        sb.append(A08(206, 12, 93)).append(A0L());
        sb.append(A08(78, 13, 114)).append(A0E());
        sb.append(A08(148, 17, 124)).append(A0I());
        sb.append(A08(113, 11, 113)).append(A0F());
        sb.append(A08(180, 12, 71)).append(A0J());
        StringBuilder builder3 = new StringBuilder().append(A08(PsExtractor.AUDIO_STREAM, 14, 86)).append(A0K());
        sb.append(builder3.toString());
        sb.append(A08(2, 3, 26));
        int action = A00();
        while (action != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(action);
            action &= numberOfTrailingZeros ^ (-1);
            sb.append(A07(numberOfTrailingZeros));
            if (action != 0) {
                sb.append(A08(0, 2, 60));
            }
        }
        sb.append(A08(624, 1, 113));
        return sb.toString();
    }
}
