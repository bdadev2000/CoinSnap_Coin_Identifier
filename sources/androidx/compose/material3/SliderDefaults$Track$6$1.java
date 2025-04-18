package androidx.compose.material3;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes3.dex */
final class SliderDefaults$Track$6$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SliderState f11271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f11272b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11273c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f11274f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f11275g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f11276h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f11277i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f11278j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderDefaults$Track$6$1(SliderState sliderState, long j2, long j3, long j4, long j5, float f2, float f3, p pVar, q qVar) {
        super(1);
        this.f11271a = sliderState;
        this.f11272b = j2;
        this.f11273c = j3;
        this.d = j4;
        this.f11274f = j5;
        this.f11275g = f2;
        this.f11276h = f3;
        this.f11277i = pVar;
        this.f11278j = qVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        SliderDefaults sliderDefaults = SliderDefaults.f11221a;
        SliderState sliderState = this.f11271a;
        SliderDefaults.e(drawScope, sliderState.f11490f, 0.0f, sliderState.c(), this.f11272b, this.f11273c, this.d, this.f11274f, drawScope.I(sliderState.f11493i.c()), drawScope.H(0), drawScope.I(sliderState.f11494j.c()), this.f11275g, this.f11276h, this.f11277i, this.f11278j, false);
        return b0.f30125a;
    }
}
