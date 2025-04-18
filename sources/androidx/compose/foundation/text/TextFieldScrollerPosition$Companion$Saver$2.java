package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
public final class TextFieldScrollerPosition$Companion$Saver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final TextFieldScrollerPosition$Companion$Saver$2 f6202a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(1);
        p0.a.q(obj2, "null cannot be cast to non-null type kotlin.Boolean");
        Orientation orientation = ((Boolean) obj2).booleanValue() ? Orientation.f3394a : Orientation.f3395b;
        Object obj3 = list.get(0);
        p0.a.q(obj3, "null cannot be cast to non-null type kotlin.Float");
        return new TextFieldScrollerPosition(orientation, ((Float) obj3).floatValue());
    }
}
