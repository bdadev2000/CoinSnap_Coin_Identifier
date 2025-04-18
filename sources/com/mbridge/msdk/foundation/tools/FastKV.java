package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.foundation.tools.f;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes4.dex */
public class FastKV {
    static final int ASYNC_BLOCKING = 1;
    private static final String A_SUFFIX = ".kva";
    private static final int BASE_GC_BYTES_THRESHOLD = 4096;
    private static final int BASE_GC_KEYS_THRESHOLD = 80;
    private static final String BOTH_FILES_ERROR = "both files error";
    private static final String B_SUFFIX = ".kvb";
    private static final String C_SUFFIX = ".kvc";
    private static final int DATA_SIZE_LIMIT = 536870912;
    private static final int DATA_START = 12;
    private static final int DOUBLE_LIMIT;
    private static final byte[] EMPTY_ARRAY = new byte[0];
    static final String GC_FINISH = "gc finish";
    private static final int INTERNAL_LIMIT = 2048;
    private static final String MAP_FAILED = "map failed";
    static final int NON_BLOCKING = 0;
    private static final String OPEN_FILE_FAILED = "open file failed";
    private static final int PAGE_SIZE;
    private static final String PARSE_DATA_FAILED = "parse dara failed";
    static final int SYNC_BLOCKING = 2;
    private static final String TEMP_SUFFIX = ".tmp";
    static final String TRUNCATE_FINISH = "truncate finish";
    private static final int TRUNCATE_THRESHOLD;
    private static final int[] TYPE_SIZE;
    private MappedByteBuffer aBuffer;
    private FileChannel aChannel;
    private MappedByteBuffer bBuffer;
    private FileChannel bChannel;
    private long checksum;
    private int dataEnd;
    private final Map<String, a> encoderMap;
    private p fastBuffer;
    private int invalidBytes;
    private final String name;
    private final String path;
    private int removeStart;
    private boolean sizeChanged;
    private String tempExternalName;
    private int updateSize;
    private int updateStart;
    private int writingMode;
    private final Map<String, f.b> data = new HashMap();
    private final Executor executor = new s();
    private final ArrayList<c> invalids = new ArrayList<>();
    private final b logger = q.f13635b;
    private boolean autoCommit = true;

    /* loaded from: classes4.dex */
    public static class Builder {
        private static final Map<String, FastKV> INSTANCE_MAP = new ConcurrentHashMap();
        private a[] encoders;
        private final String name;
        private final String path;
        private int writingMode = 0;

        public Builder(String str, String str2) {
            if (str != null && !str.isEmpty()) {
                if (str2 != null && !str2.isEmpty()) {
                    this.path = str.endsWith("/") ? str : str.concat("/");
                    this.name = str2;
                    return;
                }
                throw new IllegalArgumentException("name is empty");
            }
            throw new IllegalArgumentException("path is empty");
        }

        public Builder asyncBlocking() {
            this.writingMode = 1;
            return this;
        }

        public Builder blocking() {
            this.writingMode = 2;
            return this;
        }

        public FastKV build() {
            String str = this.path + this.name;
            Map<String, FastKV> map = INSTANCE_MAP;
            FastKV fastKV = map.get(str);
            if (fastKV == null) {
                synchronized (Builder.class) {
                    fastKV = map.get(str);
                    if (fastKV == null) {
                        fastKV = new FastKV(this.path, this.name, this.encoders, this.writingMode);
                        map.put(str, fastKV);
                    }
                }
            }
            return fastKV;
        }

        public Builder encoder(a[] aVarArr) {
            this.encoders = aVarArr;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public interface a<T> {
        T a(byte[] bArr, int i10, int i11);

        String a();

        byte[] a(T t5);
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a(String str, Exception exc);

        void a(String str, String str2);

        void b(String str, Exception exc);
    }

    /* loaded from: classes4.dex */
    public static class c implements Comparable<c> {
        int a;

        /* renamed from: b, reason: collision with root package name */
        int f13513b;

        public c(int i10, int i11) {
            this.f13513b = i10;
            this.a = i11;
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(c cVar) {
            return this.f13513b - cVar.f13513b;
        }
    }

    static {
        int a10 = ap.a();
        PAGE_SIZE = a10;
        int max = Math.max(a10 << 1, JsonLexerKt.BATCH_SIZE);
        DOUBLE_LIMIT = max;
        TRUNCATE_THRESHOLD = max << 1;
        TYPE_SIZE = new int[]{0, 1, 4, 4, 8, 8};
    }

    public FastKV(String str, String str2, a[] aVarArr, int i10) {
        this.path = str;
        this.name = str2;
        this.writingMode = i10;
        HashMap hashMap = new HashMap();
        hashMap.put("StringSet", am.a);
        if (aVarArr != null && aVarArr.length > 0) {
            for (a aVar : aVarArr) {
                String a10 = aVar.a();
                if (hashMap.containsKey(a10)) {
                    error(vd.e.e("duplicate encoder tag:", a10));
                } else {
                    hashMap.put(a10, aVar);
                }
            }
        }
        this.encoderMap = hashMap;
        loadData();
    }

    private void addObject(String str, Object obj, byte[] bArr, byte b3) {
        boolean z10;
        Object obj2;
        int length;
        f.b hVar;
        int saveArray = saveArray(str, bArr, b3);
        if (saveArray != 0) {
            String str2 = this.tempExternalName;
            if (str2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            if (z11) {
                this.tempExternalName = null;
                length = 32;
                obj2 = str2;
            } else {
                obj2 = obj;
                length = bArr.length;
            }
            if (b3 == 6) {
                hVar = new f.i(this.updateStart, saveArray, (String) obj2, length, z11);
            } else if (b3 == 7) {
                hVar = new f.a(this.updateStart, saveArray, obj2, length, z11);
            } else {
                hVar = new f.h(this.updateStart, saveArray, obj2, length, z11);
            }
            this.data.put(str, hVar);
            updateChange();
        }
    }

    private void addOrUpdate(String str, Object obj, byte[] bArr, f.j jVar, byte b3) {
        if (jVar == null) {
            addObject(str, obj, bArr, b3);
        } else if (!jVar.f13621b && jVar.f13624e == bArr.length) {
            updateBytes(jVar.a, bArr);
            jVar.f13623d = obj;
        } else {
            updateObject(str, obj, bArr, jVar);
        }
        checkIfCommit();
    }

    private int bytesThreshold() {
        int i10 = this.dataEnd;
        if (i10 <= 16384) {
            return 4096;
        }
        if (i10 <= 65536) {
            return 8192;
        }
        return JsonLexerKt.BATCH_SIZE;
    }

    private void checkGC() {
        int i10;
        if (this.invalidBytes < (bytesThreshold() << 1)) {
            int size = this.invalids.size();
            if (this.dataEnd < 16384) {
                i10 = BASE_GC_KEYS_THRESHOLD;
            } else {
                i10 = 160;
            }
            if (size < i10) {
                return;
            }
        }
        gc(0);
    }

    private void checkIfCommit() {
        if (this.writingMode != 0 && this.autoCommit) {
            commitToCFile();
        }
    }

    private void checkKey(String str) {
        if (str != null && !str.isEmpty()) {
        } else {
            throw new IllegalArgumentException("key is empty");
        }
    }

    private void checkKeySize(int i10) {
        if (i10 > 255) {
            throw new IllegalArgumentException("key's length must less than 256");
        }
    }

    private void checkValueSize(int i10, boolean z10) {
        if (z10) {
            if (i10 != 32) {
                throw new IllegalStateException("name size not match");
            }
        } else if (i10 >= 0 && i10 < INTERNAL_LIMIT) {
        } else {
            throw new IllegalStateException("value size out of bound");
        }
    }

    private void clearData() {
        this.dataEnd = 12;
        this.checksum = 0L;
        clearInvalid();
        this.data.clear();
        p pVar = this.fastBuffer;
        if (pVar != null && pVar.a.length == PAGE_SIZE) {
            pVar.b(0, 0);
            this.fastBuffer.a(4, 0L);
        } else {
            this.fastBuffer = new p(PAGE_SIZE);
        }
    }

    private void clearInvalid() {
        this.invalidBytes = 0;
        this.invalids.clear();
    }

    private boolean commitToCFile() {
        int i10 = this.writingMode;
        if (i10 == 1) {
            this.executor.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.FastKV.1
                @Override // java.lang.Runnable
                public final void run() {
                    FastKV.this.writeToCFile();
                }
            });
        } else if (i10 == 2) {
            return writeToCFile();
        }
        return true;
    }

    private void copyBuffer(MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, int i10) {
        FileChannel fileChannel;
        if (mappedByteBuffer.capacity() != mappedByteBuffer2.capacity()) {
            try {
                if (mappedByteBuffer2 == this.bBuffer) {
                    fileChannel = this.bChannel;
                } else {
                    fileChannel = this.aChannel;
                }
                MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, mappedByteBuffer.capacity());
                map.order(ByteOrder.LITTLE_ENDIAN);
                if (mappedByteBuffer2 == this.bBuffer) {
                    this.bBuffer = map;
                } else {
                    this.aBuffer = map;
                }
                mappedByteBuffer2 = map;
            } catch (IOException e2) {
                error(e2);
                toBlockingMode();
                return;
            }
        }
        mappedByteBuffer.rewind();
        mappedByteBuffer2.rewind();
        mappedByteBuffer.limit(i10);
        mappedByteBuffer2.put(mappedByteBuffer);
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    private void countInvalid(int i10, int i11) {
        this.invalidBytes = (i11 - i10) + this.invalidBytes;
        this.invalids.add(new c(i10, i11));
    }

    private void deleteCFiles() {
        try {
            ap.a(new File(this.path, this.name + C_SUFFIX));
            ap.a(new File(this.path, this.name + TEMP_SUFFIX));
        } catch (Exception e2) {
            error(e2);
        }
    }

    private void ensureSize(int i10) {
        int length = this.fastBuffer.a.length;
        int i11 = this.dataEnd + i10;
        if (i11 >= length) {
            int i12 = this.invalidBytes;
            if (i12 > i10 && i12 > bytesThreshold()) {
                gc(i10);
                return;
            }
            int newCapacity = getNewCapacity(length, i11);
            byte[] bArr = new byte[newCapacity];
            System.arraycopy(this.fastBuffer.a, 0, bArr, 0, this.dataEnd);
            this.fastBuffer.a = bArr;
            if (this.writingMode == 0) {
                try {
                    long j3 = newCapacity;
                    MappedByteBuffer map = this.aChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j3);
                    this.aBuffer = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    MappedByteBuffer map2 = this.bChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j3);
                    this.bBuffer = map2;
                    map2.order(byteOrder);
                } catch (IOException e2) {
                    error(new Exception(MAP_FAILED, e2));
                    this.fastBuffer.b(0, this.dataEnd - 12);
                    this.fastBuffer.a(4, this.checksum);
                    toBlockingMode();
                }
            }
        }
    }

    private void error(Exception exc) {
        b bVar = this.logger;
        if (bVar != null) {
            bVar.a(this.name, exc);
        }
    }

    private void fastPutString(String str, String str2, f.i iVar) {
        int a10 = p.a(str2);
        if (iVar == null) {
            int a11 = p.a(str);
            checkKeySize(a11);
            int i10 = a11 + 4;
            this.updateSize = i10 + a10;
            preparePutBytes();
            this.fastBuffer.a((byte) 6);
            putKey(str, a11);
            putStringValue(str2, a10);
            Map<String, f.b> map = this.data;
            int i11 = this.updateStart;
            map.put(str, new f.i(i11, i11 + i10, str2, a10, false));
            updateChange();
        } else {
            int i12 = iVar.a;
            int i13 = i12 - iVar.f13622c;
            int i14 = iVar.f13624e;
            boolean z10 = false;
            String str3 = null;
            if (i14 == a10) {
                this.checksum ^= this.fastBuffer.a(i12, i14);
                if (a10 == str2.length()) {
                    str2.getBytes(0, a10, this.fastBuffer.a, iVar.a);
                } else {
                    p pVar = this.fastBuffer;
                    pVar.f13633b = iVar.a;
                    pVar.b(str2);
                }
                this.updateStart = iVar.a;
                this.updateSize = a10;
            } else {
                this.updateSize = i13 + a10;
                preparePutBytes();
                this.fastBuffer.a((byte) 6);
                int i15 = i13 - 3;
                p pVar2 = this.fastBuffer;
                byte[] bArr = pVar2.a;
                System.arraycopy(bArr, iVar.f13622c + 1, bArr, pVar2.f13633b, i15);
                this.fastBuffer.f13633b += i15;
                putStringValue(str2, a10);
                remove((byte) 6, iVar.f13622c, iVar.a + iVar.f13624e);
                if (iVar.f13621b) {
                    str3 = (String) iVar.f13623d;
                }
                iVar.f13621b = false;
                int i16 = this.updateStart;
                iVar.f13622c = i16;
                iVar.a = i16 + i13;
                iVar.f13624e = a10;
                z10 = true;
            }
            iVar.f13623d = str2;
            updateChange();
            if (z10) {
                checkGC();
            }
            if (str3 != null) {
                ap.a(new File(this.path + this.name, str3));
            }
        }
        checkIfCommit();
    }

    private byte[] getArrayFromFile(f.a aVar) {
        try {
            byte[] b3 = ap.b(new File(this.path + this.name, (String) aVar.f13623d));
            if (b3 == null) {
                return EMPTY_ARRAY;
            }
            return b3;
        } catch (Exception e2) {
            error(e2);
            return EMPTY_ARRAY;
        }
    }

    private int getNewCapacity(int i10, int i11) {
        if (i11 <= DATA_SIZE_LIMIT) {
            int i12 = PAGE_SIZE;
            if (i11 <= i12) {
                return i12;
            }
            while (i10 < i11) {
                int i13 = DOUBLE_LIMIT;
                if (i10 <= i13) {
                    i10 <<= 1;
                } else {
                    i10 += i13;
                }
            }
            return i10;
        }
        throw new IllegalStateException("data size out of limit");
    }

    private Object getObjectFromFile(f.h hVar) {
        try {
            byte[] b3 = ap.b(new File(this.path + this.name, (String) hVar.f13623d));
            if (b3 != null) {
                int i10 = b3[0] & UByte.MAX_VALUE;
                String str = new String(b3, 1, i10, StandardCharsets.UTF_8);
                a aVar = this.encoderMap.get(str);
                if (aVar != null) {
                    int i11 = i10 + 1;
                    return aVar.a(b3, i11, b3.length - i11);
                }
                warning(new Exception("No encoder for tag:".concat(str)));
                return null;
            }
            warning(new Exception("Read object data failed"));
            return null;
        } catch (Exception e2) {
            error(e2);
            return null;
        }
    }

    private String getStringFromFile(f.i iVar) {
        try {
            byte[] b3 = ap.b(new File(this.path + this.name, (String) iVar.f13623d));
            if (b3 != null && b3.length != 0) {
                return new String(b3, StandardCharsets.UTF_8);
            }
            return "";
        } catch (Exception e2) {
            error(e2);
        }
        return "";
    }

    private void info(String str) {
        b bVar = this.logger;
        if (bVar != null) {
            bVar.a(this.name, str);
        }
    }

    private boolean isABFileEqual() {
        p pVar = new p(this.dataEnd);
        this.bBuffer.rewind();
        this.bBuffer.get(pVar.a, 0, this.dataEnd);
        byte[] bArr = this.fastBuffer.a;
        byte[] bArr2 = pVar.a;
        for (int i10 = 0; i10 < this.dataEnd; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    private synchronized void loadData() {
        long nanoTime = System.nanoTime();
        if (!loadFromCFile() && this.writingMode == 0) {
            loadFromABFile();
        }
        if (this.fastBuffer == null) {
            this.fastBuffer = new p(PAGE_SIZE);
        }
        if (this.logger != null) {
            info("loading finish, data len:" + this.dataEnd + ", get keys:" + this.data.size() + ", use time:" + ((System.nanoTime() - nanoTime) / 1000000) + " ms");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void loadFromABFile() {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.FastKV.loadFromABFile():void");
    }

    private boolean loadFromCFile() {
        File file = new File(this.path, vd.e.h(new StringBuilder(), this.name, C_SUFFIX));
        File file2 = new File(this.path, vd.e.h(new StringBuilder(), this.name, TEMP_SUFFIX));
        boolean z10 = false;
        try {
            if (!file.exists()) {
                if (file2.exists()) {
                    file = file2;
                } else {
                    file = null;
                }
            }
            if (file != null) {
                if (loadWithBlockingIO(file)) {
                    if (this.writingMode != 0) {
                        return false;
                    }
                    if (writeToABFile(this.fastBuffer)) {
                        info("recover from c file");
                        try {
                            deleteCFiles();
                            return true;
                        } catch (Exception e2) {
                            e = e2;
                            z10 = true;
                            error(e);
                            return z10;
                        }
                    }
                    this.writingMode = 1;
                    return false;
                }
                clearData();
                deleteCFiles();
                return false;
            }
            if (this.writingMode == 0) {
                return false;
            }
            File file3 = new File(this.path, this.name + A_SUFFIX);
            File file4 = new File(this.path, this.name + B_SUFFIX);
            if (!file3.exists() || !file4.exists()) {
                return false;
            }
            tryBlockingIO(file3, file4);
            return false;
        } catch (Exception e10) {
            e = e10;
        }
    }

    private boolean loadWithBlockingIO(File file) throws IOException {
        long length = file.length();
        if (length != 0 && length <= 536870912) {
            int i10 = (int) length;
            int newCapacity = getNewCapacity(PAGE_SIZE, i10);
            p pVar = this.fastBuffer;
            if (pVar != null && pVar.a.length == newCapacity) {
                pVar.f13633b = 0;
            } else {
                pVar = new p(new byte[newCapacity]);
                this.fastBuffer = pVar;
            }
            ap.a(file, pVar.a, i10);
            int c10 = pVar.c();
            long b3 = pVar.b();
            this.dataEnd = c10 + 12;
            if (c10 >= 0 && c10 <= i10 - 12 && b3 == pVar.a(12, c10) && parseData() == 0) {
                this.checksum = b3;
                return true;
            }
        }
        return false;
    }

    private void mergeInvalids() {
        int size = this.invalids.size() - 1;
        c cVar = this.invalids.get(size);
        while (size > 0) {
            size--;
            c cVar2 = this.invalids.get(size);
            if (cVar.f13513b == cVar2.a) {
                cVar2.a = cVar.a;
                this.invalids.remove(size + 1);
            }
            cVar = cVar2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x017c, code lost:
    
        throw new java.lang.Exception(com.mbridge.msdk.foundation.tools.FastKV.PARSE_DATA_FAILED);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int parseData() {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.FastKV.parseData():int");
    }

    private void preparePutBytes() {
        ensureSize(this.updateSize);
        int i10 = this.dataEnd;
        this.updateStart = i10;
        this.dataEnd = this.updateSize + i10;
        this.fastBuffer.f13633b = i10;
        this.sizeChanged = true;
    }

    private void putKey(String str, int i10) {
        this.fastBuffer.a((byte) i10);
        if (i10 == str.length()) {
            p pVar = this.fastBuffer;
            str.getBytes(0, i10, pVar.a, pVar.f13633b);
            this.fastBuffer.f13633b += i10;
            return;
        }
        this.fastBuffer.b(str);
    }

    private void putStringValue(String str, int i10) {
        this.fastBuffer.a((short) i10);
        if (i10 == str.length()) {
            p pVar = this.fastBuffer;
            str.getBytes(0, i10, pVar.a, pVar.f13633b);
        } else {
            this.fastBuffer.b(str);
        }
    }

    private void resetBuffer(MappedByteBuffer mappedByteBuffer) throws IOException {
        FileChannel fileChannel;
        int capacity = mappedByteBuffer.capacity();
        int i10 = PAGE_SIZE;
        if (capacity != i10) {
            if (mappedByteBuffer == this.aBuffer) {
                fileChannel = this.aChannel;
            } else {
                fileChannel = this.bChannel;
            }
            FileChannel fileChannel2 = fileChannel;
            fileChannel2.truncate(i10);
            MappedByteBuffer map = fileChannel2.map(FileChannel.MapMode.READ_WRITE, 0L, i10);
            map.order(ByteOrder.LITTLE_ENDIAN);
            if (mappedByteBuffer == this.aBuffer) {
                this.aBuffer = map;
            } else {
                this.bBuffer = map;
            }
            mappedByteBuffer = map;
        }
        mappedByteBuffer.putInt(0, 0);
        mappedByteBuffer.putLong(4, 0L);
    }

    private void resetData() {
        if (this.writingMode == 0) {
            try {
                resetBuffer(this.aBuffer);
                resetBuffer(this.bBuffer);
            } catch (IOException unused) {
                toBlockingMode();
            }
        }
        clearData();
        ap.a(new File(this.path + this.name));
    }

    private int saveArray(String str, byte[] bArr, byte b3) {
        this.tempExternalName = null;
        if (bArr.length < INTERNAL_LIMIT) {
            return wrapArray(str, bArr, b3);
        }
        StringBuilder o10 = a4.j.o("large value, key: ", str, ", size: ");
        o10.append(bArr.length);
        info(o10.toString());
        String b10 = ap.b();
        if (ap.a(new File(this.path + this.name, b10), bArr)) {
            this.tempExternalName = b10;
            byte[] bArr2 = new byte[32];
            b10.getBytes(0, 32, bArr2, 0);
            return wrapArray(str, bArr2, (byte) (b3 | 64));
        }
        error("save large value failed");
        return 0;
    }

    private long shiftCheckSum(long j3, int i10) {
        int i11 = (i10 & 7) << 3;
        return (j3 >>> (64 - i11)) | (j3 << i11);
    }

    private void syncABBuffer(MappedByteBuffer mappedByteBuffer) {
        if (this.sizeChanged && mappedByteBuffer != this.aBuffer) {
            mappedByteBuffer.putInt(0, this.dataEnd - 12);
        }
        mappedByteBuffer.putLong(4, this.checksum);
        int i10 = this.removeStart;
        if (i10 != 0) {
            mappedByteBuffer.put(i10, this.fastBuffer.a[i10]);
        }
        if (this.updateSize != 0) {
            mappedByteBuffer.position(this.updateStart);
            mappedByteBuffer.put(this.fastBuffer.a, this.updateStart, this.updateSize);
        }
    }

    private void toBlockingMode() {
        this.writingMode = 1;
        ap.a(this.aChannel);
        ap.a(this.bChannel);
        this.aChannel = null;
        this.bChannel = null;
        this.aBuffer = null;
        this.bBuffer = null;
    }

    private void truncate(int i10) {
        int i11 = PAGE_SIZE;
        int newCapacity = getNewCapacity(i11, i10 + i11);
        byte[] bArr = this.fastBuffer.a;
        if (newCapacity >= bArr.length) {
            return;
        }
        byte[] bArr2 = new byte[newCapacity];
        System.arraycopy(bArr, 0, bArr2, 0, this.dataEnd);
        this.fastBuffer.a = bArr2;
        if (this.writingMode == 0) {
            try {
                long j3 = newCapacity;
                this.aChannel.truncate(j3);
                MappedByteBuffer map = this.aChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j3);
                this.aBuffer = map;
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                this.bChannel.truncate(j3);
                MappedByteBuffer map2 = this.bChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j3);
                this.bBuffer = map2;
                map2.order(byteOrder);
            } catch (IOException e2) {
                error(new Exception(MAP_FAILED, e2));
                toBlockingMode();
            }
        }
        info(TRUNCATE_FINISH);
    }

    private void tryBlockingIO(File file, File file2) {
        try {
            if (loadWithBlockingIO(file)) {
                return;
            }
        } catch (IOException e2) {
            warning(e2);
        }
        clearData();
        try {
            if (loadWithBlockingIO(file2)) {
                return;
            }
        } catch (IOException e10) {
            warning(e10);
        }
        clearData();
    }

    private void updateBoolean(byte b3, int i10) {
        long shiftCheckSum = this.checksum ^ shiftCheckSum(1L, i10);
        this.checksum = shiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, shiftCheckSum);
            this.aBuffer.put(i10, b3);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.put(i10, b3);
        } else {
            this.fastBuffer.a(4, shiftCheckSum);
        }
        this.fastBuffer.a[i10] = b3;
    }

    private void updateBytes(int i10, byte[] bArr) {
        int length = bArr.length;
        this.checksum ^= this.fastBuffer.a(i10, length);
        p pVar = this.fastBuffer;
        pVar.f13633b = i10;
        pVar.a(bArr);
        long a10 = this.checksum ^ this.fastBuffer.a(i10, length);
        this.checksum = a10;
        if (this.writingMode == 0) {
            this.aBuffer.putInt(0, -1);
            this.aBuffer.putLong(4, this.checksum);
            this.aBuffer.position(i10);
            this.aBuffer.put(bArr);
            this.aBuffer.putInt(0, this.dataEnd - 12);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.position(i10);
            this.bBuffer.put(bArr);
            return;
        }
        this.fastBuffer.a(4, a10);
    }

    private void updateChange() {
        this.checksum ^= this.fastBuffer.a(this.updateStart, this.updateSize);
        if (this.writingMode == 0) {
            this.aBuffer.putInt(0, -1);
            syncABBuffer(this.aBuffer);
            this.aBuffer.putInt(0, this.dataEnd - 12);
            syncABBuffer(this.bBuffer);
        } else {
            if (this.sizeChanged) {
                this.fastBuffer.b(0, this.dataEnd - 12);
            }
            this.fastBuffer.a(4, this.checksum);
        }
        this.sizeChanged = false;
        this.removeStart = 0;
        this.updateSize = 0;
    }

    private void updateInt32(int i10, long j3, int i11) {
        long shiftCheckSum = shiftCheckSum(j3, i11) ^ this.checksum;
        this.checksum = shiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, shiftCheckSum);
            this.aBuffer.putInt(i11, i10);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.putInt(i11, i10);
        } else {
            this.fastBuffer.a(4, shiftCheckSum);
        }
        this.fastBuffer.b(i11, i10);
    }

    private void updateInt64(long j3, long j10, int i10) {
        long shiftCheckSum = shiftCheckSum(j10, i10) ^ this.checksum;
        this.checksum = shiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, shiftCheckSum);
            this.aBuffer.putLong(i10, j3);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.putLong(i10, j3);
        } else {
            this.fastBuffer.a(4, shiftCheckSum);
        }
        this.fastBuffer.a(i10, j3);
    }

    private void updateObject(String str, Object obj, byte[] bArr, f.j jVar) {
        String str2;
        boolean z10;
        int saveArray = saveArray(str, bArr, jVar.a());
        if (saveArray != 0) {
            if (jVar.f13621b) {
                str2 = (String) jVar.f13623d;
            } else {
                str2 = null;
            }
            remove(jVar.a(), jVar.f13622c, jVar.a + jVar.f13624e);
            String str3 = this.tempExternalName;
            if (str3 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            jVar.f13622c = this.updateStart;
            jVar.a = saveArray;
            jVar.f13621b = z10;
            if (z10) {
                jVar.f13623d = str3;
                jVar.f13624e = 32;
                this.tempExternalName = null;
            } else {
                jVar.f13623d = obj;
                jVar.f13624e = bArr.length;
            }
            updateChange();
            checkGC();
            if (str2 != null) {
                ap.a(new File(this.path + this.name, str2));
            }
        }
    }

    private void updateOffset(int i10, int[] iArr) {
        for (f.b bVar : this.data.values()) {
            int i11 = bVar.a;
            if (i11 > i10) {
                int length = (iArr.length >> 1) - 1;
                int i12 = 0;
                while (true) {
                    if (i12 > length) {
                        break;
                    }
                    int i13 = (i12 + length) >>> 1;
                    int i14 = iArr[i13 << 1];
                    if (i14 < i11) {
                        i12 = i13 + 1;
                    } else {
                        if (i14 <= i11) {
                            length = i13;
                            break;
                        }
                        length = i13 - 1;
                    }
                }
                int i15 = iArr[(length << 1) + 1];
                bVar.a -= i15;
                if (bVar.a() >= 6) {
                    ((f.j) bVar).f13622c -= i15;
                }
            }
        }
    }

    private void warning(Exception exc) {
        b bVar = this.logger;
        if (bVar != null) {
            bVar.b(this.name, exc);
        }
    }

    private int wrapArray(String str, byte[] bArr, byte b3) {
        wrapHeader(str, b3, bArr.length + 2);
        this.fastBuffer.a((short) bArr.length);
        p pVar = this.fastBuffer;
        int i10 = pVar.f13633b;
        pVar.a(bArr);
        return i10;
    }

    private void wrapHeader(String str, byte b3) {
        wrapHeader(str, b3, TYPE_SIZE[b3]);
    }

    private boolean writeToABFile(p pVar) {
        int length = pVar.a.length;
        File file = new File(this.path, vd.e.h(new StringBuilder(), this.name, A_SUFFIX));
        File file2 = new File(this.path, vd.e.h(new StringBuilder(), this.name, B_SUFFIX));
        try {
            if (ap.c(file) && ap.c(file2)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                long j3 = length;
                randomAccessFile.setLength(j3);
                randomAccessFile2.setLength(j3);
                this.aChannel = randomAccessFile.getChannel();
                this.bChannel = randomAccessFile2.getChannel();
                MappedByteBuffer map = this.aChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j3);
                this.aBuffer = map;
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                MappedByteBuffer map2 = this.bChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j3);
                this.bBuffer = map2;
                map2.order(byteOrder);
                this.aBuffer.put(pVar.a, 0, this.dataEnd);
                this.bBuffer.put(pVar.a, 0, this.dataEnd);
                return true;
            }
            throw new Exception(OPEN_FILE_FAILED);
        } catch (Exception e2) {
            error(e2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean writeToCFile() {
        try {
            File file = new File(this.path, this.name + TEMP_SUFFIX);
            if (ap.c(file)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.setLength(this.dataEnd);
                randomAccessFile.write(this.fastBuffer.a, 0, this.dataEnd);
                randomAccessFile.close();
                File file2 = new File(this.path, this.name + C_SUFFIX);
                if (!file2.exists() || file2.delete()) {
                    if (file.renameTo(file2)) {
                        return true;
                    }
                    warning(new Exception("rename failed"));
                }
            }
        } catch (Exception e2) {
            error(e2);
        }
        return false;
    }

    public synchronized void clear() {
        resetData();
        if (this.writingMode != 0) {
            deleteCFiles();
        }
    }

    public synchronized boolean commit() {
        this.autoCommit = true;
        return commitToCFile();
    }

    public synchronized boolean contains(String str) {
        return this.data.containsKey(str);
    }

    public synchronized void disableAutoCommit() {
        this.autoCommit = false;
    }

    public synchronized void force() {
        if (this.writingMode == 0) {
            this.aBuffer.force();
            this.bBuffer.force();
        }
    }

    public void gc(int i10) {
        boolean z10;
        int i11;
        Collections.sort(this.invalids);
        mergeInvalids();
        c cVar = this.invalids.get(0);
        int i12 = cVar.f13513b;
        int i13 = this.dataEnd;
        int i14 = i13 - this.invalidBytes;
        int i15 = i14 - 12;
        int i16 = i14 - i12;
        int i17 = i13 - i12;
        if (i15 < i17 + i16) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.checksum ^= this.fastBuffer.a(i12, i17);
        }
        int size = this.invalids.size();
        int i18 = size - 1;
        int i19 = this.dataEnd - this.invalids.get(i18).a;
        if (i19 > 0) {
            i11 = size;
        } else {
            i11 = i18;
        }
        int[] iArr = new int[i11 << 1];
        int i20 = cVar.f13513b;
        int i21 = cVar.a;
        for (int i22 = 1; i22 < size; i22++) {
            c cVar2 = this.invalids.get(i22);
            int i23 = cVar2.f13513b - i21;
            byte[] bArr = this.fastBuffer.a;
            System.arraycopy(bArr, i21, bArr, i20, i23);
            int i24 = (i22 - 1) << 1;
            iArr[i24] = i21;
            iArr[i24 + 1] = i21 - i20;
            i20 += i23;
            i21 = cVar2.a;
        }
        if (i19 > 0) {
            byte[] bArr2 = this.fastBuffer.a;
            System.arraycopy(bArr2, i21, bArr2, i20, i19);
            int i25 = i18 << 1;
            iArr[i25] = i21;
            iArr[i25 + 1] = i21 - i20;
        }
        clearInvalid();
        if (z10) {
            this.checksum = this.fastBuffer.a(12, i15);
        } else {
            this.checksum ^= this.fastBuffer.a(i12, i16);
        }
        this.dataEnd = i14;
        if (this.writingMode == 0) {
            this.aBuffer.putInt(0, -1);
            this.aBuffer.putLong(4, this.checksum);
            this.aBuffer.position(i12);
            this.aBuffer.put(this.fastBuffer.a, i12, i16);
            this.aBuffer.putInt(0, i15);
            this.bBuffer.putInt(0, i15);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.position(i12);
            this.bBuffer.put(this.fastBuffer.a, i12, i16);
        } else {
            this.fastBuffer.b(0, i15);
            this.fastBuffer.a(4, this.checksum);
        }
        updateOffset(i12, iArr);
        int i26 = i14 + i10;
        if (this.fastBuffer.a.length - i26 > TRUNCATE_THRESHOLD) {
            truncate(i26);
        }
        info(GC_FINISH);
    }

    public synchronized Map<String, Object> getAll() {
        Object valueOf;
        int size = this.data.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry<String, f.b> entry : this.data.entrySet()) {
            String key = entry.getKey();
            f.b value = entry.getValue();
            switch (value.a()) {
                case 1:
                    valueOf = Boolean.valueOf(((f.c) value).f13616b);
                    break;
                case 2:
                    valueOf = Integer.valueOf(((f.C0176f) value).f13619b);
                    break;
                case 3:
                    valueOf = Float.valueOf(((f.e) value).f13618b);
                    break;
                case 4:
                    valueOf = Long.valueOf(((f.g) value).f13620b);
                    break;
                case 5:
                    valueOf = Double.valueOf(((f.d) value).f13617b);
                    break;
                case 6:
                    f.i iVar = (f.i) value;
                    if (iVar.f13621b) {
                        valueOf = getStringFromFile(iVar);
                        break;
                    } else {
                        valueOf = iVar.f13623d;
                        break;
                    }
                case 7:
                    f.a aVar = (f.a) value;
                    if (aVar.f13621b) {
                        valueOf = getArrayFromFile(aVar);
                        break;
                    } else {
                        valueOf = aVar.f13623d;
                        break;
                    }
                case 8:
                    f.h hVar = (f.h) value;
                    if (hVar.f13621b) {
                        valueOf = getObjectFromFile(hVar);
                        break;
                    } else {
                        valueOf = ((f.h) value).f13623d;
                        break;
                    }
                default:
                    valueOf = null;
                    break;
            }
            hashMap.put(key, valueOf);
        }
        return hashMap;
    }

    public byte[] getArray(String str) {
        return getArray(str, EMPTY_ARRAY);
    }

    public synchronized boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public double getDouble(String str) {
        return getDouble(str, 0.0d);
    }

    public float getFloat(String str) {
        return getFloat(str, 0.0f);
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public synchronized long getLong(String str) {
        f.g gVar;
        gVar = (f.g) this.data.get(str);
        return gVar == null ? 0L : gVar.f13620b;
    }

    public synchronized <T> T getObject(String str) {
        T t5;
        f.h hVar = (f.h) this.data.get(str);
        if (hVar != null) {
            if (hVar.f13621b) {
                t5 = (T) getObjectFromFile(hVar);
            } else {
                t5 = (T) hVar.f13623d;
            }
            return t5;
        }
        return null;
    }

    public String getString(String str) {
        return getString(str, "");
    }

    public synchronized Set<String> getStringSet(String str) {
        return (Set) getObject(str);
    }

    public void putAll(Map<String, Object> map) {
        putAll(map, null);
    }

    public synchronized void putArray(String str, byte[] bArr) {
        checkKey(str);
        if (bArr == null) {
            remove(str);
        } else {
            addOrUpdate(str, bArr, bArr, (f.a) this.data.get(str), (byte) 7);
        }
    }

    public synchronized void putBoolean(String str, boolean z10) {
        checkKey(str);
        f.c cVar = (f.c) this.data.get(str);
        int i10 = 0;
        if (cVar == null) {
            wrapHeader(str, (byte) 1);
            p pVar = this.fastBuffer;
            int i11 = pVar.f13633b;
            if (z10) {
                i10 = 1;
            }
            pVar.a((byte) i10);
            updateChange();
            this.data.put(str, new f.c(i11, z10));
            checkIfCommit();
        } else if (cVar.f13616b != z10) {
            cVar.f13616b = z10;
            if (z10) {
                i10 = 1;
            }
            updateBoolean((byte) i10, cVar.a);
            checkIfCommit();
        }
    }

    public synchronized void putDouble(String str, double d10) {
        checkKey(str);
        f.d dVar = (f.d) this.data.get(str);
        if (dVar == null) {
            wrapHeader(str, (byte) 5);
            p pVar = this.fastBuffer;
            int i10 = pVar.f13633b;
            pVar.a(Double.doubleToRawLongBits(d10));
            updateChange();
            this.data.put(str, new f.d(i10, d10));
            checkIfCommit();
        } else if (dVar.f13617b != d10) {
            long doubleToRawLongBits = Double.doubleToRawLongBits(d10);
            long doubleToRawLongBits2 = Double.doubleToRawLongBits(dVar.f13617b) ^ doubleToRawLongBits;
            dVar.f13617b = d10;
            updateInt64(doubleToRawLongBits, doubleToRawLongBits2, dVar.a);
            checkIfCommit();
        }
    }

    public synchronized void putFloat(String str, float f10) {
        checkKey(str);
        f.e eVar = (f.e) this.data.get(str);
        if (eVar == null) {
            wrapHeader(str, (byte) 3);
            p pVar = this.fastBuffer;
            int i10 = pVar.f13633b;
            pVar.b(Float.floatToRawIntBits(f10));
            updateChange();
            this.data.put(str, new f.e(i10, f10));
            checkIfCommit();
        } else if (eVar.f13618b != f10) {
            eVar.f13618b = f10;
            updateInt32(Float.floatToRawIntBits(f10), (Float.floatToRawIntBits(eVar.f13618b) ^ r6) & 4294967295L, eVar.a);
            checkIfCommit();
        }
    }

    public synchronized void putInt(String str, int i10) {
        checkKey(str);
        f.C0176f c0176f = (f.C0176f) this.data.get(str);
        if (c0176f == null) {
            wrapHeader(str, (byte) 2);
            p pVar = this.fastBuffer;
            int i11 = pVar.f13633b;
            pVar.b(i10);
            updateChange();
            this.data.put(str, new f.C0176f(i11, i10));
            checkIfCommit();
        } else {
            if (c0176f.f13619b != i10) {
                c0176f.f13619b = i10;
                updateInt32(i10, (r6 ^ i10) & 4294967295L, c0176f.a);
                checkIfCommit();
            }
        }
    }

    public synchronized void putLong(String str, long j3) {
        checkKey(str);
        f.g gVar = (f.g) this.data.get(str);
        if (gVar == null) {
            wrapHeader(str, (byte) 4);
            p pVar = this.fastBuffer;
            int i10 = pVar.f13633b;
            pVar.a(j3);
            updateChange();
            this.data.put(str, new f.g(i10, j3));
            checkIfCommit();
        } else {
            long j10 = gVar.f13620b;
            if (j10 != j3) {
                gVar.f13620b = j3;
                updateInt64(j3, j3 ^ j10, gVar.a);
                checkIfCommit();
            }
        }
    }

    public synchronized <T> void putObject(String str, T t5, a<T> aVar) {
        byte[] bArr;
        checkKey(str);
        if (aVar != null) {
            String a10 = aVar.a();
            if (a10 != null && !a10.isEmpty() && a10.length() <= 50) {
                if (this.encoderMap.containsKey(a10)) {
                    if (t5 == null) {
                        remove(str);
                        return;
                    }
                    try {
                        bArr = aVar.a(t5);
                    } catch (Exception e2) {
                        error(e2);
                        bArr = null;
                    }
                    if (bArr == null) {
                        remove(str);
                        return;
                    }
                    int a11 = p.a(a10);
                    p pVar = new p(a11 + 1 + bArr.length);
                    pVar.a((byte) a11);
                    pVar.b(a10);
                    pVar.a(bArr);
                    addOrUpdate(str, t5, pVar.a, (f.h) this.data.get(str), (byte) 8);
                    return;
                }
                throw new IllegalArgumentException("Encoder hasn't been registered");
            }
            throw new IllegalArgumentException("Invalid encoder tag:" + a10);
        }
        throw new IllegalArgumentException("Encoder is null");
    }

    public synchronized void putString(String str, String str2) {
        byte[] bytes;
        checkKey(str);
        if (str2 == null) {
            remove(str);
        } else {
            f.i iVar = (f.i) this.data.get(str);
            if (str2.length() * 3 < INTERNAL_LIMIT) {
                fastPutString(str, str2, iVar);
            } else {
                if (str2.isEmpty()) {
                    bytes = EMPTY_ARRAY;
                } else {
                    bytes = str2.getBytes(StandardCharsets.UTF_8);
                }
                addOrUpdate(str, str2, bytes, iVar, (byte) 6);
            }
        }
    }

    public synchronized void putStringSet(String str, Set<String> set) {
        if (set == null) {
            remove(str);
        } else {
            putObject(str, set, am.a);
        }
    }

    public synchronized void remove(String str) {
        f.b bVar = this.data.get(str);
        if (bVar != null) {
            this.data.remove(str);
            byte a10 = bVar.a();
            String str2 = null;
            if (a10 <= 5) {
                int a11 = p.a(str);
                int i10 = bVar.a;
                remove(a10, i10 - (a11 + 2), i10 + TYPE_SIZE[a10]);
            } else {
                f.j jVar = (f.j) bVar;
                remove(a10, jVar.f13622c, jVar.a + jVar.f13624e);
                if (jVar.f13621b) {
                    str2 = (String) jVar.f13623d;
                }
            }
            byte b3 = (byte) (a10 | ByteCompanionObject.MIN_VALUE);
            if (this.writingMode == 0) {
                this.aBuffer.putLong(4, this.checksum);
                this.aBuffer.put(this.removeStart, b3);
                this.bBuffer.putLong(4, this.checksum);
                this.bBuffer.put(this.removeStart, b3);
            } else {
                this.fastBuffer.a(4, this.checksum);
            }
            this.removeStart = 0;
            if (str2 != null) {
                ap.a(new File(this.path + this.name, str2));
            }
            checkGC();
            checkIfCommit();
        }
    }

    public synchronized String toString() {
        return "FastKV: path:" + this.path + " name:" + this.name;
    }

    private void wrapHeader(String str, byte b3, int i10) {
        int a10 = p.a(str);
        checkKeySize(a10);
        this.updateSize = a10 + 2 + i10;
        preparePutBytes();
        this.fastBuffer.a(b3);
        putKey(str, a10);
    }

    public synchronized byte[] getArray(String str, byte[] bArr) {
        f.a aVar = (f.a) this.data.get(str);
        if (aVar != null) {
            return aVar.f13621b ? getArrayFromFile(aVar) : (byte[]) aVar.f13623d;
        }
        return bArr;
    }

    public synchronized boolean getBoolean(String str, boolean z10) {
        f.c cVar = (f.c) this.data.get(str);
        if (cVar != null) {
            z10 = cVar.f13616b;
        }
        return z10;
    }

    public synchronized double getDouble(String str, double d10) {
        f.d dVar = (f.d) this.data.get(str);
        if (dVar != null) {
            d10 = dVar.f13617b;
        }
        return d10;
    }

    public synchronized float getFloat(String str, float f10) {
        f.e eVar = (f.e) this.data.get(str);
        if (eVar != null) {
            f10 = eVar.f13618b;
        }
        return f10;
    }

    public synchronized int getInt(String str, int i10) {
        f.C0176f c0176f = (f.C0176f) this.data.get(str);
        if (c0176f != null) {
            i10 = c0176f.f13619b;
        }
        return i10;
    }

    public synchronized String getString(String str, String str2) {
        f.i iVar = (f.i) this.data.get(str);
        if (iVar != null) {
            return iVar.f13621b ? getStringFromFile(iVar) : (String) iVar.f13623d;
        }
        return str2;
    }

    public synchronized void putAll(Map<String, Object> map, Map<Class, a> map2) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && !key.isEmpty()) {
                if (value instanceof String) {
                    putString(key, (String) value);
                } else if (value instanceof Boolean) {
                    putBoolean(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    putInt(key, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    putLong(key, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    putFloat(key, ((Float) value).floatValue());
                } else if (value instanceof Double) {
                    putDouble(key, ((Double) value).doubleValue());
                } else if (value instanceof Set) {
                    Set set = (Set) value;
                    if (!set.isEmpty() && (set.iterator().next() instanceof String)) {
                        putStringSet(key, (Set) value);
                    }
                } else if (value instanceof byte[]) {
                    putArray(key, (byte[]) value);
                } else if (map2 != null) {
                    a aVar = map2.get(value.getClass());
                    if (aVar != null) {
                        putObject(key, value, aVar);
                    } else {
                        warning(new Exception("missing encoder for type:" + value.getClass()));
                    }
                } else {
                    warning(new Exception("missing encoders"));
                }
            }
        }
    }

    private void error(String str) {
        b bVar = this.logger;
        if (bVar != null) {
            bVar.a(this.name, new Exception(str));
        }
    }

    public synchronized long getLong(String str, long j3) {
        f.g gVar = (f.g) this.data.get(str);
        if (gVar != null) {
            j3 = gVar.f13620b;
        }
        return j3;
    }

    private void remove(byte b3, int i10, int i11) {
        countInvalid(i10, i11);
        byte b10 = (byte) (b3 | ByteCompanionObject.MIN_VALUE);
        byte[] bArr = this.fastBuffer.a;
        this.checksum = (((bArr[i10] ^ b10) & 255) << ((i10 & 7) << 3)) ^ this.checksum;
        bArr[i10] = b10;
        this.removeStart = i10;
    }
}
