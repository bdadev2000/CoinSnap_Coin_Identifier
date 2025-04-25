package com.glority.android.picturexx.utils;

import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PageNameMapUtils.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lcom/glority/android/picturexx/utils/PageNameMapUtils;", "", "<init>", "()V", "map", "", Args.pageName, "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class PageNameMapUtils {
    public static final int $stable = 0;
    public static final PageNameMapUtils INSTANCE = new PageNameMapUtils();

    private PageNameMapUtils() {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    public final String map(String pageName) {
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        switch (pageName.hashCode()) {
            case -2075980915:
                if (!pageName.equals(LogEvents.guidecoin)) {
                    return pageName;
                }
                return "search_result";
            case -1821787868:
                return !pageName.equals(LogEvents.itemdetail) ? pageName : "snap_history";
            case -1354901393:
                return !pageName.equals(LogEvents.collectiondetail) ? pageName : "collection_info";
            case -934426595:
                return !pageName.equals(LogEvents.result) ? pageName : "identify";
            case -906336856:
                if (!pageName.equals("search")) {
                    return pageName;
                }
                return "search_result";
            case 911110072:
                return !pageName.equals(LogEvents.wishdetail) ? pageName : "wishlist_info";
            case 1459342627:
                return !pageName.equals(LogEvents.offseriesintroresult) ? pageName : LogEvents.officialseries_intro;
            default:
                return pageName;
        }
    }
}
