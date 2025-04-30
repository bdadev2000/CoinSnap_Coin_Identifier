package com.bytedance.adsdk.lottie.jU;

import android.util.Pair;
import com.bytedance.component.sdk.annotation.RestrictTo;
import com.bytedance.component.sdk.annotation.WorkerThread;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class QR {
    private final COT zp;

    public QR(COT cot) {
        this.zp = cot;
    }

    private File lMd(String str) throws FileNotFoundException {
        File file = new File(zp(), zp(str, KS.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(zp(), zp(str, KS.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    @WorkerThread
    public Pair<KS, InputStream> zp(String str) {
        KS ks;
        try {
            File lMd = lMd(str);
            if (lMd == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(lMd);
            if (lMd.getAbsolutePath().endsWith(".zip")) {
                ks = KS.ZIP;
            } else {
                ks = KS.JSON;
            }
            lMd.getAbsolutePath();
            return new Pair<>(ks, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public File zp(String str, InputStream inputStream, KS ks) throws IOException {
        File file = new File(zp(), zp(str, ks, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }

    public void zp(String str, KS ks) {
        File file = new File(zp(), zp(str, ks, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        file2.toString();
        if (renameTo) {
            return;
        }
        file.getAbsolutePath();
        file2.getAbsolutePath();
    }

    private File zp() {
        File zp = this.zp.zp();
        if (zp.isFile()) {
            zp.delete();
        }
        if (!zp.exists()) {
            zp.mkdirs();
        }
        return zp;
    }

    private static String zp(String str, KS ks, boolean z8) {
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z8 ? ks.zp() : ks.KS);
        return sb.toString();
    }
}
