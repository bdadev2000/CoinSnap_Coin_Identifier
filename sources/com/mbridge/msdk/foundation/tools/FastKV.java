package com.mbridge.msdk.foundation.tools;

import androidx.fragment.app.FragmentTransaction;
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
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
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
    private final b logger = q.b;
    private boolean autoCommit = true;

    /* loaded from: classes3.dex */
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
                    try {
                        fastKV = map.get(str);
                        if (fastKV == null) {
                            fastKV = new FastKV(this.path, this.name, this.encoders, this.writingMode);
                            map.put(str, fastKV);
                        }
                    } finally {
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

    /* loaded from: classes3.dex */
    public interface a<T> {
        T a(byte[] bArr, int i9, int i10);

        String a();

        byte[] a(T t9);
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(String str, Exception exc);

        void a(String str, String str2);

        void b(String str, Exception exc);
    }

    /* loaded from: classes3.dex */
    public static class c implements Comparable<c> {

        /* renamed from: a, reason: collision with root package name */
        int f15953a;
        int b;

        public c(int i9, int i10) {
            this.b = i9;
            this.f15953a = i10;
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(c cVar) {
            return this.b - cVar.b;
        }
    }

    static {
        int a6 = ap.a();
        PAGE_SIZE = a6;
        int max = Math.max(a6 << 1, 16384);
        DOUBLE_LIMIT = max;
        TRUNCATE_THRESHOLD = max << 1;
        TYPE_SIZE = new int[]{0, 1, 4, 4, 8, 8};
    }

    public FastKV(String str, String str2, a[] aVarArr, int i9) {
        this.path = str;
        this.name = str2;
        this.writingMode = i9;
        HashMap hashMap = new HashMap();
        hashMap.put("StringSet", am.f16025a);
        if (aVarArr != null && aVarArr.length > 0) {
            for (a aVar : aVarArr) {
                String a6 = aVar.a();
                if (hashMap.containsKey(a6)) {
                    error(AbstractC2914a.d("duplicate encoder tag:", a6));
                } else {
                    hashMap.put(a6, aVar);
                }
            }
        }
        this.encoderMap = hashMap;
        loadData();
    }

    private void addObject(String str, Object obj, byte[] bArr, byte b8) {
        boolean z8;
        Object obj2;
        int length;
        f.b hVar;
        int saveArray = saveArray(str, bArr, b8);
        if (saveArray != 0) {
            String str2 = this.tempExternalName;
            if (str2 != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z9 = z8;
            if (z9) {
                this.tempExternalName = null;
                length = 32;
                obj2 = str2;
            } else {
                obj2 = obj;
                length = bArr.length;
            }
            if (b8 == 6) {
                hVar = new f.i(this.updateStart, saveArray, (String) obj2, length, z9);
            } else if (b8 == 7) {
                hVar = new f.a(this.updateStart, saveArray, obj2, length, z9);
            } else {
                hVar = new f.h(this.updateStart, saveArray, obj2, length, z9);
            }
            this.data.put(str, hVar);
            updateChange();
        }
    }

    private void addOrUpdate(String str, Object obj, byte[] bArr, f.j jVar, byte b8) {
        if (jVar == null) {
            addObject(str, obj, bArr, b8);
        } else if (!jVar.b && jVar.f16062e == bArr.length) {
            updateBytes(jVar.f16059a, bArr);
            jVar.f16061d = obj;
        } else {
            updateObject(str, obj, bArr, jVar);
        }
        checkIfCommit();
    }

    private int bytesThreshold() {
        int i9 = this.dataEnd;
        if (i9 <= 16384) {
            return 4096;
        }
        if (i9 > 65536) {
            return 16384;
        }
        return FragmentTransaction.TRANSIT_EXIT_MASK;
    }

    private void checkGC() {
        int i9;
        if (this.invalidBytes < (bytesThreshold() << 1)) {
            int size = this.invalids.size();
            if (this.dataEnd < 16384) {
                i9 = BASE_GC_KEYS_THRESHOLD;
            } else {
                i9 = 160;
            }
            if (size < i9) {
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

    private void checkKeySize(int i9) {
        if (i9 <= 255) {
        } else {
            throw new IllegalArgumentException("key's length must less than 256");
        }
    }

    private void checkValueSize(int i9, boolean z8) {
        if (z8) {
            if (i9 != 32) {
                throw new IllegalStateException("name size not match");
            }
        } else if (i9 >= 0 && i9 < INTERNAL_LIMIT) {
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
        if (pVar != null && pVar.f16073a.length == PAGE_SIZE) {
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
        int i9 = this.writingMode;
        if (i9 == 1) {
            this.executor.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.FastKV.1
                @Override // java.lang.Runnable
                public final void run() {
                    FastKV.this.writeToCFile();
                }
            });
        } else if (i9 == 2) {
            return writeToCFile();
        }
        return true;
    }

    private void copyBuffer(MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, int i9) {
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
            } catch (IOException e4) {
                error(e4);
                toBlockingMode();
                return;
            }
        }
        mappedByteBuffer.rewind();
        mappedByteBuffer2.rewind();
        mappedByteBuffer.limit(i9);
        mappedByteBuffer2.put(mappedByteBuffer);
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    private void countInvalid(int i9, int i10) {
        this.invalidBytes = (i10 - i9) + this.invalidBytes;
        this.invalids.add(new c(i9, i10));
    }

    private void deleteCFiles() {
        try {
            ap.a(new File(this.path, this.name + C_SUFFIX));
            ap.a(new File(this.path, this.name + TEMP_SUFFIX));
        } catch (Exception e4) {
            error(e4);
        }
    }

    private void ensureSize(int i9) {
        int length = this.fastBuffer.f16073a.length;
        int i10 = this.dataEnd + i9;
        if (i10 >= length) {
            int i11 = this.invalidBytes;
            if (i11 > i9 && i11 > bytesThreshold()) {
                gc(i9);
                return;
            }
            int newCapacity = getNewCapacity(length, i10);
            byte[] bArr = new byte[newCapacity];
            System.arraycopy(this.fastBuffer.f16073a, 0, bArr, 0, this.dataEnd);
            this.fastBuffer.f16073a = bArr;
            if (this.writingMode == 0) {
                try {
                    FileChannel fileChannel = this.aChannel;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    long j7 = newCapacity;
                    MappedByteBuffer map = fileChannel.map(mapMode, 0L, j7);
                    this.aBuffer = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    MappedByteBuffer map2 = this.bChannel.map(mapMode, 0L, j7);
                    this.bBuffer = map2;
                    map2.order(byteOrder);
                } catch (IOException e4) {
                    error(new Exception(MAP_FAILED, e4));
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
        int a6 = p.a(str2);
        if (iVar == null) {
            int a9 = p.a(str);
            checkKeySize(a9);
            int i9 = a9 + 4;
            this.updateSize = i9 + a6;
            preparePutBytes();
            this.fastBuffer.a((byte) 6);
            putKey(str, a9);
            putStringValue(str2, a6);
            Map<String, f.b> map = this.data;
            int i10 = this.updateStart;
            map.put(str, new f.i(i10, i10 + i9, str2, a6, false));
            updateChange();
        } else {
            int i11 = iVar.f16059a;
            int i12 = i11 - iVar.f16060c;
            int i13 = iVar.f16062e;
            boolean z8 = false;
            String str3 = null;
            if (i13 == a6) {
                this.checksum ^= this.fastBuffer.a(i11, i13);
                if (a6 == str2.length()) {
                    str2.getBytes(0, a6, this.fastBuffer.f16073a, iVar.f16059a);
                } else {
                    p pVar = this.fastBuffer;
                    pVar.b = iVar.f16059a;
                    pVar.b(str2);
                }
                this.updateStart = iVar.f16059a;
                this.updateSize = a6;
            } else {
                this.updateSize = i12 + a6;
                preparePutBytes();
                this.fastBuffer.a((byte) 6);
                int i14 = i12 - 3;
                p pVar2 = this.fastBuffer;
                byte[] bArr = pVar2.f16073a;
                System.arraycopy(bArr, iVar.f16060c + 1, bArr, pVar2.b, i14);
                this.fastBuffer.b += i14;
                putStringValue(str2, a6);
                remove((byte) 6, iVar.f16060c, iVar.f16059a + iVar.f16062e);
                if (iVar.b) {
                    str3 = (String) iVar.f16061d;
                }
                iVar.b = false;
                int i15 = this.updateStart;
                iVar.f16060c = i15;
                iVar.f16059a = i15 + i12;
                iVar.f16062e = a6;
                z8 = true;
            }
            iVar.f16061d = str2;
            updateChange();
            if (z8) {
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
            byte[] b8 = ap.b(new File(this.path + this.name, (String) aVar.f16061d));
            if (b8 == null) {
                return EMPTY_ARRAY;
            }
            return b8;
        } catch (Exception e4) {
            error(e4);
            return EMPTY_ARRAY;
        }
    }

    private int getNewCapacity(int i9, int i10) {
        if (i10 <= DATA_SIZE_LIMIT) {
            int i11 = PAGE_SIZE;
            if (i10 <= i11) {
                return i11;
            }
            while (i9 < i10) {
                int i12 = DOUBLE_LIMIT;
                if (i9 <= i12) {
                    i9 <<= 1;
                } else {
                    i9 += i12;
                }
            }
            return i9;
        }
        throw new IllegalStateException("data size out of limit");
    }

    private Object getObjectFromFile(f.h hVar) {
        try {
            byte[] b8 = ap.b(new File(this.path + this.name, (String) hVar.f16061d));
            if (b8 != null) {
                int i9 = b8[0] & 255;
                String str = new String(b8, 1, i9, StandardCharsets.UTF_8);
                a aVar = this.encoderMap.get(str);
                if (aVar != null) {
                    int i10 = i9 + 1;
                    return aVar.a(b8, i10, b8.length - i10);
                }
                warning(new Exception("No encoder for tag:".concat(str)));
                return null;
            }
            warning(new Exception("Read object data failed"));
            return null;
        } catch (Exception e4) {
            error(e4);
            return null;
        }
    }

    private String getStringFromFile(f.i iVar) {
        try {
            byte[] b8 = ap.b(new File(this.path + this.name, (String) iVar.f16061d));
            if (b8 != null && b8.length != 0) {
                return new String(b8, StandardCharsets.UTF_8);
            }
            return "";
        } catch (Exception e4) {
            error(e4);
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
        this.bBuffer.get(pVar.f16073a, 0, this.dataEnd);
        byte[] bArr = this.fastBuffer.f16073a;
        byte[] bArr2 = pVar.f16073a;
        for (int i9 = 0; i9 < this.dataEnd; i9++) {
            if (bArr[i9] != bArr2[i9]) {
                return false;
            }
        }
        return true;
    }

    private synchronized void loadData() {
        try {
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
        } catch (Throwable th) {
            throw th;
        }
    }

    private void loadFromABFile() {
        long j7;
        long j9;
        FastKV fastKV = this;
        File file = new File(fastKV.path, AbstractC2914a.h(new StringBuilder(), fastKV.name, A_SUFFIX));
        File file2 = new File(fastKV.path, AbstractC2914a.h(new StringBuilder(), fastKV.name, B_SUFFIX));
        try {
            if (ap.c(file) && ap.c(file2)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                long length = randomAccessFile.length();
                long length2 = randomAccessFile2.length();
                fastKV.aChannel = randomAccessFile.getChannel();
                fastKV.bChannel = randomAccessFile2.getChannel();
                try {
                    FileChannel fileChannel = fastKV.aChannel;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    if (length > 0) {
                        j7 = length;
                    } else {
                        j7 = PAGE_SIZE;
                    }
                    MappedByteBuffer map = fileChannel.map(mapMode, 0L, j7);
                    fastKV.aBuffer = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    FileChannel fileChannel2 = fastKV.bChannel;
                    if (length2 > 0) {
                        j9 = length2;
                    } else {
                        j9 = PAGE_SIZE;
                    }
                    MappedByteBuffer map2 = fileChannel2.map(mapMode, 0L, j9);
                    fastKV.bBuffer = map2;
                    map2.order(byteOrder);
                    fastKV.fastBuffer = new p(fastKV.aBuffer.capacity());
                    if (length == 0 && length2 == 0) {
                        fastKV.dataEnd = 12;
                        return;
                    }
                    int i9 = fastKV.aBuffer.getInt();
                    long j10 = fastKV.aBuffer.getLong();
                    int i10 = fastKV.bBuffer.getInt();
                    long j11 = fastKV.bBuffer.getLong();
                    if (i9 >= 0) {
                        if (i9 <= length - 12) {
                            fastKV = this;
                            fastKV.dataEnd = i9 + 12;
                            fastKV.aBuffer.rewind();
                            fastKV.aBuffer.get(fastKV.fastBuffer.f16073a, 0, fastKV.dataEnd);
                            if (j10 == fastKV.fastBuffer.a(12, i9) && parseData() == 0) {
                                fastKV.checksum = j10;
                                if (length != length2 || !isABFileEqual()) {
                                    fastKV.warning(new Exception("B file error"));
                                    fastKV.copyBuffer(fastKV.aBuffer, fastKV.bBuffer, fastKV.dataEnd);
                                    return;
                                }
                                return;
                            }
                        } else {
                            fastKV = this;
                        }
                    }
                    if (i10 >= 0 && i10 <= length2 - 12) {
                        fastKV.data.clear();
                        clearInvalid();
                        fastKV.dataEnd = i10 + 12;
                        if (fastKV.fastBuffer.f16073a.length != fastKV.bBuffer.capacity()) {
                            fastKV.fastBuffer = new p(fastKV.bBuffer.capacity());
                        }
                        fastKV.bBuffer.rewind();
                        fastKV.bBuffer.get(fastKV.fastBuffer.f16073a, 0, fastKV.dataEnd);
                        if (j11 == fastKV.fastBuffer.a(12, i10) && parseData() == 0) {
                            fastKV.warning(new Exception("A file error"));
                            fastKV.copyBuffer(fastKV.bBuffer, fastKV.aBuffer, fastKV.dataEnd);
                            fastKV.checksum = j11;
                            return;
                        }
                    }
                    fastKV.error(BOTH_FILES_ERROR);
                    resetData();
                    return;
                } catch (IOException e4) {
                    fastKV.error(e4);
                    toBlockingMode();
                    fastKV.tryBlockingIO(file, file2);
                    return;
                }
            }
            fastKV.error(new Exception(OPEN_FILE_FAILED));
            toBlockingMode();
        } catch (Exception e9) {
            fastKV.error(e9);
            clearData();
            toBlockingMode();
        }
    }

    private boolean loadFromCFile() {
        File file = new File(this.path, AbstractC2914a.h(new StringBuilder(), this.name, C_SUFFIX));
        File file2 = new File(this.path, AbstractC2914a.h(new StringBuilder(), this.name, TEMP_SUFFIX));
        boolean z8 = false;
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
                        } catch (Exception e4) {
                            e = e4;
                            z8 = true;
                            error(e);
                            return z8;
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
        } catch (Exception e9) {
            e = e9;
        }
    }

    private boolean loadWithBlockingIO(File file) throws IOException {
        long length = file.length();
        if (length != 0 && length <= 536870912) {
            int i9 = (int) length;
            int newCapacity = getNewCapacity(PAGE_SIZE, i9);
            p pVar = this.fastBuffer;
            if (pVar != null && pVar.f16073a.length == newCapacity) {
                pVar.b = 0;
            } else {
                pVar = new p(new byte[newCapacity]);
                this.fastBuffer = pVar;
            }
            ap.a(file, pVar.f16073a, i9);
            int c9 = pVar.c();
            long b8 = pVar.b();
            this.dataEnd = c9 + 12;
            if (c9 >= 0 && c9 <= i9 - 12 && b8 == pVar.a(12, c9) && parseData() == 0) {
                this.checksum = b8;
                return true;
            }
        }
        return false;
    }

    private void mergeInvalids() {
        int size = this.invalids.size() - 1;
        c cVar = this.invalids.get(size);
        while (size > 0) {
            int i9 = size - 1;
            c cVar2 = this.invalids.get(i9);
            if (cVar.b == cVar2.f15953a) {
                cVar2.f15953a = cVar.f15953a;
                this.invalids.remove(size);
            }
            cVar = cVar2;
            size = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x017f, code lost:
    
        throw new java.lang.Exception(com.mbridge.msdk.foundation.tools.FastKV.PARSE_DATA_FAILED);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int parseData() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.FastKV.parseData():int");
    }

    private void preparePutBytes() {
        ensureSize(this.updateSize);
        int i9 = this.dataEnd;
        this.updateStart = i9;
        this.dataEnd = this.updateSize + i9;
        this.fastBuffer.b = i9;
        this.sizeChanged = true;
    }

    private void putKey(String str, int i9) {
        this.fastBuffer.a((byte) i9);
        if (i9 == str.length()) {
            p pVar = this.fastBuffer;
            str.getBytes(0, i9, pVar.f16073a, pVar.b);
            this.fastBuffer.b += i9;
            return;
        }
        this.fastBuffer.b(str);
    }

    private void putStringValue(String str, int i9) {
        this.fastBuffer.a((short) i9);
        if (i9 == str.length()) {
            p pVar = this.fastBuffer;
            str.getBytes(0, i9, pVar.f16073a, pVar.b);
        } else {
            this.fastBuffer.b(str);
        }
    }

    private void resetBuffer(MappedByteBuffer mappedByteBuffer) throws IOException {
        FileChannel fileChannel;
        int capacity = mappedByteBuffer.capacity();
        int i9 = PAGE_SIZE;
        if (capacity != i9) {
            if (mappedByteBuffer == this.aBuffer) {
                fileChannel = this.aChannel;
            } else {
                fileChannel = this.bChannel;
            }
            FileChannel fileChannel2 = fileChannel;
            fileChannel2.truncate(i9);
            MappedByteBuffer map = fileChannel2.map(FileChannel.MapMode.READ_WRITE, 0L, i9);
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

    private int saveArray(String str, byte[] bArr, byte b8) {
        this.tempExternalName = null;
        if (bArr.length < INTERNAL_LIMIT) {
            return wrapArray(str, bArr, b8);
        }
        StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("large value, key: ", str, ", size: ");
        n2.append(bArr.length);
        info(n2.toString());
        String b9 = ap.b();
        if (ap.a(new File(this.path + this.name, b9), bArr)) {
            this.tempExternalName = b9;
            byte[] bArr2 = new byte[32];
            b9.getBytes(0, 32, bArr2, 0);
            return wrapArray(str, bArr2, (byte) (b8 | 64));
        }
        error("save large value failed");
        return 0;
    }

    private long shiftCheckSum(long j7, int i9) {
        int i10 = (i9 & 7) << 3;
        return (j7 >>> (64 - i10)) | (j7 << i10);
    }

    private void syncABBuffer(MappedByteBuffer mappedByteBuffer) {
        if (this.sizeChanged && mappedByteBuffer != this.aBuffer) {
            mappedByteBuffer.putInt(0, this.dataEnd - 12);
        }
        mappedByteBuffer.putLong(4, this.checksum);
        int i9 = this.removeStart;
        if (i9 != 0) {
            mappedByteBuffer.put(i9, this.fastBuffer.f16073a[i9]);
        }
        if (this.updateSize != 0) {
            mappedByteBuffer.position(this.updateStart);
            mappedByteBuffer.put(this.fastBuffer.f16073a, this.updateStart, this.updateSize);
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

    private void truncate(int i9) {
        int i10 = PAGE_SIZE;
        int newCapacity = getNewCapacity(i10, i9 + i10);
        byte[] bArr = this.fastBuffer.f16073a;
        if (newCapacity >= bArr.length) {
            return;
        }
        byte[] bArr2 = new byte[newCapacity];
        System.arraycopy(bArr, 0, bArr2, 0, this.dataEnd);
        this.fastBuffer.f16073a = bArr2;
        if (this.writingMode == 0) {
            try {
                long j7 = newCapacity;
                this.aChannel.truncate(j7);
                FileChannel fileChannel = this.aChannel;
                FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                MappedByteBuffer map = fileChannel.map(mapMode, 0L, j7);
                this.aBuffer = map;
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                this.bChannel.truncate(j7);
                MappedByteBuffer map2 = this.bChannel.map(mapMode, 0L, j7);
                this.bBuffer = map2;
                map2.order(byteOrder);
            } catch (IOException e4) {
                error(new Exception(MAP_FAILED, e4));
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
        } catch (IOException e4) {
            warning(e4);
        }
        clearData();
        try {
            if (loadWithBlockingIO(file2)) {
                return;
            }
        } catch (IOException e9) {
            warning(e9);
        }
        clearData();
    }

    private void updateBoolean(byte b8, int i9) {
        long shiftCheckSum = this.checksum ^ shiftCheckSum(1L, i9);
        this.checksum = shiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, shiftCheckSum);
            this.aBuffer.put(i9, b8);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.put(i9, b8);
        } else {
            this.fastBuffer.a(4, shiftCheckSum);
        }
        this.fastBuffer.f16073a[i9] = b8;
    }

    private void updateBytes(int i9, byte[] bArr) {
        int length = bArr.length;
        this.checksum ^= this.fastBuffer.a(i9, length);
        p pVar = this.fastBuffer;
        pVar.b = i9;
        pVar.a(bArr);
        long a6 = this.checksum ^ this.fastBuffer.a(i9, length);
        this.checksum = a6;
        if (this.writingMode == 0) {
            this.aBuffer.putInt(0, -1);
            this.aBuffer.putLong(4, this.checksum);
            this.aBuffer.position(i9);
            this.aBuffer.put(bArr);
            this.aBuffer.putInt(0, this.dataEnd - 12);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.position(i9);
            this.bBuffer.put(bArr);
            return;
        }
        this.fastBuffer.a(4, a6);
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

    private void updateInt32(int i9, long j7, int i10) {
        long shiftCheckSum = shiftCheckSum(j7, i10) ^ this.checksum;
        this.checksum = shiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, shiftCheckSum);
            this.aBuffer.putInt(i10, i9);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.putInt(i10, i9);
        } else {
            this.fastBuffer.a(4, shiftCheckSum);
        }
        this.fastBuffer.b(i10, i9);
    }

    private void updateInt64(long j7, long j9, int i9) {
        long shiftCheckSum = shiftCheckSum(j9, i9) ^ this.checksum;
        this.checksum = shiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, shiftCheckSum);
            this.aBuffer.putLong(i9, j7);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.putLong(i9, j7);
        } else {
            this.fastBuffer.a(4, shiftCheckSum);
        }
        this.fastBuffer.a(i9, j7);
    }

    private void updateObject(String str, Object obj, byte[] bArr, f.j jVar) {
        String str2;
        boolean z8;
        int saveArray = saveArray(str, bArr, jVar.a());
        if (saveArray != 0) {
            if (jVar.b) {
                str2 = (String) jVar.f16061d;
            } else {
                str2 = null;
            }
            remove(jVar.a(), jVar.f16060c, jVar.f16059a + jVar.f16062e);
            String str3 = this.tempExternalName;
            if (str3 != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            jVar.f16060c = this.updateStart;
            jVar.f16059a = saveArray;
            jVar.b = z8;
            if (z8) {
                jVar.f16061d = str3;
                jVar.f16062e = 32;
                this.tempExternalName = null;
            } else {
                jVar.f16061d = obj;
                jVar.f16062e = bArr.length;
            }
            updateChange();
            checkGC();
            if (str2 != null) {
                ap.a(new File(this.path + this.name, str2));
            }
        }
    }

    private void updateOffset(int i9, int[] iArr) {
        for (f.b bVar : this.data.values()) {
            int i10 = bVar.f16059a;
            if (i10 > i9) {
                int length = (iArr.length >> 1) - 1;
                int i11 = 0;
                while (true) {
                    if (i11 > length) {
                        break;
                    }
                    int i12 = (i11 + length) >>> 1;
                    int i13 = iArr[i12 << 1];
                    if (i13 < i10) {
                        i11 = i12 + 1;
                    } else {
                        if (i13 <= i10) {
                            length = i12;
                            break;
                        }
                        length = i12 - 1;
                    }
                }
                int i14 = iArr[(length << 1) + 1];
                bVar.f16059a -= i14;
                if (bVar.a() >= 6) {
                    ((f.j) bVar).f16060c -= i14;
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

    private int wrapArray(String str, byte[] bArr, byte b8) {
        wrapHeader(str, b8, bArr.length + 2);
        this.fastBuffer.a((short) bArr.length);
        p pVar = this.fastBuffer;
        int i9 = pVar.b;
        pVar.a(bArr);
        return i9;
    }

    private void wrapHeader(String str, byte b8) {
        wrapHeader(str, b8, TYPE_SIZE[b8]);
    }

    private boolean writeToABFile(p pVar) {
        int length = pVar.f16073a.length;
        File file = new File(this.path, AbstractC2914a.h(new StringBuilder(), this.name, A_SUFFIX));
        File file2 = new File(this.path, AbstractC2914a.h(new StringBuilder(), this.name, B_SUFFIX));
        try {
            if (ap.c(file) && ap.c(file2)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                long j7 = length;
                randomAccessFile.setLength(j7);
                randomAccessFile2.setLength(j7);
                this.aChannel = randomAccessFile.getChannel();
                this.bChannel = randomAccessFile2.getChannel();
                FileChannel fileChannel = this.aChannel;
                FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                MappedByteBuffer map = fileChannel.map(mapMode, 0L, j7);
                this.aBuffer = map;
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                MappedByteBuffer map2 = this.bChannel.map(mapMode, 0L, j7);
                this.bBuffer = map2;
                map2.order(byteOrder);
                this.aBuffer.put(pVar.f16073a, 0, this.dataEnd);
                this.bBuffer.put(pVar.f16073a, 0, this.dataEnd);
                return true;
            }
            throw new Exception(OPEN_FILE_FAILED);
        } catch (Exception e4) {
            error(e4);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean writeToCFile() {
        try {
            try {
                File file = new File(this.path, this.name + TEMP_SUFFIX);
                if (ap.c(file)) {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                    randomAccessFile.setLength(this.dataEnd);
                    randomAccessFile.write(this.fastBuffer.f16073a, 0, this.dataEnd);
                    randomAccessFile.close();
                    File file2 = new File(this.path, this.name + C_SUFFIX);
                    if (file2.exists()) {
                        if (file2.delete()) {
                        }
                    }
                    if (file.renameTo(file2)) {
                        return true;
                    }
                    warning(new Exception("rename failed"));
                }
            } catch (Exception e4) {
                error(e4);
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
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

    public void gc(int i9) {
        boolean z8;
        int i10;
        Collections.sort(this.invalids);
        mergeInvalids();
        c cVar = this.invalids.get(0);
        int i11 = cVar.b;
        int i12 = this.dataEnd;
        int i13 = i12 - this.invalidBytes;
        int i14 = i13 - 12;
        int i15 = i13 - i11;
        int i16 = i12 - i11;
        if (i14 < i16 + i15) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            this.checksum ^= this.fastBuffer.a(i11, i16);
        }
        int size = this.invalids.size();
        int i17 = size - 1;
        int i18 = this.dataEnd - this.invalids.get(i17).f15953a;
        if (i18 > 0) {
            i10 = size;
        } else {
            i10 = i17;
        }
        int[] iArr = new int[i10 << 1];
        int i19 = cVar.b;
        int i20 = cVar.f15953a;
        for (int i21 = 1; i21 < size; i21++) {
            c cVar2 = this.invalids.get(i21);
            int i22 = cVar2.b - i20;
            byte[] bArr = this.fastBuffer.f16073a;
            System.arraycopy(bArr, i20, bArr, i19, i22);
            int i23 = (i21 - 1) << 1;
            iArr[i23] = i20;
            iArr[i23 + 1] = i20 - i19;
            i19 += i22;
            i20 = cVar2.f15953a;
        }
        if (i18 > 0) {
            byte[] bArr2 = this.fastBuffer.f16073a;
            System.arraycopy(bArr2, i20, bArr2, i19, i18);
            int i24 = i17 << 1;
            iArr[i24] = i20;
            iArr[i24 + 1] = i20 - i19;
        }
        clearInvalid();
        if (z8) {
            this.checksum = this.fastBuffer.a(12, i14);
        } else {
            this.checksum ^= this.fastBuffer.a(i11, i15);
        }
        this.dataEnd = i13;
        if (this.writingMode == 0) {
            this.aBuffer.putInt(0, -1);
            this.aBuffer.putLong(4, this.checksum);
            this.aBuffer.position(i11);
            this.aBuffer.put(this.fastBuffer.f16073a, i11, i15);
            this.aBuffer.putInt(0, i14);
            this.bBuffer.putInt(0, i14);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.position(i11);
            this.bBuffer.put(this.fastBuffer.f16073a, i11, i15);
        } else {
            this.fastBuffer.b(0, i14);
            this.fastBuffer.a(4, this.checksum);
        }
        updateOffset(i11, iArr);
        int i25 = i13 + i9;
        if (this.fastBuffer.f16073a.length - i25 > TRUNCATE_THRESHOLD) {
            truncate(i25);
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
                    valueOf = Boolean.valueOf(((f.c) value).b);
                    break;
                case 2:
                    valueOf = Integer.valueOf(((f.C0164f) value).b);
                    break;
                case 3:
                    valueOf = Float.valueOf(((f.e) value).b);
                    break;
                case 4:
                    valueOf = Long.valueOf(((f.g) value).b);
                    break;
                case 5:
                    valueOf = Double.valueOf(((f.d) value).b);
                    break;
                case 6:
                    f.i iVar = (f.i) value;
                    if (iVar.b) {
                        valueOf = getStringFromFile(iVar);
                        break;
                    } else {
                        valueOf = iVar.f16061d;
                        break;
                    }
                case 7:
                    f.a aVar = (f.a) value;
                    if (aVar.b) {
                        valueOf = getArrayFromFile(aVar);
                        break;
                    } else {
                        valueOf = aVar.f16061d;
                        break;
                    }
                case 8:
                    f.h hVar = (f.h) value;
                    if (hVar.b) {
                        valueOf = getObjectFromFile(hVar);
                        break;
                    } else {
                        valueOf = ((f.h) value).f16061d;
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
        return gVar == null ? 0L : gVar.b;
    }

    public synchronized <T> T getObject(String str) {
        T t9;
        try {
            f.h hVar = (f.h) this.data.get(str);
            if (hVar != null) {
                if (hVar.b) {
                    t9 = (T) getObjectFromFile(hVar);
                } else {
                    t9 = (T) hVar.f16061d;
                }
                return t9;
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
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
        try {
            checkKey(str);
            if (bArr == null) {
                remove(str);
            } else {
                addOrUpdate(str, bArr, bArr, (f.a) this.data.get(str), (byte) 7);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void putBoolean(String str, boolean z8) {
        try {
            checkKey(str);
            f.c cVar = (f.c) this.data.get(str);
            if (cVar == null) {
                wrapHeader(str, (byte) 1);
                p pVar = this.fastBuffer;
                int i9 = pVar.b;
                pVar.a(z8 ? (byte) 1 : (byte) 0);
                updateChange();
                this.data.put(str, new f.c(i9, z8));
                checkIfCommit();
            } else if (cVar.b != z8) {
                cVar.b = z8;
                updateBoolean(z8 ? (byte) 1 : (byte) 0, cVar.f16059a);
                checkIfCommit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void putDouble(String str, double d2) {
        try {
            checkKey(str);
            f.d dVar = (f.d) this.data.get(str);
            if (dVar == null) {
                wrapHeader(str, (byte) 5);
                p pVar = this.fastBuffer;
                int i9 = pVar.b;
                pVar.a(Double.doubleToRawLongBits(d2));
                updateChange();
                this.data.put(str, new f.d(i9, d2));
                checkIfCommit();
            } else if (dVar.b != d2) {
                long doubleToRawLongBits = Double.doubleToRawLongBits(d2);
                long doubleToRawLongBits2 = Double.doubleToRawLongBits(dVar.b) ^ doubleToRawLongBits;
                dVar.b = d2;
                updateInt64(doubleToRawLongBits, doubleToRawLongBits2, dVar.f16059a);
                checkIfCommit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void putFloat(String str, float f9) {
        try {
            checkKey(str);
            f.e eVar = (f.e) this.data.get(str);
            if (eVar == null) {
                wrapHeader(str, (byte) 3);
                p pVar = this.fastBuffer;
                int i9 = pVar.b;
                pVar.b(Float.floatToRawIntBits(f9));
                updateChange();
                this.data.put(str, new f.e(i9, f9));
                checkIfCommit();
            } else if (eVar.b != f9) {
                eVar.b = f9;
                updateInt32(Float.floatToRawIntBits(f9), (Float.floatToRawIntBits(eVar.b) ^ r6) & 4294967295L, eVar.f16059a);
                checkIfCommit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void putInt(String str, int i9) {
        try {
            checkKey(str);
            f.C0164f c0164f = (f.C0164f) this.data.get(str);
            if (c0164f == null) {
                wrapHeader(str, (byte) 2);
                p pVar = this.fastBuffer;
                int i10 = pVar.b;
                pVar.b(i9);
                updateChange();
                this.data.put(str, new f.C0164f(i10, i9));
                checkIfCommit();
            } else {
                if (c0164f.b != i9) {
                    c0164f.b = i9;
                    updateInt32(i9, (r6 ^ i9) & 4294967295L, c0164f.f16059a);
                    checkIfCommit();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void putLong(String str, long j7) {
        try {
            checkKey(str);
            f.g gVar = (f.g) this.data.get(str);
            if (gVar == null) {
                wrapHeader(str, (byte) 4);
                p pVar = this.fastBuffer;
                int i9 = pVar.b;
                pVar.a(j7);
                updateChange();
                this.data.put(str, new f.g(i9, j7));
                checkIfCommit();
            } else {
                long j9 = gVar.b;
                if (j9 != j7) {
                    gVar.b = j7;
                    updateInt64(j7, j7 ^ j9, gVar.f16059a);
                    checkIfCommit();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized <T> void putObject(String str, T t9, a<T> aVar) {
        byte[] bArr;
        checkKey(str);
        if (aVar != null) {
            String a6 = aVar.a();
            if (a6 != null && !a6.isEmpty() && a6.length() <= 50) {
                if (this.encoderMap.containsKey(a6)) {
                    if (t9 == null) {
                        remove(str);
                        return;
                    }
                    try {
                        bArr = aVar.a(t9);
                    } catch (Exception e4) {
                        error(e4);
                        bArr = null;
                    }
                    if (bArr == null) {
                        remove(str);
                        return;
                    }
                    int a9 = p.a(a6);
                    p pVar = new p(a9 + 1 + bArr.length);
                    pVar.a((byte) a9);
                    pVar.b(a6);
                    pVar.a(bArr);
                    addOrUpdate(str, t9, pVar.f16073a, (f.h) this.data.get(str), (byte) 8);
                    return;
                }
                throw new IllegalArgumentException("Encoder hasn't been registered");
            }
            throw new IllegalArgumentException("Invalid encoder tag:" + a6);
        }
        throw new IllegalArgumentException("Encoder is null");
    }

    public synchronized void putString(String str, String str2) {
        byte[] bytes;
        try {
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
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void putStringSet(String str, Set<String> set) {
        try {
            if (set == null) {
                remove(str);
            } else {
                putObject(str, set, am.f16025a);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void remove(String str) {
        try {
            f.b bVar = this.data.get(str);
            if (bVar != null) {
                this.data.remove(str);
                byte a6 = bVar.a();
                String str2 = null;
                if (a6 <= 5) {
                    int a9 = p.a(str);
                    int i9 = bVar.f16059a;
                    remove(a6, i9 - (a9 + 2), i9 + TYPE_SIZE[a6]);
                } else {
                    f.j jVar = (f.j) bVar;
                    remove(a6, jVar.f16060c, jVar.f16059a + jVar.f16062e);
                    if (jVar.b) {
                        str2 = (String) jVar.f16061d;
                    }
                }
                byte b8 = (byte) (a6 | Byte.MIN_VALUE);
                if (this.writingMode == 0) {
                    this.aBuffer.putLong(4, this.checksum);
                    this.aBuffer.put(this.removeStart, b8);
                    this.bBuffer.putLong(4, this.checksum);
                    this.bBuffer.put(this.removeStart, b8);
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
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized String toString() {
        return "FastKV: path:" + this.path + " name:" + this.name;
    }

    private void wrapHeader(String str, byte b8, int i9) {
        int a6 = p.a(str);
        checkKeySize(a6);
        this.updateSize = a6 + 2 + i9;
        preparePutBytes();
        this.fastBuffer.a(b8);
        putKey(str, a6);
    }

    public synchronized byte[] getArray(String str, byte[] bArr) {
        try {
            f.a aVar = (f.a) this.data.get(str);
            if (aVar != null) {
                return aVar.b ? getArrayFromFile(aVar) : (byte[]) aVar.f16061d;
            }
            return bArr;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean getBoolean(String str, boolean z8) {
        f.c cVar = (f.c) this.data.get(str);
        if (cVar != null) {
            z8 = cVar.b;
        }
        return z8;
    }

    public synchronized double getDouble(String str, double d2) {
        f.d dVar = (f.d) this.data.get(str);
        if (dVar != null) {
            d2 = dVar.b;
        }
        return d2;
    }

    public synchronized float getFloat(String str, float f9) {
        f.e eVar = (f.e) this.data.get(str);
        if (eVar != null) {
            f9 = eVar.b;
        }
        return f9;
    }

    public synchronized int getInt(String str, int i9) {
        f.C0164f c0164f = (f.C0164f) this.data.get(str);
        if (c0164f != null) {
            i9 = c0164f.b;
        }
        return i9;
    }

    public synchronized String getString(String str, String str2) {
        try {
            f.i iVar = (f.i) this.data.get(str);
            if (iVar != null) {
                return iVar.b ? getStringFromFile(iVar) : (String) iVar.f16061d;
            }
            return str2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void putAll(Map<String, Object> map, Map<Class, a> map2) {
        try {
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
        } catch (Throwable th) {
            throw th;
        }
    }

    private void error(String str) {
        b bVar = this.logger;
        if (bVar != null) {
            bVar.a(this.name, new Exception(str));
        }
    }

    public synchronized long getLong(String str, long j7) {
        f.g gVar = (f.g) this.data.get(str);
        if (gVar != null) {
            j7 = gVar.b;
        }
        return j7;
    }

    private void remove(byte b8, int i9, int i10) {
        countInvalid(i9, i10);
        byte[] bArr = this.fastBuffer.f16073a;
        this.checksum = (((bArr[i9] ^ r9) & 255) << ((i9 & 7) << 3)) ^ this.checksum;
        bArr[i9] = (byte) (b8 | Byte.MIN_VALUE);
        this.removeStart = i9;
    }
}
