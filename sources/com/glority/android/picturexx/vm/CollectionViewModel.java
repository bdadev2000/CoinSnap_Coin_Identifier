package com.glority.android.picturexx.vm;

import android.content.Context;
import android.util.Log;
import androidx.lifecycle.LifecycleOwner;
import com.glority.android.core.app.AppContext;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.picturexx.view.dialog.ExportIntroduceDialog;
import com.glority.android.picturexx.view.dialog.ExportWriteInfoDialog;
import com.glority.android.xx.constants.Args;
import com.glority.base.viewmodel.BaseViewModel;
import com.glority.component.generatedAPI.kotlinAPI.item.ItemDetail;
import com.glority.utils.stability.LogUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: CollectionViewModel.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\"\u001a\u00020 J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020 J\u0006\u0010&\u001a\u00020'J\u0017\u0010\u001e\u001a\u00020$2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\b(J\r\u0010\u001d\u001a\u00020\u0011H\u0007¢\u0006\u0002\b)J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110+2\b\u0010,\u001a\u0004\u0018\u00010-J&\u0010.\u001a\u00020$2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020'2\u0006\u00102\u001a\u00020'2\u0006\u00103\u001a\u000204R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u0012\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0004\n\u0002\u0010!¨\u00065"}, d2 = {"Lcom/glority/android/picturexx/vm/CollectionViewModel;", "Lcom/glority/base/viewmodel/BaseViewModel;", "<init>", "()V", "currentItem", "Lcom/glority/android/database/entities/CollectionItem;", "getCurrentItem", "()Lcom/glority/android/database/entities/CollectionItem;", "setCurrentItem", "(Lcom/glority/android/database/entities/CollectionItem;)V", "selectedOfficialCollections", "", "getSelectedOfficialCollections", "()Ljava/util/List;", "setSelectedOfficialCollections", "(Ljava/util/List;)V", "pageFrom", "", "getPageFrom", "()Ljava/lang/String;", "setPageFrom", "(Ljava/lang/String;)V", Args.varietyUid, "getVarietyUid", "setVarietyUid", Args.speciesUid, "getSpeciesUid", "setSpeciesUid", Args.uid, "getUid", "setUid", "currentItemId", "", "Ljava/lang/Long;", "getItemId", "setItemId", "", "itemId", "getCollectionId", "", "setUid1", "getUid1", "getHeaderImage", "", "item", "Lcom/glority/component/generatedAPI/kotlinAPI/item/ItemDetail;", "exportSeriesCollection", "context", "Landroid/content/Context;", "collectionCount", Args.seriesId, "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CollectionViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private CollectionItem currentItem;
    private Long currentItemId;
    private String pageFrom = "";
    private List<CollectionItem> selectedOfficialCollections;
    private String speciesUid;
    private String uid;
    private String varietyUid;

    public final CollectionItem getCurrentItem() {
        return this.currentItem;
    }

    public final void setCurrentItem(CollectionItem collectionItem) {
        this.currentItem = collectionItem;
    }

    public final List<CollectionItem> getSelectedOfficialCollections() {
        return this.selectedOfficialCollections;
    }

    public final void setSelectedOfficialCollections(List<CollectionItem> list) {
        this.selectedOfficialCollections = list;
    }

    public final String getPageFrom() {
        return this.pageFrom;
    }

    public final void setPageFrom(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pageFrom = str;
    }

    public final String getVarietyUid() {
        return this.varietyUid;
    }

    public final void setVarietyUid(String str) {
        this.varietyUid = str;
    }

    public final String getSpeciesUid() {
        return this.speciesUid;
    }

    public final void setSpeciesUid(String str) {
        this.speciesUid = str;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public final long getItemId() {
        Long itemId;
        Long l = this.currentItemId;
        if (l == null || l.longValue() != 0) {
            Long l2 = this.currentItemId;
            if (l2 == null) {
                CollectionItem collectionItem = this.currentItem;
                l2 = collectionItem != null ? collectionItem.getItemId() : null;
                if (l2 == null) {
                    return 0L;
                }
            }
            return l2.longValue();
        }
        CollectionItem collectionItem2 = this.currentItem;
        if (collectionItem2 == null || (itemId = collectionItem2.getItemId()) == null) {
            return 0L;
        }
        return itemId.longValue();
    }

    public final void setItemId(long itemId) {
        this.currentItemId = Long.valueOf(itemId);
    }

    public final int getCollectionId() {
        CollectionItem collectionItem = this.currentItem;
        if (collectionItem != null) {
            return collectionItem.getCollectionId();
        }
        return 0;
    }

    public final void setUid1(String uid) {
        this.uid = uid;
    }

    public final String getUid1() {
        String str = this.uid;
        if (str != null) {
            return str;
        }
        CollectionItem collectionItem = this.currentItem;
        String uid = collectionItem != null ? collectionItem.getUid() : null;
        return uid == null ? "" : uid;
    }

    public final List<String> getHeaderImage(ItemDetail item) {
        JSONObject jSONObject;
        if (item == null || item.getProperties() == null) {
            return new ArrayList();
        }
        try {
            jSONObject = new JSONObject(item.getProperties());
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
        if (jSONObject.has("original_image_urls")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("original_image_urls");
            ArrayList arrayList = new ArrayList();
            Iterator<String> keys = jSONObject2.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
            while (keys.hasNext()) {
                String optString = jSONObject2.optString(keys.next());
                Intrinsics.checkNotNull(optString);
                arrayList.add(optString);
            }
            return arrayList;
        }
        Unit unit = Unit.INSTANCE;
        return new ArrayList();
    }

    public final void exportSeriesCollection(Context context, int collectionCount, int seriesId, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        if (collectionCount == 0) {
            ExportIntroduceDialog.INSTANCE.open(context);
        } else {
            ExportWriteInfoDialog.INSTANCE.open(context, collectionCount, Integer.valueOf(seriesId), lifecycleOwner, "customseriesexportdialog");
        }
    }
}
