package na;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.d3;
import androidx.appcompat.widget.k2;
import com.google.android.material.textfield.TextInputLayout;
import com.plantcare.ai.identifier.plantid.R;
import java.util.List;
import java.util.Locale;
import v8.u0;

/* loaded from: classes3.dex */
public final class s extends androidx.appcompat.widget.q {

    /* renamed from: g, reason: collision with root package name */
    public final k2 f22690g;

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f22691h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f22692i;

    /* renamed from: j, reason: collision with root package name */
    public final int f22693j;

    /* renamed from: k, reason: collision with root package name */
    public final float f22694k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f22695l;

    /* renamed from: m, reason: collision with root package name */
    public int f22696m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f22697n;

    public s(Context context, AttributeSet attributeSet) {
        super(p6.a.z(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f22692i = new Rect();
        Context context2 = getContext();
        TypedArray s5 = com.bumptech.glide.d.s(context2, attributeSet, r9.a.f24027i, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (s5.hasValue(0) && s5.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f22693j = s5.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        int i10 = 1;
        this.f22694k = s5.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (s5.hasValue(2)) {
            this.f22695l = ColorStateList.valueOf(s5.getColor(2, 0));
        }
        this.f22696m = s5.getColor(4, 0);
        this.f22697n = u0.z(context2, s5, 5);
        this.f22691h = (AccessibilityManager) context2.getSystemService("accessibility");
        k2 k2Var = new k2(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f22690g = k2Var;
        k2Var.A = true;
        d0 d0Var = k2Var.B;
        d0Var.setFocusable(true);
        k2Var.f904q = this;
        d0Var.setInputMethodMode(2);
        k2Var.l(getAdapter());
        k2Var.f905r = new d3(this, i10);
        if (s5.hasValue(6)) {
            setSimpleItems(s5.getResourceId(6, 0));
        }
        s5.recycle();
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        boolean z10;
        boolean z11;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f22691h;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (z11) {
            return true;
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.f22690g.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @Nullable
    public ColorStateList getDropDownBackgroundTintList() {
        return this.f22695l;
    }

    @Override // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
        TextInputLayout b3 = b();
        if (b3 != null && b3.G) {
            return b3.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.f22694k;
    }

    public int getSimpleItemSelectedColor() {
        return this.f22696m;
    }

    @Nullable
    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f22697n;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextInputLayout b3 = b();
        if (b3 != null && b3.G && super.getHint() == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 == null) {
                str = "";
            } else {
                str = str2.toLowerCase(Locale.ENGLISH);
            }
            if (str.equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22690g.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int selectedItemPosition;
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b3 = b();
            int i12 = 0;
            if (adapter != null && b3 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                k2 k2Var = this.f22690g;
                if (!k2Var.a()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = k2Var.f892d.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int i13 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i12) {
                        view = null;
                        i12 = itemViewType;
                    }
                    view = adapter.getView(max, view, b3);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i13 = Math.max(i13, view.getMeasuredWidth());
                }
                Drawable e2 = k2Var.e();
                if (e2 != null) {
                    Rect rect = this.f22692i;
                    e2.getPadding(rect);
                    i13 += rect.left + rect.right;
                }
                i12 = b3.getEndIconView().getMeasuredWidth() + i13;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i12), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@Nullable T t5) {
        super.setAdapter(t5);
        this.f22690g.l(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        k2 k2Var = this.f22690g;
        if (k2Var != null) {
            k2Var.n(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i10) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i10));
    }

    public void setDropDownBackgroundTintList(@Nullable ColorStateList colorStateList) {
        this.f22695l = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof ka.i) {
            ((ka.i) dropDownBackground).k(this.f22695l);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f22690g.f906s = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        TextInputLayout b3 = b();
        if (b3 != null) {
            b3.s();
        }
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f22696m = i10;
        if (getAdapter() instanceof r) {
            ((r) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(@Nullable ColorStateList colorStateList) {
        this.f22697n = colorStateList;
        if (getAdapter() instanceof r) {
            ((r) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.f22690g.show();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new r(this, getContext(), this.f22693j, strArr));
    }
}
