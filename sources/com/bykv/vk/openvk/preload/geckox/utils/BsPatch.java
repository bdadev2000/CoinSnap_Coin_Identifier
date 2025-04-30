package com.bykv.vk.openvk.preload.geckox.utils;

import Q7.n0;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public class BsPatch {
    static {
        System.loadLibrary("geckox_bspatch");
    }

    public static void a(File file, File file2, File file3, String str) throws Exception {
        if (file.exists()) {
            if (file2.exists()) {
                file3.mkdirs();
                File file4 = new File(file3, str);
                file4.delete();
                int patch = patch(file.getAbsolutePath(), file4.getAbsolutePath(), file2.getAbsolutePath());
                if (patch == 0) {
                    return;
                }
                StringBuilder p2 = n0.p(patch, "patch merged failed, code：", " full:");
                p2.append(file.getAbsolutePath());
                p2.append(" patch:");
                p2.append(file2.getAbsolutePath());
                p2.append(" dest:");
                p2.append(file4.getAbsolutePath());
                throw new RuntimeException(p2.toString());
            }
            throw new FileNotFoundException("patch package not exist：" + file2.getAbsolutePath());
        }
        throw new FileNotFoundException("full package not exist：" + file.getAbsolutePath());
    }

    private static native int patch(String str, String str2, String str3) throws Exception;
}
