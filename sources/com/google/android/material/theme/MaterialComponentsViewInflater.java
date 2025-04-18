package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.q;
import com.google.android.material.button.MaterialButton;
import ga.a;
import h.l0;
import na.s;
import y9.c;

/* loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends l0 {
    @Override // h.l0
    public final q a(Context context, AttributeSet attributeSet) {
        return new s(context, attributeSet);
    }

    @Override // h.l0
    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // h.l0
    public final androidx.appcompat.widget.s c(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // h.l0
    public final f0 d(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // h.l0
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new oa.a(context, attributeSet);
    }
}
