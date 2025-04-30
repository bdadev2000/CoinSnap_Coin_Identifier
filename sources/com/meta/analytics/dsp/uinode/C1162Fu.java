package com.meta.analytics.dsp.uinode;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Fu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1162Fu {
    public static String[] A08 = {"XC7eQ7mnDigGIQL7dx0KfLpc2FT", "IUrjEkKy3b2jJtDJZ33sGt", "", "4VXLd4NK2UMSrr9tKiehY90A", "S2gwvpBwwRoio7AP3LwECfAaRkk6O4ZY", "9TUF7Ks7YtQxur", "s5iWH5PZ", "Ea283cgdBM89En3yGupwQHUZzzjf5u4Q"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final List<C1161Ft> A06 = new ArrayList();
    public final List<SpannableString> A07 = new ArrayList();
    public final StringBuilder A05 = new StringBuilder();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final C1155Fn A05() {
        float f9;
        int i9;
        int i10;
        int i11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i12 = 0; i12 < this.A07.size(); i12++) {
            spannableStringBuilder.append((CharSequence) this.A07.get(i12));
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append((CharSequence) A00());
        if (A08[2].length() != 4) {
            A08[4] = "XUGi3jQBIuRQftqARNMB36bn2TyuzRos";
            if (spannableStringBuilder.length() == 0) {
                if (A08[1].length() != 22) {
                    A08[1] = "sMaadG1MTySiyP3TGzo1T4";
                    return null;
                }
                A08[1] = "nS4SC9sWxiUu8g9Arai4ZN";
                return null;
            }
            int i13 = this.A02;
            int i14 = this.A04;
            if (A08[7].charAt(3) != 'N') {
                A08[4] = "yDKFp8g0FkQkvFDtr9inWFZi093Wo6Xo";
                int i15 = i13 + i14;
                int length = (32 - i15) - spannableStringBuilder.length();
                int i16 = i15 - length;
                if (this.A00 == 2 && (Math.abs(i16) < 3 || length < 0)) {
                    f9 = 0.5f;
                    i9 = 1;
                } else if (this.A00 != 2 || i16 <= 0) {
                    f9 = (0.8f * (i15 / 32.0f)) + 0.1f;
                    i9 = 0;
                } else {
                    int i17 = 32 - length;
                    if (A08[4].charAt(13) == 'W') {
                        throw new RuntimeException();
                    }
                    A08[2] = "dWj1xsuyJgYxC";
                    f9 = (0.8f * (i17 / 32.0f)) + 0.1f;
                    i9 = 2;
                }
                if (this.A00 == 1 || this.A03 > 7) {
                    i10 = 2;
                    i11 = (this.A03 - 15) - 2;
                } else {
                    i10 = 0;
                    i11 = this.A03;
                }
                return new C1155Fn(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, i11, 1, i10, f9, i9, Float.MIN_VALUE);
            }
        }
        throw new RuntimeException();
    }

    public C1162Fu(int i9, int i10) {
        A09(i9);
        A0A(i10);
    }

    private final SpannableString A00() {
        int i9;
        int[] iArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A05);
        int length = spannableStringBuilder.length();
        int i10 = -1;
        int nextColor = -1;
        int i11 = 0;
        int color = -1;
        boolean z8 = false;
        int colorStartPosition = -1;
        for (int italicStartPosition = 0; italicStartPosition < this.A06.size(); italicStartPosition++) {
            C1161Ft c1161Ft = this.A06.get(italicStartPosition);
            boolean z9 = c1161Ft.A02;
            int i12 = c1161Ft.A01;
            if (i12 != 8) {
                z8 = i12 == 7;
                if (i12 != 7) {
                    iArr = C5A.A0K;
                    colorStartPosition = iArr[i12];
                }
            }
            int length2 = c1161Ft.A00;
            if (A08[1].length() != 22) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[6] = "A7DJ6NHY";
            strArr[5] = "4roHVg72rzpV8d";
            if (italicStartPosition + 1 < this.A06.size()) {
                i9 = this.A06.get(italicStartPosition + 1).A00;
            } else {
                i9 = length;
            }
            if (length2 != i9) {
                if (i10 != -1 && !z9) {
                    A02(spannableStringBuilder, i10, length2);
                    i10 = -1;
                } else if (i10 == -1 && z9) {
                    i10 = length2;
                }
                if (nextColor != -1 && !z8) {
                    A01(spannableStringBuilder, nextColor, length2);
                    nextColor = -1;
                } else if (nextColor == -1 && z8) {
                    nextColor = length2;
                }
                if (colorStartPosition != color) {
                    A03(spannableStringBuilder, i11, length2, color);
                    color = colorStartPosition;
                    i11 = length2;
                }
            }
        }
        if (i10 != -1 && i10 != length) {
            A02(spannableStringBuilder, i10, length);
        }
        if (nextColor != -1 && nextColor != length) {
            A01(spannableStringBuilder, nextColor, length);
        }
        if (i11 != length) {
            A03(spannableStringBuilder, i11, length, color);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public static void A01(SpannableStringBuilder spannableStringBuilder, int i9, int i10) {
        spannableStringBuilder.setSpan(new StyleSpan(2), i9, i10, 33);
    }

    public static void A02(SpannableStringBuilder spannableStringBuilder, int i9, int i10) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i9, i10, 33);
    }

    public static void A03(SpannableStringBuilder spannableStringBuilder, int i9, int i10, int i11) {
        if (i11 == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), i9, i10, 33);
    }

    public final int A04() {
        return this.A03;
    }

    public final void A06() {
        int length = this.A05.length();
        if (length > 0) {
            int length2 = length - 1;
            this.A05.delete(length2, length);
            int length3 = this.A06.size();
            for (int i9 = length3 - 1; i9 >= 0; i9--) {
                C1161Ft c1161Ft = this.A06.get(i9);
                int length4 = c1161Ft.A00;
                if (length4 == length) {
                    int length5 = c1161Ft.A00;
                    c1161Ft.A00 = length5 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void A07() {
        this.A07.add(A00());
        this.A05.setLength(0);
        this.A06.clear();
        int min = Math.min(this.A01, this.A03);
        while (true) {
            int size = this.A07.size();
            String[] strArr = A08;
            String str = strArr[6];
            String str2 = strArr[5];
            int length = str.length();
            int numRows = str2.length();
            if (length == numRows) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[6] = "4Kk3waKD";
            strArr2[5] = "8nOP5N7C4Kf2hN";
            if (size >= min) {
                this.A07.remove(0);
            } else {
                return;
            }
        }
    }

    public final void A08(char c9) {
        this.A05.append(c9);
    }

    public final void A09(int i9) {
        this.A00 = i9;
        this.A06.clear();
        this.A07.clear();
        this.A05.setLength(0);
        this.A03 = 15;
        this.A02 = 0;
        this.A04 = 0;
    }

    public final void A0A(int i9) {
        this.A01 = i9;
    }

    public final void A0B(int i9) {
        this.A02 = i9;
    }

    public final void A0C(int i9) {
        this.A03 = i9;
    }

    public final void A0D(int i9) {
        this.A04 = i9;
    }

    public final void A0E(int i9, boolean z8) {
        this.A06.add(new C1161Ft(i9, z8, this.A05.length()));
    }

    public final boolean A0F() {
        return this.A06.isEmpty() && this.A07.isEmpty() && this.A05.length() == 0;
    }

    public final String toString() {
        return this.A05.toString();
    }
}
