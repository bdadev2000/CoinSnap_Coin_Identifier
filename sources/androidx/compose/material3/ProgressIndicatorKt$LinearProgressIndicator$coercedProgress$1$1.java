package androidx.compose.material3;

import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f10732a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1(q0.a aVar) {
        super(0);
        this.f10732a = aVar;
    }

    @Override // q0.a
    public final Object invoke() {
        return Float.valueOf(p0.a.z(((Number) this.f10732a.invoke()).floatValue(), 0.0f, 1.0f));
    }
}
