package com.glority.android.cmsui.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Copyright.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u000f\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\"\u001a\u00020\u0007HÂ\u0003J\u0013\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010'0)J\u001c\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010'0)2\u0006\u0010*\u001a\u00020%J\b\u0010+\u001a\u00020\u0007H\u0016J\t\u0010,\u001a\u00020\nHÖ\u0001R*\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR6\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00132\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00138F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u0019\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR*\u0010\u001c\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR*\u0010\u001f\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/glority/android/cmsui/model/Copyright;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "author", "getAuthor", "()Ljava/lang/String;", "setAuthor", "(Ljava/lang/String;)V", "authorlink", "getAuthorlink", "setAuthorlink", "", "certIcons", "getCertIcons", "()Ljava/util/List;", "setCertIcons", "(Ljava/util/List;)V", "certUrl", "getCertUrl", "setCertUrl", "detailUrl", "getDetailUrl", "setDetailUrl", "license", "getLicense", "setLicense", "component1", "copy", "equals", "", "other", "", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class Copyright implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String author;
    private String authorlink;
    private List<String> certIcons;
    private String certUrl;
    private String detailUrl;
    private String license;
    private int unused;

    public Copyright() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ Copyright copy$default(Copyright copyright, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = copyright.unused;
        }
        return copyright.copy(i);
    }

    public final Copyright copy(int unused) {
        return new Copyright(unused);
    }

    public String toString() {
        return "Copyright(unused=" + this.unused + ")";
    }

    public Copyright(int i) {
        this.unused = i;
    }

    public /* synthetic */ Copyright(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public Object clone() {
        return super.clone();
    }

    public final String getAuthor() {
        return this.author;
    }

    public final void setAuthor(String str) {
        this.author = str;
    }

    public final List<String> getCertIcons() {
        return this.certIcons;
    }

    public final void setCertIcons(List<String> list) {
        this.certIcons = list;
    }

    public final String getCertUrl() {
        return this.certUrl;
    }

    public final void setCertUrl(String str) {
        this.certUrl = str;
    }

    public final String getDetailUrl() {
        return this.detailUrl;
    }

    public final void setDetailUrl(String str) {
        this.detailUrl = str;
    }

    public final String getAuthorlink() {
        return this.authorlink;
    }

    public final void setAuthorlink(String str) {
        this.authorlink = str;
    }

    public final String getLicense() {
        return this.license;
    }

    public final void setLicense(String str) {
        this.license = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Copyright(org.json.JSONObject r7) throws java.lang.Exception {
        /*
            r6 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            r1 = 1
            r2 = 0
            r6.<init>(r0, r1, r2)
            java.lang.String r3 = "author"
            boolean r4 = r7.has(r3)
            if (r4 == 0) goto L20
            boolean r4 = r7.isNull(r3)
            if (r4 != 0) goto L20
            java.lang.String r3 = r7.getString(r3)
            r6.author = r3
            goto L25
        L20:
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            r6.author = r2
        L25:
            java.lang.String r3 = "cert_icons"
            boolean r4 = r7.has(r3)
            if (r4 == 0) goto L5d
            boolean r4 = r7.isNull(r3)
            if (r4 != 0) goto L5d
            org.json.JSONArray r3 = r7.getJSONArray(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r4 = (java.util.List) r4
            r6.certIcons = r4
            int r4 = r3.length()
            int r4 = r4 - r1
            if (r4 < 0) goto L62
        L47:
            java.lang.String r1 = r3.getString(r0)
            java.lang.String r5 = "__certIcons.getString(i0)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            java.util.List<java.lang.String> r5 = r6.certIcons
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            r5.add(r1)
            if (r0 == r4) goto L62
            int r0 = r0 + 1
            goto L47
        L5d:
            r0 = r2
            java.util.List r0 = (java.util.List) r0
            r6.certIcons = r2
        L62:
            java.lang.String r0 = "cert_url"
            boolean r1 = r7.has(r0)
            if (r1 == 0) goto L77
            boolean r1 = r7.isNull(r0)
            if (r1 != 0) goto L77
            java.lang.String r0 = r7.getString(r0)
            r6.certUrl = r0
            goto L7c
        L77:
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0
            r6.certUrl = r2
        L7c:
            java.lang.String r0 = "detail_url"
            boolean r1 = r7.has(r0)
            if (r1 == 0) goto L91
            boolean r1 = r7.isNull(r0)
            if (r1 != 0) goto L91
            java.lang.String r0 = r7.getString(r0)
            r6.detailUrl = r0
            goto L96
        L91:
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0
            r6.detailUrl = r2
        L96:
            java.lang.String r0 = "authorlink"
            boolean r1 = r7.has(r0)
            if (r1 == 0) goto Lab
            boolean r1 = r7.isNull(r0)
            if (r1 != 0) goto Lab
            java.lang.String r0 = r7.getString(r0)
            r6.authorlink = r0
            goto Lb0
        Lab:
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0
            r6.authorlink = r2
        Lb0:
            java.lang.String r0 = "license"
            boolean r1 = r7.has(r0)
            if (r1 == 0) goto Lc5
            boolean r1 = r7.isNull(r0)
            if (r1 != 0) goto Lc5
            java.lang.String r7 = r7.getString(r0)
            r6.license = r7
            goto Lca
        Lc5:
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            r6.license = r2
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui.model.Copyright.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        String str = this.author;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("author", str);
        } else if (keepNull) {
            hashMap.put("author", null);
        }
        List<String> list = this.certIcons;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            hashMap.put("cert_icons", list);
        } else if (keepNull) {
            hashMap.put("cert_icons", null);
        }
        String str2 = this.certUrl;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            hashMap.put("cert_url", str2);
        } else if (keepNull) {
            hashMap.put("cert_url", null);
        }
        String str3 = this.detailUrl;
        if (str3 != null) {
            Intrinsics.checkNotNull(str3);
            hashMap.put("detail_url", str3);
        } else if (keepNull) {
            hashMap.put("detail_url", null);
        }
        String str4 = this.authorlink;
        if (str4 != null) {
            Intrinsics.checkNotNull(str4);
            hashMap.put("authorlink", str4);
        } else if (keepNull) {
            hashMap.put("authorlink", null);
        }
        String str5 = this.license;
        if (str5 != null) {
            Intrinsics.checkNotNull(str5);
            hashMap.put("license", str5);
        } else if (keepNull) {
            hashMap.put("license", null);
        }
        return hashMap;
    }

    public final Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof Copyright)) {
            return false;
        }
        Copyright copyright = (Copyright) other;
        return ((Intrinsics.areEqual(this.author, copyright.author) ^ true) || (Intrinsics.areEqual(this.certIcons, copyright.certIcons) ^ true) || (Intrinsics.areEqual(this.certUrl, copyright.certUrl) ^ true) || (Intrinsics.areEqual(this.detailUrl, copyright.detailUrl) ^ true) || (Intrinsics.areEqual(this.authorlink, copyright.authorlink) ^ true) || (Intrinsics.areEqual(this.license, copyright.license) ^ true)) ? false : true;
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        String str = this.author;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<String> list = this.certIcons;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.certUrl;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.detailUrl;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.authorlink;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.license;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    /* compiled from: Copyright.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/android/cmsui/model/Copyright$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getCopyrightJsonArrayMap", "", "array", "Lcom/glority/android/cmsui/model/Copyright;", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Map<String, Object>> getCopyrightJsonArrayMap(List<Copyright> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Copyright) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put("certIcons", String.class);
            return hashMap;
        }
    }
}
