package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class NavigationDrawerKt$Scrim$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f10189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f10190b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0.a f10191c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10192f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$Scrim$2(boolean z2, q0.a aVar, q0.a aVar2, long j2, int i2) {
        super(2);
        this.f10189a = z2;
        this.f10190b = aVar;
        this.f10191c = aVar2;
        this.d = j2;
        this.f10192f = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        NavigationDrawerKt.b(this.f10189a, this.f10190b, this.f10191c, this.d, (Composer) obj, RecomposeScopeImplKt.a(this.f10192f | 1));
        return b0.f30125a;
    }
}
