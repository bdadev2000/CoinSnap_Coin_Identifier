package com.facebook.login;

import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder {

    @Nullable
    private ActivityResultLauncher<Intent> launcher;

    @Nullable
    public final ActivityResultLauncher<Intent> getLauncher() {
        return this.launcher;
    }

    public final void setLauncher(@Nullable ActivityResultLauncher<Intent> activityResultLauncher) {
        this.launcher = activityResultLauncher;
    }
}
