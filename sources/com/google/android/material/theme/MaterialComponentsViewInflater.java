package com.google.android.material.theme;

import E3.d;
import L3.k;
import U3.v;
import W3.a;
import Z.b;
import a.AbstractC0325a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.tools.arruler.photomeasure.camera.ruler.R;
import k.C2404A;
import q.C2579B;
import q.C2615o;
import q.C2619q;
import w3.AbstractC2861a;

/* loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends C2404A {
    @Override // k.C2404A
    public final C2615o a(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    @Override // k.C2404A
    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // k.C2404A
    public final C2619q c(Context context, AttributeSet attributeSet) {
        return new d(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [q.B, android.widget.CompoundButton, android.view.View, N3.a] */
    @Override // k.C2404A
    public final C2579B d(Context context, AttributeSet attributeSet) {
        ?? c2579b = new C2579B(a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = c2579b.getContext();
        TypedArray f9 = k.f(context2, attributeSet, AbstractC2861a.f23673o, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (f9.hasValue(0)) {
            b.c(c2579b, android.support.v4.media.session.a.p(context2, f9, 0));
        }
        c2579b.f2097h = f9.getBoolean(1, false);
        f9.recycle();
        return c2579b;
    }

    @Override // k.C2404A
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = appCompatTextView.getContext();
        if (AbstractC0325a.o(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC2861a.f23676r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int d2 = V3.a.d(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (d2 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC2861a.f23675q);
                    int d9 = V3.a.d(appCompatTextView.getContext(), obtainStyledAttributes3, 1, 2);
                    obtainStyledAttributes3.recycle();
                    if (d9 >= 0) {
                        appCompatTextView.setLineHeight(d9);
                    }
                }
            }
        }
        return appCompatTextView;
    }
}
