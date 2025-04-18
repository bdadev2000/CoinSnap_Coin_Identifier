package com.bykv.vk.openvk.preload.geckox.utils;

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
                StringBuilder m10 = a4.j.m("patch merged failed, code：", patch, " full:");
                m10.append(file.getAbsolutePath());
                m10.append(" patch:");
                m10.append(file2.getAbsolutePath());
                m10.append(" dest:");
                m10.append(file4.getAbsolutePath());
                throw new RuntimeException(m10.toString());
            }
            throw new FileNotFoundException("patch package not exist：" + file2.getAbsolutePath());
        }
        throw new FileNotFoundException("full package not exist：" + file.getAbsolutePath());
    }

    private static native int patch(String str, String str2, String str3) throws Exception;
}
