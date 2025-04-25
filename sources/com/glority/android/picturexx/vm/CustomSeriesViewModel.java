package com.glority.android.picturexx.vm;

import android.content.Context;
import com.glority.android.adapterhelper.diff.BaseQuickDiffCallback;
import com.glority.android.database.entities.UserCustomSeriesItem;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.definition.SelectableItem;
import com.glority.base.viewmodel.BaseViewModel;
import com.glority.widget.tooltips.GlToolTipsItem;
import com.picturecoin.generatedAPI.kotlinAPI.model.PriceValue;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomSeriesViewModel.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\u000b\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0005J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/glority/android/picturexx/vm/CustomSeriesViewModel;", "Lcom/glority/base/viewmodel/BaseViewModel;", "<init>", "()V", "sortList", "", "Lcom/glority/android/picturexx/vm/CustomSeriesViewModel$SortType;", "getSortList", "()Ljava/util/List;", "sort", "Lcom/glority/android/database/entities/UserCustomSeriesItem;", "sortType", "customSeriesItems", "getFilterGlToolTipsItem", "Lcom/glority/widget/tooltips/GlToolTipsItem;", "context", "Landroid/content/Context;", "getCustomSeriesDiff", "Lcom/glority/android/adapterhelper/diff/BaseQuickDiffCallback;", "Lcom/glority/android/picturexx/definition/SelectableItem;", "data", "SortType", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CustomSeriesViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private final List<SortType> sortList = CollectionsKt.listOf((Object[]) new SortType[]{SortType.DataUpdated, SortType.DataCreated, SortType.PiecesCount, SortType.TotalValue});

    /* compiled from: CustomSeriesViewModel.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SortType.values().length];
            try {
                iArr[SortType.DataUpdated.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SortType.DataCreated.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SortType.PiecesCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SortType.TotalValue.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CustomSeriesViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/picturexx/vm/CustomSeriesViewModel$SortType;", "", "<init>", "(Ljava/lang/String;I)V", "DataUpdated", "DataCreated", "PiecesCount", "TotalValue", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class SortType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SortType[] $VALUES;
        public static final SortType DataUpdated = new SortType("DataUpdated", 0);
        public static final SortType DataCreated = new SortType("DataCreated", 1);
        public static final SortType PiecesCount = new SortType("PiecesCount", 2);
        public static final SortType TotalValue = new SortType("TotalValue", 3);

        private static final /* synthetic */ SortType[] $values() {
            return new SortType[]{DataUpdated, DataCreated, PiecesCount, TotalValue};
        }

        public static EnumEntries<SortType> getEntries() {
            return $ENTRIES;
        }

        private SortType(String str, int i) {
        }

        static {
            SortType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static SortType valueOf(String str) {
            return (SortType) Enum.valueOf(SortType.class, str);
        }

        public static SortType[] values() {
            return (SortType[]) $VALUES.clone();
        }
    }

    public final List<SortType> getSortList() {
        return this.sortList;
    }

    public final List<UserCustomSeriesItem> sort(SortType sortType, List<UserCustomSeriesItem> customSeriesItems) {
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        Intrinsics.checkNotNullParameter(customSeriesItems, "customSeriesItems");
        int i = WhenMappings.$EnumSwitchMapping$0[sortType.ordinal()];
        if (i == 1) {
            return CollectionsKt.sortedWith(customSeriesItems, new Comparator() { // from class: com.glority.android.picturexx.vm.CustomSeriesViewModel$sort$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((UserCustomSeriesItem) t2).getUpdatedAt(), ((UserCustomSeriesItem) t).getUpdatedAt());
                }
            });
        }
        if (i == 2) {
            return CollectionsKt.sortedWith(customSeriesItems, new Comparator() { // from class: com.glority.android.picturexx.vm.CustomSeriesViewModel$sort$$inlined$sortedByDescending$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((UserCustomSeriesItem) t2).getCreatedAt(), ((UserCustomSeriesItem) t).getCreatedAt());
                }
            });
        }
        if (i == 3) {
            return CollectionsKt.sortedWith(customSeriesItems, new Comparator() { // from class: com.glority.android.picturexx.vm.CustomSeriesViewModel$sort$$inlined$sortedByDescending$3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Integer.valueOf(((UserCustomSeriesItem) t2).getCollectionCount()), Integer.valueOf(((UserCustomSeriesItem) t).getCollectionCount()));
                }
            });
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return CollectionsKt.sortedWith(customSeriesItems, new Comparator() { // from class: com.glority.android.picturexx.vm.CustomSeriesViewModel$sort$$inlined$sortedByDescending$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                PriceValue totalPrice = ((UserCustomSeriesItem) t2).getTotalPrice();
                Double valueOf = totalPrice != null ? Double.valueOf(totalPrice.getValue()) : null;
                PriceValue totalPrice2 = ((UserCustomSeriesItem) t).getTotalPrice();
                return ComparisonsKt.compareValues(valueOf, totalPrice2 != null ? Double.valueOf(totalPrice2.getValue()) : null);
            }
        });
    }

    public final List<GlToolTipsItem> getFilterGlToolTipsItem(Context context) {
        GlToolTipsItem glToolTipsItem;
        Intrinsics.checkNotNullParameter(context, "context");
        List<SortType> list = this.sortList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[((SortType) obj).ordinal()];
            if (i3 == 1) {
                String string = context.getString(R.string.Customseries_dateupdated);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                glToolTipsItem = new GlToolTipsItem(string, (Integer) null, true, 2, (DefaultConstructorMarker) null);
            } else if (i3 == 2) {
                String string2 = context.getString(R.string.Customseries_datecreated);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                glToolTipsItem = new GlToolTipsItem(string2, (Integer) null, false, 2, (DefaultConstructorMarker) null);
            } else if (i3 == 3) {
                String string3 = context.getString(R.string.Customseries_piecescount);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                glToolTipsItem = new GlToolTipsItem(string3, (Integer) null, false, 2, (DefaultConstructorMarker) null);
            } else {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                String string4 = context.getString(R.string.sets_filter_value);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                glToolTipsItem = new GlToolTipsItem(string4, (Integer) null, false, 2, (DefaultConstructorMarker) null);
            }
            arrayList.add(glToolTipsItem);
            i = i2;
        }
        return arrayList;
    }

    public final BaseQuickDiffCallback<SelectableItem> getCustomSeriesDiff(final List<SelectableItem> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new BaseQuickDiffCallback<SelectableItem>(data) { // from class: com.glority.android.picturexx.vm.CustomSeriesViewModel$getCustomSeriesDiff$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.glority.android.adapterhelper.diff.BaseQuickDiffCallback
            public boolean areContentsTheSame(SelectableItem oldItem, SelectableItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                UserCustomSeriesItem userCustomSeriesItem = oldItem.getUserCustomSeriesItem();
                UserCustomSeriesItem userCustomSeriesItem2 = newItem.getUserCustomSeriesItem();
                if (userCustomSeriesItem.getCustomSeriesId() == userCustomSeriesItem2.getCustomSeriesId() && Intrinsics.areEqual(userCustomSeriesItem.getTitle(), userCustomSeriesItem2.getTitle()) && userCustomSeriesItem.getUpdatedAt().getTime() == userCustomSeriesItem2.getUpdatedAt().getTime() && userCustomSeriesItem.getLatestCollectionUrlList().size() == userCustomSeriesItem2.getLatestCollectionUrlList().size() && userCustomSeriesItem2.getLatestCollectionUrlList().containsAll(userCustomSeriesItem2.getLatestCollectionUrlList()) && userCustomSeriesItem.getCollectionCount() == userCustomSeriesItem2.getCollectionCount() && oldItem.getSelected() == newItem.getSelected()) {
                    PriceValue totalPrice = oldItem.getUserCustomSeriesItem().getTotalPrice();
                    String symbol = totalPrice != null ? totalPrice.getSymbol() : null;
                    PriceValue totalPrice2 = newItem.getUserCustomSeriesItem().getTotalPrice();
                    if (Intrinsics.areEqual(symbol, totalPrice2 != null ? totalPrice2.getSymbol() : null)) {
                        PriceValue totalPrice3 = oldItem.getUserCustomSeriesItem().getTotalPrice();
                        String currencyCode = totalPrice3 != null ? totalPrice3.getCurrencyCode() : null;
                        PriceValue totalPrice4 = newItem.getUserCustomSeriesItem().getTotalPrice();
                        if (Intrinsics.areEqual(currencyCode, totalPrice4 != null ? totalPrice4.getCurrencyCode() : null)) {
                            PriceValue totalPrice5 = oldItem.getUserCustomSeriesItem().getTotalPrice();
                            Double valueOf = totalPrice5 != null ? Double.valueOf(totalPrice5.getValue()) : null;
                            PriceValue totalPrice6 = newItem.getUserCustomSeriesItem().getTotalPrice();
                            if (Intrinsics.areEqual(valueOf, totalPrice6 != null ? Double.valueOf(totalPrice6.getValue()) : null)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.glority.android.adapterhelper.diff.BaseQuickDiffCallback
            public boolean areItemsTheSame(SelectableItem oldItem, SelectableItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getUserCustomSeriesItem().getCustomSeriesId() == newItem.getUserCustomSeriesItem().getCustomSeriesId();
            }
        };
    }
}
