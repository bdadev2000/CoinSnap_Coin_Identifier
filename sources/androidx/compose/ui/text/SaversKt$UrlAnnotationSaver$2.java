package androidx.compose.ui.text;

import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class SaversKt$UrlAnnotationSaver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$UrlAnnotationSaver$2 f17014a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        String str = obj != null ? (String) obj : null;
        a.p(str);
        return new UrlAnnotation(str);
    }
}
