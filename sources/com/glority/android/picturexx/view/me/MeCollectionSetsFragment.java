package com.glority.android.picturexx.view.me;

import android.os.Bundle;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.FragmentMeCollectionSetsBinding;
import com.glority.android.picturexx.view.me.MeCollectionSetsFragment;
import com.glority.android.picturexx.views.CollectionSetsTabView;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.fragment.BaseFragment;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MeCollectionSetsFragment.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0016H\u0002R)\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001f\u0010\f\u001a\u00060\rR\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/glority/android/picturexx/view/me/MeCollectionSetsFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentMeCollectionSetsBinding;", "<init>", "()V", "fragments", "", "Landroidx/databinding/ViewDataBinding;", "getFragments", "()Ljava/util/List;", "fragments$delegate", "Lkotlin/Lazy;", "pagerAdapter", "Lcom/glority/android/picturexx/view/me/MeCollectionSetsFragment$PagerAdapter;", "getPagerAdapter", "()Lcom/glority/android/picturexx/view/me/MeCollectionSetsFragment$PagerAdapter;", "pagerAdapter$delegate", "getLogPageName", "", "getLayoutId", "", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "initViewPager", "PagerAdapter", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class MeCollectionSetsFragment extends BaseFragment<FragmentMeCollectionSetsBinding> {
    public static final int $stable = 8;

    /* renamed from: fragments$delegate, reason: from kotlin metadata */
    private final Lazy fragments = LazyKt.lazy(new Function0<List<? extends BaseFragment<? extends ViewDataBinding>>>() { // from class: com.glority.android.picturexx.view.me.MeCollectionSetsFragment$fragments$2
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends BaseFragment<? extends ViewDataBinding>> invoke() {
            return CollectionsKt.listOf((Object[]) new BaseFragment[]{new MeCollectionMySetsPageFragment(), new MeCollectionOfficialSetsPageFragment()});
        }
    });

    /* renamed from: pagerAdapter$delegate, reason: from kotlin metadata */
    private final Lazy pagerAdapter = LazyKt.lazy(new Function0<PagerAdapter>() { // from class: com.glority.android.picturexx.view.me.MeCollectionSetsFragment$pagerAdapter$2
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final MeCollectionSetsFragment.PagerAdapter invoke() {
            return new MeCollectionSetsFragment.PagerAdapter();
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FragmentMeCollectionSetsBinding access$getBinding(MeCollectionSetsFragment meCollectionSetsFragment) {
        return (FragmentMeCollectionSetsBinding) meCollectionSetsFragment.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<BaseFragment<? extends ViewDataBinding>> getFragments() {
        return (List) this.fragments.getValue();
    }

    private final PagerAdapter getPagerAdapter() {
        return (PagerAdapter) this.pagerAdapter.getValue();
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    protected String getPageName() {
        return "mesets";
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_me_collection_sets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        initViewPager();
        ((FragmentMeCollectionSetsBinding) getBinding()).tabView.setTabIndex(0);
        ((FragmentMeCollectionSetsBinding) getBinding()).tabView.setOnTabClickListener(new CollectionSetsTabView.OnTabClickListener() { // from class: com.glority.android.picturexx.view.me.MeCollectionSetsFragment$$ExternalSyntheticLambda0
            @Override // com.glority.android.picturexx.views.CollectionSetsTabView.OnTabClickListener
            public final void onTabClick(int i) {
                MeCollectionSetsFragment.doCreateView$lambda$0(MeCollectionSetsFragment.this, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void doCreateView$lambda$0(MeCollectionSetsFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Pair[] pairArr = new Pair[1];
        pairArr[0] = TuplesKt.to("type", i == 0 ? "mysets" : "officialsets");
        this$0.logEvent(LogEvents.Me_Sets_Switch_Click, LogEventArgumentsKt.logEventBundleOf(pairArr));
        ((FragmentMeCollectionSetsBinding) this$0.getBinding()).viewPager.setCurrentItem(i, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initViewPager() {
        ((FragmentMeCollectionSetsBinding) getBinding()).viewPager.setAdapter(getPagerAdapter());
        ((FragmentMeCollectionSetsBinding) getBinding()).viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.glority.android.picturexx.view.me.MeCollectionSetsFragment$initViewPager$1
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int state) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int position) {
                MeCollectionSetsFragment.access$getBinding(MeCollectionSetsFragment.this).tabView.setTabIndex(position);
            }
        });
    }

    /* compiled from: MeCollectionSetsFragment.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Lcom/glority/android/picturexx/view/me/MeCollectionSetsFragment$PagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "<init>", "(Lcom/glority/android/picturexx/view/me/MeCollectionSetsFragment;)V", "getCount", "", "getItem", "Landroidx/fragment/app/Fragment;", "position", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public final class PagerAdapter extends FragmentPagerAdapter {
        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return 2;
        }

        public PagerAdapter() {
            super(MeCollectionSetsFragment.this.getSupportFragmentManager(), 1);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int position) {
            Object obj = (BaseFragment) CollectionsKt.getOrNull(MeCollectionSetsFragment.this.getFragments(), position);
            if (obj == null) {
                obj = CollectionsKt.first((List<? extends Object>) MeCollectionSetsFragment.this.getFragments());
            }
            return (Fragment) obj;
        }
    }
}
