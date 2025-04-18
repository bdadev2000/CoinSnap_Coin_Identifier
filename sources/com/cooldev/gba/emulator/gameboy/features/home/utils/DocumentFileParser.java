package com.cooldev.gba.emulator.gameboy.features.home.utils;

import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.home.models.BaseStorageFile;
import com.cooldev.gba.emulator.gameboy.features.home.models.StorageFile;
import com.cooldev.gba.emulator.gameboy.features.home.utils.SerialScanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class DocumentFileParser {
    public static final int $stable = 0;
    private static final int MAX_CHECKED_ENTRIES = 3;
    private static final int MAX_SIZE_CRC32 = 1000000000;
    private static final double SINGLE_ARCHIVE_THRESHOLD = 0.9d;

    @NotNull
    public static final DocumentFileParser INSTANCE = new DocumentFileParser();

    @Nullable
    private static final String TAG = g0.a(DocumentFileParser.class).c();

    private DocumentFileParser() {
    }

    private final ZipEntry findGameEntry(ZipInputStream zipInputStream, long j2) {
        ZipEntry nextEntry;
        Log.d(TAG, "Finding game entry in ZIP file.");
        for (int i2 = 0; i2 < 4 && (nextEntry = zipInputStream.getNextEntry()) != null; i2++) {
            if (isGameEntry(nextEntry, j2)) {
                Log.d(TAG, "Found game entry: " + nextEntry.getName());
                return nextEntry;
            }
        }
        Log.d(TAG, "No game entry found after checking 3 entries.");
        return null;
    }

    public static /* synthetic */ ZipEntry findGameEntry$default(DocumentFileParser documentFileParser, ZipInputStream zipInputStream, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = -1;
        }
        return documentFileParser.findGameEntry(zipInputStream, j2);
    }

    private final boolean isGameEntry(ZipEntry zipEntry, long j2) {
        if (j2 > 0 && zipEntry.getCompressedSize() > 0) {
            r3 = ((double) (((float) zipEntry.getCompressedSize()) / ((float) j2))) > SINGLE_ARCHIVE_THRESHOLD;
            Log.d(TAG, "Entry: " + zipEntry.getName() + ", is game entry: " + r3);
        }
        return r3;
    }

    private final StorageFile parseCompressedGame(BaseStorageFile baseStorageFile, ZipEntry zipEntry, ZipInputStream zipInputStream) {
        Log.d(TAG, "Parsing compressed game: " + zipEntry.getName());
        SerialScanner serialScanner = SerialScanner.INSTANCE;
        String name = zipEntry.getName();
        a.r(name, "getName(...)");
        SerialScanner.DiskInfo extractInfo = serialScanner.extractInfo(name, zipInputStream);
        String name2 = zipEntry.getName();
        a.r(name2, "getName(...)");
        return new StorageFile(name2, zipEntry.getSize(), UtilsKt.toStringCRC32(zipEntry.getCrc()), extractInfo.getSerial(), baseStorageFile.getUri(), baseStorageFile.getUri().getPath(), extractInfo.getSystemID());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    @android.annotation.SuppressLint({"Recycle"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.cooldev.gba.emulator.gameboy.features.home.models.StorageFile parseStandardFile(android.content.Context r13, com.cooldev.gba.emulator.gameboy.features.home.models.BaseStorageFile r14) {
        /*
            r12 = this;
            java.lang.String r0 = com.cooldev.gba.emulator.gameboy.features.home.utils.DocumentFileParser.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Parsing standard file: "
            r1.<init>(r2)
            android.net.Uri r2 = r14.getUri()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            android.content.ContentResolver r1 = r13.getContentResolver()
            android.net.Uri r2 = r14.getUri()
            java.io.InputStream r1 = r1.openInputStream(r2)
            r2 = 0
            if (r1 == 0) goto L31
            com.cooldev.gba.emulator.gameboy.features.home.utils.SerialScanner r3 = com.cooldev.gba.emulator.gameboy.features.home.utils.SerialScanner.INSTANCE
            java.lang.String r4 = r14.getName()
            com.cooldev.gba.emulator.gameboy.features.home.utils.SerialScanner$DiskInfo r1 = r3.extractInfo(r4, r1)
            goto L32
        L31:
            r1 = r2
        L32:
            long r3 = r14.getSize()
            r5 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L70
            if (r1 == 0) goto L44
            java.lang.String r3 = r1.getSerial()
            goto L45
        L44:
            r3 = r2
        L45:
            if (r3 != 0) goto L70
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Calculating CRC32 for file: "
            r3.<init>(r4)
            android.net.Uri r4 = r14.getUri()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r0, r3)
            android.content.ContentResolver r13 = r13.getContentResolver()
            android.net.Uri r0 = r14.getUri()
            java.io.InputStream r13 = r13.openInputStream(r0)
            if (r13 == 0) goto L70
            java.lang.String r13 = com.cooldev.gba.emulator.gameboy.features.home.utils.UtilsKt.calculateCrc32(r13)
            r7 = r13
            goto L71
        L70:
            r7 = r2
        L71:
            com.cooldev.gba.emulator.gameboy.features.home.models.StorageFile r13 = new com.cooldev.gba.emulator.gameboy.features.home.models.StorageFile
            java.lang.String r4 = r14.getName()
            long r5 = r14.getSize()
            if (r1 == 0) goto L83
            java.lang.String r0 = r1.getSerial()
            r8 = r0
            goto L84
        L83:
            r8 = r2
        L84:
            android.net.Uri r9 = r14.getUri()
            android.net.Uri r14 = r14.getUri()
            java.lang.String r10 = r14.getPath()
            if (r1 == 0) goto L96
            com.cooldev.gba.emulator.gameboy.features.home.models.SystemID r2 = r1.getSystemID()
        L96:
            r11 = r2
            r3 = r13
            r3.<init>(r4, r5, r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.home.utils.DocumentFileParser.parseStandardFile(android.content.Context, com.cooldev.gba.emulator.gameboy.features.home.models.BaseStorageFile):com.cooldev.gba.emulator.gameboy.features.home.models.StorageFile");
    }

    private final StorageFile parseZipFile(Context context, BaseStorageFile baseStorageFile) {
        StorageFile parseStandardFile;
        String str = TAG;
        Log.d(str, "Parsing ZIP file: " + baseStorageFile.getUri());
        ZipInputStream zipInputStream = new ZipInputStream(context.getContentResolver().openInputStream(baseStorageFile.getUri()));
        try {
            DocumentFileParser documentFileParser = INSTANCE;
            ZipEntry findGameEntry = documentFileParser.findGameEntry(zipInputStream, baseStorageFile.getSize());
            if (findGameEntry != null) {
                Log.d(str, "Game entry found: " + findGameEntry.getName());
                parseStandardFile = documentFileParser.parseCompressedGame(baseStorageFile, findGameEntry, zipInputStream);
            } else {
                Log.d(str, "No game entry found, parsing as standard file.");
                parseStandardFile = documentFileParser.parseStandardFile(context, baseStorageFile);
            }
            q.b(zipInputStream, null);
            return parseStandardFile;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q.b(zipInputStream, th);
                throw th2;
            }
        }
    }

    @NotNull
    public final StorageFile parseDocumentFile(@NotNull Context context, @NotNull BaseStorageFile baseStorageFile) {
        a.s(context, "context");
        a.s(baseStorageFile, "baseStorageFile");
        Log.d(TAG, "Parsing document file: " + baseStorageFile.getUri());
        return a.g(baseStorageFile.getExtension(), "zip") ? parseZipFile(context, baseStorageFile) : parseStandardFile(context, baseStorageFile);
    }
}
