package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import java.io.IOException;

/* loaded from: classes3.dex */
public interface ExtractorInput {
    void advancePeekPosition(int i9) throws IOException, InterruptedException;

    boolean advancePeekPosition(int i9, boolean z8) throws IOException, InterruptedException;

    long getLength();

    long getPeekPosition();

    long getPosition();

    void peekFully(byte[] bArr, int i9, int i10) throws IOException, InterruptedException;

    boolean peekFully(byte[] bArr, int i9, int i10, boolean z8) throws IOException, InterruptedException;

    int read(byte[] bArr, int i9, int i10) throws IOException, InterruptedException;

    void readFully(byte[] bArr, int i9, int i10) throws IOException, InterruptedException;

    boolean readFully(byte[] bArr, int i9, int i10, boolean z8) throws IOException, InterruptedException;

    void resetPeekPosition();

    <E extends Throwable> void setRetryPosition(long j7, E e4) throws Throwable;

    int skip(int i9) throws IOException, InterruptedException;

    void skipFully(int i9) throws IOException, InterruptedException;

    boolean skipFully(int i9, boolean z8) throws IOException, InterruptedException;
}
