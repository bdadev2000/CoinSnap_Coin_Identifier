package com.glority.component.generatedAPI.kotlinAPI.cms;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.definition.APIModelBase;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u00012B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010$H\u0014J\t\u0010(\u001a\u00020\bHÂ\u0003J\u0013\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010$H\u0096\u0002J\u0016\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010$0.H\u0016J\u001c\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010$0.2\u0006\u0010/\u001a\u00020+J\b\u00100\u001a\u00020\bH\u0016J\t\u00101\u001a\u00020\u000bHÖ\u0001R*\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R6\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00142\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00148F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R*\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R*\u0010 \u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/Copyright;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "author", "getAuthor", "()Ljava/lang/String;", "setAuthor", "(Ljava/lang/String;)V", "authorlink", "getAuthorlink", "setAuthorlink", "", "certIcons", "getCertIcons", "()Ljava/util/List;", "setCertIcons", "(Ljava/util/List;)V", "certUrl", "getCertUrl", "setCertUrl", "detailUrl", "getDetailUrl", "setDetailUrl", "license", "getLicense", "setLicense", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class Copyright extends APIModelBase<Copyright> implements Serializable, Cloneable {

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
        return "Copyright(unused=" + this.unused + ')';
    }

    public Copyright(int i) {
        this.unused = i;
    }

    public /* synthetic */ Copyright(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
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
    public Copyright(org.json.JSONObject r8) throws java.lang.Exception {
        /*
            r7 = this;
            java.lang.String r0 = "obj"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            r1 = 1
            r2 = 0
            r7.<init>(r0, r1, r2)
            java.lang.String r3 = "author"
            boolean r4 = r8.has(r3)
            if (r4 == 0) goto L20
            boolean r4 = r8.isNull(r3)
            if (r4 != 0) goto L20
            java.lang.String r3 = r8.getString(r3)
            r7.author = r3
            goto L22
        L20:
            r7.author = r2
        L22:
            java.lang.String r3 = "cert_icons"
            boolean r4 = r8.has(r3)
            if (r4 == 0) goto L5c
            boolean r4 = r8.isNull(r3)
            if (r4 != 0) goto L5c
            org.json.JSONArray r3 = r8.getJSONArray(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r4 = (java.util.List) r4
            r7.certIcons = r4
            int r4 = r3.length()
            int r4 = r4 - r1
            if (r4 < 0) goto L5e
        L44:
            int r1 = r0 + 1
            java.lang.String r5 = r3.getString(r0)
            java.lang.String r6 = "__certIcons.getString(i0)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.util.List<java.lang.String> r6 = r7.certIcons
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r6.add(r5)
            if (r0 != r4) goto L5a
            goto L5e
        L5a:
            r0 = r1
            goto L44
        L5c:
            r7.certIcons = r2
        L5e:
            java.lang.String r0 = "cert_url"
            boolean r1 = r8.has(r0)
            if (r1 == 0) goto L73
            boolean r1 = r8.isNull(r0)
            if (r1 != 0) goto L73
            java.lang.String r0 = r8.getString(r0)
            r7.certUrl = r0
            goto L75
        L73:
            r7.certUrl = r2
        L75:
            java.lang.String r0 = "detail_url"
            boolean r1 = r8.has(r0)
            if (r1 == 0) goto L8a
            boolean r1 = r8.isNull(r0)
            if (r1 != 0) goto L8a
            java.lang.String r0 = r8.getString(r0)
            r7.detailUrl = r0
            goto L8c
        L8a:
            r7.detailUrl = r2
        L8c:
            java.lang.String r0 = "authorlink"
            boolean r1 = r8.has(r0)
            if (r1 == 0) goto La1
            boolean r1 = r8.isNull(r0)
            if (r1 != 0) goto La1
            java.lang.String r0 = r8.getString(r0)
            r7.authorlink = r0
            goto La3
        La1:
            r7.authorlink = r2
        La3:
            java.lang.String r0 = "license"
            boolean r1 = r8.has(r0)
            if (r1 == 0) goto Lb8
            boolean r1 = r8.isNull(r0)
            if (r1 != 0) goto Lb8
            java.lang.String r8 = r8.getString(r0)
            r7.license = r8
            goto Lba
        Lb8:
            r7.license = r2
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.component.generatedAPI.kotlinAPI.cms.Copyright.<init>(org.json.JSONObject):void");
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

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof Copyright)) {
            return false;
        }
        Copyright copyright = (Copyright) other;
        return Intrinsics.areEqual(this.author, copyright.author) && Intrinsics.areEqual(this.certIcons, copyright.certIcons) && Intrinsics.areEqual(this.certUrl, copyright.certUrl) && Intrinsics.areEqual(this.detailUrl, copyright.detailUrl) && Intrinsics.areEqual(this.authorlink, copyright.authorlink) && Intrinsics.areEqual(this.license, copyright.license);
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

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        Copyright copyright = new Copyright(0, 1, null);
        cloneTo(copyright);
        return copyright;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            Copyright copyright = (Copyright) o;
            super.cloneTo(copyright);
            String str = this.author;
            copyright.author = str != null ? cloneField(str) : null;
            if (this.certIcons == null) {
                copyright.certIcons = null;
            } else {
                copyright.certIcons = new ArrayList();
                List<String> list = this.certIcons;
                Intrinsics.checkNotNull(list);
                for (String str2 : list) {
                    List<String> list2 = copyright.certIcons;
                    Intrinsics.checkNotNull(list2);
                    String cloneField = cloneField(str2);
                    Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(item)");
                    list2.add(cloneField);
                }
            }
            String str3 = this.certUrl;
            copyright.certUrl = str3 != null ? cloneField(str3) : null;
            String str4 = this.detailUrl;
            copyright.detailUrl = str4 != null ? cloneField(str4) : null;
            String str5 = this.authorlink;
            copyright.authorlink = str5 != null ? cloneField(str5) : null;
            String str6 = this.license;
            copyright.license = str6 != null ? cloneField(str6) : null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.cms.Copyright");
    }

    /* compiled from: Copyright.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/Copyright$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getCopyrightJsonArrayMap", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/Copyright;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
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
