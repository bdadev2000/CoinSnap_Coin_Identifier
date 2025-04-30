package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.tools.arruler.photomeasure.camera.ruler.R;
import j.AbstractC2379a;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4212c;

    /* renamed from: d, reason: collision with root package name */
    public int f4213d;

    public ButtonBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4213d = -1;
        int[] iArr = AbstractC2379a.f20951k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.b = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.b);
        }
    }

    private void setStacked(boolean z8) {
        int i9;
        int i10;
        if (this.f4212c != z8) {
            if (!z8 || this.b) {
                this.f4212c = z8;
                setOrientation(z8 ? 1 : 0);
                if (z8) {
                    i9 = 8388613;
                } else {
                    i9 = 80;
                }
                setGravity(i9);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    if (z8) {
                        i10 = 8;
                    } else {
                        i10 = 4;
                    }
                    findViewById.setVisibility(i10);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        boolean z8;
        int i12;
        int size = View.MeasureSpec.getSize(i9);
        int i13 = 0;
        if (this.b) {
            if (size > this.f4213d && this.f4212c) {
                setStacked(false);
            }
            this.f4213d = size;
        }
        if (!this.f4212c && View.MeasureSpec.getMode(i9) == 1073741824) {
            i11 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z8 = true;
        } else {
            i11 = i9;
            z8 = false;
        }
        super.onMeasure(i11, i10);
        if (this.b && !this.f4212c && (getMeasuredWidthAndState() & ViewCompat.MEASURED_STATE_MASK) == 16777216) {
            setStacked(true);
            z8 = true;
        }
        if (z8) {
            super.onMeasure(i9, i10);
        }
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            i12 = -1;
            if (i14 < childCount) {
                if (getChildAt(i14).getVisibility() == 0) {
                    break;
                } else {
                    i14++;
                }
            } else {
                i14 = -1;
                break;
            }
        }
        if (i14 >= 0) {
            View childAt = getChildAt(i14);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f4212c) {
                int i15 = i14 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i15 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i15).getVisibility() == 0) {
                        i12 = i15;
                        break;
                    }
                    i15++;
                }
                if (i12 >= 0) {
                    i13 = getChildAt(i12).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight;
                } else {
                    i13 = measuredHeight;
                }
            } else {
                i13 = getPaddingBottom() + measuredHeight;
            }
        }
        if (ViewCompat.getMinimumHeight(this) != i13) {
            setMinimumHeight(i13);
            if (i10 == 0) {
                super.onMeasure(i9, i10);
            }
        }
    }

    public void setAllowStacking(boolean z8) {
        if (this.b != z8) {
            this.b = z8;
            if (!z8 && this.f4212c) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
