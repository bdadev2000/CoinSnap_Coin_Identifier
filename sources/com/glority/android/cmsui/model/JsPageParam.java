package com.glority.android.cmsui.model;

import androidx.exifinterface.media.ExifInterface;
import com.glority.android.cmsui.entity.LikeItem;
import com.glority.android.xx.constants.Args;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: JsPageParam.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/glority/android/cmsui/model/JsPageParam;", "Lcom/glority/android/cmsui/model/JsBaseParam;", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", Args.title, "getTitle", "setTitle", "type", "getType", "setType", Args.uid, "getUid", "setUid", "url", "getUrl", "setUrl", "isCommonLink", "", "isSubPage", "isUid", "update", "obj", "Lorg/json/JSONObject;", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class JsPageParam extends JsBaseParam {
    private String name;
    private String title;
    private String type;
    private String uid;
    private String url;

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final JsPageParam update(JSONObject obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        this.type = obj.has("type") ? obj.optString("type") : null;
        this.url = obj.has("url") ? obj.optString("url") : null;
        this.name = obj.has("name") ? obj.optString("name") : null;
        this.uid = obj.has(Args.uid) ? obj.optString(Args.uid) : null;
        this.title = obj.has(Args.title) ? obj.optString(Args.title) : null;
        setRawJson(obj.toString());
        return this;
    }

    public final boolean isSubPage() {
        return Intrinsics.areEqual(this.type, LikeItem.DISLIKE);
    }

    public final boolean isUid() {
        return Intrinsics.areEqual(this.type, "1");
    }

    public final boolean isCommonLink() {
        return Intrinsics.areEqual(this.type, ExifInterface.GPS_MEASUREMENT_2D);
    }
}
