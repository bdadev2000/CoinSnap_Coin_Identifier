package com.glority.android.picturexx.payment.skumanager.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultSkuTest.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/glority/android/picturexx/payment/skumanager/internal/DefaultSkuTest;", "Lcom/glority/android/picturexx/payment/skumanager/internal/ISkuTest;", "<init>", "()V", "inTesting", "", "getTestSku", "", "originSku", "purchase_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class DefaultSkuTest implements ISkuTest {
    @Override // com.glority.android.picturexx.payment.skumanager.internal.ISkuTest
    public String getTestSku(String originSku) {
        Intrinsics.checkNotNullParameter(originSku, "originSku");
        return originSku;
    }

    @Override // com.glority.android.picturexx.payment.skumanager.internal.ISkuTest
    public boolean inTesting() {
        return true;
    }
}
