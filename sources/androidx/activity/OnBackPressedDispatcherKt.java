package androidx.activity;

import androidx.lifecycle.LifecycleOwner;
import q0.l;

/* loaded from: classes4.dex */
public final class OnBackPressedDispatcherKt {
    public static void a(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, final l lVar) {
        p0.a.s(onBackPressedDispatcher, "<this>");
        final boolean z2 = true;
        OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback(z2) { // from class: androidx.activity.OnBackPressedDispatcherKt$addCallback$callback$1
            @Override // androidx.activity.OnBackPressedCallback
            public final void b() {
                lVar.invoke(this);
            }
        };
        if (lifecycleOwner != null) {
            onBackPressedDispatcher.a(lifecycleOwner, onBackPressedCallback);
        } else {
            onBackPressedDispatcher.b(onBackPressedCallback);
        }
    }
}
