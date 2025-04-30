package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.tools.arruler.photomeasure.camera.ruler.R;
import x3.AbstractC2920a;
import y2.AbstractC2947c;

/* loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout {
    public TextView b;

    /* renamed from: c, reason: collision with root package name */
    public Button f14127c;

    /* renamed from: d, reason: collision with root package name */
    public int f14128d;

    public SnackbarContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC2947c.v(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC2920a.b);
    }

    public final boolean a(int i9, int i10, int i11) {
        boolean z8;
        if (i9 != getOrientation()) {
            setOrientation(i9);
            z8 = true;
        } else {
            z8 = false;
        }
        if (this.b.getPaddingTop() == i10 && this.b.getPaddingBottom() == i11) {
            return z8;
        }
        TextView textView = this.b;
        if (ViewCompat.isPaddingRelative(textView)) {
            ViewCompat.setPaddingRelative(textView, ViewCompat.getPaddingStart(textView), i10, ViewCompat.getPaddingEnd(textView), i11);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i10, textView.getPaddingRight(), i11);
        return true;
    }

    public Button getActionView() {
        return this.f14127c;
    }

    public TextView getMessageView() {
        return this.b;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.b = (TextView) findViewById(R.id.snackbar_text);
        this.f14127c = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        boolean z8;
        super.onMeasure(i9, i10);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.b.getLayout();
        if (layout != null && layout.getLineCount() > 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8 && this.f14128d > 0 && this.f14127c.getMeasuredWidth() > this.f14128d) {
            if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                return;
            }
        } else {
            if (!z8) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        }
        super.onMeasure(i9, i10);
    }

    public void setMaxInlineActionWidth(int i9) {
        this.f14128d = i9;
    }
}
