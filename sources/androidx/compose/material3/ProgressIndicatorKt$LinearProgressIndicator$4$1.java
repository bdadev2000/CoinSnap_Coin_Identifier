package androidx.compose.material3;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ProgressIndicatorKt$LinearProgressIndicator$4$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10700a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f10701b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0.a f10702c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f10703f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f10704g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$4$1(int i2, float f2, q0.a aVar, long j2, long j3, l lVar) {
        super(1);
        this.f10700a = i2;
        this.f10701b = f2;
        this.f10702c = aVar;
        this.d = j2;
        this.f10703f = j3;
        this.f10704g = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        float b2 = Size.b(drawScope.b());
        boolean a2 = StrokeCap.a(this.f10700a, 0);
        float f2 = this.f10701b;
        if (!a2 && Size.b(drawScope.b()) <= Size.d(drawScope.b())) {
            f2 += drawScope.I(b2);
        }
        float I = f2 / drawScope.I(Size.d(drawScope.b()));
        float floatValue = ((Number) this.f10702c.invoke()).floatValue();
        float min = Math.min(floatValue, I) + floatValue;
        if (min <= 1.0f) {
            ProgressIndicatorKt.g(drawScope, min, 1.0f, this.d, b2, this.f10700a);
        }
        ProgressIndicatorKt.g(drawScope, 0.0f, floatValue, this.f10703f, b2, this.f10700a);
        this.f10704g.invoke(drawScope);
        return b0.f30125a;
    }
}
