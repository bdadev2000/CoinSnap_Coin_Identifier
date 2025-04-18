package androidx.activity.compose;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ReportDrawnKt$ReportDrawnWhen$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f264b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnKt$ReportDrawnWhen$2(q0.a aVar, int i2) {
        super(2);
        this.f263a = aVar;
        this.f264b = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i2 = this.f264b | 1;
        ReportDrawnKt.b(this.f263a, (Composer) obj, i2);
        return b0.f30125a;
    }
}
