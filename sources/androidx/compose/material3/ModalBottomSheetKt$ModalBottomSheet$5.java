package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ModalBottomSheetKt$ModalBottomSheet$5 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f9840a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f9841b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SheetState f9842c;
    public final /* synthetic */ float d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Shape f9843f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f9844g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f9845h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f9846i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f9847j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f9848k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f9849l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ModalBottomSheetProperties f9850m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q f9851n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9852o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f9853p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f9854q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheet$5(q0.a aVar, Modifier modifier, SheetState sheetState, float f2, Shape shape, long j2, long j3, float f3, long j4, p pVar, p pVar2, ModalBottomSheetProperties modalBottomSheetProperties, q qVar, int i2, int i3, int i4) {
        super(2);
        this.f9840a = aVar;
        this.f9841b = modifier;
        this.f9842c = sheetState;
        this.d = f2;
        this.f9843f = shape;
        this.f9844g = j2;
        this.f9845h = j3;
        this.f9846i = f3;
        this.f9847j = j4;
        this.f9848k = pVar;
        this.f9849l = pVar2;
        this.f9850m = modalBottomSheetProperties;
        this.f9851n = qVar;
        this.f9852o = i2;
        this.f9853p = i3;
        this.f9854q = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ModalBottomSheetKt.a(this.f9840a, this.f9841b, this.f9842c, this.d, this.f9843f, this.f9844g, this.f9845h, this.f9846i, this.f9847j, this.f9848k, this.f9849l, this.f9850m, this.f9851n, (Composer) obj, RecomposeScopeImplKt.a(this.f9852o | 1), RecomposeScopeImplKt.a(this.f9853p), this.f9854q);
        return b0.f30125a;
    }
}
