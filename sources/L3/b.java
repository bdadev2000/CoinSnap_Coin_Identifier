package L3;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import androidx.core.view.ViewCompat;
import x3.AbstractC2920a;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f1725A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f1726B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1727C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f1729E;

    /* renamed from: F, reason: collision with root package name */
    public float f1730F;

    /* renamed from: G, reason: collision with root package name */
    public float f1731G;

    /* renamed from: H, reason: collision with root package name */
    public float f1732H;

    /* renamed from: I, reason: collision with root package name */
    public float f1733I;

    /* renamed from: J, reason: collision with root package name */
    public float f1734J;

    /* renamed from: K, reason: collision with root package name */
    public int f1735K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f1736L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f1737M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f1738N;
    public final TextPaint O;

    /* renamed from: P, reason: collision with root package name */
    public TimeInterpolator f1739P;

    /* renamed from: Q, reason: collision with root package name */
    public TimeInterpolator f1740Q;

    /* renamed from: R, reason: collision with root package name */
    public float f1741R;

    /* renamed from: S, reason: collision with root package name */
    public float f1742S;

    /* renamed from: T, reason: collision with root package name */
    public float f1743T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f1744U;

    /* renamed from: V, reason: collision with root package name */
    public float f1745V;

    /* renamed from: W, reason: collision with root package name */
    public float f1746W;

    /* renamed from: X, reason: collision with root package name */
    public float f1747X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f1748Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f1749Z;

    /* renamed from: a, reason: collision with root package name */
    public final View f1750a;

    /* renamed from: a0, reason: collision with root package name */
    public float f1751a0;
    public float b;

    /* renamed from: b0, reason: collision with root package name */
    public float f1752b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f1753c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f1754c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f1755d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f1757e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f1763j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f1764k;
    public float l;
    public float m;

    /* renamed from: n, reason: collision with root package name */
    public float f1765n;

    /* renamed from: o, reason: collision with root package name */
    public float f1766o;

    /* renamed from: p, reason: collision with root package name */
    public float f1767p;

    /* renamed from: q, reason: collision with root package name */
    public float f1768q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f1769r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f1770s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f1771t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f1772u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f1773v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f1774w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f1775x;

    /* renamed from: y, reason: collision with root package name */
    public O3.a f1776y;

    /* renamed from: f, reason: collision with root package name */
    public int f1759f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f1760g = 16;

    /* renamed from: h, reason: collision with root package name */
    public float f1761h = 15.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f1762i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f1777z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f1728D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f1756d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f1758e0 = 1.0f;
    public final int f0 = 1;

    public b(View view) {
        this.f1750a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f1738N = textPaint;
        this.O = new TextPaint(textPaint);
        this.f1755d = new Rect();
        this.f1753c = new Rect();
        this.f1757e = new RectF();
        g(view.getContext().getResources().getConfiguration());
    }

    public static int a(float f9, int i9, int i10) {
        float f10 = 1.0f - f9;
        return Color.argb(Math.round((Color.alpha(i10) * f9) + (Color.alpha(i9) * f10)), Math.round((Color.red(i10) * f9) + (Color.red(i9) * f10)), Math.round((Color.green(i10) * f9) + (Color.green(i9) * f10)), Math.round((Color.blue(i10) * f9) + (Color.blue(i9) * f10)));
    }

    public static float f(float f9, float f10, float f11, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f11 = timeInterpolator.getInterpolation(f11);
        }
        return AbstractC2920a.a(f9, f10, f11);
    }

    public final boolean b(CharSequence charSequence) {
        B3.e eVar;
        boolean z8 = true;
        if (ViewCompat.getLayoutDirection(this.f1750a) != 1) {
            z8 = false;
        }
        if (this.f1728D) {
            if (z8) {
                eVar = R.g.f2614d;
            } else {
                eVar = R.g.f2613c;
            }
            return eVar.f(charSequence, charSequence.length());
        }
        return z8;
    }

    public final void c(float f9, boolean z8) {
        boolean z9;
        float f10;
        float f11;
        Typeface typeface;
        boolean z10;
        Layout.Alignment alignment;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        if (this.f1725A == null) {
            return;
        }
        float width = this.f1755d.width();
        float width2 = this.f1753c.width();
        if (Math.abs(f9 - 1.0f) < 1.0E-5f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            f10 = this.f1762i;
            f11 = this.f1745V;
            this.f1730F = 1.0f;
            typeface = this.f1769r;
        } else {
            float f12 = this.f1761h;
            float f13 = this.f1746W;
            Typeface typeface2 = this.f1772u;
            if (Math.abs(f9 - 0.0f) < 1.0E-5f) {
                this.f1730F = 1.0f;
            } else {
                this.f1730F = f(this.f1761h, this.f1762i, f9, this.f1740Q) / this.f1761h;
            }
            float f14 = this.f1762i / this.f1761h;
            float f15 = width2 * f14;
            if (!z8 && f15 > width) {
                width = Math.min(width / f14, width2);
            } else {
                width = width2;
            }
            f10 = f12;
            f11 = f13;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f1738N;
        if (width > 0.0f) {
            if (this.f1731G != f10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f1747X != f11) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.f1775x != typeface) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (this.f1748Y != null && width != r10.getWidth()) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z11 && !z12 && !z14 && !z13 && !this.f1737M) {
                z15 = false;
            } else {
                z15 = true;
            }
            this.f1731G = f10;
            this.f1747X = f11;
            this.f1775x = typeface;
            this.f1737M = false;
            if (this.f1730F != 1.0f) {
                z16 = true;
            } else {
                z16 = false;
            }
            textPaint.setLinearText(z16);
            z10 = z15;
        } else {
            z10 = false;
        }
        if (this.f1726B == null || z10) {
            textPaint.setTextSize(this.f1731G);
            textPaint.setTypeface(this.f1775x);
            textPaint.setLetterSpacing(this.f1747X);
            boolean b = b(this.f1725A);
            this.f1727C = b;
            int i9 = this.f1756d0;
            if (i9 <= 1 || b) {
                i9 = 1;
            }
            if (i9 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f1759f, b ? 1 : 0) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        if (this.f1727C) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        }
                    } else if (this.f1727C) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    }
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
            }
            g gVar = new g(this.f1725A, textPaint, (int) width);
            gVar.l = this.f1777z;
            gVar.f1794k = b;
            gVar.f1788e = alignment;
            gVar.f1793j = false;
            gVar.f1789f = i9;
            float f16 = this.f1758e0;
            gVar.f1790g = 0.0f;
            gVar.f1791h = f16;
            gVar.f1792i = this.f0;
            StaticLayout a6 = gVar.a();
            a6.getClass();
            this.f1748Y = a6;
            this.f1726B = a6.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.O;
        textPaint.setTextSize(this.f1762i);
        textPaint.setTypeface(this.f1769r);
        textPaint.setLetterSpacing(this.f1745V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f1736L;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f1771t;
            if (typeface != null) {
                this.f1770s = com.bumptech.glide.d.R(configuration, typeface);
            }
            Typeface typeface2 = this.f1774w;
            if (typeface2 != null) {
                this.f1773v = com.bumptech.glide.d.R(configuration, typeface2);
            }
            Typeface typeface3 = this.f1770s;
            if (typeface3 == null) {
                typeface3 = this.f1771t;
            }
            this.f1769r = typeface3;
            Typeface typeface4 = this.f1773v;
            if (typeface4 == null) {
                typeface4 = this.f1774w;
            }
            this.f1772u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z8) {
        float f9;
        float f10;
        StaticLayout staticLayout;
        View view = this.f1750a;
        if ((view.getHeight() > 0 && view.getWidth() > 0) || z8) {
            c(1.0f, z8);
            CharSequence charSequence = this.f1726B;
            TextPaint textPaint = this.f1738N;
            if (charSequence != null && (staticLayout = this.f1748Y) != null) {
                this.f1754c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f1777z);
            }
            CharSequence charSequence2 = this.f1754c0;
            if (charSequence2 != null) {
                this.f1749Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.f1749Z = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f1760g, this.f1727C ? 1 : 0);
            int i9 = absoluteGravity & 112;
            Rect rect = this.f1755d;
            if (i9 != 48) {
                if (i9 != 80) {
                    this.m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
                } else {
                    this.m = textPaint.ascent() + rect.bottom;
                }
            } else {
                this.m = rect.top;
            }
            int i10 = absoluteGravity & 8388615;
            if (i10 != 1) {
                if (i10 != 5) {
                    this.f1766o = rect.left;
                } else {
                    this.f1766o = rect.right - this.f1749Z;
                }
            } else {
                this.f1766o = rect.centerX() - (this.f1749Z / 2.0f);
            }
            c(0.0f, z8);
            StaticLayout staticLayout2 = this.f1748Y;
            if (staticLayout2 != null) {
                f9 = staticLayout2.getHeight();
            } else {
                f9 = 0.0f;
            }
            StaticLayout staticLayout3 = this.f1748Y;
            if (staticLayout3 != null && this.f1756d0 > 1) {
                f10 = staticLayout3.getWidth();
            } else {
                CharSequence charSequence3 = this.f1726B;
                if (charSequence3 != null) {
                    f10 = textPaint.measureText(charSequence3, 0, charSequence3.length());
                } else {
                    f10 = 0.0f;
                }
            }
            StaticLayout staticLayout4 = this.f1748Y;
            if (staticLayout4 != null) {
                staticLayout4.getLineCount();
            }
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f1759f, this.f1727C ? 1 : 0);
            int i11 = absoluteGravity2 & 112;
            Rect rect2 = this.f1753c;
            if (i11 != 48) {
                if (i11 != 80) {
                    this.l = rect2.centerY() - (f9 / 2.0f);
                } else {
                    this.l = textPaint.descent() + (rect2.bottom - f9);
                }
            } else {
                this.l = rect2.top;
            }
            int i12 = absoluteGravity2 & 8388615;
            if (i12 != 1) {
                if (i12 != 5) {
                    this.f1765n = rect2.left;
                } else {
                    this.f1765n = rect2.right - f10;
                }
            } else {
                this.f1765n = rect2.centerX() - (f10 / 2.0f);
            }
            Bitmap bitmap = this.f1729E;
            if (bitmap != null) {
                bitmap.recycle();
                this.f1729E = null;
            }
            l(this.b);
            float f11 = this.b;
            float f12 = f(rect2.left, rect.left, f11, this.f1739P);
            RectF rectF = this.f1757e;
            rectF.left = f12;
            rectF.top = f(this.l, this.m, f11, this.f1739P);
            rectF.right = f(rect2.right, rect.right, f11, this.f1739P);
            rectF.bottom = f(rect2.bottom, rect.bottom, f11, this.f1739P);
            this.f1767p = f(this.f1765n, this.f1766o, f11, this.f1739P);
            this.f1768q = f(this.l, this.m, f11, this.f1739P);
            l(f11);
            p0.a aVar = AbstractC2920a.b;
            this.f1751a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f11, aVar);
            ViewCompat.postInvalidateOnAnimation(view);
            this.f1752b0 = f(1.0f, 0.0f, f11, aVar);
            ViewCompat.postInvalidateOnAnimation(view);
            ColorStateList colorStateList = this.f1764k;
            ColorStateList colorStateList2 = this.f1763j;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f11, e(colorStateList2), e(this.f1764k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f13 = this.f1745V;
            float f14 = this.f1746W;
            if (f13 != f14) {
                textPaint.setLetterSpacing(f(f14, f13, f11, aVar));
            } else {
                textPaint.setLetterSpacing(f13);
            }
            this.f1732H = AbstractC2920a.a(0.0f, this.f1741R, f11);
            this.f1733I = AbstractC2920a.a(0.0f, this.f1742S, f11);
            this.f1734J = AbstractC2920a.a(0.0f, this.f1743T, f11);
            int a6 = a(f11, 0, e(this.f1744U));
            this.f1735K = a6;
            textPaint.setShadowLayer(this.f1732H, this.f1733I, this.f1734J, a6);
            ViewCompat.postInvalidateOnAnimation(view);
        }
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f1764k != colorStateList || this.f1763j != colorStateList) {
            this.f1764k = colorStateList;
            this.f1763j = colorStateList;
            h(false);
        }
    }

    public final boolean j(Typeface typeface) {
        O3.a aVar = this.f1776y;
        if (aVar != null) {
            aVar.f2159f = true;
        }
        if (this.f1771t != typeface) {
            this.f1771t = typeface;
            Typeface R4 = com.bumptech.glide.d.R(this.f1750a.getContext().getResources().getConfiguration(), typeface);
            this.f1770s = R4;
            if (R4 == null) {
                R4 = this.f1771t;
            }
            this.f1769r = R4;
            return true;
        }
        return false;
    }

    public final void k(float f9) {
        if (f9 < 0.0f) {
            f9 = 0.0f;
        } else if (f9 > 1.0f) {
            f9 = 1.0f;
        }
        if (f9 != this.b) {
            this.b = f9;
            float f10 = this.f1753c.left;
            Rect rect = this.f1755d;
            float f11 = f(f10, rect.left, f9, this.f1739P);
            RectF rectF = this.f1757e;
            rectF.left = f11;
            rectF.top = f(this.l, this.m, f9, this.f1739P);
            rectF.right = f(r1.right, rect.right, f9, this.f1739P);
            rectF.bottom = f(r1.bottom, rect.bottom, f9, this.f1739P);
            this.f1767p = f(this.f1765n, this.f1766o, f9, this.f1739P);
            this.f1768q = f(this.l, this.m, f9, this.f1739P);
            l(f9);
            p0.a aVar = AbstractC2920a.b;
            this.f1751a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f9, aVar);
            View view = this.f1750a;
            ViewCompat.postInvalidateOnAnimation(view);
            this.f1752b0 = f(1.0f, 0.0f, f9, aVar);
            ViewCompat.postInvalidateOnAnimation(view);
            ColorStateList colorStateList = this.f1764k;
            ColorStateList colorStateList2 = this.f1763j;
            TextPaint textPaint = this.f1738N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f9, e(colorStateList2), e(this.f1764k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f12 = this.f1745V;
            float f13 = this.f1746W;
            if (f12 != f13) {
                textPaint.setLetterSpacing(f(f13, f12, f9, aVar));
            } else {
                textPaint.setLetterSpacing(f12);
            }
            this.f1732H = AbstractC2920a.a(0.0f, this.f1741R, f9);
            this.f1733I = AbstractC2920a.a(0.0f, this.f1742S, f9);
            this.f1734J = AbstractC2920a.a(0.0f, this.f1743T, f9);
            int a6 = a(f9, 0, e(this.f1744U));
            this.f1735K = a6;
            textPaint.setShadowLayer(this.f1732H, this.f1733I, this.f1734J, a6);
            ViewCompat.postInvalidateOnAnimation(view);
        }
    }

    public final void l(float f9) {
        c(f9, false);
        ViewCompat.postInvalidateOnAnimation(this.f1750a);
    }

    public final void m(Typeface typeface) {
        boolean z8;
        boolean j7 = j(typeface);
        if (this.f1774w != typeface) {
            this.f1774w = typeface;
            Typeface R4 = com.bumptech.glide.d.R(this.f1750a.getContext().getResources().getConfiguration(), typeface);
            this.f1773v = R4;
            if (R4 == null) {
                R4 = this.f1774w;
            }
            this.f1772u = R4;
            z8 = true;
        } else {
            z8 = false;
        }
        if (j7 || z8) {
            h(false);
        }
    }
}
