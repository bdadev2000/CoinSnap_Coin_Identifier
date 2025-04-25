package com.glority.android.picturexx.view.me;

import android.content.Context;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.FragmentCustomMeCollectionBinding;
import com.glority.android.picturexx.view.me.MeCollectionFragment;
import com.glority.android.picturexx.view.settings.CustomSettingsFragment;
import com.glority.android.picturexx.views.CollectionFunctionZoneView;
import com.glority.android.picturexx.views.CollectionPageSwitchView;
import com.glority.android.picturexx.vm.NoteSnapViewModel;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.fragment.BaseFragment;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MeCollectionFragment.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0002R\u001f\u0010\u0005\u001a\u00060\u0006R\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR)\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/glority/android/picturexx/view/me/MeCollectionFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentCustomMeCollectionBinding;", "<init>", "()V", "adapter", "Lcom/glority/android/picturexx/view/me/MeCollectionFragment$PagerAdapter;", "getAdapter", "()Lcom/glority/android/picturexx/view/me/MeCollectionFragment$PagerAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "fragments", "", "Landroidx/databinding/ViewDataBinding;", "getFragments", "()Ljava/util/List;", "fragments$delegate", "getLogPageName", "", "getLayoutId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "doCreateView", "initAdapter", "addSubscriptions", "PagerAdapter", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class MeCollectionFragment extends BaseFragment<FragmentCustomMeCollectionBinding> {
    public static final int $stable = 8;

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final Lazy adapter = LazyKt.lazy(new Function0<PagerAdapter>() { // from class: com.glority.android.picturexx.view.me.MeCollectionFragment$adapter$2
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final MeCollectionFragment.PagerAdapter invoke() {
            return new MeCollectionFragment.PagerAdapter();
        }
    });

    /* renamed from: fragments$delegate, reason: from kotlin metadata */
    private final Lazy fragments = LazyKt.lazy(new Function0<List<? extends BaseFragment<? extends ViewDataBinding>>>() { // from class: com.glority.android.picturexx.view.me.MeCollectionFragment$fragments$2
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends BaseFragment<? extends ViewDataBinding>> invoke() {
            return CollectionsKt.listOf((Object[]) new BaseFragment[]{new MeCollectionSummaryFragment(), new MeCollectionAllFragment(), new MeCollectionSetsFragment()});
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FragmentCustomMeCollectionBinding access$getBinding(MeCollectionFragment meCollectionFragment) {
        return (FragmentCustomMeCollectionBinding) meCollectionFragment.getBinding();
    }

    private final PagerAdapter getAdapter() {
        return (PagerAdapter) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<BaseFragment<? extends ViewDataBinding>> getFragments() {
        return (List) this.fragments.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    public String getPageName() {
        return LogEvents.me;
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_custom_me_collection;
    }

    @Override // com.glority.base.fragment.BaseFragment, com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this, LogEvents.Me_Show, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        ((FragmentCustomMeCollectionBinding) getBinding()).headerFunctionZone.setZoneItemClickListener(new CollectionFunctionZoneView.ZoneItemClickListener() { // from class: com.glority.android.picturexx.view.me.MeCollectionFragment$doCreateView$1
            @Override // com.glority.android.picturexx.views.CollectionFunctionZoneView.ZoneItemClickListener
            public void onSearchClick() {
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(MeCollectionFragment.this, LogEvents.me_topsearch_click, null, 2, null);
                ViewExtensionsKt.navigate$default(MeCollectionFragment.this, R.id.action_mainFragment_to_collectionSearchFragment, BundleKt.bundleOf(TuplesKt.to("from", MeCollectionFragment.this.getPageName())), null, null, 12, null);
            }

            @Override // com.glority.android.picturexx.views.CollectionFunctionZoneView.ZoneItemClickListener
            public void onWishClick() {
                ViewExtensionsKt.navigate$default(MeCollectionFragment.this, R.id.action_mainFragment_to_wishListFragment, null, null, null, 14, null);
            }

            @Override // com.glority.android.picturexx.views.CollectionFunctionZoneView.ZoneItemClickListener
            public void onHistoryClick() {
                ViewExtensionsKt.navigate$default(MeCollectionFragment.this, R.id.action_mainFragment_to_snapHistoryListFragment, null, null, null, 14, null);
            }

            @Override // com.glority.android.picturexx.views.CollectionFunctionZoneView.ZoneItemClickListener
            public void onSettingClick() {
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(MeCollectionFragment.this, LogEvents.me_settings_click, null, 2, null);
                Context context = MeCollectionFragment.this.getContext();
                if (context == null) {
                    return;
                }
                CustomSettingsFragment.Companion.open(context);
            }
        });
        ((FragmentCustomMeCollectionBinding) getBinding()).pageSwitchView.setOnPageSwitchListener(new CollectionPageSwitchView.OnPageSwitchListener() { // from class: com.glority.android.picturexx.view.me.MeCollectionFragment$$ExternalSyntheticLambda0
            @Override // com.glority.android.picturexx.views.CollectionPageSwitchView.OnPageSwitchListener
            public final void onPageSwitch(int i) {
                MeCollectionFragment.doCreateView$lambda$0(MeCollectionFragment.this, i);
            }
        });
        initAdapter();
        addSubscriptions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void doCreateView$lambda$0(MeCollectionFragment this$0, int i) {
        String str;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 0) {
            str = "Summary";
        } else if (i == 1) {
            str = "All";
        } else if (i == 2) {
            str = "Sets";
        } else {
            str = "";
        }
        this$0.logEvent(LogEvents.Me_Tab_Click, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("type", str)));
        ((FragmentCustomMeCollectionBinding) this$0.getBinding()).viewPager.setCurrentItem(i, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initAdapter() {
        ((FragmentCustomMeCollectionBinding) getBinding()).viewPager.setAdapter(getAdapter());
        ((FragmentCustomMeCollectionBinding) getBinding()).viewPager.setNoScroll(true);
        ((FragmentCustomMeCollectionBinding) getBinding()).viewPager.setOffscreenPageLimit(3);
    }

    private final void addSubscriptions() {
        NoteSnapViewModel.INSTANCE.getNoteSnapRedDotVisibleLiveData().observe(this, new MeCollectionFragment$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionFragment$addSubscriptions$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke2(bool);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool) {
                CollectionFunctionZoneView collectionFunctionZoneView = MeCollectionFragment.access$getBinding(MeCollectionFragment.this).headerFunctionZone;
                Intrinsics.checkNotNull(bool);
                collectionFunctionZoneView.setRedDotVisibility(bool.booleanValue());
            }
        }));
    }

    /* compiled from: MeCollectionFragment.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Lcom/glority/android/picturexx/view/me/MeCollectionFragment$PagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "<init>", "(Lcom/glority/android/picturexx/view/me/MeCollectionFragment;)V", "getCount", "", "getItem", "Landroidx/fragment/app/Fragment;", "position", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public final class PagerAdapter extends FragmentPagerAdapter {
        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return 3;
        }

        public PagerAdapter() {
            super(MeCollectionFragment.this.getSupportFragmentManager(), 1);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int position) {
            return (Fragment) MeCollectionFragment.this.getFragments().get(position);
        }
    }
}
