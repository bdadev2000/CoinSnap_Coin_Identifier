package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

@StabilityInferred
/* loaded from: classes3.dex */
public final class LocalOnBackPressedDispatcherOwner {

    /* renamed from: a, reason: collision with root package name */
    public static final DynamicProvidableCompositionLocal f224a = CompositionLocalKt.c(LocalOnBackPressedDispatcherOwner$LocalOnBackPressedDispatcherOwner$1.f225a);

    public static OnBackPressedDispatcherOwner a(Composer composer) {
        composer.t(-2068013981);
        OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) composer.K(f224a);
        composer.t(1680121597);
        if (onBackPressedDispatcherOwner == null) {
            onBackPressedDispatcherOwner = ViewTreeOnBackPressedDispatcherOwner.a((View) composer.K(AndroidCompositionLocals_androidKt.f16327f));
        }
        composer.H();
        if (onBackPressedDispatcherOwner == null) {
            Object obj = (Context) composer.K(AndroidCompositionLocals_androidKt.f16325b);
            while (true) {
                if (!(obj instanceof ContextWrapper)) {
                    obj = null;
                    break;
                }
                if (obj instanceof OnBackPressedDispatcherOwner) {
                    break;
                }
                obj = ((ContextWrapper) obj).getBaseContext();
            }
            onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) obj;
        }
        composer.H();
        return onBackPressedDispatcherOwner;
    }
}
