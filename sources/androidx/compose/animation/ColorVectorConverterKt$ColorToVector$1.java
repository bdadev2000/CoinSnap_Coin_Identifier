package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
public final class ColorVectorConverterKt$ColorToVector$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final ColorVectorConverterKt$ColorToVector$1 f1776a = new r(1);

    /* renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f1777a = new r(1);

        @Override // q0.l
        public final Object invoke(Object obj) {
            long a2 = Color.a(((Color) obj).f14964a, ColorSpaces.f15090t);
            return new AnimationVector4D(Color.d(a2), Color.h(a2), Color.g(a2), Color.e(a2));
        }
    }

    /* renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass2 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ColorSpace f1778a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ColorSpace colorSpace) {
            super(1);
            this.f1778a = colorSpace;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            AnimationVector4D animationVector4D = (AnimationVector4D) obj;
            float f2 = animationVector4D.f2046b;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            float f3 = animationVector4D.f2047c;
            if (f3 < -0.5f) {
                f3 = -0.5f;
            }
            if (f3 > 0.5f) {
                f3 = 0.5f;
            }
            float f4 = animationVector4D.d;
            float f5 = f4 >= -0.5f ? f4 : -0.5f;
            float f6 = f5 <= 0.5f ? f5 : 0.5f;
            float f7 = animationVector4D.f2045a;
            float f8 = f7 >= 0.0f ? f7 : 0.0f;
            return new Color(Color.a(ColorKt.a(f2, f3, f6, f8 <= 1.0f ? f8 : 1.0f, ColorSpaces.f15090t), this.f1778a));
        }
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return VectorConvertersKt.a(AnonymousClass1.f1777a, new AnonymousClass2((ColorSpace) obj));
    }
}
