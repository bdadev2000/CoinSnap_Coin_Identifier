package com.glority.android.guide.route;

import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.app.AppContext;
import com.glority.utils.stability.LogUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ConvertPageOpenExtraParamUtil.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0012\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/glority/android/guide/route/ConvertPageOpenExtraParamUtil;", "", "()V", "extraInterval", "", "extraItemABTestId", "extraItemOpenTimes", "extraItemPlantType", "extraSeparate", "generateParamString", "plantType", "abtestId", "openTimes", "parseABTestId", "paramString", "parseItemData", "extraItemKey", "parseOpenTimes", "parsePlantType", "base-guide_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ConvertPageOpenExtraParamUtil {
    public static final String extraInterval = "--";
    public static final String extraSeparate = "::";
    public static final ConvertPageOpenExtraParamUtil INSTANCE = new ConvertPageOpenExtraParamUtil();
    private static final String extraItemPlantType = "plantType";
    private static final String extraItemABTestId = "abtestId";
    private static final String extraItemOpenTimes = "openTimes";

    private ConvertPageOpenExtraParamUtil() {
    }

    public final String generateParamString(String plantType, String abtestId, String openTimes) {
        StringBuilder sb = new StringBuilder();
        String str = plantType;
        if (str != null && str.length() != 0) {
            sb.append(extraItemPlantType).append(extraSeparate).append(plantType);
        }
        String str2 = abtestId;
        if (str2 != null && str2.length() != 0) {
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
            if (sb2.length() > 0) {
                sb.append(extraInterval);
            }
            sb.append(extraItemABTestId).append(extraSeparate).append(abtestId);
        }
        String str3 = openTimes;
        if (str3 != null && str3.length() != 0) {
            String sb3 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
            if (sb3.length() > 0) {
                sb.append(extraInterval);
            }
            sb.append(extraItemOpenTimes).append(extraSeparate).append(openTimes);
        }
        String sb4 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "sb.toString()");
        return sb4;
    }

    public final String parsePlantType(String paramString) {
        return parseItemData(paramString, extraItemPlantType);
    }

    public final String parseABTestId(String paramString) {
        return parseItemData(paramString, extraItemABTestId);
    }

    public final String parseOpenTimes(String paramString) {
        return parseItemData(paramString, extraItemOpenTimes);
    }

    private final String parseItemData(String paramString, String extraItemKey) {
        String str = paramString;
        Object obj = "";
        if (str != null && str.length() != 0 && StringsKt.contains$default((CharSequence) str, (CharSequence) extraItemKey, false, 2, (Object) null)) {
            try {
                Iterator it = StringsKt.split$default((CharSequence) str, new String[]{extraInterval}, false, 0, 6, (Object) null).iterator();
                while (it.hasNext()) {
                    List split$default = StringsKt.split$default((CharSequence) it.next(), new String[]{extraSeparate}, false, 0, 6, (Object) null);
                    if (Intrinsics.areEqual(split$default.get(0), extraItemKey)) {
                        obj = split$default.get(1);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
        }
        return (String) obj;
    }
}
