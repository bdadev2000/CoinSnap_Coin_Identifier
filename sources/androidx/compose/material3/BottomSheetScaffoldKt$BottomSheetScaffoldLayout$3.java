package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f7979a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f7980b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f7981c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f7982f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q0.a f7983g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ SheetState f7984h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f7985i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f7986j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7987k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$3(Modifier modifier, p pVar, p pVar2, p pVar3, p pVar4, q0.a aVar, SheetState sheetState, long j2, long j3, int i2) {
        super(2);
        this.f7979a = modifier;
        this.f7980b = pVar;
        this.f7981c = pVar2;
        this.d = pVar3;
        this.f7982f = pVar4;
        this.f7983g = aVar;
        this.f7984h = sheetState;
        this.f7985i = j2;
        this.f7986j = j3;
        this.f7987k = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        BottomSheetScaffoldKt.a(this.f7979a, this.f7980b, this.f7981c, this.d, this.f7982f, this.f7983g, this.f7984h, this.f7985i, this.f7986j, (Composer) obj, RecomposeScopeImplKt.a(this.f7987k | 1));
        return b0.f30125a;
    }
}
