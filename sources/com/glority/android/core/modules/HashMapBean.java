package com.glority.android.core.modules;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HashMapBean.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R6\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/glority/android/core/modules/HashMapBean;", "Ljava/io/Serializable;", "()V", "hashMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getHashMap", "()Ljava/util/HashMap;", "setHashMap", "(Ljava/util/HashMap;)V", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class HashMapBean implements Serializable {
    private HashMap<String, String> hashMap = new HashMap<>();

    public final HashMap<String, String> getHashMap() {
        return this.hashMap;
    }

    public final void setHashMap(HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<set-?>");
        this.hashMap = hashMap;
    }
}
