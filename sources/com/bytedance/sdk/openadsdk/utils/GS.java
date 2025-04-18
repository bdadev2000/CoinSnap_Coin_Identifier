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
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.Nullable;
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
public class GS {
    private static int AlY = -1;
    private static float DSW = -1.0f;
    private static final Object NjR = new Object();
    private static int Sg = -1;
    private static float YFl = -1.0f;
    private static Boolean qsH = null;
    private static float tN = -1.0f;

    /* renamed from: vc, reason: collision with root package name */
    private static WindowManager f10828vc = null;
    private static int wN = -1;

    public static int AlY(Context context, float f10) {
        YFl(context, true);
        float wN2 = wN(context);
        if (wN2 <= 0.0f) {
            wN2 = 1.0f;
        }
        return (int) ((f10 / wN2) + 0.5f);
    }

    public static int DSW(Context context) {
        YFl(context);
        return Sg;
    }

    public static boolean EH(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static boolean GA(Context context) {
        String str = Build.MODEL;
        if (!str.equals("IN2010") && !str.equals("IN2020") && !str.equals("KB2000") && !str.startsWith("ONEPLUS")) {
            return false;
        }
        return true;
    }

    public static int NjR(Context context) {
        return ((Integer) qsH(context).second).intValue();
    }

    private static boolean YFl(int i10) {
        return i10 == 0 || i10 == 8 || i10 == 4;
    }

    public static boolean YoT(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) loadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(loadClass, 32)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static boolean eT(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static int nc(Context context) {
        return ((Integer) qsH(context).first).intValue();
    }

    public static boolean pDU(Context context) {
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

    public static Pair<Integer, Integer> qsH(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.lG.YFl();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new Pair<>(Integer.valueOf(point.x), Integer.valueOf(point.y));
    }

    public static int tN(Context context, float f10) {
        return Float.valueOf(YFl(context, f10, true)).intValue();
    }

    public static float vc(Context context) {
        YFl(context);
        return tN;
    }

    public static float wN(Context context) {
        YFl(context, true);
        return YFl;
    }

    private static boolean Sg() {
        return YFl < 0.0f || Sg < 0 || tN < 0.0f || AlY < 0 || wN < 0;
    }

    public static void YFl(Context context) {
        YFl(context, false);
    }

    public static int tN(Context context) {
        YFl(context);
        return AlY;
    }

    public static int AlY(Context context) {
        YFl(context);
        return wN;
    }

    public static void DSW(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static int Sg(Context context, float f10) {
        YFl(context);
        float vc2 = vc(context);
        if (vc2 <= 0.0f) {
            vc2 = 1.0f;
        }
        return (int) ((f10 / vc2) + 0.5f);
    }

    public static void YFl(Context context, boolean z10) {
        Context YFl2 = context == null ? com.bytedance.sdk.openadsdk.core.lG.YFl() : context;
        if (YFl2 == null) {
            return;
        }
        f10828vc = (WindowManager) YFl2.getSystemService("window");
        if (Sg() || z10) {
            DisplayMetrics displayMetrics = YFl2.getResources().getDisplayMetrics();
            YFl = displayMetrics.density;
            Sg = displayMetrics.densityDpi;
            tN = displayMetrics.scaledDensity;
            AlY = displayMetrics.widthPixels;
            wN = displayMetrics.heightPixels;
        }
        if (context == null || context.getResources() == null || context.getResources().getConfiguration() == null) {
            return;
        }
        if (context.getResources().getConfiguration().orientation == 1) {
            int i10 = AlY;
            int i11 = wN;
            if (i10 > i11) {
                AlY = i11;
                wN = i10;
                return;
            }
            return;
        }
        int i12 = AlY;
        int i13 = wN;
        if (i12 < i13) {
            AlY = i13;
            wN = i12;
        }
    }

    public static void vc(View view) {
        if (view == null) {
            return;
        }
        YFl(view, 0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.GS.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                onAnimationEnd(animator);
            }
        });
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    public static void wN(View view) {
        if (view == null) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.GS.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                View view2 = (View) weakReference.get();
                if (view2 != null) {
                    GS.YFl(view2, 8);
                    view2.setAlpha(1.0f);
                }
            }
        });
        ofFloat.setDuration(800L);
        ofFloat.start();
    }

    @Nullable
    public static int[] tN(View view) {
        if (view != null) {
            return new int[]{view.getWidth(), view.getHeight()};
        }
        return null;
    }

    public static boolean AlY(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static int[] Sg(Context context) {
        if (context == null) {
            return null;
        }
        if (f10828vc == null) {
            f10828vc = (WindowManager) com.bytedance.sdk.openadsdk.core.lG.YFl().getSystemService("window");
        }
        int[] iArr = new int[2];
        WindowManager windowManager = f10828vc;
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i10 = displayMetrics.widthPixels;
            int i11 = displayMetrics.heightPixels;
            try {
                Point point = new Point();
                Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
                i10 = point.x;
                i11 = point.y;
            } catch (Exception unused) {
            }
            iArr[0] = i10;
            iArr[1] = i11;
        }
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            iArr[0] = displayMetrics2.widthPixels;
            iArr[1] = displayMetrics2.heightPixels;
        }
        return iArr;
    }

    public static boolean AlY(Activity activity) {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        try {
            WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
            return (rootWindowInsets != null ? rootWindowInsets.getDisplayCutout() : null) != null;
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("UIUtils", e2.getMessage());
            return false;
        }
    }

    public static boolean tN(Activity activity) {
        if (qsH == null) {
            synchronized (NjR) {
                if (qsH == null) {
                    boolean z10 = true;
                    if (!AlY(activity) && YFl("ro.miui.notch", activity) != 1 && !eT(activity) && !EH(activity) && !YoT(activity) && !GA(activity) && !pDU(activity)) {
                        z10 = false;
                    }
                    qsH = Boolean.valueOf(z10);
                }
            }
        }
        return qsH.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void tN(final com.bytedance.sdk.openadsdk.core.model.Wwa wwa, String str, String str2, final Bitmap bitmap, final String str3, final long j3) {
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                    com.bytedance.sdk.openadsdk.AlY.tN.YFl(System.currentTimeMillis(), wwa, str, str2, new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.utils.GS.4
                        @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
                        public JSONObject YFl() {
                            int i10;
                            int i11;
                            try {
                                int YFl2 = GS.YFl(bitmap);
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("url", str3);
                                long j10 = j3;
                                if (j10 != -1) {
                                    jSONObject.put("page_id", j10);
                                }
                                jSONObject.put("render_type", "h5");
                                int i12 = 0;
                                jSONObject.put("render_type_2", 0);
                                if (YFl2 == 100) {
                                    i10 = 1;
                                } else {
                                    i10 = 0;
                                }
                                jSONObject.put("is_blank", i10);
                                if (com.bytedance.sdk.openadsdk.core.model.Ne.Sg(wwa)) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                jSONObject.put("is_playable", i11);
                                if (com.bytedance.sdk.openadsdk.core.GA.tN.YFl.YFl().YFl(wwa)) {
                                    i12 = 1;
                                }
                                jSONObject.put("usecache", i12);
                                JSONObject jSONObject2 = new JSONObject();
                                try {
                                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                                    return jSONObject2;
                                } catch (JSONException unused) {
                                    return jSONObject2;
                                }
                            } catch (JSONException unused2) {
                                return null;
                            }
                        }
                    });
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.YoT.YFl("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>".concat(String.valueOf(th2)));
            }
        }
    }

    public static int[] Sg(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static float YFl(Context context, float f10) {
        YFl(context);
        return vc(context) * f10;
    }

    public static void Sg(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(1792);
            activity.getWindow().clearFlags(1792);
        } catch (Exception unused) {
        }
    }

    public static float YFl(Context context, float f10, boolean z10) {
        YFl(context);
        return (wN(context) * f10) + (z10 ? 0.5f : 0.0f);
    }

    private static Bitmap Sg(com.bytedance.sdk.component.NjR.AlY alY) {
        if (alY == null) {
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(alY.getWidth(), alY.getHeight(), Bitmap.Config.RGB_565);
            alY.draw(new Canvas(createBitmap));
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static int[] YFl(View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static void YFl(View view, int i10) {
        if (view == null || view.getVisibility() == i10 || !YFl(i10)) {
            return;
        }
        view.setVisibility(i10);
    }

    public static void YFl(TextView textView, CharSequence charSequence) {
        if (textView == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    private static ArrayList<Integer> Sg(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i10 = width * height;
            int[] iArr = new int[i10];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = iArr[i11];
                arrayList.add(Integer.valueOf(Color.rgb((16711680 & i12) >> 16, (65280 & i12) >> 8, i12 & 255)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void YFl(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        YFl(view, (ViewGroup.MarginLayoutParams) layoutParams, i10, i11, i12, i13);
    }

    private static void YFl(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, int i12, int i13) {
        if (view == null || marginLayoutParams == null) {
            return;
        }
        if (marginLayoutParams.leftMargin == i10 && marginLayoutParams.topMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.bottomMargin == i13) {
            return;
        }
        if (i10 != -3) {
            marginLayoutParams.leftMargin = i10;
        }
        if (i11 != -3) {
            marginLayoutParams.topMargin = i11;
        }
        if (i12 != -3) {
            marginLayoutParams.rightMargin = i12;
        }
        if (i13 != -3) {
            marginLayoutParams.bottomMargin = i13;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    public static void Sg(View view, final float f10) {
        if (view != null && f10 > 0.0f) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.utils.GS.5
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    if (outline == null) {
                        return;
                    }
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f10);
                }
            });
            view.setClipToOutline(true);
        }
    }

    private static Bitmap YFl(WebView webView) {
        Bitmap bitmap = null;
        try {
            Picture capturePicture = webView.capturePicture();
            bitmap = Bitmap.createBitmap(capturePicture.getWidth(), capturePicture.getHeight(), Bitmap.Config.ARGB_8888);
            capturePicture.draw(new Canvas(bitmap));
            return bitmap;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("UIUtils", th2.getMessage());
            return bitmap;
        }
    }

    public static float YFl() {
        float f10 = DSW;
        if (f10 > 0.0f) {
            return f10;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.lG.YFl().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0.0f;
        }
        float dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        DSW = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public static void YFl(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(3846);
            activity.getWindow().addFlags(1792);
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("UIUtils", e2.getMessage());
        }
    }

    public static int YFl(String str, Activity activity) {
        if (!bZ.wN()) {
            return 0;
        }
        try {
            Class<?> loadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
            return ((Integer) loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, new String(str), 0)).intValue();
        } catch (ClassNotFoundException e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("UIUtils", e2.getMessage());
            return 0;
        } catch (IllegalAccessException e10) {
            com.bytedance.sdk.component.utils.YoT.YFl("UIUtils", e10.getMessage());
            return 0;
        } catch (IllegalArgumentException e11) {
            com.bytedance.sdk.component.utils.YoT.YFl("UIUtils", e11.getMessage());
            return 0;
        } catch (NoSuchMethodException e12) {
            com.bytedance.sdk.component.utils.YoT.YFl("UIUtils", e12.getMessage());
            return 0;
        } catch (InvocationTargetException e13) {
            com.bytedance.sdk.component.utils.YoT.YFl("UIUtils", e13.getMessage());
            return 0;
        }
    }

    public static void YFl(View view, View.OnClickListener onClickListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.YoT.YFl("OnclickListener ", str + " is null , can not set OnClickListener !!!");
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    public static void YFl(View view, View.OnTouchListener onTouchListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.YoT.YFl("OnTouchListener ", str + " is null , can not set OnTouchListener !!!");
            return;
        }
        view.setOnTouchListener(onTouchListener);
    }

    public static void YFl(View view, float f10) {
        if (view == null) {
            return;
        }
        view.setAlpha(f10);
    }

    public static void YFl(TextView textView, com.bytedance.sdk.openadsdk.core.widget.rkt rktVar, com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        YFl(textView, rktVar, wwa, 14);
    }

    public static void YFl(TextView textView, com.bytedance.sdk.openadsdk.core.widget.rkt rktVar, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, int i10) {
        YFl(textView, rktVar, (wwa == null || wwa.in() == null) ? -1.0d : wwa.in().AlY(), i10);
    }

    public static void YFl(TextView textView, com.bytedance.sdk.openadsdk.core.widget.rkt rktVar, double d10, int i10) {
        if (d10 == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            rktVar.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%.1f", Double.valueOf(d10)));
            }
            YFl(rktVar, d10, i10);
        }
    }

    public static void YFl(com.bytedance.sdk.openadsdk.core.widget.rkt rktVar, double d10, int i10) {
        if (d10 < 0.0d) {
            rktVar.setVisibility(8);
        } else {
            rktVar.setVisibility(0);
            rktVar.YFl(d10, i10);
        }
    }

    public static Bitmap YFl(com.bytedance.sdk.component.NjR.AlY alY) {
        WebView webView = alY.getWebView();
        int layerType = webView.getLayerType();
        webView.setLayerType(1, null);
        Bitmap Sg2 = Sg(alY);
        if (Sg2 == null) {
            Sg2 = YFl(webView);
        }
        webView.setLayerType(layerType, null);
        if (Sg2 == null) {
            return null;
        }
        return com.bytedance.sdk.component.utils.AlY.YFl(Sg2, Sg2.getWidth() / 6, Sg2.getHeight() / 6);
    }

    public static void YFl(final com.bytedance.sdk.openadsdk.core.model.Wwa wwa, final String str, final String str2, final Bitmap bitmap, final String str3, final long j3) {
        mn.Sg(new com.bytedance.sdk.component.qsH.qsH("startCheckPlayableStatusPercentage") { // from class: com.bytedance.sdk.openadsdk.utils.GS.3
            @Override // java.lang.Runnable
            public void run() {
                GS.tN(wwa, str, str2, bitmap, str3, j3);
            }
        }, 10);
    }

    public static int YFl(Bitmap bitmap) {
        try {
            ArrayList<Integer> Sg2 = Sg(bitmap);
            if (Sg2 == null) {
                return -1;
            }
            HashMap hashMap = new HashMap();
            Iterator<Integer> it = Sg2.iterator();
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
            int i10 = 0;
            int i11 = 0;
            for (Map.Entry entry : hashMap.entrySet()) {
                int intValue = ((Integer) entry.getValue()).intValue();
                if (i11 < intValue) {
                    i10 = ((Integer) entry.getKey()).intValue();
                    i11 = intValue;
                }
            }
            if (i10 == 0) {
                return -1;
            }
            return (int) ((i11 / ((bitmap.getWidth() * bitmap.getHeight()) * 1.0f)) * 100.0f);
        } catch (Throwable unused) {
            return -1;
        }
    }
}
