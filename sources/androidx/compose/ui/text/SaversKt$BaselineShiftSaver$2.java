package androidx.compose.ui.text;

import androidx.compose.ui.text.style.BaselineShift;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class SaversKt$BaselineShiftSaver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$BaselineShiftSaver$2 f16978a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        a.q(obj, "null cannot be cast to non-null type kotlin.Float");
        return new BaselineShift(((Float) obj).floatValue());
    }
}
