package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import q0.l;

/* loaded from: classes2.dex */
public final class ActivityResultRegistryKt {
    public static final ManagedActivityResultLauncher a(ActivityResultContract activityResultContract, l lVar, Composer composer, int i2) {
        composer.t(-1408504823);
        MutableState k2 = SnapshotStateKt.k(activityResultContract, composer);
        MutableState k3 = SnapshotStateKt.k(lVar, composer);
        String str = (String) RememberSaveableKt.c(new Object[0], null, null, ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1.f209a, composer, 3080, 6);
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = LocalActivityResultRegistryOwner.f220a;
        composer.t(1418020823);
        ActivityResultRegistryOwner activityResultRegistryOwner = (ActivityResultRegistryOwner) composer.K(LocalActivityResultRegistryOwner.f220a);
        if (activityResultRegistryOwner == null) {
            Object obj = (Context) composer.K(AndroidCompositionLocals_androidKt.f16325b);
            while (true) {
                if (!(obj instanceof ContextWrapper)) {
                    obj = null;
                    break;
                }
                if (obj instanceof ActivityResultRegistryOwner) {
                    break;
                }
                obj = ((ContextWrapper) obj).getBaseContext();
            }
            activityResultRegistryOwner = (ActivityResultRegistryOwner) obj;
        }
        composer.H();
        if (activityResultRegistryOwner == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner".toString());
        }
        ActivityResultRegistry activityResultRegistry = activityResultRegistryOwner.getActivityResultRegistry();
        composer.t(-3687241);
        Object u2 = composer.u();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        if (u2 == composer$Companion$Empty$1) {
            u2 = new Object();
            composer.o(u2);
        }
        composer.H();
        ActivityResultLauncherHolder activityResultLauncherHolder = (ActivityResultLauncherHolder) u2;
        composer.t(-3687241);
        Object u3 = composer.u();
        if (u3 == composer$Companion$Empty$1) {
            u3 = new ManagedActivityResultLauncher(activityResultLauncherHolder, k2);
            composer.o(u3);
        }
        composer.H();
        ManagedActivityResultLauncher managedActivityResultLauncher = (ManagedActivityResultLauncher) u3;
        EffectsKt.a(activityResultRegistry, str, activityResultContract, new ActivityResultRegistryKt$rememberLauncherForActivityResult$1(activityResultLauncherHolder, activityResultRegistry, str, activityResultContract, k3), composer);
        composer.H();
        return managedActivityResultLauncher;
    }
}
