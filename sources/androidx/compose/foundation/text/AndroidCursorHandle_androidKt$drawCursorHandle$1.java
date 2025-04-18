package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import kotlin.jvm.internal.r;
import q0.l;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AndroidCursorHandle_androidKt$drawCursorHandle$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidCursorHandle_androidKt$drawCursorHandle$1 f5405a = new r(3);

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifier = (Modifier) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(-2126899193);
        long j2 = ((TextSelectionColors) composer.K(TextSelectionColorsKt.f7360a)).f7358a;
        Modifier.Companion companion = Modifier.Companion.f14687a;
        boolean d = composer.d(j2);
        Object u2 = composer.u();
        if (d || u2 == Composer.Companion.f13690a) {
            u2 = new AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1(j2);
            composer.o(u2);
        }
        Modifier T0 = modifier.T0(DrawModifierKt.c(companion, (l) u2));
        composer.D();
        return T0;
    }
}
