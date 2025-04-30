package androidx.appcompat.widget;

import M.a;
import M0.C0211b;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.facebook.appevents.n;
import e1.f;
import g4.AbstractC2292b;
import j.AbstractC2379a;
import j0.j;
import l0.h;
import l5.k;
import n.C2468a;
import q.AbstractC2610l0;
import q.C2628v;
import q.O0;
import q.W;
import q.g1;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: T, reason: collision with root package name */
    public static final C0211b f4236T = new C0211b("thumbPos", 7, Float.class);

    /* renamed from: U, reason: collision with root package name */
    public static final int[] f4237U = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public final int f4238A;

    /* renamed from: B, reason: collision with root package name */
    public float f4239B;

    /* renamed from: C, reason: collision with root package name */
    public int f4240C;

    /* renamed from: D, reason: collision with root package name */
    public int f4241D;

    /* renamed from: E, reason: collision with root package name */
    public int f4242E;

    /* renamed from: F, reason: collision with root package name */
    public int f4243F;

    /* renamed from: G, reason: collision with root package name */
    public int f4244G;

    /* renamed from: H, reason: collision with root package name */
    public int f4245H;

    /* renamed from: I, reason: collision with root package name */
    public int f4246I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f4247J;

    /* renamed from: K, reason: collision with root package name */
    public final TextPaint f4248K;

    /* renamed from: L, reason: collision with root package name */
    public final ColorStateList f4249L;

    /* renamed from: M, reason: collision with root package name */
    public StaticLayout f4250M;

    /* renamed from: N, reason: collision with root package name */
    public StaticLayout f4251N;
    public final C2468a O;

    /* renamed from: P, reason: collision with root package name */
    public ObjectAnimator f4252P;

    /* renamed from: Q, reason: collision with root package name */
    public C2628v f4253Q;

    /* renamed from: R, reason: collision with root package name */
    public h f4254R;

    /* renamed from: S, reason: collision with root package name */
    public final Rect f4255S;
    public Drawable b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f4256c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f4257d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4258f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4259g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f4260h;

    /* renamed from: i, reason: collision with root package name */
    public ColorStateList f4261i;

    /* renamed from: j, reason: collision with root package name */
    public PorterDuff.Mode f4262j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4263k;
    public boolean l;
    public int m;

    /* renamed from: n, reason: collision with root package name */
    public int f4264n;

    /* renamed from: o, reason: collision with root package name */
    public int f4265o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4266p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f4267q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f4268r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f4269s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f4270t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4271u;

    /* renamed from: v, reason: collision with root package name */
    public int f4272v;

    /* renamed from: w, reason: collision with root package name */
    public final int f4273w;

    /* renamed from: x, reason: collision with root package name */
    public float f4274x;

    /* renamed from: y, reason: collision with root package name */
    public float f4275y;

    /* renamed from: z, reason: collision with root package name */
    public final VelocityTracker f4276z;

    /* JADX WARN: Type inference failed for: r0v15, types: [n.a, java.lang.Object] */
    public SwitchCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, com.tools.arruler.photomeasure.camera.ruler.R.attr.switchStyle);
        Typeface typeface;
        Typeface create;
        int i9;
        int resourceId;
        this.f4256c = null;
        this.f4257d = null;
        this.f4258f = false;
        this.f4259g = false;
        this.f4261i = null;
        this.f4262j = null;
        this.f4263k = false;
        this.l = false;
        this.f4276z = VelocityTracker.obtain();
        this.f4247J = true;
        this.f4255S = new Rect();
        O0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f4248K = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC2379a.f20960v;
        k i10 = k.i(context, attributeSet, iArr, com.tools.arruler.photomeasure.camera.ruler.R.attr.switchStyle, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, (TypedArray) i10.b, com.tools.arruler.photomeasure.camera.ruler.R.attr.switchStyle, 0);
        Drawable e4 = i10.e(2);
        this.b = e4;
        if (e4 != null) {
            e4.setCallback(this);
        }
        Drawable e9 = i10.e(11);
        this.f4260h = e9;
        if (e9 != null) {
            e9.setCallback(this);
        }
        TypedArray typedArray = (TypedArray) i10.b;
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f4271u = typedArray.getBoolean(3, true);
        this.m = typedArray.getDimensionPixelSize(8, 0);
        this.f4264n = typedArray.getDimensionPixelSize(5, 0);
        this.f4265o = typedArray.getDimensionPixelSize(6, 0);
        this.f4266p = typedArray.getBoolean(4, false);
        ColorStateList d2 = i10.d(9);
        if (d2 != null) {
            this.f4256c = d2;
            this.f4258f = true;
        }
        PorterDuff.Mode c9 = AbstractC2610l0.c(typedArray.getInt(10, -1), null);
        if (this.f4257d != c9) {
            this.f4257d = c9;
            this.f4259g = true;
        }
        if (this.f4258f || this.f4259g) {
            a();
        }
        ColorStateList d9 = i10.d(12);
        if (d9 != null) {
            this.f4261i = d9;
            this.f4263k = true;
        }
        PorterDuff.Mode c10 = AbstractC2610l0.c(typedArray.getInt(13, -1), null);
        if (this.f4262j != c10) {
            this.f4262j = c10;
            this.l = true;
        }
        if (this.f4263k || this.l) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC2379a.f20961w);
            ColorStateList colorStateList = (!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = I.h.getColorStateList(context, resourceId)) == null) ? obtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f4249L = colorStateList;
            } else {
                this.f4249L = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f9 = dimensionPixelSize;
                if (f9 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f9);
                    requestLayout();
                }
            }
            int i11 = obtainStyledAttributes.getInt(1, -1);
            int i12 = obtainStyledAttributes.getInt(2, -1);
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        typeface = null;
                    } else {
                        typeface = Typeface.MONOSPACE;
                    }
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.SANS_SERIF;
            }
            if (i12 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(i12);
                } else {
                    create = Typeface.create(typeface, i12);
                }
                setSwitchTypeface(create);
                if (create != null) {
                    i9 = create.getStyle();
                } else {
                    i9 = 0;
                }
                int i13 = (~i9) & i12;
                textPaint.setFakeBoldText((i13 & 1) != 0);
                textPaint.setTextSkewX((2 & i13) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                ?? obj = new Object();
                obj.f21817a = context2.getResources().getConfiguration().locale;
                this.O = obj;
            } else {
                this.O = null;
            }
            setTextOnInternal(this.f4267q);
            setTextOffInternal(this.f4269s);
            obtainStyledAttributes.recycle();
        }
        new W(this).f(attributeSet, com.tools.arruler.photomeasure.camera.ruler.R.attr.switchStyle);
        i10.j();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4273w = viewConfiguration.getScaledTouchSlop();
        this.f4238A = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, com.tools.arruler.photomeasure.camera.ruler.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    @NonNull
    private C2628v getEmojiTextViewHelper() {
        if (this.f4253Q == null) {
            this.f4253Q = new C2628v(this);
        }
        return this.f4253Q;
    }

    private boolean getTargetCheckedState() {
        if (this.f4239B > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        float f9;
        boolean z8 = g1.f22657a;
        if (getLayoutDirection() == 1) {
            f9 = 1.0f - this.f4239B;
        } else {
            f9 = this.f4239B;
        }
        return (int) ((f9 * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f4260h;
        if (drawable != null) {
            Rect rect2 = this.f4255S;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.b;
            if (drawable2 != null) {
                rect = AbstractC2610l0.b(drawable2);
            } else {
                rect = AbstractC2610l0.f22686c;
            }
            return ((((this.f4240C - this.f4242E) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f4269s = charSequence;
        C2628v emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod u8 = ((f) emojiTextViewHelper.b.b).u(this.O);
        if (u8 != null) {
            charSequence = u8.getTransformation(charSequence, this);
        }
        this.f4270t = charSequence;
        this.f4251N = null;
        if (this.f4271u) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f4267q = charSequence;
        C2628v emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod u8 = ((f) emojiTextViewHelper.b.b).u(this.O);
        if (u8 != null) {
            charSequence = u8.getTransformation(charSequence, this);
        }
        this.f4268r = charSequence;
        this.f4250M = null;
        if (this.f4271u) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.b;
        if (drawable != null) {
            if (this.f4258f || this.f4259g) {
                Drawable mutate = drawable.mutate();
                this.b = mutate;
                if (this.f4258f) {
                    a.h(mutate, this.f4256c);
                }
                if (this.f4259g) {
                    a.i(this.b, this.f4257d);
                }
                if (this.b.isStateful()) {
                    this.b.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f4260h;
        if (drawable != null) {
            if (this.f4263k || this.l) {
                Drawable mutate = drawable.mutate();
                this.f4260h = mutate;
                if (this.f4263k) {
                    a.h(mutate, this.f4261i);
                }
                if (this.l) {
                    a.i(this.f4260h, this.f4262j);
                }
                if (this.f4260h.isStateful()) {
                    this.f4260h.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f4267q);
        setTextOffInternal(this.f4269s);
        requestLayout();
    }

    public final void d() {
        if (this.f4254R == null && ((f) this.f4253Q.b.b).n() && j.f20971k != null) {
            j a6 = j.a();
            int b = a6.b();
            if (b == 3 || b == 0) {
                h hVar = new h(this);
                this.f4254R = hVar;
                a6.g(hVar);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        int i9;
        int i10;
        int i11 = this.f4243F;
        int i12 = this.f4244G;
        int i13 = this.f4245H;
        int i14 = this.f4246I;
        int thumbOffset = getThumbOffset() + i11;
        Drawable drawable = this.b;
        if (drawable != null) {
            rect = AbstractC2610l0.b(drawable);
        } else {
            rect = AbstractC2610l0.f22686c;
        }
        Drawable drawable2 = this.f4260h;
        Rect rect2 = this.f4255S;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i15 = rect2.left;
            thumbOffset += i15;
            if (rect != null) {
                int i16 = rect.left;
                if (i16 > i15) {
                    i11 += i16 - i15;
                }
                int i17 = rect.top;
                int i18 = rect2.top;
                if (i17 > i18) {
                    i9 = (i17 - i18) + i12;
                } else {
                    i9 = i12;
                }
                int i19 = rect.right;
                int i20 = rect2.right;
                if (i19 > i20) {
                    i13 -= i19 - i20;
                }
                int i21 = rect.bottom;
                int i22 = rect2.bottom;
                if (i21 > i22) {
                    i10 = i14 - (i21 - i22);
                    this.f4260h.setBounds(i11, i9, i13, i10);
                }
            } else {
                i9 = i12;
            }
            i10 = i14;
            this.f4260h.setBounds(i11, i9, i13, i10);
        }
        Drawable drawable3 = this.b;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i23 = thumbOffset - rect2.left;
            int i24 = thumbOffset + this.f4242E + rect2.right;
            this.b.setBounds(i23, i12, i24, i14);
            Drawable background = getBackground();
            if (background != null) {
                a.f(background, i23, i12, i24, i14);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f9, float f10) {
        super.drawableHotspotChanged(f9, f10);
        Drawable drawable = this.b;
        if (drawable != null) {
            a.e(drawable, f9, f10);
        }
        Drawable drawable2 = this.f4260h;
        if (drawable2 != null) {
            a.e(drawable2, f9, f10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        boolean z8;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.b;
        if (drawable != null && drawable.isStateful()) {
            z8 = drawable.setState(drawableState);
        } else {
            z8 = false;
        }
        Drawable drawable2 = this.f4260h;
        if (drawable2 != null && drawable2.isStateful()) {
            z8 |= drawable2.setState(drawableState);
        }
        if (z8) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z8 = g1.f22657a;
        if (getLayoutDirection() == 1) {
            int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f4240C;
            if (!TextUtils.isEmpty(getText())) {
                return compoundPaddingLeft + this.f4265o;
            }
            return compoundPaddingLeft;
        }
        return super.getCompoundPaddingLeft();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z8 = g1.f22657a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f4240C;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f4265o;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC2292b.q(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f4271u;
    }

    public boolean getSplitTrack() {
        return this.f4266p;
    }

    public int getSwitchMinWidth() {
        return this.f4264n;
    }

    public int getSwitchPadding() {
        return this.f4265o;
    }

    public CharSequence getTextOff() {
        return this.f4269s;
    }

    public CharSequence getTextOn() {
        return this.f4267q;
    }

    public Drawable getThumbDrawable() {
        return this.b;
    }

    public final float getThumbPosition() {
        return this.f4239B;
    }

    public int getThumbTextPadding() {
        return this.m;
    }

    @Nullable
    public ColorStateList getThumbTintList() {
        return this.f4256c;
    }

    @Nullable
    public PorterDuff.Mode getThumbTintMode() {
        return this.f4257d;
    }

    public Drawable getTrackDrawable() {
        return this.f4260h;
    }

    @Nullable
    public ColorStateList getTrackTintList() {
        return this.f4261i;
    }

    @Nullable
    public PorterDuff.Mode getTrackTintMode() {
        return this.f4262j;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4260h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f4252P;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f4252P.end();
            this.f4252P = null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i9) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i9 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f4237U);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f4260h;
        Rect rect = this.f4255S;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i9 = this.f4244G;
        int i10 = this.f4246I;
        int i11 = i9 + rect.top;
        int i12 = i10 - rect.bottom;
        Drawable drawable2 = this.b;
        if (drawable != null) {
            if (this.f4266p && drawable2 != null) {
                Rect b = AbstractC2610l0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b.left;
                rect.right -= b.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            staticLayout = this.f4250M;
        } else {
            staticLayout = this.f4251N;
        }
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f4249L;
            TextPaint textPaint = this.f4248K;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i11 + i12) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.f4267q;
            } else {
                charSequence = this.f4269s;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        int i13;
        int width;
        int i14;
        int i15;
        int i16;
        super.onLayout(z8, i9, i10, i11, i12);
        int i17 = 0;
        if (this.b != null) {
            Drawable drawable = this.f4260h;
            Rect rect = this.f4255S;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b = AbstractC2610l0.b(this.b);
            i13 = Math.max(0, b.left - rect.left);
            i17 = Math.max(0, b.right - rect.right);
        } else {
            i13 = 0;
        }
        boolean z9 = g1.f22657a;
        if (getLayoutDirection() == 1) {
            i14 = getPaddingLeft() + i13;
            width = ((this.f4240C + i14) - i13) - i17;
        } else {
            width = (getWidth() - getPaddingRight()) - i17;
            i14 = (width - this.f4240C) + i13 + i17;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                i16 = getPaddingTop();
                i15 = this.f4241D + i16;
            } else {
                i15 = getHeight() - getPaddingBottom();
                i16 = i15 - this.f4241D;
            }
        } else {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i18 = this.f4241D;
            int i19 = height - (i18 / 2);
            i15 = i18 + i19;
            i16 = i19;
        }
        this.f4243F = i14;
        this.f4244G = i16;
        this.f4246I = i15;
        this.f4245H = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 0;
        if (this.f4271u) {
            StaticLayout staticLayout = this.f4250M;
            TextPaint textPaint = this.f4248K;
            if (staticLayout == null) {
                CharSequence charSequence = this.f4268r;
                if (charSequence != null) {
                    i16 = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
                } else {
                    i16 = 0;
                }
                this.f4250M = new StaticLayout(charSequence, textPaint, i16, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f4251N == null) {
                CharSequence charSequence2 = this.f4270t;
                if (charSequence2 != null) {
                    i15 = (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint));
                } else {
                    i15 = 0;
                }
                this.f4251N = new StaticLayout(charSequence2, textPaint, i15, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.b;
        Rect rect = this.f4255S;
        if (drawable != null) {
            drawable.getPadding(rect);
            i11 = (this.b.getIntrinsicWidth() - rect.left) - rect.right;
            i12 = this.b.getIntrinsicHeight();
        } else {
            i11 = 0;
            i12 = 0;
        }
        if (this.f4271u) {
            i13 = (this.m * 2) + Math.max(this.f4250M.getWidth(), this.f4251N.getWidth());
        } else {
            i13 = 0;
        }
        this.f4242E = Math.max(i13, i11);
        Drawable drawable2 = this.f4260h;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i17 = this.f4260h.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i18 = rect.left;
        int i19 = rect.right;
        Drawable drawable3 = this.b;
        if (drawable3 != null) {
            Rect b = AbstractC2610l0.b(drawable3);
            i18 = Math.max(i18, b.left);
            i19 = Math.max(i19, b.right);
        }
        if (this.f4247J) {
            i14 = Math.max(this.f4264n, (this.f4242E * 2) + i18 + i19);
        } else {
            i14 = this.f4264n;
        }
        int max = Math.max(i17, i12);
        this.f4240C = i14;
        this.f4241D = max;
        super.onMeasure(i9, i10);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.f4267q;
        } else {
            charSequence = this.f4269s;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r1 != 3) goto L82;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z8) {
        super.setAllCaps(z8);
        getEmojiTextViewHelper().c(z8);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z8) {
        super.setChecked(z8);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                CharSequence charSequence = this.f4267q;
                if (charSequence == null) {
                    charSequence = getResources().getString(com.tools.arruler.photomeasure.camera.ruler.R.string.abc_capital_on);
                }
                ViewCompat.setStateDescription(this, charSequence);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence2 = this.f4269s;
            if (charSequence2 == null) {
                charSequence2 = getResources().getString(com.tools.arruler.photomeasure.camera.ruler.R.string.abc_capital_off);
            }
            ViewCompat.setStateDescription(this, charSequence2);
        }
        float f9 = 0.0f;
        if (getWindowToken() != null && isLaidOut()) {
            if (isChecked) {
                f9 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f4236T, f9);
            this.f4252P = ofFloat;
            ofFloat.setDuration(250L);
            this.f4252P.setAutoCancel(true);
            this.f4252P.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f4252P;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (isChecked) {
            f9 = 1.0f;
        }
        setThumbPosition(f9);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC2292b.r(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z8) {
        getEmojiTextViewHelper().d(z8);
        setTextOnInternal(this.f4267q);
        setTextOffInternal(this.f4269s);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z8) {
        this.f4247J = z8;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z8) {
        if (this.f4271u != z8) {
            this.f4271u = z8;
            requestLayout();
            if (z8) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z8) {
        this.f4266p = z8;
        invalidate();
    }

    public void setSwitchMinWidth(int i9) {
        this.f4264n = i9;
        requestLayout();
    }

    public void setSwitchPadding(int i9) {
        this.f4265o = i9;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f4248K;
        if ((textPaint.getTypeface() != null && !textPaint.getTypeface().equals(typeface)) || (textPaint.getTypeface() == null && typeface != null)) {
            textPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence2 = this.f4269s;
            if (charSequence2 == null) {
                charSequence2 = getResources().getString(com.tools.arruler.photomeasure.camera.ruler.R.string.abc_capital_off);
            }
            ViewCompat.setStateDescription(this, charSequence2);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence2 = this.f4267q;
            if (charSequence2 == null) {
                charSequence2 = getResources().getString(com.tools.arruler.photomeasure.camera.ruler.R.string.abc_capital_on);
            }
            ViewCompat.setStateDescription(this, charSequence2);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f9) {
        this.f4239B = f9;
        invalidate();
    }

    public void setThumbResource(int i9) {
        setThumbDrawable(n.g(getContext(), i9));
    }

    public void setThumbTextPadding(int i9) {
        this.m = i9;
        requestLayout();
    }

    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.f4256c = colorStateList;
        this.f4258f = true;
        a();
    }

    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        this.f4257d = mode;
        this.f4259g = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4260h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f4260h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i9) {
        setTrackDrawable(n.g(getContext(), i9));
    }

    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.f4261i = colorStateList;
        this.f4263k = true;
        b();
    }

    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        this.f4262j = mode;
        this.l = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.b && drawable != this.f4260h) {
            return false;
        }
        return true;
    }
}
