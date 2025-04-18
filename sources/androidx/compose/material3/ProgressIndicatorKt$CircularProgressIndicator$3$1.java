package androidx.compose.material3;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ProgressIndicatorKt$CircularProgressIndicator$3$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f10629a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10630b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f10631c;
    public final /* synthetic */ float d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f10632f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Stroke f10633g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f10634h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$3$1(q0.a aVar, int i2, float f2, float f3, long j2, Stroke stroke, long j3) {
        super(1);
        this.f10629a = aVar;
        this.f10630b = i2;
        this.f10631c = f2;
        this.d = f3;
        this.f10632f = j2;
        this.f10633g = stroke;
        this.f10634h = j3;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        float floatValue = ((Number) this.f10629a.invoke()).floatValue() * 360.0f;
        boolean a2 = StrokeCap.a(this.f10630b, 0);
        float f2 = this.f10631c;
        if (!a2 && Size.b(drawScope.b()) <= Size.d(drawScope.b())) {
            f2 += this.d;
        }
        float I = (f2 / ((float) (drawScope.I(Size.d(drawScope.b())) * 3.141592653589793d))) * 360.0f;
        ProgressIndicatorKt.h(drawScope, Math.min(floatValue, I) + 270.0f + floatValue, (360.0f - floatValue) - (Math.min(floatValue, I) * 2), this.f10632f, this.f10633g);
        ProgressIndicatorKt.h(drawScope, 270.0f, floatValue, this.f10634h, this.f10633g);
        return b0.f30125a;
    }
}
