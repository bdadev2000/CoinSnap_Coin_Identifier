package androidx.activity.compose;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ReportDrawnKt$ReportDrawnWhen$fullyDrawnReporter$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f266b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnKt$ReportDrawnWhen$fullyDrawnReporter$1(q0.a aVar, int i2) {
        super(2);
        this.f265a = aVar;
        this.f266b = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i2 = this.f266b | 1;
        ReportDrawnKt.b(this.f265a, (Composer) obj, i2);
        return b0.f30125a;
    }
}
