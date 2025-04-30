package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.zp.lMd;
import com.bykv.vk.openvk.component.video.zp.zp.zp.zp;
import com.bytedance.sdk.component.utils.HWF;
import com.bytedance.sdk.openadsdk.core.KVG;
import java.io.File;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class CacheDirFactory {
    public static volatile lMd MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;
    private static String zp;

    public static int getCacheType() {
        return 1;
    }

    public static String getDiskCacheDirPath(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(getRootDir());
        return AbstractC2914a.h(sb, File.separator, str);
    }

    public static lMd getICacheDir(int i9) {
        return zp();
    }

    public static String getImageCacheDir() {
        if (zp == null) {
            zp = getDiskCacheDirPath("image");
        }
        return zp;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File zp2 = HWF.zp(KVG.zp(), com.bytedance.sdk.openadsdk.multipro.lMd.KS(), "tt_ad");
        if (zp2.isFile()) {
            zp2.delete();
        }
        if (!zp2.exists()) {
            zp2.mkdirs();
        }
        String absolutePath = zp2.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }

    private static lMd zp() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                try {
                    if (MEDIA_CACHE_DIR == null) {
                        zp zpVar = new zp();
                        MEDIA_CACHE_DIR = zpVar;
                        zpVar.zp(getRootDir());
                        MEDIA_CACHE_DIR.jU();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }
}
