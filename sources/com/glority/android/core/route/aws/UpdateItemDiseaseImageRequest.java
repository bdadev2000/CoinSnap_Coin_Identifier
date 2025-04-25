package com.glority.android.core.route.aws;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import java.util.List;
import kotlin.Metadata;

/* compiled from: UpdateItemDiseaseImageRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/glority/android/core/route/aws/UpdateItemDiseaseImageRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "itemDiseaseRecordSourceId", "", "imageEntities", "", "itemIds", "", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getImageEntities", "()Ljava/util/List;", "getItemDiseaseRecordSourceId", "()Ljava/lang/String;", "getItemIds", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class UpdateItemDiseaseImageRequest extends RouteRequest<Boolean> {
    private final List<String> imageEntities;
    private final String itemDiseaseRecordSourceId;
    private final List<Long> itemIds;

    public UpdateItemDiseaseImageRequest(String str, List<String> list, List<Long> list2) {
        super(UrlAws.INSTANCE.getURL_UPDATE_ITEM_DISEASE_IMAGE(), null, null, 6, null);
        this.itemDiseaseRecordSourceId = str;
        this.imageEntities = list;
        this.itemIds = list2;
    }

    public final List<String> getImageEntities() {
        return this.imageEntities;
    }

    public final String getItemDiseaseRecordSourceId() {
        return this.itemDiseaseRecordSourceId;
    }

    public final List<Long> getItemIds() {
        return this.itemIds;
    }
}
