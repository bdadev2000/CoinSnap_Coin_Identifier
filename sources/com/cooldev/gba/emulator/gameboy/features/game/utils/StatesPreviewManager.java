package com.cooldev.gba.emulator.gameboy.features.game.utils;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import b1.o0;
import com.cooldev.gba.emulator.gameboy.features.home.models.CoreID;
import com.cooldev.gba.emulator.gameboy.features.home.models.DirectoriesManager;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import h0.g;
import java.io.File;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class StatesPreviewManager {

    @NotNull
    private final DirectoriesManager directoriesManager;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float PREVIEW_SIZE_DP = 96.0f;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final float getPREVIEW_SIZE_DP() {
            return StatesPreviewManager.PREVIEW_SIZE_DP;
        }
    }

    public StatesPreviewManager(@NotNull DirectoriesManager directoriesManager) {
        a.s(directoriesManager, "directoriesManager");
        this.directoriesManager = directoriesManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getPreviewFile(String str, String str2) {
        File file = new File(this.directoriesManager.getStatesPreviewDirectory(), str2);
        file.mkdirs();
        return new File(file, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSlotScreenshotName(Game game, int i2) {
        return game.getFileName() + ".slot" + (i2 + 1) + ".jpg";
    }

    @Nullable
    public final Object getPreviewForSlot(@NotNull Game game, @NotNull CoreID coreID, int i2, int i3, @NotNull g gVar) {
        return e.G(gVar, o0.f22356b, new StatesPreviewManager$getPreviewForSlot$2(this, game, i2, coreID, i3, null));
    }

    @Nullable
    public final Object setPreviewForSlot(@NotNull Game game, @NotNull Bitmap bitmap, @NotNull CoreID coreID, int i2, @NotNull g gVar) {
        return e.G(gVar, o0.f22356b, new StatesPreviewManager$setPreviewForSlot$2(this, game, i2, coreID, bitmap, null));
    }
}
