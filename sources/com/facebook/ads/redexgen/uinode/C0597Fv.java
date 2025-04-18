package com.facebook.ads.redexgen.uinode;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Fv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0597Fv {
    public static byte[] A0M;
    public static String[] A0N = {"bEAjJCvVtkePzUcw9rvynCWhWZ7YtTC", "sFv5If9m5Sphdt63zNjPhUbGsirLMRkb", "dm26J1OSzusJji0dpgrnr09k5LC689lq", "Nx5OZNPL7zWyatFSZAWV1dERcLRuFkfb", "8nXEVS4hfg5ng3YQnnC7NT8u0hAmIJYk", "i1gAYPXKkwHe1sE5BOr5igG8IxAvgiYs", "Y1prefJax7dGS9GUqUH50jWlMMgJtsPr", "K9Y4TfEKpnP3QqzXtNTgN9rOyJLVMPLw"};
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int[] A0R;
    public static final int[] A0S;
    public static final int[] A0T;
    public static final int[] A0U;
    public static final int[] A0V;
    public static final int[] A0W;
    public static final int[] A0X;
    public static final boolean[] A0Y;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final List<SpannableString> A0L = new ArrayList();
    public final SpannableStringBuilder A0K = new SpannableStringBuilder();

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0M, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0M = new byte[]{81, 106, 97, 124, 116, 97, 103, 112, 97, 96, 36, 110, 113, 119, 112, 109, 98, 109, 103, 101, 112, 109, 107, 106, 36, 114, 101, 104, 113, 97, 62, 36};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final WJ A05() {
        Layout.Alignment alignment;
        float f10;
        float f11;
        if (A0H()) {
            if (A0N[3].charAt(10) != 'W') {
                throw new RuntimeException();
            }
            A0N[6] = "XXMrNDw86HMhGPknailYt8C4YmEezPlD";
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i10 = 0; i10 < this.A0L.size(); i10++) {
            spannableStringBuilder.append((CharSequence) this.A0L.get(i10));
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append((CharSequence) A02());
        switch (this.A07) {
            case 0:
            case 3:
                alignment = Layout.Alignment.ALIGN_NORMAL;
                break;
            case 1:
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                if (A0N[3].charAt(10) != 'W') {
                    A0N[1] = "GUzkX8UKOS2SBWNLmpbuPvYZfRUrk3bC";
                    break;
                } else {
                    A0N[1] = "qTQORRfF62rpJvlAVACWybIcEIDyrroZ";
                    break;
                }
            case 2:
                alignment = Layout.Alignment.ALIGN_CENTER;
                break;
            default:
                throw new IllegalArgumentException(A03(0, 32, 89) + this.A07);
        }
        if (this.A0H) {
            f10 = this.A05 / 99.0f;
            f11 = this.A0D / 99.0f;
        } else {
            f10 = this.A05 / 209.0f;
            f11 = this.A0D / 74.0f;
        }
        float f12 = (f10 * 0.9f) + 0.05f;
        float f13 = (0.9f * f11) + 0.05f;
        int i11 = this.A00;
        int i12 = i11 % 3 == 0 ? 0 : i11 % 3 == 1 ? 1 : 2;
        int i13 = i11 / 3 == 0 ? 0 : i11 / 3 == 1 ? 1 : 2;
        int i14 = this.A0E;
        return new WJ(spannableStringBuilder, alignment, f13, 0, i12, f12, i13, Float.MIN_VALUE, i14 != A0O, i14, this.A09);
    }

    static {
        A04();
        A0P = A01(2, 2, 2, 0);
        int A01 = A01(0, 0, 0, 0);
        A0O = A01;
        int A012 = A01(0, 0, 0, 3);
        A0Q = A012;
        A0V = new int[]{0, 0, 0, 0, 0, 2, 0};
        A0W = new int[]{0, 0, 0, 0, 0, 0, 2};
        A0X = new int[]{3, 3, 3, 3, 3, 3, 1};
        A0Y = new boolean[]{false, false, false, true, true, true, false};
        A0U = new int[]{A01, A012, A01, A01, A012, A01, A01};
        A0T = new int[]{0, 1, 2, 3, 4, 3, 4};
        A0S = new int[]{0, 0, 0, 0, 0, 3, 3};
        A0R = new int[]{A01, A01, A01, A01, A01, A012, A012};
    }

    public C0597Fv() {
        A08();
    }

    public static int A00(int i10, int i11, int i12) {
        return A01(i10, i11, i12, 0);
    }

    public static int A01(int i10, int i11, int i12, int i13) {
        int i14;
        AbstractC0626Ha.A00(i10, 0, 4);
        AbstractC0626Ha.A00(i11, 0, 4);
        AbstractC0626Ha.A00(i12, 0, 4);
        AbstractC0626Ha.A00(i13, 0, 4);
        switch (i13) {
            case 0:
            case 1:
                i14 = 255;
                break;
            case 2:
                i14 = 127;
                break;
            case 3:
                i14 = 0;
                break;
            default:
                i14 = 255;
                break;
        }
        int alpha = i10 > 1 ? 255 : 0;
        return Color.argb(i14, alpha, i11 > 1 ? 255 : 0, i12 > 1 ? 255 : 0);
    }

    private final SpannableString A02() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A0K);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.A06 != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.A06, length, 33);
            }
            if (this.A0C != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.A0C, length, 33);
            }
            int i10 = this.A04;
            int length2 = A0N[0].length();
            if (length2 != 31) {
                throw new RuntimeException();
            }
            A0N[4] = "UcnYu1PwHAGC3vbuX83YmC5zO9IPxpwr";
            if (i10 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.A03), this.A04, length, 33);
            }
            if (this.A02 != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.A01), this.A02, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void A06() {
        int length = this.A0K.length();
        if (length > 0) {
            int length2 = length - 1;
            this.A0K.delete(length2, length);
        }
    }

    public final void A07() {
        this.A0L.clear();
        this.A0K.clear();
        this.A06 = -1;
        this.A0C = -1;
        this.A04 = -1;
        this.A02 = -1;
        this.A0A = 0;
    }

    public final void A08() {
        A07();
        this.A0G = false;
        this.A0J = false;
        this.A09 = 4;
        this.A0H = false;
        this.A0D = 0;
        this.A05 = 0;
        this.A00 = 0;
        this.A0B = 15;
        this.A0I = true;
        this.A07 = 0;
        this.A0F = 0;
        this.A08 = 0;
        int i10 = A0O;
        this.A0E = i10;
        this.A03 = A0P;
        this.A01 = i10;
    }

    public final void A09(char c10) {
        if (c10 == '\n') {
            this.A0L.add(A02());
            this.A0K.clear();
            if (this.A06 != -1) {
                this.A06 = 0;
            }
            if (this.A0C != -1) {
                this.A0C = 0;
            }
            if (this.A04 != -1) {
                this.A04 = 0;
            }
            if (this.A02 != -1) {
                this.A02 = 0;
            }
            while (true) {
                if (this.A0I) {
                    int size = this.A0L.size();
                    int i10 = this.A0B;
                    if (A0N[3].charAt(10) != 'W') {
                        throw new RuntimeException();
                    }
                    A0N[0] = "z94yFfaTy8Odmt8n2fLZMjDbCxUThPz";
                    if (size >= i10) {
                        continue;
                        this.A0L.remove(0);
                    }
                }
                if (this.A0L.size() >= 15) {
                    this.A0L.remove(0);
                } else {
                    return;
                }
            }
        } else {
            this.A0K.append(c10);
        }
    }

    public final void A0A(int i10, int i11) {
        if (this.A0A != i10) {
            A09('\n');
        }
        this.A0A = i10;
    }

    public final void A0B(int i10, int i11, int i12) {
        if (this.A04 != -1 && this.A03 != i10) {
            this.A0K.setSpan(new ForegroundColorSpan(this.A03), this.A04, this.A0K.length(), 33);
        }
        if (i10 != A0P) {
            this.A04 = this.A0K.length();
            this.A03 = i10;
        }
        if (this.A02 != -1 && this.A01 != i11) {
            this.A0K.setSpan(new BackgroundColorSpan(this.A01), this.A02, this.A0K.length(), 33);
        }
        if (i11 != A0O) {
            this.A02 = this.A0K.length();
            this.A01 = i11;
        }
    }

    public final void A0C(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
        if (this.A06 != -1) {
            if (!z10) {
                this.A0K.setSpan(new StyleSpan(2), this.A06, this.A0K.length(), 33);
                this.A06 = -1;
            }
        } else if (z10) {
            this.A06 = this.A0K.length();
        }
        int i15 = this.A0C;
        if (A0N[3].charAt(10) != 'W') {
            throw new RuntimeException();
        }
        A0N[3] = "GaQXCBjIxpWixMOvnA1JS7CVs7IBjZSt";
        if (i15 != -1) {
            if (!z11) {
                this.A0K.setSpan(new UnderlineSpan(), this.A0C, this.A0K.length(), 33);
                this.A0C = -1;
                return;
            }
            return;
        }
        if (!z11) {
            return;
        }
        this.A0C = this.A0K.length();
    }

    public final void A0D(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
        this.A0E = i10;
        this.A07 = i15;
    }

    public final void A0E(boolean z10) {
        this.A0J = z10;
    }

    public final void A0F(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.A0G = true;
        this.A0J = z10;
        this.A0I = z11;
        this.A09 = i10;
        this.A0H = z13;
        this.A0D = i11;
        this.A05 = i12;
        this.A00 = i15;
        if (this.A0B != i13 + 1) {
            int i18 = i13 + 1;
            if (A0N[1].charAt(10) == 's') {
                throw new RuntimeException();
            }
            A0N[5] = "GL1AptVbsbHBPnQiC9PDsuTMTdKpKMZ4";
            this.A0B = i18;
            while (true) {
                if ((!z11 || this.A0L.size() < this.A0B) && this.A0L.size() < 15) {
                    break;
                } else {
                    this.A0L.remove(0);
                }
            }
        }
        if (i16 != 0 && this.A0F != i16) {
            this.A0F = i16;
            int i19 = i16 - 1;
            A0D(A0U[i19], A0Q, A0Y[i19], 0, A0W[i19], A0X[i19], A0V[i19]);
        }
        if (i17 != 0 && this.A08 != i17) {
            this.A08 = i17;
            int i20 = i17 - 1;
            A0C(0, 1, 1, false, false, A0S[i20], A0T[i20]);
            A0B(A0P, A0R[i20], A0O);
        }
    }

    public final boolean A0G() {
        return this.A0G;
    }

    public final boolean A0H() {
        return !A0G() || (this.A0L.isEmpty() && this.A0K.length() == 0);
    }

    public final boolean A0I() {
        return this.A0J;
    }
}
