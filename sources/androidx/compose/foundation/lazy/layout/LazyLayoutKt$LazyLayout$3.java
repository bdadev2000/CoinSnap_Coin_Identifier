package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LazyLayoutKt$LazyLayout$3 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutPrefetchState f4803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f4804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f4805c;
    public final /* synthetic */ State d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutKt$LazyLayout$3(LazyLayoutPrefetchState lazyLayoutPrefetchState, Modifier modifier, p pVar, MutableState mutableState) {
        super(3);
        this.f4803a = lazyLayoutPrefetchState;
        this.f4804b = modifier;
        this.f4805c = pVar;
        this.d = mutableState;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier T0;
        SaveableStateHolder saveableStateHolder = (SaveableStateHolder) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        Object u2 = composer.u();
        Object obj4 = Composer.Companion.f13690a;
        if (u2 == obj4) {
            u2 = new LazyLayoutItemContentFactory(saveableStateHolder, new LazyLayoutKt$LazyLayout$3$itemContentFactory$1$1(this.d));
            composer.o(u2);
        }
        LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) u2;
        Object u3 = composer.u();
        if (u3 == obj4) {
            u3 = new SubcomposeLayoutState(new LazyLayoutItemReusePolicy(lazyLayoutItemContentFactory));
            composer.o(u3);
        }
        SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) u3;
        LazyLayoutPrefetchState lazyLayoutPrefetchState = this.f4803a;
        if (lazyLayoutPrefetchState != null) {
            composer.J(205264983);
            PrefetchScheduler prefetchScheduler = lazyLayoutPrefetchState.f4834a;
            if (prefetchScheduler == null) {
                composer.J(6622915);
                View view = (View) composer.K(AndroidCompositionLocals_androidKt.f16327f);
                boolean I = composer.I(view);
                Object u4 = composer.u();
                if (I || u4 == obj4) {
                    u4 = new AndroidPrefetchScheduler(view);
                    composer.o(u4);
                }
                prefetchScheduler = (AndroidPrefetchScheduler) u4;
            } else {
                composer.J(6621830);
            }
            composer.D();
            Object[] objArr = {lazyLayoutPrefetchState, lazyLayoutItemContentFactory, subcomposeLayoutState, prefetchScheduler};
            boolean I2 = composer.I(lazyLayoutPrefetchState) | composer.w(lazyLayoutItemContentFactory) | composer.w(subcomposeLayoutState) | composer.w(prefetchScheduler);
            Object u5 = composer.u();
            if (I2 || u5 == obj4) {
                u5 = new LazyLayoutKt$LazyLayout$3$1$1(lazyLayoutPrefetchState, lazyLayoutItemContentFactory, subcomposeLayoutState, prefetchScheduler);
                composer.o(u5);
            }
            EffectsKt.d(objArr, (l) u5, composer);
            composer.D();
        } else {
            composer.J(205858881);
            composer.D();
        }
        int i2 = LazyLayoutPrefetchStateKt.f4840b;
        Modifier modifier = this.f4804b;
        if (lazyLayoutPrefetchState != null && (T0 = modifier.T0(new TraversablePrefetchStateModifierElement(lazyLayoutPrefetchState))) != null) {
            modifier = T0;
        }
        boolean I3 = composer.I(lazyLayoutItemContentFactory);
        p pVar = this.f4805c;
        boolean I4 = I3 | composer.I(pVar);
        Object u6 = composer.u();
        if (I4 || u6 == obj4) {
            u6 = new LazyLayoutKt$LazyLayout$3$2$1(lazyLayoutItemContentFactory, pVar);
            composer.o(u6);
        }
        SubcomposeLayoutKt.b(subcomposeLayoutState, modifier, (p) u6, composer, 8, 0);
        return b0.f30125a;
    }
}
