package com.picturecoin.generatedAPI.kotlinAPI.collection;

import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.definition.APIModelBase;
import com.glority.android.xx.constants.Args;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.picturecoin.generatedAPI.kotlinAPI.model.CoinTag;
import com.picturecoin.generatedAPI.kotlinAPI.model.PriceValue;
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

/* compiled from: Collection.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 ¡\u00012\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0002¡\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ!\u0010\u0092\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0007\u0012\u0005\u0018\u00010\u0094\u00010\u0093\u00012\b\u0010\u0095\u0001\u001a\u00030\u0096\u0001J\u0019\u0010\u0092\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0007\u0012\u0005\u0018\u00010\u0094\u00010\u0093\u0001H\u0016J\u0017\u0010\u0097\u0001\u001a\u00030\u0096\u00012\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0094\u0001H\u0096\u0002J\t\u0010\u0099\u0001\u001a\u00020\u0005H\u0016J\n\u0010\u009a\u0001\u001a\u00030\u0094\u0001H\u0016J\u0016\u0010\u009b\u0001\u001a\u00030\u009c\u00012\n\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u0094\u0001H\u0014J\n\u0010\u009e\u0001\u001a\u00020\u0005HÂ\u0003J\u0014\u0010\u009f\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\n\u0010 \u0001\u001a\u00020\u0019HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001c\u0010!\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001c\u0010$\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR\u001c\u0010'\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00190+X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010\u001dR\u001c\u00103\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u001dR\u001c\u00106\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001b\"\u0004\b8\u0010\u001dR\u001c\u00109\u001a\u0004\u0018\u00010:X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010?\u001a\u0004\u0018\u00010@X\u0086\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001c\u0010F\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u001b\"\u0004\bH\u0010\u001dR\u001e\u0010I\u001a\u0004\u0018\u00010@X\u0086\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bJ\u0010B\"\u0004\bK\u0010DR\u001e\u0010L\u001a\u0004\u0018\u00010@X\u0086\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bM\u0010B\"\u0004\bN\u0010DR\u001e\u0010O\u001a\u0004\u0018\u00010@X\u0086\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bP\u0010B\"\u0004\bQ\u0010DR\u001c\u0010R\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u001b\"\u0004\bT\u0010\u001dR \u0010U\u001a\b\u0012\u0004\u0012\u00020\u00190+X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010-\"\u0004\bW\u0010/R\u001c\u0010X\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u001b\"\u0004\bZ\u0010\u001dR\u001c\u0010[\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u001b\"\u0004\b]\u0010\u001dR\u001c\u0010^\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u001b\"\u0004\b`\u0010\u001dR\u001c\u0010a\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u001b\"\u0004\bc\u0010\u001dR\u001c\u0010d\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u001b\"\u0004\bf\u0010\u001dR\u001c\u0010g\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u001b\"\u0004\bi\u0010\u001dR\u001c\u0010j\u001a\u0004\u0018\u00010:X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010<\"\u0004\bl\u0010>R\u001c\u0010m\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010\u001b\"\u0004\bo\u0010\u001dR\u001c\u0010p\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\u001b\"\u0004\br\u0010\u001dR\u001e\u0010s\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\bt\u0010\r\"\u0004\bu\u0010\u000fR\u001c\u0010v\u001a\u0004\u0018\u00010wX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u001c\u0010|\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010\u001b\"\u0004\b~\u0010\u001dR\u001e\u0010\u007f\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010\u001b\"\u0005\b\u0081\u0001\u0010\u001dR%\u0010\u0082\u0001\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010+X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010-\"\u0005\b\u0084\u0001\u0010/R%\u0010\u0085\u0001\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010+X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010-\"\u0005\b\u0087\u0001\u0010/R\u001f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010\u001b\"\u0005\b\u008a\u0001\u0010\u001dR&\u0010\u008b\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u008c\u0001\u0018\u00010+X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010-\"\u0005\b\u008e\u0001\u0010/R&\u0010\u008f\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u008c\u0001\u0018\u00010+X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010-\"\u0005\b\u0091\u0001\u0010/¨\u0006¢\u0001"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/collection/Collection;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "collectionId", "getCollectionId", "()Ljava/lang/Integer;", "setCollectionId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "itemId", "", "getItemId", "()Ljava/lang/Long;", "setItemId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", LogEventArguments.ARG_NUMBER, "", "getNumber", "()Ljava/lang/String;", "setNumber", "(Ljava/lang/String;)V", Args.uid, "getUid", "setUid", Args.speciesUid, "getSpeciesUid", "setSpeciesUid", Args.varietyUid, "getVarietyUid", "setVarietyUid", "seriesIndexListUid", "getSeriesIndexListUid", "setSeriesIndexListUid", "names", "", "getNames", "()Ljava/util/List;", "setNames", "(Ljava/util/List;)V", "locality", "getLocality", "setLocality", "formula", "getFormula", "setFormula", "typeDescription", "getTypeDescription", "setTypeDescription", "acquisitionDate", "Ljava/util/Date;", "getAcquisitionDate", "()Ljava/util/Date;", "setAcquisitionDate", "(Ljava/util/Date;)V", "acquisitionPrice", "", "getAcquisitionPrice", "()Ljava/lang/Double;", "setAcquisitionPrice", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "priceUnit", "getPriceUnit", "setPriceUnit", LogEventArguments.ARG_LENGTH, "getLength", "setLength", "width", "getWidth", "setWidth", "height", "getHeight", "setHeight", "sizeUnit", "getSizeUnit", "setSizeUnit", "imageUrl", "getImageUrl", "setImageUrl", Args.denominationSideUrl, "getDenominationSideUrl", "setDenominationSideUrl", Args.subjectSideUrl, "getSubjectSideUrl", "setSubjectSideUrl", Args.year, "getYear", "setYear", "mintMark", "getMintMark", "setMintMark", "originalImageUrl", "getOriginalImageUrl", "setOriginalImageUrl", "note", "getNote", "setNote", "createdAt", "getCreatedAt", "setCreatedAt", "issuerCountryCode", "getIssuerCountryCode", "setIssuerCountryCode", "issuer", "getIssuer", "setIssuer", Args.customSeriesId, "getCustomSeriesId", "setCustomSeriesId", "marketValue", "Lcom/picturecoin/generatedAPI/kotlinAPI/model/PriceValue;", "getMarketValue", "()Lcom/picturecoin/generatedAPI/kotlinAPI/model/PriceValue;", "setMarketValue", "(Lcom/picturecoin/generatedAPI/kotlinAPI/model/PriceValue;)V", "mintage", "getMintage", "setMintage", "denomination", "getDenomination", "setDenomination", "compositionTypes", "getCompositionTypes", "setCompositionTypes", "compositionOptions", "getCompositionOptions", "setCompositionOptions", "mintMarkV2", "getMintMarkV2", "setMintMarkV2", "subThemes", "Lcom/picturecoin/generatedAPI/kotlinAPI/model/CoinTag;", "getSubThemes", "setSubThemes", "seriesList", "getSeriesList", "setSeriesList", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class Collection extends APIModelBase<Collection> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Date acquisitionDate;
    private Double acquisitionPrice;
    private Integer collectionId;
    private List<String> compositionOptions;
    private List<String> compositionTypes;
    private Date createdAt;
    private Integer customSeriesId;
    private String denomination;
    private String denominationSideUrl;
    private String formula;
    private Double height;
    public List<String> imageUrl;
    private String issuer;
    private String issuerCountryCode;
    private Long itemId;
    private Double length;
    private String locality;
    private PriceValue marketValue;
    private String mintMark;
    private String mintMarkV2;
    private String mintage;
    public List<String> names;
    private String note;
    private String number;
    private String originalImageUrl;
    private String priceUnit;
    private String seriesIndexListUid;
    private List<CoinTag> seriesList;
    private String sizeUnit;
    private String speciesUid;
    private List<CoinTag> subThemes;
    private String subjectSideUrl;
    private String typeDescription;
    public String uid;
    private int unused;
    private String varietyUid;
    private Double width;
    private String year;

    public Collection() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final Collection copy(int unused) {
        return new Collection(unused);
    }

    public String toString() {
        return "Collection(unused=" + this.unused + ")";
    }

    public Collection(int i) {
        this.unused = i;
    }

    public /* synthetic */ Collection(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ Collection copy$default(Collection collection, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = collection.unused;
        }
        return collection.copy(i);
    }

    public final Integer getCollectionId() {
        return this.collectionId;
    }

    public final void setCollectionId(Integer num) {
        this.collectionId = num;
    }

    public final Long getItemId() {
        return this.itemId;
    }

    public final void setItemId(Long l) {
        this.itemId = l;
    }

    public final String getNumber() {
        return this.number;
    }

    public final void setNumber(String str) {
        this.number = str;
    }

    public final String getUid() {
        String str = this.uid;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Args.uid);
        return null;
    }

    public final void setUid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uid = str;
    }

    public final String getSpeciesUid() {
        return this.speciesUid;
    }

    public final void setSpeciesUid(String str) {
        this.speciesUid = str;
    }

    public final String getVarietyUid() {
        return this.varietyUid;
    }

    public final void setVarietyUid(String str) {
        this.varietyUid = str;
    }

    public final String getSeriesIndexListUid() {
        return this.seriesIndexListUid;
    }

    public final void setSeriesIndexListUid(String str) {
        this.seriesIndexListUid = str;
    }

    public final List<String> getNames() {
        List<String> list = this.names;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("names");
        return null;
    }

    public final void setNames(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.names = list;
    }

    public final String getLocality() {
        return this.locality;
    }

    public final void setLocality(String str) {
        this.locality = str;
    }

    public final String getFormula() {
        return this.formula;
    }

    public final void setFormula(String str) {
        this.formula = str;
    }

    public final String getTypeDescription() {
        return this.typeDescription;
    }

    public final void setTypeDescription(String str) {
        this.typeDescription = str;
    }

    public final Date getAcquisitionDate() {
        return this.acquisitionDate;
    }

    public final void setAcquisitionDate(Date date) {
        this.acquisitionDate = date;
    }

    public final Double getAcquisitionPrice() {
        return this.acquisitionPrice;
    }

    public final void setAcquisitionPrice(Double d) {
        this.acquisitionPrice = d;
    }

    public final String getPriceUnit() {
        return this.priceUnit;
    }

    public final void setPriceUnit(String str) {
        this.priceUnit = str;
    }

    public final Double getLength() {
        return this.length;
    }

    public final void setLength(Double d) {
        this.length = d;
    }

    public final Double getWidth() {
        return this.width;
    }

    public final void setWidth(Double d) {
        this.width = d;
    }

    public final Double getHeight() {
        return this.height;
    }

    public final void setHeight(Double d) {
        this.height = d;
    }

    public final String getSizeUnit() {
        return this.sizeUnit;
    }

    public final void setSizeUnit(String str) {
        this.sizeUnit = str;
    }

    public final List<String> getImageUrl() {
        List<String> list = this.imageUrl;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageUrl");
        return null;
    }

    public final void setImageUrl(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.imageUrl = list;
    }

    public final String getDenominationSideUrl() {
        return this.denominationSideUrl;
    }

    public final void setDenominationSideUrl(String str) {
        this.denominationSideUrl = str;
    }

    public final String getSubjectSideUrl() {
        return this.subjectSideUrl;
    }

    public final void setSubjectSideUrl(String str) {
        this.subjectSideUrl = str;
    }

    public final String getYear() {
        return this.year;
    }

    public final void setYear(String str) {
        this.year = str;
    }

    public final String getMintMark() {
        return this.mintMark;
    }

    public final void setMintMark(String str) {
        this.mintMark = str;
    }

    public final String getOriginalImageUrl() {
        return this.originalImageUrl;
    }

    public final void setOriginalImageUrl(String str) {
        this.originalImageUrl = str;
    }

    public final String getNote() {
        return this.note;
    }

    public final void setNote(String str) {
        this.note = str;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final void setCreatedAt(Date date) {
        this.createdAt = date;
    }

    public final String getIssuerCountryCode() {
        return this.issuerCountryCode;
    }

    public final void setIssuerCountryCode(String str) {
        this.issuerCountryCode = str;
    }

    public final String getIssuer() {
        return this.issuer;
    }

    public final void setIssuer(String str) {
        this.issuer = str;
    }

    public final Integer getCustomSeriesId() {
        return this.customSeriesId;
    }

    public final void setCustomSeriesId(Integer num) {
        this.customSeriesId = num;
    }

    public final PriceValue getMarketValue() {
        return this.marketValue;
    }

    public final void setMarketValue(PriceValue priceValue) {
        this.marketValue = priceValue;
    }

    public final String getMintage() {
        return this.mintage;
    }

    public final void setMintage(String str) {
        this.mintage = str;
    }

    public final String getDenomination() {
        return this.denomination;
    }

    public final void setDenomination(String str) {
        this.denomination = str;
    }

    public final List<String> getCompositionTypes() {
        return this.compositionTypes;
    }

    public final void setCompositionTypes(List<String> list) {
        this.compositionTypes = list;
    }

    public final List<String> getCompositionOptions() {
        return this.compositionOptions;
    }

    public final void setCompositionOptions(List<String> list) {
        this.compositionOptions = list;
    }

    public final String getMintMarkV2() {
        return this.mintMarkV2;
    }

    public final void setMintMarkV2(String str) {
        this.mintMarkV2 = str;
    }

    public final List<CoinTag> getSubThemes() {
        return this.subThemes;
    }

    public final void setSubThemes(List<CoinTag> list) {
        this.subThemes = list;
    }

    public final List<CoinTag> getSeriesList() {
        return this.seriesList;
    }

    public final void setSeriesList(List<CoinTag> list) {
        this.seriesList = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Collection(org.json.JSONObject r10) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.picturecoin.generatedAPI.kotlinAPI.collection.Collection.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        Integer num = this.collectionId;
        if (num != null) {
            Intrinsics.checkNotNull(num);
            hashMap.put("collection_id", num);
        } else if (keepNull) {
            hashMap.put("collection_id", null);
        }
        Long l = this.itemId;
        if (l != null) {
            Intrinsics.checkNotNull(l);
            hashMap.put(FirebaseAnalytics.Param.ITEM_ID, l);
        } else if (keepNull) {
            hashMap.put(FirebaseAnalytics.Param.ITEM_ID, null);
        }
        String str = this.number;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put(LogEventArguments.ARG_NUMBER, str);
        } else if (keepNull) {
            hashMap.put(LogEventArguments.ARG_NUMBER, null);
        }
        hashMap.put(Args.uid, getUid());
        String str2 = this.speciesUid;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            hashMap.put("species_uid", str2);
        } else if (keepNull) {
            hashMap.put("species_uid", null);
        }
        String str3 = this.varietyUid;
        if (str3 != null) {
            Intrinsics.checkNotNull(str3);
            hashMap.put("variety_uid", str3);
        } else if (keepNull) {
            hashMap.put("variety_uid", null);
        }
        String str4 = this.seriesIndexListUid;
        if (str4 != null) {
            Intrinsics.checkNotNull(str4);
            hashMap.put("series_index_list_uid", str4);
        } else if (keepNull) {
            hashMap.put("series_index_list_uid", null);
        }
        hashMap.put("names", getNames());
        String str5 = this.locality;
        if (str5 != null) {
            Intrinsics.checkNotNull(str5);
            hashMap.put("locality", str5);
        } else if (keepNull) {
            hashMap.put("locality", null);
        }
        String str6 = this.formula;
        if (str6 != null) {
            Intrinsics.checkNotNull(str6);
            hashMap.put("formula", str6);
        } else if (keepNull) {
            hashMap.put("formula", null);
        }
        String str7 = this.typeDescription;
        if (str7 != null) {
            Intrinsics.checkNotNull(str7);
            hashMap.put("type_description", str7);
        } else if (keepNull) {
            hashMap.put("type_description", null);
        }
        Date date = this.acquisitionDate;
        if (date != null) {
            Intrinsics.checkNotNull(date);
            hashMap.put("acquisition_date", Long.valueOf(date.getTime() / 1000));
        } else if (keepNull) {
            hashMap.put("acquisition_date", null);
        }
        Double d = this.acquisitionPrice;
        if (d != null) {
            Intrinsics.checkNotNull(d);
            hashMap.put("acquisition_price", d);
        } else if (keepNull) {
            hashMap.put("acquisition_price", null);
        }
        String str8 = this.priceUnit;
        if (str8 != null) {
            Intrinsics.checkNotNull(str8);
            hashMap.put("price_unit", str8);
        } else if (keepNull) {
            hashMap.put("price_unit", null);
        }
        Double d2 = this.length;
        if (d2 != null) {
            Intrinsics.checkNotNull(d2);
            hashMap.put(LogEventArguments.ARG_LENGTH, d2);
        } else if (keepNull) {
            hashMap.put(LogEventArguments.ARG_LENGTH, null);
        }
        Double d3 = this.width;
        if (d3 != null) {
            Intrinsics.checkNotNull(d3);
            hashMap.put("width", d3);
        } else if (keepNull) {
            hashMap.put("width", null);
        }
        Double d4 = this.height;
        if (d4 != null) {
            Intrinsics.checkNotNull(d4);
            hashMap.put("height", d4);
        } else if (keepNull) {
            hashMap.put("height", null);
        }
        String str9 = this.sizeUnit;
        if (str9 != null) {
            Intrinsics.checkNotNull(str9);
            hashMap.put("size_unit", str9);
        } else if (keepNull) {
            hashMap.put("size_unit", null);
        }
        hashMap.put("image_url", getImageUrl());
        String str10 = this.denominationSideUrl;
        if (str10 != null) {
            Intrinsics.checkNotNull(str10);
            hashMap.put("denomination_side_url", str10);
        } else if (keepNull) {
            hashMap.put("denomination_side_url", null);
        }
        String str11 = this.subjectSideUrl;
        if (str11 != null) {
            Intrinsics.checkNotNull(str11);
            hashMap.put("subject_side_url", str11);
        } else if (keepNull) {
            hashMap.put("subject_side_url", null);
        }
        String str12 = this.year;
        if (str12 != null) {
            Intrinsics.checkNotNull(str12);
            hashMap.put(Args.year, str12);
        } else if (keepNull) {
            hashMap.put(Args.year, null);
        }
        String str13 = this.mintMark;
        if (str13 != null) {
            Intrinsics.checkNotNull(str13);
            hashMap.put("mint_mark", str13);
        } else if (keepNull) {
            hashMap.put("mint_mark", null);
        }
        String str14 = this.originalImageUrl;
        if (str14 != null) {
            Intrinsics.checkNotNull(str14);
            hashMap.put("original_image_url", str14);
        } else if (keepNull) {
            hashMap.put("original_image_url", null);
        }
        String str15 = this.note;
        if (str15 != null) {
            Intrinsics.checkNotNull(str15);
            hashMap.put("note", str15);
        } else if (keepNull) {
            hashMap.put("note", null);
        }
        Date date2 = this.createdAt;
        if (date2 != null) {
            Intrinsics.checkNotNull(date2);
            hashMap.put("created_at", Long.valueOf(date2.getTime() / 1000));
        } else if (keepNull) {
            hashMap.put("created_at", null);
        }
        String str16 = this.issuerCountryCode;
        if (str16 != null) {
            Intrinsics.checkNotNull(str16);
            hashMap.put("issuer_country_code", str16);
        } else if (keepNull) {
            hashMap.put("issuer_country_code", null);
        }
        String str17 = this.issuer;
        if (str17 != null) {
            Intrinsics.checkNotNull(str17);
            hashMap.put("issuer", str17);
        } else if (keepNull) {
            hashMap.put("issuer", null);
        }
        Integer num2 = this.customSeriesId;
        if (num2 != null) {
            Intrinsics.checkNotNull(num2);
            hashMap.put("custom_series_id", num2);
        } else if (keepNull) {
            hashMap.put("custom_series_id", null);
        }
        PriceValue priceValue = this.marketValue;
        if (priceValue != null) {
            Intrinsics.checkNotNull(priceValue);
            hashMap.put("market_value", priceValue.getJsonMap());
        } else if (keepNull) {
            hashMap.put("market_value", null);
        }
        String str18 = this.mintage;
        if (str18 != null) {
            Intrinsics.checkNotNull(str18);
            hashMap.put("mintage", str18);
        } else if (keepNull) {
            hashMap.put("mintage", null);
        }
        String str19 = this.denomination;
        if (str19 != null) {
            Intrinsics.checkNotNull(str19);
            hashMap.put("denomination", str19);
        } else if (keepNull) {
            hashMap.put("denomination", null);
        }
        List<String> list = this.compositionTypes;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            hashMap.put("composition_types", list);
        } else if (keepNull) {
            hashMap.put("composition_types", null);
        }
        List<String> list2 = this.compositionOptions;
        if (list2 != null) {
            Intrinsics.checkNotNull(list2);
            hashMap.put("composition_options", list2);
        } else if (keepNull) {
            hashMap.put("composition_options", null);
        }
        String str20 = this.mintMarkV2;
        if (str20 != null) {
            Intrinsics.checkNotNull(str20);
            hashMap.put("mint_mark_v2", str20);
        } else if (keepNull) {
            hashMap.put("mint_mark_v2", null);
        }
        if (this.subThemes != null) {
            CoinTag.Companion companion = CoinTag.INSTANCE;
            List<CoinTag> list3 = this.subThemes;
            Intrinsics.checkNotNull(list3);
            hashMap.put("sub_themes", companion.getCoinTagJsonArrayMap(list3));
        } else if (keepNull) {
            hashMap.put("sub_themes", null);
        }
        if (this.seriesList != null) {
            CoinTag.Companion companion2 = CoinTag.INSTANCE;
            List<CoinTag> list4 = this.seriesList;
            Intrinsics.checkNotNull(list4);
            hashMap.put("series_list", companion2.getCoinTagJsonArrayMap(list4));
        } else if (keepNull) {
            hashMap.put("series_list", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof Collection)) {
            return false;
        }
        Collection collection = (Collection) other;
        return Intrinsics.areEqual(this.collectionId, collection.collectionId) && Intrinsics.areEqual(this.itemId, collection.itemId) && Intrinsics.areEqual(this.number, collection.number) && Intrinsics.areEqual(getUid(), collection.getUid()) && Intrinsics.areEqual(this.speciesUid, collection.speciesUid) && Intrinsics.areEqual(this.varietyUid, collection.varietyUid) && Intrinsics.areEqual(this.seriesIndexListUid, collection.seriesIndexListUid) && Intrinsics.areEqual(getNames(), collection.getNames()) && Intrinsics.areEqual(this.locality, collection.locality) && Intrinsics.areEqual(this.formula, collection.formula) && Intrinsics.areEqual(this.typeDescription, collection.typeDescription) && Intrinsics.areEqual(this.acquisitionDate, collection.acquisitionDate) && Intrinsics.areEqual(this.acquisitionPrice, collection.acquisitionPrice) && Intrinsics.areEqual(this.priceUnit, collection.priceUnit) && Intrinsics.areEqual(this.length, collection.length) && Intrinsics.areEqual(this.width, collection.width) && Intrinsics.areEqual(this.height, collection.height) && Intrinsics.areEqual(this.sizeUnit, collection.sizeUnit) && Intrinsics.areEqual(getImageUrl(), collection.getImageUrl()) && Intrinsics.areEqual(this.denominationSideUrl, collection.denominationSideUrl) && Intrinsics.areEqual(this.subjectSideUrl, collection.subjectSideUrl) && Intrinsics.areEqual(this.year, collection.year) && Intrinsics.areEqual(this.mintMark, collection.mintMark) && Intrinsics.areEqual(this.originalImageUrl, collection.originalImageUrl) && Intrinsics.areEqual(this.note, collection.note) && Intrinsics.areEqual(this.createdAt, collection.createdAt) && Intrinsics.areEqual(this.issuerCountryCode, collection.issuerCountryCode) && Intrinsics.areEqual(this.issuer, collection.issuer) && Intrinsics.areEqual(this.customSeriesId, collection.customSeriesId) && Intrinsics.areEqual(this.marketValue, collection.marketValue) && Intrinsics.areEqual(this.mintage, collection.mintage) && Intrinsics.areEqual(this.denomination, collection.denomination) && Intrinsics.areEqual(this.compositionTypes, collection.compositionTypes) && Intrinsics.areEqual(this.compositionOptions, collection.compositionOptions) && Intrinsics.areEqual(this.mintMarkV2, collection.mintMarkV2) && Intrinsics.areEqual(this.subThemes, collection.subThemes) && Intrinsics.areEqual(this.seriesList, collection.seriesList);
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        Integer num = this.collectionId;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Long l = this.itemId;
        int hashCode3 = (hashCode2 + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.number;
        int hashCode4 = (((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + getUid().hashCode()) * 31;
        String str2 = this.speciesUid;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.varietyUid;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.seriesIndexListUid;
        int hashCode7 = (((hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31) + getNames().hashCode()) * 31;
        String str5 = this.locality;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.formula;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.typeDescription;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Date date = this.acquisitionDate;
        int hashCode11 = (hashCode10 + (date != null ? date.hashCode() : 0)) * 31;
        Double d = this.acquisitionPrice;
        int hashCode12 = (hashCode11 + (d != null ? d.hashCode() : 0)) * 31;
        String str8 = this.priceUnit;
        int hashCode13 = (hashCode12 + (str8 != null ? str8.hashCode() : 0)) * 31;
        Double d2 = this.length;
        int hashCode14 = (hashCode13 + (d2 != null ? d2.hashCode() : 0)) * 31;
        Double d3 = this.width;
        int hashCode15 = (hashCode14 + (d3 != null ? d3.hashCode() : 0)) * 31;
        Double d4 = this.height;
        int hashCode16 = (hashCode15 + (d4 != null ? d4.hashCode() : 0)) * 31;
        String str9 = this.sizeUnit;
        int hashCode17 = (((hashCode16 + (str9 != null ? str9.hashCode() : 0)) * 31) + getImageUrl().hashCode()) * 31;
        String str10 = this.denominationSideUrl;
        int hashCode18 = (hashCode17 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.subjectSideUrl;
        int hashCode19 = (hashCode18 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.year;
        int hashCode20 = (hashCode19 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.mintMark;
        int hashCode21 = (hashCode20 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.originalImageUrl;
        int hashCode22 = (hashCode21 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.note;
        int hashCode23 = (hashCode22 + (str15 != null ? str15.hashCode() : 0)) * 31;
        Date date2 = this.createdAt;
        int hashCode24 = (hashCode23 + (date2 != null ? date2.hashCode() : 0)) * 31;
        String str16 = this.issuerCountryCode;
        int hashCode25 = (hashCode24 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.issuer;
        int hashCode26 = (hashCode25 + (str17 != null ? str17.hashCode() : 0)) * 31;
        Integer num2 = this.customSeriesId;
        int hashCode27 = (hashCode26 + (num2 != null ? num2.hashCode() : 0)) * 31;
        PriceValue priceValue = this.marketValue;
        int hashCode28 = (hashCode27 + (priceValue != null ? priceValue.hashCode() : 0)) * 31;
        String str18 = this.mintage;
        int hashCode29 = (hashCode28 + (str18 != null ? str18.hashCode() : 0)) * 31;
        String str19 = this.denomination;
        int hashCode30 = (hashCode29 + (str19 != null ? str19.hashCode() : 0)) * 31;
        List<String> list = this.compositionTypes;
        int hashCode31 = (hashCode30 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.compositionOptions;
        int hashCode32 = (hashCode31 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str20 = this.mintMarkV2;
        int hashCode33 = (hashCode32 + (str20 != null ? str20.hashCode() : 0)) * 31;
        List<CoinTag> list3 = this.subThemes;
        int hashCode34 = (hashCode33 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<CoinTag> list4 = this.seriesList;
        return hashCode34 + (list4 != null ? list4.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        Collection collection = new Collection(0, 1, null);
        cloneTo(collection);
        return collection;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.collection.Collection");
        Collection collection = (Collection) o;
        super.cloneTo(collection);
        Integer num = this.collectionId;
        collection.collectionId = num != null ? cloneField(num) : null;
        Long l = this.itemId;
        collection.itemId = l != null ? cloneField(l) : null;
        String str = this.number;
        collection.number = str != null ? cloneField(str) : null;
        collection.setUid(cloneField(getUid()));
        String str2 = this.speciesUid;
        collection.speciesUid = str2 != null ? cloneField(str2) : null;
        String str3 = this.varietyUid;
        collection.varietyUid = str3 != null ? cloneField(str3) : null;
        String str4 = this.seriesIndexListUid;
        collection.seriesIndexListUid = str4 != null ? cloneField(str4) : null;
        collection.setNames(new ArrayList());
        List<String> names = getNames();
        Intrinsics.checkNotNull(names);
        for (String str5 : names) {
            List<String> names2 = collection.getNames();
            Intrinsics.checkNotNull(names2);
            String cloneField = cloneField(str5);
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(...)");
            names2.add(cloneField);
        }
        String str6 = this.locality;
        collection.locality = str6 != null ? cloneField(str6) : null;
        String str7 = this.formula;
        collection.formula = str7 != null ? cloneField(str7) : null;
        String str8 = this.typeDescription;
        collection.typeDescription = str8 != null ? cloneField(str8) : null;
        Date date = this.acquisitionDate;
        collection.acquisitionDate = date != null ? cloneField(date) : null;
        Double d = this.acquisitionPrice;
        collection.acquisitionPrice = d != null ? cloneField(d) : null;
        String str9 = this.priceUnit;
        collection.priceUnit = str9 != null ? cloneField(str9) : null;
        Double d2 = this.length;
        collection.length = d2 != null ? cloneField(d2) : null;
        Double d3 = this.width;
        collection.width = d3 != null ? cloneField(d3) : null;
        Double d4 = this.height;
        collection.height = d4 != null ? cloneField(d4) : null;
        String str10 = this.sizeUnit;
        collection.sizeUnit = str10 != null ? cloneField(str10) : null;
        collection.setImageUrl(new ArrayList());
        List<String> imageUrl = getImageUrl();
        Intrinsics.checkNotNull(imageUrl);
        for (String str11 : imageUrl) {
            List<String> imageUrl2 = collection.getImageUrl();
            Intrinsics.checkNotNull(imageUrl2);
            String cloneField2 = cloneField(str11);
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(...)");
            imageUrl2.add(cloneField2);
        }
        String str12 = this.denominationSideUrl;
        collection.denominationSideUrl = str12 != null ? cloneField(str12) : null;
        String str13 = this.subjectSideUrl;
        collection.subjectSideUrl = str13 != null ? cloneField(str13) : null;
        String str14 = this.year;
        collection.year = str14 != null ? cloneField(str14) : null;
        String str15 = this.mintMark;
        collection.mintMark = str15 != null ? cloneField(str15) : null;
        String str16 = this.originalImageUrl;
        collection.originalImageUrl = str16 != null ? cloneField(str16) : null;
        String str17 = this.note;
        collection.note = str17 != null ? cloneField(str17) : null;
        Date date2 = this.createdAt;
        collection.createdAt = date2 != null ? cloneField(date2) : null;
        String str18 = this.issuerCountryCode;
        collection.issuerCountryCode = str18 != null ? cloneField(str18) : null;
        String str19 = this.issuer;
        collection.issuer = str19 != null ? cloneField(str19) : null;
        Integer num2 = this.customSeriesId;
        collection.customSeriesId = num2 != null ? cloneField(num2) : null;
        APIModelBase aPIModelBase = this.marketValue;
        collection.marketValue = aPIModelBase != null ? (PriceValue) cloneField(aPIModelBase) : null;
        String str20 = this.mintage;
        collection.mintage = str20 != null ? cloneField(str20) : null;
        String str21 = this.denomination;
        collection.denomination = str21 != null ? cloneField(str21) : null;
        if (this.compositionTypes == null) {
            collection.compositionTypes = null;
        } else {
            collection.compositionTypes = new ArrayList();
            List<String> list = this.compositionTypes;
            Intrinsics.checkNotNull(list);
            for (String str22 : list) {
                List<String> list2 = collection.compositionTypes;
                Intrinsics.checkNotNull(list2);
                String cloneField3 = cloneField(str22);
                Intrinsics.checkNotNullExpressionValue(cloneField3, "cloneField(...)");
                list2.add(cloneField3);
            }
        }
        if (this.compositionOptions == null) {
            collection.compositionOptions = null;
        } else {
            collection.compositionOptions = new ArrayList();
            List<String> list3 = this.compositionOptions;
            Intrinsics.checkNotNull(list3);
            for (String str23 : list3) {
                List<String> list4 = collection.compositionOptions;
                Intrinsics.checkNotNull(list4);
                String cloneField4 = cloneField(str23);
                Intrinsics.checkNotNullExpressionValue(cloneField4, "cloneField(...)");
                list4.add(cloneField4);
            }
        }
        String str24 = this.mintMarkV2;
        collection.mintMarkV2 = str24 != null ? cloneField(str24) : null;
        if (this.subThemes == null) {
            collection.subThemes = null;
        } else {
            collection.subThemes = new ArrayList();
            List<CoinTag> list5 = this.subThemes;
            Intrinsics.checkNotNull(list5);
            for (APIModelBase aPIModelBase2 : list5) {
                List<CoinTag> list6 = collection.subThemes;
                Intrinsics.checkNotNull(list6);
                APIModelBase cloneField5 = cloneField(aPIModelBase2);
                Intrinsics.checkNotNullExpressionValue(cloneField5, "cloneField(...)");
                list6.add(cloneField5);
            }
        }
        if (this.seriesList == null) {
            collection.seriesList = null;
            return;
        }
        collection.seriesList = new ArrayList();
        List<CoinTag> list7 = this.seriesList;
        Intrinsics.checkNotNull(list7);
        for (APIModelBase aPIModelBase3 : list7) {
            List<CoinTag> list8 = collection.seriesList;
            Intrinsics.checkNotNull(list8);
            APIModelBase cloneField6 = cloneField(aPIModelBase3);
            Intrinsics.checkNotNullExpressionValue(cloneField6, "cloneField(...)");
            list8.add(cloneField6);
        }
    }

    /* compiled from: Collection.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/collection/Collection$Companion;", "", "<init>", "()V", "getCollectionJsonArrayMap", "", "", "", "array", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/Collection;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getCollectionJsonArrayMap(List<Collection> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Collection) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put("names", String.class);
            hashMap.put("imageUrl", String.class);
            hashMap.put("compositionTypes", String.class);
            hashMap.put("compositionOptions", String.class);
            hashMap.put("subThemes", CoinTag.class);
            hashMap.put("seriesList", CoinTag.class);
            return hashMap;
        }
    }
}
