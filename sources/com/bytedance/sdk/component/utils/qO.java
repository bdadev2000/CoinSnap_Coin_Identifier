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
public final class qO {
    private static String AlY = null;
    private static String Sg = null;

    @SuppressLint({"StaticFieldLeak"})
    private static Context YFl = null;
    private static Resources tN = null;

    /* renamed from: vc, reason: collision with root package name */
    private static boolean f10443vc = false;
    private static boolean wN = false;

    private static String AlY(Context context) {
        if (AlY == null) {
            AlY = context.getPackageName();
        }
        return AlY;
    }

    public static int DSW(Context context, String str) {
        return Sg(context).getColor(qsH(context, str));
    }

    public static int NjR(Context context, String str) {
        return YFl(context, str, "anim");
    }

    public static int Sg(Context context, String str) {
        return YFl(context, str, "string");
    }

    public static void YFl(Context context) {
        YFl = context;
    }

    public static int qsH(Context context, String str) {
        return YFl(context, str, TtmlNode.ATTR_TTS_COLOR);
    }

    public static Drawable tN(Context context, String str) {
        try {
            return Sg(context).getDrawable(AlY(context, str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static int vc(Context context, String str) {
        return YFl(context, str, TtmlNode.TAG_STYLE);
    }

    public static int wN(Context context, String str) {
        return YFl(context, str, "id");
    }

    public static Resources Sg(Context context) {
        Resources resources = tN;
        if (resources == null) {
            resources = null;
        }
        Context context2 = YFl;
        if (context2 != null) {
            resources = context2.getResources();
        }
        return resources == null ? context.getResources() : resources;
    }

    public static void YFl(String str) {
        AlY = str;
    }

    private static int YFl(Context context, String str, String str2) {
        int identifier = Sg(context).getIdentifier(str, str2, AlY(context));
        if (identifier != 0) {
            return identifier;
        }
        if (!wN) {
            tN(context);
            return Sg(context).getIdentifier(str, str2, AlY(context));
        }
        return context.getResources().getIdentifier(str, str2, AlY(context));
    }

    public static synchronized void tN(Context context) {
        synchronized (qO.class) {
            try {
                if (TextUtils.isEmpty(Sg)) {
                    return;
                }
                Resources resources = context.getResources();
                tN = new Resources(Sg(resources.getAssets(), Sg + "/apk/base-1.apk"), resources.getDisplayMetrics(), resources.getConfiguration());
                AlY = context.getPackageName();
                wN = true;
            } catch (Throwable th2) {
                Log.e("ResourceHelp", "makePluginResources failed", th2);
            }
        }
    }

    public static int AlY(Context context, String str) {
        try {
            return YFl(context, str, "drawable");
        } catch (Exception unused) {
            return 0;
        }
    }

    private static AssetManager Sg(AssetManager assetManager, String str) {
        AssetManager assetManager2;
        try {
            if (assetManager.getClass().getName().equals("android.content.res.BaiduAssetManager")) {
                assetManager2 = (AssetManager) Class.forName("android.content.res.BaiduAssetManager").getConstructor(new Class[0]).newInstance(new Object[0]);
            } else {
                assetManager2 = (AssetManager) AssetManager.class.newInstance();
            }
            YFl(assetManager2, str);
            assetManager = assetManager2;
        } catch (Exception unused) {
            YFl(assetManager, str);
        }
        try {
            UZM.YFl(assetManager, "ensureStringBlocks", new Object[0]);
        } catch (Exception unused2) {
        }
        return assetManager;
    }

    public static String YFl(Context context, String str) {
        return Sg(context).getString(Sg(context, str));
    }

    public static boolean YFl(AssetManager assetManager, String str) {
        Method YFl2 = UZM.YFl((Class<?>) AssetManager.class, "addAssetPath", (Class<?>[]) new Class[]{String.class});
        if (YFl2 == null) {
            YFl2 = UZM.YFl((Class<?>) AssetManager.class, "addAssetPath", (Class<?>[]) new Class[]{String.class});
        }
        if (YFl2 != null) {
            int i10 = 3;
            while (true) {
                int i11 = i10 - 1;
                if (i10 < 0) {
                    break;
                }
                if (((Integer) YFl2.invoke(assetManager, str)).intValue() != 0) {
                    return true;
                }
                i10 = i11;
            }
        }
        return false;
    }
}
