package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class BottomSheetScaffoldKt$StandardBottomSheet$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SheetState f8014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f8015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f8016c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Shape f8017f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f8018g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f8019h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f8020i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f8021j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f8022k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f8023l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f8024m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f8025n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$StandardBottomSheet$3(SheetState sheetState, float f2, float f3, boolean z2, Shape shape, long j2, long j3, float f4, float f5, p pVar, q qVar, int i2, int i3) {
        super(2);
        this.f8014a = sheetState;
        this.f8015b = f2;
        this.f8016c = f3;
        this.d = z2;
        this.f8017f = shape;
        this.f8018g = j2;
        this.f8019h = j3;
        this.f8020i = f4;
        this.f8021j = f5;
        this.f8022k = pVar;
        this.f8023l = qVar;
        this.f8024m = i2;
        this.f8025n = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        BottomSheetScaffoldKt.b(this.f8014a, this.f8015b, this.f8016c, this.d, this.f8017f, this.f8018g, this.f8019h, this.f8020i, this.f8021j, this.f8022k, this.f8023l, (Composer) obj, RecomposeScopeImplKt.a(this.f8024m | 1), RecomposeScopeImplKt.a(this.f8025n));
        return b0.f30125a;
    }
}
