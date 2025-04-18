package androidx.compose.runtime;

import d0.b0;
import java.util.Arrays;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CompositionLocalKt$CompositionLocalProvider$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProvidedValue[] f13761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f13762b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13763c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositionLocalKt$CompositionLocalProvider$1(ProvidedValue[] providedValueArr, p pVar, int i2) {
        super(2);
        this.f13761a = providedValueArr;
        this.f13762b = pVar;
        this.f13763c = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ProvidedValue[] providedValueArr = this.f13761a;
        ProvidedValue[] providedValueArr2 = (ProvidedValue[]) Arrays.copyOf(providedValueArr, providedValueArr.length);
        int a2 = RecomposeScopeImplKt.a(this.f13763c | 1);
        CompositionLocalKt.b(providedValueArr2, this.f13762b, (Composer) obj, a2);
        return b0.f30125a;
    }
}
