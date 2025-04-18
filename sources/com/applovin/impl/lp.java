package com.applovin.impl;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.impl.b5;
import com.google.common.primitives.UnsignedBytes;
import java.util.List;

/* loaded from: classes.dex */
public final class lp extends ek {

    /* renamed from: o, reason: collision with root package name */
    private final bh f25119o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f25120p;

    /* renamed from: q, reason: collision with root package name */
    private final int f25121q;

    /* renamed from: r, reason: collision with root package name */
    private final int f25122r;

    /* renamed from: s, reason: collision with root package name */
    private final String f25123s;

    /* renamed from: t, reason: collision with root package name */
    private final float f25124t;

    /* renamed from: u, reason: collision with root package name */
    private final int f25125u;

    public lp(List list) {
        super("Tx3gDecoder");
        this.f25119o = new bh();
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f25121q = 0;
            this.f25122r = -1;
            this.f25123s = "sans-serif";
            this.f25120p = false;
            this.f25124t = 0.85f;
            this.f25125u = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f25121q = bArr[24];
        this.f25122r = ((bArr[26] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[27] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[28] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[29] & UnsignedBytes.MAX_VALUE);
        this.f25123s = "Serif".equals(xp.a(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i2 = bArr[25] * 20;
        this.f25125u = i2;
        boolean z2 = (bArr[0] & 32) != 0;
        this.f25120p = z2;
        if (z2) {
            this.f25124t = xp.a(((bArr[11] & UnsignedBytes.MAX_VALUE) | ((bArr[10] & UnsignedBytes.MAX_VALUE) << 8)) / i2, 0.0f, 0.95f);
        } else {
            this.f25124t = 0.85f;
        }
    }

    private void a(bh bhVar, SpannableStringBuilder spannableStringBuilder) {
        a(bhVar.a() >= 12);
        int C = bhVar.C();
        int C2 = bhVar.C();
        bhVar.g(2);
        int w = bhVar.w();
        bhVar.g(1);
        int j2 = bhVar.j();
        if (C2 > spannableStringBuilder.length()) {
            StringBuilder t2 = android.support.v4.media.d.t("Truncating styl end (", C2, ") to cueText.length() (");
            t2.append(spannableStringBuilder.length());
            t2.append(").");
            pc.d("Tx3gDecoder", t2.toString());
            C2 = spannableStringBuilder.length();
        }
        if (C >= C2) {
            pc.d("Tx3gDecoder", android.support.v4.media.d.l("Ignoring styl with start (", C, ") >= end (", C2, ")."));
            return;
        }
        int i2 = C2;
        b(spannableStringBuilder, w, this.f25121q, C, i2, 0);
        a(spannableStringBuilder, j2, this.f25122r, C, i2, 0);
    }

    private static void b(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            int i7 = i6 | 33;
            boolean z2 = (i2 & 1) != 0;
            boolean z3 = (i2 & 2) != 0;
            if (z2) {
                if (z3) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i4, i5, i7);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i4, i5, i7);
                }
            } else if (z3) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, i5, i7);
            }
            boolean z4 = (i2 & 4) != 0;
            if (z4) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, i5, i7);
            }
            if (z4 || z2 || z3) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i4, i5, i7);
        }
    }

    private static void a(boolean z2) {
        if (!z2) {
            throw new pl("Unexpected subtitle format.");
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i2 >>> 8) | ((i2 & 255) << 24)), i4, i5, i6 | 33);
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, String str, int i2, int i3) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i2, i3, 16711713);
        }
    }

    @Override // com.applovin.impl.ek
    public nl a(byte[] bArr, int i2, boolean z2) {
        this.f25119o.a(bArr, i2);
        String a2 = a(this.f25119o);
        if (a2.isEmpty()) {
            return mp.f25601b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a2);
        b(spannableStringBuilder, this.f25121q, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f25122r, -1, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f25123s, 0, spannableStringBuilder.length());
        float f2 = this.f25124t;
        while (this.f25119o.a() >= 8) {
            int d = this.f25119o.d();
            int j2 = this.f25119o.j();
            int j3 = this.f25119o.j();
            if (j3 == 1937013100) {
                a(this.f25119o.a() >= 2);
                int C = this.f25119o.C();
                for (int i3 = 0; i3 < C; i3++) {
                    a(this.f25119o, spannableStringBuilder);
                }
            } else if (j3 == 1952608120 && this.f25120p) {
                a(this.f25119o.a() >= 2);
                f2 = xp.a(this.f25119o.C() / this.f25125u, 0.0f, 0.95f);
            }
            this.f25119o.f(d + j2);
        }
        return new mp(new b5.b().a(spannableStringBuilder).a(f2, 0).a(0).a());
    }

    private static String a(bh bhVar) {
        char f2;
        a(bhVar.a() >= 2);
        int C = bhVar.C();
        if (C == 0) {
            return "";
        }
        if (bhVar.a() >= 2 && ((f2 = bhVar.f()) == 65279 || f2 == 65534)) {
            return bhVar.a(C, Charsets.UTF_16);
        }
        return bhVar.a(C, Charsets.UTF_8);
    }
}
