package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SegmentedButtonKt$SegmentedButtonContent$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f11136a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f11137b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11138c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedButtonKt$SegmentedButtonContent$2(p pVar, p pVar2, int i2) {
        super(2);
        this.f11136a = pVar;
        this.f11137b = pVar2;
        this.f11138c = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f11138c | 1);
        SegmentedButtonKt.a(this.f11136a, this.f11137b, (Composer) obj, a2);
        return b0.f30125a;
    }
}
