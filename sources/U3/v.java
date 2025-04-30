package U3;

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
import com.google.android.material.textfield.TextInputLayout;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.List;
import java.util.Locale;
import q.C0;
import q.C2615o;
import w3.AbstractC2861a;

/* loaded from: classes2.dex */
public final class v extends C2615o {

    /* renamed from: g, reason: collision with root package name */
    public final C0 f3224g;

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f3225h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f3226i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3227j;

    /* renamed from: k, reason: collision with root package name */
    public final float f3228k;
    public ColorStateList l;
    public int m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f3229n;

    public v(Context context, AttributeSet attributeSet) {
        super(W3.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f3226i = new Rect();
        Context context2 = getContext();
        TypedArray f9 = L3.k.f(context2, attributeSet, AbstractC2861a.f23669i, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (f9.hasValue(0) && f9.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f3227j = f9.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f3228k = f9.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (f9.hasValue(2)) {
            this.l = ColorStateList.valueOf(f9.getColor(2, 0));
        }
        this.m = f9.getColor(4, 0);
        this.f3229n = android.support.v4.media.session.a.p(context2, f9, 5);
        this.f3225h = (AccessibilityManager) context2.getSystemService("accessibility");
        C0 c02 = new C0(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f3224g = c02;
        c02.f22514A = true;
        c02.f22515B.setFocusable(true);
        c02.f22527q = this;
        c02.f22515B.setInputMethodMode(2);
        c02.o(getAdapter());
        c02.f22528r = new t(this, 0);
        if (f9.hasValue(6)) {
            setSimpleItems(f9.getResourceId(6, 0));
        }
        f9.recycle();
    }

    public static void a(v vVar, Object obj) {
        vVar.setText(vVar.convertSelectionToString(obj), false);
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
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f3225h;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) != null) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                    if (accessibilityServiceInfo.getSettingsActivityName() == null || !accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.f3224g.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @Nullable
    public ColorStateList getDropDownBackgroundTintList() {
        return this.l;
    }

    @Override // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
        TextInputLayout b = b();
        if (b != null && b.f14142G) {
            return b.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.f3228k;
    }

    public int getSimpleItemSelectedColor() {
        return this.m;
    }

    @Nullable
    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f3229n;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextInputLayout b = b();
        if (b != null && b.f14142G && super.getHint() == null) {
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
        this.f3224g.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i9, int i10) {
        int selectedItemPosition;
        super.onMeasure(i9, i10);
        if (View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b = b();
            int i11 = 0;
            if (adapter != null && b != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C0 c02 = this.f3224g;
                if (!c02.f22515B.isShowing()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = c02.f22517d.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int i12 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i11) {
                        view = null;
                        i11 = itemViewType;
                    }
                    view = adapter.getView(max, view, b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i12 = Math.max(i12, view.getMeasuredWidth());
                }
                Drawable background = c02.f22515B.getBackground();
                if (background != null) {
                    Rect rect = this.f3226i;
                    background.getPadding(rect);
                    i12 += rect.left + rect.right;
                }
                i11 = b.getEndIconView().getMeasuredWidth() + i12;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i11), View.MeasureSpec.getSize(i9)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z8) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z8);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@Nullable T t9) {
        super.setAdapter(t9);
        this.f3224g.o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C0 c02 = this.f3224g;
        if (c02 != null) {
            c02.i(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i9) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i9));
    }

    public void setDropDownBackgroundTintList(@Nullable ColorStateList colorStateList) {
        this.l = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof R3.g) {
            ((R3.g) dropDownBackground).k(this.l);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f3224g.f22529s = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i9) {
        super.setRawInputType(i9);
        TextInputLayout b = b();
        if (b != null) {
            b.s();
        }
    }

    public void setSimpleItemSelectedColor(int i9) {
        this.m = i9;
        if (getAdapter() instanceof u) {
            ((u) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(@Nullable ColorStateList colorStateList) {
        this.f3229n = colorStateList;
        if (getAdapter() instanceof u) {
            ((u) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i9) {
        setSimpleItems(getResources().getStringArray(i9));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.f3224g.show();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new u(this, getContext(), this.f3227j, strArr));
    }
}
