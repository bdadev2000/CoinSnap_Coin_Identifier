package com.facebook;

import androidx.activity.result.contract.ActivityResultContract;
import com.facebook.CallbackManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface FacebookDialog<CONTENT, RESULT> {
    boolean canShow(CONTENT content);

    @NotNull
    ActivityResultContract<CONTENT, CallbackManager.ActivityResultParameters> createActivityResultContractForShowingDialog(@Nullable CallbackManager callbackManager);

    void registerCallback(@NotNull CallbackManager callbackManager, @NotNull FacebookCallback<RESULT> facebookCallback);

    void registerCallback(@NotNull CallbackManager callbackManager, @NotNull FacebookCallback<RESULT> facebookCallback, int i2);

    void show(CONTENT content);
}
