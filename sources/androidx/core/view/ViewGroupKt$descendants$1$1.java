package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class ViewGroupKt$descendants$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroupKt$descendants$1$1 f18757a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        View view = (View) obj;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            return new ViewGroupKt$children$1(viewGroup).iterator();
        }
        return null;
    }
}
