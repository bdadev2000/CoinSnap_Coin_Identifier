package com.glority.android.picturexx.splash.composables.onboarding;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnBoardingScreenPage5.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/glority/android/picturexx/splash/composables/onboarding/HonorPage;", "", "<init>", "(Ljava/lang/String;I)V", "Honor_banners", "Honor_hint", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class HonorPage {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HonorPage[] $VALUES;
    public static final HonorPage Honor_banners = new HonorPage("Honor_banners", 0);
    public static final HonorPage Honor_hint = new HonorPage("Honor_hint", 1);

    private static final /* synthetic */ HonorPage[] $values() {
        return new HonorPage[]{Honor_banners, Honor_hint};
    }

    public static EnumEntries<HonorPage> getEntries() {
        return $ENTRIES;
    }

    private HonorPage(String str, int i) {
    }

    static {
        HonorPage[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static HonorPage valueOf(String str) {
        return (HonorPage) Enum.valueOf(HonorPage.class, str);
    }

    public static HonorPage[] values() {
        return (HonorPage[]) $VALUES.clone();
    }
}
