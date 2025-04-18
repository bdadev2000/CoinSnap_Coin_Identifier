package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class LazyLayoutItemContentFactoryKt$SkippableItem$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutItemProvider f4786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4787b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4788c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemContentFactoryKt$SkippableItem$1(int i2, LazyLayoutItemProvider lazyLayoutItemProvider, Object obj) {
        super(2);
        this.f4786a = lazyLayoutItemProvider;
        this.f4787b = i2;
        this.f4788c = obj;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            this.f4786a.h(this.f4787b, this.f4788c, composer, 0);
        }
        return b0.f30125a;
    }
}
