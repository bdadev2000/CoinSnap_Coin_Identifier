package oa;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import c6.k;

/* loaded from: classes3.dex */
public final class a extends AppCompatTextView {
    public a(Context context, AttributeSet attributeSet) {
        super(p6.a.z(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        if (k.w(context2, com.plantcare.ai.identifier.plantid.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = r9.a.f24036r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int e2 = e(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (!(e2 != -1)) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    d(resourceId, theme);
                }
            }
        }
    }

    public static int e(Context context, TypedArray typedArray, int... iArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < iArr.length && i10 < 0; i11++) {
            int i12 = iArr[i11];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i12, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i10 = dimensionPixelSize;
            } else {
                i10 = typedArray.getDimensionPixelSize(i12, -1);
            }
        }
        return i10;
    }

    public final void d(int i10, Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i10, r9.a.f24035q);
        int e2 = e(getContext(), obtainStyledAttributes, 2, 4);
        obtainStyledAttributes.recycle();
        if (e2 >= 0) {
            setLineHeight(e2);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (k.w(context, com.plantcare.ai.identifier.plantid.R.attr.textAppearanceLineHeightEnabled, true)) {
            d(i10, context.getTheme());
        }
    }
}
