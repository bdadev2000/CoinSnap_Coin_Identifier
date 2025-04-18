package com.cooldev.gba.emulator.gameboy.features.home.utils;

import h0.g;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

@e(c = "com.cooldev.gba.emulator.gameboy.features.home.utils.DBGameMetadata", f = "DBGameMetadata.kt", l = {Opcodes.I2L}, m = "findBySerial")
/* loaded from: classes.dex */
public final class DBGameMetadata$findBySerial$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DBGameMetadata this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBGameMetadata$findBySerial$1(DBGameMetadata dBGameMetadata, g gVar) {
        super(gVar);
        this.this$0 = dBGameMetadata;
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object findBySerial;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        findBySerial = this.this$0.findBySerial(null, null, this);
        return findBySerial;
    }
}
