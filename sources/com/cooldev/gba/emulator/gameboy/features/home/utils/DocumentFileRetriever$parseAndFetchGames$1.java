package com.cooldev.gba.emulator.gameboy.features.home.utils;

import h0.g;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.cooldev.gba.emulator.gameboy.features.home.utils.DocumentFileRetriever", f = "DocumentFileRetriever.kt", l = {124}, m = "parseAndFetchGames")
/* loaded from: classes3.dex */
public final class DocumentFileRetriever$parseAndFetchGames$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DocumentFileRetriever this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentFileRetriever$parseAndFetchGames$1(DocumentFileRetriever documentFileRetriever, g gVar) {
        super(gVar);
        this.this$0 = documentFileRetriever;
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.parseAndFetchGames(null, null, this);
    }
}
