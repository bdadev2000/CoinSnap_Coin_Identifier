package com.bytedance.sdk.openadsdk.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Picture;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class WNy {
    private static int COT = -1;
    private static WindowManager HWF = null;
    private static float KS = -1.0f;
    private static float QR = -1.0f;
    private static final Object YW = new Object();
    private static int jU = -1;
    private static Boolean ku = null;
    private static int lMd = -1;
    private static float zp = -1.0f;

    public static boolean Bj(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", null).invoke(loadClass, null)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static float COT(Context context) {
        zp(context, true);
        return zp;
    }

    public static float HWF(Context context) {
        zp(context);
        return KS;
    }

    public static int KS(Context context, float f9) {
        zp(context, true);
        float COT2 = COT(context);
        if (COT2 <= 0.0f) {
            COT2 = 1.0f;
        }
        return (int) ((f9 / COT2) + 0.5f);
    }

    public static int QR(Context context) {
        zp(context);
        return lMd;
    }

    public static int YW(Context context) {
        return ((Integer) ku(context).second).intValue();
    }

    public static boolean dQp(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static int dT(Context context) {
        return ((Integer) ku(context).first).intValue();
    }

    public static int jU(Context context) {
        zp(context);
        return COT;
    }

    public static Pair<Integer, Integer> ku(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.KVG.zp();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new Pair<>(Integer.valueOf(point.x), Integer.valueOf(point.y));
    }

    public static boolean rV(Context context) {
        String str;
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            if (identifier > 0) {
                str = resources.getString(identifier);
            } else {
                str = null;
            }
            if (str != null) {
                if (!TextUtils.isEmpty(str)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean tG(Context context) {
        String str = Build.MODEL;
        if (!str.equals("IN2010") && !str.equals("IN2020") && !str.equals("KB2000") && !str.startsWith("ONEPLUS")) {
            return false;
        }
        return true;
    }

    public static boolean vDp(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) loadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(loadClass, 32)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    private static boolean zp(int i9) {
        return i9 == 0 || i9 == 8 || i9 == 4;
    }

    private static boolean lMd() {
        return zp < 0.0f || lMd < 0 || KS < 0.0f || jU < 0 || COT < 0;
    }

    public static void zp(Context context) {
        zp(context, false);
    }

    public static void COT(View view) {
        if (view == null) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.WNy.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                View view2 = (View) weakReference.get();
                if (view2 != null) {
                    WNy.zp(view2, 8);
                    view2.setAlpha(1.0f);
                }
            }
        });
        ofFloat.setDuration(800L);
        ofFloat.start();
    }

    public static void HWF(View view) {
        if (view == null) {
            return;
        }
        zp(view, 0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.WNy.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                onAnimationEnd(animator);
            }
        });
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    public static int KS(Context context) {
        zp(context);
        return jU;
    }

    public static boolean jU(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static int lMd(Context context, float f9) {
        return Float.valueOf(zp(context, f9, true)).intValue();
    }

    public static void zp(Context context, boolean z8) {
        Context zp2 = context == null ? com.bytedance.sdk.openadsdk.core.KVG.zp() : context;
        if (zp2 == null) {
            return;
        }
        HWF = (WindowManager) zp2.getSystemService("window");
        if (lMd() || z8) {
            DisplayMetrics displayMetrics = zp2.getResources().getDisplayMetrics();
            zp = displayMetrics.density;
            lMd = displayMetrics.densityDpi;
            KS = displayMetrics.scaledDensity;
            jU = displayMetrics.widthPixels;
            COT = displayMetrics.heightPixels;
        }
        if (context == null || context.getResources() == null || context.getResources().getConfiguration() == null) {
            return;
        }
        if (context.getResources().getConfiguration().orientation == 1) {
            int i9 = jU;
            int i10 = COT;
            if (i9 > i10) {
                jU = i10;
                COT = i9;
                return;
            }
            return;
        }
        int i11 = jU;
        int i12 = COT;
        if (i11 < i12) {
            jU = i12;
            COT = i11;
        }
    }

    public static boolean jU(Activity activity) {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        try {
            WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
            return (rootWindowInsets != null ? rootWindowInsets.getDisplayCutout() : null) != null;
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.zp("UIUtils", e4.getMessage());
            return false;
        }
    }

    public static int[] lMd(Context context) {
        if (context == null) {
            return null;
        }
        if (HWF == null) {
            HWF = (WindowManager) com.bytedance.sdk.openadsdk.core.KVG.zp().getSystemService("window");
        }
        int[] iArr = new int[2];
        WindowManager windowManager = HWF;
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i9 = displayMetrics.widthPixels;
            int i10 = displayMetrics.heightPixels;
            try {
                Point point = new Point();
                Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
                i9 = point.x;
                i10 = point.y;
            } catch (Exception unused) {
            }
            iArr[0] = i9;
            iArr[1] = i10;
        }
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            iArr[0] = displayMetrics2.widthPixels;
            iArr[1] = displayMetrics2.heightPixels;
        }
        return iArr;
    }

    @Nullable
    public static int[] KS(View view) {
        if (view != null) {
            return new int[]{view.getWidth(), view.getHeight()};
        }
        return null;
    }

    public static boolean KS(Activity activity) {
        if (ku == null) {
            synchronized (YW) {
                try {
                    if (ku == null) {
                        boolean z8 = true;
                        if (!jU(activity) && zp("ro.miui.notch", activity) != 1 && !Bj(activity) && !dQp(activity) && !vDp(activity) && !tG(activity) && !rV(activity)) {
                            z8 = false;
                        }
                        ku = Boolean.valueOf(z8);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ku.booleanValue();
    }

    public static int zp(Context context, float f9) {
        zp(context);
        float HWF2 = HWF(context);
        if (HWF2 <= 0.0f) {
            HWF2 = 1.0f;
        }
        return (int) ((f9 / HWF2) + 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void KS(com.bytedance.sdk.openadsdk.core.model.woN won, String str, String str2, Bitmap bitmap, String str3, long j7) {
        JSONObject jSONObject;
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                    int zp2 = zp(bitmap);
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("url", str3);
                        if (j7 != -1) {
                            jSONObject2.put("page_id", j7);
                        }
                        jSONObject2.put("render_type", "h5");
                        jSONObject2.put("render_type_2", 0);
                        jSONObject2.put("is_blank", zp2 == 100 ? 1 : 0);
                        jSONObject2.put("is_playable", com.bytedance.sdk.openadsdk.core.model.cz.lMd(won) ? 1 : 0);
                        jSONObject2.put("usecache", com.bytedance.sdk.openadsdk.core.video.lMd.zp.zp().zp(won) ? 1 : 0);
                        jSONObject = new JSONObject();
                        try {
                            jSONObject.put("ad_extra_data", jSONObject2.toString());
                        } catch (JSONException unused) {
                        }
                    } catch (JSONException unused2) {
                        jSONObject = null;
                    }
                    com.bytedance.sdk.openadsdk.lMd.KS.KS(won, str, str2, jSONObject);
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.tG.zp("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>".concat(String.valueOf(th)));
            }
        }
    }

    public static float zp(Context context, float f9, boolean z8) {
        zp(context);
        return (COT(context) * f9) + (z8 ? 0.5f : 0.0f);
    }

    public static int[] lMd(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static void zp(View view, int i9, int i10, int i11, int i12) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.top -= i9;
        rect.bottom += i10;
        rect.left -= i11;
        rect.right += i12;
        ((View) view.getParent()).setTouchDelegate(new com.bytedance.sdk.component.utils.QR(rect, view));
    }

    public static void lMd(View view, int i9, int i10, int i11, int i12) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        zp(view, (ViewGroup.MarginLayoutParams) layoutParams, i9, i10, i11, i12);
    }

    public static void lMd(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(1792);
            activity.getWindow().clearFlags(1792);
        } catch (Exception unused) {
        }
    }

    private static Bitmap lMd(SSWebView sSWebView) {
        if (sSWebView == null) {
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(sSWebView.getWidth(), sSWebView.getHeight(), Bitmap.Config.RGB_565);
            sSWebView.draw(new Canvas(createBitmap));
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static int[] zp(View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static void zp(View view, int i9) {
        if (view == null || view.getVisibility() == i9 || !zp(i9)) {
            return;
        }
        view.setVisibility(i9);
    }

    private static ArrayList<Integer> lMd(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i9 = width * height;
            int[] iArr = new int[i9];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i10 = 0; i10 < i9; i10++) {
                int i11 = iArr[i10];
                arrayList.add(Integer.valueOf(Color.rgb((16711680 & i11) >> 16, (65280 & i11) >> 8, i11 & 255)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zp(TextView textView, CharSequence charSequence) {
        if (textView == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    private static void zp(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i9, int i10, int i11, int i12) {
        if (view == null || marginLayoutParams == null) {
            return;
        }
        if (marginLayoutParams.leftMargin == i9 && marginLayoutParams.topMargin == i10 && marginLayoutParams.rightMargin == i11 && marginLayoutParams.bottomMargin == i12) {
            return;
        }
        if (i9 != -3) {
            marginLayoutParams.leftMargin = i9;
        }
        if (i10 != -3) {
            marginLayoutParams.topMargin = i10;
        }
        if (i11 != -3) {
            marginLayoutParams.rightMargin = i11;
        }
        if (i12 != -3) {
            marginLayoutParams.bottomMargin = i12;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    public static void lMd(View view, final float f9) {
        if (view != null && f9 > 0.0f) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.utils.WNy.4
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    if (outline == null) {
                        return;
                    }
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f9);
                }
            });
            view.setClipToOutline(true);
        }
    }

    private static Bitmap zp(WebView webView) {
        Bitmap bitmap = null;
        try {
            Picture capturePicture = webView.capturePicture();
            bitmap = Bitmap.createBitmap(capturePicture.getWidth(), capturePicture.getHeight(), Bitmap.Config.ARGB_8888);
            capturePicture.draw(new Canvas(bitmap));
            return bitmap;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("UIUtils", th.getMessage());
            return bitmap;
        }
    }

    public static float zp() {
        float f9 = QR;
        if (f9 > 0.0f) {
            return f9;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.KVG.zp().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0.0f;
        }
        float dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        QR = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public static void zp(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(3846);
            activity.getWindow().addFlags(1792);
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.zp("UIUtils", e4.getMessage());
        }
    }

    public static int zp(String str, Activity activity) {
        if (!yRU.COT()) {
            return 0;
        }
        try {
            Class<?> loadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
            return ((Integer) loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, new String(str), 0)).intValue();
        } catch (ClassNotFoundException e4) {
            com.bytedance.sdk.component.utils.tG.zp("UIUtils", e4.getMessage());
            return 0;
        } catch (IllegalAccessException e9) {
            com.bytedance.sdk.component.utils.tG.zp("UIUtils", e9.getMessage());
            return 0;
        } catch (IllegalArgumentException e10) {
            com.bytedance.sdk.component.utils.tG.zp("UIUtils", e10.getMessage());
            return 0;
        } catch (NoSuchMethodException e11) {
            com.bytedance.sdk.component.utils.tG.zp("UIUtils", e11.getMessage());
            return 0;
        } catch (InvocationTargetException e12) {
            com.bytedance.sdk.component.utils.tG.zp("UIUtils", e12.getMessage());
            return 0;
        }
    }

    public static void zp(View view, View.OnClickListener onClickListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.tG.zp("OnclickListener ", str + " is null , can not set OnClickListener !!!");
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    public static void zp(View view, View.OnTouchListener onTouchListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.tG.zp("OnTouchListener ", str + " is null , can not set OnTouchListener !!!");
            return;
        }
        view.setOnTouchListener(onTouchListener);
    }

    public static void zp(View view, float f9) {
        if (view == null) {
            return;
        }
        view.setAlpha(f9);
    }

    public static void zp(TextView textView, TTRatingBar2 tTRatingBar2, com.bytedance.sdk.openadsdk.core.model.woN won) {
        zp(textView, tTRatingBar2, (won == null || won.Vjb() == null) ? -1.0d : won.Vjb().jU());
    }

    public static void zp(TextView textView, TTRatingBar2 tTRatingBar2, double d2) {
        if (d2 == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            tTRatingBar2.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%.1f", Double.valueOf(d2)));
            }
            zp(tTRatingBar2, d2, 0, 14);
        }
    }

    public static void zp(TTRatingBar2 tTRatingBar2, double d2, int i9, int i10) {
        if (d2 < 0.0d) {
            tTRatingBar2.setVisibility(8);
        } else {
            tTRatingBar2.setVisibility(0);
            tTRatingBar2.zp(d2, i9, i10);
        }
    }

    public static void zp(TextView textView, com.bytedance.sdk.openadsdk.core.model.woN won, Context context, String str) {
        zp(textView, won.Vjb() != null ? won.Vjb().COT() : -1, context, str);
    }

    public static void zp(TextView textView, int i9, Context context, String str) {
        String valueOf;
        String zp2 = com.bytedance.sdk.component.utils.cz.zp(context, str);
        if (i9 > 10000) {
            valueOf = (i9 / 1000) + CampaignEx.JSON_KEY_AD_K;
        } else {
            valueOf = String.valueOf(i9);
        }
        textView.setText(String.format(zp2, valueOf));
        if (i9 == -1) {
            textView.setVisibility(8);
        }
    }

    public static Bitmap zp(SSWebView sSWebView) {
        WebView webView = sSWebView.getWebView();
        int layerType = webView.getLayerType();
        webView.setLayerType(1, null);
        Bitmap lMd2 = lMd(sSWebView);
        if (lMd2 == null) {
            lMd2 = zp(webView);
        }
        webView.setLayerType(layerType, null);
        if (lMd2 == null) {
            return null;
        }
        return com.bytedance.sdk.component.utils.jU.zp(lMd2, lMd2.getWidth() / 6, lMd2.getHeight() / 6);
    }

    public static void zp(final com.bytedance.sdk.openadsdk.core.model.woN won, final String str, final String str2, final Bitmap bitmap, final String str3, final long j7) {
        QUv.lMd(new com.bytedance.sdk.component.ku.ku("startCheckPlayableStatusPercentage") { // from class: com.bytedance.sdk.openadsdk.utils.WNy.3
            @Override // java.lang.Runnable
            public void run() {
                WNy.KS(won, str, str2, bitmap, str3, j7);
            }
        }, 10);
    }

    public static int zp(Bitmap bitmap) {
        try {
            ArrayList<Integer> lMd2 = lMd(bitmap);
            if (lMd2 == null) {
                return -1;
            }
            HashMap hashMap = new HashMap();
            Iterator<Integer> it = lMd2.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (hashMap.containsKey(next)) {
                    Integer valueOf = Integer.valueOf(((Integer) hashMap.get(next)).intValue() + 1);
                    hashMap.remove(next);
                    hashMap.put(next, valueOf);
                } else {
                    hashMap.put(next, 1);
                }
            }
            int i9 = 0;
            int i10 = 0;
            for (Map.Entry entry : hashMap.entrySet()) {
                int intValue = ((Integer) entry.getValue()).intValue();
                if (i10 < intValue) {
                    i9 = ((Integer) entry.getKey()).intValue();
                    i10 = intValue;
                }
            }
            if (i9 == 0) {
                return -1;
            }
            return (int) ((i10 / ((bitmap.getWidth() * bitmap.getHeight()) * 1.0f)) * 100.0f);
        } catch (Throwable unused) {
            return -1;
        }
    }
}
