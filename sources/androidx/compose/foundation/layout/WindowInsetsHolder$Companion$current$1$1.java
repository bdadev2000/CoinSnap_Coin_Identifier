package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class WindowInsetsHolder$Companion$current$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WindowInsetsHolder f4159a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f4160b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsHolder$Companion$current$1$1(WindowInsetsHolder windowInsetsHolder, View view) {
        super(1);
        this.f4159a = windowInsetsHolder;
        this.f4160b = view;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final WindowInsetsHolder windowInsetsHolder = this.f4159a;
        int i2 = windowInsetsHolder.f4156v;
        final View view = this.f4160b;
        if (i2 == 0) {
            InsetsListener insetsListener = windowInsetsHolder.w;
            ViewCompat.H(view, insetsListener);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(insetsListener);
            ViewCompat.O(view, insetsListener);
        }
        windowInsetsHolder.f4156v++;
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                WindowInsetsHolder windowInsetsHolder2 = WindowInsetsHolder.this;
                int i3 = windowInsetsHolder2.f4156v - 1;
                windowInsetsHolder2.f4156v = i3;
                if (i3 == 0) {
                    View view2 = view;
                    ViewCompat.H(view2, null);
                    ViewCompat.O(view2, null);
                    view2.removeOnAttachStateChangeListener(windowInsetsHolder2.w);
                }
            }
        };
    }
}
