package com.bytedance.sdk.component.wN.tN.YFl.YFl;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
final class AlY {
    static final Charset YFl = Charset.forName(C.ASCII_NAME);
    static final Charset Sg = Charset.forName("UTF-8");

    public static void YFl(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    YFl(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: ".concat(String.valueOf(file2)));
                }
            }
            return;
        }
        throw new IOException("not a readable directory: ".concat(String.valueOf(file)));
    }
}
