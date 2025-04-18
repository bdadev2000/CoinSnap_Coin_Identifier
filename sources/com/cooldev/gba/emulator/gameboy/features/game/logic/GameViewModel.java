package com.cooldev.gba.emulator.gameboy.features.game.logic;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.PixelCopy;
import android.view.SurfaceView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.documentfile.provider.DocumentFile;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import b1.d0;
import b1.f0;
import com.cooldev.gba.emulator.gameboy.features.dialogs.loading_dialog.logic.LoadingDialogViewModel;
import com.cooldev.gba.emulator.gameboy.features.game.models.DataFile;
import com.cooldev.gba.emulator.gameboy.features.game.models.GameData;
import com.cooldev.gba.emulator.gameboy.features.game.models.RomFiles;
import com.cooldev.gba.emulator.gameboy.features.game.models.SaveState;
import com.cooldev.gba.emulator.gameboy.features.game.utils.GameCacheUtils;
import com.cooldev.gba.emulator.gameboy.features.game.utils.GraphicsUtils;
import com.cooldev.gba.emulator.gameboy.features.game.utils.SaveInfo;
import com.cooldev.gba.emulator.gameboy.features.game.utils.SavesManager;
import com.cooldev.gba.emulator.gameboy.features.game.utils.StatesPreviewManager;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.Event;
import com.cooldev.gba.emulator.gameboy.features.home.models.CoreID;
import com.cooldev.gba.emulator.gameboy.features.home.models.DirectoriesManager;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import com.cooldev.gba.emulator.gameboy.features.home.models.SystemCoreConfig;
import com.cooldev.gba.emulator.gameboy.features.home.utils.UtilsKt;
import com.cooldev.gba.emulator.gameboy.local.storage.GamePrefUtils;
import com.cooldev.gba.emulator.gameboy.network.models.SlackMessage;
import com.cooldev.gba.emulator.gameboy.network.repo.SlackApiRepositoryImpl;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import com.swordfish.libretrodroid.GLRetroView;
import com.swordfish.libretrodroid.GLRetroViewData;
import com.swordfish.libretrodroid.ShaderConfig;
import com.swordfish.libretrodroid.Variable;
import com.swordfish.libretrodroid.VirtualFile;
import d0.b0;
import e0.u;
import e1.g1;
import e1.i1;
import e1.m0;
import e1.o0;
import e1.t0;
import h0.g;
import h0.n;
import j0.e;
import j0.i;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import p0.a;
import q0.l;
import q0.p;

@StabilityInferred
/* loaded from: classes.dex */
public final class GameViewModel extends AndroidViewModel {

    @NotNull
    private final m0 _state;

    @SuppressLint({"StaticFieldLeak"})
    private final Context context;

    @Nullable
    private final Game game;
    private final boolean isRestart;

    @NotNull
    private final LoadingDialogViewModel loadingDialogViewModel;

    @NotNull
    private final g1 state;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Nullable
    private static final String LOG_TAG = g0.a(GameViewModel.class).c();

    @e(c = "com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$1", f = "GameViewModel.kt", l = {Opcodes.DNEG}, m = "invokeSuspend")
    /* renamed from: com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends i implements p {
        int label;

        /* renamed from: com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C01111 extends r implements l {
            final /* synthetic */ GameViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01111(GameViewModel gameViewModel) {
                super(1);
                this.this$0 = gameViewModel;
            }

            @Override // q0.l
            @NotNull
            public final GameState invoke(@NotNull GameState gameState) {
                a.s(gameState, "it");
                Game game = this.this$0.game;
                boolean audioEnabled = this.this$0.game.getAudioEnabled();
                return GameState.copy$default(gameState, game, null, null, this.this$0.game.getFastForwardEnabled(), this.this$0.game.getAutoSaveEnable(), this.this$0.game.isFirstTimeInPremium(), audioEnabled, null, null, null, 902, null);
            }
        }

        public AnonymousClass1(g gVar) {
            super(2, gVar);
        }

        @Override // j0.a
        @NotNull
        public final g create(@Nullable Object obj, @NotNull g gVar) {
            return new AnonymousClass1(gVar);
        }

        @Override // q0.p
        @Nullable
        public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
            return ((AnonymousClass1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.label;
            if (i2 == 0) {
                q.m(obj);
                GameViewModel gameViewModel = GameViewModel.this;
                gameViewModel.updateState(new C01111(gameViewModel));
                GameViewModel gameViewModel2 = GameViewModel.this;
                this.label = 1;
                if (gameViewModel2.launchGameAsync(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
            }
            GameViewModel.this.getSavedSlotsInfo();
            GameViewModel.this.getLoadSlotsInfo();
            return b0.f30125a;
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameViewModel(@NotNull Application application, @NotNull LoadingDialogViewModel loadingDialogViewModel, @Nullable Game game, boolean z2) {
        super(application);
        a.s(application, "application");
        a.s(loadingDialogViewModel, "loadingDialogViewModel");
        this.loadingDialogViewModel = loadingDialogViewModel;
        this.game = game;
        this.isRestart = z2;
        Context applicationContext = application.getApplicationContext();
        this.context = applicationContext;
        i1 c2 = t0.c(new GameState(null, null, null, false, false, false, false, null, null, null, 1023, null));
        this._state = c2;
        this.state = new o0(c2);
        if (game == null) {
            MultiNavigationAppStateKt.getLocalNavigationState().getRootNavigation().pop();
            b0.a.b(applicationContext, "No game selected. Please select a game to launch.").show();
        } else {
            Log.d("DocumentFileParser", "Game created: " + game);
            kotlin.jvm.internal.e.v(ViewModelKt.a(this), null, 0, new AnonymousClass1(null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getControllerConfigs(SystemCoreConfig systemCoreConfig, g gVar) {
        return kotlin.jvm.internal.e.G(gVar, b1.o0.f22356b, new GameViewModel$getControllerConfigs$2(systemCoreConfig, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SaveState getCurrentSaveState() {
        GameData gameData;
        byte[] bArr;
        GLRetroView retroView = ((GameState) ((i1) this._state).getValue()).getRetroView();
        if (retroView == null || (gameData = ((GameState) ((i1) this._state).getValue()).getGameData()) == null) {
            return null;
        }
        int currentDisk = gameData.getGameSystem().getHasMultiDiskSupport() ? retroView.getCurrentDisk() : 0;
        try {
            bArr = retroView.serializeState();
        } catch (Exception unused) {
            bArr = new byte[0];
        }
        return new SaveState(bArr, new SaveState.Metadata(currentDisk, gameData.getSystemCoreConfig().getStatesVersion()));
    }

    private final File getDataFileStandard(Game game, DataFile dataFile) {
        GameCacheUtils gameCacheUtils = GameCacheUtils.INSTANCE;
        Context context = this.context;
        a.r(context, "context");
        File dataFileForGame = gameCacheUtils.getDataFileForGame(GameViewModelKt.SAF_CACHE_SUBFOLDER, context, game, dataFile);
        if (dataFileForGame.exists()) {
            return dataFileForGame;
        }
        InputStream openInputStream = this.context.getContentResolver().openInputStream(Uri.parse(dataFile.getFileUri()));
        a.p(openInputStream);
        UtilsKt.writeToFile(openInputStream, dataFileForGame);
        return dataFileForGame;
    }

    private final RomFiles.Virtual.Entry getDataFileVirtual(DataFile dataFile) {
        String str = "/virtual/file/path/" + dataFile.getFileName();
        ParcelFileDescriptor openFileDescriptor = this.context.getContentResolver().openFileDescriptor(Uri.parse(dataFile.getFileUri()), "r");
        a.p(openFileDescriptor);
        return new RomFiles.Virtual.Entry(str, openFileDescriptor);
    }

    private final RomFiles getGameRomFilesStandard(Game game, List<DataFile> list, boolean z2) {
        DocumentFile a2 = DocumentFile.a(this.context, Uri.parse(game.getFileUri()));
        if (UtilsKt.isZipped(a2) && !a.g(a2.b(), game.getFileName()) && list.isEmpty()) {
            return getGameRomFilesZipped(game, a2);
        }
        if (z2) {
            return getGameRomFilesVirtual(game, list);
        }
        return getGameRomFilesStandard(game, list, a2);
    }

    private final RomFiles getGameRomFilesVirtual(Game game, List<DataFile> list) {
        RomFiles.Virtual.Entry gameRomVirtual = getGameRomVirtual(game);
        List<DataFile> list2 = list;
        ArrayList arrayList = new ArrayList(e0.q.M(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(getDataFileVirtual((DataFile) it.next()));
        }
        return new RomFiles.Virtual(u.P0(arrayList, f0.u(gameRomVirtual)));
    }

    private final RomFiles getGameRomFilesZipped(Game game, DocumentFile documentFile) {
        GameCacheUtils gameCacheUtils = GameCacheUtils.INSTANCE;
        Context context = this.context;
        a.r(context, "context");
        File cacheFileForGame = gameCacheUtils.getCacheFileForGame(GameViewModelKt.SAF_CACHE_SUBFOLDER, context, game);
        if (cacheFileForGame.exists()) {
            return new RomFiles.Standard(f0.u(cacheFileForGame));
        }
        UtilsKt.extractEntryToFile(new ZipInputStream(this.context.getContentResolver().openInputStream(documentFile.d())), game.getFileName(), cacheFileForGame);
        return new RomFiles.Standard(f0.u(cacheFileForGame));
    }

    private final File getGameRomStandard(Game game, DocumentFile documentFile) {
        GameCacheUtils gameCacheUtils = GameCacheUtils.INSTANCE;
        Context context = this.context;
        a.r(context, "context");
        File cacheFileForGame = gameCacheUtils.getCacheFileForGame(GameViewModelKt.SAF_CACHE_SUBFOLDER, context, game);
        if (cacheFileForGame.exists()) {
            return cacheFileForGame;
        }
        InputStream openInputStream = this.context.getContentResolver().openInputStream(documentFile.d());
        a.p(openInputStream);
        UtilsKt.writeToFile(openInputStream, cacheFileForGame);
        return cacheFileForGame;
    }

    private final RomFiles.Virtual.Entry getGameRomVirtual(Game game) {
        String str = "/virtual/file/path/" + game.getFileName();
        ParcelFileDescriptor openFileDescriptor = this.context.getContentResolver().openFileDescriptor(Uri.parse(game.getFileUri()), "r");
        a.p(openFileDescriptor);
        return new RomFiles.Virtual.Entry(str, openFileDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getLoadSlotsInfo() {
        GameData gameData = ((GameState) ((i1) this._state).getValue()).getGameData();
        if (gameData == null || this.game == null) {
            return;
        }
        kotlin.jvm.internal.e.v(ViewModelKt.a(this), null, 0, new GameViewModel$getLoadSlotsInfo$1(this, gameData, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: getQuickSaveData-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m199getQuickSaveDataBWLJW6A(android.content.Context r9, com.cooldev.gba.emulator.gameboy.features.home.models.Game r10, com.cooldev.gba.emulator.gameboy.features.home.models.SystemCoreConfig r11, h0.g r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$getQuickSaveData$1
            if (r0 == 0) goto L13
            r0 = r12
            com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$getQuickSaveData$1 r0 = (com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$getQuickSaveData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$getQuickSaveData$1 r0 = new com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$getQuickSaveData$1
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.jvm.internal.q.m(r12)     // Catch: java.lang.Throwable -> L2c
            goto Lb5
        L2c:
            r9 = move-exception
            goto Lb9
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            java.lang.Object r9 = r0.L$2
            r11 = r9
            com.cooldev.gba.emulator.gameboy.features.home.models.SystemCoreConfig r11 = (com.cooldev.gba.emulator.gameboy.features.home.models.SystemCoreConfig) r11
            java.lang.Object r9 = r0.L$1
            r10 = r9
            com.cooldev.gba.emulator.gameboy.features.home.models.Game r10 = (com.cooldev.gba.emulator.gameboy.features.home.models.Game) r10
            java.lang.Object r9 = r0.L$0
            android.content.Context r9 = (android.content.Context) r9
            kotlin.jvm.internal.q.m(r12)     // Catch: java.lang.Throwable -> L2c
            goto L89
        L49:
            kotlin.jvm.internal.q.m(r12)
            e1.m0 r12 = r8._state
            e1.i1 r12 = (e1.i1) r12
            java.lang.Object r12 = r12.getValue()
            com.cooldev.gba.emulator.gameboy.features.game.logic.GameState r12 = (com.cooldev.gba.emulator.gameboy.features.game.logic.GameState) r12
            boolean r12 = r12.getAutoSaveEnable()
            if (r12 != 0) goto L5d
            return r5
        L5d:
            com.cooldev.gba.emulator.gameboy.features.game.utils.SavesCoherencyEngine r12 = new com.cooldev.gba.emulator.gameboy.features.game.utils.SavesCoherencyEngine     // Catch: java.lang.Throwable -> L2c
            com.cooldev.gba.emulator.gameboy.features.game.utils.SavesManager r2 = new com.cooldev.gba.emulator.gameboy.features.game.utils.SavesManager     // Catch: java.lang.Throwable -> L2c
            com.cooldev.gba.emulator.gameboy.features.home.models.DirectoriesManager r6 = new com.cooldev.gba.emulator.gameboy.features.home.models.DirectoriesManager     // Catch: java.lang.Throwable -> L2c
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L2c
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L2c
            com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager r6 = new com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager     // Catch: java.lang.Throwable -> L2c
            com.cooldev.gba.emulator.gameboy.features.home.models.DirectoriesManager r7 = new com.cooldev.gba.emulator.gameboy.features.home.models.DirectoriesManager     // Catch: java.lang.Throwable -> L2c
            r7.<init>(r9)     // Catch: java.lang.Throwable -> L2c
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L2c
            r12.<init>(r2, r6)     // Catch: java.lang.Throwable -> L2c
            com.cooldev.gba.emulator.gameboy.features.home.models.CoreID r2 = r11.getCoreID()     // Catch: java.lang.Throwable -> L2c
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L2c
            r0.L$1 = r10     // Catch: java.lang.Throwable -> L2c
            r0.L$2 = r11     // Catch: java.lang.Throwable -> L2c
            r0.label = r4     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r12 = r12.shouldDiscardAutoSaveState(r10, r2, r0)     // Catch: java.lang.Throwable -> L2c
            if (r12 != r1) goto L89
            return r1
        L89:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L2c
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L2c
            r12 = r12 ^ r4
            boolean r2 = r11.getStatesSupported()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto Lbd
            if (r12 == 0) goto Lbd
            com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager r12 = new com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager     // Catch: java.lang.Throwable -> L2c
            com.cooldev.gba.emulator.gameboy.features.home.models.DirectoriesManager r2 = new com.cooldev.gba.emulator.gameboy.features.home.models.DirectoriesManager     // Catch: java.lang.Throwable -> L2c
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L2c
            r12.<init>(r2)     // Catch: java.lang.Throwable -> L2c
            com.cooldev.gba.emulator.gameboy.features.home.models.CoreID r9 = r11.getCoreID()     // Catch: java.lang.Throwable -> L2c
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L2c
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L2c
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L2c
            r0.label = r3     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r12 = r12.getAutoSave(r10, r9, r0)     // Catch: java.lang.Throwable -> L2c
            if (r12 != r1) goto Lb5
            return r1
        Lb5:
            r5 = r12
            com.cooldev.gba.emulator.gameboy.features.game.models.SaveState r5 = (com.cooldev.gba.emulator.gameboy.features.game.models.SaveState) r5     // Catch: java.lang.Throwable -> L2c
            goto Lbd
        Lb9:
            d0.m r5 = kotlin.jvm.internal.q.d(r9)
        Lbd:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel.m199getQuickSaveDataBWLJW6A(android.content.Context, com.cooldev.gba.emulator.gameboy.features.home.models.Game, com.cooldev.gba.emulator.gameboy.features.home.models.SystemCoreConfig, h0.g):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getSaveStateBitmap(Context context, StatesPreviewManager statesPreviewManager, SaveInfo saveInfo, Game game, CoreID coreID, int i2, g gVar) {
        if (saveInfo.getExists()) {
            return statesPreviewManager.getPreviewForSlot(game, coreID, i2, a.t0(GraphicsUtils.INSTANCE.convertDpToPixel(96.0f, context)), gVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getSavedSlotsInfo() {
        GameData gameData = ((GameState) ((i1) this._state).getValue()).getGameData();
        if (gameData == null || this.game == null) {
            return;
        }
        kotlin.jvm.internal.e.v(ViewModelKt.a(this), null, 0, new GameViewModel$getSavedSlotsInfo$1(this, gameData, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|8))|127|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00a8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00a2, code lost:
    
        r16 = r5;
        r4 = r13;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0026. Please report as an issue. */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00a4: MOVE (r4 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:126:0x00a2 */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0191 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x026d A[Catch: all -> 0x0271, Exception -> 0x0276, TRY_LEAVE, TryCatch #11 {Exception -> 0x0276, all -> 0x0271, blocks: (B:38:0x025d, B:40:0x026d), top: B:37:0x025d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0221 A[Catch: all -> 0x0279, TryCatch #6 {all -> 0x0279, blocks: (B:60:0x020f, B:62:0x0221, B:65:0x0233, B:69:0x027c, B:71:0x0282), top: B:59:0x020f }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x027c A[Catch: all -> 0x0279, TRY_ENTER, TryCatch #6 {all -> 0x0279, blocks: (B:60:0x020f, B:62:0x0221, B:65:0x0233, B:69:0x027c, B:71:0x0282), top: B:59:0x020f }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b2 A[Catch: all -> 0x01c2, LOOP:0: B:87:0x01ac->B:89:0x01b2, LOOP_END, TryCatch #1 {all -> 0x01c2, blocks: (B:86:0x0199, B:87:0x01ac, B:89:0x01b2, B:91:0x01c7), top: B:85:0x0199 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object launchGameAsync(h0.g r19) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel.launchGameAsync(h0.g):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean loadSaveState(SaveState saveState) {
        GameData gameData;
        GLRetroView retroView = ((GameState) ((i1) this._state).getValue()).getRetroView();
        if (retroView == null || (gameData = ((GameState) ((i1) this._state).getValue()).getGameData()) == null || gameData.getSystemCoreConfig().getStatesVersion() != saveState.getMetadata().getVersion()) {
            return false;
        }
        if (gameData.getGameSystem().getHasMultiDiskSupport() && retroView.getAvailableDisks() > 1 && retroView.getCurrentDisk() != saveState.getMetadata().getDiskIndex()) {
            retroView.changeDisk(saveState.getMetadata().getDiskIndex());
        }
        return retroView.unserializeState(saveState.getState());
    }

    public static /* synthetic */ void onAutoSaveSwitchButton$default(GameViewModel gameViewModel, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        gameViewModel.onAutoSaveSwitchButton(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x008e -> B:11:0x0091). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object restoreAutoSaveAsync(com.cooldev.gba.emulator.gameboy.features.game.models.SaveState r8, h0.g r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$restoreAutoSaveAsync$1
            if (r0 == 0) goto L13
            r0 = r9
            com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$restoreAutoSaveAsync$1 r0 = (com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$restoreAutoSaveAsync$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$restoreAutoSaveAsync$1 r0 = new com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$restoreAutoSaveAsync$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            int r8 = r0.I$0
            java.lang.Object r2 = r0.L$1
            com.cooldev.gba.emulator.gameboy.features.game.models.SaveState r2 = (com.cooldev.gba.emulator.gameboy.features.game.models.SaveState) r2
            java.lang.Object r4 = r0.L$0
            com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel r4 = (com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel) r4
            kotlin.jvm.internal.q.m(r9)
            goto L91
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            java.lang.Object r8 = r0.L$1
            com.cooldev.gba.emulator.gameboy.features.game.models.SaveState r8 = (com.cooldev.gba.emulator.gameboy.features.game.models.SaveState) r8
            java.lang.Object r2 = r0.L$0
            com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel r2 = (com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel) r2
            kotlin.jvm.internal.q.m(r9)
            goto L73
        L48:
            kotlin.jvm.internal.q.m(r9)
            e1.m0 r9 = r7._state
            e1.i1 r9 = (e1.i1) r9
            java.lang.Object r9 = r9.getValue()
            com.cooldev.gba.emulator.gameboy.features.game.logic.GameState r9 = (com.cooldev.gba.emulator.gameboy.features.game.logic.GameState) r9
            com.swordfish.libretrodroid.GLRetroView r9 = r9.getRetroView()
            if (r9 != 0) goto L5d
        L5b:
            r2 = r7
            goto L73
        L5d:
            e1.h r9 = r9.getGLRetroEvents()
            com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$restoreAutoSaveAsync$$inlined$waitGLEvent$1 r2 = new com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$restoreAutoSaveAsync$$inlined$waitGLEvent$1
            r2.<init>()
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = p0.a.e0(r2, r0)
            if (r9 != r1) goto L5b
            return r1
        L73:
            r9 = 10
            r4 = r2
            r2 = r8
            r8 = r9
        L78:
            boolean r9 = r4.loadSaveState(r2)
            if (r9 != 0) goto L94
            if (r8 <= 0) goto L94
            r0.L$0 = r4
            r0.L$1 = r2
            r0.I$0 = r8
            r0.label = r3
            r5 = 200(0xc8, double:9.9E-322)
            java.lang.Object r9 = p0.a.L(r5, r0)
            if (r9 != r1) goto L91
            return r1
        L91:
            int r8 = r8 + (-1)
            goto L78
        L94:
            d0.b0 r8 = d0.b0.f30125a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel.restoreAutoSaveAsync(com.cooldev.gba.emulator.gameboy.features.game.models.SaveState, h0.g):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object saveRAM(g gVar) {
        GLRetroView retroView;
        byte[] bArr;
        Game game = ((GameState) ((i1) this._state).getValue()).getGame();
        b0 b0Var = b0.f30125a;
        if (game == null || (retroView = ((GameState) ((i1) this._state).getValue()).getRetroView()) == null) {
            return b0Var;
        }
        try {
            bArr = retroView.serializeSRAM();
        } catch (Exception unused) {
            bArr = new byte[0];
        }
        Context context = this.context;
        a.r(context, "context");
        Object saveRAM = new SavesManager(new DirectoriesManager(context)).setSaveRAM(game, bArr, gVar);
        return saveRAM == i0.a.f30806a ? saveRAM : b0Var;
    }

    private final void setupRetroView(GameData gameData) {
        try {
            Context context = this.context;
            a.r(context, "context");
            Context context2 = this.context;
            a.r(context2, "context");
            GLRetroViewData gLRetroViewData = new GLRetroViewData(context2);
            gLRetroViewData.setCoreFilePath(gameData.getCoreLibrary());
            RomFiles romFiles = gameData.getRomFiles();
            if (romFiles instanceof RomFiles.Standard) {
                gLRetroViewData.setGameFilePath(((File) u.E0(((RomFiles.Standard) romFiles).getFiles())).getAbsolutePath());
            } else if (romFiles instanceof RomFiles.Virtual) {
                List<RomFiles.Virtual.Entry> files = ((RomFiles.Virtual) romFiles).getFiles();
                ArrayList arrayList = new ArrayList(e0.q.M(files, 10));
                for (RomFiles.Virtual.Entry entry : files) {
                    arrayList.add(new VirtualFile(entry.getFilePath(), entry.getFd()));
                }
                gLRetroViewData.setGameVirtualFiles(arrayList);
            }
            gLRetroViewData.setGameFileBytes(null);
            gLRetroViewData.setVariables(new Variable[0]);
            gLRetroViewData.setSaveRAMState(gameData.getSaveRAMData());
            gLRetroViewData.setShader(ShaderConfig.Default.INSTANCE);
            gLRetroViewData.setRumbleEventsEnabled(true);
            gLRetroViewData.setPreferLowLatencyAudio(true);
            String absolutePath = this.context.getFilesDir().getAbsolutePath();
            a.r(absolutePath, "getAbsolutePath(...)");
            gLRetroViewData.setSystemDirectory(absolutePath);
            String absolutePath2 = this.context.getFilesDir().getAbsolutePath();
            a.r(absolutePath2, "getAbsolutePath(...)");
            gLRetroViewData.setSavesDirectory(absolutePath2);
            updateState(new GameViewModel$setupRetroView$1(new GLRetroView(context, gLRetroViewData)));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object takeScreenshot(final SurfaceView surfaceView, int i2, g gVar) {
        final n nVar = new n(f0.r(gVar));
        try {
            final float max = i2 / Math.max(surfaceView.getWidth(), surfaceView.getHeight());
            float f2 = 2 * max;
            final Bitmap createBitmap = Bitmap.createBitmap(a.t0(surfaceView.getWidth() * f2), a.t0(surfaceView.getHeight() * f2), Bitmap.Config.ARGB_8888);
            a.r(createBitmap, "createBitmap(...)");
            PixelCopy.request(surfaceView, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$takeScreenshot$2$1$1
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i3) {
                    if (i3 != 0) {
                        nVar.resumeWith(null);
                        return;
                    }
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, a.t0(surfaceView.getWidth() * max), a.t0(surfaceView.getHeight() * max), true);
                    a.r(createScaledBitmap, "createScaledBitmap(...)");
                    nVar.resumeWith(createScaledBitmap);
                }
            }, new Handler(Looper.getMainLooper()));
        } catch (Throwable th) {
            new SlackApiRepositoryImpl().sendMessageToSlack(SlackMessage.Factory.template(th));
            nVar.resumeWith(q.d(th));
        }
        Object a2 = nVar.a();
        i0.a aVar = i0.a.f30806a;
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object takeScreenshotPreview(int r14, h0.g r15) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel.takeScreenshotPreview(int, h0.g):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateState(l lVar) {
        i1 i1Var;
        Object value;
        m0 m0Var = this._state;
        do {
            i1Var = (i1) m0Var;
            value = i1Var.getValue();
        } while (!i1Var.g(value, lVar.invoke(value)));
    }

    private final <T> Object waitGLEvent(g gVar) {
        GLRetroView retroView = ((GameState) ((i1) this._state).getValue()).getRetroView();
        if (retroView == null) {
            return b0.f30125a;
        }
        retroView.getGLRetroEvents();
        a.A0();
        throw null;
    }

    public final void clearRetroView() {
        i1 i1Var;
        Object value;
        m0 m0Var = this._state;
        do {
            i1Var = (i1) m0Var;
            value = i1Var.getValue();
        } while (!i1Var.g(value, GameState.copy$default((GameState) value, null, null, null, false, false, false, false, null, null, null, 1019, null)));
    }

    public final void getMuteGame() {
        GLRetroView retroView = ((GameState) ((i1) this._state).getValue()).getRetroView();
        if (retroView != null) {
            retroView.setAudioEnabled(((GameState) ((i1) this._state).getValue()).getAudioEnabled());
        }
    }

    @NotNull
    public final g1 getState() {
        return this.state;
    }

    public final void handleGamePadButton(@NotNull Event.Button button) {
        a.s(button, "it");
        GLRetroView retroView = ((GameState) ((i1) this._state).getValue()).getRetroView();
        if (retroView != null) {
            GLRetroView.sendKeyEvent$default(retroView, button.getAction(), button.getId(), 0, 4, null);
        }
        Log.d(LOG_TAG, "Button event: action=" + button.getAction() + ", id=" + button.getId());
    }

    public final void handleGamePadDirection(@NotNull Event.Direction direction) {
        a.s(direction, "it");
        GLRetroView retroView = ((GameState) ((i1) this._state).getValue()).getRetroView();
        Log.d(LOG_TAG, "Direction event: , id=" + direction.getId());
        int id = direction.getId();
        if (id == 0) {
            if (retroView != null) {
                GLRetroView.sendMotionEvent$default(retroView, 0, direction.getXAxis(), direction.getYAxis(), 0, 8, null);
                return;
            }
            return;
        }
        if (id == 1) {
            if (retroView != null) {
                GLRetroView.sendMotionEvent$default(retroView, 1, direction.getXAxis(), direction.getYAxis(), 0, 8, null);
                return;
            }
            return;
        }
        if (id == 2) {
            if (retroView != null) {
                GLRetroView.sendMotionEvent$default(retroView, 2, direction.getXAxis(), direction.getYAxis(), 0, 8, null);
            }
        } else {
            if (id != 3) {
                if (id == 4 && retroView != null) {
                    GLRetroView.sendMotionEvent$default(retroView, 2, direction.getXAxis(), direction.getYAxis(), 0, 8, null);
                    return;
                }
                return;
            }
            if (retroView != null) {
                GLRetroView.sendMotionEvent$default(retroView, 1, direction.getXAxis(), direction.getYAxis(), 0, 8, null);
            }
            if (retroView != null) {
                GLRetroView.sendMotionEvent$default(retroView, 0, direction.getXAxis(), direction.getYAxis(), 0, 8, null);
            }
        }
    }

    public final void muteGame() {
        GLRetroView retroView = ((GameState) ((i1) this._state).getValue()).getRetroView();
        if (retroView != null) {
            retroView.setAudioEnabled(false);
        }
    }

    public final void onAutoSaveSwitchButton(boolean z2) {
        boolean z3 = !((GameState) ((i1) this._state).getValue()).getAutoSaveEnable();
        GamePrefUtils gamePrefUtils = GamePrefUtils.INSTANCE;
        Context context = this.context;
        a.r(context, "context");
        Game game = ((GameState) ((i1) this._state).getValue()).getGame();
        a.p(game);
        if (gamePrefUtils.updateGameAutoSave(context, game.getId(), z3, !z2)) {
            updateState(new GameViewModel$onAutoSaveSwitchButton$1(z3));
        } else {
            b0.a.b(this.context, "Unable to update Auto Save. Please try again.").show();
        }
    }

    public final void onLoadGame(int i2, @NotNull q0.a aVar) {
        GameData gameData;
        a.s(aVar, "block");
        Game game = ((GameState) ((i1) this._state).getValue()).getGame();
        if (game == null || (gameData = ((GameState) ((i1) this._state).getValue()).getGameData()) == null) {
            return;
        }
        kotlin.jvm.internal.e.v(ViewModelKt.a(this), null, 0, new GameViewModel$onLoadGame$1(this, game, gameData, i2, aVar, null), 3);
    }

    public final void onMuteSwitchButton() {
        boolean z2 = !((GameState) ((i1) this._state).getValue()).getAudioEnabled();
        GamePrefUtils gamePrefUtils = GamePrefUtils.INSTANCE;
        Context context = this.context;
        a.r(context, "context");
        Game game = ((GameState) ((i1) this._state).getValue()).getGame();
        a.p(game);
        if (gamePrefUtils.updateGameAudio(context, game.getId(), z2)) {
            updateState(new GameViewModel$onMuteSwitchButton$1(z2));
        } else {
            b0.a.b(this.context, "Unable to update Audio setting. Please try again.").show();
        }
    }

    public final void onQuit() {
        saveAutoSave();
    }

    public final void onRestart(@NotNull q0.a aVar) {
        a.s(aVar, "block");
        LoadingDialogViewModel loadingDialogViewModel = this.loadingDialogViewModel;
        loadingDialogViewModel.showDialog();
        try {
            GLRetroView retroView = ((GameState) ((i1) this._state).getValue()).getRetroView();
            if (retroView != null) {
                retroView.reset();
            }
        } catch (Exception unused) {
        }
        aVar.invoke();
        loadingDialogViewModel.hideDialog();
    }

    public final void onSaveGame(int i2, @NotNull q0.a aVar) {
        GameData gameData;
        a.s(aVar, "block");
        Game game = ((GameState) ((i1) this._state).getValue()).getGame();
        if (game == null || (gameData = ((GameState) ((i1) this._state).getValue()).getGameData()) == null) {
            return;
        }
        kotlin.jvm.internal.e.v(ViewModelKt.a(this), null, 0, new GameViewModel$onSaveGame$1(this, game, gameData, i2, aVar, null), 3);
    }

    public final void onSpeedSwitchButton() {
        boolean z2 = !((GameState) ((i1) this._state).getValue()).getFastForwardEnabled();
        GamePrefUtils gamePrefUtils = GamePrefUtils.INSTANCE;
        Context context = this.context;
        a.r(context, "context");
        Game game = ((GameState) ((i1) this._state).getValue()).getGame();
        a.p(game);
        if (!gamePrefUtils.updateGameFastForward(context, game.getId(), z2)) {
            b0.a.b(this.context, "Unable to update Fast Forward setting. Please try again.").show();
            return;
        }
        updateState(new GameViewModel$onSpeedSwitchButton$1(z2));
        GLRetroView retroView = ((GameState) ((i1) this._state).getValue()).getRetroView();
        if (retroView != null) {
            retroView.setFrameSpeed(z2 ? 2 : 1);
        }
    }

    public final void saveAutoSave() {
        Game game;
        GameData gameData = ((GameState) ((i1) this._state).getValue()).getGameData();
        if (gameData == null || (game = ((GameState) ((i1) this._state).getValue()).getGame()) == null) {
            return;
        }
        if (!gameData.getSystemCoreConfig().getStatesSupported() || !((GameState) ((i1) this._state).getValue()).getAutoSaveEnable()) {
            MultiNavigationAppStateKt.getLocalNavigationState().getRootNavigation().pop();
            return;
        }
        LoadingDialogViewModel loadingDialogViewModel = this.loadingDialogViewModel;
        loadingDialogViewModel.showDialog();
        kotlin.jvm.internal.e.v(ViewModelKt.a(this), null, 0, new GameViewModel$saveAutoSave$1$1(this, game, gameData, null), 3);
        loadingDialogViewModel.hideDialog();
    }

    public final void setThumbnail(@Nullable SurfaceView surfaceView) {
        if (surfaceView == null) {
            return;
        }
        kotlin.jvm.internal.e.v(ViewModelKt.a(this), null, 0, new GameViewModel$setThumbnail$1(this, surfaceView, null), 3);
    }

    public final void updateOrientation(boolean z2) {
        i1 i1Var;
        Object value;
        GameState gameState;
        GLRetroView retroView = ((GameState) ((i1) this._state).getValue()).getRetroView();
        if (retroView == null) {
            return;
        }
        m0 m0Var = this._state;
        do {
            i1Var = (i1) m0Var;
            value = i1Var.getValue();
            gameState = (GameState) value;
            if (z2) {
                retroView.setResizeMode(2);
            } else {
                retroView.setResizeMode(1);
            }
        } while (!i1Var.g(value, GameState.copy$default(gameState, null, null, retroView, false, false, false, false, null, null, null, 1019, null)));
    }

    private final RomFiles getGameRomFilesStandard(Game game, List<DataFile> list, DocumentFile documentFile) {
        File gameRomStandard = getGameRomStandard(game, documentFile);
        List<DataFile> list2 = list;
        ArrayList arrayList = new ArrayList(e0.q.M(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(getDataFileStandard(game, (DataFile) it.next()));
        }
        return new RomFiles.Standard(u.P0(arrayList, f0.u(gameRomStandard)));
    }
}
