package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import d0.b0;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutItemContentFactory f4783a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutItemContentFactory.CachedItemContent f4784b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, LazyLayoutItemContentFactory.CachedItemContent cachedItemContent) {
        super(2);
        this.f4783a = lazyLayoutItemContentFactory;
        this.f4784b = cachedItemContent;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            LazyLayoutItemContentFactory lazyLayoutItemContentFactory = this.f4783a;
            LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) lazyLayoutItemContentFactory.f4777b.invoke();
            LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this.f4784b;
            int i2 = cachedItemContent.f4782c;
            int itemCount = lazyLayoutItemProvider.getItemCount();
            Object obj3 = cachedItemContent.f4780a;
            if ((i2 >= itemCount || !a.g(lazyLayoutItemProvider.c(i2), obj3)) && (i2 = lazyLayoutItemProvider.b(obj3)) != -1) {
                cachedItemContent.f4782c = i2;
            }
            int i3 = i2;
            boolean z2 = i3 != -1;
            composer.x(Boolean.valueOf(z2));
            boolean a2 = composer.a(z2);
            composer.J(-869707859);
            if (z2) {
                composer.J(-2120139493);
                LazyLayoutItemContentFactoryKt.a(lazyLayoutItemProvider, lazyLayoutItemContentFactory.f4776a, i3, cachedItemContent.f4780a, composer, 0);
                composer.D();
            } else {
                composer.f(a2);
            }
            composer.D();
            composer.s();
            boolean w = composer.w(cachedItemContent);
            Object u2 = composer.u();
            if (w || u2 == Composer.Companion.f13690a) {
                u2 = new LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2$1(cachedItemContent);
                composer.o(u2);
            }
            EffectsKt.c(obj3, (l) u2, composer);
        }
        return b0.f30125a;
    }
}
