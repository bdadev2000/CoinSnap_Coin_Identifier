package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class ComposedModifierKt$materializeImpl$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final ComposedModifierKt$materializeImpl$1 f14683a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        return Boolean.valueOf(!(((Modifier.Element) obj) instanceof ComposedModifier));
    }
}
