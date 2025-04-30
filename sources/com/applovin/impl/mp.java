package com.applovin.impl;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.impl.z4;
import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class mp extends bk {

    /* renamed from: o, reason: collision with root package name */
    private final yg f9222o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f9223p;

    /* renamed from: q, reason: collision with root package name */
    private final int f9224q;

    /* renamed from: r, reason: collision with root package name */
    private final int f9225r;

    /* renamed from: s, reason: collision with root package name */
    private final String f9226s;

    /* renamed from: t, reason: collision with root package name */
    private final float f9227t;

    /* renamed from: u, reason: collision with root package name */
    private final int f9228u;

    public mp(List list) {
        super("Tx3gDecoder");
        this.f9222o = new yg();
        int size = list.size();
        String str = com.mbridge.msdk.playercommon.exoplayer2.C.SANS_SERIF_NAME;
        if (size == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f9224q = bArr[24];
            this.f9225r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f9226s = "Serif".equals(yp.a(bArr, 43, bArr.length - 43)) ? com.mbridge.msdk.playercommon.exoplayer2.C.SERIF_NAME : str;
            int i9 = bArr[25] * Ascii.DC4;
            this.f9228u = i9;
            boolean z8 = (bArr[0] & 32) != 0;
            this.f9223p = z8;
            if (z8) {
                this.f9227t = yp.a(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i9, 0.0f, 0.95f);
                return;
            } else {
                this.f9227t = 0.85f;
                return;
            }
        }
        this.f9224q = 0;
        this.f9225r = -1;
        this.f9226s = com.mbridge.msdk.playercommon.exoplayer2.C.SANS_SERIF_NAME;
        this.f9223p = false;
        this.f9227t = 0.85f;
        this.f9228u = -1;
    }

    private void a(yg ygVar, SpannableStringBuilder spannableStringBuilder) {
        a(ygVar.a() >= 12);
        int C8 = ygVar.C();
        int C9 = ygVar.C();
        ygVar.g(2);
        int w2 = ygVar.w();
        ygVar.g(1);
        int j7 = ygVar.j();
        if (C9 > spannableStringBuilder.length()) {
            StringBuilder p2 = Q7.n0.p(C9, "Truncating styl end (", ") to cueText.length() (");
            p2.append(spannableStringBuilder.length());
            p2.append(").");
            kc.d("Tx3gDecoder", p2.toString());
            C9 = spannableStringBuilder.length();
        }
        if (C8 >= C9) {
            kc.d("Tx3gDecoder", AbstractC2914a.c(C8, C9, "Ignoring styl with start (", ") >= end (", ")."));
            return;
        }
        int i9 = C9;
        b(spannableStringBuilder, w2, this.f9224q, C8, i9, 0);
        a(spannableStringBuilder, j7, this.f9225r, C8, i9, 0);
    }

    private static void b(SpannableStringBuilder spannableStringBuilder, int i9, int i10, int i11, int i12, int i13) {
        boolean z8;
        boolean z9;
        if (i9 != i10) {
            int i14 = i13 | 33;
            boolean z10 = true;
            if ((i9 & 1) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((i9 & 2) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z8) {
                if (z9) {
                    L.o(3, spannableStringBuilder, i11, i12, i14);
                } else {
                    L.o(1, spannableStringBuilder, i11, i12, i14);
                }
            } else if (z9) {
                L.o(2, spannableStringBuilder, i11, i12, i14);
            }
            if ((i9 & 4) == 0) {
                z10 = false;
            }
            if (z10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, i14);
            }
            if (!z10 && !z8 && !z9) {
                L.o(0, spannableStringBuilder, i11, i12, i14);
            }
        }
    }

    private static void a(boolean z8) {
        if (!z8) {
            throw new ml("Unexpected subtitle format.");
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, int i9, int i10, int i11, int i12, int i13) {
        if (i9 != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i9 >>> 8) | ((i9 & 255) << 24)), i11, i12, i13 | 33);
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, String str, int i9, int i10) {
        if (str != com.mbridge.msdk.playercommon.exoplayer2.C.SANS_SERIF_NAME) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i9, i10, 16711713);
        }
    }

    @Override // com.applovin.impl.bk
    public kl a(byte[] bArr, int i9, boolean z8) {
        this.f9222o.a(bArr, i9);
        String a6 = a(this.f9222o);
        if (a6.isEmpty()) {
            return np.b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a6);
        b(spannableStringBuilder, this.f9224q, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f9225r, -1, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f9226s, 0, spannableStringBuilder.length());
        float f9 = this.f9227t;
        while (this.f9222o.a() >= 8) {
            int d2 = this.f9222o.d();
            int j7 = this.f9222o.j();
            int j9 = this.f9222o.j();
            if (j9 == 1937013100) {
                a(this.f9222o.a() >= 2);
                int C8 = this.f9222o.C();
                for (int i10 = 0; i10 < C8; i10++) {
                    a(this.f9222o, spannableStringBuilder);
                }
            } else if (j9 == 1952608120 && this.f9223p) {
                a(this.f9222o.a() >= 2);
                f9 = yp.a(this.f9222o.C() / this.f9228u, 0.0f, 0.95f);
            }
            this.f9222o.f(d2 + j7);
        }
        return new np(new z4.b().a(spannableStringBuilder).a(f9, 0).a(0).a());
    }

    private static String a(yg ygVar) {
        char f9;
        a(ygVar.a() >= 2);
        int C8 = ygVar.C();
        if (C8 == 0) {
            return "";
        }
        if (ygVar.a() >= 2 && ((f9 = ygVar.f()) == 65279 || f9 == 65534)) {
            return ygVar.a(C8, Charsets.UTF_16);
        }
        return ygVar.a(C8, Charsets.UTF_8);
    }
}
