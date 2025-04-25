package com.glority.android.networkconfig.util;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GZipUtils.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¨\u0006\b"}, d2 = {"Lcom/glority/android/networkconfig/util/GZipUtils;", "", "()V", "compress", "", "sourceFile", "decompress", "compressed", "base-networkconfig_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class GZipUtils {
    public static final GZipUtils INSTANCE = new GZipUtils();

    private GZipUtils() {
    }

    public final byte[] compress(byte[] sourceFile) throws IOException {
        if (sourceFile == null || sourceFile.length == 0) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new BufferedOutputStream(byteArrayOutputStream));
        gZIPOutputStream.write(sourceFile);
        gZIPOutputStream.flush();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bout.toByteArray()");
        return byteArray;
    }

    public final byte[] decompress(byte[] compressed) throws IOException {
        if (compressed == null || compressed.length == 0) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(compressed));
        byte[] bArr = new byte[1024];
        while (true) {
            int read = gZIPInputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "out.toByteArray()");
                return byteArray;
            }
        }
    }
}
