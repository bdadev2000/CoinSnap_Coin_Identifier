package com.picturecoin.generatedAPI.kotlinAPI.recognize;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import com.glority.component.generatedAPI.kotlinAPI.enums.CmsFormat;
import com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode;
import com.glority.component.generatedAPI.kotlinAPI.enums.PhotoFrom;
import com.glority.component.generatedAPI.kotlinAPI.recognize.Location;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RecognizeMessage.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b2\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0014\b\u0086\b\u0018\u0000 \u0088\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0088\u0001Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020gH\u0016J\u0010\u0010h\u001a\u00020e2\u0006\u0010i\u001a\u00020jH\u0016J\u0014\u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020_0^H\u0016J\u0014\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0^H\u0016J\u0012\u0010m\u001a\u00020\u00152\b\u0010n\u001a\u0004\u0018\u00010_H\u0016J\b\u0010o\u001a\u00020\u0007H\u0016J\b\u0010p\u001a\u00020\u0015H\u0016J\b\u0010q\u001a\u00020\u0015H\u0016J\b\u0010r\u001a\u00020\u0015H\u0016J\b\u0010s\u001a\u00020\u0015H\u0016J\u0013\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00070uH\u0016¢\u0006\u0002\u0010vJ\u0013\u0010w\u001a\u00020\u00152\b\u0010n\u001a\u0004\u0018\u00010_H\u0096\u0002J\b\u0010x\u001a\u00020\u0017H\u0016J\t\u0010y\u001a\u00020\u0005HÆ\u0003J\t\u0010z\u001a\u00020\u0007HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010|\u001a\u00020\u000bHÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0013HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0015HÆ\u0003J\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010@J\u0011\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010EJ\u0096\u0001\u0010\u0085\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0003\u0010\u0086\u0001J\n\u0010\u0087\u0001\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010C\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0002\u0010H\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010I\u001a\u00020JX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR \u0010O\u001a\b\u0012\u0004\u0012\u00020J0PX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR \u0010U\u001a\b\u0012\u0004\u0012\u00020V0PX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010R\"\u0004\bX\u0010TR \u0010Y\u001a\b\u0012\u0004\u0012\u00020Z0PX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010R\"\u0004\b\\\u0010TR*\u0010]\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010_\u0018\u00010^X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010c¨\u0006\u0089\u0001"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/recognize/RecognizeMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "cmsFormat", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/CmsFormat;", "image", "Ljava/io/File;", "image2", "shootLocation", "Lcom/glority/component/generatedAPI/kotlinAPI/recognize/Location;", "uploadLocation", "shootAt", "Ljava/util/Date;", "photoFrom", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;", "wifi", "", "orderInHistory", "", "includeVersionInfo", "<init>", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;Lcom/glority/component/generatedAPI/kotlinAPI/enums/CmsFormat;Ljava/io/File;Ljava/io/File;Lcom/glority/component/generatedAPI/kotlinAPI/recognize/Location;Lcom/glority/component/generatedAPI/kotlinAPI/recognize/Location;Ljava/util/Date;Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;ZLjava/lang/Integer;Ljava/lang/Boolean;)V", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "getCmsFormat", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/CmsFormat;", "setCmsFormat", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/CmsFormat;)V", "getImage", "()Ljava/io/File;", "setImage", "(Ljava/io/File;)V", "getImage2", "setImage2", "getShootLocation", "()Lcom/glority/component/generatedAPI/kotlinAPI/recognize/Location;", "setShootLocation", "(Lcom/glority/component/generatedAPI/kotlinAPI/recognize/Location;)V", "getUploadLocation", "setUploadLocation", "getShootAt", "()Ljava/util/Date;", "setShootAt", "(Ljava/util/Date;)V", "getPhotoFrom", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;", "setPhotoFrom", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;)V", "getWifi", "()Z", "setWifi", "(Z)V", "getOrderInHistory", "()Ljava/lang/Integer;", "setOrderInHistory", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getIncludeVersionInfo", "()Ljava/lang/Boolean;", "setIncludeVersionInfo", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "itemId", "", "getItemId", "()J", "setItemId", "(J)V", "itemIds", "", "getItemIds", "()Ljava/util/List;", "setItemIds", "(Ljava/util/List;)V", "cmsNames", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "getCmsNames", "setCmsNames", "probabilities", "", "getProbabilities", "setProbabilities", "engineVersions", "", "", "getEngineVersions", "()Ljava/util/Map;", "setEngineVersions", "(Ljava/util/Map;)V", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "getFiles", "requestEquals", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;Lcom/glority/component/generatedAPI/kotlinAPI/enums/CmsFormat;Ljava/io/File;Ljava/io/File;Lcom/glority/component/generatedAPI/kotlinAPI/recognize/Location;Lcom/glority/component/generatedAPI/kotlinAPI/recognize/Location;Ljava/util/Date;Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;ZLjava/lang/Integer;Ljava/lang/Boolean;)Lcom/picturecoin/generatedAPI/kotlinAPI/recognize/RecognizeMessage;", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class RecognizeMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private CmsFormat cmsFormat;
    public List<CmsName> cmsNames;
    private String countryCode;
    private Map<String, ? extends Object> engineVersions;
    private File image;
    private File image2;
    private Boolean includeVersionInfo;
    private long itemId;
    public List<Long> itemIds;
    private LanguageCode languageCode;
    private Integer orderInHistory;
    private PhotoFrom photoFrom;
    public List<Double> probabilities;
    private Date shootAt;
    private Location shootLocation;
    private Location uploadLocation;
    private boolean wifi;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    public final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getWifi() {
        return this.wifi;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getOrderInHistory() {
        return this.orderInHistory;
    }

    /* renamed from: component12, reason: from getter */
    public final Boolean getIncludeVersionInfo() {
        return this.includeVersionInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component3, reason: from getter */
    public final CmsFormat getCmsFormat() {
        return this.cmsFormat;
    }

    /* renamed from: component4, reason: from getter */
    public final File getImage() {
        return this.image;
    }

    /* renamed from: component5, reason: from getter */
    public final File getImage2() {
        return this.image2;
    }

    /* renamed from: component6, reason: from getter */
    public final Location getShootLocation() {
        return this.shootLocation;
    }

    /* renamed from: component7, reason: from getter */
    public final Location getUploadLocation() {
        return this.uploadLocation;
    }

    /* renamed from: component8, reason: from getter */
    public final Date getShootAt() {
        return this.shootAt;
    }

    /* renamed from: component9, reason: from getter */
    public final PhotoFrom getPhotoFrom() {
        return this.photoFrom;
    }

    public final RecognizeMessage copy(LanguageCode languageCode, String countryCode, CmsFormat cmsFormat, File image, File image2, Location shootLocation, Location uploadLocation, Date shootAt, PhotoFrom photoFrom, boolean wifi, Integer orderInHistory, Boolean includeVersionInfo) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(photoFrom, "photoFrom");
        return new RecognizeMessage(languageCode, countryCode, cmsFormat, image, image2, shootLocation, uploadLocation, shootAt, photoFrom, wifi, orderInHistory, includeVersionInfo);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean forceHttps() {
        return true;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean mustAuth() {
        return true;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean needAuth() {
        return true;
    }

    public String toString() {
        return "RecognizeMessage(languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ", cmsFormat=" + this.cmsFormat + ", image=" + this.image + ", image2=" + this.image2 + ", shootLocation=" + this.shootLocation + ", uploadLocation=" + this.uploadLocation + ", shootAt=" + this.shootAt + ", photoFrom=" + this.photoFrom + ", wifi=" + this.wifi + ", orderInHistory=" + this.orderInHistory + ", includeVersionInfo=" + this.includeVersionInfo + ")";
    }

    public final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    public final void setLanguageCode(LanguageCode languageCode) {
        Intrinsics.checkNotNullParameter(languageCode, "<set-?>");
        this.languageCode = languageCode;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final void setCountryCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.countryCode = str;
    }

    public final CmsFormat getCmsFormat() {
        return this.cmsFormat;
    }

    public final void setCmsFormat(CmsFormat cmsFormat) {
        this.cmsFormat = cmsFormat;
    }

    public final File getImage() {
        return this.image;
    }

    public final void setImage(File file) {
        Intrinsics.checkNotNullParameter(file, "<set-?>");
        this.image = file;
    }

    public final File getImage2() {
        return this.image2;
    }

    public final void setImage2(File file) {
        this.image2 = file;
    }

    public final Location getShootLocation() {
        return this.shootLocation;
    }

    public final void setShootLocation(Location location) {
        this.shootLocation = location;
    }

    public final Location getUploadLocation() {
        return this.uploadLocation;
    }

    public final void setUploadLocation(Location location) {
        this.uploadLocation = location;
    }

    public final Date getShootAt() {
        return this.shootAt;
    }

    public final void setShootAt(Date date) {
        this.shootAt = date;
    }

    public final PhotoFrom getPhotoFrom() {
        return this.photoFrom;
    }

    public final void setPhotoFrom(PhotoFrom photoFrom) {
        Intrinsics.checkNotNullParameter(photoFrom, "<set-?>");
        this.photoFrom = photoFrom;
    }

    public final boolean getWifi() {
        return this.wifi;
    }

    public final void setWifi(boolean z) {
        this.wifi = z;
    }

    public final Integer getOrderInHistory() {
        return this.orderInHistory;
    }

    public final void setOrderInHistory(Integer num) {
        this.orderInHistory = num;
    }

    public final Boolean getIncludeVersionInfo() {
        return this.includeVersionInfo;
    }

    public final void setIncludeVersionInfo(Boolean bool) {
        this.includeVersionInfo = bool;
    }

    public RecognizeMessage(LanguageCode languageCode, String countryCode, CmsFormat cmsFormat, File image, File file, Location location, Location location2, Date date, PhotoFrom photoFrom, boolean z, Integer num, Boolean bool) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(photoFrom, "photoFrom");
        this.languageCode = languageCode;
        this.countryCode = countryCode;
        this.cmsFormat = cmsFormat;
        this.image = image;
        this.image2 = file;
        this.shootLocation = location;
        this.uploadLocation = location2;
        this.shootAt = date;
        this.photoFrom = photoFrom;
        this.wifi = z;
        this.orderInHistory = num;
        this.includeVersionInfo = bool;
    }

    public final long getItemId() {
        return this.itemId;
    }

    public final void setItemId(long j) {
        this.itemId = j;
    }

    public final List<Long> getItemIds() {
        List<Long> list = this.itemIds;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("itemIds");
        return null;
    }

    public final void setItemIds(List<Long> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.itemIds = list;
    }

    public final List<CmsName> getCmsNames() {
        List<CmsName> list = this.cmsNames;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cmsNames");
        return null;
    }

    public final void setCmsNames(List<CmsName> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.cmsNames = list;
    }

    public final List<Double> getProbabilities() {
        List<Double> list = this.probabilities;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("probabilities");
        return null;
    }

    public final void setProbabilities(List<Double> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.probabilities = list;
    }

    public final Map<String, Object> getEngineVersions() {
        return this.engineVersions;
    }

    public final void setEngineVersions(Map<String, ? extends Object> map) {
        this.engineVersions = map;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has(FirebaseAnalytics.Param.ITEM_ID) && !obj.isNull(FirebaseAnalytics.Param.ITEM_ID)) {
            this.itemId = obj.getLong(FirebaseAnalytics.Param.ITEM_ID);
            if (obj.has("item_ids") && !obj.isNull("item_ids")) {
                JSONArray jSONArray = obj.getJSONArray("item_ids");
                setItemIds(new ArrayList());
                int length = jSONArray.length() - 1;
                int i = 0;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jSONArray.getLong(i2);
                        List<Long> itemIds = getItemIds();
                        Intrinsics.checkNotNull(itemIds);
                        itemIds.add(Long.valueOf(j));
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (obj.has("cms_names") && !obj.isNull("cms_names")) {
                    JSONArray jSONArray2 = obj.getJSONArray("cms_names");
                    setCmsNames(new ArrayList());
                    int length2 = jSONArray2.length() - 1;
                    if (length2 >= 0) {
                        int i3 = 0;
                        while (true) {
                            Object obj2 = jSONArray2.get(i3);
                            if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                                obj2 = new JSONObject();
                            }
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                            CmsName cmsName = new CmsName((JSONObject) obj2);
                            List<CmsName> cmsNames = getCmsNames();
                            Intrinsics.checkNotNull(cmsNames);
                            cmsNames.add(cmsName);
                            if (i3 == length2) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                    if (obj.has("probabilities") && !obj.isNull("probabilities")) {
                        JSONArray jSONArray3 = obj.getJSONArray("probabilities");
                        setProbabilities(new ArrayList());
                        int length3 = jSONArray3.length() - 1;
                        if (length3 >= 0) {
                            while (true) {
                                double d = jSONArray3.getDouble(i);
                                List<Double> probabilities = getProbabilities();
                                Intrinsics.checkNotNull(probabilities);
                                probabilities.add(Double.valueOf(d));
                                if (i == length3) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                        if (obj.has("engine_versions") && !obj.isNull("engine_versions")) {
                            Object obj3 = obj.get("engine_versions");
                            if ((obj3 instanceof JSONArray) && ((JSONArray) obj3).length() == 0) {
                                obj3 = new JSONObject();
                            }
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                            this.engineVersions = jsonObjectToMap((JSONObject) obj3);
                        } else {
                            this.engineVersions = null;
                        }
                        this._response_at = new Date();
                        return;
                    }
                    throw new ParameterCheckFailException("probabilities is missing in api Recognize");
                }
                throw new ParameterCheckFailException("cms_names is missing in api Recognize");
            }
            throw new ParameterCheckFailException("item_ids is missing in api Recognize");
        }
        throw new ParameterCheckFailException("item_id is missing in api Recognize");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("language_code", Integer.valueOf(this.languageCode.getValue()));
        hashMap.put("country_code", this.countryCode);
        CmsFormat cmsFormat = this.cmsFormat;
        if (cmsFormat != null) {
            Intrinsics.checkNotNull(cmsFormat);
            hashMap.put("cms_format", Integer.valueOf(cmsFormat.getValue()));
        }
        Location location = this.shootLocation;
        if (location != null) {
            Intrinsics.checkNotNull(location);
            hashMap.put("shoot_location", location.getJsonMap());
        }
        Location location2 = this.uploadLocation;
        if (location2 != null) {
            Intrinsics.checkNotNull(location2);
            hashMap.put("upload_location", location2.getJsonMap());
        }
        Date date = this.shootAt;
        if (date != null) {
            Intrinsics.checkNotNull(date);
            hashMap.put("shoot_at", Long.valueOf(date.getTime() / 1000));
        }
        hashMap.put("photo_from", Integer.valueOf(this.photoFrom.getValue()));
        hashMap.put("wifi", Integer.valueOf(this.wifi ? 1 : 0));
        Integer num = this.orderInHistory;
        if (num != null) {
            Intrinsics.checkNotNull(num);
            hashMap.put("order_in_history", num);
        }
        Boolean bool = this.includeVersionInfo;
        if (bool != null) {
            Intrinsics.checkNotNull(bool);
            hashMap.put("include_version_info", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        HashMap hashMap = new HashMap();
        File file = this.image;
        if (file != null) {
        }
        File file2 = this.image2;
        if (file2 != null) {
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof RecognizeMessage)) {
            return false;
        }
        RecognizeMessage recognizeMessage = (RecognizeMessage) other;
        return this.languageCode == recognizeMessage.languageCode && Intrinsics.areEqual(this.countryCode, recognizeMessage.countryCode) && this.cmsFormat == recognizeMessage.cmsFormat && Intrinsics.areEqual(this.image, recognizeMessage.image) && Intrinsics.areEqual(this.image2, recognizeMessage.image2) && Intrinsics.areEqual(this.shootLocation, recognizeMessage.shootLocation) && Intrinsics.areEqual(this.uploadLocation, recognizeMessage.uploadLocation) && Intrinsics.areEqual(this.shootAt, recognizeMessage.shootAt) && this.photoFrom == recognizeMessage.photoFrom && this.wifi == recognizeMessage.wifi && Intrinsics.areEqual(this.orderInHistory, recognizeMessage.orderInHistory) && Intrinsics.areEqual(this.includeVersionInfo, recognizeMessage.includeVersionInfo);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public String api() {
        return INSTANCE.getApi();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public String[] methods() {
        return new String[]{"post"};
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof RecognizeMessage)) {
            return false;
        }
        RecognizeMessage recognizeMessage = (RecognizeMessage) other;
        return this.languageCode == recognizeMessage.languageCode && Intrinsics.areEqual(this.countryCode, recognizeMessage.countryCode) && this.cmsFormat == recognizeMessage.cmsFormat && Intrinsics.areEqual(this.image, recognizeMessage.image) && Intrinsics.areEqual(this.image2, recognizeMessage.image2) && Intrinsics.areEqual(this.shootLocation, recognizeMessage.shootLocation) && Intrinsics.areEqual(this.uploadLocation, recognizeMessage.uploadLocation) && Intrinsics.areEqual(this.shootAt, recognizeMessage.shootAt) && this.photoFrom == recognizeMessage.photoFrom && this.wifi == recognizeMessage.wifi && Intrinsics.areEqual(this.orderInHistory, recognizeMessage.orderInHistory) && Intrinsics.areEqual(this.includeVersionInfo, recognizeMessage.includeVersionInfo) && this.itemId == recognizeMessage.itemId && Intrinsics.areEqual(getItemIds(), recognizeMessage.getItemIds()) && Intrinsics.areEqual(getCmsNames(), recognizeMessage.getCmsNames()) && Intrinsics.areEqual(getProbabilities(), recognizeMessage.getProbabilities()) && Intrinsics.areEqual(this.engineVersions, recognizeMessage.engineVersions);
    }

    public int hashCode() {
        int hashCode = ((((getClass().hashCode() * 31) + this.languageCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31;
        CmsFormat cmsFormat = this.cmsFormat;
        int hashCode2 = (((hashCode + (cmsFormat != null ? cmsFormat.hashCode() : 0)) * 31) + this.image.hashCode()) * 31;
        File file = this.image2;
        int hashCode3 = (hashCode2 + (file != null ? file.hashCode() : 0)) * 31;
        Location location = this.shootLocation;
        int hashCode4 = (hashCode3 + (location != null ? location.hashCode() : 0)) * 31;
        Location location2 = this.uploadLocation;
        int hashCode5 = (hashCode4 + (location2 != null ? location2.hashCode() : 0)) * 31;
        Date date = this.shootAt;
        int hashCode6 = (((((hashCode5 + (date != null ? date.hashCode() : 0)) * 31) + this.photoFrom.hashCode()) * 31) + Boolean.hashCode(this.wifi)) * 31;
        Integer num = this.orderInHistory;
        int hashCode7 = (hashCode6 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.includeVersionInfo;
        int hashCode8 = (((((((((hashCode7 + (bool != null ? bool.hashCode() : 0)) * 31) + Long.hashCode(this.itemId)) * 31) + getItemIds().hashCode()) * 31) + getCmsNames().hashCode()) * 31) + getProbabilities().hashCode()) * 31;
        Map<String, ? extends Object> map = this.engineVersions;
        return hashCode8 + (map != null ? map.hashCode() : 0);
    }

    /* compiled from: RecognizeMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/recognize/RecognizeMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/recognize/recognize";
        }
    }
}
