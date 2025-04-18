package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.s;
import androidx.core.view.ViewCompat;
import com.google.android.material.chip.Chip;
import ea.i;
import h0.g;
import h0.h;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import ka.l;
import ka.x;
import p6.a;
import v8.u0;
import z9.b;
import z9.c;
import z9.d;
import z9.e;
import z9.f;

/* loaded from: classes3.dex */
public class Chip extends s implements e, x, Checkable {

    /* renamed from: g, reason: collision with root package name */
    public f f11642g;

    /* renamed from: h, reason: collision with root package name */
    public InsetDrawable f11643h;

    /* renamed from: i, reason: collision with root package name */
    public RippleDrawable f11644i;

    /* renamed from: j, reason: collision with root package name */
    public View.OnClickListener f11645j;

    /* renamed from: k, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f11646k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11647l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11648m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11649n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11650o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11651p;

    /* renamed from: q, reason: collision with root package name */
    public int f11652q;

    /* renamed from: r, reason: collision with root package name */
    public int f11653r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f11654s;

    /* renamed from: t, reason: collision with root package name */
    public final d f11655t;
    public boolean u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f11656v;

    /* renamed from: w, reason: collision with root package name */
    public final RectF f11657w;

    /* renamed from: x, reason: collision with root package name */
    public final b f11658x;

    /* renamed from: y, reason: collision with root package name */
    public static final Rect f11640y = new Rect();

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f11641z = {R.attr.state_selected};
    public static final int[] A = {R.attr.state_checkable};

    public Chip(Context context, AttributeSet attributeSet) {
        super(a.z(context, attributeSet, com.plantcare.ai.identifier.plantid.R.attr.chipStyle, com.plantcare.ai.identifier.plantid.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.plantcare.ai.identifier.plantid.R.attr.chipStyle);
        ha.d dVar;
        s9.b bVar;
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f11656v = new Rect();
        this.f11657w = new RectF();
        this.f11658x = new b(this, 0);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        f fVar = new f(context2, attributeSet);
        Context context3 = fVar.f28681i0;
        int[] iArr = r9.a.f24021c;
        TypedArray s5 = com.bumptech.glide.d.s(context3, attributeSet, iArr, com.plantcare.ai.identifier.plantid.R.attr.chipStyle, com.plantcare.ai.identifier.plantid.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        fVar.J0 = s5.hasValue(37);
        Context context4 = fVar.f28681i0;
        ColorStateList z10 = u0.z(context4, s5, 24);
        if (fVar.B != z10) {
            fVar.B = z10;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList z11 = u0.z(context4, s5, 11);
        if (fVar.C != z11) {
            fVar.C = z11;
            fVar.onStateChange(fVar.getState());
        }
        float dimension = s5.getDimension(19, 0.0f);
        if (fVar.D != dimension) {
            fVar.D = dimension;
            fVar.invalidateSelf();
            fVar.v();
        }
        if (s5.hasValue(12)) {
            fVar.B(s5.getDimension(12, 0.0f));
        }
        fVar.G(u0.z(context4, s5, 22));
        fVar.H(s5.getDimension(23, 0.0f));
        fVar.Q(u0.z(context4, s5, 36));
        String text = s5.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(fVar.I, text)) {
            fVar.I = text;
            fVar.f28687o0.f17253d = true;
            fVar.invalidateSelf();
            fVar.v();
        }
        s9.b bVar2 = null;
        if (s5.hasValue(0) && (resourceId3 = s5.getResourceId(0, 0)) != 0) {
            dVar = new ha.d(context4, resourceId3);
        } else {
            dVar = null;
        }
        dVar.f19001l = s5.getDimension(1, dVar.f19001l);
        fVar.R(dVar);
        int i10 = s5.getInt(3, 0);
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    fVar.G0 = TextUtils.TruncateAt.END;
                }
            } else {
                fVar.G0 = TextUtils.TruncateAt.MIDDLE;
            }
        } else {
            fVar.G0 = TextUtils.TruncateAt.START;
        }
        fVar.F(s5.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            fVar.F(s5.getBoolean(15, false));
        }
        fVar.C(u0.B(context4, s5, 14));
        if (s5.hasValue(17)) {
            fVar.E(u0.z(context4, s5, 17));
        }
        fVar.D(s5.getDimension(16, -1.0f));
        fVar.N(s5.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            fVar.N(s5.getBoolean(26, false));
        }
        fVar.I(u0.B(context4, s5, 25));
        fVar.M(u0.z(context4, s5, 30));
        fVar.K(s5.getDimension(28, 0.0f));
        fVar.x(s5.getBoolean(6, false));
        fVar.A(s5.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            fVar.A(s5.getBoolean(8, false));
        }
        fVar.y(u0.B(context4, s5, 7));
        if (s5.hasValue(9)) {
            fVar.z(u0.z(context4, s5, 9));
        }
        if (s5.hasValue(39) && (resourceId2 = s5.getResourceId(39, 0)) != 0) {
            bVar = s9.b.a(context4, resourceId2);
        } else {
            bVar = null;
        }
        fVar.Y = bVar;
        if (s5.hasValue(33) && (resourceId = s5.getResourceId(33, 0)) != 0) {
            bVar2 = s9.b.a(context4, resourceId);
        }
        fVar.Z = bVar2;
        float dimension2 = s5.getDimension(21, 0.0f);
        if (fVar.f28673a0 != dimension2) {
            fVar.f28673a0 = dimension2;
            fVar.invalidateSelf();
            fVar.v();
        }
        fVar.P(s5.getDimension(35, 0.0f));
        fVar.O(s5.getDimension(34, 0.0f));
        float dimension3 = s5.getDimension(41, 0.0f);
        if (fVar.f28676d0 != dimension3) {
            fVar.f28676d0 = dimension3;
            fVar.invalidateSelf();
            fVar.v();
        }
        float dimension4 = s5.getDimension(40, 0.0f);
        if (fVar.f28677e0 != dimension4) {
            fVar.f28677e0 = dimension4;
            fVar.invalidateSelf();
            fVar.v();
        }
        fVar.L(s5.getDimension(29, 0.0f));
        fVar.J(s5.getDimension(27, 0.0f));
        float dimension5 = s5.getDimension(13, 0.0f);
        if (fVar.f28680h0 != dimension5) {
            fVar.f28680h0 = dimension5;
            fVar.invalidateSelf();
            fVar.v();
        }
        fVar.I0 = s5.getDimensionPixelSize(4, Integer.MAX_VALUE);
        s5.recycle();
        TypedArray s10 = com.bumptech.glide.d.s(context2, attributeSet, iArr, com.plantcare.ai.identifier.plantid.R.attr.chipStyle, com.plantcare.ai.identifier.plantid.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        this.f11651p = s10.getBoolean(32, false);
        this.f11653r = (int) Math.ceil(s10.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        s10.recycle();
        setChipDrawable(fVar);
        fVar.j(ViewCompat.getElevation(this));
        TypedArray s11 = com.bumptech.glide.d.s(context2, attributeSet, iArr, com.plantcare.ai.identifier.plantid.R.attr.chipStyle, com.plantcare.ai.identifier.plantid.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        boolean hasValue = s11.hasValue(37);
        s11.recycle();
        this.f11655t = new d(this, this);
        d();
        if (!hasValue) {
            setOutlineProvider(new c(this));
        }
        setChecked(this.f11647l);
        setText(fVar.I);
        setEllipsize(fVar.G0);
        g();
        if (!this.f11642g.H0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.f11651p) {
            setMinHeight(this.f11653r);
        }
        this.f11652q = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: z9.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = Chip.this.f11646k;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z12);
                }
            }
        });
    }

    @NonNull
    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f11657w;
        rectF.setEmpty();
        if (c() && this.f11645j != null) {
            f fVar = this.f11642g;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.U()) {
                float f10 = fVar.f28680h0 + fVar.f28679g0 + fVar.S + fVar.f28678f0 + fVar.f28677e0;
                if (h0.b.a(fVar) == 0) {
                    float f11 = bounds.right;
                    rectF.right = f11;
                    rectF.left = f11 - f10;
                } else {
                    float f12 = bounds.left;
                    rectF.left = f12;
                    rectF.right = f12 + f10;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i10 = (int) closeIconTouchBounds.left;
        int i11 = (int) closeIconTouchBounds.top;
        int i12 = (int) closeIconTouchBounds.right;
        int i13 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f11656v;
        rect.set(i10, i11, i12, i13);
        return rect;
    }

    @Nullable
    private ha.d getTextAppearance() {
        f fVar = this.f11642g;
        if (fVar != null) {
            return fVar.f28687o0.f17255f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f11649n != z10) {
            this.f11649n = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f11648m != z10) {
            this.f11648m = z10;
            refreshDrawableState();
        }
    }

    public final void b(int i10) {
        int i11;
        this.f11653r = i10;
        int i12 = 0;
        if (!this.f11651p) {
            InsetDrawable insetDrawable = this.f11643h;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.f11643h = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr = ia.a.a;
                    e();
                    return;
                }
                return;
            }
            int[] iArr2 = ia.a.a;
            e();
            return;
        }
        int max = Math.max(0, i10 - ((int) this.f11642g.D));
        int max2 = Math.max(0, i10 - this.f11642g.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f11643h;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.f11643h = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr3 = ia.a.a;
                    e();
                    return;
                }
                return;
            }
            int[] iArr4 = ia.a.a;
            e();
            return;
        }
        if (max2 > 0) {
            i11 = max2 / 2;
        } else {
            i11 = 0;
        }
        if (max > 0) {
            i12 = max / 2;
        }
        int i13 = i12;
        if (this.f11643h != null) {
            Rect rect = new Rect();
            this.f11643h.getPadding(rect);
            if (rect.top == i13 && rect.bottom == i13 && rect.left == i11 && rect.right == i11) {
                int[] iArr5 = ia.a.a;
                e();
                return;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        this.f11643h = new InsetDrawable((Drawable) this.f11642g, i11, i13, i11, i13);
        int[] iArr6 = ia.a.a;
        e();
    }

    public final boolean c() {
        f fVar = this.f11642g;
        if (fVar != null) {
            Object obj = fVar.P;
            if (obj != null) {
                if (obj instanceof g) {
                    ((h) ((g) obj)).getClass();
                    obj = null;
                }
            } else {
                obj = null;
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        boolean z10;
        if (c()) {
            f fVar = this.f11642g;
            if (fVar != null && fVar.O) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && this.f11645j != null) {
                ViewCompat.setAccessibilityDelegate(this, this.f11655t);
                this.u = true;
                return;
            }
        }
        ViewCompat.setAccessibilityDelegate(this, null);
        this.u = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
    
        if (r1 != Integer.MIN_VALUE) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            boolean r0 = r10.u
            if (r0 != 0) goto L9
            boolean r11 = super.dispatchHoverEvent(r11)
            return r11
        L9:
            z9.d r0 = r10.f11655t
            android.view.accessibility.AccessibilityManager r1 = r0.f28666h
            boolean r2 = r1.isEnabled()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L70
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1c
            goto L70
        L1c:
            int r1 = r11.getAction()
            r2 = 256(0x100, float:3.59E-43)
            r5 = 128(0x80, float:1.8E-43)
            r6 = 7
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r6) goto L42
            r6 = 9
            if (r1 == r6) goto L42
            r6 = 10
            if (r1 == r6) goto L32
            goto L70
        L32:
            int r1 = r0.f28671m
            if (r1 == r7) goto L70
            if (r1 != r7) goto L39
            goto L6e
        L39:
            r0.f28671m = r7
            r0.q(r7, r5)
            r0.q(r1, r2)
            goto L6e
        L42:
            float r1 = r11.getX()
            float r6 = r11.getY()
            com.google.android.material.chip.Chip r8 = r0.f28672n
            boolean r9 = r8.c()
            if (r9 == 0) goto L5e
            android.graphics.RectF r8 = r8.getCloseIconTouchBounds()
            boolean r1 = r8.contains(r1, r6)
            if (r1 == 0) goto L5e
            r1 = r3
            goto L5f
        L5e:
            r1 = r4
        L5f:
            int r6 = r0.f28671m
            if (r6 != r1) goto L64
            goto L6c
        L64:
            r0.f28671m = r1
            r0.q(r1, r5)
            r0.q(r6, r2)
        L6c:
            if (r1 == r7) goto L70
        L6e:
            r0 = r3
            goto L71
        L70:
            r0 = r4
        L71:
            if (r0 != 0) goto L7b
            boolean r11 = super.dispatchHoverEvent(r11)
            if (r11 == 0) goto L7a
            goto L7b
        L7a:
            r3 = r4
        L7b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.u) {
            return super.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.f11655t;
        dVar.getClass();
        boolean z10 = false;
        int i10 = 0;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i11 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode != 19) {
                                    if (keyCode != 21) {
                                        if (keyCode != 22) {
                                            i11 = 130;
                                        }
                                    } else {
                                        i11 = 17;
                                    }
                                } else {
                                    i11 = 33;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z11 = false;
                                while (i10 < repeatCount && dVar.m(i11, null)) {
                                    i10++;
                                    z11 = true;
                                }
                                z10 = z11;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i12 = dVar.f28670l;
                    if (i12 != Integer.MIN_VALUE) {
                        Chip chip = dVar.f28672n;
                        if (i12 == 0) {
                            chip.performClick();
                        } else if (i12 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f11645j;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.u) {
                                chip.f11655t.q(1, 1);
                            }
                        }
                    }
                    z10 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z10 = dVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z10 = dVar.m(1, null);
            }
        }
        if (z10 && dVar.f28670l != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.s, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i10;
        super.drawableStateChanged();
        f fVar = this.f11642g;
        boolean z10 = false;
        if (fVar != null && f.u(fVar.P)) {
            f fVar2 = this.f11642g;
            ?? isEnabled = isEnabled();
            int i11 = isEnabled;
            if (this.f11650o) {
                i11 = isEnabled + 1;
            }
            int i12 = i11;
            if (this.f11649n) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (this.f11648m) {
                i13 = i12 + 1;
            }
            int i14 = i13;
            if (isChecked()) {
                i14 = i13 + 1;
            }
            int[] iArr = new int[i14];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (this.f11650o) {
                iArr[i10] = 16842908;
                i10++;
            }
            if (this.f11649n) {
                iArr[i10] = 16843623;
                i10++;
            }
            if (this.f11648m) {
                iArr[i10] = 16842919;
                i10++;
            }
            if (isChecked()) {
                iArr[i10] = 16842913;
            }
            if (!Arrays.equals(fVar2.C0, iArr)) {
                fVar2.C0 = iArr;
                if (fVar2.U()) {
                    z10 = fVar2.w(fVar2.getState(), iArr);
                }
            }
        }
        if (z10) {
            invalidate();
        }
    }

    public final void e() {
        this.f11644i = new RippleDrawable(ia.a.a(this.f11642g.H), getBackgroundDrawable(), null);
        f fVar = this.f11642g;
        if (fVar.D0) {
            fVar.D0 = false;
            fVar.E0 = null;
            fVar.onStateChange(fVar.getState());
        }
        setBackground(this.f11644i);
        f();
    }

    public final void f() {
        f fVar;
        if (!TextUtils.isEmpty(getText()) && (fVar = this.f11642g) != null) {
            int r6 = (int) (fVar.r() + fVar.f28680h0 + fVar.f28677e0);
            f fVar2 = this.f11642g;
            int q10 = (int) (fVar2.q() + fVar2.f28673a0 + fVar2.f28676d0);
            if (this.f11643h != null) {
                Rect rect = new Rect();
                this.f11643h.getPadding(rect);
                q10 += rect.left;
                r6 += rect.right;
            }
            setPaddingRelative(q10, getPaddingTop(), r6, getPaddingBottom());
        }
    }

    public final void g() {
        TextPaint paint = getPaint();
        f fVar = this.f11642g;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        ha.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.f11658x);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        boolean z10;
        if (!TextUtils.isEmpty(this.f11654s)) {
            return this.f11654s;
        }
        f fVar = this.f11642g;
        if (fVar != null && fVar.U) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            getParent();
            return "android.widget.Button";
        }
        if (isClickable()) {
            return "android.widget.Button";
        }
        return "android.view.View";
    }

    @Nullable
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f11643h;
        if (insetDrawable == null) {
            return this.f11642g;
        }
        return insetDrawable;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        f fVar = this.f11642g;
        if (fVar != null) {
            return fVar.W;
        }
        return null;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        f fVar = this.f11642g;
        if (fVar != null) {
            return fVar.X;
        }
        return null;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        f fVar = this.f11642g;
        if (fVar != null) {
            return fVar.C;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.f11642g;
        if (fVar != null) {
            return Math.max(0.0f, fVar.s());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f11642g;
    }

    public float getChipEndPadding() {
        f fVar = this.f11642g;
        if (fVar != null) {
            return fVar.f28680h0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.f11642g;
        if (fVar == null || (drawable = fVar.K) == 0) {
            return null;
        }
        if (drawable instanceof g) {
            ((h) ((g) drawable)).getClass();
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        f fVar = this.f11642g;
        if (fVar != null) {
            return fVar.M;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        f fVar = this.f11642g;
        if (fVar != null) {
            return fVar.L;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.f11642g;
        if (fVar != null) {
            return fVar.D;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.f11642g;
        if (fVar != null) {
            return fVar.f28673a0;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        f fVar = this.f11642g;
        if (fVar != null) {
            return fVar.F;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.f11642g;
        if (fVar != null) {
            return fVar.G;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public Drawable getCloseIcon() {
        Drawable drawable;
        f fVar = this.f11642g;
        if (fVar == null || (drawable = fVar.P) == 0) {
            return null;
        }
        if (drawable instanceof g) {
            ((h) ((g) drawable)).getClass();
            return null;
        }
        return drawable;
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        f fVar = this.f11642g;
        if (fVar != null) {
            return fVar.T;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.f11642g;
        if (fVar != null) {
            return fVar.f28679g0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.f11642g;
        if (fVar != null) {
            return fVar.S;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.f11642g;
        if (fVar != null) {
            return fVar.f28678f0;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        f fVar = this.f11642g;
        if (fVar != null) {
            return fVar.R;
        }
        return null;
    }

    @Override // android.widget.TextView
    @Nullable
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.f11642g;
        if (fVar != null) {
            return fVar.G0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.u) {
            d dVar = this.f11655t;
            if (dVar.f28670l == 1 || dVar.f28669k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Nullable
    public s9.b getHideMotionSpec() {
        f fVar = this.f11642g;
        if (fVar != null) {
            return fVar.Z;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.f11642g;
        if (fVar != null) {
            return fVar.f28675c0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.f11642g;
        if (fVar != null) {
            return fVar.f28674b0;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        f fVar = this.f11642g;
        if (fVar != null) {
            return fVar.H;
        }
        return null;
    }

    @NonNull
    public l getShapeAppearanceModel() {
        return this.f11642g.f20557b.a;
    }

    @Nullable
    public s9.b getShowMotionSpec() {
        f fVar = this.f11642g;
        if (fVar != null) {
            return fVar.Y;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.f11642g;
        if (fVar != null) {
            return fVar.f28677e0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.f11642g;
        if (fVar != null) {
            return fVar.f28676d0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u0.l0(this, this.f11642g);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        boolean z10;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f11641z);
        }
        f fVar = this.f11642g;
        if (fVar != null && fVar.U) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            View.mergeDrawableStates(onCreateDrawableState, A);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.u) {
            d dVar = this.f11655t;
            int i11 = dVar.f28670l;
            if (i11 != Integer.MIN_VALUE) {
                dVar.j(i11);
            }
            if (z10) {
                dVar.m(i10, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        f fVar = this.f11642g;
        if (fVar != null && fVar.U) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f11652q != i10) {
            this.f11652q = i10;
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L49
            if (r0 == r2) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L44
            goto L50
        L21:
            boolean r0 = r5.f11648m
            if (r0 == 0) goto L50
            if (r1 != 0) goto L4e
            r5.setCloseIconPressed(r3)
            goto L4e
        L2b:
            boolean r0 = r5.f11648m
            if (r0 == 0) goto L44
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f11645j
            if (r0 == 0) goto L39
            r0.onClick(r5)
        L39:
            boolean r0 = r5.u
            if (r0 == 0) goto L42
            z9.d r0 = r5.f11655t
            r0.q(r2, r2)
        L42:
            r0 = r2
            goto L45
        L44:
            r0 = r3
        L45:
            r5.setCloseIconPressed(r3)
            goto L51
        L49:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
        L4e:
            r0 = r2
            goto L51
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            r2 = r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(@Nullable CharSequence charSequence) {
        this.f11654s = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f11644i) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.s, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f11644i) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.s, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.x(z10);
        }
    }

    public void setCheckableResource(int i10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.x(fVar.f28681i0.getResources().getBoolean(i10));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        f fVar = this.f11642g;
        if (fVar == null) {
            this.f11647l = z10;
        } else if (fVar.U) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.y(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.y(com.bumptech.glide.c.t(fVar.f28681i0, i10));
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.z(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.z(d0.h.getColorStateList(fVar.f28681i0, i10));
        }
    }

    public void setCheckedIconVisible(int i10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.A(fVar.f28681i0.getResources().getBoolean(i10));
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        f fVar = this.f11642g;
        if (fVar != null && fVar.C != colorStateList) {
            fVar.C = colorStateList;
            fVar.onStateChange(fVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        ColorStateList colorStateList;
        f fVar = this.f11642g;
        if (fVar != null && fVar.C != (colorStateList = d0.h.getColorStateList(fVar.f28681i0, i10))) {
            fVar.C = colorStateList;
            fVar.onStateChange(fVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.B(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.B(fVar.f28681i0.getResources().getDimension(i10));
        }
    }

    public void setChipDrawable(@NonNull f fVar) {
        f fVar2 = this.f11642g;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.F0 = new WeakReference(null);
            }
            this.f11642g = fVar;
            fVar.H0 = false;
            fVar.F0 = new WeakReference(this);
            b(this.f11653r);
        }
    }

    public void setChipEndPadding(float f10) {
        f fVar = this.f11642g;
        if (fVar != null && fVar.f28680h0 != f10) {
            fVar.f28680h0 = f10;
            fVar.invalidateSelf();
            fVar.v();
        }
    }

    public void setChipEndPaddingResource(int i10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            float dimension = fVar.f28681i0.getResources().getDimension(i10);
            if (fVar.f28680h0 != dimension) {
                fVar.f28680h0 = dimension;
                fVar.invalidateSelf();
                fVar.v();
            }
        }
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.C(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.C(com.bumptech.glide.c.t(fVar.f28681i0, i10));
        }
    }

    public void setChipIconSize(float f10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.D(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.D(fVar.f28681i0.getResources().getDimension(i10));
        }
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.E(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.E(d0.h.getColorStateList(fVar.f28681i0, i10));
        }
    }

    public void setChipIconVisible(int i10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.F(fVar.f28681i0.getResources().getBoolean(i10));
        }
    }

    public void setChipMinHeight(float f10) {
        f fVar = this.f11642g;
        if (fVar != null && fVar.D != f10) {
            fVar.D = f10;
            fVar.invalidateSelf();
            fVar.v();
        }
    }

    public void setChipMinHeightResource(int i10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            float dimension = fVar.f28681i0.getResources().getDimension(i10);
            if (fVar.D != dimension) {
                fVar.D = dimension;
                fVar.invalidateSelf();
                fVar.v();
            }
        }
    }

    public void setChipStartPadding(float f10) {
        f fVar = this.f11642g;
        if (fVar != null && fVar.f28673a0 != f10) {
            fVar.f28673a0 = f10;
            fVar.invalidateSelf();
            fVar.v();
        }
    }

    public void setChipStartPaddingResource(int i10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            float dimension = fVar.f28681i0.getResources().getDimension(i10);
            if (fVar.f28673a0 != dimension) {
                fVar.f28673a0 = dimension;
                fVar.invalidateSelf();
                fVar.v();
            }
        }
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.G(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.G(d0.h.getColorStateList(fVar.f28681i0, i10));
        }
    }

    public void setChipStrokeWidth(float f10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.H(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.H(fVar.f28681i0.getResources().getDimension(i10));
        }
    }

    @Deprecated
    public void setChipText(@Nullable CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@StringRes int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.I(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        f fVar = this.f11642g;
        if (fVar != null && fVar.T != charSequence) {
            l0.b c10 = l0.b.c();
            fVar.T = c10.d(charSequence, c10.f21101c);
            fVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.J(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.J(fVar.f28681i0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconResource(int i10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.I(com.bumptech.glide.c.t(fVar.f28681i0, i10));
        }
        d();
    }

    public void setCloseIconSize(float f10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.K(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.K(fVar.f28681i0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.L(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.L(fVar.f28681i0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.M(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.M(d0.h.getColorStateList(fVar.f28681i0, i10));
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // androidx.appcompat.widget.s, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // androidx.appcompat.widget.s, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f10) {
        super.setElevation(f10);
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.j(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f11642g == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            f fVar = this.f11642g;
            if (fVar != null) {
                fVar.G0 = truncateAt;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f11651p = z10;
        b(this.f11653r);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(@Nullable s9.b bVar) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.Z = bVar;
        }
    }

    public void setHideMotionSpecResource(int i10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.Z = s9.b.a(fVar.f28681i0, i10);
        }
    }

    public void setIconEndPadding(float f10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.O(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.O(fVar.f28681i0.getResources().getDimension(i10));
        }
    }

    public void setIconStartPadding(float f10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.P(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.P(fVar.f28681i0.getResources().getDimension(i10));
        }
    }

    public void setInternalOnCheckedChangeListener(@Nullable ea.e eVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f11642g == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 <= 1) {
            super.setLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 <= 1) {
            super.setMaxLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.I0 = i10;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 <= 1) {
            super.setMinLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f11646k = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f11645j = onClickListener;
        d();
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.Q(colorStateList);
        }
        if (!this.f11642g.D0) {
            e();
        }
    }

    public void setRippleColorResource(int i10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.Q(d0.h.getColorStateList(fVar.f28681i0, i10));
            if (!this.f11642g.D0) {
                e();
            }
        }
    }

    @Override // ka.x
    public void setShapeAppearanceModel(@NonNull l lVar) {
        this.f11642g.setShapeAppearanceModel(lVar);
    }

    public void setShowMotionSpec(@Nullable s9.b bVar) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.Y = bVar;
        }
    }

    public void setShowMotionSpecResource(int i10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.Y = s9.b.a(fVar.f28681i0, i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (z10) {
            super.setSingleLine(z10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        f fVar = this.f11642g;
        if (fVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (fVar.H0) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        super.setText(charSequence2, bufferType);
        f fVar2 = this.f11642g;
        if (fVar2 != null && !TextUtils.equals(fVar2.I, charSequence)) {
            fVar2.I = charSequence;
            fVar2.f28687o0.f17253d = true;
            fVar2.invalidateSelf();
            fVar2.v();
        }
    }

    public void setTextAppearance(@Nullable ha.d dVar) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.R(dVar);
        }
        g();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        f fVar = this.f11642g;
        if (fVar != null && fVar.f28677e0 != f10) {
            fVar.f28677e0 = f10;
            fVar.invalidateSelf();
            fVar.v();
        }
    }

    public void setTextEndPaddingResource(int i10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            float dimension = fVar.f28681i0.getResources().getDimension(i10);
            if (fVar.f28677e0 != dimension) {
                fVar.f28677e0 = dimension;
                fVar.invalidateSelf();
                fVar.v();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        f fVar = this.f11642g;
        if (fVar != null) {
            float applyDimension = TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics());
            i iVar = fVar.f28687o0;
            ha.d dVar = iVar.f17255f;
            if (dVar != null) {
                dVar.f19001l = applyDimension;
                iVar.a.setTextSize(applyDimension);
                fVar.v();
                fVar.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f10) {
        f fVar = this.f11642g;
        if (fVar != null && fVar.f28676d0 != f10) {
            fVar.f28676d0 = f10;
            fVar.invalidateSelf();
            fVar.v();
        }
    }

    public void setTextStartPaddingResource(int i10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            float dimension = fVar.f28681i0.getResources().getDimension(i10);
            if (fVar.f28676d0 != dimension) {
                fVar.f28676d0 = dimension;
                fVar.invalidateSelf();
                fVar.v();
            }
        }
    }

    public void setCloseIconVisible(boolean z10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.N(z10);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.A(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.F(z10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.R(new ha.d(fVar.f28681i0, i10));
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        f fVar = this.f11642g;
        if (fVar != null) {
            fVar.R(new ha.d(fVar.f28681i0, i10));
        }
        g();
    }
}
