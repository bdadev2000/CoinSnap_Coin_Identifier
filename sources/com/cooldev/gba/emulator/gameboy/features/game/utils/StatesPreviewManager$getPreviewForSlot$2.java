package com.cooldev.gba.emulator.gameboy.features.game.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.home.models.CoreID;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import java.io.File;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.utils.StatesPreviewManager$getPreviewForSlot$2", f = "StatesPreviewManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class StatesPreviewManager$getPreviewForSlot$2 extends i implements p {
    final /* synthetic */ CoreID $coreID;
    final /* synthetic */ Game $game;
    final /* synthetic */ int $index;
    final /* synthetic */ int $size;
    int label;
    final /* synthetic */ StatesPreviewManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatesPreviewManager$getPreviewForSlot$2(StatesPreviewManager statesPreviewManager, Game game, int i2, CoreID coreID, int i3, g gVar) {
        super(2, gVar);
        this.this$0 = statesPreviewManager;
        this.$game = game;
        this.$index = i2;
        this.$coreID = coreID;
        this.$size = i3;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new StatesPreviewManager$getPreviewForSlot$2(this.this$0, this.$game, this.$index, this.$coreID, this.$size, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((StatesPreviewManager$getPreviewForSlot$2) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String slotScreenshotName;
        File previewFile;
        a aVar = a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        slotScreenshotName = this.this$0.getSlotScreenshotName(this.$game, this.$index);
        previewFile = this.this$0.getPreviewFile(slotScreenshotName, this.$coreID.getCoreName());
        Bitmap decodeFile = BitmapFactory.decodeFile(previewFile.getAbsolutePath());
        int i2 = this.$size;
        return ThumbnailUtils.extractThumbnail(decodeFile, i2, i2);
    }
}
