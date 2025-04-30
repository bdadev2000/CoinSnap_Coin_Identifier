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
import j.AbstractC2379a;
import l5.k;
import q.C2629v0;
import q.g1;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public int f4221c;

    /* renamed from: d, reason: collision with root package name */
    public int f4222d;

    /* renamed from: f, reason: collision with root package name */
    public int f4223f;

    /* renamed from: g, reason: collision with root package name */
    public int f4224g;

    /* renamed from: h, reason: collision with root package name */
    public int f4225h;

    /* renamed from: i, reason: collision with root package name */
    public float f4226i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4227j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f4228k;
    public int[] l;
    public Drawable m;

    /* renamed from: n, reason: collision with root package name */
    public int f4229n;

    /* renamed from: o, reason: collision with root package name */
    public int f4230o;

    /* renamed from: p, reason: collision with root package name */
    public int f4231p;

    /* renamed from: q, reason: collision with root package name */
    public int f4232q;

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2629v0;
    }

    public final void d(Canvas canvas, int i9) {
        this.m.setBounds(getPaddingLeft() + this.f4232q, i9, (getWidth() - getPaddingRight()) - this.f4232q, this.f4230o + i9);
        this.m.draw(canvas);
    }

    public final void e(Canvas canvas, int i9) {
        this.m.setBounds(i9, getPaddingTop() + this.f4232q, this.f4229n + i9, (getHeight() - getPaddingBottom()) - this.f4232q);
        this.m.draw(canvas);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [q.v0, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v3, types: [q.v0, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C2629v0 generateDefaultLayoutParams() {
        int i9 = this.f4223f;
        if (i9 == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i9 == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [q.v0, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C2629v0 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i9;
        if (this.f4221c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.f4221c;
        if (childCount > i10) {
            View childAt = getChildAt(i10);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f4221c == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i11 = this.f4222d;
            if (this.f4223f == 1 && (i9 = this.f4224g & 112) != 48) {
                if (i9 != 16) {
                    if (i9 == 80) {
                        i11 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f4225h;
                    }
                } else {
                    i11 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f4225h) / 2;
                }
            }
            return i11 + ((LinearLayout.LayoutParams) ((C2629v0) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f4221c;
    }

    public Drawable getDividerDrawable() {
        return this.m;
    }

    public int getDividerPadding() {
        return this.f4232q;
    }

    public int getDividerWidth() {
        return this.f4229n;
    }

    public int getGravity() {
        return this.f4224g;
    }

    public int getOrientation() {
        return this.f4223f;
    }

    public int getShowDividers() {
        return this.f4231p;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f4226i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [q.v0, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v3, types: [q.v0, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v4, types: [q.v0, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C2629v0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C2629v0) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LinearLayout.LayoutParams(layoutParams);
    }

    public final boolean i(int i9) {
        if (i9 == 0) {
            if ((this.f4231p & 1) == 0) {
                return false;
            }
            return true;
        }
        if (i9 == getChildCount()) {
            if ((this.f4231p & 4) == 0) {
                return false;
            }
            return true;
        }
        if ((this.f4231p & 2) == 0) {
            return false;
        }
        for (int i10 = i9 - 1; i10 >= 0; i10--) {
            if (getChildAt(i10).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z8;
        int right;
        int left;
        int i9;
        int left2;
        int bottom;
        if (this.m == null) {
            return;
        }
        int i10 = 0;
        if (this.f4223f == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i10 < virtualChildCount) {
                View childAt = getChildAt(i10);
                if (childAt != null && childAt.getVisibility() != 8 && i(i10)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C2629v0) childAt.getLayoutParams())).topMargin) - this.f4230o);
                }
                i10++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f4230o;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C2629v0) childAt2.getLayoutParams())).bottomMargin;
                }
                d(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z9 = g1.f22657a;
        if (getLayoutDirection() == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        while (i10 < virtualChildCount2) {
            View childAt3 = getChildAt(i10);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i10)) {
                C2629v0 c2629v0 = (C2629v0) childAt3.getLayoutParams();
                if (z8) {
                    left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) c2629v0).rightMargin;
                } else {
                    left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) c2629v0).leftMargin) - this.f4229n;
                }
                e(canvas, left2);
            }
            i10++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 == null) {
                if (z8) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i9 = this.f4229n;
                    right = left - i9;
                }
            } else {
                C2629v0 c2629v02 = (C2629v0) childAt4.getLayoutParams();
                if (z8) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c2629v02).leftMargin;
                    i9 = this.f4229n;
                    right = left - i9;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c2629v02).rightMargin;
                }
            }
            e(canvas, right);
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

    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x02e0, code lost:
    
        if (((android.widget.LinearLayout.LayoutParams) r13).width == (-1)) goto L148;
     */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:352:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06b4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 2208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z8) {
        this.b = z8;
    }

    public void setBaselineAlignedChildIndex(int i9) {
        if (i9 >= 0 && i9 < getChildCount()) {
            this.f4221c = i9;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.m) {
            return;
        }
        this.m = drawable;
        boolean z8 = false;
        if (drawable != null) {
            this.f4229n = drawable.getIntrinsicWidth();
            this.f4230o = drawable.getIntrinsicHeight();
        } else {
            this.f4229n = 0;
            this.f4230o = 0;
        }
        if (drawable == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
        requestLayout();
    }

    public void setDividerPadding(int i9) {
        this.f4232q = i9;
    }

    public void setGravity(int i9) {
        if (this.f4224g != i9) {
            if ((8388615 & i9) == 0) {
                i9 |= 8388611;
            }
            if ((i9 & 112) == 0) {
                i9 |= 48;
            }
            this.f4224g = i9;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i9) {
        int i10 = i9 & 8388615;
        int i11 = this.f4224g;
        if ((8388615 & i11) != i10) {
            this.f4224g = i10 | ((-8388616) & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z8) {
        this.f4227j = z8;
    }

    public void setOrientation(int i9) {
        if (this.f4223f != i9) {
            this.f4223f = i9;
            requestLayout();
        }
    }

    public void setShowDividers(int i9) {
        if (i9 != this.f4231p) {
            requestLayout();
        }
        this.f4231p = i9;
    }

    public void setVerticalGravity(int i9) {
        int i10 = i9 & 112;
        int i11 = this.f4224g;
        if ((i11 & 112) != i10) {
            this.f4224g = i10 | (i11 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f9) {
        this.f4226i = Math.max(0.0f, f9);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, 0);
        this.b = true;
        this.f4221c = -1;
        this.f4222d = 0;
        this.f4224g = 8388659;
        int[] iArr = AbstractC2379a.f20952n;
        k i10 = k.i(context, attributeSet, iArr, 0, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, (TypedArray) i10.b, 0, 0);
        TypedArray typedArray = (TypedArray) i10.b;
        int i11 = typedArray.getInt(1, -1);
        if (i11 >= 0) {
            setOrientation(i11);
        }
        int i12 = typedArray.getInt(0, -1);
        if (i12 >= 0) {
            setGravity(i12);
        }
        boolean z8 = typedArray.getBoolean(2, true);
        if (!z8) {
            setBaselineAligned(z8);
        }
        this.f4226i = typedArray.getFloat(4, -1.0f);
        this.f4221c = typedArray.getInt(3, -1);
        this.f4227j = typedArray.getBoolean(7, false);
        setDividerDrawable(i10.e(5));
        this.f4231p = typedArray.getInt(8, 0);
        this.f4232q = typedArray.getDimensionPixelSize(6, 0);
        i10.j();
    }
}
