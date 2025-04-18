package com.mbridge.msdk.thrid.okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

/* loaded from: classes4.dex */
public final class GzipSource implements Source {
    private static final byte FCOMMENT = 4;
    private static final byte FEXTRA = 2;
    private static final byte FHCRC = 1;
    private static final byte FNAME = 3;
    private static final byte SECTION_BODY = 1;
    private static final byte SECTION_DONE = 3;
    private static final byte SECTION_HEADER = 0;
    private static final byte SECTION_TRAILER = 2;
    private final Inflater inflater;
    private final InflaterSource inflaterSource;
    private final BufferedSource source;
    private int section = 0;
    private final CRC32 crc = new CRC32();

    public GzipSource(Source source) {
        if (source != null) {
            Inflater inflater = new Inflater(true);
            this.inflater = inflater;
            BufferedSource buffer = Okio.buffer(source);
            this.source = buffer;
            this.inflaterSource = new InflaterSource(buffer, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    private void checkEqual(String str, int i10, int i11) throws IOException {
        if (i11 == i10) {
        } else {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    private void consumeHeader() throws IOException {
        boolean z10;
        this.source.require(10L);
        byte b3 = this.source.buffer().getByte(3L);
        if (((b3 >> 1) & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            updateCrc(this.source.buffer(), 0L, 10L);
        }
        checkEqual("ID1ID2", 8075, this.source.readShort());
        this.source.skip(8L);
        if (((b3 >> 2) & 1) == 1) {
            this.source.require(2L);
            if (z10) {
                updateCrc(this.source.buffer(), 0L, 2L);
            }
            long readShortLe = this.source.buffer().readShortLe();
            this.source.require(readShortLe);
            if (z10) {
                updateCrc(this.source.buffer(), 0L, readShortLe);
            }
            this.source.skip(readShortLe);
        }
        if (((b3 >> 3) & 1) == 1) {
            long indexOf = this.source.indexOf((byte) 0);
            if (indexOf != -1) {
                if (z10) {
                    updateCrc(this.source.buffer(), 0L, indexOf + 1);
                }
                this.source.skip(indexOf + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((b3 >> 4) & 1) == 1) {
            long indexOf2 = this.source.indexOf((byte) 0);
            if (indexOf2 != -1) {
                if (z10) {
                    updateCrc(this.source.buffer(), 0L, indexOf2 + 1);
                }
                this.source.skip(indexOf2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z10) {
            checkEqual("FHCRC", this.source.readShortLe(), (short) this.crc.getValue());
            this.crc.reset();
        }
    }

    private void consumeTrailer() throws IOException {
        checkEqual("CRC", this.source.readIntLe(), (int) this.crc.getValue());
        checkEqual("ISIZE", this.source.readIntLe(), (int) this.inflater.getBytesWritten());
    }

    private void updateCrc(Buffer buffer, long j3, long j10) {
        Segment segment = buffer.head;
        while (true) {
            int i10 = segment.limit;
            int i11 = segment.pos;
            if (j3 < i10 - i11) {
                break;
            }
            j3 -= i10 - i11;
            segment = segment.next;
        }
        while (j10 > 0) {
            int min = (int) Math.min(segment.limit - r6, j10);
            this.crc.update(segment.data, (int) (segment.pos + j3), min);
            j10 -= min;
            segment = segment.next;
            j3 = 0;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inflaterSource.close();
    }

    @Override // com.mbridge.msdk.thrid.okio.Source
    public long read(Buffer buffer, long j3) throws IOException {
        if (j3 >= 0) {
            if (j3 == 0) {
                return 0L;
            }
            if (this.section == 0) {
                consumeHeader();
                this.section = 1;
            }
            if (this.section == 1) {
                long j10 = buffer.size;
                long read = this.inflaterSource.read(buffer, j3);
                if (read != -1) {
                    updateCrc(buffer, j10, read);
                    return read;
                }
                this.section = 2;
            }
            if (this.section == 2) {
                consumeTrailer();
                this.section = 3;
                if (!this.source.exhausted()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(a.k("byteCount < 0: ", j3));
    }

    @Override // com.mbridge.msdk.thrid.okio.Source
    public Timeout timeout() {
        return this.source.timeout();
    }
}
