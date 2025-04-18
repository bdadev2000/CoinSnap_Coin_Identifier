package b9;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class e {
    public static final int[] A;
    public static final boolean[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;

    /* renamed from: w, reason: collision with root package name */
    public static final int f2367w = c(2, 2, 2, 0);

    /* renamed from: x, reason: collision with root package name */
    public static final int f2368x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f2369y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f2370z;
    public final ArrayList a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f2371b = new SpannableStringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2372c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2373d;

    /* renamed from: e, reason: collision with root package name */
    public int f2374e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2375f;

    /* renamed from: g, reason: collision with root package name */
    public int f2376g;

    /* renamed from: h, reason: collision with root package name */
    public int f2377h;

    /* renamed from: i, reason: collision with root package name */
    public int f2378i;

    /* renamed from: j, reason: collision with root package name */
    public int f2379j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2380k;

    /* renamed from: l, reason: collision with root package name */
    public int f2381l;

    /* renamed from: m, reason: collision with root package name */
    public int f2382m;

    /* renamed from: n, reason: collision with root package name */
    public int f2383n;

    /* renamed from: o, reason: collision with root package name */
    public int f2384o;

    /* renamed from: p, reason: collision with root package name */
    public int f2385p;

    /* renamed from: q, reason: collision with root package name */
    public int f2386q;

    /* renamed from: r, reason: collision with root package name */
    public int f2387r;

    /* renamed from: s, reason: collision with root package name */
    public int f2388s;

    /* renamed from: t, reason: collision with root package name */
    public int f2389t;
    public int u;

    /* renamed from: v, reason: collision with root package name */
    public int f2390v;

    static {
        int c10 = c(0, 0, 0, 0);
        f2368x = c10;
        int c11 = c(0, 0, 0, 3);
        f2369y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f2370z = new int[]{0, 0, 0, 0, 0, 0, 2};
        A = new int[]{3, 3, 3, 3, 3, 3, 1};
        B = new boolean[]{false, false, false, true, true, true, false};
        C = new int[]{c10, c11, c10, c10, c11, c10, c10};
        D = new int[]{0, 1, 2, 3, 4, 3, 4};
        E = new int[]{0, 0, 0, 0, 0, 3, 3};
        F = new int[]{c10, c10, c10, c10, c10, c11, c11};
    }

    public e() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            v8.u0.i(r4, r0)
            v8.u0.i(r5, r0)
            v8.u0.i(r6, r0)
            v8.u0.i(r7, r0)
            r0 = 0
            r1 = 1
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == 0) goto L21
            if (r7 == r1) goto L21
            r3 = 2
            if (r7 == r3) goto L1e
            r3 = 3
            if (r7 == r3) goto L1c
            goto L21
        L1c:
            r7 = r0
            goto L22
        L1e:
            r7 = 127(0x7f, float:1.78E-43)
            goto L22
        L21:
            r7 = r2
        L22:
            if (r4 <= r1) goto L26
            r4 = r2
            goto L27
        L26:
            r4 = r0
        L27:
            if (r5 <= r1) goto L2b
            r5 = r2
            goto L2c
        L2b:
            r5 = r0
        L2c:
            if (r6 <= r1) goto L2f
            r0 = r2
        L2f:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.e.c(int, int, int, int):int");
    }

    public final void a(char c10) {
        SpannableStringBuilder spannableStringBuilder = this.f2371b;
        if (c10 == '\n') {
            ArrayList arrayList = this.a;
            arrayList.add(b());
            spannableStringBuilder.clear();
            if (this.f2385p != -1) {
                this.f2385p = 0;
            }
            if (this.f2386q != -1) {
                this.f2386q = 0;
            }
            if (this.f2387r != -1) {
                this.f2387r = 0;
            }
            if (this.f2389t != -1) {
                this.f2389t = 0;
            }
            while (true) {
                if ((this.f2380k && arrayList.size() >= this.f2379j) || arrayList.size() >= 15) {
                    arrayList.remove(0);
                } else {
                    return;
                }
            }
        } else {
            spannableStringBuilder.append(c10);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f2371b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f2385p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f2385p, length, 33);
            }
            if (this.f2386q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f2386q, length, 33);
            }
            if (this.f2387r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f2388s), this.f2387r, length, 33);
            }
            if (this.f2389t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.u), this.f2389t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.a.clear();
        this.f2371b.clear();
        this.f2385p = -1;
        this.f2386q = -1;
        this.f2387r = -1;
        this.f2389t = -1;
        this.f2390v = 0;
        this.f2372c = false;
        this.f2373d = false;
        this.f2374e = 4;
        this.f2375f = false;
        this.f2376g = 0;
        this.f2377h = 0;
        this.f2378i = 0;
        this.f2379j = 15;
        this.f2380k = true;
        this.f2381l = 0;
        this.f2382m = 0;
        this.f2383n = 0;
        int i10 = f2368x;
        this.f2384o = i10;
        this.f2388s = f2367w;
        this.u = i10;
    }

    public final void e(boolean z10, boolean z11) {
        int i10 = this.f2385p;
        SpannableStringBuilder spannableStringBuilder = this.f2371b;
        if (i10 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f2385p, spannableStringBuilder.length(), 33);
                this.f2385p = -1;
            }
        } else if (z10) {
            this.f2385p = spannableStringBuilder.length();
        }
        if (this.f2386q != -1) {
            if (!z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f2386q, spannableStringBuilder.length(), 33);
                this.f2386q = -1;
                return;
            }
            return;
        }
        if (z11) {
            this.f2386q = spannableStringBuilder.length();
        }
    }

    public final void f(int i10, int i11) {
        int i12 = this.f2387r;
        SpannableStringBuilder spannableStringBuilder = this.f2371b;
        if (i12 != -1 && this.f2388s != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f2388s), this.f2387r, spannableStringBuilder.length(), 33);
        }
        if (i10 != f2367w) {
            this.f2387r = spannableStringBuilder.length();
            this.f2388s = i10;
        }
        if (this.f2389t != -1 && this.u != i11) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.u), this.f2389t, spannableStringBuilder.length(), 33);
        }
        if (i11 != f2368x) {
            this.f2389t = spannableStringBuilder.length();
            this.u = i11;
        }
    }
}
