package com.glority.android.picturexx.adapter;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bumptech.glide.Glide;
import com.glority.android.adapterhelper.BaseMultiItemQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.database.entities.SeriesItem;
import com.glority.android.picturexx.business.R;
import com.glority.base.entity.BaseMultiEntity;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MeOfficialSeriesAdapter.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\n\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014¨\u0006\f"}, d2 = {"Lcom/glority/android/picturexx/adapter/MeOfficialSeriesAdapter;", "Lcom/glority/android/adapterhelper/BaseMultiItemQuickAdapter;", "Lcom/glority/base/entity/BaseMultiEntity;", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "entity", "Companion", "LabelItem", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class MeOfficialSeriesAdapter extends BaseMultiItemQuickAdapter<BaseMultiEntity, BaseViewHolder> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int typeItemMySeries = 1;
    private static final int typeItemAvailableSeries = 2;
    private static final int typeLabel = 3;
    private static final int typeAvailableEmpty = 4;
    private static final int labelMySeries = 1;
    private static final int labelAvailableSeries = 2;

    /* compiled from: MeOfficialSeriesAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/glority/android/picturexx/adapter/MeOfficialSeriesAdapter$Companion;", "", "<init>", "()V", "typeItemMySeries", "", "getTypeItemMySeries", "()I", "typeItemAvailableSeries", "getTypeItemAvailableSeries", "typeLabel", "getTypeLabel", "typeAvailableEmpty", "getTypeAvailableEmpty", "labelMySeries", "getLabelMySeries", "labelAvailableSeries", "getLabelAvailableSeries", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int getTypeItemMySeries() {
            return MeOfficialSeriesAdapter.typeItemMySeries;
        }

        public final int getTypeItemAvailableSeries() {
            return MeOfficialSeriesAdapter.typeItemAvailableSeries;
        }

        public final int getTypeLabel() {
            return MeOfficialSeriesAdapter.typeLabel;
        }

        public final int getTypeAvailableEmpty() {
            return MeOfficialSeriesAdapter.typeAvailableEmpty;
        }

        public final int getLabelMySeries() {
            return MeOfficialSeriesAdapter.labelMySeries;
        }

        public final int getLabelAvailableSeries() {
            return MeOfficialSeriesAdapter.labelAvailableSeries;
        }
    }

    public MeOfficialSeriesAdapter() {
        super(null);
        addItemType(typeItemMySeries, R.layout.item_recommend_series);
        addItemType(typeItemAvailableSeries, R.layout.item_recommend_series);
        addItemType(typeLabel, R.layout.item_me_official_sets_label);
        addItemType(typeAvailableEmpty, R.layout.item_official_sets_empty);
    }

    /* compiled from: MeOfficialSeriesAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/glority/android/picturexx/adapter/MeOfficialSeriesAdapter$LabelItem;", "", "type", "", "name", "", "expand", "", "description", "<init>", "(ILjava/lang/String;ZLjava/lang/String;)V", "getType", "()I", "getName", "()Ljava/lang/String;", "getExpand", "()Z", "setExpand", "(Z)V", "getDescription", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes2.dex */
    public static final class LabelItem {
        public static final int $stable = 8;
        private final String description;
        private boolean expand;
        private final String name;
        private final int type;

        public LabelItem(int i, String name, boolean z, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.type = i;
            this.name = name;
            this.expand = z;
            this.description = str;
        }

        public final String getDescription() {
            return this.description;
        }

        public final boolean getExpand() {
            return this.expand;
        }

        public final String getName() {
            return this.name;
        }

        public final int getType() {
            return this.type;
        }

        public final void setExpand(boolean z) {
            this.expand = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public void convert(BaseViewHolder helper, BaseMultiEntity entity) {
        String str;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(entity, "entity");
        Object item = entity.getItem();
        if (item instanceof SeriesItem) {
            SeriesItem seriesItem = (SeriesItem) item;
            helper.setText(R.id.series_name_tv, seriesItem.getTitle());
            ImageView imageView = (ImageView) helper.getView(R.id.iv);
            Glide.with(imageView).load(seriesItem.getImageUrl()).into(imageView);
            if (seriesItem.getCreated()) {
                Integer currentCount = seriesItem.getCurrentCount();
                str = (currentCount != null ? currentCount.intValue() : 0) + RemoteSettings.FORWARD_SLASH_STRING + seriesItem.getTotalNum() + " " + ((Object) helper.itemView.getResources().getText(R.string.me_collection_series_content));
            } else {
                str = seriesItem.getTotalNum() + " " + ((Object) helper.itemView.getResources().getText(R.string.me_collection_series_content));
            }
            helper.setText(R.id.number_tv, str);
            return;
        }
        if (item instanceof LabelItem) {
            LabelItem labelItem = (LabelItem) item;
            helper.setText(R.id.title_tv, labelItem.getName());
            AppCompatTextView appCompatTextView = (AppCompatTextView) helper.getView(R.id.title_tv);
            if (labelItem.getExpand()) {
                appCompatTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, appCompatTextView.getResources().getDrawable(R.drawable.icon_small_arrow_down), (Drawable) null);
            } else if (!labelItem.getExpand()) {
                appCompatTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, appCompatTextView.getResources().getDrawable(R.drawable.icon_small_arrow_up), (Drawable) null);
            }
            helper.setGone(R.id.desc_tv, labelItem.getDescription() != null);
        }
    }
}
