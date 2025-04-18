package androidx.activity.compose;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ReportDrawnKt$ReportDrawnAfter$fullyDrawnReporter$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f260b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnKt$ReportDrawnAfter$fullyDrawnReporter$1(int i2, l lVar) {
        super(2);
        this.f259a = lVar;
        this.f260b = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i2 = this.f260b | 1;
        ReportDrawnKt.a(this.f259a, (Composer) obj, i2);
        return b0.f30125a;
    }
}
