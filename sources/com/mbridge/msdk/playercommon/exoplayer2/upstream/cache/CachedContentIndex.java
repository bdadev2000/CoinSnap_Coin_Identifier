package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.AtomicFile;
import com.mbridge.msdk.playercommon.exoplayer2.util.ReusableBufferedOutputStream;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
class CachedContentIndex {
    public static final String FILE_NAME = "cached_content_index.exi";
    private static final int FLAG_ENCRYPTED_INDEX = 1;
    private static final int VERSION = 2;
    private final AtomicFile atomicFile;
    private ReusableBufferedOutputStream bufferedOutputStream;
    private boolean changed;
    private final Cipher cipher;
    private final boolean encrypt;
    private final SparseArray<String> idToKey;
    private final HashMap<String, CachedContent> keyToContent;
    private final SecretKeySpec secretKeySpec;

    public CachedContentIndex(File file) {
        this(file, null);
    }

    private void add(CachedContent cachedContent) {
        this.keyToContent.put(cachedContent.key, cachedContent);
        this.idToKey.put(cachedContent.f14741id, cachedContent.key);
    }

    private CachedContent addNew(String str) {
        CachedContent cachedContent = new CachedContent(getNewId(this.idToKey), str);
        add(cachedContent);
        this.changed = true;
        return cachedContent;
    }

    private static Cipher getCipher() throws NoSuchPaddingException, NoSuchAlgorithmException {
        if (Util.SDK_INT == 18) {
            try {
                return Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    public static int getNewId(SparseArray<String> sparseArray) {
        int keyAt;
        int size = sparseArray.size();
        int i10 = 0;
        if (size == 0) {
            keyAt = 0;
        } else {
            keyAt = sparseArray.keyAt(size - 1) + 1;
        }
        if (keyAt < 0) {
            while (i10 < size && i10 == sparseArray.keyAt(i10)) {
                i10++;
            }
            return i10;
        }
        return keyAt;
    }

    private boolean readFile() {
        BufferedInputStream bufferedInputStream;
        DataInputStream dataInputStream;
        boolean z10;
        DataInputStream dataInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(this.atomicFile.openRead());
            dataInputStream = new DataInputStream(bufferedInputStream);
        } catch (IOException unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            int readInt = dataInputStream.readInt();
            if (readInt >= 0 && readInt <= 2) {
                if ((dataInputStream.readInt() & 1) != 0) {
                    if (this.cipher == null) {
                        Util.closeQuietly(dataInputStream);
                        return false;
                    }
                    byte[] bArr = new byte[16];
                    dataInputStream.readFully(bArr);
                    try {
                        this.cipher.init(2, this.secretKeySpec, new IvParameterSpec(bArr));
                        dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.cipher));
                    } catch (InvalidAlgorithmParameterException e2) {
                        e = e2;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e10) {
                        e = e10;
                        throw new IllegalStateException(e);
                    }
                } else if (this.encrypt) {
                    this.changed = true;
                }
                int readInt2 = dataInputStream.readInt();
                int i10 = 0;
                for (int i11 = 0; i11 < readInt2; i11++) {
                    CachedContent readFromStream = CachedContent.readFromStream(readInt, dataInputStream);
                    add(readFromStream);
                    i10 += readFromStream.headerHashCode(readInt);
                }
                int readInt3 = dataInputStream.readInt();
                if (dataInputStream.read() == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (readInt3 == i10 && z10) {
                    Util.closeQuietly(dataInputStream);
                    return true;
                }
                Util.closeQuietly(dataInputStream);
                return false;
            }
            Util.closeQuietly(dataInputStream);
            return false;
        } catch (IOException unused2) {
            dataInputStream2 = dataInputStream;
            if (dataInputStream2 != null) {
                Util.closeQuietly(dataInputStream2);
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            dataInputStream2 = dataInputStream;
            if (dataInputStream2 != null) {
                Util.closeQuietly(dataInputStream2);
            }
            throw th;
        }
    }

    private void writeFile() throws Cache.CacheException {
        int i10;
        DataOutputStream dataOutputStream = null;
        try {
            try {
                OutputStream startWrite = this.atomicFile.startWrite();
                ReusableBufferedOutputStream reusableBufferedOutputStream = this.bufferedOutputStream;
                if (reusableBufferedOutputStream == null) {
                    this.bufferedOutputStream = new ReusableBufferedOutputStream(startWrite);
                } else {
                    reusableBufferedOutputStream.reset(startWrite);
                }
                DataOutputStream dataOutputStream2 = new DataOutputStream(this.bufferedOutputStream);
                try {
                    dataOutputStream2.writeInt(2);
                    int i11 = 0;
                    if (this.encrypt) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    dataOutputStream2.writeInt(i10);
                    if (this.encrypt) {
                        byte[] bArr = new byte[16];
                        new Random().nextBytes(bArr);
                        dataOutputStream2.write(bArr);
                        try {
                            this.cipher.init(1, this.secretKeySpec, new IvParameterSpec(bArr));
                            dataOutputStream2.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(this.bufferedOutputStream, this.cipher));
                        } catch (InvalidAlgorithmParameterException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e10) {
                            e = e10;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream2.writeInt(this.keyToContent.size());
                    for (CachedContent cachedContent : this.keyToContent.values()) {
                        cachedContent.writeToStream(dataOutputStream2);
                        i11 += cachedContent.headerHashCode(2);
                    }
                    dataOutputStream2.writeInt(i11);
                    this.atomicFile.endWrite(dataOutputStream2);
                    Util.closeQuietly((Closeable) null);
                } catch (IOException e11) {
                    e = e11;
                    dataOutputStream = dataOutputStream2;
                    throw new Cache.CacheException(e);
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = dataOutputStream2;
                    Util.closeQuietly(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e12) {
            e = e12;
        }
    }

    public void applyContentMetadataMutations(String str, ContentMetadataMutations contentMetadataMutations) {
        if (getOrAdd(str).applyMetadataMutations(contentMetadataMutations)) {
            this.changed = true;
        }
    }

    public int assignIdForKey(String str) {
        return getOrAdd(str).f14741id;
    }

    public CachedContent get(String str) {
        return this.keyToContent.get(str);
    }

    public Collection<CachedContent> getAll() {
        return this.keyToContent.values();
    }

    public ContentMetadata getContentMetadata(String str) {
        CachedContent cachedContent = get(str);
        if (cachedContent != null) {
            return cachedContent.getMetadata();
        }
        return DefaultContentMetadata.EMPTY;
    }

    public String getKeyForId(int i10) {
        return this.idToKey.get(i10);
    }

    public Set<String> getKeys() {
        return this.keyToContent.keySet();
    }

    public CachedContent getOrAdd(String str) {
        CachedContent cachedContent = this.keyToContent.get(str);
        if (cachedContent == null) {
            return addNew(str);
        }
        return cachedContent;
    }

    public void load() {
        Assertions.checkState(!this.changed);
        if (!readFile()) {
            this.atomicFile.delete();
            this.keyToContent.clear();
            this.idToKey.clear();
        }
    }

    public void maybeRemove(String str) {
        CachedContent cachedContent = this.keyToContent.get(str);
        if (cachedContent != null && cachedContent.isEmpty() && !cachedContent.isLocked()) {
            this.keyToContent.remove(str);
            this.idToKey.remove(cachedContent.f14741id);
            this.changed = true;
        }
    }

    public void removeEmpty() {
        int size = this.keyToContent.size();
        String[] strArr = new String[size];
        this.keyToContent.keySet().toArray(strArr);
        for (int i10 = 0; i10 < size; i10++) {
            maybeRemove(strArr[i10]);
        }
    }

    public void store() throws Cache.CacheException {
        if (!this.changed) {
            return;
        }
        writeFile();
        this.changed = false;
    }

    public CachedContentIndex(File file, byte[] bArr) {
        this(file, bArr, bArr != null);
    }

    public CachedContentIndex(File file, byte[] bArr, boolean z10) {
        this.encrypt = z10;
        if (bArr != null) {
            Assertions.checkArgument(bArr.length == 16);
            try {
                this.cipher = getCipher();
                this.secretKeySpec = new SecretKeySpec(bArr, "AES");
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
                throw new IllegalStateException(e2);
            }
        } else {
            Assertions.checkState(!z10);
            this.cipher = null;
            this.secretKeySpec = null;
        }
        this.keyToContent = new HashMap<>();
        this.idToKey = new SparseArray<>();
        this.atomicFile = new AtomicFile(new File(file, FILE_NAME));
    }
}
