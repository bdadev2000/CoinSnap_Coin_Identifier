package com.cooldev.gba.emulator.gameboy.features.game.utils;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.game.models.DataFile;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import com.google.firebase.sessions.settings.RemoteSettings;
import e0.q;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class GameCacheUtils {
    public static final int $stable = 0;

    @NotNull
    public static final GameCacheUtils INSTANCE = new GameCacheUtils();

    private GameCacheUtils() {
    }

    private final String buildPath(String... strArr) {
        String str = File.separator;
        a.r(str, "separator");
        return q.e0(strArr, str, 62);
    }

    private final File getCacheDirForGame(String str, Game game, Context context) {
        File file = new File(context.getCacheDir(), buildPath(str, game.getSystemId()));
        file.mkdirs();
        return file;
    }

    @NotNull
    public final File getCacheFileForGame(@NotNull String str, @NotNull Context context, @NotNull Game game) {
        a.s(str, "folderName");
        a.s(context, "context");
        a.s(game, RouterName.GAME);
        return new File(getCacheDirForGame(str, game, context), game.getFileName());
    }

    @NotNull
    public final File getDataFileForGame(@NotNull String str, @NotNull Context context, @NotNull Game game, @NotNull DataFile dataFile) {
        a.s(str, "folderName");
        a.s(context, "context");
        a.s(game, RouterName.GAME);
        a.s(dataFile, "dataFile");
        return new File(getCacheDirForGame(str, game, context), RemoteSettings.FORWARD_SLASH_STRING + dataFile.getFileName());
    }
}
