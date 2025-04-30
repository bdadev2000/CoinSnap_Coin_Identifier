package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a {
    public static com.bykv.vk.openvk.preload.geckox.buffer.a a(File file, long j7) throws IOException {
        com.bykv.vk.openvk.preload.geckox.buffer.a b = b(file, j7);
        GeckoLogger.d("gecko-debug-tag", "buffer type:" + b.getClass());
        return b;
    }

    private static com.bykv.vk.openvk.preload.geckox.buffer.a b(File file, long j7) throws IOException {
        if (j7 <= 0) {
            try {
                return new b(file);
            } catch (Exception e4) {
                throw new IOException("create FileBuffer failed! file:" + file.getAbsolutePath() + " caused by:" + e4.getMessage(), e4);
            }
        }
        try {
            return new c(j7, file);
        } catch (Exception e9) {
            throw new RuntimeException("create random access file failed! file:" + file.getAbsolutePath() + " caused by:" + e9.getMessage(), e9);
        }
    }
}
