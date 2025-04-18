package com.swordfish.libretrodroid;

import android.content.Context;
import com.swordfish.libretrodroid.ShaderConfig;
import e0.w;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class GLRetroViewData {

    @Nullable
    private String coreFilePath;

    @Nullable
    private byte[] gameFileBytes;

    @Nullable
    private String gameFilePath;

    @NotNull
    private List<VirtualFile> gameVirtualFiles;
    private boolean preferLowLatencyAudio;
    private boolean rumbleEventsEnabled;

    @Nullable
    private byte[] saveRAMState;

    @NotNull
    private String savesDirectory;

    @NotNull
    private ShaderConfig shader;
    private boolean skipDuplicateFrames;

    @NotNull
    private String systemDirectory;

    @NotNull
    private Variable[] variables;

    public GLRetroViewData(@NotNull Context context) {
        p0.a.s(context, "context");
        this.gameVirtualFiles = w.f30218a;
        String absolutePath = context.getFilesDir().getAbsolutePath();
        p0.a.r(absolutePath, "context.filesDir.absolutePath");
        this.systemDirectory = absolutePath;
        String absolutePath2 = context.getFilesDir().getAbsolutePath();
        p0.a.r(absolutePath2, "context.filesDir.absolutePath");
        this.savesDirectory = absolutePath2;
        this.variables = new Variable[0];
        this.shader = ShaderConfig.Default.INSTANCE;
        this.rumbleEventsEnabled = true;
        this.preferLowLatencyAudio = true;
    }

    @Nullable
    public final String getCoreFilePath() {
        return this.coreFilePath;
    }

    @Nullable
    public final byte[] getGameFileBytes() {
        return this.gameFileBytes;
    }

    @Nullable
    public final String getGameFilePath() {
        return this.gameFilePath;
    }

    @NotNull
    public final List<VirtualFile> getGameVirtualFiles() {
        return this.gameVirtualFiles;
    }

    public final boolean getPreferLowLatencyAudio() {
        return this.preferLowLatencyAudio;
    }

    public final boolean getRumbleEventsEnabled() {
        return this.rumbleEventsEnabled;
    }

    @Nullable
    public final byte[] getSaveRAMState() {
        return this.saveRAMState;
    }

    @NotNull
    public final String getSavesDirectory() {
        return this.savesDirectory;
    }

    @NotNull
    public final ShaderConfig getShader() {
        return this.shader;
    }

    public final boolean getSkipDuplicateFrames() {
        return this.skipDuplicateFrames;
    }

    @NotNull
    public final String getSystemDirectory() {
        return this.systemDirectory;
    }

    @NotNull
    public final Variable[] getVariables() {
        return this.variables;
    }

    public final void setCoreFilePath(@Nullable String str) {
        this.coreFilePath = str;
    }

    public final void setGameFileBytes(@Nullable byte[] bArr) {
        this.gameFileBytes = bArr;
    }

    public final void setGameFilePath(@Nullable String str) {
        this.gameFilePath = str;
    }

    public final void setGameVirtualFiles(@NotNull List<VirtualFile> list) {
        p0.a.s(list, "<set-?>");
        this.gameVirtualFiles = list;
    }

    public final void setPreferLowLatencyAudio(boolean z2) {
        this.preferLowLatencyAudio = z2;
    }

    public final void setRumbleEventsEnabled(boolean z2) {
        this.rumbleEventsEnabled = z2;
    }

    public final void setSaveRAMState(@Nullable byte[] bArr) {
        this.saveRAMState = bArr;
    }

    public final void setSavesDirectory(@NotNull String str) {
        p0.a.s(str, "<set-?>");
        this.savesDirectory = str;
    }

    public final void setShader(@NotNull ShaderConfig shaderConfig) {
        p0.a.s(shaderConfig, "<set-?>");
        this.shader = shaderConfig;
    }

    public final void setSkipDuplicateFrames(boolean z2) {
        this.skipDuplicateFrames = z2;
    }

    public final void setSystemDirectory(@NotNull String str) {
        p0.a.s(str, "<set-?>");
        this.systemDirectory = str;
    }

    public final void setVariables(@NotNull Variable[] variableArr) {
        p0.a.s(variableArr, "<set-?>");
        this.variables = variableArr;
    }
}
