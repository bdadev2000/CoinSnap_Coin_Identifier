package androidx.compose.material3;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class IconKt$Icon$4$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Painter f9610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ColorProducer f9611b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconKt$Icon$4$1(Painter painter, ColorProducer colorProducer) {
        super(1);
        this.f9610a = painter;
        this.f9611b = colorProducer;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        Painter painter = this.f9610a;
        long b2 = drawScope.b();
        ColorProducer colorProducer = this.f9611b;
        Painter.m3drawx_KDEd0$default(painter, drawScope, b2, 0.0f, colorProducer != null ? ColorFilter.Companion.a(5, colorProducer.a()) : null, 2, null);
        return b0.f30125a;
    }
}
