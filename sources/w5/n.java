package w5;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum n {
    UNLOCKED_ACHIEVEMENT("AchievementUnlocked"),
    ACTIVATED_APP("ActivateApp"),
    ADDED_PAYMENT_INFO("AddPaymentInfo"),
    ADDED_TO_CART("AddToCart"),
    ADDED_TO_WISHLIST("AddToWishlist"),
    COMPLETED_REGISTRATION("CompleteRegistration"),
    VIEWED_CONTENT("ViewContent"),
    INITIATED_CHECKOUT("InitiateCheckout"),
    ACHIEVED_LEVEL("LevelAchieved"),
    PURCHASED("Purchase"),
    RATED("Rate"),
    SEARCHED("Search"),
    SPENT_CREDITS("SpentCredits"),
    COMPLETED_TUTORIAL("TutorialCompletion");


    /* renamed from: b, reason: collision with root package name */
    public final String f26818b;

    n(String str) {
        this.f26818b = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static n[] valuesCustom() {
        return (n[]) Arrays.copyOf(values(), 14);
    }
}
