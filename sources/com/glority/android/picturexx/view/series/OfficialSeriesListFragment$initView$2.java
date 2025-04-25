package com.glority.android.picturexx.view.series;

import android.view.View;
import androidx.core.os.BundleKt;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.database.entities.SeriesItem;
import com.glority.android.picturexx.adapter.OfficialSeriesAdapter;
import com.glority.android.picturexx.business.R;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.entity.BaseMultiEntity;
import com.glority.base.utils.NavigationAnimaUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OfficialSeriesListFragment.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u001d\u0010\u0002\u001a\u0019\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00022\u0015\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\b\u001a\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\bH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "adapter", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "Lkotlin/ParameterName;", "name", "view", "Landroid/view/View;", "position", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class OfficialSeriesListFragment$initView$2 extends Lambda implements Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit> {
    final /* synthetic */ OfficialSeriesListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfficialSeriesListFragment$initView$2(OfficialSeriesListFragment officialSeriesListFragment) {
        super(3);
        this.this$0 = officialSeriesListFragment;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, Integer num) {
        invoke(baseQuickAdapter, view, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BaseQuickAdapter<?, ?> adapter, View view, int i) {
        OfficialSeriesAdapter officialSeriesAdapter;
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        List list8;
        List list9;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        officialSeriesAdapter = this.this$0.adapter;
        Object item = ((BaseMultiEntity) officialSeriesAdapter.getData().get(i)).getItem();
        if (item instanceof SeriesItem) {
            SeriesItem seriesItem = (SeriesItem) item;
            if (seriesItem.getCreated()) {
                this.this$0.logEvent(LogEvents.offseries_listitem_click, BundleKt.bundleOf(TuplesKt.to("type", LogEvents.my), TuplesKt.to("id", seriesItem.getIndexListUid())));
                ViewExtensionsKt.navigate$default(this.this$0, R.id.action_totalSeriesFragment_to_seriesDetailFragment, BundleKt.bundleOf(TuplesKt.to(Args.seriesId, seriesItem.getSeriesId()), TuplesKt.to(Args.indexListUid, seriesItem.getIndexListUid()), TuplesKt.to("from", this.this$0.getPageName())), NavigationAnimaUtils.INSTANCE.getSlideAnima(this.this$0.getActivity()), null, 8, null);
                return;
            } else {
                this.this$0.logEvent(LogEvents.offseries_listitem_click, BundleKt.bundleOf(TuplesKt.to("type", LogEvents.available), TuplesKt.to("id", seriesItem.getIndexListUid())));
                ViewExtensionsKt.navigate$default(this.this$0, R.id.action_totalSeriesFragment_to_seriesIntroduceFragment, BundleKt.bundleOf(TuplesKt.to(Args.indexListUid, seriesItem.getIndexListUid()), TuplesKt.to("from", this.this$0.getPageName())), NavigationAnimaUtils.INSTANCE.getSlideAnima(this.this$0.getActivity()), null, 8, null);
                return;
            }
        }
        if (item instanceof OfficialSeriesAdapter.LabelItem) {
            OfficialSeriesAdapter.LabelItem labelItem = (OfficialSeriesAdapter.LabelItem) item;
            if (labelItem.getType() == OfficialSeriesAdapter.INSTANCE.getLabelMySeries()) {
                Object obj = null;
                if (Intrinsics.areEqual((Object) labelItem.getExpand(), (Object) true)) {
                    this.this$0.logEvent(LogEvents.offseries_listfolder_click, BundleKt.bundleOf(TuplesKt.to("type", "hide")));
                    list6 = this.this$0.adapterData;
                    Iterator it = list6.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        BaseMultiEntity baseMultiEntity = (BaseMultiEntity) next;
                        if (baseMultiEntity.getItem() instanceof OfficialSeriesAdapter.LabelItem) {
                            Object item2 = baseMultiEntity.getItem();
                            Intrinsics.checkNotNull(item2, "null cannot be cast to non-null type com.glority.android.picturexx.adapter.OfficialSeriesAdapter.LabelItem");
                            if (((OfficialSeriesAdapter.LabelItem) item2).getType() == OfficialSeriesAdapter.INSTANCE.getLabelMySeries()) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    BaseMultiEntity baseMultiEntity2 = (BaseMultiEntity) obj;
                    if (baseMultiEntity2 != null) {
                        Object item3 = baseMultiEntity2.getItem();
                        Intrinsics.checkNotNull(item3, "null cannot be cast to non-null type com.glority.android.picturexx.adapter.OfficialSeriesAdapter.LabelItem");
                        ((OfficialSeriesAdapter.LabelItem) item3).setExpand(false);
                    }
                    adapter.notifyItemChanged(0);
                    list7 = this.this$0.adapterData;
                    int size = list7.size();
                    list8 = this.this$0.adapterData;
                    final AnonymousClass3 anonymousClass3 = new Function1<BaseMultiEntity, Boolean>() { // from class: com.glority.android.picturexx.view.series.OfficialSeriesListFragment$initView$2.3
                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(BaseMultiEntity it2) {
                            boolean z;
                            Intrinsics.checkNotNullParameter(it2, "it");
                            if (it2.getItem() instanceof SeriesItem) {
                                Object item4 = it2.getItem();
                                Intrinsics.checkNotNull(item4, "null cannot be cast to non-null type com.glority.android.database.entities.SeriesItem");
                                if (((SeriesItem) item4).getCreated()) {
                                    z = true;
                                    return Boolean.valueOf(z);
                                }
                            }
                            z = false;
                            return Boolean.valueOf(z);
                        }
                    };
                    list8.removeIf(new Predicate() { // from class: com.glority.android.picturexx.view.series.OfficialSeriesListFragment$initView$2$$ExternalSyntheticLambda0
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj2) {
                            boolean invoke$lambda$2;
                            invoke$lambda$2 = OfficialSeriesListFragment$initView$2.invoke$lambda$2(Function1.this, obj2);
                            return invoke$lambda$2;
                        }
                    });
                    list9 = this.this$0.adapterData;
                    adapter.notifyItemRangeRemoved(1, size - list9.size());
                    return;
                }
                if (Intrinsics.areEqual((Object) labelItem.getExpand(), (Object) false)) {
                    this.this$0.logEvent(LogEvents.offseries_listfolder_click, BundleKt.bundleOf(TuplesKt.to("type", "show")));
                    list = this.this$0.adapterData;
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        BaseMultiEntity baseMultiEntity3 = (BaseMultiEntity) next2;
                        if (baseMultiEntity3.getItem() instanceof OfficialSeriesAdapter.LabelItem) {
                            Object item4 = baseMultiEntity3.getItem();
                            Intrinsics.checkNotNull(item4, "null cannot be cast to non-null type com.glority.android.picturexx.adapter.OfficialSeriesAdapter.LabelItem");
                            if (((OfficialSeriesAdapter.LabelItem) item4).getType() == OfficialSeriesAdapter.INSTANCE.getLabelMySeries()) {
                                obj = next2;
                                break;
                            }
                        }
                    }
                    BaseMultiEntity baseMultiEntity4 = (BaseMultiEntity) obj;
                    if (baseMultiEntity4 != null) {
                        Object item5 = baseMultiEntity4.getItem();
                        Intrinsics.checkNotNull(item5, "null cannot be cast to non-null type com.glority.android.picturexx.adapter.OfficialSeriesAdapter.LabelItem");
                        ((OfficialSeriesAdapter.LabelItem) item5).setExpand(true);
                    }
                    adapter.notifyItemChanged(0);
                    list2 = this.this$0.adapterData;
                    int size2 = list2.size();
                    list3 = this.this$0.adapterData;
                    list4 = this.this$0.createdItem;
                    List list10 = list4;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list10, 10));
                    Iterator it3 = list10.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(new BaseMultiEntity(OfficialSeriesAdapter.INSTANCE.getTypeItemMySeries(), (SeriesItem) it3.next()));
                    }
                    list3.addAll(1, arrayList);
                    list5 = this.this$0.adapterData;
                    adapter.notifyItemRangeInserted(1, list5.size() - size2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }
}
