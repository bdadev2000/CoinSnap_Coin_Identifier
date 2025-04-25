package com.glority.android.picturexx.payment.detain;

import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.route.abtest.AbtestGetVariableRequest;
import com.glority.android.core.route.detain.DetainOpenWithRequestCodeRequest;
import com.glority.android.core.route.guide.GetLanguageCodeRequest;
import com.glority.android.core.route.guide.IsVipInHistoryRequest;
import com.glority.android.core.route.retain.RetainOpenRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.guide.base.BasePurchaseActivity;
import com.glority.base.storage.PersistKey;
import com.glority.base.utils.AbTestUtil;
import com.glority.utils.stability.LogUtils;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetainUtil.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\r\u001a\u00020\u000eJ&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015J(\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u0017\u001a\u00020\u000eJ\u001e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005J \u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\u0006\u0010\u001a\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/glority/android/picturexx/payment/detain/DetainUtil;", "", "<init>", "()V", "purchaseDetainId", "", "getPurchaseDetainId", "()Ljava/lang/String;", "setPurchaseDetainId", "(Ljava/lang/String;)V", "convertRetainId", "getConvertRetainId", "setConvertRetainId", "canShowCloseRetain", "", "toConvertRetain", "", LogEventArguments.ARG_SKU, "pageFrom", "pageType", "requestCode", "", "showDefaultConvertRetain", "canShowPurchaseDetain", "toPurchaseDetainPage", "showDefaultPurchaseRetain", "recordCloseRetainShow", "recordPurchaseRetainShow", "purchase_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class DetainUtil {
    public static final DetainUtil INSTANCE = new DetainUtil();
    private static String purchaseDetainId = "";
    private static String convertRetainId = "";

    private DetainUtil() {
    }

    public final String getPurchaseDetainId() {
        return purchaseDetainId;
    }

    public final void setPurchaseDetainId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        purchaseDetainId = str;
    }

    public final String getConvertRetainId() {
        return convertRetainId;
    }

    public final void setConvertRetainId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        convertRetainId = str;
    }

    public final boolean canShowCloseRetain() {
        boolean booleanValue = new IsVipInHistoryRequest().toResult().booleanValue();
        Integer num = (Integer) PersistData.INSTANCE.getCompat(PersistKey.CONVERT_RETAIN_COUNT, 0);
        return (num == null || num.intValue() == 0) && !booleanValue;
    }

    public final void toConvertRetain(final String sku, final String pageFrom, final String pageType, final int requestCode) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(pageFrom, "pageFrom");
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        new AbtestGetVariableRequest(AbTestUtil.COVERT_RETAIN_ANDROID).subscribe(new Consumer() { // from class: com.glority.android.picturexx.payment.detain.DetainUtil$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DetainUtil.toConvertRetain$lambda$0(sku, pageFrom, pageType, requestCode, (Integer) obj);
            }
        }, new Consumer() { // from class: com.glority.android.picturexx.payment.detain.DetainUtil$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DetainUtil.toConvertRetain$lambda$1(sku, pageFrom, pageType, requestCode, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toConvertRetain$lambda$0(String sku, String pageFrom, String pageType, int i, Integer num) {
        Intrinsics.checkNotNullParameter(sku, "$sku");
        Intrinsics.checkNotNullParameter(pageFrom, "$pageFrom");
        Intrinsics.checkNotNullParameter(pageType, "$pageType");
        if (num == null) {
            INSTANCE.showDefaultConvertRetain(sku, pageFrom, pageType, i);
            return;
        }
        String num2 = num.toString();
        convertRetainId = num2;
        new RetainOpenRequest(num2, i, sku, pageFrom, pageType).post();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toConvertRetain$lambda$1(String sku, String pageFrom, String pageType, int i, Throwable th) {
        Intrinsics.checkNotNullParameter(sku, "$sku");
        Intrinsics.checkNotNullParameter(pageFrom, "$pageFrom");
        Intrinsics.checkNotNullParameter(pageType, "$pageType");
        INSTANCE.showDefaultConvertRetain(sku, pageFrom, pageType, i);
    }

    private final void showDefaultConvertRetain(String sku, String pageFrom, String pageType, int requestCode) {
        String str = AppContext.INSTANCE.getConfig("CONVERT_RETAIN_DEFAULT_MEMO") + AppContext.INSTANCE.getConfig("CONVERT_RETAIN_DEFAULT_MEMO_INDEX");
        convertRetainId = str;
        try {
            new RetainOpenRequest(str, requestCode, sku, pageFrom, pageType).post();
        } catch (Exception e) {
            LogUtils.e(e);
        }
    }

    public final boolean canShowPurchaseDetain() {
        Integer num = (Integer) PersistData.INSTANCE.getCompat(PersistKey.PURCHASE_RETAIN_COUNT, 0);
        return num == null || num.intValue() < 4;
    }

    public final void toPurchaseDetainPage(final String sku, final String pageFrom, final String pageType) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(pageFrom, "pageFrom");
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        new AbtestGetVariableRequest(AbTestUtil.PURCHASE_DETAIN_ANDROID).subscribe(new Consumer() { // from class: com.glority.android.picturexx.payment.detain.DetainUtil$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DetainUtil.toPurchaseDetainPage$lambda$2(sku, pageFrom, pageType, (Integer) obj);
            }
        }, new Consumer() { // from class: com.glority.android.picturexx.payment.detain.DetainUtil$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DetainUtil.toPurchaseDetainPage$lambda$3(sku, pageFrom, pageType, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toPurchaseDetainPage$lambda$2(String sku, String pageFrom, String pageType, Integer num) {
        Intrinsics.checkNotNullParameter(sku, "$sku");
        Intrinsics.checkNotNullParameter(pageFrom, "$pageFrom");
        Intrinsics.checkNotNullParameter(pageType, "$pageType");
        if (num == null) {
            INSTANCE.showDefaultPurchaseRetain(sku, pageFrom, pageType);
            return;
        }
        String num2 = num.toString();
        purchaseDetainId = num2;
        new DetainOpenWithRequestCodeRequest(num2, sku, pageFrom, pageType, BasePurchaseActivity.INSTANCE.getOpenPurchaseDetainAndCloseOnlySuccessRequestCode()).post();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toPurchaseDetainPage$lambda$3(String sku, String pageFrom, String pageType, Throwable th) {
        Intrinsics.checkNotNullParameter(sku, "$sku");
        Intrinsics.checkNotNullParameter(pageFrom, "$pageFrom");
        Intrinsics.checkNotNullParameter(pageType, "$pageType");
        INSTANCE.showDefaultPurchaseRetain(sku, pageFrom, pageType);
    }

    private final void showDefaultPurchaseRetain(String sku, String pageFrom, String pageType) {
        String config = AppContext.INSTANCE.getConfig("PURCHASE_DETAIN_DEFAULT_MEMO");
        String config2 = AppContext.INSTANCE.getConfig("PURCHASE_DETAIN_DEFAULT_MEMO_INDEX");
        if (!Intrinsics.areEqual(new GetLanguageCodeRequest().toResult(), "English")) {
            config = AppContext.INSTANCE.getConfig("PURCHASE_DETAIN_DEFAULT_MEMO_NOT_ENGLISH");
            config2 = AppContext.INSTANCE.getConfig("PURCHASE_DETAIN_DEFAULT_MEMO_INDEX_NOT_ENGLISH");
        }
        String str = config + config2;
        purchaseDetainId = str;
        try {
            new DetainOpenWithRequestCodeRequest(str, sku, pageFrom, pageType, BasePurchaseActivity.INSTANCE.getOpenPurchaseDetainAndCloseOnlySuccessRequestCode()).post();
        } catch (Exception e) {
            LogUtils.e(e);
        }
    }

    public final void recordCloseRetainShow() {
        Integer num = (Integer) PersistData.INSTANCE.getCompat(PersistKey.CONVERT_RETAIN_COUNT, 0);
        PersistData.INSTANCE.set(PersistKey.CONVERT_RETAIN_COUNT, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
    }

    public final void recordPurchaseRetainShow() {
        Integer num = (Integer) PersistData.INSTANCE.getCompat(PersistKey.PURCHASE_RETAIN_COUNT, 0);
        PersistData.INSTANCE.set(PersistKey.PURCHASE_RETAIN_COUNT, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
    }
}
