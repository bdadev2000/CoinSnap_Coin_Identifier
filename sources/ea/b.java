package ea;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import v8.u0;

/* loaded from: classes3.dex */
public final class b {
    public CharSequence A;
    public CharSequence B;
    public boolean C;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public int J;
    public int[] K;
    public boolean L;
    public final TextPaint M;
    public final TextPaint N;
    public TimeInterpolator O;
    public TimeInterpolator P;
    public float Q;
    public float R;
    public float S;
    public ColorStateList T;
    public float U;
    public float V;
    public float W;
    public StaticLayout X;
    public float Y;
    public float Z;
    public final View a;

    /* renamed from: a0, reason: collision with root package name */
    public float f17205a0;

    /* renamed from: b, reason: collision with root package name */
    public float f17206b;

    /* renamed from: b0, reason: collision with root package name */
    public CharSequence f17207b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f17208c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f17210d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f17212e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f17218j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f17219k;

    /* renamed from: l, reason: collision with root package name */
    public float f17220l;

    /* renamed from: m, reason: collision with root package name */
    public float f17221m;

    /* renamed from: n, reason: collision with root package name */
    public float f17222n;

    /* renamed from: o, reason: collision with root package name */
    public float f17223o;

    /* renamed from: p, reason: collision with root package name */
    public float f17224p;

    /* renamed from: q, reason: collision with root package name */
    public float f17225q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f17226r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f17227s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f17228t;
    public Typeface u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f17229v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f17230w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f17231x;

    /* renamed from: y, reason: collision with root package name */
    public ha.a f17232y;

    /* renamed from: f, reason: collision with root package name */
    public int f17214f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f17215g = 16;

    /* renamed from: h, reason: collision with root package name */
    public float f17216h = 15.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f17217i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f17233z = TextUtils.TruncateAt.END;
    public final boolean D = true;

    /* renamed from: c0, reason: collision with root package name */
    public final int f17209c0 = 1;

    /* renamed from: d0, reason: collision with root package name */
    public final float f17211d0 = 1.0f;

    /* renamed from: e0, reason: collision with root package name */
    public final int f17213e0 = 1;

    public b(View view) {
        this.a = view;
        TextPaint textPaint = new TextPaint(129);
        this.M = textPaint;
        this.N = new TextPaint(textPaint);
        this.f17210d = new Rect();
        this.f17208c = new Rect();
        this.f17212e = new RectF();
        h(view.getContext().getResources().getConfiguration());
    }

    public static int a(float f10, int i10, int i11) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i11) * f10) + (Color.alpha(i10) * f11)), Math.round((Color.red(i11) * f10) + (Color.red(i10) * f11)), Math.round((Color.green(i11) * f10) + (Color.green(i10) * f11)), Math.round((Color.blue(i11) * f10) + (Color.blue(i10) * f11)));
    }

    public static float g(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        LinearInterpolator linearInterpolator = s9.a.a;
        return vd.e.b(f11, f10, f12, f10);
    }

    public final void b() {
        float f10 = this.f17206b;
        float f11 = this.f17208c.left;
        Rect rect = this.f17210d;
        float g10 = g(f11, rect.left, f10, this.O);
        RectF rectF = this.f17212e;
        rectF.left = g10;
        rectF.top = g(this.f17220l, this.f17221m, f10, this.O);
        rectF.right = g(r1.right, rect.right, f10, this.O);
        rectF.bottom = g(r1.bottom, rect.bottom, f10, this.O);
        this.f17224p = g(this.f17222n, this.f17223o, f10, this.O);
        this.f17225q = g(this.f17220l, this.f17221m, f10, this.O);
        d(f10, false);
        View view = this.a;
        view.postInvalidateOnAnimation();
        i1.b bVar = s9.a.f24933b;
        this.Z = 1.0f - g(0.0f, 1.0f, 1.0f - f10, bVar);
        view.postInvalidateOnAnimation();
        this.f17205a0 = g(1.0f, 0.0f, f10, bVar);
        view.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f17219k;
        ColorStateList colorStateList2 = this.f17218j;
        TextPaint textPaint = this.M;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f10, f(colorStateList2), f(this.f17219k)));
        } else {
            textPaint.setColor(f(colorStateList));
        }
        float f12 = this.U;
        float f13 = this.V;
        if (f12 != f13) {
            textPaint.setLetterSpacing(g(f13, f12, f10, bVar));
        } else {
            textPaint.setLetterSpacing(f12);
        }
        this.G = g(0.0f, this.Q, f10, null);
        this.H = g(0.0f, this.R, f10, null);
        this.I = g(0.0f, this.S, f10, null);
        int a = a(f10, f(null), f(this.T));
        this.J = a;
        textPaint.setShadowLayer(this.G, this.H, this.I, a);
        view.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        l0.i iVar;
        boolean z10 = true;
        if (this.a.getLayoutDirection() != 1) {
            z10 = false;
        }
        if (this.D) {
            if (z10) {
                iVar = l0.j.f21110d;
            } else {
                iVar = l0.j.f21109c;
            }
            return iVar.i(charSequence, charSequence.length());
        }
        return z10;
    }

    public final void d(float f10, boolean z10) {
        boolean z11;
        boolean z12;
        float f11;
        float f12;
        Typeface typeface;
        boolean z13;
        boolean z14;
        StaticLayout staticLayout;
        Layout.Alignment alignment;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        if (this.A == null) {
            return;
        }
        float width = this.f17210d.width();
        float width2 = this.f17208c.width();
        if (Math.abs(f10 - 1.0f) < 1.0E-5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            f11 = this.f17217i;
            f12 = this.U;
            this.E = 1.0f;
            typeface = this.f17226r;
        } else {
            float f13 = this.f17216h;
            float f14 = this.V;
            Typeface typeface2 = this.u;
            if (Math.abs(f10 - 0.0f) < 1.0E-5f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                this.E = 1.0f;
            } else {
                this.E = g(this.f17216h, this.f17217i, f10, this.P) / this.f17216h;
            }
            float f15 = this.f17217i / this.f17216h;
            float f16 = width2 * f15;
            if (!z10 && f16 > width) {
                width = Math.min(width / f15, width2);
            } else {
                width = width2;
            }
            f11 = f13;
            f12 = f14;
            typeface = typeface2;
        }
        TextPaint textPaint = this.M;
        if (width > 0.0f) {
            if (this.F != f11) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (this.W != f12) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (this.f17231x != typeface) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (this.X != null && width != r10.getWidth()) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (!z15 && !z16 && !z18 && !z17 && !this.L) {
                z19 = false;
            } else {
                z19 = true;
            }
            this.F = f11;
            this.W = f12;
            this.f17231x = typeface;
            this.L = false;
            if (this.E != 1.0f) {
                z20 = true;
            } else {
                z20 = false;
            }
            textPaint.setLinearText(z20);
            z13 = z19;
        } else {
            z13 = false;
        }
        if (this.B == null || z13) {
            textPaint.setTextSize(this.F);
            textPaint.setTypeface(this.f17231x);
            textPaint.setLetterSpacing(this.W);
            boolean c10 = c(this.A);
            this.C = c10;
            int i10 = this.f17209c0;
            if (i10 > 1 && !c10) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                i10 = 1;
            }
            try {
                if (i10 == 1) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f17214f, c10 ? 1 : 0) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            if (this.C) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else {
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            }
                        } else if (this.C) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        }
                    } else {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    }
                }
                g gVar = new g(this.A, textPaint, (int) width);
                gVar.f17250l = this.f17233z;
                gVar.f17249k = c10;
                gVar.f17243e = alignment;
                gVar.f17248j = false;
                gVar.f17244f = i10;
                float f17 = this.f17211d0;
                gVar.f17245g = 0.0f;
                gVar.f17246h = f17;
                gVar.f17247i = this.f17213e0;
                staticLayout = gVar.a();
            } catch (f e2) {
                Log.e("CollapsingTextHelper", e2.getCause().getMessage(), e2);
                staticLayout = null;
            }
            staticLayout.getClass();
            this.X = staticLayout;
            this.B = staticLayout.getText();
        }
    }

    public final float e() {
        TextPaint textPaint = this.N;
        textPaint.setTextSize(this.f17217i);
        textPaint.setTypeface(this.f17226r);
        textPaint.setLetterSpacing(this.U);
        return -textPaint.ascent();
    }

    public final int f(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.K;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void h(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f17228t;
            if (typeface != null) {
                this.f17227s = u0.S(configuration, typeface);
            }
            Typeface typeface2 = this.f17230w;
            if (typeface2 != null) {
                this.f17229v = u0.S(configuration, typeface2);
            }
            Typeface typeface3 = this.f17227s;
            if (typeface3 == null) {
                typeface3 = this.f17228t;
            }
            this.f17226r = typeface3;
            Typeface typeface4 = this.f17229v;
            if (typeface4 == null) {
                typeface4 = this.f17230w;
            }
            this.u = typeface4;
            i(true);
        }
    }

    public final void i(boolean z10) {
        float f10;
        StaticLayout staticLayout;
        View view = this.a;
        if ((view.getHeight() > 0 && view.getWidth() > 0) || z10) {
            d(1.0f, z10);
            CharSequence charSequence = this.B;
            TextPaint textPaint = this.M;
            if (charSequence != null && (staticLayout = this.X) != null) {
                this.f17207b0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f17233z);
            }
            CharSequence charSequence2 = this.f17207b0;
            float f11 = 0.0f;
            if (charSequence2 != null) {
                this.Y = textPaint.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.Y = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f17215g, this.C ? 1 : 0);
            int i10 = absoluteGravity & 112;
            Rect rect = this.f17210d;
            if (i10 != 48) {
                if (i10 != 80) {
                    this.f17221m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
                } else {
                    this.f17221m = textPaint.ascent() + rect.bottom;
                }
            } else {
                this.f17221m = rect.top;
            }
            int i11 = absoluteGravity & 8388615;
            if (i11 != 1) {
                if (i11 != 5) {
                    this.f17223o = rect.left;
                } else {
                    this.f17223o = rect.right - this.Y;
                }
            } else {
                this.f17223o = rect.centerX() - (this.Y / 2.0f);
            }
            d(0.0f, z10);
            StaticLayout staticLayout2 = this.X;
            if (staticLayout2 != null) {
                f10 = staticLayout2.getHeight();
            } else {
                f10 = 0.0f;
            }
            StaticLayout staticLayout3 = this.X;
            if (staticLayout3 != null && this.f17209c0 > 1) {
                f11 = staticLayout3.getWidth();
            } else {
                CharSequence charSequence3 = this.B;
                if (charSequence3 != null) {
                    f11 = textPaint.measureText(charSequence3, 0, charSequence3.length());
                }
            }
            StaticLayout staticLayout4 = this.X;
            if (staticLayout4 != null) {
                staticLayout4.getLineCount();
            }
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f17214f, this.C ? 1 : 0);
            int i12 = absoluteGravity2 & 112;
            Rect rect2 = this.f17208c;
            if (i12 != 48) {
                if (i12 != 80) {
                    this.f17220l = rect2.centerY() - (f10 / 2.0f);
                } else {
                    this.f17220l = textPaint.descent() + (rect2.bottom - f10);
                }
            } else {
                this.f17220l = rect2.top;
            }
            int i13 = absoluteGravity2 & 8388615;
            if (i13 != 1) {
                if (i13 != 5) {
                    this.f17222n = rect2.left;
                } else {
                    this.f17222n = rect2.right - f11;
                }
            } else {
                this.f17222n = rect2.centerX() - (f11 / 2.0f);
            }
            d(this.f17206b, false);
            view.postInvalidateOnAnimation();
            b();
        }
    }

    public final void j(ColorStateList colorStateList) {
        if (this.f17219k != colorStateList || this.f17218j != colorStateList) {
            this.f17219k = colorStateList;
            this.f17218j = colorStateList;
            i(false);
        }
    }

    public final boolean k(Typeface typeface) {
        ha.a aVar = this.f17232y;
        if (aVar != null) {
            aVar.f18984h = true;
        }
        if (this.f17228t != typeface) {
            this.f17228t = typeface;
            Typeface S = u0.S(this.a.getContext().getResources().getConfiguration(), typeface);
            this.f17227s = S;
            if (S == null) {
                S = this.f17228t;
            }
            this.f17226r = S;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000b, code lost:
    
        if (r3 > 1.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(float r3) {
        /*
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L7
        L5:
            r3 = r0
            goto Le
        L7:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Le
            goto L5
        Le:
            float r0 = r2.f17206b
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L19
            r2.f17206b = r3
            r2.b()
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.b.l(float):void");
    }

    public final void m(Typeface typeface) {
        boolean z10;
        boolean k10 = k(typeface);
        if (this.f17230w != typeface) {
            this.f17230w = typeface;
            Typeface S = u0.S(this.a.getContext().getResources().getConfiguration(), typeface);
            this.f17229v = S;
            if (S == null) {
                S = this.f17230w;
            }
            this.u = S;
            z10 = true;
        } else {
            z10 = false;
        }
        if (k10 || z10) {
            i(false);
        }
    }
}
