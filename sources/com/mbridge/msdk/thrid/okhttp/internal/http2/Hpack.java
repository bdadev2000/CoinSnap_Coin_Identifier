package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.adjust.sdk.Constants;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.thrid.okhttp.internal.Util;
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

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Hpack {
    static final Map<ByteString, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    static final Header[] STATIC_HEADER_TABLE;

    /* loaded from: classes3.dex */
    public static final class Reader {
        Header[] dynamicTable;
        int dynamicTableByteCount;
        int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        int nextHeaderIndex;
        private final BufferedSource source;

        public Reader(int i9, Source source) {
            this(i9, i9, source);
        }

        private void adjustDynamicTableByteCount() {
            int i9 = this.maxDynamicTableByteCount;
            int i10 = this.dynamicTableByteCount;
            if (i9 < i10) {
                if (i9 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i10 - i9);
                }
            }
        }

        private void clearDynamicTable() {
            Arrays.fill(this.dynamicTable, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private int dynamicTableIndex(int i9) {
            return this.nextHeaderIndex + 1 + i9;
        }

        private int evictToRecoverBytes(int i9) {
            int i10;
            int i11 = 0;
            if (i9 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i10 = this.nextHeaderIndex;
                    if (length < i10 || i9 <= 0) {
                        break;
                    }
                    int i12 = this.dynamicTable[length].hpackSize;
                    i9 -= i12;
                    this.dynamicTableByteCount -= i12;
                    this.headerCount--;
                    i11++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i10 + 1, headerArr, i10 + 1 + i11, this.headerCount);
                this.nextHeaderIndex += i11;
            }
            return i11;
        }

        private ByteString getName(int i9) throws IOException {
            if (isStaticHeader(i9)) {
                return Hpack.STATIC_HEADER_TABLE[i9].name;
            }
            int dynamicTableIndex = dynamicTableIndex(i9 - Hpack.STATIC_HEADER_TABLE.length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    return headerArr[dynamicTableIndex].name;
                }
            }
            throw new IOException("Header index too large " + (i9 + 1));
        }

        private void insertIntoDynamicTable(int i9, Header header) {
            this.headerList.add(header);
            int i10 = header.hpackSize;
            if (i9 != -1) {
                i10 -= this.dynamicTable[dynamicTableIndex(i9)].hpackSize;
            }
            int i11 = this.maxDynamicTableByteCount;
            if (i10 > i11) {
                clearDynamicTable();
                return;
            }
            int evictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i10) - i11);
            if (i9 == -1) {
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
            } else {
                this.dynamicTable[dynamicTableIndex(i9) + evictToRecoverBytes + i9] = header;
            }
            this.dynamicTableByteCount += i10;
        }

        private boolean isStaticHeader(int i9) {
            if (i9 >= 0 && i9 <= Hpack.STATIC_HEADER_TABLE.length - 1) {
                return true;
            }
            return false;
        }

        private int readByte() throws IOException {
            return this.source.readByte() & 255;
        }

        private void readIndexedHeader(int i9) throws IOException {
            if (isStaticHeader(i9)) {
                this.headerList.add(Hpack.STATIC_HEADER_TABLE[i9]);
                return;
            }
            int dynamicTableIndex = dynamicTableIndex(i9 - Hpack.STATIC_HEADER_TABLE.length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    this.headerList.add(headerArr[dynamicTableIndex]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i9 + 1));
        }

        private void readLiteralHeaderWithIncrementalIndexingIndexedName(int i9) throws IOException {
            insertIntoDynamicTable(-1, new Header(getName(i9), readByteString()));
        }

        private void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
            insertIntoDynamicTable(-1, new Header(Hpack.checkLowercase(readByteString()), readByteString()));
        }

        private void readLiteralHeaderWithoutIndexingIndexedName(int i9) throws IOException {
            this.headerList.add(new Header(getName(i9), readByteString()));
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
            boolean z8;
            int readByte = readByte();
            if ((readByte & 128) == 128) {
                z8 = true;
            } else {
                z8 = false;
            }
            int readInt = readInt(readByte, 127);
            if (z8) {
                return ByteString.of(Huffman.get().decode(this.source.readByteArray(readInt)));
            }
            return this.source.readByteString(readInt);
        }

        public void readHeaders() throws IOException {
            while (!this.source.exhausted()) {
                byte readByte = this.source.readByte();
                int i9 = readByte & 255;
                if (i9 != 128) {
                    if ((readByte & 128) == 128) {
                        readIndexedHeader(readInt(i9, 127) - 1);
                    } else if (i9 == 64) {
                        readLiteralHeaderWithIncrementalIndexingNewName();
                    } else if ((readByte & 64) == 64) {
                        readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(i9, Hpack.PREFIX_6_BITS) - 1);
                    } else if ((readByte & 32) == 32) {
                        int readInt = readInt(i9, 31);
                        this.maxDynamicTableByteCount = readInt;
                        if (readInt >= 0 && readInt <= this.headerTableSizeSetting) {
                            adjustDynamicTableByteCount();
                        } else {
                            throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                        }
                    } else if (i9 != 16 && i9 != 0) {
                        readLiteralHeaderWithoutIndexingIndexedName(readInt(i9, 15) - 1);
                    } else {
                        readLiteralHeaderWithoutIndexingNewName();
                    }
                } else {
                    throw new IOException("index == 0");
                }
            }
        }

        public int readInt(int i9, int i10) throws IOException {
            int i11 = i9 & i10;
            if (i11 < i10) {
                return i11;
            }
            int i12 = 0;
            while (true) {
                int readByte = readByte();
                if ((readByte & 128) != 0) {
                    i10 += (readByte & 127) << i12;
                    i12 += 7;
                } else {
                    return i10 + (readByte << i12);
                }
            }
        }

        public Reader(int i9, int i10, Source source) {
            this.headerList = new ArrayList();
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r0.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
            this.headerTableSizeSetting = i9;
            this.maxDynamicTableByteCount = i10;
            this.source = Okio.buffer(source);
        }
    }

    /* loaded from: classes3.dex */
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
            int i9 = this.maxDynamicTableByteCount;
            int i10 = this.dynamicTableByteCount;
            if (i9 < i10) {
                if (i9 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i10 - i9);
                }
            }
        }

        private void clearDynamicTable() {
            Arrays.fill(this.dynamicTable, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private int evictToRecoverBytes(int i9) {
            int i10;
            int i11 = 0;
            if (i9 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i10 = this.nextHeaderIndex;
                    if (length < i10 || i9 <= 0) {
                        break;
                    }
                    int i12 = this.dynamicTable[length].hpackSize;
                    i9 -= i12;
                    this.dynamicTableByteCount -= i12;
                    this.headerCount--;
                    i11++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i10 + 1, headerArr, i10 + 1 + i11, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i13 = this.nextHeaderIndex;
                Arrays.fill(headerArr2, i13 + 1, i13 + 1 + i11, (Object) null);
                this.nextHeaderIndex += i11;
            }
            return i11;
        }

        private void insertIntoDynamicTable(Header header) {
            int i9 = header.hpackSize;
            int i10 = this.maxDynamicTableByteCount;
            if (i9 > i10) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i9) - i10);
            int i11 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i11 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i12 = this.nextHeaderIndex;
            this.nextHeaderIndex = i12 - 1;
            this.dynamicTable[i12] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i9;
        }

        public void setHeaderTableSizeSetting(int i9) {
            this.headerTableSizeSetting = i9;
            int min = Math.min(i9, SETTINGS_HEADER_TABLE_SIZE_LIMIT);
            int i10 = this.maxDynamicTableByteCount;
            if (i10 == min) {
                return;
            }
            if (min < i10) {
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

        public void writeHeaders(List<Header> list) throws IOException {
            int i9;
            int i10;
            if (this.emitDynamicTableSizeUpdate) {
                int i11 = this.smallestHeaderTableSizeSetting;
                if (i11 < this.maxDynamicTableByteCount) {
                    writeInt(i11, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                writeInt(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Header header = list.get(i12);
                ByteString asciiLowercase = header.name.toAsciiLowercase();
                ByteString byteString = header.value;
                Integer num = Hpack.NAME_TO_FIRST_INDEX.get(asciiLowercase);
                if (num != null) {
                    int intValue = num.intValue();
                    i10 = intValue + 1;
                    if (i10 > 1 && i10 < 8) {
                        Header[] headerArr = Hpack.STATIC_HEADER_TABLE;
                        if (Util.equal(headerArr[intValue].value, byteString)) {
                            i9 = i10;
                        } else if (Util.equal(headerArr[i10].value, byteString)) {
                            i10 = intValue + 2;
                            i9 = i10;
                        }
                    }
                    i9 = i10;
                    i10 = -1;
                } else {
                    i9 = -1;
                    i10 = -1;
                }
                if (i10 == -1) {
                    int i13 = this.nextHeaderIndex + 1;
                    int length = this.dynamicTable.length;
                    while (true) {
                        if (i13 >= length) {
                            break;
                        }
                        if (Util.equal(this.dynamicTable[i13].name, asciiLowercase)) {
                            if (Util.equal(this.dynamicTable[i13].value, byteString)) {
                                i10 = (i13 - this.nextHeaderIndex) + Hpack.STATIC_HEADER_TABLE.length;
                                break;
                            } else if (i9 == -1) {
                                i9 = (i13 - this.nextHeaderIndex) + Hpack.STATIC_HEADER_TABLE.length;
                            }
                        }
                        i13++;
                    }
                }
                if (i10 != -1) {
                    writeInt(i10, 127, 128);
                } else if (i9 == -1) {
                    this.out.writeByte(64);
                    writeByteString(asciiLowercase);
                    writeByteString(byteString);
                    insertIntoDynamicTable(header);
                } else if (asciiLowercase.startsWith(Header.PSEUDO_PREFIX) && !Header.TARGET_AUTHORITY.equals(asciiLowercase)) {
                    writeInt(i9, 15, 0);
                    writeByteString(byteString);
                } else {
                    writeInt(i9, Hpack.PREFIX_6_BITS, 64);
                    writeByteString(byteString);
                    insertIntoDynamicTable(header);
                }
            }
        }

        public void writeInt(int i9, int i10, int i11) {
            if (i9 < i10) {
                this.out.writeByte(i9 | i11);
                return;
            }
            this.out.writeByte(i11 | i10);
            int i12 = i9 - i10;
            while (i12 >= 128) {
                this.out.writeByte(128 | (i12 & 127));
                i12 >>>= 7;
            }
            this.out.writeByte(i12);
        }

        public Writer(int i9, boolean z8, Buffer buffer) {
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r0.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
            this.headerTableSizeSetting = i9;
            this.maxDynamicTableByteCount = i9;
            this.useCompression = z8;
            this.out = buffer;
        }
    }

    static {
        Header header = new Header(Header.TARGET_AUTHORITY, "");
        ByteString byteString = Header.TARGET_METHOD;
        Header header2 = new Header(byteString, "GET");
        Header header3 = new Header(byteString, "POST");
        ByteString byteString2 = Header.TARGET_PATH;
        Header header4 = new Header(byteString2, "/");
        Header header5 = new Header(byteString2, "/index.html");
        ByteString byteString3 = Header.TARGET_SCHEME;
        Header header6 = new Header(byteString3, "http");
        Header header7 = new Header(byteString3, Constants.SCHEME);
        ByteString byteString4 = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[]{header, header2, header3, header4, header5, header6, header7, new Header(byteString4, "200"), new Header(byteString4, "204"), new Header(byteString4, "206"), new Header(byteString4, "304"), new Header(byteString4, "400"), new Header(byteString4, "404"), new Header(byteString4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header(DownloadModel.ETAG, ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header(ToolBar.REFRESH, ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        NAME_TO_FIRST_INDEX = nameToFirstIndex();
    }

    private Hpack() {
    }

    public static ByteString checkLowercase(ByteString byteString) throws IOException {
        int size = byteString.size();
        for (int i9 = 0; i9 < size; i9++) {
            byte b = byteString.getByte(i9);
            if (b >= 65 && b <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + byteString.utf8());
            }
        }
        return byteString;
    }

    private static Map<ByteString, Integer> nameToFirstIndex() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(STATIC_HEADER_TABLE.length);
        int i9 = 0;
        while (true) {
            Header[] headerArr = STATIC_HEADER_TABLE;
            if (i9 < headerArr.length) {
                if (!linkedHashMap.containsKey(headerArr[i9].name)) {
                    linkedHashMap.put(headerArr[i9].name, Integer.valueOf(i9));
                }
                i9++;
            } else {
                return Collections.unmodifiableMap(linkedHashMap);
            }
        }
    }
}
