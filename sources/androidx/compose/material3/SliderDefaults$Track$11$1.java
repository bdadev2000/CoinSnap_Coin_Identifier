package androidx.compose.material3;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes4.dex */
final class SliderDefaults$Track$11$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RangeSliderState f11238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f11239b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11240c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f11241f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f11242g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f11243h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f11244i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f11245j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderDefaults$Track$11$1(RangeSliderState rangeSliderState, long j2, long j3, long j4, long j5, float f2, float f3, p pVar, q qVar) {
        super(1);
        this.f11238a = rangeSliderState;
        this.f11239b = j2;
        this.f11240c = j3;
        this.d = j4;
        this.f11241f = j5;
        this.f11242g = f2;
        this.f11243h = f3;
        this.f11244i = pVar;
        this.f11245j = qVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        SliderDefaults sliderDefaults = SliderDefaults.f11221a;
        RangeSliderState rangeSliderState = this.f11238a;
        SliderDefaults.e(drawScope, rangeSliderState.f10765g, rangeSliderState.d(), rangeSliderState.c(), this.f11239b, this.f11240c, this.d, this.f11241f, drawScope.I(rangeSliderState.f10766h.c()), drawScope.I(rangeSliderState.f10767i.c()), drawScope.I(rangeSliderState.f10768j.c()), this.f11242g, this.f11243h, this.f11244i, this.f11245j, true);
        return b0.f30125a;
    }
}
