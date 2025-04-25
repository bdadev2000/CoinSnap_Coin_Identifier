package com.glority.android.core.route.fileupload;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.xx.constants.Args;
import com.glority.component.generatedAPI.kotlinAPI.enums.PhotoFrom;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileUploadRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001BW\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012,\b\u0002\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000bj\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\f¢\u0006\u0002\u0010\rR5\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000bj\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/glority/android/core/route/fileupload/FileUploadRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "", "", "filePath", "scope", Args.itemType, "photoFrom", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;", "fields", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;Ljava/util/LinkedHashMap;)V", "getFields", "()Ljava/util/LinkedHashMap;", "getFilePath", "()Ljava/lang/String;", "getItemType", "getPhotoFrom", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;", "getScope", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class FileUploadRequest extends RouteRequest<Map<Long, ? extends String>> {
    private final LinkedHashMap<String, String> fields;
    private final String filePath;
    private final String itemType;
    private final PhotoFrom photoFrom;
    private final String scope;

    public /* synthetic */ FileUploadRequest(String str, String str2, String str3, PhotoFrom photoFrom, LinkedHashMap linkedHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, photoFrom, (i & 16) != 0 ? null : linkedHashMap);
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final String getScope() {
        return this.scope;
    }

    public final String getItemType() {
        return this.itemType;
    }

    public final PhotoFrom getPhotoFrom() {
        return this.photoFrom;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileUploadRequest(String str, String str2, String itemType, PhotoFrom photoFrom, LinkedHashMap<String, String> linkedHashMap) {
        super(UrlFileUpload.INSTANCE.getURL_UPLOAD(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        Intrinsics.checkNotNullParameter(photoFrom, "photoFrom");
        this.filePath = str;
        this.scope = str2;
        this.itemType = itemType;
        this.photoFrom = photoFrom;
        this.fields = linkedHashMap;
    }

    public final LinkedHashMap<String, String> getFields() {
        return this.fields;
    }
}
