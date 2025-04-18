package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import kotlin.jvm.internal.r;
import q0.l;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidSelectionHandles_androidKt$drawSelectionHandle$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f7037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7038b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$drawSelectionHandle$1(q0.a aVar, boolean z2) {
        super(3);
        this.f7037a = aVar;
        this.f7038b = z2;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifier = (Modifier) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(-196777734);
        long j2 = ((TextSelectionColors) composer.K(TextSelectionColorsKt.f7360a)).f7358a;
        boolean d = composer.d(j2);
        q0.a aVar = this.f7037a;
        boolean I = d | composer.I(aVar);
        boolean z2 = this.f7038b;
        boolean a2 = I | composer.a(z2);
        Object u2 = composer.u();
        if (a2 || u2 == Composer.Companion.f13690a) {
            u2 = new AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1(j2, z2, aVar);
            composer.o(u2);
        }
        Modifier c2 = DrawModifierKt.c(modifier, (l) u2);
        composer.D();
        return c2;
    }
}
