package com.bykv.vk.openvk.component.video.zp.COT;

import com.mbridge.msdk.foundation.entity.o;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public class lMd {
    public static File KS(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    public static File lMd(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, o.j(str2, ".temp"));
    }

    public static long zp(String str, String str2) {
        File KS = KS(str, str2);
        if (KS.exists()) {
            return KS.length();
        }
        File lMd = lMd(str, str2);
        if (lMd.exists()) {
            return lMd.length();
        }
        return 0L;
    }

    public static void zp(RandomAccessFile randomAccessFile, byte[] bArr, int i9, int i10, String str) throws IOException {
        try {
            randomAccessFile.seek(i9);
            randomAccessFile.write(bArr, 0, i10);
        } catch (Throwable unused) {
        }
    }
}
