package com.applovin.impl;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.impl.z4;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class mp extends bk {

    /* renamed from: o, reason: collision with root package name */
    private final yg f6287o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f6288p;

    /* renamed from: q, reason: collision with root package name */
    private final int f6289q;

    /* renamed from: r, reason: collision with root package name */
    private final int f6290r;

    /* renamed from: s, reason: collision with root package name */
    private final String f6291s;

    /* renamed from: t, reason: collision with root package name */
    private final float f6292t;
    private final int u;

    public mp(List list) {
        super("Tx3gDecoder");
        this.f6287o = new yg();
        int size = list.size();
        String str = C.SANS_SERIF_NAME;
        if (size == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f6289q = bArr[24];
            this.f6290r = ((bArr[26] & UByte.MAX_VALUE) << 24) | ((bArr[27] & UByte.MAX_VALUE) << 16) | ((bArr[28] & UByte.MAX_VALUE) << 8) | (bArr[29] & UByte.MAX_VALUE);
            this.f6291s = "Serif".equals(yp.a(bArr, 43, bArr.length - 43)) ? C.SERIF_NAME : str;
            int i10 = bArr[25] * Ascii.DC4;
            this.u = i10;
            boolean z10 = (bArr[0] & 32) != 0;
            this.f6288p = z10;
            if (z10) {
                this.f6292t = yp.a(((bArr[11] & UByte.MAX_VALUE) | ((bArr[10] & UByte.MAX_VALUE) << 8)) / i10, 0.0f, 0.95f);
                return;
            } else {
                this.f6292t = 0.85f;
                return;
            }
        }
        this.f6289q = 0;
        this.f6290r = -1;
        this.f6291s = C.SANS_SERIF_NAME;
        this.f6288p = false;
        this.f6292t = 0.85f;
        this.u = -1;
    }

    private void a(yg ygVar, SpannableStringBuilder spannableStringBuilder) {
        a(ygVar.a() >= 12);
        int C = ygVar.C();
        int C2 = ygVar.C();
        ygVar.g(2);
        int w10 = ygVar.w();
        ygVar.g(1);
        int j3 = ygVar.j();
        if (C2 > spannableStringBuilder.length()) {
            StringBuilder m10 = a4.j.m("Truncating styl end (", C2, ") to cueText.length() (");
            m10.append(spannableStringBuilder.length());
            m10.append(").");
            kc.d("Tx3gDecoder", m10.toString());
            C2 = spannableStringBuilder.length();
        }
        if (C >= C2) {
            kc.d("Tx3gDecoder", kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.j("Ignoring styl with start (", C, ") >= end (", C2, ")."));
            return;
        }
        int i10 = C2;
        b(spannableStringBuilder, w10, this.f6289q, C, i10, 0);
        a(spannableStringBuilder, j3, this.f6290r, C, i10, 0);
    }

    private static void b(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        boolean z10;
        boolean z11;
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z12 = true;
            if ((i10 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                if (z11) {
                    com.applovin.impl.mediation.ads.e.k(3, spannableStringBuilder, i12, i13, i15);
                } else {
                    com.applovin.impl.mediation.ads.e.k(1, spannableStringBuilder, i12, i13, i15);
                }
            } else if (z11) {
                com.applovin.impl.mediation.ads.e.k(2, spannableStringBuilder, i12, i13, i15);
            }
            if ((i10 & 4) == 0) {
                z12 = false;
            }
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (!z12 && !z10 && !z11) {
                com.applovin.impl.mediation.ads.e.k(0, spannableStringBuilder, i12, i13, i15);
            }
        }
    }

    private static void a(boolean z10) {
        if (!z10) {
            throw new ml("Unexpected subtitle format.");
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != C.SANS_SERIF_NAME) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    @Override // com.applovin.impl.bk
    public kl a(byte[] bArr, int i10, boolean z10) {
        this.f6287o.a(bArr, i10);
        String a = a(this.f6287o);
        if (a.isEmpty()) {
            return np.f6427b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a);
        b(spannableStringBuilder, this.f6289q, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f6290r, -1, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f6291s, 0, spannableStringBuilder.length());
        float f10 = this.f6292t;
        while (this.f6287o.a() >= 8) {
            int d10 = this.f6287o.d();
            int j3 = this.f6287o.j();
            int j10 = this.f6287o.j();
            if (j10 == 1937013100) {
                a(this.f6287o.a() >= 2);
                int C = this.f6287o.C();
                for (int i11 = 0; i11 < C; i11++) {
                    a(this.f6287o, spannableStringBuilder);
                }
            } else if (j10 == 1952608120 && this.f6288p) {
                a(this.f6287o.a() >= 2);
                f10 = yp.a(this.f6287o.C() / this.u, 0.0f, 0.95f);
            }
            this.f6287o.f(d10 + j3);
        }
        return new np(new z4.b().a(spannableStringBuilder).a(f10, 0).a(0).a());
    }

    private static String a(yg ygVar) {
        char f10;
        a(ygVar.a() >= 2);
        int C = ygVar.C();
        if (C == 0) {
            return "";
        }
        if (ygVar.a() >= 2 && ((f10 = ygVar.f()) == 65279 || f10 == 65534)) {
            return ygVar.a(C, Charsets.UTF_16);
        }
        return ygVar.a(C, Charsets.UTF_8);
    }
}
