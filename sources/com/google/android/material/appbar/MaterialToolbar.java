package com.google.android.material.appbar;

import C5.c;
import F2.h;
import L3.k;
import R3.g;
import W3.a;
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
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.ArrayList;
import java.util.Collections;
import p.MenuC2533l;
import w3.AbstractC2861a;
import z2.i;

/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: b0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f13894b0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: T, reason: collision with root package name */
    public Integer f13895T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f13896U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f13897V;

    /* renamed from: W, reason: collision with root package name */
    public ImageView.ScaleType f13898W;

    /* renamed from: a0, reason: collision with root package name */
    public Boolean f13899a0;

    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        ColorStateList n2;
        Context context2 = getContext();
        TypedArray f9 = k.f(context2, attributeSet, AbstractC2861a.f23677s, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (f9.hasValue(2)) {
            setNavigationIconTint(f9.getColor(2, -1));
        }
        this.f13896U = f9.getBoolean(4, false);
        this.f13897V = f9.getBoolean(3, false);
        int i9 = f9.getInt(1, -1);
        if (i9 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f13894b0;
            if (i9 < scaleTypeArr.length) {
                this.f13898W = scaleTypeArr[i9];
            }
        }
        if (f9.hasValue(0)) {
            this.f13899a0 = Boolean.valueOf(f9.getBoolean(0, false));
        }
        f9.recycle();
        Drawable background = getBackground();
        if (background == null) {
            n2 = ColorStateList.valueOf(0);
        } else {
            n2 = h.n(background);
        }
        if (n2 != null) {
            g gVar = new g();
            gVar.k(n2);
            gVar.i(context2);
            gVar.j(ViewCompat.getElevation(this));
            ViewCompat.setBackground(this, gVar);
        }
    }

    @Nullable
    public ImageView.ScaleType getLogoScaleType() {
        return this.f13898W;
    }

    @Nullable
    public Integer getNavigationIconTint() {
        return this.f13895T;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i9) {
        Menu menu = getMenu();
        boolean z8 = menu instanceof MenuC2533l;
        if (z8) {
            ((MenuC2533l) menu).w();
        }
        super.m(i9);
        if (z8) {
            ((MenuC2533l) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            i.q(this, (g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z8, i9, i10, i11, i12);
        int i13 = 0;
        ImageView imageView2 = null;
        if (this.f13896U || this.f13897V) {
            ArrayList d2 = k.d(this, getTitle());
            boolean isEmpty = d2.isEmpty();
            c cVar = k.f1801c;
            if (isEmpty) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(d2, cVar);
            }
            ArrayList d9 = k.d(this, getSubtitle());
            if (d9.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(d9, cVar);
            }
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i14 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i14 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i14 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f13896U && textView != null) {
                    v(textView, pair);
                }
                if (this.f13897V && textView2 != null) {
                    v(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i13 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i13);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i13++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f13899a0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f13898W;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f9) {
        super.setElevation(f9);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).j(f9);
        }
    }

    public void setLogoAdjustViewBounds(boolean z8) {
        Boolean bool = this.f13899a0;
        if (bool == null || bool.booleanValue() != z8) {
            this.f13899a0 = Boolean.valueOf(z8);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.f13898W != scaleType) {
            this.f13898W = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null && this.f13895T != null) {
            drawable = drawable.mutate();
            M.a.g(drawable, this.f13895T.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i9) {
        this.f13895T = Integer.valueOf(i9);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z8) {
        if (this.f13897V != z8) {
            this.f13897V = z8;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z8) {
        if (this.f13896U != z8) {
            this.f13896U = z8;
            requestLayout();
        }
    }

    public final void v(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i9 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i10 = measuredWidth2 + i9;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i9, 0), Math.max(i10 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i9 += max;
            i10 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i10 - i9, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i9, textView.getTop(), i10, textView.getBottom());
    }
}
