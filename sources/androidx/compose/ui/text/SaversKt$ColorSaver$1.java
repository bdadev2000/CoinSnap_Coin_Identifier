package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
public final class SaversKt$ColorSaver$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$ColorSaver$1 f16981a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        long j2 = ((Color) obj2).f14964a;
        return j2 == 16 ? Boolean.FALSE : Integer.valueOf(ColorKt.j(j2));
    }
}
