package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import b0.g;
import c6.k;
import com.bumptech.glide.d;
import com.bumptech.glide.e;
import com.plantcare.ai.identifier.plantid.R;
import java.util.ArrayList;
import java.util.Collections;
import k.o;
import ka.i;
import p6.a;
import v8.u0;

/* loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: b0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f11551b0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer T;
    public boolean U;
    public boolean V;
    public ImageView.ScaleType W;

    /* renamed from: a0, reason: collision with root package name */
    public Boolean f11552a0;

    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(a.z(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        ColorStateList n10;
        Context context2 = getContext();
        TypedArray s5 = d.s(context2, attributeSet, r9.a.f24037s, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (s5.hasValue(2)) {
            setNavigationIconTint(s5.getColor(2, -1));
        }
        this.U = s5.getBoolean(4, false);
        this.V = s5.getBoolean(3, false);
        int i10 = s5.getInt(1, -1);
        if (i10 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f11551b0;
            if (i10 < scaleTypeArr.length) {
                this.W = scaleTypeArr[i10];
            }
        }
        if (s5.hasValue(0)) {
            this.f11552a0 = Boolean.valueOf(s5.getBoolean(0, false));
        }
        s5.recycle();
        Drawable background = getBackground();
        if (background == null) {
            n10 = ColorStateList.valueOf(0);
        } else {
            n10 = k.n(background);
        }
        if (n10 != null) {
            i iVar = new i();
            iVar.k(n10);
            iVar.h(context2);
            iVar.j(ViewCompat.getElevation(this));
            setBackground(iVar);
        }
    }

    @Nullable
    public ImageView.ScaleType getLogoScaleType() {
        return this.W;
    }

    @Nullable
    public Integer getNavigationIconTint() {
        return this.T;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void k(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof o;
        if (z10) {
            ((o) menu).w();
        }
        super.k(i10);
        if (z10) {
            ((o) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof i) {
            u0.l0(this, (i) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        ImageView imageView2 = null;
        if (this.U || this.V) {
            ArrayList C = e.C(this, getTitle());
            boolean isEmpty = C.isEmpty();
            g gVar = e.f9644k;
            if (isEmpty) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(C, gVar);
            }
            ArrayList C2 = e.C(this, getSubtitle());
            if (C2.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(C2, gVar);
            }
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i15 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt = getChildAt(i16);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i15 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i15 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.U && textView != null) {
                    t(textView, pair);
                }
                if (this.V && textView2 != null) {
                    t(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i14 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i14);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i14++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f11552a0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.W;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f10) {
        super.setElevation(f10);
        Drawable background = getBackground();
        if (background instanceof i) {
            ((i) background).j(f10);
        }
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f11552a0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f11552a0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.W != scaleType) {
            this.W = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null && this.T != null) {
            drawable = drawable.mutate();
            h0.a.g(drawable, this.T.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.T = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.U != z10) {
            this.U = z10;
            requestLayout();
        }
    }

    public final void t(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i10 += max;
            i11 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i10, textView.getTop(), i11, textView.getBottom());
    }
}
