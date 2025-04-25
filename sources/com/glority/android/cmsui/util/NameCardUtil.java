package com.glority.android.cmsui.util;

import com.glority.android.cmsui.model.CmsObject;
import com.glority.android.xx.constants.Args;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NameCardUtil.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/glority/android/cmsui/util/NameCardUtil;", "", "()V", "getName", "", "cmsObject", "Lcom/glority/android/cmsui/model/CmsObject;", Args.cmsName, "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class NameCardUtil {
    public static final NameCardUtil INSTANCE = new NameCardUtil();

    private NameCardUtil() {
    }

    public final String getName(CmsObject cmsObject) {
        Intrinsics.checkNotNullParameter(cmsObject, "cmsObject");
        if (cmsObject.getName().getPreferredName().length() > 0) {
            return cmsObject.getName().getPreferredName();
        }
        return cmsObject.getName().getLatinName();
    }

    public final String getName(CmsName cmsName) {
        Intrinsics.checkNotNullParameter(cmsName, "cmsName");
        if (cmsName.getName().getPreferredName().length() > 0) {
            return cmsName.getName().getPreferredName();
        }
        return cmsName.getName().getLatinName();
    }
}
