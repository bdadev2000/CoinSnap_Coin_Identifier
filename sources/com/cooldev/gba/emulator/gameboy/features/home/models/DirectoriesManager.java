package com.cooldev.gba.emulator.gameboy.features.home.models;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class DirectoriesManager {
    public static final int $stable = 8;

    @NotNull
    private final Context appContext;

    public DirectoriesManager(@NotNull Context context) {
        a.s(context, "appContext");
        this.appContext = context;
    }

    @NotNull
    public final File getCoresDirectory() {
        File file = new File(this.appContext.getFilesDir(), "cores");
        file.mkdirs();
        return file;
    }

    @NotNull
    public final File getInternalRomsDirectory() {
        File file = new File(this.appContext.getExternalFilesDir(null), "roms");
        file.mkdirs();
        return file;
    }

    @d0.a
    @NotNull
    public final File getInternalStatesDirectory() {
        File file = new File(this.appContext.getFilesDir(), "states");
        file.mkdirs();
        return file;
    }

    @NotNull
    public final File getSavesDirectory() {
        File file = new File(this.appContext.getExternalFilesDir(null), "saves");
        file.mkdirs();
        return file;
    }

    @NotNull
    public final File getStatesDirectory() {
        File file = new File(this.appContext.getExternalFilesDir(null), "states");
        file.mkdirs();
        return file;
    }

    @NotNull
    public final File getStatesPreviewDirectory() {
        File file = new File(this.appContext.getExternalFilesDir(null), "state-previews");
        file.mkdirs();
        return file;
    }

    @NotNull
    public final File getSystemDirectory() {
        File file = new File(this.appContext.getFilesDir(), "system");
        file.mkdirs();
        return file;
    }
}
