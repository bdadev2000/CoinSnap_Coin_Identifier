package androidx.compose.runtime;

import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
public final class MonotonicFrameClockKt$withFrameMillis$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f13831a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonotonicFrameClockKt$withFrameMillis$2(l lVar) {
        super(1);
        this.f13831a = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return this.f13831a.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
    }
}
