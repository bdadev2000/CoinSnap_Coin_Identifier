package com.glority.android.core.route.aws;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdateItemHighQualityRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tR\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0007\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/glority/android/core/route/aws/UpdateItemHighQualityRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "itemId", "", "strUrl", "", "isHighQuality", "filePath", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getFilePath", "()Ljava/lang/String;", "setFilePath", "(Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "setHighQuality", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getItemId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStrUrl", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class UpdateItemHighQualityRequest extends RouteRequest<Boolean> {
    private String filePath;
    private Boolean isHighQuality;
    private final Long itemId;
    private final String strUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateItemHighQualityRequest(Long l, String str, Boolean bool, String filePath) {
        super(UrlAws.INSTANCE.getURL_UPDATE_ITEM_HIGH_QUALITY(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.itemId = l;
        this.strUrl = str;
        this.isHighQuality = bool;
        this.filePath = filePath;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final Long getItemId() {
        return this.itemId;
    }

    public final String getStrUrl() {
        return this.strUrl;
    }

    /* renamed from: isHighQuality, reason: from getter */
    public final Boolean getIsHighQuality() {
        return this.isHighQuality;
    }

    public final void setFilePath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.filePath = str;
    }

    public final void setHighQuality(Boolean bool) {
        this.isHighQuality = bool;
    }
}
