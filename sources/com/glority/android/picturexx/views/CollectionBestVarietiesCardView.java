package com.glority.android.picturexx.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.Glide;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.ViewMeCollectionSummaryBestVarietiesBinding;
import com.glority.android.picturexx.utils.PriceUtils;
import com.glority.utils.app.ResUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.picturecoin.generatedAPI.kotlinAPI.collection.BestCollection;
import com.picturecoin.generatedAPI.kotlinAPI.collection.Collection;
import com.picturecoin.generatedAPI.kotlinAPI.enums.BestCollectionType;
import com.picturecoin.generatedAPI.kotlinAPI.model.PriceValue;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* compiled from: CollectionBestVarietiesCardView.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0002&'B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0017J\u001f\u0010\u001f\u001a\u00020\u001d2\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\"0!\"\u00020\"¢\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\u0011H\u0002J\b\u0010%\u001a\u00020\u001dH\u0014R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u0019\u001a\r\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/glority/android/picturexx/views/CollectionBestVarietiesCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "moreButton", "Landroidx/appcompat/widget/AppCompatImageView;", "getMoreButton", "()Landroidx/appcompat/widget/AppCompatImageView;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "scrollJob", "Lkotlinx/coroutines/Job;", "adapter", "Lcom/glority/android/picturexx/views/CollectionBestVarietiesCardView$CollectionPagerAdapter;", "binding", "Lcom/glority/android/picturexx/business/databinding/ViewMeCollectionSummaryBestVarietiesBinding;", "onBestVarietiesClickListener", "Lcom/glority/android/picturexx/views/OnBestVarietiesClickListener;", "currentPageIndex", "dotList", "", "Lkotlin/jvm/internal/EnhancedNullability;", "setOnBestVarietiesClickListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setVarietiesModel", "varieties", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/BestCollection;", "([Lcom/picturecoin/generatedAPI/kotlinAPI/collection/BestCollection;)V", "startAutoScrollJob", "onDetachedFromWindow", "Companion", "CollectionPagerAdapter", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CollectionBestVarietiesCardView extends ConstraintLayout {
    private static final long DISPLAY_DURATION = 5000;
    private final CollectionPagerAdapter adapter;
    private final ViewMeCollectionSummaryBestVarietiesBinding binding;
    private final CoroutineScope coroutineScope;
    private int currentPageIndex;
    private final List<AppCompatImageView> dotList;
    private OnBestVarietiesClickListener onBestVarietiesClickListener;
    private Job scrollJob;
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollectionBestVarietiesCardView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollectionBestVarietiesCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CollectionBestVarietiesCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionBestVarietiesCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        CompletableJob Job$default;
        Intrinsics.checkNotNullParameter(context, "context");
        this.coroutineScope = CoroutineScopeKt.CoroutineScope(EmptyCoroutineContext.INSTANCE.plus(Dispatchers.getMain().getImmediate()));
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.scrollJob = Job$default;
        CollectionPagerAdapter collectionPagerAdapter = new CollectionPagerAdapter();
        this.adapter = collectionPagerAdapter;
        ViewMeCollectionSummaryBestVarietiesBinding inflate = ViewMeCollectionSummaryBestVarietiesBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        this.dotList = CollectionsKt.listOf((Object[]) new AppCompatImageView[]{inflate.ivIndicator1, inflate.ivIndicator2, inflate.ivIndicator3});
        inflate.pager2.setAdapter(collectionPagerAdapter);
        inflate.pager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.glority.android.picturexx.views.CollectionBestVarietiesCardView.1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                CollectionBestVarietiesCardView.this.currentPageIndex = position;
                List list = CollectionBestVarietiesCardView.this.dotList;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    AppCompatImageView appCompatImageView = (AppCompatImageView) obj;
                    Intrinsics.checkNotNull(appCompatImageView);
                    if (appCompatImageView.getVisibility() == 0) {
                        arrayList.add(obj);
                    }
                }
                CollectionBestVarietiesCardView collectionBestVarietiesCardView = CollectionBestVarietiesCardView.this;
                int i2 = 0;
                for (Object obj2 : arrayList) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) obj2;
                    boolean z = true;
                    if (i2 != (position - 1) % (collectionBestVarietiesCardView.adapter.getItemCount() - 2)) {
                        z = false;
                    }
                    appCompatImageView2.setSelected(z);
                    i2 = i3;
                }
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
                if (state == 0) {
                    if (!CollectionBestVarietiesCardView.this.scrollJob.isActive()) {
                        CollectionBestVarietiesCardView collectionBestVarietiesCardView = CollectionBestVarietiesCardView.this;
                        collectionBestVarietiesCardView.scrollJob = collectionBestVarietiesCardView.startAutoScrollJob();
                    }
                    if (CollectionBestVarietiesCardView.this.currentPageIndex == 0) {
                        CollectionBestVarietiesCardView.this.binding.pager2.setCurrentItem(CollectionBestVarietiesCardView.this.adapter.getItemCount() - 2, false);
                    } else if (CollectionBestVarietiesCardView.this.currentPageIndex == CollectionBestVarietiesCardView.this.adapter.getItemCount() - 1) {
                        CollectionBestVarietiesCardView.this.binding.pager2.setCurrentItem(1, false);
                    }
                }
                if (state == 1) {
                    Job.DefaultImpls.cancel$default(CollectionBestVarietiesCardView.this.scrollJob, (CancellationException) null, 1, (Object) null);
                }
            }
        });
        inflate.pager2.setOffscreenPageLimit(3);
        collectionPagerAdapter.setOnItemClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.android.picturexx.views.CollectionBestVarietiesCardView.2
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, Integer num) {
                invoke(baseQuickAdapter, view, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BaseQuickAdapter<?, ?> adapter, View view, int i2) {
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "view");
                Object item = adapter.getItem(i2);
                BestCollection bestCollection = item instanceof BestCollection ? (BestCollection) item : null;
                if (bestCollection != null) {
                    int itemCount = (i2 - 1) % (adapter.getItemCount() - 2);
                    OnBestVarietiesClickListener onBestVarietiesClickListener = CollectionBestVarietiesCardView.this.onBestVarietiesClickListener;
                    if (onBestVarietiesClickListener != null) {
                        onBestVarietiesClickListener.onBestVarietiesClick(bestCollection, itemCount);
                    }
                }
            }
        });
    }

    public final AppCompatImageView getMoreButton() {
        AppCompatImageView ivMore = this.binding.ivMore;
        Intrinsics.checkNotNullExpressionValue(ivMore, "ivMore");
        return ivMore;
    }

    public final void setOnBestVarietiesClickListener(OnBestVarietiesClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onBestVarietiesClickListener = listener;
    }

    public final void setVarietiesModel(BestCollection... varieties) {
        Intrinsics.checkNotNullParameter(varieties, "varieties");
        if (varieties.length == 0) {
            return;
        }
        CollectionPagerAdapter collectionPagerAdapter = this.adapter;
        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
        spreadBuilder.add(ArraysKt.last(varieties));
        spreadBuilder.addSpread(varieties);
        spreadBuilder.add(ArraysKt.first(varieties));
        collectionPagerAdapter.setNewData(CollectionsKt.listOf(spreadBuilder.toArray(new BestCollection[spreadBuilder.size()])));
        Iterator it = CollectionsKt.reversed(this.dotList).iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                AppCompatImageView appCompatImageView = (AppCompatImageView) next;
                Intrinsics.checkNotNull(appCompatImageView);
                appCompatImageView.setVisibility(i < varieties.length ? 0 : 8);
                i = i2;
            } else {
                this.binding.pager2.setCurrentItem(1, false);
                this.currentPageIndex = 1;
                Job.DefaultImpls.cancel$default(this.scrollJob, (CancellationException) null, 1, (Object) null);
                this.scrollJob = startAutoScrollJob();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job startAutoScrollJob() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new CollectionBestVarietiesCardView$startAutoScrollJob$1(this, null), 3, null);
        return launch$default;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoroutineScopeKt.cancel$default(this.coroutineScope, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CollectionBestVarietiesCardView.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0014J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0002J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u0007*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\f\u001a\u00020\r*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u00020\r*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0012\u001a\u00020\u0007*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/glority/android/picturexx/views/CollectionBestVarietiesCardView$CollectionPagerAdapter;", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/BestCollection;", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "<init>", "()V", "tvCoinName", "Landroidx/appcompat/widget/AppCompatTextView;", "getTvCoinName", "(Lcom/glority/android/adapterhelper/BaseViewHolder;)Landroidx/appcompat/widget/AppCompatTextView;", "tvVarietyValue", "getTvVarietyValue", "ivCoinCover1", "Landroidx/appcompat/widget/AppCompatImageView;", "getIvCoinCover1", "(Lcom/glority/android/adapterhelper/BaseViewHolder;)Landroidx/appcompat/widget/AppCompatImageView;", "ivCoinCover2", "getIvCoinCover2", "tvVarietyTitle", "getTvVarietyTitle", "convert", "", "helper", "itemWrapper", "setImages", "setPriceValue", "collection", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/Collection;", "setReleaseTime", "setMintage", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class CollectionPagerAdapter extends BaseQuickAdapter<BestCollection, BaseViewHolder> {

        /* compiled from: CollectionBestVarietiesCardView.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
        /* loaded from: classes5.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BestCollectionType.values().length];
                try {
                    iArr[BestCollectionType.MOST_VALUABLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BestCollectionType.MOST_ANCIENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BestCollectionType.RAREST.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public CollectionPagerAdapter() {
            super(R.layout.view_summary_best_varieties_page, null, 2, null);
        }

        private final AppCompatTextView getTvCoinName(BaseViewHolder baseViewHolder) {
            return (AppCompatTextView) baseViewHolder.getView(R.id.tv_coin_name);
        }

        private final AppCompatTextView getTvVarietyValue(BaseViewHolder baseViewHolder) {
            return (AppCompatTextView) baseViewHolder.getView(R.id.tv_variety_value);
        }

        private final AppCompatImageView getIvCoinCover1(BaseViewHolder baseViewHolder) {
            return (AppCompatImageView) baseViewHolder.getView(R.id.iv_coin_cover1);
        }

        private final AppCompatImageView getIvCoinCover2(BaseViewHolder baseViewHolder) {
            return (AppCompatImageView) baseViewHolder.getView(R.id.iv_coin_cover2);
        }

        private final AppCompatTextView getTvVarietyTitle(BaseViewHolder baseViewHolder) {
            return (AppCompatTextView) baseViewHolder.getView(R.id.tv_variety_title);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.glority.android.adapterhelper.BaseQuickAdapter
        public void convert(BaseViewHolder helper, BestCollection itemWrapper) {
            int titleResource;
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(itemWrapper, "itemWrapper");
            Collection collection = itemWrapper.getCollection();
            AppCompatTextView tvCoinName = getTvCoinName(helper);
            String str = (String) CollectionsKt.firstOrNull((List) collection.getNames());
            if (str == null) {
                str = "";
            }
            tvCoinName.setText(StringsKt.trim((CharSequence) str).toString());
            int i = WhenMappings.$EnumSwitchMapping$0[itemWrapper.getType().ordinal()];
            if (i == 1) {
                setPriceValue(helper, collection);
            } else if (i == 2) {
                setReleaseTime(helper, collection);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                setMintage(helper, collection);
            }
            setImages(helper, itemWrapper);
            AppCompatTextView tvVarietyTitle = getTvVarietyTitle(helper);
            titleResource = CollectionBestVarietiesCardViewKt.getTitleResource(itemWrapper.getType());
            tvVarietyTitle.setText(titleResource);
        }

        private final void setImages(BaseViewHolder helper, BestCollection itemWrapper) {
            Collection collection = itemWrapper.getCollection();
            Glide.with(getIvCoinCover1(helper)).load(collection.getDenominationSideUrl()).centerCrop().into(getIvCoinCover1(helper));
            Glide.with(getIvCoinCover2(helper)).load(collection.getSubjectSideUrl()).centerCrop().into(getIvCoinCover2(helper));
        }

        private final void setPriceValue(BaseViewHolder helper, Collection collection) {
            PriceValue marketValue = collection.getMarketValue();
            Double valueOf = marketValue != null ? Double.valueOf(marketValue.getValue()) : null;
            if (valueOf == null) {
                getTvVarietyValue(helper).setText(R.string.text_unknown);
                return;
            }
            String formatPrice = PriceUtils.INSTANCE.formatPrice(valueOf.doubleValue());
            AppCompatTextView tvVarietyValue = getTvVarietyValue(helper);
            PriceValue marketValue2 = collection.getMarketValue();
            tvVarietyValue.setText((marketValue2 != null ? marketValue2.getSymbol() : null) + formatPrice);
        }

        private final void setReleaseTime(BaseViewHolder helper, Collection collection) {
            getTvVarietyValue(helper).setText("Release at " + collection.getYear());
        }

        private final void setMintage(BaseViewHolder helper, Collection collection) {
            String mintage = collection.getMintage();
            if (mintage == null) {
                getTvVarietyValue(helper).setText(R.string.text_unknown);
                return;
            }
            try {
                Long longOrNull = StringsKt.toLongOrNull(mintage);
                if (longOrNull != null) {
                    mintage = NumberFormat.getInstance().format(longOrNull.longValue());
                } else {
                    mintage = ResUtils.getString(R.string.text_unknown);
                }
            } catch (Throwable unused) {
                mintage = mintage.toString();
            }
            getTvVarietyValue(helper).setText(ResUtils.getString(R.string.grading_result_mintage) + " " + mintage);
        }
    }
}
