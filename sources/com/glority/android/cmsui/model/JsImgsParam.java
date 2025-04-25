package com.glority.android.cmsui.model;

import java.util.List;
import kotlin.Metadata;

/* compiled from: JsImgsParam.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/glority/android/cmsui/model/JsImgsParam;", "Lcom/glority/android/cmsui/model/JsBaseParam;", "()V", "images", "", "Lcom/glority/android/cmsui/model/JsImgParam;", "getImages", "()Ljava/util/List;", "setImages", "(Ljava/util/List;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "update", "obj", "Lorg/json/JSONObject;", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class JsImgsParam extends JsBaseParam {
    private List<JsImgParam> images;
    private int index;

    public final int getIndex() {
        return this.index;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final List<JsImgParam> getImages() {
        return this.images;
    }

    public final void setImages(List<JsImgParam> list) {
        this.images = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.glority.android.cmsui.model.JsImgsParam update(org.json.JSONObject r6) {
        /*
            r5 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = r6.toString()
            r5.setRawJson(r0)
            java.lang.String r0 = "index"
            boolean r1 = r6.has(r0)
            r2 = 0
            if (r1 == 0) goto L29
            java.lang.String r0 = r6.optString(r0)
            java.lang.String r1 = "obj.optString(\"index\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Integer r0 = kotlin.text.StringsKt.toIntOrNull(r0)
            if (r0 == 0) goto L29
            int r0 = r0.intValue()
            goto L2a
        L29:
            r0 = r2
        L2a:
            r5.index = r0
            java.lang.String r0 = "images"
            boolean r1 = r6.has(r0)
            if (r1 == 0) goto L71
            boolean r1 = r6.isNull(r0)
            if (r1 != 0) goto L71
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = (java.util.List) r1
            r5.images = r1
            org.json.JSONArray r6 = r6.getJSONArray(r0)
            int r0 = r6.length()
        L4b:
            if (r2 >= r0) goto L71
            java.util.List<com.glority.android.cmsui.model.JsImgParam> r1 = r5.images
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            com.glority.android.cmsui.model.JsImgParam r3 = new com.glority.android.cmsui.model.JsImgParam
            r3.<init>()
            java.lang.Object r4 = r6.get(r2)
            if (r4 == 0) goto L69
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            com.glority.android.cmsui.model.JsImgParam r3 = r3.update(r4)
            r1.add(r3)
            int r2 = r2 + 1
            goto L4b
        L69:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type org.json.JSONObject"
            r6.<init>(r0)
            throw r6
        L71:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui.model.JsImgsParam.update(org.json.JSONObject):com.glority.android.cmsui.model.JsImgsParam");
    }
}
