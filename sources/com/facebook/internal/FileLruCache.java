package com.facebook.internal;

import com.cooldev.gba.emulator.gameboy.router.RouterName;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.android.gms.common.api.Api;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidParameterException;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.jacoco.core.runtime.AgentOptions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import z0.m;

/* loaded from: classes.dex */
public final class FileLruCache {

    @NotNull
    private static final String HEADER_CACHEKEY_KEY = "key";

    @NotNull
    private static final String HEADER_CACHE_CONTENT_TAG_KEY = "tag";
    private final Condition condition;

    @NotNull
    private final File directory;
    private boolean isTrimInProgress;
    private boolean isTrimPending;

    @NotNull
    private final AtomicLong lastClearCacheTime;

    @NotNull
    private final Limits limits;

    @NotNull
    private final ReentrantLock lock;

    @NotNull
    private final String tag;

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "FileLruCache";

    @NotNull
    private static final AtomicLong bufferIndex = new AtomicLong();

    /* loaded from: classes.dex */
    public static final class BufferFile {

        @NotNull
        private static final String FILE_NAME_PREFIX = "buffer";

        @NotNull
        public static final BufferFile INSTANCE = new BufferFile();

        @NotNull
        private static final FilenameFilter filterExcludeBufferFiles = new c(0);

        @NotNull
        private static final FilenameFilter filterExcludeNonBufferFiles = new c(1);

        private BufferFile() {
        }

        /* renamed from: filterExcludeBufferFiles$lambda-0 */
        public static final boolean m526filterExcludeBufferFiles$lambda0(File file, String str) {
            p0.a.r(str, "filename");
            return !m.q1(str, FILE_NAME_PREFIX, false);
        }

        /* renamed from: filterExcludeNonBufferFiles$lambda-1 */
        public static final boolean m527filterExcludeNonBufferFiles$lambda1(File file, String str) {
            p0.a.r(str, "filename");
            return m.q1(str, FILE_NAME_PREFIX, false);
        }

        public final void deleteAll(@NotNull File file) {
            p0.a.s(file, RouterName.ROOT);
            File[] listFiles = file.listFiles(excludeNonBufferFiles());
            if (listFiles != null) {
                int length = listFiles.length;
                int i2 = 0;
                while (i2 < length) {
                    File file2 = listFiles[i2];
                    i2++;
                    file2.delete();
                }
            }
        }

        @NotNull
        public final FilenameFilter excludeBufferFiles() {
            return filterExcludeBufferFiles;
        }

        @NotNull
        public final FilenameFilter excludeNonBufferFiles() {
            return filterExcludeNonBufferFiles;
        }

        @NotNull
        public final File newFile(@Nullable File file) {
            return new File(file, p0.a.z0(Long.valueOf(FileLruCache.bufferIndex.incrementAndGet()), FILE_NAME_PREFIX));
        }
    }

    /* loaded from: classes.dex */
    public static final class CloseCallbackOutputStream extends OutputStream {

        @NotNull
        private final StreamCloseCallback callback;

        @NotNull
        private final OutputStream innerStream;

        public CloseCallbackOutputStream(@NotNull OutputStream outputStream, @NotNull StreamCloseCallback streamCloseCallback) {
            p0.a.s(outputStream, "innerStream");
            p0.a.s(streamCloseCallback, "callback");
            this.innerStream = outputStream;
            this.callback = streamCloseCallback;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                this.innerStream.close();
            } finally {
                this.callback.onClose();
            }
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.innerStream.flush();
        }

        @NotNull
        public final StreamCloseCallback getCallback() {
            return this.callback;
        }

        @NotNull
        public final OutputStream getInnerStream() {
            return this.innerStream;
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] bArr, int i2, int i3) throws IOException {
            p0.a.s(bArr, "buffer");
            this.innerStream.write(bArr, i2, i3);
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] bArr) throws IOException {
            p0.a.s(bArr, "buffer");
            this.innerStream.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(int i2) throws IOException {
            this.innerStream.write(i2);
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final String getTAG() {
            return FileLruCache.TAG;
        }
    }

    /* loaded from: classes.dex */
    public static final class Limits {
        private int byteCount = 1048576;
        private int fileCount = 1024;

        public final int getByteCount() {
            return this.byteCount;
        }

        public final int getFileCount() {
            return this.fileCount;
        }

        public final void setByteCount(int i2) {
            if (i2 < 0) {
                throw new InvalidParameterException("Cache byte-count limit must be >= 0");
            }
            this.byteCount = i2;
        }

        public final void setFileCount(int i2) {
            if (i2 < 0) {
                throw new InvalidParameterException("Cache file count limit must be >= 0");
            }
            this.fileCount = i2;
        }
    }

    /* loaded from: classes.dex */
    public static final class ModifiedFile implements Comparable<ModifiedFile> {

        @NotNull
        public static final Companion Companion = new Companion(null);
        private static final int HASH_MULTIPLIER = 37;
        private static final int HASH_SEED = 29;

        @NotNull
        private final File file;
        private final long modified;

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }
        }

        public ModifiedFile(@NotNull File file) {
            p0.a.s(file, ShareInternalUtility.STAGING_PARAM);
            this.file = file;
            this.modified = file.lastModified();
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof ModifiedFile) && compareTo((ModifiedFile) obj) == 0;
        }

        @NotNull
        public final File getFile() {
            return this.file;
        }

        public final long getModified() {
            return this.modified;
        }

        public int hashCode() {
            return ((this.file.hashCode() + 1073) * HASH_MULTIPLIER) + ((int) (this.modified % Api.BaseClientBuilder.API_PRIORITY_OTHER));
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull ModifiedFile modifiedFile) {
            p0.a.s(modifiedFile, "another");
            long j2 = this.modified;
            long j3 = modifiedFile.modified;
            if (j2 < j3) {
                return -1;
            }
            if (j2 > j3) {
                return 1;
            }
            return this.file.compareTo(modifiedFile.file);
        }
    }

    /* loaded from: classes.dex */
    public interface StreamCloseCallback {
        void onClose();
    }

    /* loaded from: classes.dex */
    public static final class StreamHeader {
        private static final int HEADER_VERSION = 0;

        @NotNull
        public static final StreamHeader INSTANCE = new StreamHeader();

        private StreamHeader() {
        }

        @Nullable
        public final JSONObject readHeader(@NotNull InputStream inputStream) throws IOException {
            p0.a.s(inputStream, "stream");
            if (inputStream.read() != 0) {
                return null;
            }
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < 3; i4++) {
                int read = inputStream.read();
                if (read == -1) {
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                    String tag = FileLruCache.Companion.getTAG();
                    p0.a.r(tag, "TAG");
                    companion.log(loggingBehavior, tag, "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                i3 = (i3 << 8) + (read & 255);
            }
            byte[] bArr = new byte[i3];
            while (i2 < i3) {
                int read2 = inputStream.read(bArr, i2, i3 - i2);
                if (read2 < 1) {
                    Logger.Companion companion2 = Logger.Companion;
                    LoggingBehavior loggingBehavior2 = LoggingBehavior.CACHE;
                    String tag2 = FileLruCache.Companion.getTAG();
                    p0.a.r(tag2, "TAG");
                    companion2.log(loggingBehavior2, tag2, "readHeader: stream.read stopped at " + Integer.valueOf(i2) + " when expected " + i3);
                    return null;
                }
                i2 += read2;
            }
            try {
                Object nextValue = new JSONTokener(new String(bArr, z0.a.f31458a)).nextValue();
                if (nextValue instanceof JSONObject) {
                    return (JSONObject) nextValue;
                }
                Logger.Companion companion3 = Logger.Companion;
                LoggingBehavior loggingBehavior3 = LoggingBehavior.CACHE;
                String tag3 = FileLruCache.Companion.getTAG();
                p0.a.r(tag3, "TAG");
                companion3.log(loggingBehavior3, tag3, p0.a.z0(nextValue.getClass().getCanonicalName(), "readHeader: expected JSONObject, got "));
                return null;
            } catch (JSONException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final void writeHeader(@NotNull OutputStream outputStream, @NotNull JSONObject jSONObject) throws IOException {
            p0.a.s(outputStream, "stream");
            p0.a.s(jSONObject, "header");
            String jSONObject2 = jSONObject.toString();
            p0.a.r(jSONObject2, "header.toString()");
            byte[] bytes = jSONObject2.getBytes(z0.a.f31458a);
            p0.a.r(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(0);
            outputStream.write((bytes.length >> 16) & 255);
            outputStream.write((bytes.length >> 8) & 255);
            outputStream.write(bytes.length & 255);
            outputStream.write(bytes);
        }
    }

    public FileLruCache(@NotNull String str, @NotNull Limits limits) {
        p0.a.s(str, "tag");
        p0.a.s(limits, "limits");
        this.tag = str;
        this.limits = limits;
        File file = new File(FacebookSdk.getCacheDir(), str);
        this.directory = file;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.lastClearCacheTime = new AtomicLong(0L);
        if (file.mkdirs() || file.isDirectory()) {
            BufferFile.INSTANCE.deleteAll(file);
        }
    }

    /* renamed from: clearCache$lambda-1 */
    public static final void m524clearCache$lambda1(File[] fileArr) {
        p0.a.r(fileArr, "filesToDelete");
        int length = fileArr.length;
        int i2 = 0;
        while (i2 < length) {
            File file = fileArr[i2];
            i2++;
            file.delete();
        }
    }

    public static /* synthetic */ InputStream get$default(FileLruCache fileLruCache, String str, String str2, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return fileLruCache.get(str, str2);
    }

    public static /* synthetic */ OutputStream openPutStream$default(FileLruCache fileLruCache, String str, String str2, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return fileLruCache.openPutStream(str, str2);
    }

    private final void postTrim() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!this.isTrimPending) {
                this.isTrimPending = true;
                FacebookSdk.getExecutor().execute(new androidx.compose.material.ripple.a(this, 21));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: postTrim$lambda-3$lambda-2 */
    public static final void m525postTrim$lambda3$lambda2(FileLruCache fileLruCache) {
        p0.a.s(fileLruCache, "this$0");
        fileLruCache.trim();
    }

    public final void renameToTargetAndTrim(String str, File file) {
        if (!file.renameTo(new File(this.directory, Utility.md5hash(str)))) {
            file.delete();
        }
        postTrim();
    }

    private final void trim() {
        long j2;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.isTrimPending = false;
            this.isTrimInProgress = true;
            reentrantLock.unlock();
            try {
                Logger.Companion companion = Logger.Companion;
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String str = TAG;
                p0.a.r(str, "TAG");
                companion.log(loggingBehavior, str, "trim started");
                PriorityQueue priorityQueue = new PriorityQueue();
                File[] listFiles = this.directory.listFiles(BufferFile.INSTANCE.excludeBufferFiles());
                long j3 = 0;
                if (listFiles != null) {
                    int length = listFiles.length;
                    int i2 = 0;
                    j2 = 0;
                    while (i2 < length) {
                        File file = listFiles[i2];
                        i2++;
                        p0.a.r(file, ShareInternalUtility.STAGING_PARAM);
                        ModifiedFile modifiedFile = new ModifiedFile(file);
                        priorityQueue.add(modifiedFile);
                        Logger.Companion companion2 = Logger.Companion;
                        LoggingBehavior loggingBehavior2 = LoggingBehavior.CACHE;
                        String str2 = TAG;
                        p0.a.r(str2, "TAG");
                        companion2.log(loggingBehavior2, str2, "  trim considering time=" + Long.valueOf(modifiedFile.getModified()) + " name=" + ((Object) modifiedFile.getFile().getName()));
                        j3 += file.length();
                        j2++;
                        listFiles = listFiles;
                    }
                } else {
                    j2 = 0;
                }
                while (true) {
                    if (j3 <= this.limits.getByteCount() && j2 <= this.limits.getFileCount()) {
                        this.lock.lock();
                        try {
                            this.isTrimInProgress = false;
                            this.condition.signalAll();
                            return;
                        } finally {
                        }
                    }
                    File file2 = ((ModifiedFile) priorityQueue.remove()).getFile();
                    Logger.Companion companion3 = Logger.Companion;
                    LoggingBehavior loggingBehavior3 = LoggingBehavior.CACHE;
                    String str3 = TAG;
                    p0.a.r(str3, "TAG");
                    companion3.log(loggingBehavior3, str3, p0.a.z0(file2.getName(), "  trim removing "));
                    j3 -= file2.length();
                    j2--;
                    file2.delete();
                }
            } catch (Throwable th) {
                this.lock.lock();
                try {
                    this.isTrimInProgress = false;
                    this.condition.signalAll();
                    throw th;
                } finally {
                }
            }
        } finally {
        }
    }

    public final void clearCache() {
        File[] listFiles = this.directory.listFiles(BufferFile.INSTANCE.excludeBufferFiles());
        this.lastClearCacheTime.set(System.currentTimeMillis());
        if (listFiles != null) {
            FacebookSdk.getExecutor().execute(new androidx.compose.material.ripple.a(listFiles, 22));
        }
    }

    @Nullable
    public final InputStream get(@NotNull String str) throws IOException {
        p0.a.s(str, "key");
        return get$default(this, str, null, 2, null);
    }

    @NotNull
    public final String getLocation() {
        String path = this.directory.getPath();
        p0.a.r(path, "directory.path");
        return path;
    }

    @NotNull
    public final InputStream interceptAndPut(@NotNull String str, @NotNull InputStream inputStream) throws IOException {
        p0.a.s(str, "key");
        p0.a.s(inputStream, "input");
        return new CopyingInputStream(inputStream, openPutStream$default(this, str, null, 2, null));
    }

    @NotNull
    public final OutputStream openPutStream(@NotNull String str) throws IOException {
        p0.a.s(str, "key");
        return openPutStream$default(this, str, null, 2, null);
    }

    public final long sizeInBytesForTest() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        while (true) {
            try {
                if (!this.isTrimPending && !this.isTrimInProgress) {
                    break;
                }
                try {
                    this.condition.await();
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        reentrantLock.unlock();
        File[] listFiles = this.directory.listFiles();
        long j2 = 0;
        if (listFiles != null) {
            int length = listFiles.length;
            int i2 = 0;
            while (i2 < length) {
                File file = listFiles[i2];
                i2++;
                j2 += file.length();
            }
        }
        return j2;
    }

    @NotNull
    public String toString() {
        return "{FileLruCache: tag:" + this.tag + " file:" + ((Object) this.directory.getName()) + '}';
    }

    /* loaded from: classes.dex */
    public static final class CopyingInputStream extends InputStream {

        @NotNull
        private final InputStream input;

        @NotNull
        private final OutputStream output;

        public CopyingInputStream(@NotNull InputStream inputStream, @NotNull OutputStream outputStream) {
            p0.a.s(inputStream, "input");
            p0.a.s(outputStream, AgentOptions.OUTPUT);
            this.input = inputStream;
            this.output = outputStream;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.input.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                this.input.close();
            } finally {
                this.output.close();
            }
        }

        @NotNull
        public final InputStream getInput() {
            return this.input;
        }

        @NotNull
        public final OutputStream getOutput() {
            return this.output;
        }

        @Override // java.io.InputStream
        public void mark(int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.InputStream
        public int read(@NotNull byte[] bArr) throws IOException {
            p0.a.s(bArr, "buffer");
            int read = this.input.read(bArr);
            if (read > 0) {
                this.output.write(bArr, 0, read);
            }
            return read;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public long skip(long j2) throws IOException {
            int read;
            byte[] bArr = new byte[1024];
            long j3 = 0;
            while (j3 < j2 && (read = read(bArr, 0, (int) Math.min(j2 - j3, 1024))) >= 0) {
                j3 += read;
            }
            return j3;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            int read = this.input.read();
            if (read >= 0) {
                this.output.write(read);
            }
            return read;
        }

        @Override // java.io.InputStream
        public int read(@NotNull byte[] bArr, int i2, int i3) throws IOException {
            p0.a.s(bArr, "buffer");
            int read = this.input.read(bArr, i2, i3);
            if (read > 0) {
                this.output.write(bArr, i2, read);
            }
            return read;
        }
    }

    @Nullable
    public final InputStream get(@NotNull String str, @Nullable String str2) throws IOException {
        p0.a.s(str, "key");
        File file = new File(this.directory, Utility.md5hash(str));
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
            try {
                JSONObject readHeader = StreamHeader.INSTANCE.readHeader(bufferedInputStream);
                if (readHeader == null) {
                    return null;
                }
                if (!p0.a.g(readHeader.optString("key"), str)) {
                    return null;
                }
                String optString = readHeader.optString("tag", null);
                if (str2 == null && !p0.a.g(str2, optString)) {
                    return null;
                }
                long time = new Date().getTime();
                Logger.Companion companion = Logger.Companion;
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String str3 = TAG;
                p0.a.r(str3, "TAG");
                companion.log(loggingBehavior, str3, "Setting lastModified to " + Long.valueOf(time) + " for " + ((Object) file.getName()));
                file.setLastModified(time);
                return bufferedInputStream;
            } finally {
                bufferedInputStream.close();
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @NotNull
    public final OutputStream openPutStream(@NotNull final String str, @Nullable String str2) throws IOException {
        p0.a.s(str, "key");
        final File newFile = BufferFile.INSTANCE.newFile(this.directory);
        newFile.delete();
        if (newFile.createNewFile()) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(newFile);
                final long currentTimeMillis = System.currentTimeMillis();
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new CloseCallbackOutputStream(fileOutputStream, new StreamCloseCallback() { // from class: com.facebook.internal.FileLruCache$openPutStream$renameToTargetCallback$1
                    @Override // com.facebook.internal.FileLruCache.StreamCloseCallback
                    public void onClose() {
                        AtomicLong atomicLong;
                        long j2 = currentTimeMillis;
                        atomicLong = this.lastClearCacheTime;
                        if (j2 < atomicLong.get()) {
                            newFile.delete();
                        } else {
                            this.renameToTargetAndTrim(str, newFile);
                        }
                    }
                }), 8192);
                try {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("key", str);
                        if (!Utility.isNullOrEmpty(str2)) {
                            jSONObject.put("tag", str2);
                        }
                        StreamHeader.INSTANCE.writeHeader(bufferedOutputStream, jSONObject);
                        return bufferedOutputStream;
                    } catch (JSONException e) {
                        Logger.Companion companion = Logger.Companion;
                        LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                        String str3 = TAG;
                        p0.a.r(str3, "TAG");
                        companion.log(loggingBehavior, 5, str3, p0.a.z0(e, "Error creating JSON header for cache file: "));
                        throw new IOException(e.getMessage());
                    }
                } catch (Throwable th) {
                    bufferedOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                Logger.Companion companion2 = Logger.Companion;
                LoggingBehavior loggingBehavior2 = LoggingBehavior.CACHE;
                String str4 = TAG;
                p0.a.r(str4, "TAG");
                companion2.log(loggingBehavior2, 5, str4, p0.a.z0(e2, "Error creating buffer output stream: "));
                throw new IOException(e2.getMessage());
            }
        }
        throw new IOException(p0.a.z0(newFile.getAbsolutePath(), "Could not create file at "));
    }
}
