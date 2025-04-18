package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.node.Owner;
import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CompositionLocalsKt$ProvideCommonCompositionLocals$1 extends r implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Owner f16469a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UriHandler f16470b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0.p f16471c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositionLocalsKt$ProvideCommonCompositionLocals$1(Owner owner, UriHandler uriHandler, q0.p pVar, int i2) {
        super(2);
        this.f16469a = owner;
        this.f16470b = uriHandler;
        this.f16471c = pVar;
        this.d = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        UriHandler uriHandler = this.f16470b;
        q0.p pVar = this.f16471c;
        CompositionLocalsKt.a(this.f16469a, uriHandler, pVar, (Composer) obj, a2);
        return b0.f30125a;
    }
}
