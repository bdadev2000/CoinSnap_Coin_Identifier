package com.glority.android.picturexx.payment.skumanager;

import com.glority.android.picturexx.payment.skumanager.internal.ActualSkuManager;
import com.glority.android.picturexx.payment.skumanager.internal.ISkuTest;
import com.glority.android.picturexx.payment.skumanager.internal.SkuTestUtil;
import com.glority.android.picturexx.payment.skumanager.internal.VirtualSkuMapper;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ASkuConfig.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001c\u001a\u00020\u001dR$\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u000fj\b\u0012\u0004\u0012\u00020\u000e`\rX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000bR\u0018\u0010\u0017\u001a\u00020\u0006X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/glority/android/picturexx/payment/skumanager/ASkuConfig;", "", "<init>", "()V", "totalSkuList", "", "", "Lcom/glority/android/picturexx/payment/skumanager/BillingSkuData;", "getTotalSkuList", "()Ljava/util/Map;", "setTotalSkuList", "(Ljava/util/Map;)V", "skuTests", "Lkotlin/collections/ArrayList;", "Lcom/glority/android/picturexx/payment/skumanager/internal/ISkuTest;", "Ljava/util/ArrayList;", "getSkuTests", "()Ljava/util/ArrayList;", "setSkuTests", "(Ljava/util/ArrayList;)V", "virtualSkuMap", "getVirtualSkuMap", "setVirtualSkuMap", "skuForCloseRetain", "getSkuForCloseRetain", "()Ljava/lang/String;", "setSkuForCloseRetain", "(Ljava/lang/String;)V", "registerConfigs", "", "purchase_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public abstract class ASkuConfig {
    public abstract String getSkuForCloseRetain();

    public abstract ArrayList<ISkuTest> getSkuTests();

    public abstract Map<String, BillingSkuData> getTotalSkuList();

    public abstract Map<String, String> getVirtualSkuMap();

    public abstract void setSkuForCloseRetain(String str);

    public abstract void setSkuTests(ArrayList<ISkuTest> arrayList);

    public abstract void setTotalSkuList(Map<String, BillingSkuData> map);

    public abstract void setVirtualSkuMap(Map<String, String> map);

    public final void registerConfigs() {
        ActualSkuManager.INSTANCE.setTotalSkuList(getTotalSkuList());
        VirtualSkuMapper.INSTANCE.setVirtualSkuMap(getVirtualSkuMap());
        SkuTestUtil.INSTANCE.setSkuTests(getSkuTests());
        SkuManager.INSTANCE.setSkuForCloseRetain(getSkuForCloseRetain());
    }
}
