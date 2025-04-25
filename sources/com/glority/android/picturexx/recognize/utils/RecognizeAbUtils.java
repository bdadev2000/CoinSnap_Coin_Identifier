package com.glority.android.picturexx.recognize.utils;

import com.glority.abtest.utils.AbtestUtils;
import com.glority.abtesting.generatedAPI.kotlinAPI.config.AbtestingVariable;
import com.glority.android.core.utils.data.PersistData;
import com.glority.base.storage.PersistKey;
import com.glority.base.utils.AbTestUtil;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: RecognizeAbUtils.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u000bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/android/picturexx/recognize/utils/RecognizeAbUtils;", "", "<init>", "()V", RecognizeAbUtils.camera_blurryclear_threshold, "", "blurryClearThreshold", "", "Ljava/lang/Float;", "getBlurryClearThreshold", "enableCaptureAutoZoomIn", "", "enableCameraBigCircleStyle", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class RecognizeAbUtils {
    public static final RecognizeAbUtils INSTANCE = new RecognizeAbUtils();
    private static Float blurryClearThreshold = null;
    private static final String camera_blurryclear_threshold = "camera_blurryclear_threshold";

    private RecognizeAbUtils() {
    }

    public final float getBlurryClearThreshold() {
        String variable;
        if (blurryClearThreshold == null) {
            AbtestingVariable abtestingVariable$default = AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, camera_blurryclear_threshold, 0, null, null, 14, null);
            blurryClearThreshold = (abtestingVariable$default == null || (variable = abtestingVariable$default.getVariable()) == null) ? null : StringsKt.toFloatOrNull(variable);
        }
        Float f = blurryClearThreshold;
        if (f != null) {
            return f.floatValue();
        }
        return 0.92f;
    }

    public final boolean enableCaptureAutoZoomIn() {
        if (!Intrinsics.areEqual(TuplesKt.to(PersistData.INSTANCE.get(PersistKey.KEY_DETECTION_BENCHMARK_TIME, 0L), PersistData.INSTANCE.get(PersistKey.KEY_DETECTION_SUPPORT)).component2(), (Object) true)) {
            return false;
        }
        AbtestingVariable abtestingVariable$default = AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, AbTestUtil.layer_camera_page, 0, null, null, 14, null);
        return Intrinsics.areEqual(abtestingVariable$default != null ? abtestingVariable$default.getVariable() : null, "110889");
    }

    @JvmStatic
    public static final boolean enableCameraBigCircleStyle() {
        AbtestingVariable abtestingVariable$default = AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, AbTestUtil.layer_camera_page, 0, null, null, 14, null);
        return Intrinsics.areEqual(abtestingVariable$default != null ? abtestingVariable$default.getVariable() : null, "110953");
    }
}
