package E3;

import K.i;
import K.o;
import L3.k;
import M0.C0219j;
import N0.e;
import N0.f;
import a.AbstractC0325a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import com.facebook.appevents.n;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import q.C2619q;
import w3.AbstractC2861a;

/* loaded from: classes2.dex */
public final class d extends C2619q {

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f1008A = {R.attr.state_indeterminate};

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f1009B = {R.attr.state_error};

    /* renamed from: C, reason: collision with root package name */
    public static final int[][] f1010C = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: D, reason: collision with root package name */
    public static final int f1011D = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashSet f1012g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashSet f1013h;

    /* renamed from: i, reason: collision with root package name */
    public ColorStateList f1014i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1015j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1016k;
    public boolean l;
    public CharSequence m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f1017n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f1018o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1019p;

    /* renamed from: q, reason: collision with root package name */
    public ColorStateList f1020q;

    /* renamed from: r, reason: collision with root package name */
    public ColorStateList f1021r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuff.Mode f1022s;

    /* renamed from: t, reason: collision with root package name */
    public int f1023t;

    /* renamed from: u, reason: collision with root package name */
    public int[] f1024u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1025v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f1026w;

    /* renamed from: x, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f1027x;

    /* renamed from: y, reason: collision with root package name */
    public final f f1028y;

    /* renamed from: z, reason: collision with root package name */
    public final a f1029z;

    public d(Context context, AttributeSet attributeSet) {
        super(W3.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f1012g = new LinkedHashSet();
        this.f1013h = new LinkedHashSet();
        Context context2 = getContext();
        f fVar = new f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = o.f1632a;
        Drawable a6 = i.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        fVar.b = a6;
        a6.setCallback(fVar.f2028h);
        new e(fVar.b.getConstantState(), 0);
        this.f1028y = fVar;
        this.f1029z = new a(this);
        Context context3 = getContext();
        this.f1017n = Z.c.a(this);
        this.f1020q = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = AbstractC2861a.f23672n;
        k.a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        k.b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        l5.k kVar = new l5.k(context3, obtainStyledAttributes);
        this.f1018o = kVar.e(2);
        if (this.f1017n != null && AbstractC0325a.o(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f1011D && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f1017n = n.g(context3, R.drawable.mtrl_checkbox_button);
                this.f1019p = true;
                if (this.f1018o == null) {
                    this.f1018o = n.g(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f1021r = android.support.v4.media.session.a.q(context3, kVar, 3);
        this.f1022s = k.g(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f1015j = obtainStyledAttributes.getBoolean(10, false);
        this.f1016k = obtainStyledAttributes.getBoolean(6, true);
        this.l = obtainStyledAttributes.getBoolean(9, false);
        this.m = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        kVar.j();
        a();
    }

    @NonNull
    private String getButtonStateDescription() {
        int i9 = this.f1023t;
        if (i9 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        if (i9 == 0) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f1014i == null) {
            int q9 = C0219j.q(this, R.attr.colorControlActivated);
            int q10 = C0219j.q(this, R.attr.colorError);
            int q11 = C0219j.q(this, R.attr.colorSurface);
            int q12 = C0219j.q(this, R.attr.colorOnSurface);
            this.f1014i = new ColorStateList(f1010C, new int[]{C0219j.u(1.0f, q11, q10), C0219j.u(1.0f, q11, q9), C0219j.u(0.54f, q11, q12), C0219j.u(0.38f, q11, q12), C0219j.u(0.38f, q11, q12)});
        }
        return this.f1014i;
    }

    @Nullable
    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f1020q;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        B3.c cVar;
        Drawable drawable = this.f1017n;
        ColorStateList colorStateList3 = this.f1020q;
        PorterDuff.Mode b = Z.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b != null) {
                M.a.i(drawable, b);
            }
        }
        this.f1017n = drawable;
        Drawable drawable2 = this.f1018o;
        ColorStateList colorStateList4 = this.f1021r;
        PorterDuff.Mode mode = this.f1022s;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                M.a.i(drawable2, mode);
            }
        }
        this.f1018o = drawable2;
        if (this.f1019p) {
            f fVar = this.f1028y;
            if (fVar != null) {
                Drawable drawable3 = fVar.b;
                a aVar = this.f1029z;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar.f1006a == null) {
                        aVar.f1006a = new N0.b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f1006a);
                }
                ArrayList arrayList = fVar.f2027g;
                N0.d dVar = fVar.f2024c;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (fVar.f2027g.size() == 0 && (cVar = fVar.f2026f) != null) {
                        dVar.b.removeListener(cVar);
                        fVar.f2026f = null;
                    }
                }
                Drawable drawable4 = fVar.b;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar.f1006a == null) {
                        aVar.f1006a = new N0.b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f1006a);
                } else if (aVar != null) {
                    if (fVar.f2027g == null) {
                        fVar.f2027g = new ArrayList();
                    }
                    if (!fVar.f2027g.contains(aVar)) {
                        fVar.f2027g.add(aVar);
                        if (fVar.f2026f == null) {
                            fVar.f2026f = new B3.c(fVar, 3);
                        }
                        dVar.b.addListener(fVar.f2026f);
                    }
                }
            }
            Drawable drawable5 = this.f1017n;
            if ((drawable5 instanceof AnimatedStateListDrawable) && fVar != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, fVar, false);
                ((AnimatedStateListDrawable) this.f1017n).addTransition(R.id.indeterminate, R.id.unchecked, fVar, false);
            }
        }
        Drawable drawable6 = this.f1017n;
        if (drawable6 != null && (colorStateList2 = this.f1020q) != null) {
            M.a.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f1018o;
        if (drawable7 != null && (colorStateList = this.f1021r) != null) {
            M.a.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f1017n;
        Drawable drawable9 = this.f1018o;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f9 = intrinsicWidth / intrinsicHeight;
                if (f9 >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f9);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f9 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public Drawable getButtonDrawable() {
        return this.f1017n;
    }

    @Nullable
    public Drawable getButtonIconDrawable() {
        return this.f1018o;
    }

    @Nullable
    public ColorStateList getButtonIconTintList() {
        return this.f1021r;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f1022s;
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public ColorStateList getButtonTintList() {
        return this.f1020q;
    }

    public int getCheckedState() {
        return this.f1023t;
    }

    @Nullable
    public CharSequence getErrorAccessibilityLabel() {
        return this.m;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        if (this.f1023t == 1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1015j && this.f1020q == null && this.f1021r == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i9) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i9 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f1008A);
        }
        if (this.l) {
            View.mergeDrawableStates(onCreateDrawableState, f1009B);
        }
        int i10 = 0;
        while (true) {
            if (i10 < onCreateDrawableState.length) {
                int i11 = onCreateDrawableState[i10];
                if (i11 == 16842912) {
                    copyOf = onCreateDrawableState;
                    break;
                }
                if (i11 == 0) {
                    copyOf = (int[]) onCreateDrawableState.clone();
                    copyOf[i10] = 16842912;
                    break;
                }
                i10++;
            } else {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
        }
        this.f1024u = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a6;
        int i9;
        if (this.f1016k && TextUtils.isEmpty(getText()) && (a6 = Z.c.a(this)) != null) {
            if (k.e(this)) {
                i9 = -1;
            } else {
                i9 = 1;
            }
            int width = ((getWidth() - a6.getIntrinsicWidth()) / 2) * i9;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = a6.getBounds();
                M.a.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.l) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.m));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        setCheckedState(cVar.b);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, E3.c, android.os.Parcelable] */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.b = getCheckedState();
        return baseSavedState;
    }

    @Override // q.C2619q, android.widget.CompoundButton
    public void setButtonDrawable(int i9) {
        setButtonDrawable(n.g(getContext(), i9));
    }

    public void setButtonIconDrawable(@Nullable Drawable drawable) {
        this.f1018o = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i9) {
        setButtonIconDrawable(n.g(getContext(), i9));
    }

    public void setButtonIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.f1021r == colorStateList) {
            return;
        }
        this.f1021r = colorStateList;
        a();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f1022s == mode) {
            return;
        }
        this.f1022s = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(@Nullable ColorStateList colorStateList) {
        if (this.f1020q == colorStateList) {
            return;
        }
        this.f1020q = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z8) {
        this.f1016k = z8;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z8) {
        setCheckedState(z8 ? 1 : 0);
    }

    public void setCheckedState(int i9) {
        boolean z8;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f1023t != i9) {
            this.f1023t = i9;
            if (i9 == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            super.setChecked(z8);
            refreshDrawableState();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && this.f1026w == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f1025v) {
                return;
            }
            this.f1025v = true;
            LinkedHashSet linkedHashSet = this.f1013h;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    com.mbridge.msdk.foundation.entity.o.v(it.next());
                    throw null;
                }
            }
            if (this.f1023t != 2 && (onCheckedChangeListener = this.f1027x) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i10 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f1025v = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
    }

    public void setErrorAccessibilityLabel(@Nullable CharSequence charSequence) {
        this.m = charSequence;
    }

    public void setErrorAccessibilityLabelResource(@StringRes int i9) {
        CharSequence charSequence;
        if (i9 != 0) {
            charSequence = getResources().getText(i9);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z8) {
        if (this.l == z8) {
            return;
        }
        this.l = z8;
        refreshDrawableState();
        Iterator it = this.f1012g.iterator();
        if (!it.hasNext()) {
            return;
        }
        com.mbridge.msdk.foundation.entity.o.v(it.next());
        throw null;
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f1027x = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    @RequiresApi(com.vungle.ads.internal.protos.n.AD_PLAY_RESET_ON_DEINIT_VALUE)
    public void setStateDescription(@Nullable CharSequence charSequence) {
        this.f1026w = charSequence;
        if (charSequence == null) {
            if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
                super.setStateDescription(getButtonStateDescription());
                return;
            }
            return;
        }
        super.setStateDescription(charSequence);
    }

    public void setUseMaterialThemeColors(boolean z8) {
        this.f1015j = z8;
        if (z8) {
            Z.b.c(this, getMaterialThemeColorsTintList());
        } else {
            Z.b.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // q.C2619q, android.widget.CompoundButton
    public void setButtonDrawable(@Nullable Drawable drawable) {
        this.f1017n = drawable;
        this.f1019p = false;
        a();
    }
}
