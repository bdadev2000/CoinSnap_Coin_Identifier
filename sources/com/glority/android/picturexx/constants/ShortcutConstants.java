package com.glority.android.picturexx.constants;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: ShortcutConstants.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/glority/android/picturexx/constants/ShortcutConstants;", "", "<init>", "()V", ShortcutConstants.system_shortcut_click, "", "BASE_URL", "ONE_DAY_FREE_SHORTCUT_ID", "ONE_DAY_FREE_SHORTCUT_ID1", "ONE_DAY_FREE_SHORTCUT_ID2", "ONE_DAY_FREE_SHORTCUT_ID3", "ONE_DAY_FREE_LIST", "", "getONE_DAY_FREE_LIST", "()Ljava/util/List;", "FEEDBACK_SHORTCUT_ID", "GRADE_SHORTCUT_ID", "IDENTIFY_SHORTCUT_ID", "COLLECTION_SHORTCUT_ID", ShortcutConstants.ONE_DAY_FREE_SHORTCUT_EXPIRED_TIME, "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class ShortcutConstants {
    public static final String BASE_URL = "coinsnap://coinidentifierai.com/shortcut/";
    public static final String COLLECTION_SHORTCUT_ID = "collection";
    public static final String FEEDBACK_SHORTCUT_ID = "feedback";
    public static final String GRADE_SHORTCUT_ID = "grade";
    public static final String IDENTIFY_SHORTCUT_ID = "identify";
    public static final String ONE_DAY_FREE_SHORTCUT_EXPIRED_TIME = "ONE_DAY_FREE_SHORTCUT_EXPIRED_TIME";
    public static final String system_shortcut_click = "system_shortcut_click";
    public static final ShortcutConstants INSTANCE = new ShortcutConstants();
    public static final String ONE_DAY_FREE_SHORTCUT_ID = "onedayfree";
    public static final String ONE_DAY_FREE_SHORTCUT_ID1 = "onedayfree1";
    public static final String ONE_DAY_FREE_SHORTCUT_ID2 = "onedayfree2";
    public static final String ONE_DAY_FREE_SHORTCUT_ID3 = "onedayfree3";
    private static final List<String> ONE_DAY_FREE_LIST = CollectionsKt.listOf((Object[]) new String[]{ONE_DAY_FREE_SHORTCUT_ID, ONE_DAY_FREE_SHORTCUT_ID1, ONE_DAY_FREE_SHORTCUT_ID2, ONE_DAY_FREE_SHORTCUT_ID3});
    public static final int $stable = 8;

    private ShortcutConstants() {
    }

    public final List<String> getONE_DAY_FREE_LIST() {
        return ONE_DAY_FREE_LIST;
    }
}
