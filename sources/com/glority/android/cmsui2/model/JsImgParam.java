package com.glority.android.cmsui2.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: JsImgParam.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/glority/android/cmsui2/model/JsImgParam;", "Lcom/glority/android/cmsui2/model/JsBaseParam;", "<init>", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "license", "getLicense", "setLicense", "certLink", "getCertLink", "setCertLink", "author", "getAuthor", "setAuthor", "authorLink", "getAuthorLink", "setAuthorLink", "detailUrl", "getDetailUrl", "setDetailUrl", "update", "obj", "Lorg/json/JSONObject;", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public final class JsImgParam extends JsBaseParam {
    private String author;
    private String authorLink;
    private String certLink;
    private String detailUrl;
    private String license;
    private String url;

    @Override // com.glority.android.cmsui2.model.JsBaseParam
    public Object clone() {
        return super.clone();
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final String getLicense() {
        return this.license;
    }

    public final void setLicense(String str) {
        this.license = str;
    }

    public final String getCertLink() {
        return this.certLink;
    }

    public final void setCertLink(String str) {
        this.certLink = str;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final void setAuthor(String str) {
        this.author = str;
    }

    public final String getAuthorLink() {
        return this.authorLink;
    }

    public final void setAuthorLink(String str) {
        this.authorLink = str;
    }

    public final String getDetailUrl() {
        return this.detailUrl;
    }

    public final void setDetailUrl(String str) {
        this.detailUrl = str;
    }

    public final JsImgParam update(JSONObject obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        this.url = obj.has("url") ? obj.optString("url") : null;
        this.license = obj.has("license") ? obj.optString("license") : null;
        this.certLink = obj.has("certLink") ? obj.optString("certLink") : null;
        this.author = obj.has("author") ? obj.optString("author") : null;
        this.authorLink = obj.has("authorLink") ? obj.optString("authorLink") : null;
        this.detailUrl = obj.has("detailUrl") ? obj.optString("detailUrl") : null;
        setRawJson(obj.toString());
        return this;
    }
}
