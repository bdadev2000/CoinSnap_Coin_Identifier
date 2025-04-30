package l0;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g extends e1.f {

    /* renamed from: a, reason: collision with root package name */
    public final f f21548a;

    public g(TextView textView) {
        this.f21548a = new f(textView);
    }

    @Override // e1.f
    public final InputFilter[] l(InputFilter[] inputFilterArr) {
        boolean z8;
        if (j0.j.f20971k != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            return inputFilterArr;
        }
        return this.f21548a.l(inputFilterArr);
    }

    @Override // e1.f
    public final boolean n() {
        return this.f21548a.f21547c;
    }

    @Override // e1.f
    public final void q(boolean z8) {
        boolean z9;
        if (j0.j.f20971k != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return;
        }
        this.f21548a.q(z8);
    }

    @Override // e1.f
    public final void r(boolean z8) {
        boolean z9;
        if (j0.j.f20971k != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z10 = !z9;
        f fVar = this.f21548a;
        if (z10) {
            fVar.f21547c = z8;
        } else {
            fVar.r(z8);
        }
    }

    @Override // e1.f
    public final TransformationMethod u(TransformationMethod transformationMethod) {
        boolean z8;
        if (j0.j.f20971k != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            return transformationMethod;
        }
        return this.f21548a.u(transformationMethod);
    }
}
