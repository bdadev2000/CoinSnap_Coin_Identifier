package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.HelperWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class ConstraintHelper extends View {

    /* renamed from: a, reason: collision with root package name */
    public int[] f18191a;

    /* renamed from: b, reason: collision with root package name */
    public int f18192b;

    /* renamed from: c, reason: collision with root package name */
    public Context f18193c;
    public HelperWidget d;

    /* renamed from: f, reason: collision with root package name */
    public String f18194f;

    /* renamed from: g, reason: collision with root package name */
    public View[] f18195g;

    /* renamed from: h, reason: collision with root package name */
    public HashMap f18196h;

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.f18193c == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int g2 = g(trim);
        if (g2 != 0) {
            this.f18196h.put(Integer.valueOf(g2), trim);
            d(g2);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    public final void d(int i2) {
        if (i2 == getId()) {
            return;
        }
        int i3 = this.f18192b + 1;
        int[] iArr = this.f18191a;
        if (i3 > iArr.length) {
            this.f18191a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f18191a;
        int i4 = this.f18192b;
        iArr2[i4] = i2;
        this.f18192b = i4 + 1;
    }

    public final void e() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i2 = 0; i2 < this.f18192b; i2++) {
            View viewById = constraintLayout.getViewById(this.f18191a[i2]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f18193c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final int g(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i2 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                i2 = ((Integer) designInformation).intValue();
            }
        }
        if (i2 == 0 && constraintLayout != null) {
            i2 = f(constraintLayout, str);
        }
        if (i2 == 0) {
            try {
                i2 = R.id.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (i2 != 0) {
            return i2;
        }
        Context context = this.f18193c;
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f18191a, this.f18192b);
    }

    public final View[] h(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f18195g;
        if (viewArr == null || viewArr.length != this.f18192b) {
            this.f18195g = new View[this.f18192b];
        }
        for (int i2 = 0; i2 < this.f18192b; i2++) {
            this.f18195g[i2] = constraintLayout.getViewById(this.f18191a[i2]);
        }
        return this.f18195g;
    }

    public void i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f18327b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 19) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f18194f = string;
                    setIds(string);
                }
            }
        }
    }

    public void j(ConstraintWidget constraintWidget, boolean z2) {
    }

    public void k() {
    }

    public void l(ConstraintLayout constraintLayout) {
    }

    public final void m() {
        if (this.d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).f18219l0 = this.d;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f18194f;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f18194f = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f18192b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i2);
            if (indexOf == -1) {
                c(str.substring(i2));
                return;
            } else {
                c(str.substring(i2, indexOf));
                i2 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f18194f = null;
        this.f18192b = 0;
        for (int i2 : iArr) {
            d(i2);
        }
    }
}
