package F3;

import L3.h;
import L3.i;
import R3.f;
import R3.g;
import R3.j;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import x3.C2921b;

/* loaded from: classes2.dex */
public final class e extends g implements Drawable.Callback, h {

    /* renamed from: I0, reason: collision with root package name */
    public static final int[] f1149I0 = {R.attr.state_enabled};

    /* renamed from: J0, reason: collision with root package name */
    public static final ShapeDrawable f1150J0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1151A;

    /* renamed from: A0, reason: collision with root package name */
    public int[] f1152A0;

    /* renamed from: B, reason: collision with root package name */
    public float f1153B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f1154B0;

    /* renamed from: C, reason: collision with root package name */
    public float f1155C;

    /* renamed from: C0, reason: collision with root package name */
    public ColorStateList f1156C0;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f1157D;

    /* renamed from: D0, reason: collision with root package name */
    public WeakReference f1158D0;

    /* renamed from: E, reason: collision with root package name */
    public float f1159E;

    /* renamed from: E0, reason: collision with root package name */
    public TextUtils.TruncateAt f1160E0;

    /* renamed from: F, reason: collision with root package name */
    public ColorStateList f1161F;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f1162F0;

    /* renamed from: G, reason: collision with root package name */
    public CharSequence f1163G;

    /* renamed from: G0, reason: collision with root package name */
    public int f1164G0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f1165H;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f1166H0;

    /* renamed from: I, reason: collision with root package name */
    public Drawable f1167I;

    /* renamed from: J, reason: collision with root package name */
    public ColorStateList f1168J;

    /* renamed from: K, reason: collision with root package name */
    public float f1169K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f1170L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f1171M;

    /* renamed from: N, reason: collision with root package name */
    public Drawable f1172N;
    public RippleDrawable O;

    /* renamed from: P, reason: collision with root package name */
    public ColorStateList f1173P;

    /* renamed from: Q, reason: collision with root package name */
    public float f1174Q;

    /* renamed from: R, reason: collision with root package name */
    public SpannableStringBuilder f1175R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f1176S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f1177T;

    /* renamed from: U, reason: collision with root package name */
    public Drawable f1178U;

    /* renamed from: V, reason: collision with root package name */
    public ColorStateList f1179V;

    /* renamed from: W, reason: collision with root package name */
    public C2921b f1180W;

    /* renamed from: X, reason: collision with root package name */
    public C2921b f1181X;

    /* renamed from: Y, reason: collision with root package name */
    public float f1182Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f1183Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f1184a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f1185b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f1186c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f1187d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f1188e0;
    public float f0;

    /* renamed from: g0, reason: collision with root package name */
    public final Context f1189g0;

    /* renamed from: h0, reason: collision with root package name */
    public final Paint f1190h0;

    /* renamed from: i0, reason: collision with root package name */
    public final Paint.FontMetrics f1191i0;

    /* renamed from: j0, reason: collision with root package name */
    public final RectF f1192j0;

    /* renamed from: k0, reason: collision with root package name */
    public final PointF f1193k0;

    /* renamed from: l0, reason: collision with root package name */
    public final Path f1194l0;

    /* renamed from: m0, reason: collision with root package name */
    public final i f1195m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f1196n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f1197o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f1198p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f1199q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f1200r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f1201s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f1202t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f1203u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f1204v0;

    /* renamed from: w0, reason: collision with root package name */
    public ColorFilter f1205w0;

    /* renamed from: x0, reason: collision with root package name */
    public PorterDuffColorFilter f1206x0;

    /* renamed from: y0, reason: collision with root package name */
    public ColorStateList f1207y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f1208z;

    /* renamed from: z0, reason: collision with root package name */
    public PorterDuff.Mode f1209z0;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.tools.arruler.photomeasure.camera.ruler.R.attr.chipStyle, com.tools.arruler.photomeasure.camera.ruler.R.style.Widget_MaterialComponents_Chip_Action);
        this.f1155C = -1.0f;
        this.f1190h0 = new Paint(1);
        this.f1191i0 = new Paint.FontMetrics();
        this.f1192j0 = new RectF();
        this.f1193k0 = new PointF();
        this.f1194l0 = new Path();
        this.f1204v0 = 255;
        this.f1209z0 = PorterDuff.Mode.SRC_IN;
        this.f1158D0 = new WeakReference(null);
        i(context);
        this.f1189g0 = context;
        i iVar = new i(this);
        this.f1195m0 = iVar;
        this.f1163G = "";
        iVar.f1795a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f1149I0;
        setState(iArr);
        if (!Arrays.equals(this.f1152A0, iArr)) {
            this.f1152A0 = iArr;
            if (U()) {
                w(getState(), iArr);
            }
        }
        this.f1162F0 = true;
        int[] iArr2 = P3.a.f2414a;
        f1150J0.setTint(-1);
    }

    public static void V(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean t(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public static boolean u(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    public final void A(boolean z8) {
        if (this.f1177T != z8) {
            boolean S8 = S();
            this.f1177T = z8;
            boolean S9 = S();
            if (S8 != S9) {
                if (S9) {
                    o(this.f1178U);
                } else {
                    V(this.f1178U);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void B(float f9) {
        if (this.f1155C != f9) {
            this.f1155C = f9;
            j e4 = this.b.f2643a.e();
            e4.f2685e = new R3.a(f9);
            e4.f2686f = new R3.a(f9);
            e4.f2687g = new R3.a(f9);
            e4.f2688h = new R3.a(f9);
            setShapeAppearanceModel(e4.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1167I;
        Drawable drawable4 = null;
        if (drawable3 != 0) {
            boolean z8 = drawable3 instanceof M.g;
            drawable2 = drawable3;
            if (z8) {
                ((M.h) ((M.g) drawable3)).getClass();
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float q9 = q();
            if (drawable != null) {
                drawable4 = drawable.mutate();
            }
            this.f1167I = drawable4;
            float q10 = q();
            V(drawable2);
            if (T()) {
                o(this.f1167I);
            }
            invalidateSelf();
            if (q9 != q10) {
                v();
            }
        }
    }

    public final void D(float f9) {
        if (this.f1169K != f9) {
            float q9 = q();
            this.f1169K = f9;
            float q10 = q();
            invalidateSelf();
            if (q9 != q10) {
                v();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        this.f1170L = true;
        if (this.f1168J != colorStateList) {
            this.f1168J = colorStateList;
            if (T()) {
                M.a.h(this.f1167I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void F(boolean z8) {
        if (this.f1165H != z8) {
            boolean T2 = T();
            this.f1165H = z8;
            boolean T8 = T();
            if (T2 != T8) {
                if (T8) {
                    o(this.f1167I);
                } else {
                    V(this.f1167I);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void G(ColorStateList colorStateList) {
        if (this.f1157D != colorStateList) {
            this.f1157D = colorStateList;
            if (this.f1166H0) {
                f fVar = this.b;
                if (fVar.f2645d != colorStateList) {
                    fVar.f2645d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void H(float f9) {
        if (this.f1159E != f9) {
            this.f1159E = f9;
            this.f1190h0.setStrokeWidth(f9);
            if (this.f1166H0) {
                this.b.f2652k = f9;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(android.graphics.drawable.Drawable r6) {
        /*
            r5 = this;
            r0 = 0
            android.graphics.drawable.Drawable r1 = r5.f1172N
            if (r1 == 0) goto L10
            boolean r2 = r1 instanceof M.g
            if (r2 == 0) goto L11
            M.g r1 = (M.g) r1
            M.h r1 = (M.h) r1
            r1.getClass()
        L10:
            r1 = r0
        L11:
            if (r1 == r6) goto L4e
            float r2 = r5.r()
            if (r6 == 0) goto L1d
            android.graphics.drawable.Drawable r0 = r6.mutate()
        L1d:
            r5.f1172N = r0
            int[] r6 = P3.a.f2414a
            android.graphics.drawable.RippleDrawable r6 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r0 = r5.f1161F
            android.content.res.ColorStateList r0 = P3.a.a(r0)
            android.graphics.drawable.Drawable r3 = r5.f1172N
            android.graphics.drawable.ShapeDrawable r4 = F3.e.f1150J0
            r6.<init>(r0, r3, r4)
            r5.O = r6
            float r6 = r5.r()
            V(r1)
            boolean r0 = r5.U()
            if (r0 == 0) goto L44
            android.graphics.drawable.Drawable r0 = r5.f1172N
            r5.o(r0)
        L44:
            r5.invalidateSelf()
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 == 0) goto L4e
            r5.v()
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.e.I(android.graphics.drawable.Drawable):void");
    }

    public final void J(float f9) {
        if (this.f1188e0 != f9) {
            this.f1188e0 = f9;
            invalidateSelf();
            if (U()) {
                v();
            }
        }
    }

    public final void K(float f9) {
        if (this.f1174Q != f9) {
            this.f1174Q = f9;
            invalidateSelf();
            if (U()) {
                v();
            }
        }
    }

    public final void L(float f9) {
        if (this.f1187d0 != f9) {
            this.f1187d0 = f9;
            invalidateSelf();
            if (U()) {
                v();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        if (this.f1173P != colorStateList) {
            this.f1173P = colorStateList;
            if (U()) {
                M.a.h(this.f1172N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(boolean z8) {
        if (this.f1171M != z8) {
            boolean U8 = U();
            this.f1171M = z8;
            boolean U9 = U();
            if (U8 != U9) {
                if (U9) {
                    o(this.f1172N);
                } else {
                    V(this.f1172N);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void O(float f9) {
        if (this.f1184a0 != f9) {
            float q9 = q();
            this.f1184a0 = f9;
            float q10 = q();
            invalidateSelf();
            if (q9 != q10) {
                v();
            }
        }
    }

    public final void P(float f9) {
        if (this.f1183Z != f9) {
            float q9 = q();
            this.f1183Z = f9;
            float q10 = q();
            invalidateSelf();
            if (q9 != q10) {
                v();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.f1161F != colorStateList) {
            this.f1161F = colorStateList;
            if (this.f1154B0) {
                colorStateList2 = P3.a.a(colorStateList);
            } else {
                colorStateList2 = null;
            }
            this.f1156C0 = colorStateList2;
            onStateChange(getState());
        }
    }

    public final void R(O3.d dVar) {
        i iVar = this.f1195m0;
        if (iVar.f1799f != dVar) {
            iVar.f1799f = dVar;
            if (dVar != null) {
                TextPaint textPaint = iVar.f1795a;
                Context context = this.f1189g0;
                a aVar = iVar.b;
                dVar.f(context, textPaint, aVar);
                h hVar = (h) iVar.f1798e.get();
                if (hVar != null) {
                    textPaint.drawableState = hVar.getState();
                }
                dVar.e(context, textPaint, aVar);
                iVar.f1797d = true;
            }
            h hVar2 = (h) iVar.f1798e.get();
            if (hVar2 != null) {
                e eVar = (e) hVar2;
                eVar.v();
                eVar.invalidateSelf();
                eVar.onStateChange(hVar2.getState());
            }
        }
    }

    public final boolean S() {
        if (this.f1177T && this.f1178U != null && this.f1202t0) {
            return true;
        }
        return false;
    }

    public final boolean T() {
        if (this.f1165H && this.f1167I != null) {
            return true;
        }
        return false;
    }

    public final boolean U() {
        if (this.f1171M && this.f1172N != null) {
            return true;
        }
        return false;
    }

    @Override // R3.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i9;
        int i10;
        RectF rectF;
        int i11;
        int i12;
        int i13;
        RectF rectF2;
        boolean z8;
        int i14;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i9 = this.f1204v0) != 0) {
            if (i9 < 255) {
                i10 = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i9);
            } else {
                i10 = 0;
            }
            boolean z9 = this.f1166H0;
            Paint paint = this.f1190h0;
            RectF rectF3 = this.f1192j0;
            if (!z9) {
                paint.setColor(this.f1196n0);
                paint.setStyle(Paint.Style.FILL);
                rectF3.set(bounds);
                canvas.drawRoundRect(rectF3, s(), s(), paint);
            }
            if (!this.f1166H0) {
                paint.setColor(this.f1197o0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.f1205w0;
                if (colorFilter == null) {
                    colorFilter = this.f1206x0;
                }
                paint.setColorFilter(colorFilter);
                rectF3.set(bounds);
                canvas.drawRoundRect(rectF3, s(), s(), paint);
            }
            if (this.f1166H0) {
                super.draw(canvas);
            }
            if (this.f1159E > 0.0f && !this.f1166H0) {
                paint.setColor(this.f1199q0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.f1166H0) {
                    ColorFilter colorFilter2 = this.f1205w0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.f1206x0;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f9 = bounds.left;
                float f10 = this.f1159E / 2.0f;
                rectF3.set(f9 + f10, bounds.top + f10, bounds.right - f10, bounds.bottom - f10);
                float f11 = this.f1155C - (this.f1159E / 2.0f);
                canvas.drawRoundRect(rectF3, f11, f11, paint);
            }
            paint.setColor(this.f1200r0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            if (!this.f1166H0) {
                canvas.drawRoundRect(rectF3, s(), s(), paint);
            } else {
                RectF rectF4 = new RectF(bounds);
                Path path = this.f1194l0;
                f fVar = this.b;
                this.f2676t.a(fVar.f2643a, fVar.f2651j, rectF4, this.f2675s, path);
                e(canvas, paint, path, this.b.f2643a, g());
            }
            if (T()) {
                p(bounds, rectF3);
                float f12 = rectF3.left;
                float f13 = rectF3.top;
                canvas.translate(f12, f13);
                this.f1167I.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.f1167I.draw(canvas);
                canvas.translate(-f12, -f13);
            }
            if (S()) {
                p(bounds, rectF3);
                float f14 = rectF3.left;
                float f15 = rectF3.top;
                canvas.translate(f14, f15);
                this.f1178U.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.f1178U.draw(canvas);
                canvas.translate(-f14, -f15);
            }
            if (this.f1162F0 && this.f1163G != null) {
                PointF pointF = this.f1193k0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.f1163G;
                i iVar = this.f1195m0;
                if (charSequence != null) {
                    float q9 = q() + this.f1182Y + this.f1185b0;
                    if (M.b.a(this) == 0) {
                        pointF.x = bounds.left + q9;
                    } else {
                        pointF.x = bounds.right - q9;
                        align = Paint.Align.RIGHT;
                    }
                    float centerY = bounds.centerY();
                    TextPaint textPaint = iVar.f1795a;
                    Paint.FontMetrics fontMetrics = this.f1191i0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF3.setEmpty();
                if (this.f1163G != null) {
                    float q10 = q() + this.f1182Y + this.f1185b0;
                    float r9 = r() + this.f0 + this.f1186c0;
                    if (M.b.a(this) == 0) {
                        rectF3.left = bounds.left + q10;
                        rectF3.right = bounds.right - r9;
                    } else {
                        rectF3.left = bounds.left + r9;
                        rectF3.right = bounds.right - q10;
                    }
                    rectF3.top = bounds.top;
                    rectF3.bottom = bounds.bottom;
                }
                O3.d dVar = iVar.f1799f;
                TextPaint textPaint2 = iVar.f1795a;
                if (dVar != null) {
                    textPaint2.drawableState = getState();
                    iVar.f1799f.e(this.f1189g0, textPaint2, iVar.b);
                }
                textPaint2.setTextAlign(align);
                if (Math.round(iVar.a(this.f1163G.toString())) > Math.round(rectF3.width())) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    i14 = canvas.save();
                    canvas.clipRect(rectF3);
                } else {
                    i14 = 0;
                }
                CharSequence charSequence2 = this.f1163G;
                if (z8 && this.f1160E0 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.f1160E0);
                }
                CharSequence charSequence3 = charSequence2;
                int length = charSequence3.length();
                float f16 = pointF.x;
                float f17 = pointF.y;
                rectF = rectF3;
                i11 = i10;
                i12 = 0;
                i13 = 255;
                canvas.drawText(charSequence3, 0, length, f16, f17, textPaint2);
                if (z8) {
                    canvas.restoreToCount(i14);
                }
            } else {
                rectF = rectF3;
                i11 = i10;
                i12 = 0;
                i13 = 255;
            }
            if (U()) {
                rectF.setEmpty();
                if (U()) {
                    float f18 = this.f0 + this.f1188e0;
                    if (M.b.a(this) == 0) {
                        float f19 = bounds.right - f18;
                        rectF2 = rectF;
                        rectF2.right = f19;
                        rectF2.left = f19 - this.f1174Q;
                    } else {
                        rectF2 = rectF;
                        float f20 = bounds.left + f18;
                        rectF2.left = f20;
                        rectF2.right = f20 + this.f1174Q;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f21 = this.f1174Q;
                    float f22 = exactCenterY - (f21 / 2.0f);
                    rectF2.top = f22;
                    rectF2.bottom = f22 + f21;
                } else {
                    rectF2 = rectF;
                }
                float f23 = rectF2.left;
                float f24 = rectF2.top;
                canvas.translate(f23, f24);
                this.f1172N.setBounds(i12, i12, (int) rectF2.width(), (int) rectF2.height());
                int[] iArr = P3.a.f2414a;
                this.O.setBounds(this.f1172N.getBounds());
                this.O.jumpToCurrentState();
                this.O.draw(canvas);
                canvas.translate(-f23, -f24);
            }
            if (this.f1204v0 < i13) {
                canvas.restoreToCount(i11);
            }
        }
    }

    @Override // R3.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f1204v0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f1205w0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f1153B;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(r() + this.f1195m0.a(this.f1163G.toString()) + q() + this.f1182Y + this.f1185b0 + this.f1186c0 + this.f0), this.f1164G0);
    }

    @Override // R3.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // R3.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f1166H0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f1155C);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f1153B, this.f1155C);
        }
        outline.setAlpha(this.f1204v0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // R3.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        O3.d dVar;
        ColorStateList colorStateList;
        if (!t(this.f1208z) && !t(this.f1151A) && !t(this.f1157D) && ((!this.f1154B0 || !t(this.f1156C0)) && (((dVar = this.f1195m0.f1799f) == null || (colorStateList = dVar.f2174j) == null || !colorStateList.isStateful()) && ((!this.f1177T || this.f1178U == null || !this.f1176S) && !u(this.f1167I) && !u(this.f1178U) && !t(this.f1207y0))))) {
            return false;
        }
        return true;
    }

    public final void o(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        M.b.b(drawable, M.b.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f1172N) {
            if (drawable.isStateful()) {
                drawable.setState(this.f1152A0);
            }
            M.a.h(drawable, this.f1173P);
            return;
        }
        Drawable drawable2 = this.f1167I;
        if (drawable == drawable2 && this.f1170L) {
            M.a.h(drawable2, this.f1168J);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i9) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i9);
        if (T()) {
            onLayoutDirectionChanged |= M.b.b(this.f1167I, i9);
        }
        if (S()) {
            onLayoutDirectionChanged |= M.b.b(this.f1178U, i9);
        }
        if (U()) {
            onLayoutDirectionChanged |= M.b.b(this.f1172N, i9);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i9) {
        boolean onLevelChange = super.onLevelChange(i9);
        if (T()) {
            onLevelChange |= this.f1167I.setLevel(i9);
        }
        if (S()) {
            onLevelChange |= this.f1178U.setLevel(i9);
        }
        if (U()) {
            onLevelChange |= this.f1172N.setLevel(i9);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // R3.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f1166H0) {
            super.onStateChange(iArr);
        }
        return w(iArr, this.f1152A0);
    }

    public final void p(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        rectF.setEmpty();
        if (T() || S()) {
            float f9 = this.f1182Y + this.f1183Z;
            if (this.f1202t0) {
                drawable = this.f1178U;
            } else {
                drawable = this.f1167I;
            }
            float f10 = this.f1169K;
            if (f10 <= 0.0f && drawable != null) {
                f10 = drawable.getIntrinsicWidth();
            }
            if (M.b.a(this) == 0) {
                float f11 = rect.left + f9;
                rectF.left = f11;
                rectF.right = f11 + f10;
            } else {
                float f12 = rect.right - f9;
                rectF.right = f12;
                rectF.left = f12 - f10;
            }
            if (this.f1202t0) {
                drawable2 = this.f1178U;
            } else {
                drawable2 = this.f1167I;
            }
            float f13 = this.f1169K;
            if (f13 <= 0.0f && drawable2 != null) {
                f13 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f1189g0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f13) {
                    f13 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f13 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f13;
        }
    }

    public final float q() {
        Drawable drawable;
        if (!T() && !S()) {
            return 0.0f;
        }
        float f9 = this.f1183Z;
        if (this.f1202t0) {
            drawable = this.f1178U;
        } else {
            drawable = this.f1167I;
        }
        float f10 = this.f1169K;
        if (f10 <= 0.0f && drawable != null) {
            f10 = drawable.getIntrinsicWidth();
        }
        return f10 + f9 + this.f1184a0;
    }

    public final float r() {
        if (U()) {
            return this.f1187d0 + this.f1174Q + this.f1188e0;
        }
        return 0.0f;
    }

    public final float s() {
        if (this.f1166H0) {
            return this.b.f2643a.f2695e.a(g());
        }
        return this.f1155C;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j7);
        }
    }

    @Override // R3.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        if (this.f1204v0 != i9) {
            this.f1204v0 = i9;
            invalidateSelf();
        }
    }

    @Override // R3.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f1205w0 != colorFilter) {
            this.f1205w0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // R3.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f1207y0 != colorStateList) {
            this.f1207y0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // R3.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.f1209z0 != mode) {
            this.f1209z0 = mode;
            ColorStateList colorStateList = this.f1207y0;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.f1206x0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z8, boolean z9) {
        boolean visible = super.setVisible(z8, z9);
        if (T()) {
            visible |= this.f1167I.setVisible(z8, z9);
        }
        if (S()) {
            visible |= this.f1178U.setVisible(z8, z9);
        }
        if (U()) {
            visible |= this.f1172N.setVisible(z8, z9);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v() {
        d dVar = (d) this.f1158D0.get();
        if (dVar != null) {
            Chip chip = (Chip) dVar;
            chip.b(chip.f14002r);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(int[] r9, int[] r10) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.e.w(int[], int[]):boolean");
    }

    public final void x(boolean z8) {
        if (this.f1176S != z8) {
            this.f1176S = z8;
            float q9 = q();
            if (!z8 && this.f1202t0) {
                this.f1202t0 = false;
            }
            float q10 = q();
            invalidateSelf();
            if (q9 != q10) {
                v();
            }
        }
    }

    public final void y(Drawable drawable) {
        if (this.f1178U != drawable) {
            float q9 = q();
            this.f1178U = drawable;
            float q10 = q();
            V(this.f1178U);
            o(this.f1178U);
            invalidateSelf();
            if (q9 != q10) {
                v();
            }
        }
    }

    public final void z(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f1179V != colorStateList) {
            this.f1179V = colorStateList;
            if (this.f1177T && (drawable = this.f1178U) != null && this.f1176S) {
                M.a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }
}
