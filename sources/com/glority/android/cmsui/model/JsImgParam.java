package com.glority.android.cmsui.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: JsImgParam.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/glority/android/cmsui/model/JsImgParam;", "Lcom/glority/android/cmsui/model/JsBaseParam;", "()V", "author", "", "getAuthor", "()Ljava/lang/String;", "setAuthor", "(Ljava/lang/String;)V", "authorLink", "getAuthorLink", "setAuthorLink", "certLink", "getCertLink", "setCertLink", "detailUrl", "getDetailUrl", "setDetailUrl", "license", "getLicense", "setLicense", "url", "getUrl", "setUrl", "update", "obj", "Lorg/json/JSONObject;", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class JsImgParam extends JsBaseParam {
    private String author;
    private String authorLink;
    private String certLink;
    private String detailUrl;
    private String license;
    private String url;

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
