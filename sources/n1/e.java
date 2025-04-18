package n1;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.emoji2.text.x;
import com.facebook.appevents.o;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import eb.j;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
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
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes.dex */
public final class e implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final File f22379b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22380c;

    /* renamed from: d, reason: collision with root package name */
    public final File f22381d;

    /* renamed from: f, reason: collision with root package name */
    public final RandomAccessFile f22382f;

    /* renamed from: g, reason: collision with root package name */
    public final FileChannel f22383g;

    /* renamed from: h, reason: collision with root package name */
    public final FileLock f22384h;

    public e(File file, File file2) {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f22379b = file;
        this.f22381d = file2;
        this.f22380c = j(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f22382f = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f22383g = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f22384h = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e2) {
                e = e2;
                d(this.f22383g);
                throw e;
            } catch (Error e10) {
                e = e10;
                d(this.f22383g);
                throw e;
            } catch (RuntimeException e11) {
                e = e11;
                d(this.f22383g);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e12) {
            d(this.f22382f);
            throw e12;
        }
    }

    public static void d(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            Log.w("MultiDex", "Failed to close resource", e2);
        }
    }

    public static void g(ZipFile zipFile, ZipEntry zipEntry, d dVar, String str) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile(vd.e.e("tmp-", str), ".zip", dVar.getParentFile());
        Log.i("MultiDex", "Extracting " + createTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[JsonLexerKt.BATCH_SIZE];
                for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, read);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (createTempFile.setReadOnly()) {
                    Log.i("MultiDex", "Renaming to " + dVar.getPath());
                    if (createTempFile.renameTo(dVar)) {
                        return;
                    }
                    throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + dVar.getAbsolutePath() + "\"");
                }
                throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + dVar.getAbsolutePath() + "\")");
            } catch (Throwable th2) {
                zipOutputStream.close();
                throw th2;
            }
        } finally {
            d(inputStream);
            createTempFile.delete();
        }
    }

    public static long j(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, CampaignEx.JSON_KEY_AD_R);
        try {
            x h10 = o.h(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j3 = h10.f1549b;
            randomAccessFile.seek(h10.a);
            int min = (int) Math.min(16384L, j3);
            byte[] bArr = new byte[JsonLexerKt.BATCH_SIZE];
            int read = randomAccessFile.read(bArr, 0, min);
            while (read != -1) {
                crc32.update(bArr, 0, read);
                j3 -= read;
                if (j3 == 0) {
                    break;
                }
                read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j3));
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            if (value == -1) {
                return value - 1;
            }
            return value;
        } catch (Throwable th2) {
            randomAccessFile.close();
            throw th2;
        }
    }

    public static void r(Context context, long j3, long j10, ArrayList arrayList) {
        SharedPreferences.Editor edit = context.getSharedPreferences("multidex.version", 4).edit();
        edit.putLong(CampaignEx.JSON_KEY_TIMESTAMP, j3);
        edit.putLong("crc", j10);
        edit.putInt("dex.number", arrayList.size() + 1);
        Iterator it = arrayList.iterator();
        int i10 = 2;
        while (it.hasNext()) {
            d dVar = (d) it.next();
            edit.putLong(j.i("dex.crc.", i10), dVar.f22378b);
            edit.putLong("dex.time." + i10, dVar.lastModified());
            i10++;
        }
        edit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f22384h.release();
        this.f22383g.close();
        this.f22382f.close();
    }

    public final ArrayList k(Context context, boolean z10) {
        ArrayList q10;
        ArrayList arrayList;
        boolean z11;
        StringBuilder sb2 = new StringBuilder("MultiDexExtractor.load(");
        File file = this.f22379b;
        sb2.append(file.getPath());
        sb2.append(", ");
        sb2.append(z10);
        sb2.append(", )");
        Log.i("MultiDex", sb2.toString());
        if (this.f22384h.isValid()) {
            if (!z10) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
                long j3 = sharedPreferences.getLong(CampaignEx.JSON_KEY_TIMESTAMP, -1L);
                long lastModified = file.lastModified();
                if (lastModified == -1) {
                    lastModified--;
                }
                if (j3 == lastModified && sharedPreferences.getLong("crc", -1L) == this.f22380c) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    try {
                        arrayList = p(context);
                    } catch (IOException e2) {
                        Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e2);
                        q10 = q();
                        long lastModified2 = file.lastModified();
                        if (lastModified2 == -1) {
                            lastModified2--;
                        }
                        r(context, lastModified2, this.f22380c, q10);
                    }
                    Log.i("MultiDex", "load found " + arrayList.size() + " secondary dex files");
                    return arrayList;
                }
            }
            if (z10) {
                Log.i("MultiDex", "Forced extraction must be performed.");
            } else {
                Log.i("MultiDex", "Detected that extraction must be performed.");
            }
            q10 = q();
            long lastModified3 = file.lastModified();
            if (lastModified3 == -1) {
                lastModified3--;
            }
            r(context, lastModified3, this.f22380c, q10);
            arrayList = q10;
            Log.i("MultiDex", "load found " + arrayList.size() + " secondary dex files");
            return arrayList;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    public final ArrayList p(Context context) {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str = this.f22379b.getName() + ".classes";
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        int i10 = sharedPreferences.getInt("dex.number", 1);
        ArrayList arrayList = new ArrayList(i10 - 1);
        for (int i11 = 2; i11 <= i10; i11++) {
            d dVar = new d(this.f22381d, str + i11 + ".zip");
            if (dVar.isFile()) {
                dVar.f22378b = j(dVar);
                long j3 = sharedPreferences.getLong("dex.crc." + i11, -1L);
                long j10 = sharedPreferences.getLong("dex.time." + i11, -1L);
                long lastModified = dVar.lastModified();
                if (j10 == lastModified && j3 == dVar.f22378b) {
                    arrayList.add(dVar);
                } else {
                    throw new IOException("Invalid extracted dex: " + dVar + " (key \"\"), expected modification time: " + j10 + ", modification time: " + lastModified + ", expected crc: " + j3 + ", file crc: " + dVar.f22378b);
                }
            } else {
                throw new IOException("Missing extracted secondary dex file '" + dVar.getPath() + "'");
            }
        }
        return arrayList;
    }

    public final ArrayList q() {
        Throwable th2;
        boolean z10;
        String str;
        StringBuilder sb2 = new StringBuilder();
        File file = this.f22379b;
        sb2.append(file.getName());
        sb2.append(".classes");
        String sb3 = sb2.toString();
        c cVar = new c();
        File file2 = this.f22381d;
        File[] listFiles = file2.listFiles(cVar);
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
            int i10 = 2;
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            while (entry != null) {
                d dVar = new d(file2, sb3 + i10 + ".zip");
                arrayList.add(dVar);
                Log.i(str2, "Extraction is needed for file " + dVar);
                int i11 = 0;
                boolean z11 = false;
                while (i11 < 3 && !z11) {
                    int i12 = i11 + 1;
                    g(zipFile, entry, dVar, sb3);
                    String str3 = str2;
                    try {
                        dVar.f22378b = j(dVar);
                        z10 = true;
                        str2 = str3;
                    } catch (IOException e2) {
                        try {
                            str2 = str3;
                            Log.w(str2, "Failed to read crc from " + dVar.getAbsolutePath(), e2);
                            z10 = false;
                        } catch (Throwable th3) {
                            th = th3;
                            str2 = str3;
                            th2 = th;
                            try {
                                zipFile.close();
                                throw th2;
                            } catch (IOException e10) {
                                Log.w(str2, "Failed to close resource", e10);
                                throw th2;
                            }
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        str2 = str3;
                        zipFile.close();
                        throw th2;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Extraction ");
                    if (z10) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb4.append(str);
                    sb4.append(" '");
                    sb4.append(dVar.getAbsolutePath());
                    sb4.append("': length ");
                    ZipEntry zipEntry = entry;
                    String str4 = sb3;
                    sb4.append(dVar.length());
                    sb4.append(" - crc: ");
                    sb4.append(dVar.f22378b);
                    Log.i(str2, sb4.toString());
                    if (!z10) {
                        dVar.delete();
                        if (dVar.exists()) {
                            Log.w(str2, "Failed to delete corrupted secondary dex '" + dVar.getPath() + "'");
                        }
                    }
                    sb3 = str4;
                    entry = zipEntry;
                    z11 = z10;
                    i11 = i12;
                }
                String str5 = sb3;
                if (z11) {
                    i10++;
                    entry = zipFile.getEntry("classes" + i10 + ".dex");
                    sb3 = str5;
                } else {
                    throw new IOException("Could not create zip file " + dVar.getAbsolutePath() + " for secondary dex (" + i10 + ")");
                }
            }
            try {
                zipFile.close();
            } catch (IOException e11) {
                Log.w(str2, "Failed to close resource", e11);
            }
            return arrayList;
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
