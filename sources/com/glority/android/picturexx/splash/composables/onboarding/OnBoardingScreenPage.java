package com.glority.android.picturexx.splash.composables.onboarding;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnBoardingScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/glority/android/picturexx/splash/composables/onboarding/OnBoardingScreenPage;", "", "<init>", "(Ljava/lang/String;I)V", "PAGE_1", "PAGE_2", "PAGE_3", "PAGE_4", "PAGE_5", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class OnBoardingScreenPage {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OnBoardingScreenPage[] $VALUES;
    public static final OnBoardingScreenPage PAGE_1 = new OnBoardingScreenPage("PAGE_1", 0);
    public static final OnBoardingScreenPage PAGE_2 = new OnBoardingScreenPage("PAGE_2", 1);
    public static final OnBoardingScreenPage PAGE_3 = new OnBoardingScreenPage("PAGE_3", 2);
    public static final OnBoardingScreenPage PAGE_4 = new OnBoardingScreenPage("PAGE_4", 3);
    public static final OnBoardingScreenPage PAGE_5 = new OnBoardingScreenPage("PAGE_5", 4);

    private static final /* synthetic */ OnBoardingScreenPage[] $values() {
        return new OnBoardingScreenPage[]{PAGE_1, PAGE_2, PAGE_3, PAGE_4, PAGE_5};
    }

    public static EnumEntries<OnBoardingScreenPage> getEntries() {
        return $ENTRIES;
    }

    private OnBoardingScreenPage(String str, int i) {
    }

    static {
        OnBoardingScreenPage[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static OnBoardingScreenPage valueOf(String str) {
        return (OnBoardingScreenPage) Enum.valueOf(OnBoardingScreenPage.class, str);
    }

    public static OnBoardingScreenPage[] values() {
        return (OnBoardingScreenPage[]) $VALUES.clone();
    }
}
