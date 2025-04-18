package androidx.compose.ui.platform.coreshims;

import android.os.Bundle;
import android.view.ViewStructure;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes2.dex */
public class ViewStructureCompat {

    /* renamed from: a, reason: collision with root package name */
    public final ViewStructure f16720a;

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api23Impl {
        @DoNotInline
        public static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }

        @DoNotInline
        public static void b(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        @DoNotInline
        public static void c(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        @DoNotInline
        public static void d(ViewStructure viewStructure, int i2, int i3, int i4, int i5, int i6, int i7) {
            viewStructure.setDimens(i2, i3, i4, i5, i6, i7);
        }

        @DoNotInline
        public static void e(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        @DoNotInline
        public static void f(ViewStructure viewStructure, float f2, int i2, int i3, int i4) {
            viewStructure.setTextStyle(f2, i2, i3, i4);
        }
    }

    public ViewStructureCompat(ViewStructure viewStructure) {
        this.f16720a = viewStructure;
    }

    public final Bundle a() {
        return Api23Impl.a(this.f16720a);
    }

    public final void b(String str) {
        Api23Impl.b(this.f16720a, str);
    }

    public final void c(String str) {
        Api23Impl.c(this.f16720a, str);
    }

    public final void d(int i2, int i3, int i4, int i5) {
        Api23Impl.d(this.f16720a, i2, i3, 0, 0, i4, i5);
    }

    public final void e(CharSequence charSequence) {
        Api23Impl.e(this.f16720a, charSequence);
    }

    public final void f(float f2) {
        Api23Impl.f(this.f16720a, f2, 0, 0, 0);
    }
}
