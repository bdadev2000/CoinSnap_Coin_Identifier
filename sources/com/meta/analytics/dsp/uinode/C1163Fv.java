package com.meta.analytics.dsp.uinode;

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
public final class C1163Fv {
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

    public static String A03(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0M, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 93);
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
        float f9;
        float f10;
        if (A0H()) {
            if (A0N[3].charAt(10) != 'W') {
                throw new RuntimeException();
            }
            A0N[6] = "XXMrNDw86HMhGPknailYt8C4YmEezPlD";
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i9 = 0; i9 < this.A0L.size(); i9++) {
            spannableStringBuilder.append((CharSequence) this.A0L.get(i9));
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
            f9 = this.A05 / 99.0f;
            f10 = this.A0D / 99.0f;
        } else {
            f9 = this.A05 / 209.0f;
            f10 = this.A0D / 74.0f;
        }
        float f11 = (f9 * 0.9f) + 0.05f;
        float f12 = (0.9f * f10) + 0.05f;
        int i10 = this.A00;
        int i11 = i10 % 3 == 0 ? 0 : i10 % 3 == 1 ? 1 : 2;
        int i12 = i10 / 3 == 0 ? 0 : i10 / 3 == 1 ? 1 : 2;
        int i13 = this.A0E;
        return new WJ(spannableStringBuilder, alignment, f12, 0, i11, f11, i12, Float.MIN_VALUE, i13 != A0O, i13, this.A09);
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

    public C1163Fv() {
        A08();
    }

    public static int A00(int i9, int i10, int i11) {
        return A01(i9, i10, i11, 0);
    }

    public static int A01(int i9, int i10, int i11, int i12) {
        int i13;
        AbstractC1192Ha.A00(i9, 0, 4);
        AbstractC1192Ha.A00(i10, 0, 4);
        AbstractC1192Ha.A00(i11, 0, 4);
        AbstractC1192Ha.A00(i12, 0, 4);
        switch (i12) {
            case 0:
            case 1:
                i13 = 255;
                break;
            case 2:
                i13 = 127;
                break;
            case 3:
                i13 = 0;
                break;
            default:
                i13 = 255;
                break;
        }
        int alpha = i9 > 1 ? 255 : 0;
        return Color.argb(i13, alpha, i10 > 1 ? 255 : 0, i11 > 1 ? 255 : 0);
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
            int i9 = this.A04;
            int length2 = A0N[0].length();
            if (length2 != 31) {
                throw new RuntimeException();
            }
            A0N[4] = "UcnYu1PwHAGC3vbuX83YmC5zO9IPxpwr";
            if (i9 != -1) {
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
        int i9 = A0O;
        this.A0E = i9;
        this.A03 = A0P;
        this.A01 = i9;
    }

    public final void A09(char c9) {
        if (c9 == '\n') {
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
                    int i9 = this.A0B;
                    if (A0N[3].charAt(10) != 'W') {
                        throw new RuntimeException();
                    }
                    A0N[0] = "z94yFfaTy8Odmt8n2fLZMjDbCxUThPz";
                    if (size >= i9) {
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
            this.A0K.append(c9);
        }
    }

    public final void A0A(int i9, int i10) {
        if (this.A0A != i9) {
            A09('\n');
        }
        this.A0A = i9;
    }

    public final void A0B(int i9, int i10, int i11) {
        if (this.A04 != -1 && this.A03 != i9) {
            this.A0K.setSpan(new ForegroundColorSpan(this.A03), this.A04, this.A0K.length(), 33);
        }
        if (i9 != A0P) {
            this.A04 = this.A0K.length();
            this.A03 = i9;
        }
        if (this.A02 != -1 && this.A01 != i10) {
            this.A0K.setSpan(new BackgroundColorSpan(this.A01), this.A02, this.A0K.length(), 33);
        }
        if (i10 != A0O) {
            this.A02 = this.A0K.length();
            this.A01 = i10;
        }
    }

    public final void A0C(int i9, int i10, int i11, boolean z8, boolean z9, int i12, int i13) {
        if (this.A06 != -1) {
            if (!z8) {
                this.A0K.setSpan(new StyleSpan(2), this.A06, this.A0K.length(), 33);
                this.A06 = -1;
            }
        } else if (z8) {
            this.A06 = this.A0K.length();
        }
        int i14 = this.A0C;
        if (A0N[3].charAt(10) != 'W') {
            throw new RuntimeException();
        }
        A0N[3] = "GaQXCBjIxpWixMOvnA1JS7CVs7IBjZSt";
        if (i14 != -1) {
            if (!z9) {
                this.A0K.setSpan(new UnderlineSpan(), this.A0C, this.A0K.length(), 33);
                this.A0C = -1;
                return;
            }
            return;
        }
        if (!z9) {
            return;
        }
        this.A0C = this.A0K.length();
    }

    public final void A0D(int i9, int i10, boolean z8, int i11, int i12, int i13, int i14) {
        this.A0E = i9;
        this.A07 = i14;
    }

    public final void A0E(boolean z8) {
        this.A0J = z8;
    }

    public final void A0F(boolean z8, boolean z9, boolean z10, int i9, boolean z11, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.A0G = true;
        this.A0J = z8;
        this.A0I = z9;
        this.A09 = i9;
        this.A0H = z11;
        this.A0D = i10;
        this.A05 = i11;
        this.A00 = i14;
        if (this.A0B != i12 + 1) {
            int i17 = i12 + 1;
            if (A0N[1].charAt(10) == 's') {
                throw new RuntimeException();
            }
            A0N[5] = "GL1AptVbsbHBPnQiC9PDsuTMTdKpKMZ4";
            this.A0B = i17;
            while (true) {
                if ((!z9 || this.A0L.size() < this.A0B) && this.A0L.size() < 15) {
                    break;
                } else {
                    this.A0L.remove(0);
                }
            }
        }
        if (i15 != 0 && this.A0F != i15) {
            this.A0F = i15;
            int i18 = i15 - 1;
            A0D(A0U[i18], A0Q, A0Y[i18], 0, A0W[i18], A0X[i18], A0V[i18]);
        }
        if (i16 != 0 && this.A08 != i16) {
            this.A08 = i16;
            int i19 = i16 - 1;
            A0C(0, 1, 1, false, false, A0S[i19], A0T[i19]);
            A0B(A0P, A0R[i19], A0O);
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
