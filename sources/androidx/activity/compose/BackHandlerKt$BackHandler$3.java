package androidx.activity.compose;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class BackHandlerKt$BackHandler$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f217b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f218c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackHandlerKt$BackHandler$3(boolean z2, q0.a aVar, int i2, int i3) {
        super(2);
        this.f216a = z2;
        this.f217b = aVar;
        this.f218c = i2;
        this.d = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i2 = this.f218c | 1;
        BackHandlerKt.a(this.f216a, this.f217b, (Composer) obj, i2, this.d);
        return b0.f30125a;
    }
}
