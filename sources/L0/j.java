package l0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* loaded from: classes.dex */
public final class j implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    public final TransformationMethod f21553a;

    public j(TransformationMethod transformationMethod) {
        this.f21553a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f21553a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && j0.j.a().b() == 1) {
            j0.j a6 = j0.j.a();
            a6.getClass();
            return a6.f(charSequence, 0, charSequence.length());
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z8, int i9, Rect rect) {
        TransformationMethod transformationMethod = this.f21553a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z8, i9, rect);
        }
    }
}
