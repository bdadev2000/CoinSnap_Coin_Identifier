package com.cooldev.gba.emulator.gameboy.features.paywalls.logic;

import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import b1.f0;
import b1.l;
import b1.r;
import b1.s;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.cooldev.gba.emulator.gameboy.R;
import com.cooldev.gba.emulator.gameboy.features.MainActivity;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.PurchaseState;
import com.cooldev.gba.emulator.gameboy.features.paywalls.utils.PublicSignedData;
import com.cooldev.gba.emulator.gameboy.network.models.SlackMessage;
import com.cooldev.gba.emulator.gameboy.network.repo.SlackApiRepositoryImpl;
import com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService;
import d0.b0;
import e1.g1;
import e1.i1;
import e1.m0;
import e1.o0;
import e1.t0;
import h0.g;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes.dex */
public final class IAPViewModel extends AndroidViewModel implements PurchasesUpdatedListener, BillingClientStateListener {

    @NotNull
    private final m0 _state;

    @NotNull
    private BillingClient billingClient;

    @NotNull
    private final r billingClientReady;
    private final long debounceDelayTime;

    @NotNull
    private final r isPremiumDeferred;
    private long lastClickTime;

    @NotNull
    private final RemoteConfigService remoteConfigService;

    @NotNull
    private final g1 state;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static String TAG = "IAPViewModel";

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IAPViewModel(@NotNull Application application, @NotNull RemoteConfigService remoteConfigService) {
        super(application);
        a.s(application, "application");
        a.s(remoteConfigService, "remoteConfigService");
        this.remoteConfigService = remoteConfigService;
        i1 c2 = t0.c(new IAPState(null, null, false, false, null, 31, null));
        this._state = c2;
        this.state = new o0(c2);
        BillingClient build = BillingClient.newBuilder(application.getApplicationContext()).enablePendingPurchases().setListener(this).build();
        a.r(build, "build(...)");
        this.billingClient = build;
        this.debounceDelayTime = 1000L;
        this.billingClientReady = a.b();
        this.isPremiumDeferred = a.b();
    }

    public final Object attemptConnect(g gVar) {
        final l lVar = new l(1, f0.r(gVar));
        lVar.p();
        this.billingClient.startConnection(new BillingClientStateListener() { // from class: com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel$attemptConnect$2$listener$1
            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingServiceDisconnected() {
                if (lVar.isActive()) {
                    lVar.resumeWith(Boolean.FALSE);
                }
            }

            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingSetupFinished(@NotNull BillingResult billingResult) {
                a.s(billingResult, "billingResult");
                if (billingResult.getResponseCode() == 0) {
                    e.v(ViewModelKt.a(IAPViewModel.this), null, 0, new IAPViewModel$attemptConnect$2$listener$1$onBillingSetupFinished$1(lVar, IAPViewModel.this, null), 3);
                } else if (lVar.isActive()) {
                    lVar.resumeWith(Boolean.FALSE);
                }
            }
        });
        Object o2 = lVar.o();
        i0.a aVar = i0.a.f30806a;
        return o2;
    }

    public final long calculateBackoffDelay(int i2) {
        return Math.min(((long) Math.pow(2.0d, i2)) * 1000, 60000L);
    }

    public final void connectToPlayBillingService() {
        if (!this.billingClient.isReady()) {
            this.billingClient.startConnection(this);
            return;
        }
        ((s) this.billingClientReady).Z(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchDataRemoteConfig(h0.g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel$fetchDataRemoteConfig$1
            if (r0 == 0) goto L13
            r0 = r5
            com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel$fetchDataRemoteConfig$1 r0 = (com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel$fetchDataRemoteConfig$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel$fetchDataRemoteConfig$1 r0 = new com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel$fetchDataRemoteConfig$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel r0 = (com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel) r0
            kotlin.jvm.internal.q.m(r5)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.jvm.internal.q.m(r5)
            com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService r5 = r4.remoteConfigService
            com.cooldev.gba.emulator.gameboy.network.services.remote_config.PaywallSettingsConfig r5 = r5.getPaywallSettingsConfig()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.getValueIsFreeYearly(r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel$fetchDataRemoteConfig$2 r1 = new com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel$fetchDataRemoteConfig$2
            r1.<init>(r5)
            r0.updateState(r1)
            d0.b0 r5 = d0.b0.f30125a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel.fetchDataRemoteConfig(h0.g):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchSkuDetailsAndUpdateList(com.android.billingclient.api.SkuDetailsParams r10, h0.g r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel$fetchSkuDetailsAndUpdateList$1
            if (r0 == 0) goto L13
            r0 = r11
            com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel$fetchSkuDetailsAndUpdateList$1 r0 = (com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel$fetchSkuDetailsAndUpdateList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel$fetchSkuDetailsAndUpdateList$1 r0 = new com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel$fetchSkuDetailsAndUpdateList$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            d0.b0 r3 = d0.b0.f30125a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L48
            if (r2 == r6) goto L40
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L33
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            java.lang.Object r10 = r0.L$0
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            kotlin.jvm.internal.q.m(r11)
            goto La7
        L3b:
            java.lang.Object r10 = r0.L$0
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            goto L44
        L40:
            java.lang.Object r10 = r0.L$0
            d0.b0 r10 = (d0.b0) r10
        L44:
            kotlin.jvm.internal.q.m(r11)
            goto L98
        L48:
            kotlin.jvm.internal.q.m(r11)
            b1.s r11 = p0.a.b()
            e1.m0 r2 = r9._state     // Catch: java.lang.Throwable -> L72
            e1.i1 r2 = (e1.i1) r2     // Catch: java.lang.Throwable -> L72
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L72
            com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState r2 = (com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState) r2     // Catch: java.lang.Throwable -> L72
            java.util.List r2 = r2.getListBilling()     // Catch: java.lang.Throwable -> L72
            com.android.billingclient.api.BillingClient r7 = r9.billingClient     // Catch: java.lang.Throwable -> L72
            androidx.transition.a r8 = new androidx.transition.a     // Catch: java.lang.Throwable -> L72
            r8.<init>(r9, r6, r11, r2)     // Catch: java.lang.Throwable -> L72
            r7.querySkuDetailsAsync(r10, r8)     // Catch: java.lang.Throwable -> L72
            r0.L$0 = r3
            r0.label = r6
            java.lang.Object r10 = r11.t(r0)
            if (r10 != r1) goto L98
            return r1
        L72:
            r10 = move-exception
            com.cooldev.gba.emulator.gameboy.network.repo.SlackApiRepositoryImpl r2 = new com.cooldev.gba.emulator.gameboy.network.repo.SlackApiRepositoryImpl     // Catch: java.lang.Throwable -> L99
            r2.<init>()     // Catch: java.lang.Throwable -> L99
            com.cooldev.gba.emulator.gameboy.network.models.SlackMessage$Factory r6 = com.cooldev.gba.emulator.gameboy.network.models.SlackMessage.Factory     // Catch: java.lang.Throwable -> L99
            com.cooldev.gba.emulator.gameboy.network.models.SlackMessage r10 = r6.template(r10)     // Catch: java.lang.Throwable -> L99
            r2.sendMessageToSlack(r10)     // Catch: java.lang.Throwable -> L99
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L99
            boolean r10 = r11.Z(r10)     // Catch: java.lang.Throwable -> L99
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L99
            r0.L$0 = r10
            r0.label = r5
            java.lang.Object r10 = r11.t(r0)
            i0.a r11 = i0.a.f30806a
            if (r10 != r1) goto L98
            return r1
        L98:
            return r3
        L99:
            r10 = move-exception
            r0.L$0 = r10
            r0.label = r4
            java.lang.Object r11 = r11.t(r0)
            i0.a r0 = i0.a.f30806a
            if (r11 != r1) goto La7
            return r1
        La7:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel.fetchSkuDetailsAndUpdateList(com.android.billingclient.api.SkuDetailsParams, h0.g):java.lang.Object");
    }

    public static final void fetchSkuDetailsAndUpdateList$lambda$6$lambda$5(IAPViewModel iAPViewModel, r rVar, List list, BillingResult billingResult, List list2) {
        a.s(iAPViewModel, "this$0");
        a.s(rVar, "$deferred");
        a.s(list, "$currentList");
        a.s(billingResult, "<anonymous parameter 0>");
        List list3 = list2;
        if (list3 == null || list3.isEmpty()) {
            return;
        }
        Log.i(TAG, "skuDetailsList- " + list2);
        iAPViewModel.updateState(new IAPViewModel$fetchSkuDetailsAndUpdateList$2$1$1(list, list2));
        ((s) rVar).Z(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getCurrentPurchased(h0.g r8) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel.getCurrentPurchased(h0.g):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x011b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getInfoBilling(h0.g r11) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel.getInfoBilling(h0.g):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.jvm.internal.b0] */
    private final boolean handlePurchase(Purchase purchase) {
        int purchaseState = purchase.getPurchaseState();
        if (purchaseState == 0) {
            updatePurchaseState(PurchaseState.Error.INSTANCE);
        } else if (purchaseState != 1) {
            if (purchaseState != 2) {
                updatePurchaseState(PurchaseState.Error.INSTANCE);
            } else {
                updatePurchaseState(PurchaseState.Pending.INSTANCE);
            }
        } else {
            if (purchase.isAcknowledged()) {
                updatePurchaseState(PurchaseState.PurchasedAndAcknowledged.INSTANCE);
                updateState(new IAPViewModel$handlePurchase$1(purchase));
                return true;
            }
            PublicSignedData publicSignedData = PublicSignedData.INSTANCE;
            String originalJson = purchase.getOriginalJson();
            a.r(originalJson, "getOriginalJson(...)");
            String signature = purchase.getSignature();
            a.r(signature, "getSignature(...)");
            if (publicSignedData.verifyPurchase(originalJson, signature)) {
                ?? obj = new Object();
                e.v(ViewModelKt.a(this), null, 0, new IAPViewModel$handlePurchase$2(this, purchase, obj, null), 3);
                return obj.f30919a;
            }
        }
        return false;
    }

    public static /* synthetic */ Object retryConnectBillingClient$default(IAPViewModel iAPViewModel, q0.a aVar, q0.a aVar2, g gVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = IAPViewModel$retryConnectBillingClient$2.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            aVar2 = IAPViewModel$retryConnectBillingClient$3.INSTANCE;
        }
        return iAPViewModel.retryConnectBillingClient(aVar, aVar2, gVar);
    }

    public final void updatePurchaseState(PurchaseState purchaseState) {
        PurchaseState purchaseState2 = ((IAPState) ((i1) this._state).getValue()).getPurchaseState();
        PurchaseState.PurchasedAndAcknowledged purchasedAndAcknowledged = PurchaseState.PurchasedAndAcknowledged.INSTANCE;
        if (a.g(purchaseState2, purchasedAndAcknowledged)) {
            ((s) this.isPremiumDeferred).Z(Boolean.TRUE);
        } else {
            updateState(new IAPViewModel$updatePurchaseState$1(purchaseState));
            boolean g2 = a.g(purchaseState, purchasedAndAcknowledged);
            updateState(new IAPViewModel$updatePurchaseState$2(g2));
            ((s) this.isPremiumDeferred).Z(Boolean.valueOf(g2));
        }
    }

    public final void updateState(q0.l lVar) {
        i1 i1Var;
        Object value;
        m0 m0Var = this._state;
        do {
            i1Var = (i1) m0Var;
            value = i1Var.getValue();
        } while (!i1Var.g(value, lVar.invoke(value)));
    }

    @NotNull
    public final g1 getState() {
        return this.state;
    }

    public final void launchPurchaseFlow(@Nullable SkuDetails skuDetails, @NotNull MainActivity mainActivity, @NotNull Context context) {
        a.s(mainActivity, "activity");
        a.s(context, "context");
        if (System.currentTimeMillis() - this.lastClickTime < this.debounceDelayTime) {
            return;
        }
        this.lastClickTime = System.currentTimeMillis();
        if (skuDetails == null || ((IAPState) ((i1) this._state).getValue()).getBillings().isEmpty()) {
            Typeface typeface = b0.a.f22277a;
            b0.a.a(context, "Please select a package before proceeding with the purchase.", AppCompatResources.a(context, 2131231101), ContextCompat.getColor(context, R.color.warningColor), ContextCompat.getColor(context, R.color.defaultTextColor)).show();
            return;
        }
        try {
            BillingFlowParams build = BillingFlowParams.newBuilder().setSkuDetails(skuDetails).build();
            a.r(build, "build(...)");
            BillingResult launchBillingFlow = this.billingClient.launchBillingFlow(mainActivity, build);
            a.r(launchBillingFlow, "launchBillingFlow(...)");
            if (launchBillingFlow.getResponseCode() != 0) {
                b0.a.b(context, "Payment failed, please try again").show();
            }
        } catch (Throwable th) {
            new SlackApiRepositoryImpl().sendMessageToSlack(SlackMessage.Factory.template(th));
            b0.a.b(context, "An unexpected error occurred. Please try again later.").show();
        }
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingServiceDisconnected() {
        ((s) this.billingClientReady).Z(Boolean.FALSE);
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingSetupFinished(@NotNull BillingResult billingResult) {
        a.s(billingResult, "billingResult");
        if (billingResult.getResponseCode() == 0) {
            e.v(ViewModelKt.a(this), null, 0, new IAPViewModel$onBillingSetupFinished$1(this, null), 3);
            return;
        }
        ((s) this.billingClientReady).Z(Boolean.FALSE);
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(@NotNull BillingResult billingResult, @Nullable List<? extends Purchase> list) {
        List<? extends Purchase> list2;
        a.s(billingResult, "billingResult");
        if (billingResult.getResponseCode() != 0 || (list2 = list) == null || list2.isEmpty()) {
            updatePurchaseState(PurchaseState.Error.INSTANCE);
            return;
        }
        Iterator<? extends Purchase> it = list.iterator();
        while (it.hasNext() && !handlePurchase(it.next())) {
        }
    }

    @Nullable
    public final Object retryConnectBillingClient(@NotNull q0.a aVar, @NotNull q0.a aVar2, @NotNull g gVar) {
        Object G = e.G(gVar, b1.o0.f22356b, new IAPViewModel$retryConnectBillingClient$4(this, aVar, aVar2, null));
        return G == i0.a.f30806a ? G : b0.f30125a;
    }

    @Nullable
    public final Object waitForPurchaseLoading(@NotNull g gVar) {
        return e.G(gVar, b1.o0.f22356b, new IAPViewModel$waitForPurchaseLoading$2(this, null));
    }
}
