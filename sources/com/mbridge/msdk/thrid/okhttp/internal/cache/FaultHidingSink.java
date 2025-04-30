package com.mbridge.msdk.thrid.okhttp.internal.cache;

import com.mbridge.msdk.thrid.okio.Buffer;
import com.mbridge.msdk.thrid.okio.ForwardingSink;
import com.mbridge.msdk.thrid.okio.Sink;
import java.io.IOException;

/* loaded from: classes3.dex */
class FaultHidingSink extends ForwardingSink {
    private boolean hasErrors;

    public FaultHidingSink(Sink sink) {
        super(sink);
    }

    @Override // com.mbridge.msdk.thrid.okio.ForwardingSink, com.mbridge.msdk.thrid.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e4) {
            this.hasErrors = true;
            onException(e4);
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.ForwardingSink, com.mbridge.msdk.thrid.okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e4) {
            this.hasErrors = true;
            onException(e4);
        }
    }

    public void onException(IOException iOException) {
    }

    @Override // com.mbridge.msdk.thrid.okio.ForwardingSink, com.mbridge.msdk.thrid.okio.Sink
    public void write(Buffer buffer, long j7) throws IOException {
        if (this.hasErrors) {
            buffer.skip(j7);
            return;
        }
        try {
            super.write(buffer, j7);
        } catch (IOException e4) {
            this.hasErrors = true;
            onException(e4);
        }
    }
}
