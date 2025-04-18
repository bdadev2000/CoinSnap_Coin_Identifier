package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class SaversKt$ColorSaver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$ColorSaver$2 f16982a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        if (a.g(obj, Boolean.FALSE)) {
            return new Color(Color.f14962i);
        }
        a.q(obj, "null cannot be cast to non-null type kotlin.Int");
        return new Color(ColorKt.b(((Integer) obj).intValue()));
    }
}
