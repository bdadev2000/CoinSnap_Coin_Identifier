package x5;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e {
    public final WeakReference a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27382b;

    public e(View view, String viewMapKey) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewMapKey, "viewMapKey");
        this.a = new WeakReference(view);
        this.f27382b = viewMapKey;
    }

    public final View a() {
        WeakReference weakReference = this.a;
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }
}
