package com.glority.component.generatedAPI.kotlinAPI.storage;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: UploadToken.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u00018B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010)\u001a\u00020*H\u0016J\u0012\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010*H\u0014J\t\u0010.\u001a\u00020\bHÂ\u0003J\u0013\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010*H\u0096\u0002J\u0016\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010*04H\u0016J\u001c\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010*042\u0006\u00105\u001a\u000201J\b\u00106\u001a\u00020\bH\u0016J\t\u00107\u001a\u00020\u000bHÖ\u0001R&\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R&\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R&\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R&\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R&\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u001d8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R&\u0010#\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R&\u0010&\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/storage/UploadToken;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "accessKeyId", "getAccessKeyId", "()Ljava/lang/String;", "setAccessKeyId", "(Ljava/lang/String;)V", "accessKeySecret", "getAccessKeySecret", "setAccessKeySecret", "authorizedPath", "getAuthorizedPath", "setAuthorizedPath", "bucket", "getBucket", "setBucket", "downloadUrlPrefix", "getDownloadUrlPrefix", "setDownloadUrlPrefix", "Ljava/util/Date;", "expiration", "getExpiration", "()Ljava/util/Date;", "setExpiration", "(Ljava/util/Date;)V", TtmlNode.TAG_REGION, "getRegion", "setRegion", "securityToken", "getSecurityToken", "setSecurityToken", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "base-aws_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class UploadToken extends APIModelBase<UploadToken> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public String accessKeyId;
    public String accessKeySecret;
    public String authorizedPath;
    public String bucket;
    public String downloadUrlPrefix;
    public Date expiration;
    public String region;
    public String securityToken;
    private int unused;

    public UploadToken() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ UploadToken copy$default(UploadToken uploadToken, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = uploadToken.unused;
        }
        return uploadToken.copy(i);
    }

    public final UploadToken copy(int unused) {
        return new UploadToken(unused);
    }

    public String toString() {
        return "UploadToken(unused=" + this.unused + ')';
    }

    public UploadToken(int i) {
        this.unused = i;
    }

    public /* synthetic */ UploadToken(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final String getAccessKeyId() {
        String str = this.accessKeyId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accessKeyId");
        return null;
    }

    public final void setAccessKeyId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.accessKeyId = str;
    }

    public final String getAccessKeySecret() {
        String str = this.accessKeySecret;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accessKeySecret");
        return null;
    }

    public final void setAccessKeySecret(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.accessKeySecret = str;
    }

    public final String getSecurityToken() {
        String str = this.securityToken;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("securityToken");
        return null;
    }

    public final void setSecurityToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.securityToken = str;
    }

    public final Date getExpiration() {
        Date date = this.expiration;
        if (date != null) {
            return date;
        }
        Intrinsics.throwUninitializedPropertyAccessException("expiration");
        return null;
    }

    public final void setExpiration(Date date) {
        Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.expiration = date;
    }

    public final String getBucket() {
        String str = this.bucket;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bucket");
        return null;
    }

    public final void setBucket(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bucket = str;
    }

    public final String getRegion() {
        String str = this.region;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(TtmlNode.TAG_REGION);
        return null;
    }

    public final void setRegion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.region = str;
    }

    public final String getAuthorizedPath() {
        String str = this.authorizedPath;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authorizedPath");
        return null;
    }

    public final void setAuthorizedPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.authorizedPath = str;
    }

    public final String getDownloadUrlPrefix() {
        String str = this.downloadUrlPrefix;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("downloadUrlPrefix");
        return null;
    }

    public final void setDownloadUrlPrefix(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.downloadUrlPrefix = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UploadToken(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("access_key_id")) {
            String string = obj.getString("access_key_id");
            Intrinsics.checkNotNullExpressionValue(string, "obj.getString(\"access_key_id\")");
            setAccessKeyId(string);
            if (obj.has("access_key_secret")) {
                String string2 = obj.getString("access_key_secret");
                Intrinsics.checkNotNullExpressionValue(string2, "obj.getString(\"access_key_secret\")");
                setAccessKeySecret(string2);
                if (obj.has("security_token")) {
                    String string3 = obj.getString("security_token");
                    Intrinsics.checkNotNullExpressionValue(string3, "obj.getString(\"security_token\")");
                    setSecurityToken(string3);
                    if (obj.has("expiration")) {
                        setExpiration(new Date(obj.getLong("expiration") * 1000));
                        if (obj.has("bucket")) {
                            String string4 = obj.getString("bucket");
                            Intrinsics.checkNotNullExpressionValue(string4, "obj.getString(\"bucket\")");
                            setBucket(string4);
                            if (obj.has(TtmlNode.TAG_REGION)) {
                                String string5 = obj.getString(TtmlNode.TAG_REGION);
                                Intrinsics.checkNotNullExpressionValue(string5, "obj.getString(\"region\")");
                                setRegion(string5);
                                if (obj.has("authorized_path")) {
                                    String string6 = obj.getString("authorized_path");
                                    Intrinsics.checkNotNullExpressionValue(string6, "obj.getString(\"authorized_path\")");
                                    setAuthorizedPath(string6);
                                    if (obj.has("download_url_prefix")) {
                                        String string7 = obj.getString("download_url_prefix");
                                        Intrinsics.checkNotNullExpressionValue(string7, "obj.getString(\"download_url_prefix\")");
                                        setDownloadUrlPrefix(string7);
                                        return;
                                    }
                                    throw new ParameterCheckFailException("downloadUrlPrefix is missing in model UploadToken");
                                }
                                throw new ParameterCheckFailException("authorizedPath is missing in model UploadToken");
                            }
                            throw new ParameterCheckFailException("region is missing in model UploadToken");
                        }
                        throw new ParameterCheckFailException("bucket is missing in model UploadToken");
                    }
                    throw new ParameterCheckFailException("expiration is missing in model UploadToken");
                }
                throw new ParameterCheckFailException("securityToken is missing in model UploadToken");
            }
            throw new ParameterCheckFailException("accessKeySecret is missing in model UploadToken");
        }
        throw new ParameterCheckFailException("accessKeyId is missing in model UploadToken");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("access_key_id", getAccessKeyId());
        hashMap.put("access_key_secret", getAccessKeySecret());
        hashMap.put("security_token", getSecurityToken());
        hashMap.put("expiration", Long.valueOf(getExpiration().getTime() / 1000));
        hashMap.put("bucket", getBucket());
        hashMap.put(TtmlNode.TAG_REGION, getRegion());
        hashMap.put("authorized_path", getAuthorizedPath());
        hashMap.put("download_url_prefix", getDownloadUrlPrefix());
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof UploadToken)) {
            return false;
        }
        UploadToken uploadToken = (UploadToken) other;
        return Intrinsics.areEqual(getAccessKeyId(), uploadToken.getAccessKeyId()) && Intrinsics.areEqual(getAccessKeySecret(), uploadToken.getAccessKeySecret()) && Intrinsics.areEqual(getSecurityToken(), uploadToken.getSecurityToken()) && Intrinsics.areEqual(getExpiration(), uploadToken.getExpiration()) && Intrinsics.areEqual(getBucket(), uploadToken.getBucket()) && Intrinsics.areEqual(getRegion(), uploadToken.getRegion()) && Intrinsics.areEqual(getAuthorizedPath(), uploadToken.getAuthorizedPath()) && Intrinsics.areEqual(getDownloadUrlPrefix(), uploadToken.getDownloadUrlPrefix());
    }

    public int hashCode() {
        return (((((((((((((((getClass().hashCode() * 31) + getAccessKeyId().hashCode()) * 31) + getAccessKeySecret().hashCode()) * 31) + getSecurityToken().hashCode()) * 31) + getExpiration().hashCode()) * 31) + getBucket().hashCode()) * 31) + getRegion().hashCode()) * 31) + getAuthorizedPath().hashCode()) * 31) + getDownloadUrlPrefix().hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        UploadToken uploadToken = new UploadToken(0, 1, null);
        cloneTo(uploadToken);
        return uploadToken;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            UploadToken uploadToken = (UploadToken) o;
            super.cloneTo(uploadToken);
            String cloneField = cloneField(getAccessKeyId());
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.accessKeyId)");
            uploadToken.setAccessKeyId(cloneField);
            String cloneField2 = cloneField(getAccessKeySecret());
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.accessKeySecret)");
            uploadToken.setAccessKeySecret(cloneField2);
            String cloneField3 = cloneField(getSecurityToken());
            Intrinsics.checkNotNullExpressionValue(cloneField3, "cloneField(this.securityToken)");
            uploadToken.setSecurityToken(cloneField3);
            Date cloneField4 = cloneField(getExpiration());
            Intrinsics.checkNotNullExpressionValue(cloneField4, "cloneField(this.expiration)");
            uploadToken.setExpiration(cloneField4);
            String cloneField5 = cloneField(getBucket());
            Intrinsics.checkNotNullExpressionValue(cloneField5, "cloneField(this.bucket)");
            uploadToken.setBucket(cloneField5);
            String cloneField6 = cloneField(getRegion());
            Intrinsics.checkNotNullExpressionValue(cloneField6, "cloneField(this.region)");
            uploadToken.setRegion(cloneField6);
            String cloneField7 = cloneField(getAuthorizedPath());
            Intrinsics.checkNotNullExpressionValue(cloneField7, "cloneField(this.authorizedPath)");
            uploadToken.setAuthorizedPath(cloneField7);
            String cloneField8 = cloneField(getDownloadUrlPrefix());
            Intrinsics.checkNotNullExpressionValue(cloneField8, "cloneField(this.downloadUrlPrefix)");
            uploadToken.setDownloadUrlPrefix(cloneField8);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.storage.UploadToken");
    }

    /* compiled from: UploadToken.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/storage/UploadToken$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getUploadTokenJsonArrayMap", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/storage/UploadToken;", "base-aws_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getUploadTokenJsonArrayMap(List<UploadToken> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UploadToken) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
