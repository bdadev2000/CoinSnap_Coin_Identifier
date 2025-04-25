package com.glority.android.uimaker.parameter.baseview;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BaseUiMakerParameter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/glority/android/uimaker/parameter/baseview/BaseUiMakerParameter;", "", "viewName", "", "getViewName", "()Ljava/lang/String;", "multiStateName", "", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public interface BaseUiMakerParameter {
    String getViewName();

    List<String> multiStateName();

    /* compiled from: BaseUiMakerParameter.kt */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static List<String> multiStateName(BaseUiMakerParameter baseUiMakerParameter) {
            return new ArrayList();
        }
    }
}
