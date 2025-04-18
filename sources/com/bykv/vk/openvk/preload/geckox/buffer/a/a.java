package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a {
    public static com.bykv.vk.openvk.preload.geckox.buffer.a a(File file, long j3) throws IOException {
        com.bykv.vk.openvk.preload.geckox.buffer.a b3 = b(file, j3);
        GeckoLogger.d("gecko-debug-tag", "buffer type:" + b3.getClass());
        return b3;
    }

    private static com.bykv.vk.openvk.preload.geckox.buffer.a b(File file, long j3) throws IOException {
        if (j3 <= 0) {
            try {
                return new b(file);
            } catch (Exception e2) {
                throw new IOException("create FileBuffer failed! file:" + file.getAbsolutePath() + " caused by:" + e2.getMessage(), e2);
            }
        }
        try {
            return new c(j3, file);
        } catch (Exception e10) {
            throw new RuntimeException("create random access file failed! file:" + file.getAbsolutePath() + " caused by:" + e10.getMessage(), e10);
        }
    }
}
