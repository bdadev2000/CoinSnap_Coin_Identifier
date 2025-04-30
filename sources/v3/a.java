package V3;

import a.AbstractC0325a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import com.tools.arruler.photomeasure.camera.ruler.R;
import w3.AbstractC2861a;

/* loaded from: classes2.dex */
public final class a extends AppCompatTextView {
    public static int d(Context context, TypedArray typedArray, int... iArr) {
        int i9 = -1;
        for (int i10 = 0; i10 < iArr.length && i9 < 0; i10++) {
            int i11 = iArr[i10];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i11, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i9 = dimensionPixelSize;
            } else {
                i9 = typedArray.getDimensionPixelSize(i11, -1);
            }
        }
        return i9;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i9) {
        super.setTextAppearance(context, i9);
        if (AbstractC0325a.o(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i9, AbstractC2861a.f23675q);
            int d2 = d(getContext(), obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (d2 >= 0) {
                setLineHeight(d2);
            }
        }
    }
}
