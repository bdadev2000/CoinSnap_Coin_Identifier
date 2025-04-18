package androidx.activity.compose;

import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
final class BackHandlerKt$BackHandler$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BackHandlerKt$BackHandler$backCallback$1$1 f211a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f212b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackHandlerKt$BackHandler$1$1(BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1, boolean z2) {
        super(0);
        this.f211a = backHandlerKt$BackHandler$backCallback$1$1;
        this.f212b = z2;
    }

    @Override // q0.a
    public final Object invoke() {
        BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1 = this.f211a;
        backHandlerKt$BackHandler$backCallback$1$1.f163a = this.f212b;
        q0.a aVar = backHandlerKt$BackHandler$backCallback$1$1.f165c;
        if (aVar != null) {
            aVar.invoke();
        }
        return b0.f30125a;
    }
}
