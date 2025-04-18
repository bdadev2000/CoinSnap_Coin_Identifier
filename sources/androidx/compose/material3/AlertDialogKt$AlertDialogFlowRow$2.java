package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AlertDialogKt$AlertDialogFlowRow$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f7531a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f7532b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f7533c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogFlowRow$2(float f2, float f3, p pVar, int i2) {
        super(2);
        this.f7531a = f2;
        this.f7532b = f3;
        this.f7533c = pVar;
        this.d = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        float f2 = this.f7532b;
        p pVar = this.f7533c;
        AlertDialogKt.b(this.f7531a, f2, pVar, (Composer) obj, a2);
        return b0.f30125a;
    }
}
