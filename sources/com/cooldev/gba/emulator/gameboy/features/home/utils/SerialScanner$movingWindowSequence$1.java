package com.cooldev.gba.emulator.gameboy.features.home.utils;

import d0.b0;
import h0.g;
import j0.e;
import j0.h;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;
import y0.l;

@e(c = "com.cooldev.gba.emulator.gameboy.features.home.utils.SerialScanner$movingWindowSequence$1", f = "SerialScanner.kt", l = {339}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SerialScanner$movingWindowSequence$1 extends h implements p {
    final /* synthetic */ InputStream $inputStream;
    final /* synthetic */ int $windowSize;
    final /* synthetic */ long $windowSkip;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerialScanner$movingWindowSequence$1(int i2, InputStream inputStream, long j2, g gVar) {
        super(gVar);
        this.$windowSize = i2;
        this.$inputStream = inputStream;
        this.$windowSkip = j2;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        SerialScanner$movingWindowSequence$1 serialScanner$movingWindowSequence$1 = new SerialScanner$movingWindowSequence$1(this.$windowSize, this.$inputStream, this.$windowSkip, gVar);
        serialScanner$movingWindowSequence$1.L$0 = obj;
        return serialScanner$movingWindowSequence$1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0045 -> B:5:0x0048). Please report as a decompilation issue!!! */
    @Override // j0.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
        /*
            r8 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r8.label
            r2 = 1
            if (r1 == 0) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r1 = r8.L$1
            byte[] r1 = (byte[]) r1
            java.lang.Object r3 = r8.L$0
            y0.l r3 = (y0.l) r3
            kotlin.jvm.internal.q.m(r9)
            r9 = r8
            goto L48
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            kotlin.jvm.internal.q.m(r9)
            java.lang.Object r9 = r8.L$0
            y0.l r9 = (y0.l) r9
            int r1 = r8.$windowSize
            byte[] r1 = new byte[r1]
            r3 = r9
            r9 = r8
        L2b:
            java.io.InputStream r4 = r9.$inputStream
            int r5 = r9.$windowSize
            r4.mark(r5)
            com.cooldev.gba.emulator.gameboy.features.home.utils.SerialScanner r4 = com.cooldev.gba.emulator.gameboy.features.home.utils.SerialScanner.INSTANCE
            java.io.InputStream r5 = r9.$inputStream
            byte[] r4 = com.cooldev.gba.emulator.gameboy.features.home.utils.SerialScanner.access$readByteArray(r4, r5, r1)
            r9.L$0 = r3
            r9.L$1 = r1
            r9.label = r2
            r3.b(r4, r9)
            i0.a r4 = i0.a.f30806a
            if (r4 != r0) goto L48
            return r0
        L48:
            java.io.InputStream r4 = r9.$inputStream
            r4.reset()
            java.io.InputStream r4 = r9.$inputStream
            long r5 = r9.$windowSkip
            long r4 = r4.skip(r5)
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L2b
            d0.b0 r9 = d0.b0.f30125a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.home.utils.SerialScanner$movingWindowSequence$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull l lVar, @Nullable g gVar) {
        return ((SerialScanner$movingWindowSequence$1) create(lVar, gVar)).invokeSuspend(b0.f30125a);
    }
}
