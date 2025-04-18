package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class CombinedModifier$toString$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final CombinedModifier$toString$1 f14681a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        Modifier.Element element = (Modifier.Element) obj2;
        if (str.length() == 0) {
            return element.toString();
        }
        return str + ", " + element;
    }
}
