package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavigationRailKt$NavigationRailItemLayout$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f10368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f10369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f10370c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f10371f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q0.a f10372g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10373h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRailItemLayout$3(p pVar, p pVar2, p pVar3, p pVar4, boolean z2, q0.a aVar, int i2) {
        super(2);
        this.f10368a = pVar;
        this.f10369b = pVar2;
        this.f10370c = pVar3;
        this.d = pVar4;
        this.f10371f = z2;
        this.f10372g = aVar;
        this.f10373h = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        NavigationRailKt.a(this.f10368a, this.f10369b, this.f10370c, this.d, this.f10371f, this.f10372g, (Composer) obj, RecomposeScopeImplKt.a(this.f10373h | 1));
        return b0.f30125a;
    }
}
