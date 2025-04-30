package l0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f extends e1.f {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f21546a;
    public final d b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21547c = true;

    public f(TextView textView) {
        this.f21546a = textView;
        this.b = new d(textView);
    }

    @Override // e1.f
    public final InputFilter[] l(InputFilter[] inputFilterArr) {
        if (!this.f21547c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i9 = 0; i9 < inputFilterArr.length; i9++) {
                InputFilter inputFilter = inputFilterArr[i9];
                if (inputFilter instanceof d) {
                    sparseArray.put(i9, inputFilter);
                }
            }
            if (sparseArray.size() != 0) {
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i10 = 0;
                for (int i11 = 0; i11 < length; i11++) {
                    if (sparseArray.indexOfKey(i11) < 0) {
                        inputFilterArr2[i10] = inputFilterArr[i11];
                        i10++;
                    }
                }
                return inputFilterArr2;
            }
            return inputFilterArr;
        }
        int length2 = inputFilterArr.length;
        int i12 = 0;
        while (true) {
            d dVar = this.b;
            if (i12 < length2) {
                if (inputFilterArr[i12] != dVar) {
                    i12++;
                } else {
                    return inputFilterArr;
                }
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
        }
    }

    @Override // e1.f
    public final boolean n() {
        return this.f21547c;
    }

    @Override // e1.f
    public final void q(boolean z8) {
        if (z8) {
            TextView textView = this.f21546a;
            textView.setTransformationMethod(u(textView.getTransformationMethod()));
        }
    }

    @Override // e1.f
    public final void r(boolean z8) {
        this.f21547c = z8;
        TextView textView = this.f21546a;
        textView.setTransformationMethod(u(textView.getTransformationMethod()));
        textView.setFilters(l(textView.getFilters()));
    }

    @Override // e1.f
    public final TransformationMethod u(TransformationMethod transformationMethod) {
        if (this.f21547c) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                return new j(transformationMethod);
            }
            return transformationMethod;
        }
        if (transformationMethod instanceof j) {
            return ((j) transformationMethod).f21553a;
        }
        return transformationMethod;
    }
}
