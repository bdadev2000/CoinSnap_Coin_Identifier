package com.cooldev.gba.emulator.gameboy.features.game.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class SavesCoherencyEngine {
    private static final long TOLERANCE = 30000;

    @NotNull
    private final SavesManager savesManager;

    @NotNull
    private final StatesManager statesManager;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public SavesCoherencyEngine(@NotNull SavesManager savesManager, @NotNull StatesManager statesManager) {
        a.s(savesManager, "savesManager");
        a.s(statesManager, "statesManager");
        this.savesManager = savesManager;
        this.statesManager = statesManager;
    }

    @NotNull
    public final SavesManager getSavesManager() {
        return this.savesManager;
    }

    @NotNull
    public final StatesManager getStatesManager() {
        return this.statesManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object shouldDiscardAutoSaveState(@org.jetbrains.annotations.NotNull com.cooldev.gba.emulator.gameboy.features.home.models.Game r8, @org.jetbrains.annotations.NotNull com.cooldev.gba.emulator.gameboy.features.home.models.CoreID r9, @org.jetbrains.annotations.NotNull h0.g r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.cooldev.gba.emulator.gameboy.features.game.utils.SavesCoherencyEngine$shouldDiscardAutoSaveState$1
            if (r0 == 0) goto L13
            r0 = r10
            com.cooldev.gba.emulator.gameboy.features.game.utils.SavesCoherencyEngine$shouldDiscardAutoSaveState$1 r0 = (com.cooldev.gba.emulator.gameboy.features.game.utils.SavesCoherencyEngine$shouldDiscardAutoSaveState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.cooldev.gba.emulator.gameboy.features.game.utils.SavesCoherencyEngine$shouldDiscardAutoSaveState$1 r0 = new com.cooldev.gba.emulator.gameboy.features.game.utils.SavesCoherencyEngine$shouldDiscardAutoSaveState$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r8 = r0.L$0
            com.cooldev.gba.emulator.gameboy.features.game.utils.SaveInfo r8 = (com.cooldev.gba.emulator.gameboy.features.game.utils.SaveInfo) r8
            kotlin.jvm.internal.q.m(r10)
            goto L73
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r0.L$2
            r9 = r8
            com.cooldev.gba.emulator.gameboy.features.home.models.CoreID r9 = (com.cooldev.gba.emulator.gameboy.features.home.models.CoreID) r9
            java.lang.Object r8 = r0.L$1
            com.cooldev.gba.emulator.gameboy.features.home.models.Game r8 = (com.cooldev.gba.emulator.gameboy.features.home.models.Game) r8
            java.lang.Object r2 = r0.L$0
            com.cooldev.gba.emulator.gameboy.features.game.utils.SavesCoherencyEngine r2 = (com.cooldev.gba.emulator.gameboy.features.game.utils.SavesCoherencyEngine) r2
            kotlin.jvm.internal.q.m(r10)
            goto L5c
        L47:
            kotlin.jvm.internal.q.m(r10)
            com.cooldev.gba.emulator.gameboy.features.game.utils.SavesManager r10 = r7.savesManager
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r0.label = r4
            java.lang.Object r10 = r10.getSaveRAMInfo(r8, r0)
            if (r10 != r1) goto L5b
            return r1
        L5b:
            r2 = r7
        L5c:
            com.cooldev.gba.emulator.gameboy.features.game.utils.SaveInfo r10 = (com.cooldev.gba.emulator.gameboy.features.game.utils.SaveInfo) r10
            com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager r2 = r2.statesManager
            r0.L$0 = r10
            r5 = 0
            r0.L$1 = r5
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r8 = r2.getAutoSaveInfo(r8, r9, r0)
            if (r8 != r1) goto L70
            return r1
        L70:
            r6 = r10
            r10 = r8
            r8 = r6
        L73:
            com.cooldev.gba.emulator.gameboy.features.game.utils.SaveInfo r10 = (com.cooldev.gba.emulator.gameboy.features.game.utils.SaveInfo) r10
            boolean r9 = r8.getExists()
            if (r9 == 0) goto L91
            boolean r9 = r10.getExists()
            if (r9 == 0) goto L91
            long r8 = r8.getDate()
            long r0 = r10.getDate()
            r2 = 30000(0x7530, double:1.4822E-319)
            long r0 = r0 + r2
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 <= 0) goto L91
            goto L92
        L91:
            r4 = 0
        L92:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.game.utils.SavesCoherencyEngine.shouldDiscardAutoSaveState(com.cooldev.gba.emulator.gameboy.features.home.models.Game, com.cooldev.gba.emulator.gameboy.features.home.models.CoreID, h0.g):java.lang.Object");
    }
}
