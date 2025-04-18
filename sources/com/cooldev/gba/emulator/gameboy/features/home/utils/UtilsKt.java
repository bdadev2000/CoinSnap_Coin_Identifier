package com.cooldev.gba.emulator.gameboy.features.home.utils;

import androidx.documentfile.provider.DocumentFile;
import b1.f0;
import com.cooldev.gba.emulator.gameboy.features.game.utils.SaveInfo;
import com.cooldev.gba.emulator.gameboy.features.home.models.CoreID;
import com.cooldev.gba.emulator.gameboy.features.home.models.SystemCoreConfig;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.l;
import z0.m;

/* loaded from: classes.dex */
public final class UtilsKt {
    private static final int CRC32_BYTE_ARRAY_SIZE = 16384;
    private static final int GZIP_INPUT_STREAM_BUFFER_SIZE = 8192;

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CoreID.values().length];
            try {
                iArr[CoreID.MELONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final String calculateCrc32(@NotNull InputStream inputStream) {
        a.s(inputStream, "<this>");
        try {
            byte[] bArr = new byte[16384];
            CheckedInputStream checkedInputStream = new CheckedInputStream(inputStream, new CRC32());
            do {
                try {
                } finally {
                }
            } while (checkedInputStream.read(bArr) != -1);
            String stringCRC32 = toStringCRC32(checkedInputStream.getChecksum().getValue());
            q.b(checkedInputStream, null);
            q.b(inputStream, null);
            return stringCRC32;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q.b(inputStream, th);
                throw th2;
            }
        }
    }

    /* renamed from: calculateGridHeight-ghNngFA, reason: not valid java name */
    public static final float m229calculateGridHeightghNngFA(int i2, float f2, float f3, int i3) {
        return (f3 * (r4 - 1)) + (f2 * ((int) Math.ceil(i2 / i3)));
    }

    public static final void extractEntryToFile(@NotNull ZipInputStream zipInputStream, @NotNull String str, @NotNull File file) {
        a.s(zipInputStream, "<this>");
        a.s(str, "entryName");
        a.s(file, "gameFile");
        do {
            try {
            } finally {
            }
        } while (!a.g(zipInputStream.getNextEntry().getName(), str));
        writeToFile(zipInputStream, file);
        q.b(zipInputStream, null);
    }

    @NotNull
    public static final <K, V> Map<K, V> filterNotNullValues(@NotNull Map<K, ? extends V> map) {
        a.s(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (value != null) {
                linkedHashMap.put(key, value);
            }
        }
        return linkedHashMap;
    }

    @Nullable
    public static final <T> T filterNullable(@Nullable T t2, @NotNull l lVar) {
        a.s(lVar, "predicate");
        if (t2 == null || !((Boolean) lVar.invoke(t2)).booleanValue()) {
            return null;
        }
        return t2;
    }

    private static final void forEachLine(InputStream inputStream, Charset charset, l lVar) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, charset));
        try {
            f0.m(bufferedReader, lVar);
            q.b(bufferedReader, null);
        } finally {
        }
    }

    public static /* synthetic */ void forEachLine$default(InputStream inputStream, Charset charset, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = z0.a.f31458a;
        }
        forEachLine(inputStream, charset, lVar);
    }

    @NotNull
    public static final String getSaveStateDescription(@NotNull SaveInfo saveInfo) {
        a.s(saveInfo, "saveInfo");
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
        if (!saveInfo.getExists()) {
            return "";
        }
        String format = dateTimeInstance.format(Long.valueOf(saveInfo.getDate()));
        a.p(format);
        return format;
    }

    @Nullable
    public static final SavesMigrator getSavesMigrator(@NotNull SystemCoreConfig systemCoreConfig) {
        a.s(systemCoreConfig, "<this>");
        if (WhenMappings.$EnumSwitchMapping$0[systemCoreConfig.getCoreID().ordinal()] == 1) {
            return MelonDsSavesMigrator.INSTANCE;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int indexOf(@org.jetbrains.annotations.NotNull byte[] r7, @org.jetbrains.annotations.NotNull byte[] r8) {
        /*
            java.lang.String r0 = "<this>"
            p0.a.s(r7, r0)
            java.lang.String r0 = "byteArray"
            p0.a.s(r8, r0)
            int r0 = r8.length
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            int r0 = r7.length
            int r2 = r8.length
            int r0 = r0 - r2
            int r0 = r0 + 1
            r2 = r1
        L15:
            if (r2 >= r0) goto L2a
            int r3 = r8.length
            r4 = r1
        L19:
            if (r4 >= r3) goto L29
            int r5 = r2 + r4
            r5 = r7[r5]
            r6 = r8[r4]
            if (r5 == r6) goto L26
            int r2 = r2 + 1
            goto L15
        L26:
            int r4 = r4 + 1
            goto L19
        L29:
            return r2
        L2a:
            r7 = -1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.home.utils.UtilsKt.indexOf(byte[], byte[]):int");
    }

    public static final boolean isZipped(@NotNull DocumentFile documentFile) {
        a.s(documentFile, "<this>");
        return a.g(documentFile.c(), "application/zip");
    }

    public static final int kiloBytes(int i2) {
        return i2 * 1000;
    }

    public static final int megaBytes(int i2) {
        return kiloBytes(i2) * 1000;
    }

    @NotNull
    public static final byte[] readBytesUncompressed(@NotNull File file) {
        a.s(file, "<this>");
        InputStream uncompressedInputStream = uncompressedInputStream(file);
        try {
            byte[] bArr = new byte[8192];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                try {
                    int read = uncompressedInputStream.read(bArr);
                    if (read == -1) {
                        q.b(byteArrayOutputStream, null);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        a.r(byteArray, "toByteArray(...)");
                        q.b(uncompressedInputStream, null);
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        q.b(byteArrayOutputStream, th);
                        throw th2;
                    }
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                q.b(uncompressedInputStream, th3);
                throw th4;
            }
        }
    }

    @NotNull
    public static final List<String> readLines(@NotNull InputStream inputStream, @NotNull Charset charset) {
        a.s(inputStream, "<this>");
        a.s(charset, "charset");
        ArrayList arrayList = new ArrayList();
        forEachLine(inputStream, charset, new UtilsKt$readLines$1(arrayList));
        return arrayList;
    }

    public static /* synthetic */ List readLines$default(InputStream inputStream, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = z0.a.f31458a;
        }
        return readLines(inputStream, charset);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[Catch: all -> 0x002d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x002d, blocks: (B:11:0x0029, B:17:0x003c), top: B:10:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0046 -> B:12:0x004d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0049 -> B:12:0x004d). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object runCatchingWithRetry(int r4, @org.jetbrains.annotations.NotNull q0.l r5, @org.jetbrains.annotations.NotNull h0.g r6) {
        /*
            boolean r0 = r6 instanceof com.cooldev.gba.emulator.gameboy.features.home.utils.UtilsKt$runCatchingWithRetry$1
            if (r0 == 0) goto L13
            r0 = r6
            com.cooldev.gba.emulator.gameboy.features.home.utils.UtilsKt$runCatchingWithRetry$1 r0 = (com.cooldev.gba.emulator.gameboy.features.home.utils.UtilsKt$runCatchingWithRetry$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.cooldev.gba.emulator.gameboy.features.home.utils.UtilsKt$runCatchingWithRetry$1 r0 = new com.cooldev.gba.emulator.gameboy.features.home.utils.UtilsKt$runCatchingWithRetry$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r4 = r0.I$0
            java.lang.Object r5 = r0.L$0
            q0.l r5 = (q0.l) r5
            kotlin.jvm.internal.q.m(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4d
        L2d:
            r6 = move-exception
            goto L49
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.jvm.internal.q.m(r6)
        L3a:
            if (r4 < r3) goto L59
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L2d
            r0.I$0 = r4     // Catch: java.lang.Throwable -> L2d
            r0.label = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r6 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L2d
            if (r6 != r1) goto L4d
            return r1
        L49:
            d0.m r6 = kotlin.jvm.internal.q.d(r6)
        L4d:
            if (r4 != r3) goto L50
            goto L55
        L50:
            boolean r2 = r6 instanceof d0.m
            r2 = r2 ^ r3
            if (r2 == 0) goto L56
        L55:
            return r6
        L56:
            int r4 = r4 + (-1)
            goto L3a
        L59:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Failed requirement."
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.home.utils.UtilsKt.runCatchingWithRetry(int, q0.l, h0.g):java.lang.Object");
    }

    public static final boolean startsWithAny(@NotNull String str, @NotNull Collection<String> collection) {
        a.s(str, "<this>");
        a.s(collection, "strings");
        Collection<String> collection2 = collection;
        if (collection2.isEmpty()) {
            return false;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (m.q1(str, (String) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object timeMeasurement(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull q0.l r7, @org.jetbrains.annotations.NotNull h0.g r8) {
        /*
            boolean r0 = r8 instanceof com.cooldev.gba.emulator.gameboy.features.home.utils.UtilsKt$timeMeasurement$1
            if (r0 == 0) goto L13
            r0 = r8
            com.cooldev.gba.emulator.gameboy.features.home.utils.UtilsKt$timeMeasurement$1 r0 = (com.cooldev.gba.emulator.gameboy.features.home.utils.UtilsKt$timeMeasurement$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.cooldev.gba.emulator.gameboy.features.home.utils.UtilsKt$timeMeasurement$1 r0 = new com.cooldev.gba.emulator.gameboy.features.home.utils.UtilsKt$timeMeasurement$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r6 = r0.J$0
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.jvm.internal.q.m(r8)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.jvm.internal.q.m(r8)
            long r4 = java.lang.System.currentTimeMillis()
            r0.L$0 = r6
            r0.J$0 = r4
            r0.label = r3
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            r0 = r6
            r6 = r4
        L4b:
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r6
            java.lang.String r6 = "Function "
            java.lang.String r7 = " taken: "
            java.lang.StringBuilder r6 = android.support.v4.media.d.v(r6, r0, r7)
            double r7 = (double) r1
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r7 = r7 / r0
            r6.append(r7)
            java.lang.String r7 = " seconds"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "TimeMeasurement"
            android.util.Log.d(r7, r6)
            d0.b0 r6 = d0.b0.f30125a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.home.utils.UtilsKt.timeMeasurement(java.lang.String, q0.l, h0.g):java.lang.Object");
    }

    @NotNull
    public static final String toStringCRC32(long j2) {
        String upperCase = androidx.compose.foundation.text.input.a.o(new Object[]{Long.valueOf(j2)}, 1, "%08x", "format(...)").toUpperCase(Locale.ROOT);
        a.r(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static final <T> T tryCatch(@NotNull q0.a aVar, @NotNull l lVar, @NotNull q0.a aVar2) {
        T t2;
        a.s(aVar, "tryBlock");
        a.s(lVar, "catchBlock");
        a.s(aVar2, "finallyBlock");
        try {
            t2 = (T) aVar.invoke();
        } finally {
            try {
                return t2;
            } finally {
            }
        }
        return t2;
    }

    public static /* synthetic */ Object tryCatch$default(q0.a aVar, l lVar, q0.a aVar2, int i2, Object obj) {
        Object invoke;
        if ((i2 & 4) != 0) {
            aVar2 = UtilsKt$tryCatch$1.INSTANCE;
        }
        a.s(aVar, "tryBlock");
        a.s(lVar, "catchBlock");
        a.s(aVar2, "finallyBlock");
        try {
            invoke = aVar.invoke();
        } finally {
            try {
                return invoke;
            } finally {
            }
        }
        return invoke;
    }

    private static final InputStream uncompressedInputStream(File file) {
        PushbackInputStream pushbackInputStream = new PushbackInputStream(new FileInputStream(file), 2);
        byte[] bArr = new byte[2];
        pushbackInputStream.unread(bArr, 0, pushbackInputStream.read(bArr));
        return (bArr[0] == 31 && bArr[1] == -117) ? new GZIPInputStream(pushbackInputStream, 8192) : pushbackInputStream;
    }

    public static final void writeBytesCompressed(@NotNull File file, @NotNull byte[] bArr) {
        a.s(file, "<this>");
        a.s(bArr, "array");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(file));
        try {
            try {
                f0.i(byteArrayInputStream, gZIPOutputStream);
                q.b(gZIPOutputStream, null);
                q.b(byteArrayInputStream, null);
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q.b(byteArrayInputStream, th);
                throw th2;
            }
        }
    }

    public static final void writeToFile(@NotNull InputStream inputStream, @NotNull File file) {
        a.s(inputStream, "<this>");
        a.s(file, ShareInternalUtility.STAGING_PARAM);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                f0.i(inputStream, fileOutputStream);
                q.b(fileOutputStream, null);
                q.b(inputStream, null);
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q.b(inputStream, th);
                throw th2;
            }
        }
    }
}
