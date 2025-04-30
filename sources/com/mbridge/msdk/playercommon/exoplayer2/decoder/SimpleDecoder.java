package com.mbridge.msdk.playercommon.exoplayer2.decoder;

import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.OutputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.lang.Exception;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public abstract class SimpleDecoder<I extends DecoderInputBuffer, O extends OutputBuffer, E extends Exception> implements Decoder<I, O, E> {
    private int availableInputBufferCount;
    private final I[] availableInputBuffers;
    private int availableOutputBufferCount;
    private final O[] availableOutputBuffers;
    private final Thread decodeThread;
    private I dequeuedInputBuffer;
    private E exception;
    private boolean flushed;
    private final Object lock = new Object();
    private final ArrayDeque<I> queuedInputBuffers = new ArrayDeque<>();
    private final ArrayDeque<O> queuedOutputBuffers = new ArrayDeque<>();
    private boolean released;
    private int skippedOutputBufferCount;

    public SimpleDecoder(I[] iArr, O[] oArr) {
        this.availableInputBuffers = iArr;
        this.availableInputBufferCount = iArr.length;
        for (int i9 = 0; i9 < this.availableInputBufferCount; i9++) {
            this.availableInputBuffers[i9] = createInputBuffer();
        }
        this.availableOutputBuffers = oArr;
        this.availableOutputBufferCount = oArr.length;
        for (int i10 = 0; i10 < this.availableOutputBufferCount; i10++) {
            this.availableOutputBuffers[i10] = createOutputBuffer();
        }
        Thread thread = new Thread() { // from class: com.mbridge.msdk.playercommon.exoplayer2.decoder.SimpleDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                SimpleDecoder.this.run();
            }
        };
        this.decodeThread = thread;
        thread.start();
    }

    private boolean canDecodeBuffer() {
        if (!this.queuedInputBuffers.isEmpty() && this.availableOutputBufferCount > 0) {
            return true;
        }
        return false;
    }

    private boolean decode() throws InterruptedException {
        synchronized (this.lock) {
            while (!this.released && !canDecodeBuffer()) {
                try {
                    this.lock.wait();
                } finally {
                }
            }
            if (this.released) {
                return false;
            }
            I removeFirst = this.queuedInputBuffers.removeFirst();
            O[] oArr = this.availableOutputBuffers;
            int i9 = this.availableOutputBufferCount - 1;
            this.availableOutputBufferCount = i9;
            O o3 = oArr[i9];
            boolean z8 = this.flushed;
            this.flushed = false;
            if (removeFirst.isEndOfStream()) {
                o3.addFlag(4);
            } else {
                if (removeFirst.isDecodeOnly()) {
                    o3.addFlag(Integer.MIN_VALUE);
                }
                try {
                    this.exception = decode(removeFirst, o3, z8);
                } catch (OutOfMemoryError e4) {
                    this.exception = createUnexpectedDecodeException(e4);
                } catch (RuntimeException e9) {
                    this.exception = createUnexpectedDecodeException(e9);
                }
                if (this.exception != null) {
                    synchronized (this.lock) {
                    }
                    return false;
                }
            }
            synchronized (this.lock) {
                try {
                    if (this.flushed) {
                        releaseOutputBufferInternal(o3);
                    } else if (o3.isDecodeOnly()) {
                        this.skippedOutputBufferCount++;
                        releaseOutputBufferInternal(o3);
                    } else {
                        o3.skippedOutputBufferCount = this.skippedOutputBufferCount;
                        this.skippedOutputBufferCount = 0;
                        this.queuedOutputBuffers.addLast(o3);
                    }
                    releaseInputBufferInternal(removeFirst);
                } finally {
                }
            }
            return true;
        }
    }

    private void maybeNotifyDecodeLoop() {
        if (canDecodeBuffer()) {
            this.lock.notify();
        }
    }

    private void maybeThrowException() throws Exception {
        E e4 = this.exception;
        if (e4 == null) {
        } else {
            throw e4;
        }
    }

    private void releaseInputBufferInternal(I i9) {
        i9.clear();
        I[] iArr = this.availableInputBuffers;
        int i10 = this.availableInputBufferCount;
        this.availableInputBufferCount = i10 + 1;
        iArr[i10] = i9;
    }

    private void releaseOutputBufferInternal(O o3) {
        o3.clear();
        O[] oArr = this.availableOutputBuffers;
        int i9 = this.availableOutputBufferCount;
        this.availableOutputBufferCount = i9 + 1;
        oArr[i9] = o3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void run() {
        do {
            try {
            } catch (InterruptedException e4) {
                throw new IllegalStateException(e4);
            }
        } while (decode());
    }

    public abstract I createInputBuffer();

    public abstract O createOutputBuffer();

    public abstract E createUnexpectedDecodeException(Throwable th);

    public abstract E decode(I i9, O o3, boolean z8);

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public final void flush() {
        synchronized (this.lock) {
            try {
                this.flushed = true;
                this.skippedOutputBufferCount = 0;
                I i9 = this.dequeuedInputBuffer;
                if (i9 != null) {
                    releaseInputBufferInternal(i9);
                    this.dequeuedInputBuffer = null;
                }
                while (!this.queuedInputBuffers.isEmpty()) {
                    releaseInputBufferInternal(this.queuedInputBuffers.removeFirst());
                }
                while (!this.queuedOutputBuffers.isEmpty()) {
                    releaseOutputBufferInternal(this.queuedOutputBuffers.removeFirst());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public void release() {
        synchronized (this.lock) {
            this.released = true;
            this.lock.notify();
        }
        try {
            this.decodeThread.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public void releaseOutputBuffer(O o3) {
        synchronized (this.lock) {
            releaseOutputBufferInternal(o3);
            maybeNotifyDecodeLoop();
        }
    }

    public final void setInitialInputBufferSize(int i9) {
        boolean z8;
        if (this.availableInputBufferCount == this.availableInputBuffers.length) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
        for (I i10 : this.availableInputBuffers) {
            i10.ensureSpaceForWrite(i9);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public final I dequeueInputBuffer() throws Exception {
        I i9;
        synchronized (this.lock) {
            maybeThrowException();
            Assertions.checkState(this.dequeuedInputBuffer == null);
            int i10 = this.availableInputBufferCount;
            if (i10 == 0) {
                i9 = null;
            } else {
                I[] iArr = this.availableInputBuffers;
                int i11 = i10 - 1;
                this.availableInputBufferCount = i11;
                i9 = iArr[i11];
            }
            this.dequeuedInputBuffer = i9;
        }
        return i9;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public final O dequeueOutputBuffer() throws Exception {
        synchronized (this.lock) {
            try {
                maybeThrowException();
                if (this.queuedOutputBuffers.isEmpty()) {
                    return null;
                }
                return this.queuedOutputBuffers.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public final void queueInputBuffer(I i9) throws Exception {
        synchronized (this.lock) {
            maybeThrowException();
            Assertions.checkArgument(i9 == this.dequeuedInputBuffer);
            this.queuedInputBuffers.addLast(i9);
            maybeNotifyDecodeLoop();
            this.dequeuedInputBuffer = null;
        }
    }
}
