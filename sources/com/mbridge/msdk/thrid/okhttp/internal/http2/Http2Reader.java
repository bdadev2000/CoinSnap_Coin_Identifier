package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okhttp.internal.http2.Hpack;
import com.mbridge.msdk.thrid.okio.Buffer;
import com.mbridge.msdk.thrid.okio.BufferedSource;
import com.mbridge.msdk.thrid.okio.ByteString;
import com.mbridge.msdk.thrid.okio.Source;
import com.mbridge.msdk.thrid.okio.Timeout;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;
import kotlin.UShort;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class Http2Reader implements Closeable {
    static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private final ContinuationSource continuation;
    final Hpack.Reader hpackReader;
    private final BufferedSource source;

    /* loaded from: classes4.dex */
    public static final class ContinuationSource implements Source {
        byte flags;
        int left;
        int length;
        short padding;
        private final BufferedSource source;
        int streamId;

        public ContinuationSource(BufferedSource bufferedSource) {
            this.source = bufferedSource;
        }

        private void readContinuationHeader() throws IOException {
            int i10 = this.streamId;
            int readMedium = Http2Reader.readMedium(this.source);
            this.left = readMedium;
            this.length = readMedium;
            byte readByte = (byte) (this.source.readByte() & UByte.MAX_VALUE);
            this.flags = (byte) (this.source.readByte() & UByte.MAX_VALUE);
            Logger logger = Http2Reader.logger;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Http2.frameLog(true, this.streamId, this.length, readByte, this.flags));
            }
            int readInt = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = readInt;
            if (readByte == 9) {
                if (readInt == i10) {
                    return;
                } else {
                    throw Http2.ioException("TYPE_CONTINUATION streamId changed", new Object[0]);
                }
            }
            throw Http2.ioException("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
        }

        @Override // com.mbridge.msdk.thrid.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // com.mbridge.msdk.thrid.okio.Source
        public long read(Buffer buffer, long j3) throws IOException {
            while (true) {
                int i10 = this.left;
                if (i10 == 0) {
                    this.source.skip(this.padding);
                    this.padding = (short) 0;
                    if ((this.flags & 4) != 0) {
                        return -1L;
                    }
                    readContinuationHeader();
                } else {
                    long read = this.source.read(buffer, Math.min(j3, i10));
                    if (read == -1) {
                        return -1L;
                    }
                    this.left = (int) (this.left - read);
                    return read;
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.Source
        public Timeout timeout() {
            return this.source.timeout();
        }
    }

    /* loaded from: classes4.dex */
    public interface Handler {
        void ackSettings();

        void alternateService(int i10, String str, ByteString byteString, String str2, int i11, long j3);

        void data(boolean z10, int i10, BufferedSource bufferedSource, int i11) throws IOException;

        void goAway(int i10, ErrorCode errorCode, ByteString byteString);

        void headers(boolean z10, int i10, int i11, List<Header> list);

        void ping(boolean z10, int i10, int i11);

        void priority(int i10, int i11, int i12, boolean z10);

        void pushPromise(int i10, int i11, List<Header> list) throws IOException;

        void rstStream(int i10, ErrorCode errorCode);

        void settings(boolean z10, Settings settings);

        void windowUpdate(int i10, long j3);
    }

    public Http2Reader(BufferedSource bufferedSource, boolean z10) {
        this.source = bufferedSource;
        this.client = z10;
        ContinuationSource continuationSource = new ContinuationSource(bufferedSource);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(4096, continuationSource);
    }

    public static int lengthWithoutPadding(int i10, byte b3, short s5) throws IOException {
        if ((b3 & 8) != 0) {
            i10--;
        }
        if (s5 <= i10) {
            return (short) (i10 - s5);
        }
        throw Http2.ioException("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s5), Integer.valueOf(i10));
    }

    private void readData(Handler handler, int i10, byte b3, int i11) throws IOException {
        boolean z10;
        short s5 = 0;
        if (i11 != 0) {
            boolean z11 = true;
            if ((b3 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((b3 & 32) == 0) {
                z11 = false;
            }
            if (!z11) {
                if ((b3 & 8) != 0) {
                    s5 = (short) (this.source.readByte() & UByte.MAX_VALUE);
                }
                handler.data(z10, i11, this.source, lengthWithoutPadding(i10, b3, s5));
                this.source.skip(s5);
                return;
            }
            throw Http2.ioException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        throw Http2.ioException("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
    }

    private void readGoAway(Handler handler, int i10, byte b3, int i11) throws IOException {
        if (i10 >= 8) {
            if (i11 == 0) {
                int readInt = this.source.readInt();
                int readInt2 = this.source.readInt();
                int i12 = i10 - 8;
                ErrorCode fromHttp2 = ErrorCode.fromHttp2(readInt2);
                if (fromHttp2 != null) {
                    ByteString byteString = ByteString.EMPTY;
                    if (i12 > 0) {
                        byteString = this.source.readByteString(i12);
                    }
                    handler.goAway(readInt, fromHttp2, byteString);
                    return;
                }
                throw Http2.ioException("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            }
            throw Http2.ioException("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        throw Http2.ioException("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i10));
    }

    private List<Header> readHeaderBlock(int i10, short s5, byte b3, int i11) throws IOException {
        ContinuationSource continuationSource = this.continuation;
        continuationSource.left = i10;
        continuationSource.length = i10;
        continuationSource.padding = s5;
        continuationSource.flags = b3;
        continuationSource.streamId = i11;
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private void readHeaders(Handler handler, int i10, byte b3, int i11) throws IOException {
        boolean z10;
        short s5 = 0;
        if (i11 != 0) {
            if ((b3 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((b3 & 8) != 0) {
                s5 = (short) (this.source.readByte() & UByte.MAX_VALUE);
            }
            if ((b3 & 32) != 0) {
                readPriority(handler, i11);
                i10 -= 5;
            }
            handler.headers(z10, i11, -1, readHeaderBlock(lengthWithoutPadding(i10, b3, s5), s5, b3, i11));
            return;
        }
        throw Http2.ioException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    }

    public static int readMedium(BufferedSource bufferedSource) throws IOException {
        return (bufferedSource.readByte() & UByte.MAX_VALUE) | ((bufferedSource.readByte() & UByte.MAX_VALUE) << 16) | ((bufferedSource.readByte() & UByte.MAX_VALUE) << 8);
    }

    private void readPing(Handler handler, int i10, byte b3, int i11) throws IOException {
        boolean z10 = false;
        if (i10 == 8) {
            if (i11 == 0) {
                int readInt = this.source.readInt();
                int readInt2 = this.source.readInt();
                if ((b3 & 1) != 0) {
                    z10 = true;
                }
                handler.ping(z10, readInt, readInt2);
                return;
            }
            throw Http2.ioException("TYPE_PING streamId != 0", new Object[0]);
        }
        throw Http2.ioException("TYPE_PING length != 8: %s", Integer.valueOf(i10));
    }

    private void readPriority(Handler handler, int i10, byte b3, int i11) throws IOException {
        if (i10 != 5) {
            throw Http2.ioException("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i10));
        }
        if (i11 != 0) {
            readPriority(handler, i11);
            return;
        }
        throw Http2.ioException("TYPE_PRIORITY streamId == 0", new Object[0]);
    }

    private void readPushPromise(Handler handler, int i10, byte b3, int i11) throws IOException {
        short s5 = 0;
        if (i11 != 0) {
            if ((b3 & 8) != 0) {
                s5 = (short) (this.source.readByte() & UByte.MAX_VALUE);
            }
            handler.pushPromise(i11, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(lengthWithoutPadding(i10 - 4, b3, s5), s5, b3, i11));
            return;
        }
        throw Http2.ioException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
    }

    private void readRstStream(Handler handler, int i10, byte b3, int i11) throws IOException {
        if (i10 == 4) {
            if (i11 != 0) {
                int readInt = this.source.readInt();
                ErrorCode fromHttp2 = ErrorCode.fromHttp2(readInt);
                if (fromHttp2 != null) {
                    handler.rstStream(i11, fromHttp2);
                    return;
                }
                throw Http2.ioException("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            }
            throw Http2.ioException("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        throw Http2.ioException("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i10));
    }

    private void readSettings(Handler handler, int i10, byte b3, int i11) throws IOException {
        if (i11 == 0) {
            if ((b3 & 1) != 0) {
                if (i10 == 0) {
                    handler.ackSettings();
                    return;
                }
                throw Http2.ioException("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            if (i10 % 6 == 0) {
                Settings settings = new Settings();
                for (int i12 = 0; i12 < i10; i12 += 6) {
                    int readShort = this.source.readShort() & UShort.MAX_VALUE;
                    int readInt = this.source.readInt();
                    if (readShort != 2) {
                        if (readShort != 3) {
                            if (readShort != 4) {
                                if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                                    throw Http2.ioException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                                }
                            } else if (readInt >= 0) {
                                readShort = 7;
                            } else {
                                throw Http2.ioException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            }
                        } else {
                            readShort = 4;
                        }
                    } else if (readInt != 0 && readInt != 1) {
                        throw Http2.ioException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                    }
                    settings.set(readShort, readInt);
                }
                handler.settings(false, settings);
                return;
            }
            throw Http2.ioException("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i10));
        }
        throw Http2.ioException("TYPE_SETTINGS streamId != 0", new Object[0]);
    }

    private void readWindowUpdate(Handler handler, int i10, byte b3, int i11) throws IOException {
        if (i10 == 4) {
            long readInt = this.source.readInt() & 2147483647L;
            if (readInt != 0) {
                handler.windowUpdate(i11, readInt);
                return;
            }
            throw Http2.ioException("windowSizeIncrement was 0", Long.valueOf(readInt));
        }
        throw Http2.ioException("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i10));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    public boolean nextFrame(boolean z10, Handler handler) throws IOException {
        try {
            this.source.require(9L);
            int readMedium = readMedium(this.source);
            if (readMedium >= 0 && readMedium <= 16384) {
                byte readByte = (byte) (this.source.readByte() & UByte.MAX_VALUE);
                if (z10 && readByte != 4) {
                    throw Http2.ioException("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
                }
                byte readByte2 = (byte) (this.source.readByte() & UByte.MAX_VALUE);
                int readInt = this.source.readInt() & Integer.MAX_VALUE;
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Http2.frameLog(true, readInt, readMedium, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        readData(handler, readMedium, readByte2, readInt);
                        return true;
                    case 1:
                        readHeaders(handler, readMedium, readByte2, readInt);
                        return true;
                    case 2:
                        readPriority(handler, readMedium, readByte2, readInt);
                        return true;
                    case 3:
                        readRstStream(handler, readMedium, readByte2, readInt);
                        return true;
                    case 4:
                        readSettings(handler, readMedium, readByte2, readInt);
                        return true;
                    case 5:
                        readPushPromise(handler, readMedium, readByte2, readInt);
                        return true;
                    case 6:
                        readPing(handler, readMedium, readByte2, readInt);
                        return true;
                    case 7:
                        readGoAway(handler, readMedium, readByte2, readInt);
                        return true;
                    case 8:
                        readWindowUpdate(handler, readMedium, readByte2, readInt);
                        return true;
                    default:
                        this.source.skip(readMedium);
                        return true;
                }
            }
            throw Http2.ioException("FRAME_SIZE_ERROR: %s", Integer.valueOf(readMedium));
        } catch (IOException unused) {
            return false;
        }
    }

    public void readConnectionPreface(Handler handler) throws IOException {
        if (this.client) {
            if (!nextFrame(true, handler)) {
                throw Http2.ioException("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        BufferedSource bufferedSource = this.source;
        ByteString byteString = Http2.CONNECTION_PREFACE;
        ByteString readByteString = bufferedSource.readByteString(byteString.size());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Util.format("<< CONNECTION %s", readByteString.hex()));
        }
        if (byteString.equals(readByteString)) {
        } else {
            throw Http2.ioException("Expected a connection header but was %s", readByteString.utf8());
        }
    }

    private void readPriority(Handler handler, int i10) throws IOException {
        int readInt = this.source.readInt();
        handler.priority(i10, readInt & Integer.MAX_VALUE, (this.source.readByte() & UByte.MAX_VALUE) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }
}
