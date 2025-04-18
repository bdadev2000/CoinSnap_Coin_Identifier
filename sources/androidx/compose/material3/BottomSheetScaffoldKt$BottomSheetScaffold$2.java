package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* loaded from: classes3.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffold$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomSheetScaffoldState f7934a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f7935b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f7936c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Shape f7937f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f7938g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f7939h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f7940i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f7941j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f7942k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f7943l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$2(BottomSheetScaffoldState bottomSheetScaffoldState, float f2, float f3, boolean z2, Shape shape, long j2, long j3, float f4, float f5, p pVar, q qVar) {
        super(2);
        this.f7934a = bottomSheetScaffoldState;
        this.f7935b = f2;
        this.f7936c = f3;
        this.d = z2;
        this.f7937f = shape;
        this.f7938g = j2;
        this.f7939h = j3;
        this.f7940i = f4;
        this.f7941j = f5;
        this.f7942k = pVar;
        this.f7943l = qVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            BottomSheetScaffoldKt.b(this.f7934a.f8032a, this.f7935b, this.f7936c, this.d, this.f7937f, this.f7938g, this.f7939h, this.f7940i, this.f7941j, this.f7942k, this.f7943l, composer, 0, 0);
        }
        return b0.f30125a;
    }
}
