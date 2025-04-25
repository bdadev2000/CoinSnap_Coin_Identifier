package com.glority.base.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.UiModeManager;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import androidx.core.os.BundleKt;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.utils.device.DeviceUtils;
import com.glority.utils.stability.LogUtils;
import com.google.gson.Gson;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: DeviceLevelUtils.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001c\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\"\u0010\u0011\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0012\u0010\u0015\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0016\u001a\u00020\tH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/glority/base/utils/DeviceLevelUtils;", "Landroid/opengl/GLSurfaceView$Renderer;", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "bindGLSurfaceView", "", "view", "Landroid/opengl/GLSurfaceView;", "onSurfaceCreated", "gl", "Ljavax/microedition/khronos/opengles/GL10;", "config", "Ljavax/microedition/khronos/egl/EGLConfig;", "onSurfaceChanged", "width", "", "height", "onDrawFrame", "logDeviceInfo", "Companion", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class DeviceLevelUtils implements GLSurfaceView.Renderer {
    private static final String ADRENO = "Adreno";
    private static final String MALI = "Mali";
    private static final String PowerVR = "PowerVR Rogue";
    private static final String Samsung_Xclipse = "Samsung Xclipse";
    private static String glRenderer = null;
    public static final float qcom765G = 37.0f;
    public static final float qcom778G = 56.5f;
    public static final float qcom855 = 69.0f;
    private final Activity activity;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final float defaultScore = 40.0f;

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl) {
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl, int width, int height) {
    }

    public DeviceLevelUtils(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
    }

    public final Activity getActivity() {
        return this.activity;
    }

    /* compiled from: DeviceLevelUtils.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J3\u0010\u001a\u001a\u0004\u0018\u00010\n2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002¢\u0006\u0002\u0010!J)\u0010\"\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0$j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n`#H\u0002¢\u0006\u0002\u0010%R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/glority/base/utils/DeviceLevelUtils$Companion;", "", "<init>", "()V", "ADRENO", "", "MALI", "PowerVR", "Samsung_Xclipse", "qcom855", "", "qcom765G", "qcom778G", "defaultScore", "glRenderer", "eligibleDevice", "", "minScore", "isLowMemory", "context", "Landroid/content/Context;", "adrenoParser", "gpu", "maliParser", "powerVRParser", "samsungXclipseParser", "getValue", "data", "", "reg", "Lkotlin/text/Regex;", "currentModel", "", "(Ljava/util/Map;Lkotlin/text/Regex;I)Ljava/lang/Float;", "gpuRanking", "Lkotlin/collections/LinkedHashMap;", "Ljava/util/LinkedHashMap;", "()Ljava/util/LinkedHashMap;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean eligibleDevice(float minScore) {
            try {
                String str = DeviceLevelUtils.glRenderer;
                if (str == null || !StringsKt.startsWith$default(str, DeviceLevelUtils.ADRENO, false, 2, (Object) null)) {
                    String str2 = DeviceLevelUtils.glRenderer;
                    if (str2 == null || !StringsKt.startsWith$default(str2, DeviceLevelUtils.MALI, false, 2, (Object) null)) {
                        String str3 = DeviceLevelUtils.glRenderer;
                        if (str3 == null || !StringsKt.startsWith$default(str3, DeviceLevelUtils.PowerVR, false, 2, (Object) null)) {
                            String str4 = DeviceLevelUtils.glRenderer;
                            if (str4 != null && StringsKt.startsWith$default(str4, DeviceLevelUtils.Samsung_Xclipse, false, 2, (Object) null)) {
                                String str5 = DeviceLevelUtils.glRenderer;
                                Intrinsics.checkNotNull(str5);
                                if (samsungXclipseParser(str5) >= minScore) {
                                    return true;
                                }
                            } else if (DeviceLevelUtils.defaultScore >= minScore) {
                                return true;
                            }
                        } else {
                            String str6 = DeviceLevelUtils.glRenderer;
                            Intrinsics.checkNotNull(str6);
                            if (powerVRParser(str6) >= minScore) {
                                return true;
                            }
                        }
                    } else {
                        String str7 = DeviceLevelUtils.glRenderer;
                        Intrinsics.checkNotNull(str7);
                        if (maliParser(str7) >= minScore) {
                            return true;
                        }
                    }
                } else {
                    String str8 = DeviceLevelUtils.glRenderer;
                    Intrinsics.checkNotNull(str8);
                    if (adrenoParser(str8) >= minScore) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable unused) {
                return DeviceLevelUtils.defaultScore >= minScore;
            }
        }

        public final boolean isLowMemory(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                Object systemService = context.getSystemService("activity");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
                return memoryInfo.lowMemory || ((double) (((float) memoryInfo.availMem) / 1.0E9f)) < 0.8d;
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
                return false;
            }
        }

        private final float adrenoParser(String gpu) {
            String value;
            Integer intOrNull;
            Float f = gpuRanking().get(StringsKt.replace$default(gpu, "(TM) ", "", false, 4, (Object) null));
            if (f != null) {
                return f.floatValue();
            }
            Regex regex = new Regex("[0-9]+");
            MatchResult find$default = Regex.find$default(regex, gpu, 0, 2, null);
            if (find$default == null || (value = find$default.getValue()) == null || (intOrNull = StringsKt.toIntOrNull(value)) == null) {
                return 100.0f;
            }
            int intValue = intOrNull.intValue();
            LinkedHashMap<String, Float> gpuRanking = gpuRanking();
            Map<String, Float> linkedHashMap = new LinkedHashMap<>();
            for (Map.Entry<String, Float> entry : gpuRanking.entrySet()) {
                if (StringsKt.startsWith$default(entry.getKey(), DeviceLevelUtils.ADRENO, false, 2, (Object) null)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Float value2 = getValue(linkedHashMap, regex, intValue);
            if (value2 != null) {
                return value2.floatValue();
            }
            return 100.0f;
        }

        private final float maliParser(String gpu) {
            String value;
            Integer intOrNull;
            Float f = gpuRanking().get(gpu);
            if (f != null) {
                return f.floatValue();
            }
            String str = gpu;
            String str2 = (String) CollectionsKt.firstOrNull(StringsKt.split$default((CharSequence) str, new String[]{" "}, false, 0, 6, (Object) null));
            if (str2 == null) {
                return 100.0f;
            }
            LinkedHashMap<String, Float> gpuRanking = gpuRanking();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Float> entry : gpuRanking.entrySet()) {
                if (StringsKt.startsWith$default(entry.getKey(), str2, false, 2, (Object) null)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (!linkedHashMap.isEmpty()) {
                LinkedHashMap<String, Float> gpuRanking2 = gpuRanking();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, Float> entry2 : gpuRanking2.entrySet()) {
                    if (StringsKt.startsWith$default(entry2.getKey(), str2, false, 2, (Object) null)) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                return (float) CollectionsKt.averageOfFloat(linkedHashMap2.values());
            }
            Regex regex = new Regex("[0-9]");
            MatchResult find$default = Regex.find$default(regex, str, 0, 2, null);
            if (find$default == null || (value = find$default.getValue()) == null || (intOrNull = StringsKt.toIntOrNull(value)) == null) {
                return 100.0f;
            }
            int intValue = intOrNull.intValue();
            LinkedHashMap<String, Float> gpuRanking3 = gpuRanking();
            Map<String, Float> linkedHashMap3 = new LinkedHashMap<>();
            for (Map.Entry<String, Float> entry3 : gpuRanking3.entrySet()) {
                if (StringsKt.startsWith$default(entry3.getKey(), DeviceLevelUtils.MALI, false, 2, (Object) null)) {
                    linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                }
            }
            Float value2 = getValue(linkedHashMap3, regex, intValue);
            if (value2 != null) {
                return value2.floatValue();
            }
            return 100.0f;
        }

        private final float powerVRParser(String gpu) {
            Object obj;
            Set<String> keySet = gpuRanking().keySet();
            Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
            Iterator<T> it = keySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (StringsKt.equals((String) obj, StringsKt.replace$default(gpu, "Rogue ", "", false, 4, (Object) null), true)) {
                    break;
                }
            }
            String str = (String) obj;
            if (str == null) {
                return 20.0f;
            }
            Float f = gpuRanking().get(str);
            Intrinsics.checkNotNull(f);
            return f.floatValue();
        }

        private final float samsungXclipseParser(String gpu) {
            Object obj;
            String value;
            Integer intOrNull;
            Set<String> keySet = gpuRanking().keySet();
            Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
            Iterator<T> it = keySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (StringsKt.equals((String) obj, gpu, true)) {
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                Float f = gpuRanking().get(str);
                Intrinsics.checkNotNull(f);
                return f.floatValue();
            }
            Regex regex = new Regex("[0-9]");
            MatchResult find$default = Regex.find$default(regex, gpu, 0, 2, null);
            if (find$default == null || (value = find$default.getValue()) == null || (intOrNull = StringsKt.toIntOrNull(value)) == null) {
                return 100.0f;
            }
            int intValue = intOrNull.intValue();
            LinkedHashMap<String, Float> gpuRanking = gpuRanking();
            Map<String, Float> linkedHashMap = new LinkedHashMap<>();
            for (Map.Entry<String, Float> entry : gpuRanking.entrySet()) {
                if (StringsKt.startsWith$default(entry.getKey(), DeviceLevelUtils.Samsung_Xclipse, false, 2, (Object) null)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Float value2 = getValue(linkedHashMap, regex, intValue);
            if (value2 != null) {
                return value2.floatValue();
            }
            return 100.0f;
        }

        private final Float getValue(Map<String, Float> data, Regex reg, int currentModel) {
            String value;
            String str = null;
            String str2 = null;
            for (String str3 : data.keySet()) {
                MatchResult find$default = Regex.find$default(reg, str3, 0, 2, null);
                Integer intOrNull = (find$default == null || (value = find$default.getValue()) == null) ? null : StringsKt.toIntOrNull(value);
                if (intOrNull != null) {
                    if (intOrNull.intValue() >= currentModel) {
                        str = str3;
                    }
                    if (intOrNull.intValue() <= currentModel && str2 == null) {
                        str2 = str3;
                    }
                }
            }
            if (str == null || str2 == null) {
                if (str != null) {
                    return data.get(str);
                }
                if (str2 != null) {
                    return data.get(str2);
                }
                return null;
            }
            Float f = data.get(str);
            Intrinsics.checkNotNull(f);
            float floatValue = f.floatValue();
            Float f2 = data.get(str2);
            Intrinsics.checkNotNull(f2);
            return Float.valueOf((floatValue + f2.floatValue()) / 2);
        }

        private final LinkedHashMap<String, Float> gpuRanking() {
            Pair pair = new Pair("Adreno 740", Float.valueOf(172.0f));
            Pair pair2 = new Pair("Mali-G710 MP10", Float.valueOf(167.0f));
            Pair pair3 = new Pair("Adreno 730", Float.valueOf(134.0f));
            Pair pair4 = new Pair("Samsung Xclipse 920", Float.valueOf(127.0f));
            Pair pair5 = new Pair("Mali-G78 MP22", Float.valueOf(112.0f));
            Pair pair6 = new Pair("Mali-G610 MP6", Float.valueOf(102.0f));
            Float valueOf = Float.valueOf(95.0f);
            Pair pair7 = new Pair("Adreno 660", valueOf);
            Pair pair8 = new Pair("Mali-G710 MP7", valueOf);
            Pair pair9 = new Pair("Adreno 650", Float.valueOf(88.0f));
            Pair pair10 = new Pair("Mali-G78 MP14", Float.valueOf(83.0f));
            Pair pair11 = new Pair("Mali-G77 MP11", Float.valueOf(80.0f));
            Pair pair12 = new Pair("Mali-G77 MP9", Float.valueOf(79.0f));
            Pair pair13 = new Pair("Adreno 640", Float.valueOf(69.0f));
            Float valueOf2 = Float.valueOf(65.0f);
            Pair pair14 = new Pair("Mali-G78 MP20", valueOf2);
            Pair pair15 = new Pair("Adreno 642", valueOf2);
            Pair pair16 = new Pair("Mali-G76 MP12", Float.valueOf(59.0f));
            Pair pair17 = new Pair("Adreno 630", Float.valueOf(58.0f));
            Pair pair18 = new Pair("Adreno 642L", Float.valueOf(56.5f));
            Pair pair19 = new Pair("Mali-G76 MP16", Float.valueOf(53.5f));
            Pair pair20 = new Pair("Mali-G57 MP5", Float.valueOf(52.0f));
            Pair pair21 = new Pair("Mali-G76 MP10", Float.valueOf(51.5f));
            Float valueOf3 = Float.valueOf(45.5f);
            Pair pair22 = new Pair("Mali-G72 MP18", valueOf3);
            Pair pair23 = new Pair("Mali-G57 MP6", valueOf3);
            Pair pair24 = new Pair("Mali-G71 MP20", Float.valueOf(42.0f));
            Pair pair25 = new Pair("Mali-G68 MP4", Float.valueOf(41.0f));
            Pair pair26 = new Pair("Adreno 540", Float.valueOf(40.0f));
            Float valueOf4 = Float.valueOf(38.5f);
            Pair pair27 = new Pair("Mali-G72 MP12", valueOf4);
            Pair pair28 = new Pair("NVIDIA Tegra X1 Maxwell GPU", valueOf4);
            Pair pair29 = new Pair("Adreno 620", Float.valueOf(37.0f));
            Float valueOf5 = Float.valueOf(34.0f);
            Pair pair30 = new Pair("Mali-G57 MP4", valueOf5);
            Pair pair31 = new Pair("Mali-G52 MP6", valueOf5);
            Pair pair32 = new Pair("Adreno 619", Float.valueOf(33.0f));
            Pair pair33 = new Pair("Adreno 530", Float.valueOf(31.0f));
            Float valueOf6 = Float.valueOf(30.0f);
            Pair pair34 = new Pair("Mali-G76 MP4", valueOf6);
            Pair pair35 = new Pair("Mali-G57 MP3", valueOf6);
            Pair pair36 = new Pair("Adreno 618", valueOf6);
            Pair pair37 = new Pair("Mali-T880 MP12", Float.valueOf(28.0f));
            Pair pair38 = new Pair("Adreno 619L", Float.valueOf(26.0f));
            Pair pair39 = new Pair("Mali-G57 MP2", Float.valueOf(25.0f));
            Float valueOf7 = Float.valueOf(23.0f);
            Pair pair40 = new Pair("Mali-G71 MP8", valueOf7);
            Pair pair41 = new Pair("Adreno 616", valueOf7);
            Pair pair42 = new Pair("NVIDIA Tegra K1 Kepler GPU", valueOf7);
            Pair pair43 = new Pair("PowerVR GXA6850", Float.valueOf(17.9f));
            Pair pair44 = new Pair("Adreno 430", Float.valueOf(17.0f));
            Float valueOf8 = Float.valueOf(15.0f);
            Pair pair45 = new Pair("Adreno 612", valueOf8);
            Pair pair46 = new Pair("Mali-G52 MP2", valueOf8);
            Pair pair47 = new Pair("Adreno 512", valueOf8);
            Pair pair48 = new Pair("PowerVR GM9446", Float.valueOf(14.5f));
            Pair pair49 = new Pair("Mali-G51 MP4", Float.valueOf(14.0f));
            Float valueOf9 = Float.valueOf(13.0f);
            Pair pair50 = new Pair("Mali-G72 MP3", valueOf9);
            Pair pair51 = new Pair("Adreno 610", valueOf9);
            Pair pair52 = new Pair("Mali-T760 MP8", valueOf9);
            Pair pair53 = new Pair("Intel HD Graphics (Cherry Trail)", Float.valueOf(11.0f));
            Float valueOf10 = Float.valueOf(10.0f);
            Pair pair54 = new Pair("Mali-T880 MP4", valueOf10);
            Pair pair55 = new Pair("Adreno 509", valueOf10);
            Pair pair56 = new Pair("Adreno 418", Float.valueOf(9.95f));
            Pair pair57 = new Pair("Adreno 508", Float.valueOf(9.7f));
            Pair pair58 = new Pair("Adreno 510", Float.valueOf(9.45f));
            Pair pair59 = new Pair("Mali-G52 MP1", Float.valueOf(9.4f));
            Pair pair60 = new Pair("Mali-G57 MP1", Float.valueOf(9.2f));
            Pair pair61 = new Pair("Mali-T830 MP3", Float.valueOf(9.1f));
            Pair pair62 = new Pair("PowerVR GX6250", Float.valueOf(7.5f));
            Pair pair63 = new Pair("PowerVR G6430", Float.valueOf(6.9f));
            Pair pair64 = new Pair("Mali-T880 MP2", Float.valueOf(6.8f));
            Pair pair65 = new Pair("Mali-G71 MP2", Float.valueOf(6.6f));
            Pair pair66 = new Pair("Adreno 506", Float.valueOf(6.4f));
            Pair pair67 = new Pair("PowerVR GE8320", Float.valueOf(6.3f));
            Pair pair68 = new Pair("PowerVR GE8322", Float.valueOf(6.1f));
            Pair pair69 = new Pair("Intel HD Graphics (Bay Trail)", Float.valueOf(5.2f));
            Pair pair70 = new Pair("Mali-T760 MP4", Float.valueOf(4.9f));
            Pair pair71 = new Pair("Adreno 505", Float.valueOf(4.6f));
            Pair pair72 = new Pair("Mali-T860 MP2", Float.valueOf(4.55f));
            Pair pair73 = new Pair("Mali-T830 MP2", Float.valueOf(4.5f));
            Pair pair74 = new Pair("PowerVR GE8300", Float.valueOf(4.3f));
            Pair pair75 = new Pair("Adreno 405", Float.valueOf(4.2f));
            Pair pair76 = new Pair("Mali-T628 MP4", Float.valueOf(3.9f));
            Float valueOf11 = Float.valueOf(3.2f);
            return MapsKt.linkedMapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, pair28, pair29, pair30, pair31, pair32, pair33, pair34, pair35, pair36, pair37, pair38, pair39, pair40, pair41, pair42, pair43, pair44, pair45, pair46, pair47, pair48, pair49, pair50, pair51, pair52, pair53, pair54, pair55, pair56, pair57, pair58, pair59, pair60, pair61, pair62, pair63, pair64, pair65, pair66, pair67, pair68, pair69, pair70, pair71, pair72, pair73, pair74, pair75, pair76, new Pair("Mali-T830 MP1", valueOf11), new Pair("PowerVR G6200", valueOf11), new Pair("Adreno 504", Float.valueOf(3.15f)), new Pair("Mali-T720 MP4", Float.valueOf(2.9f)));
        }
    }

    public final void bindGLSurfaceView(GLSurfaceView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setRenderer(this);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        glRenderer = gl != null ? gl.glGetString(7937) : null;
        logDeviceInfo();
    }

    private final void logDeviceInfo() {
        try {
            Object systemService = this.activity.getSystemService("window");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Object systemService2 = this.activity.getSystemService("uimode");
            Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.app.UiModeManager");
            Object systemService3 = this.activity.getSystemService("activity");
            Intrinsics.checkNotNull(systemService3, "null cannot be cast to non-null type android.app.ActivityManager");
            ActivityManager activityManager = (ActivityManager) systemService3;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            linkedHashMap.put("resolution", displayMetrics.widthPixels + "x" + displayMetrics.heightPixels + "x" + displayMetrics.densityDpi);
            linkedHashMap.put("isDarkMode", String.valueOf(((UiModeManager) systemService2).getNightMode() == 2));
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            linkedHashMap.put("totalMemory", String.valueOf(((float) memoryInfo.totalMem) / 1.0E9f));
            linkedHashMap.put("brand", DeviceUtils.getBrand());
            linkedHashMap.put("androidVersion", DeviceUtils.getRelease());
            linkedHashMap.put("deviceName", Build.MODEL);
            String str = "";
            if (Build.VERSION.SDK_INT >= 31) {
                String str2 = Build.SOC_MANUFACTURER;
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMap.put("socManufacturer", str2);
                linkedHashMap.put("socModel", Build.SOC_MODEL);
            }
            linkedHashMap.put("hardware", Build.HARDWARE);
            String str3 = glRenderer;
            if (str3 != null) {
                str = str3;
            }
            linkedHashMap.put("GPU", str);
            linkedHashMap.put("navigationBarHeight", String.valueOf(ImmersiveUtils.INSTANCE.getNavigationBarHeight(this.activity)));
            new LogEventRequest("device_info_debug", BundleKt.bundleOf(TuplesKt.to("content", new Gson().toJson(linkedHashMap)))).post();
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }
}
