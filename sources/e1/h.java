package e1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class h extends ac.e {

    /* renamed from: d, reason: collision with root package name */
    public final TextView f17078d;

    /* renamed from: f, reason: collision with root package name */
    public final f f17079f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17080g = true;

    public h(TextView textView) {
        this.f17078d = textView;
        this.f17079f = new f(textView);
    }

    @Override // ac.e
    public final InputFilter[] h(InputFilter[] inputFilterArr) {
        if (!this.f17080g) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof f) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            if (sparseArray.size() != 0) {
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    if (sparseArray.indexOfKey(i12) < 0) {
                        inputFilterArr2[i11] = inputFilterArr[i12];
                        i11++;
                    }
                }
                return inputFilterArr2;
            }
            return inputFilterArr;
        }
        int length2 = inputFilterArr.length;
        int i13 = 0;
        while (true) {
            f fVar = this.f17079f;
            if (i13 < length2) {
                if (inputFilterArr[i13] != fVar) {
                    i13++;
                } else {
                    return inputFilterArr;
                }
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = fVar;
                return inputFilterArr3;
            }
        }
    }

    @Override // ac.e
    public final boolean p() {
        return this.f17080g;
    }

    @Override // ac.e
    public final void r(boolean z10) {
        if (z10) {
            v();
        }
    }

    @Override // ac.e
    public final void s(boolean z10) {
        this.f17080g = z10;
        v();
        TextView textView = this.f17078d;
        textView.setFilters(h(textView.getFilters()));
    }

    public final void v() {
        TextView textView = this.f17078d;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f17080g) {
            if (!(transformationMethod instanceof l) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new l(transformationMethod);
            }
        } else if (transformationMethod instanceof l) {
            transformationMethod = ((l) transformationMethod).a;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
