package com.glority.android.picturexx.payment.skumanager.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SkuTestUtil.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\tj\b\u0012\u0004\u0012\u00020\b`\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/glority/android/picturexx/payment/skumanager/internal/SkuTestUtil;", "", "<init>", "()V", "defaultSku", "Lcom/glority/android/picturexx/payment/skumanager/internal/DefaultSkuTest;", "skuTests", "Lkotlin/collections/ArrayList;", "Lcom/glority/android/picturexx/payment/skumanager/internal/ISkuTest;", "Ljava/util/ArrayList;", "getSkuTests", "()Ljava/util/ArrayList;", "setSkuTests", "(Ljava/util/ArrayList;)V", "Ljava/util/ArrayList;", "getTestSku", "", "originSku", "purchase_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class SkuTestUtil {
    public static final SkuTestUtil INSTANCE = new SkuTestUtil();
    private static final DefaultSkuTest defaultSku = new DefaultSkuTest();
    private static ArrayList<ISkuTest> skuTests = new ArrayList<>();

    private SkuTestUtil() {
    }

    public final ArrayList<ISkuTest> getSkuTests() {
        return skuTests;
    }

    public final void setSkuTests(ArrayList<ISkuTest> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        skuTests = arrayList;
    }

    public final String getTestSku(String originSku) {
        Intrinsics.checkNotNullParameter(originSku, "originSku");
        for (ISkuTest iSkuTest : skuTests) {
            if (iSkuTest.inTesting()) {
                return iSkuTest.getTestSku(originSku);
            }
        }
        return defaultSku.getTestSku(originSku);
    }
}
