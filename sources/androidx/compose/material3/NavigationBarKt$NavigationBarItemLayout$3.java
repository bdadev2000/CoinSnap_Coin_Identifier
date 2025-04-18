package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class NavigationBarKt$NavigationBarItemLayout$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f10013a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f10014b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f10015c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f10016f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q0.a f10017g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10018h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$NavigationBarItemLayout$3(p pVar, p pVar2, p pVar3, p pVar4, boolean z2, q0.a aVar, int i2) {
        super(2);
        this.f10013a = pVar;
        this.f10014b = pVar2;
        this.f10015c = pVar3;
        this.d = pVar4;
        this.f10016f = z2;
        this.f10017g = aVar;
        this.f10018h = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        NavigationBarKt.a(this.f10013a, this.f10014b, this.f10015c, this.d, this.f10016f, this.f10017g, (Composer) obj, RecomposeScopeImplKt.a(this.f10018h | 1));
        return b0.f30125a;
    }
}
