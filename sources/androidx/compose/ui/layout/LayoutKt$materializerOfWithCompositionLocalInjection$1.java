package androidx.compose.ui.layout;

import android.support.v4.media.d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.CompositionLocalMapInjectionElement;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import d0.b0;
import kotlin.jvm.internal.r;
import p0.a;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LayoutKt$materializerOfWithCompositionLocalInjection$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f15749a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutKt$materializerOfWithCompositionLocalInjection$1(Modifier modifier) {
        super(3);
        this.f15749a = modifier;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = ((SkippableUpdater) obj).f13976a;
        Composer composer2 = (Composer) obj2;
        ((Number) obj3).intValue();
        int E = composer2.E();
        Modifier.Companion companion = Modifier.Companion.f14687a;
        Modifier modifier = this.f15749a;
        if (modifier != companion) {
            modifier = ComposedModifierKt.c(composer2, new CompositionLocalMapInjectionElement(composer2.m()).T0(modifier));
        }
        composer.t(509942095);
        ComposeUiNode.h8.getClass();
        Updater.b(composer, modifier, ComposeUiNode.Companion.d);
        p pVar = ComposeUiNode.Companion.f15900i;
        if (composer.e() || !a.g(composer.u(), Integer.valueOf(E))) {
            d.w(E, composer, E, pVar);
        }
        composer.H();
        return b0.f30125a;
    }
}
