package androidx.compose.ui.layout;

import kotlin.jvm.internal.o;
import q0.p;
import s0.a;

/* loaded from: classes.dex */
public /* synthetic */ class AlignmentLineKt$FirstBaseline$1 extends o implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final AlignmentLineKt$FirstBaseline$1 f15694a = new o(2, a.class, "min", "min(II)I", 1);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
