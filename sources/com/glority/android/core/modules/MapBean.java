package com.glority.android.core.modules;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MapBean.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/glority/android/core/modules/MapBean;", "Ljava/io/Serializable;", "()V", "abTestMap", "", "", "", "getAbTestMap", "()Ljava/util/Map;", "setAbTestMap", "(Ljava/util/Map;)V", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class MapBean implements Serializable {
    private Map<String, ? extends Object> abTestMap = new HashMap();

    public final Map<String, Object> getAbTestMap() {
        return this.abTestMap;
    }

    public final void setAbTestMap(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.abTestMap = map;
    }
}
