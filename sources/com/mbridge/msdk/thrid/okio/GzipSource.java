package com.mbridge.msdk.thrid.okio;

import Q7.n0;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes3.dex */
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

    private void checkEqual(String str, int i9, int i10) throws IOException {
        if (i10 == i9) {
        } else {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i10), Integer.valueOf(i9)));
        }
    }

    private void consumeHeader() throws IOException {
        boolean z8;
        this.source.require(10L);
        byte b = this.source.buffer().getByte(3L);
        if (((b >> 1) & 1) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            updateCrc(this.source.buffer(), 0L, 10L);
        }
        checkEqual("ID1ID2", 8075, this.source.readShort());
        this.source.skip(8L);
        if (((b >> 2) & 1) == 1) {
            this.source.require(2L);
            if (z8) {
                updateCrc(this.source.buffer(), 0L, 2L);
            }
            long readShortLe = this.source.buffer().readShortLe();
            this.source.require(readShortLe);
            if (z8) {
                updateCrc(this.source.buffer(), 0L, readShortLe);
            }
            this.source.skip(readShortLe);
        }
        if (((b >> 3) & 1) == 1) {
            long indexOf = this.source.indexOf((byte) 0);
            if (indexOf != -1) {
                if (z8) {
                    updateCrc(this.source.buffer(), 0L, indexOf + 1);
                }
                this.source.skip(indexOf + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((b >> 4) & 1) == 1) {
            long indexOf2 = this.source.indexOf((byte) 0);
            if (indexOf2 != -1) {
                if (z8) {
                    updateCrc(this.source.buffer(), 0L, indexOf2 + 1);
                }
                this.source.skip(indexOf2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z8) {
            checkEqual("FHCRC", this.source.readShortLe(), (short) this.crc.getValue());
            this.crc.reset();
        }
    }

    private void consumeTrailer() throws IOException {
        checkEqual("CRC", this.source.readIntLe(), (int) this.crc.getValue());
        checkEqual("ISIZE", this.source.readIntLe(), (int) this.inflater.getBytesWritten());
    }

    private void updateCrc(Buffer buffer, long j7, long j9) {
        Segment segment = buffer.head;
        while (true) {
            int i9 = segment.limit;
            int i10 = segment.pos;
            if (j7 < i9 - i10) {
                break;
            }
            j7 -= i9 - i10;
            segment = segment.next;
        }
        while (j9 > 0) {
            int min = (int) Math.min(segment.limit - r6, j9);
            this.crc.update(segment.data, (int) (segment.pos + j7), min);
            j9 -= min;
            segment = segment.next;
            j7 = 0;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inflaterSource.close();
    }

    @Override // com.mbridge.msdk.thrid.okio.Source
    public long read(Buffer buffer, long j7) throws IOException {
        if (j7 >= 0) {
            if (j7 == 0) {
                return 0L;
            }
            if (this.section == 0) {
                consumeHeader();
                this.section = 1;
            }
            if (this.section == 1) {
                long j9 = buffer.size;
                long read = this.inflaterSource.read(buffer, j7);
                if (read != -1) {
                    updateCrc(buffer, j9, read);
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
        throw new IllegalArgumentException(n0.g(j7, "byteCount < 0: "));
    }

    @Override // com.mbridge.msdk.thrid.okio.Source
    public Timeout timeout() {
        return this.source.timeout();
    }
}
