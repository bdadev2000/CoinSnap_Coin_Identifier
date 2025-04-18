package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.emoji2.text.EmojiCompat;

/* loaded from: classes3.dex */
public final class EmojiTextViewHelper {

    /* renamed from: a, reason: collision with root package name */
    public final HelperInternal f19603a;

    /* loaded from: classes3.dex */
    public static class HelperInternal {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        public boolean b() {
            return false;
        }

        public void c(boolean z2) {
        }

        public void d(boolean z2) {
        }

        public TransformationMethod e(TransformationMethod transformationMethod) {
            return transformationMethod;
        }
    }

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class HelperInternal19 extends HelperInternal {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f19604a;

        /* renamed from: b, reason: collision with root package name */
        public final EmojiInputFilter f19605b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f19606c = true;

        public HelperInternal19(TextView textView) {
            this.f19604a = textView;
            this.f19605b = new EmojiInputFilter(textView);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f19606c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                    InputFilter inputFilter = inputFilterArr[i2];
                    if (inputFilter instanceof EmojiInputFilter) {
                        sparseArray.put(i2, inputFilter);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i3 = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    if (sparseArray.indexOfKey(i4) < 0) {
                        inputFilterArr2[i3] = inputFilterArr[i4];
                        i3++;
                    }
                }
                return inputFilterArr2;
            }
            int length2 = inputFilterArr.length;
            int i5 = 0;
            while (true) {
                EmojiInputFilter emojiInputFilter = this.f19605b;
                if (i5 >= length2) {
                    InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = emojiInputFilter;
                    return inputFilterArr3;
                }
                if (inputFilterArr[i5] == emojiInputFilter) {
                    return inputFilterArr;
                }
                i5++;
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final boolean b() {
            return this.f19606c;
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final void c(boolean z2) {
            if (z2) {
                TextView textView = this.f19604a;
                textView.setTransformationMethod(e(textView.getTransformationMethod()));
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final void d(boolean z2) {
            this.f19606c = z2;
            TextView textView = this.f19604a;
            textView.setTransformationMethod(e(textView.getTransformationMethod()));
            textView.setFilters(a(textView.getFilters()));
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f19606c ? ((transformationMethod instanceof EmojiTransformationMethod) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new EmojiTransformationMethod(transformationMethod) : transformationMethod instanceof EmojiTransformationMethod ? ((EmojiTransformationMethod) transformationMethod).f19612a : transformationMethod;
        }
    }

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class SkippingHelper19 extends HelperInternal {

        /* renamed from: a, reason: collision with root package name */
        public final HelperInternal19 f19607a;

        public SkippingHelper19(TextView textView) {
            this.f19607a = new HelperInternal19(textView);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            return EmojiCompat.g() ^ true ? inputFilterArr : this.f19607a.a(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final boolean b() {
            return this.f19607a.f19606c;
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final void c(boolean z2) {
            if (!EmojiCompat.g()) {
                return;
            }
            this.f19607a.c(z2);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final void d(boolean z2) {
            boolean z3 = !EmojiCompat.g();
            HelperInternal19 helperInternal19 = this.f19607a;
            if (z3) {
                helperInternal19.f19606c = z2;
            } else {
                helperInternal19.d(z2);
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public final TransformationMethod e(TransformationMethod transformationMethod) {
            return EmojiCompat.g() ^ true ? transformationMethod : this.f19607a.e(transformationMethod);
        }
    }

    public EmojiTextViewHelper(TextView textView) {
        if (textView == null) {
            throw new NullPointerException("textView cannot be null");
        }
        this.f19603a = new SkippingHelper19(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f19603a.a(inputFilterArr);
    }

    public final boolean b() {
        return this.f19603a.b();
    }

    public final void c(boolean z2) {
        this.f19603a.c(z2);
    }

    public final void d(boolean z2) {
        this.f19603a.d(z2);
    }

    public final TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f19603a.e(transformationMethod);
    }
}
