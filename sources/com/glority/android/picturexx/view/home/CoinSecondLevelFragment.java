package com.glority.android.picturexx.view.home;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.cmsui.entity.LikeItem;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.FragmentCoinSecondLevelBinding;
import com.glority.android.picturexx.utils.RatingUtils;
import com.glority.android.picturexx.view.home.CoinSecondLevelFragment;
import com.glority.android.picturexx.view.search.SearchCmsDetailFragment;
import com.glority.android.picturexx.vm.CoinSecondLevelViewModel;
import com.glority.android.ui.base.ContainerActivity;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.fragment.BaseFragment;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.app.ResUtils;
import com.glority.widget.GlLoadingLayout;
import com.picturecoin.generatedAPI.kotlinAPI.cmsconsumer.CoinHomeGetMessage;
import com.picturecoin.generatedAPI.kotlinAPI.cmsconsumer.CoinInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CoinSecondLevelFragment.kt */
@Metadata(d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u000b\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\bH\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/glority/android/picturexx/view/home/CoinSecondLevelFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentCoinSecondLevelBinding;", "<init>", "()V", "vm", "Lcom/glority/android/picturexx/vm/CoinSecondLevelViewModel;", Args.indexListUid, "", Args.title, "coinAdapter", "com/glority/android/picturexx/view/home/CoinSecondLevelFragment$coinAdapter$1", "Lcom/glority/android/picturexx/view/home/CoinSecondLevelFragment$coinAdapter$1;", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "initData", "initView", "getLogPageName", "getLayoutId", "", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CoinSecondLevelFragment extends BaseFragment<FragmentCoinSecondLevelBinding> {
    private static final String TITLE = "arg_title";
    private static final String UID = "arg_uid";
    private final CoinSecondLevelFragment$coinAdapter$1 coinAdapter;
    private String indexListUid = "";
    private String title = "";
    private CoinSecondLevelViewModel vm;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.glority.android.picturexx.view.home.CoinSecondLevelFragment$coinAdapter$1] */
    public CoinSecondLevelFragment() {
        final int i = R.layout.item_second_level_coin;
        this.coinAdapter = new BaseQuickAdapter<CoinInfo, BaseViewHolder>(i) { // from class: com.glority.android.picturexx.view.home.CoinSecondLevelFragment$coinAdapter$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.glority.android.adapterhelper.BaseQuickAdapter
            public void convert(BaseViewHolder helper, CoinInfo item) {
                Intrinsics.checkNotNullParameter(helper, "helper");
                Intrinsics.checkNotNullParameter(item, "item");
                Glide.with(helper.itemView.getContext()).load(item.getMainImageUrl()).placeholder(R.drawable.icon_img_place_holder).into((ImageView) helper.getView(R.id.iv_img));
                ((TextView) helper.getView(R.id.tv_name)).setText(item.getCommonName());
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FragmentCoinSecondLevelBinding access$getBinding(CoinSecondLevelFragment coinSecondLevelFragment) {
        return (FragmentCoinSecondLevelBinding) coinSecondLevelFragment.getBinding();
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        this.vm = (CoinSecondLevelViewModel) getViewModel(CoinSecondLevelViewModel.class);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.indexListUid = arguments.getString(UID, "");
            this.title = arguments.getString("arg_title", "");
            updateCommonEventArgs(TuplesKt.to(LogEventArguments.ARG_STRING_1, this.indexListUid), TuplesKt.to("type", LikeItem.DISLIKE));
        }
        if (this.indexListUid.length() == 0) {
            ViewExtensionsKt.finish(this);
        }
        initView();
        initData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void initData() {
        ((FragmentCoinSecondLevelBinding) getBinding()).loadingLayout.showLoading();
        CoinSecondLevelViewModel coinSecondLevelViewModel = this.vm;
        if (coinSecondLevelViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            coinSecondLevelViewModel = null;
        }
        coinSecondLevelViewModel.getCoinList(this.indexListUid).observe(this, new CoinSecondLevelFragment$sam$androidx_lifecycle_Observer$0(new Function1<Resource<? extends CoinHomeGetMessage>, Unit>() { // from class: com.glority.android.picturexx.view.home.CoinSecondLevelFragment$initData$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends CoinHomeGetMessage> resource) {
                invoke2((Resource<CoinHomeGetMessage>) resource);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Resource<CoinHomeGetMessage> resource) {
                CoinSecondLevelFragment$coinAdapter$1 coinSecondLevelFragment$coinAdapter$1;
                List<CoinInfo> coinInfoList;
                ArrayList arrayList = null;
                if (resource.getStatus() == Status.SUCCESS) {
                    CoinSecondLevelFragment.access$getBinding(CoinSecondLevelFragment.this).loadingLayout.loadingDone();
                    CoinHomeGetMessage data = resource.getData();
                    if (data != null && (coinInfoList = data.getCoinInfoList()) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : coinInfoList) {
                            if (((CoinInfo) obj).getMainImageUrl().length() > 0) {
                                arrayList2.add(obj);
                            }
                        }
                        arrayList = arrayList2;
                    }
                    coinSecondLevelFragment$coinAdapter$1 = CoinSecondLevelFragment.this.coinAdapter;
                    coinSecondLevelFragment$coinAdapter$1.setNewData(arrayList);
                    return;
                }
                if (resource.getStatus() == Status.ERROR) {
                    GlLoadingLayout.showError$default(CoinSecondLevelFragment.access$getBinding(CoinSecondLevelFragment.this).loadingLayout, null, 1, null);
                }
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((FragmentCoinSecondLevelBinding) getBinding()).naviBar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.home.CoinSecondLevelFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoinSecondLevelFragment.initView$lambda$1(CoinSecondLevelFragment.this, view);
            }
        });
        ((FragmentCoinSecondLevelBinding) getBinding()).naviBar.toolbar.setTitle(this.title);
        CoinSecondLevelFragment$coinAdapter$1 coinSecondLevelFragment$coinAdapter$1 = this.coinAdapter;
        RecyclerView rv = ((FragmentCoinSecondLevelBinding) getBinding()).rv;
        Intrinsics.checkNotNullExpressionValue(rv, "rv");
        coinSecondLevelFragment$coinAdapter$1.bindToRecyclerView(rv);
        TextView textView = new TextView(getContext());
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) ResUtils.getDimension(R.dimen.x100)));
        BaseQuickAdapter.addFooterView$default(this.coinAdapter, textView, 0, 0, 6, null);
        setOnItemClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.android.picturexx.view.home.CoinSecondLevelFragment$initView$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, Integer num) {
                invoke(baseQuickAdapter, view, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, int i) {
                CoinSecondLevelFragment$coinAdapter$1 coinSecondLevelFragment$coinAdapter$12;
                Intrinsics.checkNotNullParameter(baseQuickAdapter, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "view");
                coinSecondLevelFragment$coinAdapter$12 = CoinSecondLevelFragment.this.coinAdapter;
                CoinInfo coinInfo = coinSecondLevelFragment$coinAdapter$12.getData().get(i);
                CoinInfo coinInfo2 = coinInfo instanceof CoinInfo ? coinInfo : null;
                if (coinInfo2 != null) {
                    CoinSecondLevelFragment coinSecondLevelFragment = CoinSecondLevelFragment.this;
                    if (coinInfo2.getUid().length() > 0) {
                        RatingUtils.INSTANCE.recordPageCount(RatingUtils.FROM_COIN_GUIDE);
                        coinSecondLevelFragment.logEvent(LogEvents.guidecoin_nextlevel_click, BundleKt.bundleOf(TuplesKt.to("id", coinInfo2.getUid())));
                        SearchCmsDetailFragment.Companion companion = SearchCmsDetailFragment.INSTANCE;
                        FragmentActivity activity = coinSecondLevelFragment.getActivity();
                        if (activity == null) {
                            return;
                        }
                        companion.openByUid(activity, coinInfo2.getUid(), (r18 & 4) != 0 ? null : coinSecondLevelFragment.getPageName(), (r18 & 8) != 0 ? null : coinSecondLevelFragment.getPageName(), (r18 & 16) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null);
                        return;
                    }
                    String indexListUid = coinInfo2.getIndexListUid();
                    if (indexListUid != null) {
                        coinSecondLevelFragment.logEvent(LogEvents.guidecoin_nextlevel_click, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to(LogEventArguments.ARG_STRING_2, indexListUid)));
                        CoinSecondLevelFragment.Companion companion2 = CoinSecondLevelFragment.INSTANCE;
                        Context context = view.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        companion2.open(context, indexListUid, coinInfo2.getCommonName());
                    }
                }
            }
        });
        ((FragmentCoinSecondLevelBinding) getBinding()).loadingLayout.setCallback(new GlLoadingLayout.Callback() { // from class: com.glority.android.picturexx.view.home.CoinSecondLevelFragment$initView$3
            @Override // com.glority.widget.GlLoadingLayout.Callback
            public void loadData() {
                CoinSecondLevelFragment.this.initData();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(CoinSecondLevelFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this$0, LogEvents.guidecoin_close_click, null, 2, null);
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    public String getPageName() {
        return LogEvents.guidecoin;
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_coin_second_level;
    }

    /* compiled from: CoinSecondLevelFragment.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/glority/android/picturexx/view/home/CoinSecondLevelFragment$Companion;", "", "<init>", "()V", "UID", "", "TITLE", "open", "", "context", "Landroid/content/Context;", Args.indexListUid, Args.title, "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void open(Context context, String indexListUid, String title) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(indexListUid, "indexListUid");
            Intrinsics.checkNotNullParameter(title, "title");
            ContainerActivity.INSTANCE.open(CoinSecondLevelFragment.class).put(CoinSecondLevelFragment.UID, indexListUid).put("arg_title", title).launch(context);
        }
    }
}
