package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.vc;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.multipro.Sg;
import java.io.File;
import m2.l;
import o5.a;
import vd.e;

/* loaded from: classes.dex */
public class CacheDirFactory {
    public static volatile a MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;
    private static String YFl;

    private static a YFl() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                if (MEDIA_CACHE_DIR == null) {
                    l lVar = new l(1);
                    MEDIA_CACHE_DIR = lVar;
                    lVar.f21470e = getRootDir();
                    ((l) MEDIA_CACHE_DIR).a();
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }

    public static int getCacheType() {
        return 1;
    }

    public static String getDiskCacheDirPath(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getRootDir());
        return e.h(sb2, File.separator, str);
    }

    public static a getICacheDir(int i10) {
        return YFl();
    }

    public static String getImageCacheDir() {
        if (YFl == null) {
            YFl = getDiskCacheDirPath("image");
        }
        return YFl;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File YFl2 = vc.YFl(lG.YFl(), Sg.tN(), "tt_ad");
        if (YFl2.isFile()) {
            YFl2.delete();
        }
        if (!YFl2.exists()) {
            YFl2.mkdirs();
        }
        String absolutePath = YFl2.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }
}
