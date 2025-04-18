package androidx.compose.material3;

import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ProgressIndicatorKt$CircularProgressIndicator$coercedProgress$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f10669a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$coercedProgress$1$1(q0.a aVar) {
        super(0);
        this.f10669a = aVar;
    }

    @Override // q0.a
    public final Object invoke() {
        return Float.valueOf(p0.a.z(((Number) this.f10669a.invoke()).floatValue(), 0.0f, 1.0f));
    }
}
