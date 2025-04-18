package androidx.compose.material3.internal;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class TextFieldImplKt$textFieldBackground$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Shape f13107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ColorProducer f13108b;

    /* renamed from: androidx.compose.material3.internal.TextFieldImplKt$textFieldBackground$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Outline f13109a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ColorProducer f13110b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Outline outline, ColorProducer colorProducer) {
            super(1);
            this.f13109a = outline;
            this.f13110b = colorProducer;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            OutlineKt.a((DrawScope) obj, this.f13109a, this.f13110b.a());
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$textFieldBackground$1(Shape shape, ColorProducer colorProducer) {
        super(1);
        this.f13107a = shape;
        this.f13108b = colorProducer;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        CacheDrawScope cacheDrawScope = (CacheDrawScope) obj;
        return cacheDrawScope.m(new AnonymousClass1(this.f13107a.a(cacheDrawScope.f14796a.b(), cacheDrawScope.f14796a.getLayoutDirection(), cacheDrawScope), this.f13108b));
    }
}
