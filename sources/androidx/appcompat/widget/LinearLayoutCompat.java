package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public boolean f736b;

    /* renamed from: c, reason: collision with root package name */
    public int f737c;

    /* renamed from: d, reason: collision with root package name */
    public int f738d;

    /* renamed from: f, reason: collision with root package name */
    public int f739f;

    /* renamed from: g, reason: collision with root package name */
    public int f740g;

    /* renamed from: h, reason: collision with root package name */
    public int f741h;

    /* renamed from: i, reason: collision with root package name */
    public float f742i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f743j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f744k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f745l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f746m;

    /* renamed from: n, reason: collision with root package name */
    public int f747n;

    /* renamed from: o, reason: collision with root package name */
    public int f748o;

    /* renamed from: p, reason: collision with root package name */
    public int f749p;

    /* renamed from: q, reason: collision with root package name */
    public int f750q;

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c2;
    }

    public final void f(Canvas canvas, int i10) {
        this.f746m.setBounds(getPaddingLeft() + this.f750q, i10, (getWidth() - getPaddingRight()) - this.f750q, this.f748o + i10);
        this.f746m.draw(canvas);
    }

    public final void g(Canvas canvas, int i10) {
        this.f746m.setBounds(i10, getPaddingTop() + this.f750q, this.f747n + i10, (getHeight() - getPaddingBottom()) - this.f750q);
        this.f746m.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f737c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f737c;
        if (childCount > i11) {
            View childAt = getChildAt(i11);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f737c == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i12 = this.f738d;
            if (this.f739f == 1 && (i10 = this.f740g & 112) != 48) {
                if (i10 != 16) {
                    if (i10 == 80) {
                        i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f741h;
                    }
                } else {
                    i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f741h) / 2;
                }
            }
            return i12 + ((LinearLayout.LayoutParams) ((c2) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f737c;
    }

    public Drawable getDividerDrawable() {
        return this.f746m;
    }

    public int getDividerPadding() {
        return this.f750q;
    }

    public int getDividerWidth() {
        return this.f747n;
    }

    public int getGravity() {
        return this.f740g;
    }

    public int getOrientation() {
        return this.f739f;
    }

    public int getShowDividers() {
        return this.f749p;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f742i;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public c2 generateDefaultLayoutParams() {
        int i10 = this.f739f;
        if (i10 == 0) {
            return new c2(-2);
        }
        if (i10 == 1) {
            return new c2(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public c2 generateLayoutParams(AttributeSet attributeSet) {
        return new c2(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public c2 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c2(layoutParams);
    }

    public final boolean k(int i10) {
        if (i10 == 0) {
            if ((this.f749p & 1) == 0) {
                return false;
            }
            return true;
        }
        if (i10 == getChildCount()) {
            if ((this.f749p & 4) == 0) {
                return false;
            }
            return true;
        }
        if ((this.f749p & 2) == 0) {
            return false;
        }
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (getChildAt(i11).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i10;
        int left2;
        int bottom;
        if (this.f746m == null) {
            return;
        }
        int i11 = 0;
        if (this.f739f == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i11 < virtualChildCount) {
                View childAt = getChildAt(i11);
                if (childAt != null && childAt.getVisibility() != 8 && k(i11)) {
                    f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((c2) childAt.getLayoutParams())).topMargin) - this.f748o);
                }
                i11++;
            }
            if (k(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f748o;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((c2) childAt2.getLayoutParams())).bottomMargin;
                }
                f(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a = f4.a(this);
        while (i11 < virtualChildCount2) {
            View childAt3 = getChildAt(i11);
            if (childAt3 != null && childAt3.getVisibility() != 8 && k(i11)) {
                c2 c2Var = (c2) childAt3.getLayoutParams();
                if (a) {
                    left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) c2Var).rightMargin;
                } else {
                    left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) c2Var).leftMargin) - this.f747n;
                }
                g(canvas, left2);
            }
            i11++;
        }
        if (k(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 == null) {
                if (a) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i10 = this.f747n;
                    right = left - i10;
                }
            } else {
                c2 c2Var2 = (c2) childAt4.getLayoutParams();
                if (a) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c2Var2).leftMargin;
                    i10 = this.f747n;
                    right = left - i10;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c2Var2).rightMargin;
                }
            }
            g(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0188  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x068f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:356:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x082d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r35, int r36) {
        /*
            Method dump skipped, instructions count: 2266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z10) {
        this.f736b = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f737c = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f746m) {
            return;
        }
        this.f746m = drawable;
        boolean z10 = false;
        if (drawable != null) {
            this.f747n = drawable.getIntrinsicWidth();
            this.f748o = drawable.getIntrinsicHeight();
        } else {
            this.f747n = 0;
            this.f748o = 0;
        }
        if (drawable == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f750q = i10;
    }

    public void setGravity(int i10) {
        if (this.f740g != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f740g = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f740g;
        if ((8388615 & i12) != i11) {
            this.f740g = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f743j = z10;
    }

    public void setOrientation(int i10) {
        if (this.f739f != i10) {
            this.f739f = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f749p) {
            requestLayout();
        }
        this.f749p = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f740g;
        if ((i12 & 112) != i11) {
            this.f740g = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f742i = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f736b = true;
        this.f737c = -1;
        this.f738d = 0;
        this.f740g = 8388659;
        int[] iArr = g.a.f17891n;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        i3 i3Var = new i3(context, obtainStyledAttributes);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        int h10 = i3Var.h(1, -1);
        if (h10 >= 0) {
            setOrientation(h10);
        }
        int h11 = i3Var.h(0, -1);
        if (h11 >= 0) {
            setGravity(h11);
        }
        boolean a = i3Var.a(2, true);
        if (!a) {
            setBaselineAligned(a);
        }
        this.f742i = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f737c = i3Var.h(3, -1);
        this.f743j = i3Var.a(7, false);
        setDividerDrawable(i3Var.e(5));
        this.f749p = i3Var.h(8, 0);
        this.f750q = i3Var.d(6, 0);
        i3Var.o();
    }
}
