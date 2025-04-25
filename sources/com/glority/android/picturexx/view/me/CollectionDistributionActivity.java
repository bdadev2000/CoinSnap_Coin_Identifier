package com.glority.android.picturexx.view.me;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.glority.android.core.app.AppContext;
import com.glority.android.picturexx.business.databinding.ActivityCollectionDistributionBinding;
import com.glority.android.ui.base.v2.BaseActivity;
import com.glority.base.abtest.CoinAbTestUtils;
import com.glority.utils.stability.LogUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.picturecoin.generatedAPI.kotlinAPI.collection.CollectionCountrySummary;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectionDistributionActivity.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000b\u001a\u00020\u0002H\u0014J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0006\u0010\u0010\u001a\u00020\bJ\b\u0010\u0011\u001a\u00020\bH\u0016¨\u0006\u0013"}, d2 = {"Lcom/glority/android/picturexx/view/me/CollectionDistributionActivity;", "Lcom/glority/android/ui/base/v2/BaseActivity;", "Lcom/glority/android/picturexx/business/databinding/ActivityCollectionDistributionBinding;", "<init>", "()V", "getLogPageName", "", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "getViewBinding", "addFragment", "fragment", "Landroidx/fragment/app/Fragment;", "tag", "openCollectionDetailFragment", "onBackPressed", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CollectionDistributionActivity extends BaseActivity<ActivityCollectionDistributionBinding> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final void start(Activity activity, List<CollectionCountrySummary> list, String str) {
        INSTANCE.start(activity, list, str);
    }

    /* compiled from: CollectionDistributionActivity.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¨\u0006\r"}, d2 = {"Lcom/glority/android/picturexx/view/me/CollectionDistributionActivity$Companion;", "", "<init>", "()V", "start", "", "activity", "Landroid/app/Activity;", "issuerCountrySummaries", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/CollectionCountrySummary;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void start(Activity activity, List<CollectionCountrySummary> issuerCountrySummaries, String countryCode) {
            Intrinsics.checkNotNullParameter(issuerCountrySummaries, "issuerCountrySummaries");
            if (activity == null) {
                return;
            }
            CollectionDistributionFragment.INSTANCE.setIssuerCountrySummaries(issuerCountrySummaries);
            CollectionDistributionFragment.INSTANCE.setIssuerCountryCode(countryCode);
            CollectionDistributionListFragment.INSTANCE.setIssuerCountrySummaries(issuerCountrySummaries);
            CollectionDistributionListFragment.INSTANCE.setIssuerCountryCode(countryCode);
            activity.startActivity(new Intent(activity, (Class<?>) CollectionDistributionActivity.class));
        }
    }

    @Override // com.glority.android.ui.base.v2.BaseActivity
    protected String getLogPageName() {
        return "collection_distribution";
    }

    @Override // com.glority.android.ui.base.v2.BaseActivity
    protected void doCreateView(Bundle savedInstanceState) {
        if (CoinAbTestUtils.INSTANCE.enableCoinDistributionMap()) {
            CollectionDistributionFragment collectionDistributionFragment = new CollectionDistributionFragment();
            Intrinsics.checkNotNullExpressionValue("CollectionDistributionFragment", "getSimpleName(...)");
            addFragment(collectionDistributionFragment, "CollectionDistributionFragment");
        } else {
            CollectionDistributionListFragment collectionDistributionListFragment = new CollectionDistributionListFragment();
            Intrinsics.checkNotNullExpressionValue("CollectionDistributionListFragment", "getSimpleName(...)");
            addFragment(collectionDistributionListFragment, "CollectionDistributionListFragment");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseActivity
    public ActivityCollectionDistributionBinding getViewBinding() {
        ActivityCollectionDistributionBinding inflate = ActivityCollectionDistributionBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    private final void addFragment(Fragment fragment, String tag) {
        try {
            Integer.valueOf(getSupportFragmentManager().beginTransaction().add(getBinding().fragmentContainer.getId(), fragment, tag).commitAllowingStateLoss());
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    public final void openCollectionDetailFragment() {
        try {
            Integer.valueOf(getSupportFragmentManager().beginTransaction().add(getBinding().fragmentContainer.getId(), new CollectDetailFragment(), "CollectDetailFragment").commitAllowingStateLoss());
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("CollectDetailFragment");
        if (findFragmentByTag != null) {
            try {
                Integer.valueOf(getSupportFragmentManager().beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss());
                return;
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                    return;
                }
                return;
            }
        }
        super.onBackPressed();
    }
}
