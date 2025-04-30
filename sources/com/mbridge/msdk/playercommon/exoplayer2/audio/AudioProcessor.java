package com.mbridge.msdk.playercommon.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public interface AudioProcessor {
    public static final ByteBuffer EMPTY_BUFFER = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* loaded from: classes3.dex */
    public static final class UnhandledFormatException extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public UnhandledFormatException(int r4, int r5, int r6) {
            /*
                r3 = this;
                java.lang.String r0 = "Unhandled format: "
                java.lang.String r1 = " Hz, "
                java.lang.String r2 = " channels in encoding "
                java.lang.StringBuilder r4 = Q7.n0.o(r4, r5, r0, r1, r2)
                r4.append(r6)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor.UnhandledFormatException.<init>(int, int, int):void");
        }
    }

    boolean configure(int i9, int i10, int i11) throws UnhandledFormatException;

    void flush();

    ByteBuffer getOutput();

    int getOutputChannelCount();

    int getOutputEncoding();

    int getOutputSampleRateHz();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();
}
