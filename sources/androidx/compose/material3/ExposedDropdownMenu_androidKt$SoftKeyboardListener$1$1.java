package androidx.compose.material3;

import android.view.View;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f9369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f9370b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1(View view, q0.a aVar) {
        super(1);
        this.f9369a = view;
        this.f9370b = aVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 = new ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1(this.f9369a, this.f9370b);
        return new DisposableEffectResult() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$12 = ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1.this;
                boolean z2 = exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$12.f9371a;
                View view = exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$12.f9372b;
                if (z2) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$12);
                    exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$12.f9371a = false;
                }
                view.removeOnAttachStateChangeListener(exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$12);
            }
        };
    }
}
