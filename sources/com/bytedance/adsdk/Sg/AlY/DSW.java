package com.bytedance.adsdk.Sg.AlY;

import android.util.Pair;
import com.bytedance.component.sdk.annotation.RestrictTo;
import com.bytedance.component.sdk.annotation.WorkerThread;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class DSW {
    private final wN YFl;

    public DSW(wN wNVar) {
        this.YFl = wNVar;
    }

    private File Sg(String str) throws FileNotFoundException {
        File file = new File(YFl(), YFl(str, tN.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(YFl(), YFl(str, tN.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    @WorkerThread
    public Pair<tN, InputStream> YFl(String str) {
        tN tNVar;
        try {
            File Sg = Sg(str);
            if (Sg == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(Sg);
            if (Sg.getAbsolutePath().endsWith(".zip")) {
                tNVar = tN.ZIP;
            } else {
                tNVar = tN.JSON;
            }
            Sg.getAbsolutePath();
            return new Pair<>(tNVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public File YFl(String str, InputStream inputStream, tN tNVar) throws IOException {
        File file = new File(YFl(), YFl(str, tNVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        return file;
                    }
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }

    public void YFl(String str, tN tNVar) {
        File file = new File(YFl(), YFl(str, tNVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        file2.toString();
        if (renameTo) {
            return;
        }
        file.getAbsolutePath();
        file2.getAbsolutePath();
    }

    private File YFl() {
        File YFl = this.YFl.YFl();
        if (YFl.isFile()) {
            YFl.delete();
        }
        if (!YFl.exists()) {
            YFl.mkdirs();
        }
        return YFl;
    }

    private static String YFl(String str, tN tNVar, boolean z10) {
        StringBuilder sb2 = new StringBuilder("lottie_cache_");
        sb2.append(str.replaceAll("\\W+", ""));
        sb2.append(z10 ? tNVar.YFl() : tNVar.tN);
        return sb2.toString();
    }
}
