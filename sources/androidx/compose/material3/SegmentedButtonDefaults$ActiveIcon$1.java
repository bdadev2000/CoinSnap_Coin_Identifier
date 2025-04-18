package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SegmentedButtonDefaults$ActiveIcon$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SegmentedButtonDefaults f11086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11087b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedButtonDefaults$ActiveIcon$1(SegmentedButtonDefaults segmentedButtonDefaults, int i2) {
        super(2);
        this.f11086a = segmentedButtonDefaults;
        this.f11087b = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f11087b | 1);
        this.f11086a.a((Composer) obj, a2);
        return b0.f30125a;
    }
}
