package com.glority.android.cmsui2.model;

import java.util.List;
import kotlin.Metadata;

/* compiled from: JsImgsParam.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/glority/android/cmsui2/model/JsImgsParam;", "Lcom/glority/android/cmsui2/model/JsBaseParam;", "<init>", "()V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "images", "", "Lcom/glority/android/cmsui2/model/JsImgParam;", "getImages", "()Ljava/util/List;", "setImages", "(Ljava/util/List;)V", "update", "obj", "Lorg/json/JSONObject;", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public final class JsImgsParam extends JsBaseParam {
    private List<JsImgParam> images;
    private int index;

    @Override // com.glority.android.cmsui2.model.JsBaseParam
    public Object clone() {
        return super.clone();
    }

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

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[LOOP:0: B:11:0x004b->B:12:0x004d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.glority.android.cmsui2.model.JsImgsParam update(org.json.JSONObject r7) {
        /*
            r6 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = r7.toString()
            r6.setRawJson(r0)
            java.lang.String r0 = "index"
            boolean r1 = r7.has(r0)
            r2 = 0
            if (r1 == 0) goto L29
            java.lang.String r0 = r7.optString(r0)
            java.lang.String r1 = "optString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Integer r0 = kotlin.text.StringsKt.toIntOrNull(r0)
            if (r0 == 0) goto L29
            int r0 = r0.intValue()
            goto L2a
        L29:
            r0 = r2
        L2a:
            r6.index = r0
            java.lang.String r0 = "images"
            boolean r1 = r7.has(r0)
            if (r1 == 0) goto L6c
            boolean r1 = r7.isNull(r0)
            if (r1 != 0) goto L6c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = (java.util.List) r1
            r6.images = r1
            org.json.JSONArray r7 = r7.getJSONArray(r0)
            int r0 = r7.length()
        L4b:
            if (r2 >= r0) goto L6c
            java.util.List<com.glority.android.cmsui2.model.JsImgParam> r1 = r6.images
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            com.glority.android.cmsui2.model.JsImgParam r3 = new com.glority.android.cmsui2.model.JsImgParam
            r3.<init>()
            java.lang.Object r4 = r7.get(r2)
            java.lang.String r5 = "null cannot be cast to non-null type org.json.JSONObject"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r5)
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            com.glority.android.cmsui2.model.JsImgParam r3 = r3.update(r4)
            r1.add(r3)
            int r2 = r2 + 1
            goto L4b
        L6c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui2.model.JsImgsParam.update(org.json.JSONObject):com.glority.android.cmsui2.model.JsImgsParam");
    }
}
