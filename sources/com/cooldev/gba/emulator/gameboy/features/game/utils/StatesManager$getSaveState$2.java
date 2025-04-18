package com.cooldev.gba.emulator.gameboy.features.game.utils;

import b1.f0;
import com.cooldev.gba.emulator.gameboy.features.game.models.SaveState;
import com.cooldev.gba.emulator.gameboy.features.home.utils.UtilsKt;
import d0.b0;
import d0.m;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.l;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager$getSaveState$2", f = "StatesManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class StatesManager$getSaveState$2 extends i implements l {
    final /* synthetic */ String $coreName;
    final /* synthetic */ String $fileName;
    int label;
    final /* synthetic */ StatesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatesManager$getSaveState$2(StatesManager statesManager, String str, String str2, g gVar) {
        super(1, gVar);
        this.this$0 = statesManager;
        this.$fileName = str;
        this.$coreName = str2;
    }

    @Override // j0.a
    @NotNull
    public final g create(@NotNull g gVar) {
        return new StatesManager$getSaveState$2(this.this$0, this.$fileName, this.$coreName, gVar);
    }

    @Override // q0.l
    @Nullable
    public final Object invoke(@Nullable g gVar) {
        return ((StatesManager$getSaveState$2) create(gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        File stateFileOrDeprecated;
        File metadataStateFile;
        Object d;
        a aVar = a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        stateFileOrDeprecated = this.this$0.getStateFileOrDeprecated(this.$fileName, this.$coreName);
        metadataStateFile = this.this$0.getMetadataStateFile(this.$fileName, this.$coreName);
        if (!stateFileOrDeprecated.exists()) {
            return null;
        }
        byte[] readBytesUncompressed = UtilsKt.readBytesUncompressed(stateFileOrDeprecated);
        StatesManager statesManager = this.this$0;
        try {
            Charset charset = z0.a.f31458a;
            p0.a.s(metadataStateFile, "<this>");
            p0.a.s(charset, "charset");
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(metadataStateFile), charset);
            try {
                String A = f0.A(inputStreamReader);
                q.b(inputStreamReader, null);
                d = statesManager.parseMetadataFromJson(A);
            } finally {
            }
        } catch (Throwable th) {
            d = q.d(th);
        }
        if (d instanceof m) {
            d = null;
        }
        SaveState.Metadata metadata = (SaveState.Metadata) d;
        if (metadata == null) {
            metadata = new SaveState.Metadata(0, 0, 3, null);
        }
        return new SaveState(readBytesUncompressed, metadata);
    }
}
