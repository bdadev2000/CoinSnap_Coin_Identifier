package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TabKt$TabTransition$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f11789a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f11790b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11791c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11792f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabKt$TabTransition$1(long j2, long j3, boolean z2, p pVar, int i2) {
        super(2);
        this.f11789a = j2;
        this.f11790b = j3;
        this.f11791c = z2;
        this.d = pVar;
        this.f11792f = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        TabKt.b(this.f11789a, this.f11790b, this.f11791c, this.d, (Composer) obj, RecomposeScopeImplKt.a(this.f11792f | 1));
        return b0.f30125a;
    }
}
