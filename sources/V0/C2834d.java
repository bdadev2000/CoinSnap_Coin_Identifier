package v0;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.o;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import k5.g;
import x0.AbstractC2914a;

/* renamed from: v0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2834d implements Closeable {
    public final File b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23453c;

    /* renamed from: d, reason: collision with root package name */
    public final File f23454d;

    /* renamed from: f, reason: collision with root package name */
    public final RandomAccessFile f23455f;

    /* renamed from: g, reason: collision with root package name */
    public final FileChannel f23456g;

    /* renamed from: h, reason: collision with root package name */
    public final FileLock f23457h;

    public C2834d(File file, File file2) {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.b = file;
        this.f23454d = file2;
        this.f23453c = c(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f23455f = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f23456g = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f23457h = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e4) {
                e = e4;
                a(this.f23456g);
                throw e;
            } catch (Error e9) {
                e = e9;
                a(this.f23456g);
                throw e;
            } catch (RuntimeException e10) {
                e = e10;
                a(this.f23456g);
                throw e;
            }
        } catch (IOException e11) {
            e = e11;
            a(this.f23455f);
            throw e;
        } catch (Error e12) {
            e = e12;
            a(this.f23455f);
            throw e;
        } catch (RuntimeException e13) {
            e = e13;
            a(this.f23455f);
            throw e;
        }
    }

    public static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e4) {
            Log.w("MultiDex", "Failed to close resource", e4);
        }
    }

    public static void b(ZipFile zipFile, ZipEntry zipEntry, C2833c c2833c, String str) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile(AbstractC2914a.d("tmp-", str), ".zip", c2833c.getParentFile());
        Log.i("MultiDex", "Extracting " + createTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, read);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (createTempFile.setReadOnly()) {
                    Log.i("MultiDex", "Renaming to " + c2833c.getPath());
                    if (createTempFile.renameTo(c2833c)) {
                        a(inputStream);
                        createTempFile.delete();
                        return;
                    }
                    throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + c2833c.getAbsolutePath() + "\"");
                }
                throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + c2833c.getAbsolutePath() + "\")");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            a(inputStream);
            createTempFile.delete();
            throw th2;
        }
    }

    public static long c(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, CampaignEx.JSON_KEY_AD_R);
        try {
            g i9 = com.facebook.appevents.g.i(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j7 = i9.b;
            randomAccessFile.seek(i9.f21483a);
            byte[] bArr = new byte[16384];
            int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j7));
            while (read != -1) {
                crc32.update(bArr, 0, read);
                j7 -= read;
                if (j7 == 0) {
                    break;
                }
                read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j7));
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            if (value == -1) {
                return value - 1;
            }
            return value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    public static void k(Context context, long j7, long j9, ArrayList arrayList) {
        SharedPreferences.Editor edit = context.getSharedPreferences("multidex.version", 4).edit();
        edit.putLong(CampaignEx.JSON_KEY_TIMESTAMP, j7);
        edit.putLong("crc", j9);
        edit.putInt("dex.number", arrayList.size() + 1);
        Iterator it = arrayList.iterator();
        int i9 = 2;
        while (it.hasNext()) {
            C2833c c2833c = (C2833c) it.next();
            edit.putLong(o.h(i9, "dex.crc."), c2833c.b);
            edit.putLong("dex.time." + i9, c2833c.lastModified());
            i9++;
        }
        edit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f23457h.release();
        this.f23456g.close();
        this.f23455f.close();
    }

    public final ArrayList h(Context context, boolean z8) {
        ArrayList j7;
        ArrayList arrayList;
        StringBuilder sb = new StringBuilder("MultiDexExtractor.load(");
        File file = this.b;
        sb.append(file.getPath());
        sb.append(", ");
        sb.append(z8);
        sb.append(", )");
        Log.i("MultiDex", sb.toString());
        if (this.f23457h.isValid()) {
            if (!z8) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
                long j9 = sharedPreferences.getLong(CampaignEx.JSON_KEY_TIMESTAMP, -1L);
                long lastModified = file.lastModified();
                if (lastModified == -1) {
                    lastModified--;
                }
                if (j9 == lastModified && sharedPreferences.getLong("crc", -1L) == this.f23453c) {
                    try {
                        arrayList = i(context);
                    } catch (IOException e4) {
                        Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e4);
                        j7 = j();
                        long lastModified2 = file.lastModified();
                        if (lastModified2 == -1) {
                            lastModified2--;
                        }
                        k(context, lastModified2, this.f23453c, j7);
                    }
                    Log.i("MultiDex", "load found " + arrayList.size() + " secondary dex files");
                    return arrayList;
                }
            }
            if (z8) {
                Log.i("MultiDex", "Forced extraction must be performed.");
            } else {
                Log.i("MultiDex", "Detected that extraction must be performed.");
            }
            j7 = j();
            long lastModified3 = file.lastModified();
            if (lastModified3 == -1) {
                lastModified3--;
            }
            k(context, lastModified3, this.f23453c, j7);
            arrayList = j7;
            Log.i("MultiDex", "load found " + arrayList.size() + " secondary dex files");
            return arrayList;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    public final ArrayList i(Context context) {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str = this.b.getName() + ".classes";
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        int i9 = sharedPreferences.getInt("dex.number", 1);
        ArrayList arrayList = new ArrayList(i9 - 1);
        for (int i10 = 2; i10 <= i9; i10++) {
            C2833c c2833c = new C2833c(this.f23454d, str + i10 + ".zip");
            if (c2833c.isFile()) {
                c2833c.b = c(c2833c);
                long j7 = sharedPreferences.getLong("dex.crc." + i10, -1L);
                long j9 = sharedPreferences.getLong("dex.time." + i10, -1L);
                long lastModified = c2833c.lastModified();
                if (j9 == lastModified && j7 == c2833c.b) {
                    arrayList.add(c2833c);
                } else {
                    throw new IOException("Invalid extracted dex: " + c2833c + " (key \"\"), expected modification time: " + j9 + ", modification time: " + lastModified + ", expected crc: " + j7 + ", file crc: " + c2833c.b);
                }
            } else {
                throw new IOException("Missing extracted secondary dex file '" + c2833c.getPath() + "'");
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.FileFilter, java.lang.Object] */
    public final ArrayList j() {
        Throwable th;
        boolean z8;
        String str;
        StringBuilder sb = new StringBuilder();
        File file = this.b;
        sb.append(file.getName());
        sb.append(".classes");
        String sb2 = sb.toString();
        ?? obj = new Object();
        File file2 = this.f23454d;
        File[] listFiles = file2.listFiles((FileFilter) obj);
        String str2 = "MultiDex";
        if (listFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + file2.getPath() + ").");
        } else {
            for (File file3 : listFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file3.getPath() + " of size " + file3.length());
                if (!file3.delete()) {
                    Log.w("MultiDex", "Failed to delete old file " + file3.getPath());
                } else {
                    Log.i("MultiDex", "Deleted old file " + file3.getPath());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        try {
            int i9 = 2;
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            while (entry != null) {
                C2833c c2833c = new C2833c(file2, sb2 + i9 + ".zip");
                arrayList.add(c2833c);
                Log.i(str2, "Extraction is needed for file " + c2833c);
                int i10 = 0;
                boolean z9 = false;
                while (i10 < 3 && !z9) {
                    int i11 = i10 + 1;
                    b(zipFile, entry, c2833c, sb2);
                    String str3 = str2;
                    try {
                        c2833c.b = c(c2833c);
                        z8 = true;
                        str2 = str3;
                    } catch (IOException e4) {
                        try {
                            str2 = str3;
                            Log.w(str2, "Failed to read crc from " + c2833c.getAbsolutePath(), e4);
                            z8 = false;
                        } catch (Throwable th2) {
                            th = th2;
                            str2 = str3;
                            th = th;
                            try {
                                zipFile.close();
                                throw th;
                            } catch (IOException e9) {
                                Log.w(str2, "Failed to close resource", e9);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        str2 = str3;
                        zipFile.close();
                        throw th;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Extraction ");
                    if (z8) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb3.append(str);
                    sb3.append(" '");
                    sb3.append(c2833c.getAbsolutePath());
                    sb3.append("': length ");
                    ZipEntry zipEntry = entry;
                    String str4 = sb2;
                    sb3.append(c2833c.length());
                    sb3.append(" - crc: ");
                    sb3.append(c2833c.b);
                    Log.i(str2, sb3.toString());
                    if (!z8) {
                        c2833c.delete();
                        if (c2833c.exists()) {
                            Log.w(str2, "Failed to delete corrupted secondary dex '" + c2833c.getPath() + "'");
                        }
                    }
                    sb2 = str4;
                    entry = zipEntry;
                    z9 = z8;
                    i10 = i11;
                }
                String str5 = sb2;
                if (z9) {
                    i9++;
                    entry = zipFile.getEntry("classes" + i9 + ".dex");
                    sb2 = str5;
                } else {
                    throw new IOException("Could not create zip file " + c2833c.getAbsolutePath() + " for secondary dex (" + i9 + ")");
                }
            }
            try {
                zipFile.close();
            } catch (IOException e10) {
                Log.w(str2, "Failed to close resource", e10);
            }
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
