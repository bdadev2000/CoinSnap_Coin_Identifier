package y9;

import a4.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
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
import androidx.appcompat.widget.i3;
import androidx.appcompat.widget.s;
import c6.k;
import com.plantcare.ai.identifier.plantid.R;
import f0.i;
import f0.q;
import g2.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import v8.u0;

/* loaded from: classes3.dex */
public final class c extends s {
    public static final int[] A = {R.attr.state_indeterminate};
    public static final int[] B = {R.attr.state_error};
    public static final int[][] C = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int D = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashSet f28124g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashSet f28125h;

    /* renamed from: i, reason: collision with root package name */
    public ColorStateList f28126i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f28127j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f28128k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f28129l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f28130m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f28131n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f28132o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f28133p;

    /* renamed from: q, reason: collision with root package name */
    public ColorStateList f28134q;

    /* renamed from: r, reason: collision with root package name */
    public ColorStateList f28135r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuff.Mode f28136s;

    /* renamed from: t, reason: collision with root package name */
    public int f28137t;
    public int[] u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f28138v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f28139w;

    /* renamed from: x, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f28140x;

    /* renamed from: y, reason: collision with root package name */
    public final d f28141y;

    /* renamed from: z, reason: collision with root package name */
    public final a f28142z;

    public c(Context context, AttributeSet attributeSet) {
        super(p6.a.z(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        boolean z10;
        this.f28124g = new LinkedHashSet();
        this.f28125h = new LinkedHashSet();
        Context context2 = getContext();
        d dVar = new d(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = q.a;
        Drawable a = i.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        dVar.f17942b = a;
        a.setCallback(dVar.f17941h);
        new g2.c(dVar.f17942b.getConstantState());
        this.f28141y = dVar;
        this.f28142z = new a(this);
        Context context3 = getContext();
        this.f28131n = t0.c.a(this);
        this.f28134q = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = r9.a.f24032n;
        com.bumptech.glide.d.d(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        com.bumptech.glide.d.g(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        i3 i3Var = new i3(context3, context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox));
        this.f28132o = i3Var.e(2);
        if (this.f28131n != null && k.w(context3, R.attr.isMaterial3Theme, false)) {
            int i10 = i3Var.i(0, 0);
            int i11 = i3Var.i(1, 0);
            if (i10 == D && i11 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                super.setButtonDrawable((Drawable) null);
                this.f28131n = com.bumptech.glide.c.t(context3, R.drawable.mtrl_checkbox_button);
                this.f28133p = true;
                if (this.f28132o == null) {
                    this.f28132o = com.bumptech.glide.c.t(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f28135r = u0.A(context3, i3Var, 3);
        this.f28136s = u0.W(i3Var.h(4, -1), PorterDuff.Mode.SRC_IN);
        this.f28127j = i3Var.a(10, false);
        this.f28128k = i3Var.a(6, true);
        this.f28129l = i3Var.a(9, false);
        this.f28130m = i3Var.k(8);
        if (i3Var.l(7)) {
            setCheckedState(i3Var.h(7, 0));
        }
        i3Var.o();
        a();
    }

    @NonNull
    private String getButtonStateDescription() {
        int i10 = this.f28137t;
        if (i10 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        if (i10 == 0) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f28126i == null) {
            int x10 = u0.x(R.attr.colorControlActivated, this);
            int x11 = u0.x(R.attr.colorError, this);
            int x12 = u0.x(R.attr.colorSurface, this);
            int x13 = u0.x(R.attr.colorOnSurface, this);
            this.f28126i = new ColorStateList(C, new int[]{u0.O(1.0f, x12, x11), u0.O(1.0f, x12, x10), u0.O(0.54f, x12, x13), u0.O(0.38f, x12, x13), u0.O(0.38f, x12, x13)});
        }
        return this.f28126i;
    }

    @Nullable
    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f28134q;
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
        androidx.appcompat.widget.d dVar;
        Drawable drawable = this.f28131n;
        ColorStateList colorStateList3 = this.f28134q;
        PorterDuff.Mode b3 = t0.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b3 != null) {
                h0.a.i(drawable, b3);
            }
        }
        this.f28131n = drawable;
        Drawable drawable2 = this.f28132o;
        ColorStateList colorStateList4 = this.f28135r;
        PorterDuff.Mode mode = this.f28136s;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                h0.a.i(drawable2, mode);
            }
        }
        this.f28132o = drawable2;
        if (this.f28133p) {
            d dVar2 = this.f28141y;
            if (dVar2 != null) {
                Drawable drawable3 = dVar2.f17942b;
                a aVar = this.f28142z;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar.a == null) {
                        aVar.a = new g2.a(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.a);
                }
                ArrayList arrayList = dVar2.f17940g;
                g2.b bVar = dVar2.f17937c;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (dVar2.f17940g.size() == 0 && (dVar = dVar2.f17939f) != null) {
                        bVar.f17934b.removeListener(dVar);
                        dVar2.f17939f = null;
                    }
                }
                Drawable drawable4 = dVar2.f17942b;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar.a == null) {
                        aVar.a = new g2.a(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.a);
                } else if (aVar != null) {
                    if (dVar2.f17940g == null) {
                        dVar2.f17940g = new ArrayList();
                    }
                    if (!dVar2.f17940g.contains(aVar)) {
                        dVar2.f17940g.add(aVar);
                        if (dVar2.f17939f == null) {
                            dVar2.f17939f = new androidx.appcompat.widget.d(dVar2, 2);
                        }
                        bVar.f17934b.addListener(dVar2.f17939f);
                    }
                }
            }
            Drawable drawable5 = this.f28131n;
            if ((drawable5 instanceof AnimatedStateListDrawable) && dVar2 != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, dVar2, false);
                ((AnimatedStateListDrawable) this.f28131n).addTransition(R.id.indeterminate, R.id.unchecked, dVar2, false);
            }
        }
        Drawable drawable6 = this.f28131n;
        if (drawable6 != null && (colorStateList2 = this.f28134q) != null) {
            h0.a.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f28132o;
        if (drawable7 != null && (colorStateList = this.f28135r) != null) {
            h0.a.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f28131n;
        Drawable drawable9 = this.f28132o;
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
                float f10 = intrinsicWidth / intrinsicHeight;
                if (f10 >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f10);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f10 * intrinsicHeight);
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
        return this.f28131n;
    }

    @Nullable
    public Drawable getButtonIconDrawable() {
        return this.f28132o;
    }

    @Nullable
    public ColorStateList getButtonIconTintList() {
        return this.f28135r;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f28136s;
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public ColorStateList getButtonTintList() {
        return this.f28134q;
    }

    public int getCheckedState() {
        return this.f28137t;
    }

    @Nullable
    public CharSequence getErrorAccessibilityLabel() {
        return this.f28130m;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f28137t == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f28127j && this.f28134q == null && this.f28135r == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, A);
        }
        if (this.f28129l) {
            View.mergeDrawableStates(onCreateDrawableState, B);
        }
        int i11 = 0;
        while (true) {
            if (i11 < onCreateDrawableState.length) {
                int i12 = onCreateDrawableState[i11];
                if (i12 == 16842912) {
                    copyOf = onCreateDrawableState;
                    break;
                }
                if (i12 == 0) {
                    copyOf = (int[]) onCreateDrawableState.clone();
                    copyOf[i11] = 16842912;
                    break;
                }
                i11++;
            } else {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
        }
        this.u = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a;
        boolean z10;
        if (this.f28128k && TextUtils.isEmpty(getText()) && (a = t0.c.a(this)) != null) {
            int i10 = 1;
            if (getLayoutDirection() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i10 = -1;
            }
            int width = ((getWidth() - a.getIntrinsicWidth()) / 2) * i10;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = a.getBounds();
                h0.a.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f28129l) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f28130m));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f28123b);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f28123b = getCheckedState();
        return bVar;
    }

    @Override // androidx.appcompat.widget.s, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(com.bumptech.glide.c.t(getContext(), i10));
    }

    public void setButtonIconDrawable(@Nullable Drawable drawable) {
        this.f28132o = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(com.bumptech.glide.c.t(getContext(), i10));
    }

    public void setButtonIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.f28135r == colorStateList) {
            return;
        }
        this.f28135r = colorStateList;
        a();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f28136s == mode) {
            return;
        }
        this.f28136s = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(@Nullable ColorStateList colorStateList) {
        if (this.f28134q == colorStateList) {
            return;
        }
        this.f28134q = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f28128k = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        boolean z10;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f28137t != i10) {
            this.f28137t = i10;
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            super.setChecked(z10);
            refreshDrawableState();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30 && this.f28139w == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f28138v) {
                return;
            }
            this.f28138v = true;
            LinkedHashSet linkedHashSet = this.f28125h;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    j.t(it.next());
                    throw null;
                }
            }
            if (this.f28137t != 2 && (onCheckedChangeListener = this.f28140x) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i11 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f28138v = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
    }

    public void setErrorAccessibilityLabel(@Nullable CharSequence charSequence) {
        this.f28130m = charSequence;
    }

    public void setErrorAccessibilityLabelResource(@StringRes int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f28129l == z10) {
            return;
        }
        this.f28129l = z10;
        refreshDrawableState();
        Iterator it = this.f28124g.iterator();
        if (!it.hasNext()) {
            return;
        }
        j.t(it.next());
        throw null;
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f28140x = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    @RequiresApi(30)
    public void setStateDescription(@Nullable CharSequence charSequence) {
        this.f28139w = charSequence;
        if (charSequence == null) {
            if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
                super.setStateDescription(getButtonStateDescription());
                return;
            }
            return;
        }
        super.setStateDescription(charSequence);
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f28127j = z10;
        if (z10) {
            t0.b.c(this, getMaterialThemeColorsTintList());
        } else {
            t0.b.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.s, android.widget.CompoundButton
    public void setButtonDrawable(@Nullable Drawable drawable) {
        this.f28131n = drawable;
        this.f28133p = false;
        a();
    }
}
