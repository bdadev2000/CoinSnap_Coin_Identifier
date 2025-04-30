package com.bytedance.sdk.component.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class cz {
    private static boolean COT = false;
    private static boolean HWF = false;
    private static Resources KS;
    private static String jU;
    private static String lMd;

    @SuppressLint({"StaticFieldLeak"})
    private static Context zp;

    public static int Bj(Context context, String str) {
        return zp(context, str, "integer");
    }

    public static int COT(Context context, String str) {
        return zp(context, str, "id");
    }

    public static int HWF(Context context, String str) {
        return zp(context, str, TtmlNode.TAG_STYLE);
    }

    public static Drawable KS(Context context, String str) {
        return lMd(context).getDrawable(jU(context, str));
    }

    public static int QR(Context context, String str) {
        return zp(context, str, "dimen");
    }

    public static int YW(Context context, String str) {
        return zp(context, str, TtmlNode.ATTR_TTS_COLOR);
    }

    public static int dT(Context context, String str) {
        return zp(context, str, "anim");
    }

    private static String jU(Context context) {
        if (jU == null) {
            jU = context.getPackageName();
        }
        return jU;
    }

    public static int ku(Context context, String str) {
        return lMd(context).getColor(YW(context, str));
    }

    public static int lMd(Context context, String str) {
        return zp(context, str, "string");
    }

    public static int vDp(Context context, String str) {
        return lMd(context).getInteger(Bj(context, str));
    }

    public static void zp(Context context) {
        zp = context;
    }

    public static Resources lMd(Context context) {
        Resources resources = KS;
        if (resources == null) {
            resources = null;
        }
        Context context2 = zp;
        if (context2 != null) {
            resources = context2.getResources();
        }
        return resources == null ? context.getResources() : resources;
    }

    public static void zp(String str) {
        jU = str;
    }

    public static synchronized void KS(Context context) {
        synchronized (cz.class) {
            try {
                if (TextUtils.isEmpty(lMd)) {
                    return;
                }
                Resources resources = context.getResources();
                KS = new Resources(lMd(resources.getAssets(), lMd + "/apk/base-1.apk"), resources.getDisplayMetrics(), resources.getConfiguration());
                jU = context.getPackageName();
                COT = true;
            } catch (Throwable th) {
                Log.e("ResourceHelp", "makePluginResources failed", th);
            }
        }
    }

    private static int zp(Context context, String str, String str2) {
        int identifier = lMd(context).getIdentifier(str, str2, jU(context));
        if (identifier != 0) {
            return identifier;
        }
        if (!COT) {
            KS(context);
            return lMd(context).getIdentifier(str, str2, jU(context));
        }
        return context.getResources().getIdentifier(str, str2, jU(context));
    }

    public static int jU(Context context, String str) {
        return zp(context, str, "drawable");
    }

    private static AssetManager lMd(AssetManager assetManager, String str) {
        AssetManager assetManager2;
        try {
            if (assetManager.getClass().getName().equals("android.content.res.BaiduAssetManager")) {
                assetManager2 = (AssetManager) Class.forName("android.content.res.BaiduAssetManager").getConstructor(null).newInstance(null);
            } else {
                assetManager2 = (AssetManager) AssetManager.class.newInstance();
            }
            zp(assetManager2, str);
            assetManager = assetManager2;
        } catch (Exception unused) {
            zp(assetManager, str);
        }
        try {
            Lij.zp(assetManager, "ensureStringBlocks", new Object[0]);
        } catch (Exception unused2) {
        }
        return assetManager;
    }

    public static String zp(Context context, String str) {
        return lMd(context).getString(lMd(context, str));
    }

    public static boolean zp(AssetManager assetManager, String str) {
        Method zp2 = Lij.zp((Class<?>) AssetManager.class, "addAssetPath", (Class<?>[]) new Class[]{String.class});
        if (zp2 == null) {
            zp2 = Lij.zp((Class<?>) AssetManager.class, "addAssetPath", (Class<?>[]) new Class[]{String.class});
        }
        if (zp2 == null) {
            return false;
        }
        int i9 = 3;
        while (true) {
            int i10 = i9 - 1;
            if (i9 < 0) {
                return false;
            }
            if (((Integer) zp2.invoke(assetManager, str)).intValue() != 0) {
                return true;
            }
            i9 = i10;
        }
    }
}
