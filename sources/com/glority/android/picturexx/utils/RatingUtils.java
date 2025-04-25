package com.glority.android.picturexx.utils;

import androidx.fragment.app.FragmentActivity;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.xx.constants.Constants;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.abtest.CoinAbTestUtils;
import com.glority.reviewpopview.RequestRatingDialog;
import com.glority.reviewpopview.base.RatingDialogListener;
import com.glority.utils.UtilsApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;

/* compiled from: RatingUtils.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0002J$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u001bJ\u001f\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\nJ\b\u0010!\u001a\u00020\u0007H\u0002J\u0006\u0010\"\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/glority/android/picturexx/utils/RatingUtils;", "", "<init>", "()V", "ONE_DAY", "", "DAY_30", "", "DAY_14", "KEY_SHOW_RATING_TIME", "", "KEY_PRE_RECOGNIZE_PROBABILITY", "KEY_PRE_RECOGNIZE_TIME", "isInit", "", "FROM_COIN_GUIDE", "FROM_COLLECTION", "FROM_HISTORY", "FROM_IDENTIFY", RatingUtils.KEY_LAST_RECOGNIZE_TIME, "setRateShowTime", "", "show", "activity", "Landroidx/fragment/app/FragmentActivity;", "from", "onDismiss", "Lkotlin/Function0;", "canShow", "curProbability", "", "(Ljava/lang/String;Ljava/lang/Double;)Z", "recordPageCount", "getLast2AvgRecognizeTime", "isGoodUserExperience", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class RatingUtils {
    private static final long DAY_14 = 1209600000;
    private static final long DAY_30 = 2592000000L;
    public static final String FROM_COIN_GUIDE = "coinGuide";
    public static final String FROM_COLLECTION = "collection";
    public static final String FROM_HISTORY = "history";
    public static final String FROM_IDENTIFY = "identify";
    public static final String KEY_LAST_RECOGNIZE_TIME = "KEY_LAST_RECOGNIZE_TIME";
    public static final String KEY_PRE_RECOGNIZE_PROBABILITY = "key_pre_recognize_probability";
    public static final String KEY_PRE_RECOGNIZE_TIME = "key_pre_recognize_time";
    private static final String KEY_SHOW_RATING_TIME = "key_show_rating_time";
    private static final int ONE_DAY = 86400000;
    private static boolean isInit;
    public static final RatingUtils INSTANCE = new RatingUtils();
    public static final int $stable = 8;

    private RatingUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRateShowTime() {
        PersistData.INSTANCE.set(KEY_SHOW_RATING_TIME, Long.valueOf(System.currentTimeMillis()));
        DialogUtil.INSTANCE.setTodayHasShown();
    }

    public final void show(FragmentActivity activity, final String from, final Function0<Unit> onDismiss) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        if (!isInit) {
            UtilsApp.init(activity.getApplication());
            isInit = true;
        }
        new LogEventRequest(LogEvents.requst_ratingdialog_click, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("from", from))).post();
        RequestRatingDialog.INSTANCE.showGoogleReviewDialog(activity, new RatingDialogListener() { // from class: com.glority.android.picturexx.utils.RatingUtils$show$1
            @Override // com.glority.reviewpopview.base.RatingDialogListener
            public void onAppDialogShow() {
                new LogEventRequest(LogEvents.inappreview_show, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("count", PersistData.INSTANCE.get(Constants.recognizeCount, 0)), TuplesKt.to("from", from), TuplesKt.to("type", "app"))).post();
                RatingUtils.INSTANCE.setRateShowTime();
            }

            @Override // com.glority.reviewpopview.base.RatingDialogListener
            public void onDismiss(boolean isComplete) {
                onDismiss.invoke();
            }

            @Override // com.glority.reviewpopview.base.RatingDialogListener
            public void onGoogleDialogShow() {
                new LogEventRequest(LogEvents.inappreview_show, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("count", PersistData.INSTANCE.get(Constants.recognizeCount, 0)), TuplesKt.to("from", from), TuplesKt.to("type", "system"))).post();
                RatingUtils.INSTANCE.setRateShowTime();
            }
        });
    }

    public static /* synthetic */ boolean canShow$default(RatingUtils ratingUtils, String str, Double d, int i, Object obj) {
        if ((i & 2) != 0) {
            d = null;
        }
        return ratingUtils.canShow(str, d);
    }

    public final boolean canShow(String from, Double curProbability) {
        Intrinsics.checkNotNullParameter(from, "from");
        if (DialogUtil.INSTANCE.todayHasShown()) {
            return false;
        }
        long longValue = ((Number) PersistData.INSTANCE.get(KEY_SHOW_RATING_TIME, 0L)).longValue();
        int hashCode = from.hashCode();
        if (hashCode != -748941589) {
            if (hashCode == -135762164) {
                if (!from.equals("identify")) {
                    return false;
                }
                Double[] dArr = new Double[2];
                dArr[0] = Double.valueOf(curProbability != null ? curProbability.doubleValue() : 0.0d);
                dArr[1] = Double.valueOf(((Number) PersistData.INSTANCE.get(KEY_PRE_RECOGNIZE_PROBABILITY, Double.valueOf(0.0d))).doubleValue());
                List mutableListOf = CollectionsKt.mutableListOf(dArr);
                if ((((Number) mutableListOf.get(0)).doubleValue() <= 0.8d && (((Number) mutableListOf.get(0)).doubleValue() <= 0.699999988079071d || ((Number) mutableListOf.get(1)).doubleValue() <= 0.7d)) || System.currentTimeMillis() - longValue < DAY_30) {
                    return false;
                }
            } else if (hashCode != 926934164 || !from.equals(FROM_HISTORY) || ((Number) PersistData.INSTANCE.get(FROM_HISTORY, 1)).intValue() % 2 != 0 || System.currentTimeMillis() - longValue < DAY_14) {
                return false;
            }
        } else if (!from.equals(FROM_COIN_GUIDE) || ((Number) PersistData.INSTANCE.get(FROM_COIN_GUIDE, 1)).intValue() % 2 != 0 || System.currentTimeMillis() - longValue < DAY_14) {
            return false;
        }
        return isGoodUserExperience() && Random.INSTANCE.nextInt(0, 10000) / 100 <= CoinAbTestUtils.INSTANCE.reviewValue();
    }

    public final void recordPageCount(String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        int hashCode = from.hashCode();
        if (hashCode == -1741312354) {
            if (from.equals("collection")) {
                PersistData.INSTANCE.set("collection", Integer.valueOf(((Number) PersistData.INSTANCE.get("collection", 0)).intValue() + 1));
            }
        } else if (hashCode == -748941589) {
            if (from.equals(FROM_COIN_GUIDE)) {
                PersistData.INSTANCE.set(FROM_COIN_GUIDE, Integer.valueOf(((Number) PersistData.INSTANCE.get(FROM_COIN_GUIDE, 0)).intValue() + 1));
            }
        } else if (hashCode == 926934164 && from.equals(FROM_HISTORY)) {
            PersistData.INSTANCE.set(FROM_HISTORY, Integer.valueOf(((Number) PersistData.INSTANCE.get(FROM_HISTORY, 0)).intValue() + 1));
        }
    }

    private final long getLast2AvgRecognizeTime() {
        ArrayList arrayList = (ArrayList) PersistData.INSTANCE.get(KEY_PRE_RECOGNIZE_TIME, new ArrayList());
        if (arrayList.size() == 1) {
            return ((Number) CollectionsKt.last((List) arrayList)).longValue();
        }
        if (arrayList.size() < 2) {
            return 0L;
        }
        long longValue = ((Number) CollectionsKt.last((List) arrayList)).longValue();
        Object obj = arrayList.get(arrayList.size() - 2);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (longValue + ((Number) obj).longValue()) / 2;
    }

    public final boolean isGoodUserExperience() {
        boolean z = System.currentTimeMillis() - ((Number) PersistData.INSTANCE.get(KEY_LAST_RECOGNIZE_TIME, 0)).longValue() > 86400000;
        long last2AvgRecognizeTime = getLast2AvgRecognizeTime();
        return (1 <= last2AvgRecognizeTime && last2AvgRecognizeTime < 3001) || z;
    }
}
