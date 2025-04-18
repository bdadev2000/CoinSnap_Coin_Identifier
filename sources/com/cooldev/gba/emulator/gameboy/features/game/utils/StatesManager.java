package com.cooldev.gba.emulator.gameboy.features.game.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import b1.o0;
import com.cooldev.gba.emulator.gameboy.features.game.models.SaveState;
import com.cooldev.gba.emulator.gameboy.features.home.models.CoreID;
import com.cooldev.gba.emulator.gameboy.features.home.models.DirectoriesManager;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import com.cooldev.gba.emulator.gameboy.features.home.utils.UtilsKt;
import d0.b0;
import h0.g;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes.dex */
public final class StatesManager {
    private static final int FILE_ACCESS_RETRIES = 3;
    public static final int MAX_STATES = 4;

    @NotNull
    private final DirectoriesManager directoriesManager;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public StatesManager(@NotNull DirectoriesManager directoriesManager) {
        a.s(directoriesManager, "directoriesManager");
        this.directoriesManager = directoriesManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAutoSaveFileName(Game game) {
        return game.getFileName() + ".state";
    }

    @d0.a
    private final File getDeprecatedStateFile(String str) {
        return new File(this.directoriesManager.getInternalStatesDirectory(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getMetadataStateFile(String str, String str2) {
        File file = new File(this.directoriesManager.getStatesDirectory(), str2);
        file.mkdirs();
        return new File(file, androidx.compose.foundation.text.input.a.j(str, ".metadata"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getSaveState(java.lang.String r6, java.lang.String r7, h0.g r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager$getSaveState$1
            if (r0 == 0) goto L13
            r0 = r8
            com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager$getSaveState$1 r0 = (com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager$getSaveState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager$getSaveState$1 r0 = new com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager$getSaveState$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.jvm.internal.q.m(r8)
            d0.n r8 = (d0.n) r8
            java.lang.Object r6 = r8.f30137a
            goto L46
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.jvm.internal.q.m(r8)
            com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager$getSaveState$2 r8 = new com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager$getSaveState$2
            r8.<init>(r5, r6, r7, r3)
            r0.label = r4
            r6 = 3
            java.lang.Object r6 = com.cooldev.gba.emulator.gameboy.features.home.utils.UtilsKt.runCatchingWithRetry(r6, r8, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            boolean r7 = r6 instanceof d0.m
            if (r7 == 0) goto L4b
            goto L4c
        L4b:
            r3 = r6
        L4c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager.getSaveState(java.lang.String, java.lang.String, h0.g):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSlotSaveFileName(Game game, int i2) {
        return game.getFileName() + ".slot" + (i2 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getStateFile(String str, String str2) {
        File file = new File(this.directoriesManager.getStatesDirectory(), str2);
        file.mkdirs();
        return new File(file, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @d0.a
    public final File getStateFileOrDeprecated(String str, String str2) {
        File stateFile = getStateFile(str, str2);
        File deprecatedStateFile = getDeprecatedStateFile(str);
        return (stateFile.exists() || !deprecatedStateFile.exists()) ? stateFile : deprecatedStateFile;
    }

    private final String metadataToJson(SaveState.Metadata metadata) {
        return "{\"diskIndex\":" + metadata.getDiskIndex() + ",\"version\":" + metadata.getVersion() + '}';
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.cooldev.gba.emulator.gameboy.features.game.models.SaveState.Metadata parseMetadataFromJson(java.lang.String r6) {
        /*
            r5 = this;
            z0.h r0 = new z0.h
            java.lang.String r1 = "(?<=\"diskIndex\":)\\d+"
            r0.<init>(r1)
            z0.f r0 = z0.h.a(r0, r6)
            java.lang.String r1 = "group(...)"
            r2 = 0
            if (r0 == 0) goto L24
            java.util.regex.Matcher r0 = r0.f31472a
            java.lang.String r0 = r0.group()
            p0.a.r(r0, r1)
            java.lang.Integer r0 = z0.j.J0(r0)
            if (r0 == 0) goto L24
            int r0 = r0.intValue()
            goto L25
        L24:
            r0 = r2
        L25:
            z0.h r3 = new z0.h
            java.lang.String r4 = "(?<=\"version\":)\\d+"
            r3.<init>(r4)
            z0.f r6 = z0.h.a(r3, r6)
            if (r6 == 0) goto L45
            java.util.regex.Matcher r6 = r6.f31472a
            java.lang.String r6 = r6.group()
            p0.a.r(r6, r1)
            java.lang.Integer r6 = z0.j.J0(r6)
            if (r6 == 0) goto L45
            int r2 = r6.intValue()
        L45:
            com.cooldev.gba.emulator.gameboy.features.game.models.SaveState$Metadata r6 = new com.cooldev.gba.emulator.gameboy.features.game.models.SaveState$Metadata
            r6.<init>(r0, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager.parseMetadataFromJson(java.lang.String):com.cooldev.gba.emulator.gameboy.features.game.models.SaveState$Metadata");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object setSaveState(java.lang.String r11, java.lang.String r12, com.cooldev.gba.emulator.gameboy.features.game.models.SaveState r13, h0.g r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager$setSaveState$1
            if (r0 == 0) goto L13
            r0 = r14
            com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager$setSaveState$1 r0 = (com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager$setSaveState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager$setSaveState$1 r0 = new com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager$setSaveState$1
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.jvm.internal.q.m(r14)
            d0.n r14 = (d0.n) r14
            r14.getClass()
            goto L4c
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            kotlin.jvm.internal.q.m(r14)
            com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager$setSaveState$2 r14 = new com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager$setSaveState$2
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.label = r3
            r11 = 3
            java.lang.Object r11 = com.cooldev.gba.emulator.gameboy.features.home.utils.UtilsKt.runCatchingWithRetry(r11, r14, r0)
            if (r11 != r1) goto L4c
            return r1
        L4c:
            d0.b0 r11 = d0.b0.f30125a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager.setSaveState(java.lang.String, java.lang.String, com.cooldev.gba.emulator.gameboy.features.game.models.SaveState, h0.g):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeMetadataToDisk(String str, String str2, SaveState.Metadata metadata) {
        File metadataStateFile = getMetadataStateFile(str, str2);
        String metadataToJson = metadataToJson(metadata);
        Charset charset = z0.a.f31458a;
        a.s(metadataStateFile, "<this>");
        a.s(metadataToJson, "text");
        a.s(charset, "charset");
        byte[] bytes = metadataToJson.getBytes(charset);
        a.r(bytes, "getBytes(...)");
        q.p(metadataStateFile, bytes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeStateToDisk(String str, String str2, byte[] bArr) {
        UtilsKt.writeBytesCompressed(getStateFile(str, str2), bArr);
    }

    @Nullable
    public final Object getAutoSave(@NotNull Game game, @NotNull CoreID coreID, @NotNull g gVar) {
        return e.G(gVar, o0.f22356b, new StatesManager$getAutoSave$2(this, game, coreID, null));
    }

    @Nullable
    public final Object getAutoSaveInfo(@NotNull Game game, @NotNull CoreID coreID, @NotNull g gVar) {
        return e.G(gVar, o0.f22356b, new StatesManager$getAutoSaveInfo$2(this, game, coreID, null));
    }

    @Nullable
    public final Object getSavedSlotsInfo(@NotNull Game game, @NotNull CoreID coreID, @NotNull g gVar) {
        return e.G(gVar, o0.f22356b, new StatesManager$getSavedSlotsInfo$2(this, game, coreID, null));
    }

    @Nullable
    public final Object getSlotSave(@NotNull Game game, @NotNull CoreID coreID, int i2, @NotNull g gVar) {
        return e.G(gVar, o0.f22356b, new StatesManager$getSlotSave$2(i2, this, game, coreID, null));
    }

    @Nullable
    public final Object setAutoSave(@NotNull Game game, @NotNull CoreID coreID, @NotNull SaveState saveState, @NotNull g gVar) {
        Object G = e.G(gVar, o0.f22356b, new StatesManager$setAutoSave$2(this, game, coreID, saveState, null));
        return G == i0.a.f30806a ? G : b0.f30125a;
    }

    @Nullable
    public final Object setSlotSave(@NotNull Game game, @NotNull SaveState saveState, @NotNull CoreID coreID, int i2, @NotNull g gVar) {
        Object G = e.G(gVar, o0.f22356b, new StatesManager$setSlotSave$2(i2, this, game, coreID, saveState, null));
        return G == i0.a.f30806a ? G : b0.f30125a;
    }
}
