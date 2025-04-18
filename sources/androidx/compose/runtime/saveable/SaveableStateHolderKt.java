package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;

/* loaded from: classes4.dex */
public final class SaveableStateHolderKt {
    public static final SaveableStateHolder a(Composer composer) {
        composer.J(-796080049);
        SaveableStateHolderImpl saveableStateHolderImpl = (SaveableStateHolderImpl) RememberSaveableKt.c(new Object[0], SaveableStateHolderImpl.d, null, SaveableStateHolderKt$rememberSaveableStateHolder$1.f14522a, composer, 3072, 4);
        saveableStateHolderImpl.f14506c = (SaveableStateRegistry) composer.K(SaveableStateRegistryKt.f14529a);
        composer.D();
        return saveableStateHolderImpl;
    }
}
