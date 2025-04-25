package com.glority.android.cmsui2;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* compiled from: CmsItemType.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/glority/android/cmsui2/CmsItemType;", "", "<init>", "()V", "TYPE_WEB_VIEW", "", "TYPE_ITEM_SEPARATOR", "TYPE_LOADING", "TYPE_JOIN_REDDIT", "TYPE_GRADING_REPORT", "typeTitleMap", "Ljava/util/HashMap;", "", "getTypeTitleMap", "()Ljava/util/HashMap;", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public final class CmsItemType {
    public static final int TYPE_GRADING_REPORT = 51;
    public static final int TYPE_ITEM_SEPARATOR = 29;
    public static final int TYPE_JOIN_REDDIT = 46;
    public static final int TYPE_LOADING = 38;
    public static final int TYPE_WEB_VIEW = 21;
    public static final CmsItemType INSTANCE = new CmsItemType();
    private static final HashMap<Integer, String> typeTitleMap = MapsKt.hashMapOf(TuplesKt.to(29, "item_separator"), TuplesKt.to(46, "reddit_joinbtn"));

    private CmsItemType() {
    }

    public final HashMap<Integer, String> getTypeTitleMap() {
        return typeTitleMap;
    }
}
