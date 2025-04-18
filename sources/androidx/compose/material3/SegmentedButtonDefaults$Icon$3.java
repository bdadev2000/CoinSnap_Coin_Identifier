package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SegmentedButtonDefaults$Icon$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SegmentedButtonDefaults f11091a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11092b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f11093c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11094f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11095g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedButtonDefaults$Icon$3(SegmentedButtonDefaults segmentedButtonDefaults, boolean z2, p pVar, p pVar2, int i2, int i3) {
        super(2);
        this.f11091a = segmentedButtonDefaults;
        this.f11092b = z2;
        this.f11093c = pVar;
        this.d = pVar2;
        this.f11094f = i2;
        this.f11095g = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f11091a.b(this.f11092b, this.f11093c, this.d, (Composer) obj, RecomposeScopeImplKt.a(this.f11094f | 1), this.f11095g);
        return b0.f30125a;
    }
}
