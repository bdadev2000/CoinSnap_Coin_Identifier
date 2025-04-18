package androidx.activity.compose;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class PredictiveBackHandlerKt$PredictiveBackHandler$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f241a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f242b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f243c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PredictiveBackHandlerKt$PredictiveBackHandler$3(boolean z2, p pVar, int i2, int i3) {
        super(2);
        this.f241a = z2;
        this.f242b = pVar;
        this.f243c = i2;
        this.d = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i2 = this.f243c | 1;
        PredictiveBackHandlerKt.a(this.f241a, this.f242b, (Composer) obj, i2, this.d);
        return b0.f30125a;
    }
}
