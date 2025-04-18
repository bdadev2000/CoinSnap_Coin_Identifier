package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ModalBottomSheetKt$Scrim$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f9921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f9922b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f9923c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$Scrim$2(long j2, q0.a aVar, boolean z2, int i2) {
        super(2);
        this.f9921a = j2;
        this.f9922b = aVar;
        this.f9923c = z2;
        this.d = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ModalBottomSheetKt.c(this.f9921a, this.f9922b, this.f9923c, (Composer) obj, RecomposeScopeImplKt.a(this.d | 1));
        return b0.f30125a;
    }
}
