package i9;

import a4.j;
import a9.g;
import a9.h;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.UByte;
import n9.h0;
import n9.o;
import n9.x;
import ra.f;

/* loaded from: classes3.dex */
public final class a extends g {

    /* renamed from: m, reason: collision with root package name */
    public final x f19498m = new x();

    /* renamed from: n, reason: collision with root package name */
    public final boolean f19499n;

    /* renamed from: o, reason: collision with root package name */
    public final int f19500o;

    /* renamed from: p, reason: collision with root package name */
    public final int f19501p;

    /* renamed from: q, reason: collision with root package name */
    public final String f19502q;

    /* renamed from: r, reason: collision with root package name */
    public final float f19503r;

    /* renamed from: s, reason: collision with root package name */
    public final int f19504s;

    public a(List list) {
        int size = list.size();
        String str = C.SANS_SERIF_NAME;
        if (size == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f19500o = bArr[24];
            this.f19501p = ((bArr[26] & UByte.MAX_VALUE) << 24) | ((bArr[27] & UByte.MAX_VALUE) << 16) | ((bArr[28] & UByte.MAX_VALUE) << 8) | (bArr[29] & UByte.MAX_VALUE);
            this.f19502q = "Serif".equals(new String(bArr, 43, bArr.length - 43, f.f24049c)) ? C.SERIF_NAME : str;
            int i10 = bArr[25] * Ascii.DC4;
            this.f19504s = i10;
            boolean z10 = (bArr[0] & 32) != 0;
            this.f19499n = z10;
            if (z10) {
                this.f19503r = h0.g(((bArr[11] & UByte.MAX_VALUE) | ((bArr[10] & UByte.MAX_VALUE) << 8)) / i10, 0.0f, 0.95f);
                return;
            } else {
                this.f19503r = 0.85f;
                return;
            }
        }
        this.f19500o = 0;
        this.f19501p = -1;
        this.f19502q = C.SANS_SERIF_NAME;
        this.f19499n = false;
        this.f19503r = 0.85f;
        this.f19504s = -1;
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
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
                    e.k(3, spannableStringBuilder, i12, i13, i15);
                } else {
                    e.k(1, spannableStringBuilder, i12, i13, i15);
                }
            } else if (z11) {
                e.k(2, spannableStringBuilder, i12, i13, i15);
            }
            if ((i10 & 4) == 0) {
                z12 = false;
            }
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (!z12 && !z10 && !z11) {
                e.k(0, spannableStringBuilder, i12, i13, i15);
            }
        }
    }

    @Override // a9.g
    public final h b(byte[] bArr, int i10, boolean z10) {
        boolean z11;
        String t5;
        boolean z12;
        int i11;
        int i12;
        float f10;
        int i13;
        x xVar = this.f19498m;
        xVar.E(bArr, i10);
        int i14 = 2;
        int i15 = 1;
        int i16 = 0;
        if (xVar.f22600c - xVar.f22599b >= 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            int A = xVar.A();
            if (A == 0) {
                t5 = "";
            } else {
                int i17 = xVar.f22599b;
                Charset C = xVar.C();
                int i18 = A - (xVar.f22599b - i17);
                if (C == null) {
                    C = f.f24049c;
                }
                t5 = xVar.t(i18, C);
            }
            if (t5.isEmpty()) {
                return b.f19505c;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(t5);
            e(spannableStringBuilder, this.f19500o, 0, 0, spannableStringBuilder.length(), 16711680);
            int length = spannableStringBuilder.length();
            int i19 = this.f19501p;
            if (i19 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((i19 & 255) << 24) | (i19 >>> 8)), 0, length, 16711713);
            }
            int length2 = spannableStringBuilder.length();
            String str = this.f19502q;
            if (str != C.SANS_SERIF_NAME) {
                spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
            }
            float f11 = this.f19503r;
            while (true) {
                int i20 = xVar.f22600c;
                int i21 = xVar.f22599b;
                if (i20 - i21 >= 8) {
                    int f12 = xVar.f();
                    int f13 = xVar.f();
                    if (f13 == 1937013100) {
                        if (xVar.f22600c - xVar.f22599b >= i14) {
                            i11 = i15;
                        } else {
                            i11 = i16;
                        }
                        if (i11 != 0) {
                            int A2 = xVar.A();
                            int i22 = i16;
                            while (i16 < A2) {
                                if (xVar.f22600c - xVar.f22599b >= 12) {
                                    i22 = i15;
                                }
                                if (i22 != 0) {
                                    int A3 = xVar.A();
                                    int A4 = xVar.A();
                                    xVar.H(i14);
                                    int v10 = xVar.v();
                                    xVar.H(i15);
                                    int f14 = xVar.f();
                                    if (A4 > spannableStringBuilder.length()) {
                                        i12 = A2;
                                        StringBuilder m10 = j.m("Truncating styl end (", A4, ") to cueText.length() (");
                                        m10.append(spannableStringBuilder.length());
                                        m10.append(").");
                                        o.f("Tx3gDecoder", m10.toString());
                                        A4 = spannableStringBuilder.length();
                                    } else {
                                        i12 = A2;
                                    }
                                    int i23 = A4;
                                    if (A3 >= i23) {
                                        o.f("Tx3gDecoder", kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.j("Ignoring styl with start (", A3, ") >= end (", i23, ")."));
                                        i13 = i12;
                                        f10 = f11;
                                    } else {
                                        f10 = f11;
                                        i13 = i12;
                                        e(spannableStringBuilder, v10, this.f19500o, A3, i23, 0);
                                        if (f14 != i19) {
                                            spannableStringBuilder.setSpan(new ForegroundColorSpan((f14 >>> 8) | ((f14 & 255) << 24)), A3, i23, 33);
                                        }
                                    }
                                    i16++;
                                    i14 = 2;
                                    i15 = 1;
                                    i22 = 0;
                                    f11 = f10;
                                    A2 = i13;
                                } else {
                                    throw new a9.j("Unexpected subtitle format.");
                                }
                            }
                        } else {
                            throw new a9.j("Unexpected subtitle format.");
                        }
                    } else {
                        float f15 = f11;
                        if (f13 == 1952608120 && this.f19499n) {
                            i14 = 2;
                            if (xVar.f22600c - xVar.f22599b >= 2) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                f11 = h0.g(xVar.A() / this.f19504s, 0.0f, 0.95f);
                            } else {
                                throw new a9.j("Unexpected subtitle format.");
                            }
                        } else {
                            i14 = 2;
                            f11 = f15;
                        }
                    }
                    xVar.G(i21 + f12);
                    i15 = 1;
                    i16 = 0;
                } else {
                    float f16 = f11;
                    a9.a aVar = new a9.a();
                    aVar.a = spannableStringBuilder;
                    aVar.f346e = f16;
                    aVar.f347f = 0;
                    aVar.f348g = 0;
                    return new b(aVar.a());
                }
            }
        } else {
            throw new a9.j("Unexpected subtitle format.");
        }
    }
}
