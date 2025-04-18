package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public boolean f723b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f724c;

    /* renamed from: d, reason: collision with root package name */
    public int f725d;

    public ButtonBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f725d = -1;
        int[] iArr = g.a.f17888k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f723b = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f723b);
        }
    }

    private void setStacked(boolean z10) {
        int i10;
        int i11;
        if (this.f724c != z10) {
            if (!z10 || this.f723b) {
                this.f724c = z10;
                setOrientation(z10 ? 1 : 0);
                if (z10) {
                    i10 = 8388613;
                } else {
                    i10 = 80;
                }
                setGravity(i10);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    if (z10) {
                        i11 = 8;
                    } else {
                        i11 = 4;
                    }
                    findViewById.setVisibility(i11);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int paddingBottom;
        boolean z11;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = 0;
        if (this.f723b) {
            if (size > this.f725d && this.f724c) {
                setStacked(false);
            }
            this.f725d = size;
        }
        if (!this.f724c && View.MeasureSpec.getMode(i10) == 1073741824) {
            i12 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z10 = true;
        } else {
            i12 = i10;
            z10 = false;
        }
        super.onMeasure(i12, i11);
        if (this.f723b && !this.f724c) {
            if ((getMeasuredWidthAndState() & ViewCompat.MEASURED_STATE_MASK) == 16777216) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                setStacked(true);
                z10 = true;
            }
        }
        if (z10) {
            super.onMeasure(i10, i11);
        }
        int childCount = getChildCount();
        int i15 = 0;
        while (true) {
            i13 = -1;
            if (i15 < childCount) {
                if (getChildAt(i15).getVisibility() == 0) {
                    break;
                } else {
                    i15++;
                }
            } else {
                i15 = -1;
                break;
            }
        }
        if (i15 >= 0) {
            View childAt = getChildAt(i15);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            i14 = 0 + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f724c) {
                int i16 = i15 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i16 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i16).getVisibility() == 0) {
                        i13 = i16;
                        break;
                    }
                    i16++;
                }
                if (i13 >= 0) {
                    paddingBottom = getChildAt(i13).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                paddingBottom = getPaddingBottom();
            }
            i14 += paddingBottom;
        }
        if (ViewCompat.getMinimumHeight(this) != i14) {
            setMinimumHeight(i14);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f723b != z10) {
            this.f723b = z10;
            if (!z10 && this.f724c) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
