package com.glority.android.cmsui.util;

import android.util.Log;
import com.glority.android.cmsui.model.CmsImage;
import com.glority.android.cmsui.model.CmsMain;
import com.glority.android.cmsui.model.CmsTag;
import com.glority.android.cmsui.model.CmsTagColors;
import com.glority.android.cmsui.model.CmsTagString;
import com.glority.android.cmsui.model.CmsTagValueType;
import com.glority.android.cmsui.model.CmsTaxonomyName;
import com.glority.android.core.app.AppContext;
import com.glority.utils.stability.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: CmsTagValueUtil.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0004J\u001e\u0010\b\u001a\u0004\u0018\u00010\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bJ\u001e\u0010\r\u001a\u0004\u0018\u00010\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bJ\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bJ\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bJ\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bJ\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bJ\u001c\u0010\u0016\u001a\u00020\u00042\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bJ\u001c\u0010\u0017\u001a\u00020\u00042\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bJ\u001c\u0010\u0018\u001a\u00020\u00042\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bJ\u001c\u0010\u0019\u001a\u00020\u00042\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bJ\u001c\u0010\u001a\u001a\u00020\u00042\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bJ\u001c\u0010\u001b\u001a\u00020\u00042\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b¨\u0006\u001c"}, d2 = {"Lcom/glority/android/cmsui/util/CmsTagValueUtil;", "", "()V", "checkTagHasMedicinal", "", "it", "Lcom/glority/android/cmsui/model/CmsTag;", "checkSelf", "convert2CmsImage", "Lcom/glority/android/cmsui/model/CmsImage;", "cmsTagValue", "", "", "convert2CmsTag", "convert2CmsTagColors", "Lcom/glority/android/cmsui/model/CmsTagColors;", "convert2CmsTagString", "Lcom/glority/android/cmsui/model/CmsTagString;", "convert2Main", "Lcom/glority/android/cmsui/model/CmsMain;", "convert2TaxonomyName", "Lcom/glority/android/cmsui/model/CmsTaxonomyName;", "isCmsImage", "isCmsTag", "isCmsTagString", "isMain", "isTagColor", "isTaxonomyName", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class CmsTagValueUtil {
    public static final CmsTagValueUtil INSTANCE = new CmsTagValueUtil();

    private CmsTagValueUtil() {
    }

    public final boolean isCmsTagString(Map<String, ? extends Object> cmsTagValue) {
        Intrinsics.checkNotNullParameter(cmsTagValue, "cmsTagValue");
        return cmsTagValue.containsKey("type") && Intrinsics.areEqual(cmsTagValue.get("type"), Integer.valueOf(CmsTagValueType.CmsTagValueString.getValue()));
    }

    public final boolean isCmsImage(Map<String, ? extends Object> cmsTagValue) {
        Intrinsics.checkNotNullParameter(cmsTagValue, "cmsTagValue");
        return cmsTagValue.containsKey("type") && Intrinsics.areEqual(cmsTagValue.get("type"), Integer.valueOf(CmsTagValueType.CmsTagValueImage.getValue()));
    }

    public final boolean isCmsTag(Map<String, ? extends Object> cmsTagValue) {
        Intrinsics.checkNotNullParameter(cmsTagValue, "cmsTagValue");
        return cmsTagValue.containsKey("type") && Intrinsics.areEqual(cmsTagValue.get("type"), Integer.valueOf(CmsTagValueType.CmsTagValueTag.getValue()));
    }

    public final boolean isMain(Map<String, ? extends Object> cmsTagValue) {
        Intrinsics.checkNotNullParameter(cmsTagValue, "cmsTagValue");
        return cmsTagValue.containsKey("type") && Intrinsics.areEqual(cmsTagValue.get("type"), Integer.valueOf(CmsTagValueType.CmsTagValueMain.getValue()));
    }

    public final boolean isTaxonomyName(Map<String, ? extends Object> cmsTagValue) {
        Intrinsics.checkNotNullParameter(cmsTagValue, "cmsTagValue");
        return cmsTagValue.containsKey("type") && Intrinsics.areEqual(cmsTagValue.get("type"), Integer.valueOf(CmsTagValueType.CmsTagValueTaxonomyName.getValue()));
    }

    public final boolean isTagColor(Map<String, ? extends Object> cmsTagValue) {
        Intrinsics.checkNotNullParameter(cmsTagValue, "cmsTagValue");
        return cmsTagValue.containsKey("type") && Intrinsics.areEqual(cmsTagValue.get("type"), Integer.valueOf(CmsTagValueType.CmsTagValueColor.getValue()));
    }

    public final CmsTagString convert2CmsTagString(Map<String, ? extends Object> cmsTagValue) {
        Intrinsics.checkNotNullParameter(cmsTagValue, "cmsTagValue");
        try {
            if (INSTANCE.isCmsTagString(cmsTagValue)) {
                return new CmsTagString(new JSONObject(cmsTagValue));
            }
            return null;
        } catch (Exception e) {
            if (!AppContext.INSTANCE.isDebugMode()) {
                return null;
            }
            LogUtils.e(Log.getStackTraceString(e));
            return null;
        }
    }

    public final CmsImage convert2CmsImage(Map<String, ? extends Object> cmsTagValue) {
        Intrinsics.checkNotNullParameter(cmsTagValue, "cmsTagValue");
        try {
            if (INSTANCE.isCmsImage(cmsTagValue)) {
                return new CmsImage(new JSONObject(cmsTagValue));
            }
            return null;
        } catch (Exception e) {
            if (!AppContext.INSTANCE.isDebugMode()) {
                return null;
            }
            LogUtils.e(Log.getStackTraceString(e));
            return null;
        }
    }

    public final CmsTag convert2CmsTag(Map<String, ? extends Object> cmsTagValue) {
        Intrinsics.checkNotNullParameter(cmsTagValue, "cmsTagValue");
        try {
            if (INSTANCE.isCmsTag(cmsTagValue)) {
                return new CmsTag(new JSONObject(cmsTagValue));
            }
            return null;
        } catch (Exception e) {
            if (!AppContext.INSTANCE.isDebugMode()) {
                return null;
            }
            LogUtils.e(Log.getStackTraceString(e));
            return null;
        }
    }

    public final CmsMain convert2Main(Map<String, ? extends Object> cmsTagValue) {
        Intrinsics.checkNotNullParameter(cmsTagValue, "cmsTagValue");
        try {
            if (INSTANCE.isMain(cmsTagValue)) {
                return new CmsMain(new JSONObject(cmsTagValue));
            }
            return null;
        } catch (Exception e) {
            if (!AppContext.INSTANCE.isDebugMode()) {
                return null;
            }
            LogUtils.e(Log.getStackTraceString(e));
            return null;
        }
    }

    public final CmsTagColors convert2CmsTagColors(Map<String, ? extends Object> cmsTagValue) {
        Intrinsics.checkNotNullParameter(cmsTagValue, "cmsTagValue");
        try {
            if (INSTANCE.isTagColor(cmsTagValue)) {
                return new CmsTagColors(new JSONObject(cmsTagValue));
            }
            return null;
        } catch (Exception e) {
            if (!AppContext.INSTANCE.isDebugMode()) {
                return null;
            }
            LogUtils.e(Log.getStackTraceString(e));
            return null;
        }
    }

    public final CmsTaxonomyName convert2TaxonomyName(Map<String, ? extends Object> cmsTagValue) {
        Intrinsics.checkNotNullParameter(cmsTagValue, "cmsTagValue");
        try {
            if (INSTANCE.isTaxonomyName(cmsTagValue)) {
                return new CmsTaxonomyName(new JSONObject(cmsTagValue));
            }
            return null;
        } catch (Exception e) {
            if (!AppContext.INSTANCE.isDebugMode()) {
                return null;
            }
            LogUtils.e(Log.getStackTraceString(e));
            return null;
        }
    }

    public static /* synthetic */ boolean checkTagHasMedicinal$default(CmsTagValueUtil cmsTagValueUtil, CmsTag cmsTag, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return cmsTagValueUtil.checkTagHasMedicinal(cmsTag, z);
    }

    public final boolean checkTagHasMedicinal(CmsTag it, boolean checkSelf) {
        List<Map<String, Object>> tagValues;
        if (Intrinsics.areEqual((Object) (it != null ? it.getWithEdibleOrMedicalInfo() : null), (Object) true) && checkSelf) {
            return true;
        }
        if (it != null && (tagValues = it.getTagValues()) != null) {
            Iterator<T> it2 = tagValues.iterator();
            while (it2.hasNext()) {
                Map<String, ? extends Object> map = (Map) it2.next();
                CmsTagValueUtil cmsTagValueUtil = INSTANCE;
                if (cmsTagValueUtil.isCmsTag(map) && checkTagHasMedicinal$default(cmsTagValueUtil, cmsTagValueUtil.convert2CmsTag(map), false, 2, null)) {
                    return true;
                }
            }
        }
        return false;
    }
}
