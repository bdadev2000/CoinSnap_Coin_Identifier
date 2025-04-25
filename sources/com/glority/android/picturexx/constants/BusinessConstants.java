package com.glority.android.picturexx.constants;

import kotlin.Metadata;

/* compiled from: BusinessConstants.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/glority/android/picturexx/constants/BusinessConstants;", "", "<init>", "()V", "NOTE_SNAP_CLAIM", "", "getNOTE_SNAP_CLAIM", "()Ljava/lang/String;", "NOTE_SNAP_NOT_INTERESTED", "getNOTE_SNAP_NOT_INTERESTED", "NOTE_SNAP_BANNER_CLICKED", "getNOTE_SNAP_BANNER_CLICKED", BusinessConstants.KEY_NOTESNAP_SETTINGS_CLICK, BusinessConstants.KEY_NOTESNAP_AFTER_RECOGINZED_SHOWED, "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class BusinessConstants {
    public static final int $stable = 0;
    public static final String KEY_NOTESNAP_AFTER_RECOGINZED_SHOWED = "KEY_NOTESNAP_AFTER_RECOGINZED_SHOWED";
    public static final String KEY_NOTESNAP_SETTINGS_CLICK = "KEY_NOTESNAP_SETTINGS_CLICK";
    public static final BusinessConstants INSTANCE = new BusinessConstants();
    private static final String NOTE_SNAP_CLAIM = "NOTE_SNAP_CLAIM";
    private static final String NOTE_SNAP_NOT_INTERESTED = "NOTE_SNAP_NOT_INTERESTED";
    private static final String NOTE_SNAP_BANNER_CLICKED = "NOTE_SNAP_BANNER_CLICKED";

    private BusinessConstants() {
    }

    public final String getNOTE_SNAP_CLAIM() {
        return NOTE_SNAP_CLAIM;
    }

    public final String getNOTE_SNAP_NOT_INTERESTED() {
        return NOTE_SNAP_NOT_INTERESTED;
    }

    public final String getNOTE_SNAP_BANNER_CLICKED() {
        return NOTE_SNAP_BANNER_CLICKED;
    }
}
