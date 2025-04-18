package b9;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import n9.h0;

/* loaded from: classes3.dex */
public final class b {
    public final ArrayList a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2339b;

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f2340c;

    /* renamed from: d, reason: collision with root package name */
    public int f2341d;

    /* renamed from: e, reason: collision with root package name */
    public int f2342e;

    /* renamed from: f, reason: collision with root package name */
    public int f2343f;

    /* renamed from: g, reason: collision with root package name */
    public int f2344g;

    /* renamed from: h, reason: collision with root package name */
    public int f2345h;

    public b(int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f2339b = arrayList2;
        StringBuilder sb2 = new StringBuilder();
        this.f2340c = sb2;
        this.f2344g = i10;
        arrayList.clear();
        arrayList2.clear();
        sb2.setLength(0);
        this.f2341d = 15;
        this.f2342e = 0;
        this.f2343f = 0;
        this.f2345h = i11;
    }

    public final void a(char c10) {
        StringBuilder sb2 = this.f2340c;
        if (sb2.length() < 32) {
            sb2.append(c10);
        }
    }

    public final void b() {
        a aVar;
        int i10;
        StringBuilder sb2 = this.f2340c;
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - 1, length);
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0 && (i10 = (aVar = (a) arrayList.get(size)).f2338c) == length) {
                    aVar.f2338c = i10 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final a9.b c(int i10) {
        float f10;
        int i11 = this.f2342e + this.f2343f;
        int i12 = 32 - i11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f2339b;
            if (i13 >= arrayList.size()) {
                break;
            }
            CharSequence charSequence = (CharSequence) arrayList.get(i13);
            int i14 = h0.a;
            if (charSequence.length() > i12) {
                charSequence = charSequence.subSequence(0, i12);
            }
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append('\n');
            i13++;
        }
        SpannableString d10 = d();
        int i15 = h0.a;
        int length = d10.length();
        CharSequence charSequence2 = d10;
        if (length > i12) {
            charSequence2 = d10.subSequence(0, i12);
        }
        spannableStringBuilder.append(charSequence2);
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int length2 = i12 - spannableStringBuilder.length();
        int i16 = i11 - length2;
        if (i10 == Integer.MIN_VALUE) {
            if (this.f2344g == 2 && (Math.abs(i16) < 3 || length2 < 0)) {
                i10 = 1;
            } else if (this.f2344g == 2 && i16 > 0) {
                i10 = 2;
            } else {
                i10 = 0;
            }
        }
        if (i10 != 1) {
            if (i10 == 2) {
                i11 = 32 - length2;
            }
            f10 = ((i11 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f10 = 0.5f;
        }
        int i17 = this.f2341d;
        if (i17 > 7) {
            i17 = (i17 - 15) - 2;
        } else if (this.f2344g == 1) {
            i17 -= this.f2345h - 1;
        }
        a9.a aVar = new a9.a();
        aVar.a = spannableStringBuilder;
        aVar.f344c = Layout.Alignment.ALIGN_NORMAL;
        aVar.f346e = i17;
        aVar.f347f = 1;
        aVar.f349h = f10;
        aVar.f350i = i10;
        return aVar.a();
    }

    public final SpannableString d() {
        int i10;
        boolean z10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f2340c);
        int length = spannableStringBuilder.length();
        int i11 = 0;
        int i12 = 0;
        boolean z11 = false;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        while (true) {
            ArrayList arrayList = this.a;
            if (i11 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i11);
            boolean z12 = aVar.f2337b;
            int i17 = aVar.a;
            if (i17 != 8) {
                if (i17 == 7) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i17 != 7) {
                    i16 = c.A[i17];
                }
                z11 = z10;
            }
            int i18 = aVar.f2338c;
            i11++;
            if (i11 < arrayList.size()) {
                i10 = ((a) arrayList.get(i11)).f2338c;
            } else {
                i10 = length;
            }
            if (i18 != i10) {
                if (i13 != -1 && !z12) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i13, i18, 33);
                    i13 = -1;
                } else if (i13 == -1 && z12) {
                    i13 = i18;
                }
                if (i14 != -1 && !z11) {
                    com.applovin.impl.mediation.ads.e.k(2, spannableStringBuilder, i14, i18, 33);
                    i14 = -1;
                } else if (i14 == -1 && z11) {
                    i14 = i18;
                }
                if (i16 != i15) {
                    if (i15 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i15), i12, i18, 33);
                    }
                    i15 = i16;
                    i12 = i18;
                }
            }
        }
        if (i13 != -1 && i13 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i13, length, 33);
        }
        if (i14 != -1 && i14 != length) {
            com.applovin.impl.mediation.ads.e.k(2, spannableStringBuilder, i14, length, 33);
        }
        if (i12 != length && i15 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i15), i12, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        if (this.a.isEmpty() && this.f2339b.isEmpty() && this.f2340c.length() == 0) {
            return true;
        }
        return false;
    }
}
