package com.glority.android.picturexx.skins;

import com.glority.android.picturexx.business.R;
import kotlin.Metadata;

/* compiled from: SkinResourceManager.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Lcom/glority/android/picturexx/skins/SkinResourceManager;", "", "<init>", "()V", "getSkinResId", "", "resId", "getHomeIdentifyBg", "getHomeIdentifyScanIcon", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SkinResourceManager {
    public static final int $stable = 0;
    public static final SkinResourceManager INSTANCE = new SkinResourceManager();

    private SkinResourceManager() {
    }

    public final int getSkinResId(int resId) {
        return R.raw.identifying_animation;
    }

    public final int getHomeIdentifyBg() {
        return R.drawable.img_home_country_border;
    }

    public final int getHomeIdentifyScanIcon() {
        return R.drawable.img_home_scan_coin;
    }
}
