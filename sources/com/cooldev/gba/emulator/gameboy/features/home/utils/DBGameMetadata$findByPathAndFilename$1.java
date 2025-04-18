package com.cooldev.gba.emulator.gameboy.features.home.utils;

import h0.g;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

@e(c = "com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata", f = "DBGameMetadata.kt", l = {Opcodes.POP}, m = "findByPathAndFilename")
/* loaded from: classes.dex */
public final class DBGameMetadata$findByPathAndFilename$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DBGameMetadata this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBGameMetadata$findByPathAndFilename$1(DBGameMetadata dBGameMetadata, g gVar) {
        super(gVar);
        this.this$0 = dBGameMetadata;
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object findByPathAndFilename;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        findByPathAndFilename = this.this$0.findByPathAndFilename(null, null, this);
        return findByPathAndFilename;
    }
}
