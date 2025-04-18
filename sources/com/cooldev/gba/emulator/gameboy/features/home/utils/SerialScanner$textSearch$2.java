package com.cooldev.gba.emulator.gameboy.features.home.utils;

import d0.k;
import e0.q;
import java.nio.charset.Charset;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class SerialScanner$textSearch$2 extends r implements l {
    final /* synthetic */ Charset $charset;
    final /* synthetic */ int $resultSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerialScanner$textSearch$2(int i2, Charset charset) {
        super(1);
        this.$resultSize = i2;
        this.$charset = charset;
    }

    @Override // q0.l
    @NotNull
    public final String invoke(@NotNull k kVar) {
        a.s(kVar, "<name for destructuring parameter 0>");
        byte[] bArr = (byte[]) kVar.f30134a;
        int intValue = ((Number) kVar.f30135b).intValue();
        return new String(q.U(intValue, bArr, this.$resultSize + intValue), this.$charset);
    }
}
