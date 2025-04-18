package androidx.compose.ui.semantics;

import e0.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes2.dex */
public final class SemanticsProperties$Text$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final SemanticsProperties$Text$1 f16861a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        if (list == null) {
            return list2;
        }
        ArrayList b12 = u.b1(list);
        b12.addAll(list2);
        return b12;
    }
}
