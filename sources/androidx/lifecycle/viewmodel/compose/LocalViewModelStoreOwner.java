package androidx.lifecycle.viewmodel.compose;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;

@StabilityInferred
/* loaded from: classes3.dex */
public final class LocalViewModelStoreOwner {

    /* renamed from: a, reason: collision with root package name */
    public static final DynamicProvidableCompositionLocal f20240a = CompositionLocalKt.c(LocalViewModelStoreOwner$LocalViewModelStoreOwner$1.f20241a);

    public static ViewModelStoreOwner a(Composer composer) {
        composer.t(-584162872);
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) composer.K(f20240a);
        if (viewModelStoreOwner == null) {
            composer.t(1382572291);
            viewModelStoreOwner = ViewTreeViewModelStoreOwner.a((View) composer.K(AndroidCompositionLocals_androidKt.f16327f));
            composer.H();
        }
        composer.H();
        return viewModelStoreOwner;
    }
}
