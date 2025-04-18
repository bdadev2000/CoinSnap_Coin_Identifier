package okhttp3.internal.http2;

import android.support.v4.media.d;
import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.k;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import p0.a;
import w0.e;

/* loaded from: classes.dex */
public final class Http2Reader implements Closeable {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Logger logger;
    private final boolean client;

    @NotNull
    private final ContinuationSource continuation;

    @NotNull
    private final Hpack.Reader hpackReader;

    @NotNull
    private final BufferedSource source;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        @NotNull
        public final Logger getLogger() {
            return Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int i2, int i3, int i4) throws IOException {
            if ((i3 & 8) != 0) {
                i2--;
            }
            if (i4 <= i2) {
                return i2 - i4;
            }
            throw new IOException(d.k("PROTOCOL_ERROR padding ", i4, " > remaining length ", i2));
        }
    }

    /* loaded from: classes.dex */
    public static final class ContinuationSource implements Source {
        private int flags;
        private int left;
        private int length;
        private int padding;

        @NotNull
        private final BufferedSource source;
        private int streamId;

        public ContinuationSource(@NotNull BufferedSource bufferedSource) {
            a.s(bufferedSource, "source");
            this.source = bufferedSource;
        }

        private final void readContinuationHeader() throws IOException {
            int i2 = this.streamId;
            int readMedium = Util.readMedium(this.source);
            this.left = readMedium;
            this.length = readMedium;
            int and = Util.and(this.source.readByte(), 255);
            this.flags = Util.and(this.source.readByte(), 255);
            Companion companion = Http2Reader.Companion;
            if (companion.getLogger().isLoggable(Level.FINE)) {
                companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, and, this.flags));
            }
            int readInt = this.source.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.streamId = readInt;
            if (and == 9) {
                if (readInt != i2) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(and + " != TYPE_CONTINUATION");
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        @Override // okio.Source
        public long read(@NotNull Buffer buffer, long j2) throws IOException {
            a.s(buffer, "sink");
            while (true) {
                int i2 = this.left;
                if (i2 != 0) {
                    long read = this.source.read(buffer, Math.min(j2, i2));
                    if (read == -1) {
                        return -1L;
                    }
                    this.left -= (int) read;
                    return read;
                }
                this.source.skip(this.padding);
                this.padding = 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                readContinuationHeader();
            }
        }

        public final void setFlags(int i2) {
            this.flags = i2;
        }

        public final void setLeft(int i2) {
            this.left = i2;
        }

        public final void setLength(int i2) {
            this.length = i2;
        }

        public final void setPadding(int i2) {
            this.padding = i2;
        }

        public final void setStreamId(int i2) {
            this.streamId = i2;
        }

        @Override // okio.Source
        @NotNull
        public Timeout timeout() {
            return this.source.timeout();
        }
    }

    /* loaded from: classes.dex */
    public interface Handler {
        void ackSettings();

        void alternateService(int i2, @NotNull String str, @NotNull ByteString byteString, @NotNull String str2, int i3, long j2);

        void data(boolean z2, int i2, @NotNull BufferedSource bufferedSource, int i3) throws IOException;

        void goAway(int i2, @NotNull ErrorCode errorCode, @NotNull ByteString byteString);

        void headers(boolean z2, int i2, int i3, @NotNull List<Header> list);

        void ping(boolean z2, int i2, int i3);

        void priority(int i2, int i3, int i4, boolean z2);

        void pushPromise(int i2, int i3, @NotNull List<Header> list) throws IOException;

        void rstStream(int i2, @NotNull ErrorCode errorCode);

        void settings(boolean z2, @NotNull Settings settings);

        void windowUpdate(int i2, long j2);
    }

    static {
        Logger logger2 = Logger.getLogger(Http2.class.getName());
        a.r(logger2, "getLogger(Http2::class.java.name)");
        logger = logger2;
    }

    public Http2Reader(@NotNull BufferedSource bufferedSource, boolean z2) {
        a.s(bufferedSource, "source");
        this.source = bufferedSource;
        this.client = z2;
        ContinuationSource continuationSource = new ContinuationSource(bufferedSource);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource, 4096, 0, 4, null);
    }

    private final void readData(Handler handler, int i2, int i3, int i4) throws IOException {
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z2 = (i3 & 1) != 0;
        if ((i3 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int and = (i3 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        handler.data(z2, i4, this.source, Companion.lengthWithoutPadding(i2, i3, and));
        this.source.skip(and);
    }

    private final void readGoAway(Handler handler, int i2, int i3, int i4) throws IOException {
        if (i2 < 8) {
            throw new IOException(d.i("TYPE_GOAWAY length < 8: ", i2));
        }
        if (i4 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int readInt = this.source.readInt();
        int readInt2 = this.source.readInt();
        int i5 = i2 - 8;
        ErrorCode fromHttp2 = ErrorCode.Companion.fromHttp2(readInt2);
        if (fromHttp2 == null) {
            throw new IOException(d.i("TYPE_GOAWAY unexpected error code: ", readInt2));
        }
        ByteString byteString = ByteString.EMPTY;
        if (i5 > 0) {
            byteString = this.source.readByteString(i5);
        }
        handler.goAway(readInt, fromHttp2, byteString);
    }

    private final List<Header> readHeaderBlock(int i2, int i3, int i4, int i5) throws IOException {
        this.continuation.setLeft(i2);
        ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(i3);
        this.continuation.setFlags(i4);
        this.continuation.setStreamId(i5);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readHeaders(Handler handler, int i2, int i3, int i4) throws IOException {
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z2 = (i3 & 1) != 0;
        int and = (i3 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        if ((i3 & 32) != 0) {
            readPriority(handler, i4);
            i2 -= 5;
        }
        handler.headers(z2, i4, -1, readHeaderBlock(Companion.lengthWithoutPadding(i2, i3, and), and, i3, i4));
    }

    private final void readPing(Handler handler, int i2, int i3, int i4) throws IOException {
        if (i2 != 8) {
            throw new IOException(d.i("TYPE_PING length != 8: ", i2));
        }
        if (i4 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        handler.ping((i3 & 1) != 0, this.source.readInt(), this.source.readInt());
    }

    private final void readPriority(Handler handler, int i2, int i3, int i4) throws IOException {
        if (i2 != 5) {
            throw new IOException(d.j("TYPE_PRIORITY length: ", i2, " != 5"));
        }
        if (i4 != 0) {
            readPriority(handler, i4);
            return;
        }
        throw new IOException("TYPE_PRIORITY streamId == 0");
    }

    private final void readPushPromise(Handler handler, int i2, int i3, int i4) throws IOException {
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int and = (i3 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        handler.pushPromise(i4, this.source.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER, readHeaderBlock(Companion.lengthWithoutPadding(i2 - 4, i3, and), and, i3, i4));
    }

    private final void readRstStream(Handler handler, int i2, int i3, int i4) throws IOException {
        if (i2 != 4) {
            throw new IOException(d.j("TYPE_RST_STREAM length: ", i2, " != 4"));
        }
        if (i4 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int readInt = this.source.readInt();
        ErrorCode fromHttp2 = ErrorCode.Companion.fromHttp2(readInt);
        if (fromHttp2 == null) {
            throw new IOException(d.i("TYPE_RST_STREAM unexpected error code: ", readInt));
        }
        handler.rstStream(i4, fromHttp2);
    }

    private final void readSettings(Handler handler, int i2, int i3, int i4) throws IOException {
        int readInt;
        if (i4 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i3 & 1) != 0) {
            if (i2 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            handler.ackSettings();
            return;
        }
        if (i2 % 6 != 0) {
            throw new IOException(d.i("TYPE_SETTINGS length % 6 != 0: ", i2));
        }
        Settings settings = new Settings();
        e y02 = a.y0(a.F0(0, i2), 6);
        int i5 = y02.f31406a;
        int i6 = y02.f31407b;
        int i7 = y02.f31408c;
        if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
            while (true) {
                int and = Util.and(this.source.readShort(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                readInt = this.source.readInt();
                if (and != 2) {
                    if (and == 3) {
                        and = 4;
                    } else if (and != 4) {
                        if (and == 5 && (readInt < 16384 || readInt > 16777215)) {
                            break;
                        }
                    } else {
                        if (readInt < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        and = 7;
                    }
                } else if (readInt != 0 && readInt != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                settings.set(and, readInt);
                if (i5 == i6) {
                    break;
                } else {
                    i5 += i7;
                }
            }
            throw new IOException(d.i("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", readInt));
        }
        handler.settings(false, settings);
    }

    private final void readWindowUpdate(Handler handler, int i2, int i3, int i4) throws IOException {
        if (i2 != 4) {
            throw new IOException(d.i("TYPE_WINDOW_UPDATE length !=4: ", i2));
        }
        long and = Util.and(this.source.readInt(), 2147483647L);
        if (and == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        handler.windowUpdate(i4, and);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    public final boolean nextFrame(boolean z2, @NotNull Handler handler) throws IOException {
        a.s(handler, "handler");
        try {
            this.source.require(9L);
            int readMedium = Util.readMedium(this.source);
            if (readMedium > 16384) {
                throw new IOException(d.i("FRAME_SIZE_ERROR: ", readMedium));
            }
            int and = Util.and(this.source.readByte(), 255);
            int and2 = Util.and(this.source.readByte(), 255);
            int readInt = this.source.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Http2.INSTANCE.frameLog(true, readInt, readMedium, and, and2));
            }
            if (z2 && and != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + Http2.INSTANCE.formattedType$okhttp(and));
            }
            switch (and) {
                case 0:
                    readData(handler, readMedium, and2, readInt);
                    return true;
                case 1:
                    readHeaders(handler, readMedium, and2, readInt);
                    return true;
                case 2:
                    readPriority(handler, readMedium, and2, readInt);
                    return true;
                case 3:
                    readRstStream(handler, readMedium, and2, readInt);
                    return true;
                case 4:
                    readSettings(handler, readMedium, and2, readInt);
                    return true;
                case 5:
                    readPushPromise(handler, readMedium, and2, readInt);
                    return true;
                case 6:
                    readPing(handler, readMedium, and2, readInt);
                    return true;
                case 7:
                    readGoAway(handler, readMedium, and2, readInt);
                    return true;
                case 8:
                    readWindowUpdate(handler, readMedium, and2, readInt);
                    return true;
                default:
                    this.source.skip(readMedium);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void readConnectionPreface(@NotNull Handler handler) throws IOException {
        a.s(handler, "handler");
        if (this.client) {
            if (!nextFrame(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        BufferedSource bufferedSource = this.source;
        ByteString byteString = Http2.CONNECTION_PREFACE;
        ByteString readByteString = bufferedSource.readByteString(byteString.size());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Util.format("<< CONNECTION " + readByteString.hex(), new Object[0]));
        }
        if (a.g(byteString, readByteString)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + readByteString.utf8());
    }

    private final void readPriority(Handler handler, int i2) throws IOException {
        int readInt = this.source.readInt();
        handler.priority(i2, readInt & Api.BaseClientBuilder.API_PRIORITY_OTHER, Util.and(this.source.readByte(), 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }
}
