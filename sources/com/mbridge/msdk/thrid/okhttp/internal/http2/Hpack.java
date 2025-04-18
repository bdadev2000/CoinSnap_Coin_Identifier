package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.adjust.sdk.Constants;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.thrid.okio.Buffer;
import com.mbridge.msdk.thrid.okio.BufferedSource;
import com.mbridge.msdk.thrid.okio.ByteString;
import com.mbridge.msdk.thrid.okio.Okio;
import com.mbridge.msdk.thrid.okio.Source;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.UByte;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class Hpack {
    static final Map<ByteString, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    static final Header[] STATIC_HEADER_TABLE;

    /* loaded from: classes4.dex */
    public static final class Reader {
        Header[] dynamicTable;
        int dynamicTableByteCount;
        int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        int nextHeaderIndex;
        private final BufferedSource source;

        public Reader(int i10, Source source) {
            this(i10, i10, source);
        }

        private void adjustDynamicTableByteCount() {
            int i10 = this.maxDynamicTableByteCount;
            int i11 = this.dynamicTableByteCount;
            if (i10 < i11) {
                if (i10 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i11 - i10);
                }
            }
        }

        private void clearDynamicTable() {
            Arrays.fill(this.dynamicTable, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private int dynamicTableIndex(int i10) {
            return this.nextHeaderIndex + 1 + i10;
        }

        private int evictToRecoverBytes(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i11 = this.nextHeaderIndex;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.dynamicTable[length].hpackSize;
                    i10 -= i13;
                    this.dynamicTableByteCount -= i13;
                    this.headerCount--;
                    i12++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i11 + 1, headerArr, i11 + 1 + i12, this.headerCount);
                this.nextHeaderIndex += i12;
            }
            return i12;
        }

        private ByteString getName(int i10) throws IOException {
            if (isStaticHeader(i10)) {
                return Hpack.STATIC_HEADER_TABLE[i10].name;
            }
            int dynamicTableIndex = dynamicTableIndex(i10 - Hpack.STATIC_HEADER_TABLE.length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    return headerArr[dynamicTableIndex].name;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private void insertIntoDynamicTable(int i10, Header header) {
            this.headerList.add(header);
            int i11 = header.hpackSize;
            if (i10 != -1) {
                i11 -= this.dynamicTable[dynamicTableIndex(i10)].hpackSize;
            }
            int i12 = this.maxDynamicTableByteCount;
            if (i11 > i12) {
                clearDynamicTable();
                return;
            }
            int evictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i11) - i12);
            if (i10 == -1) {
                int i13 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i13 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i14 = this.nextHeaderIndex;
                this.nextHeaderIndex = i14 - 1;
                this.dynamicTable[i14] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[dynamicTableIndex(i10) + evictToRecoverBytes + i10] = header;
            }
            this.dynamicTableByteCount += i11;
        }

        private boolean isStaticHeader(int i10) {
            return i10 >= 0 && i10 <= Hpack.STATIC_HEADER_TABLE.length - 1;
        }

        private int readByte() throws IOException {
            return this.source.readByte() & UByte.MAX_VALUE;
        }

        private void readIndexedHeader(int i10) throws IOException {
            if (isStaticHeader(i10)) {
                this.headerList.add(Hpack.STATIC_HEADER_TABLE[i10]);
                return;
            }
            int dynamicTableIndex = dynamicTableIndex(i10 - Hpack.STATIC_HEADER_TABLE.length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    this.headerList.add(headerArr[dynamicTableIndex]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private void readLiteralHeaderWithIncrementalIndexingIndexedName(int i10) throws IOException {
            insertIntoDynamicTable(-1, new Header(getName(i10), readByteString()));
        }

        private void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
            insertIntoDynamicTable(-1, new Header(Hpack.checkLowercase(readByteString()), readByteString()));
        }

        private void readLiteralHeaderWithoutIndexingIndexedName(int i10) throws IOException {
            this.headerList.add(new Header(getName(i10), readByteString()));
        }

        private void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            this.headerList.add(new Header(Hpack.checkLowercase(readByteString()), readByteString()));
        }

        public List<Header> getAndResetHeaderList() {
            ArrayList arrayList = new ArrayList(this.headerList);
            this.headerList.clear();
            return arrayList;
        }

        public int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        public ByteString readByteString() throws IOException {
            boolean z10;
            int readByte = readByte();
            if ((readByte & 128) == 128) {
                z10 = true;
            } else {
                z10 = false;
            }
            int readInt = readInt(readByte, 127);
            if (z10) {
                return ByteString.of(Huffman.get().decode(this.source.readByteArray(readInt)));
            }
            return this.source.readByteString(readInt);
        }

        public void readHeaders() throws IOException {
            while (!this.source.exhausted()) {
                int readByte = this.source.readByte() & UByte.MAX_VALUE;
                if (readByte != 128) {
                    if ((readByte & 128) == 128) {
                        readIndexedHeader(readInt(readByte, 127) - 1);
                    } else if (readByte == 64) {
                        readLiteralHeaderWithIncrementalIndexingNewName();
                    } else if ((readByte & 64) == 64) {
                        readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(readByte, Hpack.PREFIX_6_BITS) - 1);
                    } else if ((readByte & 32) == 32) {
                        int readInt = readInt(readByte, 31);
                        this.maxDynamicTableByteCount = readInt;
                        if (readInt >= 0 && readInt <= this.headerTableSizeSetting) {
                            adjustDynamicTableByteCount();
                        } else {
                            throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                        }
                    } else if (readByte != 16 && readByte != 0) {
                        readLiteralHeaderWithoutIndexingIndexedName(readInt(readByte, 15) - 1);
                    } else {
                        readLiteralHeaderWithoutIndexingNewName();
                    }
                } else {
                    throw new IOException("index == 0");
                }
            }
        }

        public int readInt(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int readByte = readByte();
                if ((readByte & 128) == 0) {
                    return i11 + (readByte << i13);
                }
                i11 += (readByte & 127) << i13;
                i13 += 7;
            }
        }

        public Reader(int i10, int i11, Source source) {
            this.headerList = new ArrayList();
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r0.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
            this.headerTableSizeSetting = i10;
            this.maxDynamicTableByteCount = i11;
            this.source = Okio.buffer(source);
        }
    }

    /* loaded from: classes4.dex */
    public static final class Writer {
        private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
        private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
        Header[] dynamicTable;
        int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        int headerCount;
        int headerTableSizeSetting;
        int maxDynamicTableByteCount;
        int nextHeaderIndex;
        private final Buffer out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        public Writer(Buffer buffer) {
            this(4096, true, buffer);
        }

        private void adjustDynamicTableByteCount() {
            int i10 = this.maxDynamicTableByteCount;
            int i11 = this.dynamicTableByteCount;
            if (i10 < i11) {
                if (i10 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i11 - i10);
                }
            }
        }

        private void clearDynamicTable() {
            Arrays.fill(this.dynamicTable, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private int evictToRecoverBytes(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i11 = this.nextHeaderIndex;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.dynamicTable[length].hpackSize;
                    i10 -= i13;
                    this.dynamicTableByteCount -= i13;
                    this.headerCount--;
                    i12++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i11 + 1, headerArr, i11 + 1 + i12, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i14 = this.nextHeaderIndex;
                Arrays.fill(headerArr2, i14 + 1, i14 + 1 + i12, (Object) null);
                this.nextHeaderIndex += i12;
            }
            return i12;
        }

        private void insertIntoDynamicTable(Header header) {
            int i10 = header.hpackSize;
            int i11 = this.maxDynamicTableByteCount;
            if (i10 > i11) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i10) - i11);
            int i12 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i12 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i13 = this.nextHeaderIndex;
            this.nextHeaderIndex = i13 - 1;
            this.dynamicTable[i13] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i10;
        }

        public void setHeaderTableSizeSetting(int i10) {
            this.headerTableSizeSetting = i10;
            int min = Math.min(i10, 16384);
            int i11 = this.maxDynamicTableByteCount;
            if (i11 == min) {
                return;
            }
            if (min < i11) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, min);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = min;
            adjustDynamicTableByteCount();
        }

        public void writeByteString(ByteString byteString) throws IOException {
            if (this.useCompression && Huffman.get().encodedLength(byteString) < byteString.size()) {
                Buffer buffer = new Buffer();
                Huffman.get().encode(byteString, buffer);
                ByteString readByteString = buffer.readByteString();
                writeInt(readByteString.size(), 127, 128);
                this.out.write(readByteString);
                return;
            }
            writeInt(byteString.size(), 127, 0);
            this.out.write(byteString);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void writeHeaders(java.util.List<com.mbridge.msdk.thrid.okhttp.internal.http2.Header> r14) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 235
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.Hpack.Writer.writeHeaders(java.util.List):void");
        }

        public void writeInt(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.out.writeByte(i10 | i12);
                return;
            }
            this.out.writeByte(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.out.writeByte(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.out.writeByte(i13);
        }

        public Writer(int i10, boolean z10, Buffer buffer) {
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r0.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
            this.headerTableSizeSetting = i10;
            this.maxDynamicTableByteCount = i10;
            this.useCompression = z10;
            this.out = buffer;
        }
    }

    static {
        ByteString byteString = Header.TARGET_METHOD;
        ByteString byteString2 = Header.TARGET_PATH;
        ByteString byteString3 = Header.TARGET_SCHEME;
        ByteString byteString4 = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[]{new Header(Header.TARGET_AUTHORITY, ""), new Header(byteString, "GET"), new Header(byteString, "POST"), new Header(byteString2, "/"), new Header(byteString2, "/index.html"), new Header(byteString3, "http"), new Header(byteString3, Constants.SCHEME), new Header(byteString4, "200"), new Header(byteString4, "204"), new Header(byteString4, "206"), new Header(byteString4, "304"), new Header(byteString4, "400"), new Header(byteString4, "404"), new Header(byteString4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header(DownloadModel.ETAG, ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header(ToolBar.REFRESH, ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        NAME_TO_FIRST_INDEX = nameToFirstIndex();
    }

    private Hpack() {
    }

    public static ByteString checkLowercase(ByteString byteString) throws IOException {
        int size = byteString.size();
        for (int i10 = 0; i10 < size; i10++) {
            byte b3 = byteString.getByte(i10);
            if (b3 >= 65 && b3 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + byteString.utf8());
            }
        }
        return byteString;
    }

    private static Map<ByteString, Integer> nameToFirstIndex() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(STATIC_HEADER_TABLE.length);
        int i10 = 0;
        while (true) {
            Header[] headerArr = STATIC_HEADER_TABLE;
            if (i10 < headerArr.length) {
                if (!linkedHashMap.containsKey(headerArr[i10].name)) {
                    linkedHashMap.put(headerArr[i10].name, Integer.valueOf(i10));
                }
                i10++;
            } else {
                return Collections.unmodifiableMap(linkedHashMap);
            }
        }
    }
}
