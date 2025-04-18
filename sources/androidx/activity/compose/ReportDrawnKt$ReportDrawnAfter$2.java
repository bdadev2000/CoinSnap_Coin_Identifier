package androidx.activity.compose;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ReportDrawnKt$ReportDrawnAfter$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f258b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnKt$ReportDrawnAfter$2(int i2, l lVar) {
        super(2);
        this.f257a = lVar;
        this.f258b = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i2 = this.f258b | 1;
        ReportDrawnKt.a(this.f257a, (Composer) obj, i2);
        return b0.f30125a;
    }
}
