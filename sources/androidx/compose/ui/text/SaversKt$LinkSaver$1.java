package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.LinkAnnotation;
import b1.f0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
public final class SaversKt$LinkSaver$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$LinkSaver$1 f16985a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        LinkAnnotation.Url url = (LinkAnnotation.Url) obj2;
        String str = url.f16908a;
        SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.f16958j;
        return f0.b(str, SaversKt.a(url.f16909b, saverKt$Saver$1, (SaverScope) obj));
    }
}
