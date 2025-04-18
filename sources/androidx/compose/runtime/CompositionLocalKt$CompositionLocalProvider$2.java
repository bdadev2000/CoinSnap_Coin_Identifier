package androidx.compose.runtime;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CompositionLocalKt$CompositionLocalProvider$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProvidedValue f13764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f13765b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13766c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositionLocalKt$CompositionLocalProvider$2(ProvidedValue providedValue, p pVar, int i2) {
        super(2);
        this.f13764a = providedValue;
        this.f13765b = pVar;
        this.f13766c = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f13766c | 1);
        CompositionLocalKt.a(this.f13764a, this.f13765b, (Composer) obj, a2);
        return b0.f30125a;
    }
}
