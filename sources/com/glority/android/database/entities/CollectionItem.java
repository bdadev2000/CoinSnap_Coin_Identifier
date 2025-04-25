package com.glority.android.database.entities;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.xx.constants.Args;
import com.picturecoin.generatedAPI.kotlinAPI.collection.Collection;
import com.picturecoin.generatedAPI.kotlinAPI.model.CoinTag;
import com.picturecoin.generatedAPI.kotlinAPI.model.PriceValue;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CollectionItem.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u009a\u00012\u00020\u0001:\u0002\u009a\u0001B×\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010#\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010#\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010#\u0012\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010#¢\u0006\u0004\b)\u0010*J\u0006\u0010q\u001a\u00020rJ\b\u0010s\u001a\u0004\u0018\u00010\u0005J\u0006\u0010t\u001a\u00020\u0005J\t\u0010u\u001a\u00020\u0003HÆ\u0003J\t\u0010v\u001a\u00020\u0005HÆ\u0003J\u0010\u0010w\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u00100J\t\u0010x\u001a\u00020\u0005HÆ\u0003J\t\u0010y\u001a\u00020\u0007HÆ\u0003J\u000f\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bHÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010}\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010=J\u000b\u0010~\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010XJ\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010\u008e\u0001\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010#HÆ\u0003J\u0012\u0010\u008f\u0001\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010#HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010\u0091\u0001\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010#HÆ\u0003J\u0012\u0010\u0092\u0001\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010#HÆ\u0003J\u008c\u0003\u0010\u0093\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010#2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010#2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010#HÆ\u0001¢\u0006\u0003\u0010\u0094\u0001J\u0016\u0010\u0095\u0001\u001a\u00030\u0096\u00012\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010\u0099\u0001\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010.R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u0010.R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010>\u001a\u0004\b<\u0010=R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u0010.R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010.\"\u0004\bA\u0010BR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010.\"\u0004\bD\u0010BR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010.\"\u0004\bF\u0010BR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010.\"\u0004\bH\u0010BR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010.\"\u0004\bJ\u0010BR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010.\"\u0004\bL\u0010BR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010.\"\u0004\bN\u0010BR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010.\"\u0004\bP\u0010BR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010.\"\u0004\bR\u0010BR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010.\"\u0004\bT\u0010BR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010.\"\u0004\bV\u0010BR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010[\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001c\u0010 \u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010.\"\u0004\ba\u0010BR\u001c\u0010!\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010.\"\u0004\bc\u0010BR\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u00106\"\u0004\be\u00108R\"\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u00106\"\u0004\bg\u00108R\u001c\u0010%\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010.\"\u0004\bi\u0010BR\"\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u00106\"\u0004\bk\u00108R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u00106\"\u0004\bm\u00108R \u0010n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010.\"\u0004\bp\u0010B¨\u0006\u009b\u0001"}, d2 = {"Lcom/glority/android/database/entities/CollectionItem;", "", "collectionId", "", Args.uid, "", "itemId", "", "name", "userId", "imageUrl", "", "date", "Ljava/util/Date;", LogEventArguments.ARG_NUMBER, "acquisitionPrice", "", "note", "grade", "priceUnit", Args.year, "mintMark", Args.denominationSideUrl, Args.subjectSideUrl, "seriesIndexListUid", Args.speciesUid, Args.varietyUid, "issuerCountryCode", "issuer", Args.customSeriesId, "marketValue", "Lcom/picturecoin/generatedAPI/kotlinAPI/model/PriceValue;", "mintage", "denomination", "compositionTypes", "", "compositionOptions", "mintMarkV2", "subThemes", "Lcom/picturecoin/generatedAPI/kotlinAPI/model/CoinTag;", "seriesList", "<init>", "(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;JLjava/util/List;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/picturecoin/generatedAPI/kotlinAPI/model/PriceValue;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getCollectionId", "()I", "getUid", "()Ljava/lang/String;", "getItemId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "getUserId", "()J", "getImageUrl", "()Ljava/util/List;", "setImageUrl", "(Ljava/util/List;)V", "getDate", "()Ljava/util/Date;", "getNumber", "getAcquisitionPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getNote", "getGrade", "setGrade", "(Ljava/lang/String;)V", "getPriceUnit", "setPriceUnit", "getYear", "setYear", "getMintMark", "setMintMark", "getDenominationSideUrl", "setDenominationSideUrl", "getSubjectSideUrl", "setSubjectSideUrl", "getSeriesIndexListUid", "setSeriesIndexListUid", "getSpeciesUid", "setSpeciesUid", "getVarietyUid", "setVarietyUid", "getIssuerCountryCode", "setIssuerCountryCode", "getIssuer", "setIssuer", "getCustomSeriesId", "()Ljava/lang/Integer;", "setCustomSeriesId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMarketValue", "()Lcom/picturecoin/generatedAPI/kotlinAPI/model/PriceValue;", "setMarketValue", "(Lcom/picturecoin/generatedAPI/kotlinAPI/model/PriceValue;)V", "getMintage", "setMintage", "getDenomination", "setDenomination", "getCompositionTypes", "setCompositionTypes", "getCompositionOptions", "setCompositionOptions", "getMintMarkV2", "setMintMarkV2", "getSubThemes", "setSubThemes", "getSeriesList", "setSeriesList", "customSeriesName", "getCustomSeriesName", "setCustomSeriesName", "toCollection", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/Collection;", "getFormatDate", "getDisplayName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "copy", "(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;JLjava/util/List;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/picturecoin/generatedAPI/kotlinAPI/model/PriceValue;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/glority/android/database/entities/CollectionItem;", "equals", "", "other", "hashCode", "toString", "Companion", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes7.dex */
public final /* data */ class CollectionItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Double acquisitionPrice;
    private final int collectionId;
    private List<String> compositionOptions;
    private List<String> compositionTypes;
    private Integer customSeriesId;
    private String customSeriesName;
    private final Date date;
    private String denomination;
    private String denominationSideUrl;
    private String grade;
    private List<String> imageUrl;
    private String issuer;
    private String issuerCountryCode;
    private final Long itemId;
    private PriceValue marketValue;
    private String mintMark;
    private String mintMarkV2;
    private String mintage;
    private final String name;
    private final String note;
    private final String number;
    private String priceUnit;
    private String seriesIndexListUid;
    private List<CoinTag> seriesList;
    private String speciesUid;
    private List<CoinTag> subThemes;
    private String subjectSideUrl;
    private final String uid;
    private final long userId;
    private String varietyUid;
    private String year;

    /* renamed from: component1, reason: from getter */
    public final int getCollectionId() {
        return this.collectionId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    /* renamed from: component11, reason: from getter */
    public final String getGrade() {
        return this.grade;
    }

    /* renamed from: component12, reason: from getter */
    public final String getPriceUnit() {
        return this.priceUnit;
    }

    /* renamed from: component13, reason: from getter */
    public final String getYear() {
        return this.year;
    }

    /* renamed from: component14, reason: from getter */
    public final String getMintMark() {
        return this.mintMark;
    }

    /* renamed from: component15, reason: from getter */
    public final String getDenominationSideUrl() {
        return this.denominationSideUrl;
    }

    /* renamed from: component16, reason: from getter */
    public final String getSubjectSideUrl() {
        return this.subjectSideUrl;
    }

    /* renamed from: component17, reason: from getter */
    public final String getSeriesIndexListUid() {
        return this.seriesIndexListUid;
    }

    /* renamed from: component18, reason: from getter */
    public final String getSpeciesUid() {
        return this.speciesUid;
    }

    /* renamed from: component19, reason: from getter */
    public final String getVarietyUid() {
        return this.varietyUid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* renamed from: component20, reason: from getter */
    public final String getIssuerCountryCode() {
        return this.issuerCountryCode;
    }

    /* renamed from: component21, reason: from getter */
    public final String getIssuer() {
        return this.issuer;
    }

    /* renamed from: component22, reason: from getter */
    public final Integer getCustomSeriesId() {
        return this.customSeriesId;
    }

    /* renamed from: component23, reason: from getter */
    public final PriceValue getMarketValue() {
        return this.marketValue;
    }

    /* renamed from: component24, reason: from getter */
    public final String getMintage() {
        return this.mintage;
    }

    /* renamed from: component25, reason: from getter */
    public final String getDenomination() {
        return this.denomination;
    }

    public final List<String> component26() {
        return this.compositionTypes;
    }

    public final List<String> component27() {
        return this.compositionOptions;
    }

    /* renamed from: component28, reason: from getter */
    public final String getMintMarkV2() {
        return this.mintMarkV2;
    }

    public final List<CoinTag> component29() {
        return this.subThemes;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getItemId() {
        return this.itemId;
    }

    public final List<CoinTag> component30() {
        return this.seriesList;
    }

    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component5, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    public final List<String> component6() {
        return this.imageUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    /* renamed from: component8, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* renamed from: component9, reason: from getter */
    public final Double getAcquisitionPrice() {
        return this.acquisitionPrice;
    }

    public final CollectionItem copy(int collectionId, String uid, Long itemId, String name, long userId, List<String> imageUrl, Date date, String number, Double acquisitionPrice, String note, String grade, String priceUnit, String year, String mintMark, String denominationSideUrl, String subjectSideUrl, String seriesIndexListUid, String speciesUid, String varietyUid, String issuerCountryCode, String issuer, Integer customSeriesId, PriceValue marketValue, String mintage, String denomination, List<String> compositionTypes, List<String> compositionOptions, String mintMarkV2, List<CoinTag> subThemes, List<CoinTag> seriesList) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new CollectionItem(collectionId, uid, itemId, name, userId, imageUrl, date, number, acquisitionPrice, note, grade, priceUnit, year, mintMark, denominationSideUrl, subjectSideUrl, seriesIndexListUid, speciesUid, varietyUid, issuerCountryCode, issuer, customSeriesId, marketValue, mintage, denomination, compositionTypes, compositionOptions, mintMarkV2, subThemes, seriesList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollectionItem)) {
            return false;
        }
        CollectionItem collectionItem = (CollectionItem) other;
        return this.collectionId == collectionItem.collectionId && Intrinsics.areEqual(this.uid, collectionItem.uid) && Intrinsics.areEqual(this.itemId, collectionItem.itemId) && Intrinsics.areEqual(this.name, collectionItem.name) && this.userId == collectionItem.userId && Intrinsics.areEqual(this.imageUrl, collectionItem.imageUrl) && Intrinsics.areEqual(this.date, collectionItem.date) && Intrinsics.areEqual(this.number, collectionItem.number) && Intrinsics.areEqual((Object) this.acquisitionPrice, (Object) collectionItem.acquisitionPrice) && Intrinsics.areEqual(this.note, collectionItem.note) && Intrinsics.areEqual(this.grade, collectionItem.grade) && Intrinsics.areEqual(this.priceUnit, collectionItem.priceUnit) && Intrinsics.areEqual(this.year, collectionItem.year) && Intrinsics.areEqual(this.mintMark, collectionItem.mintMark) && Intrinsics.areEqual(this.denominationSideUrl, collectionItem.denominationSideUrl) && Intrinsics.areEqual(this.subjectSideUrl, collectionItem.subjectSideUrl) && Intrinsics.areEqual(this.seriesIndexListUid, collectionItem.seriesIndexListUid) && Intrinsics.areEqual(this.speciesUid, collectionItem.speciesUid) && Intrinsics.areEqual(this.varietyUid, collectionItem.varietyUid) && Intrinsics.areEqual(this.issuerCountryCode, collectionItem.issuerCountryCode) && Intrinsics.areEqual(this.issuer, collectionItem.issuer) && Intrinsics.areEqual(this.customSeriesId, collectionItem.customSeriesId) && Intrinsics.areEqual(this.marketValue, collectionItem.marketValue) && Intrinsics.areEqual(this.mintage, collectionItem.mintage) && Intrinsics.areEqual(this.denomination, collectionItem.denomination) && Intrinsics.areEqual(this.compositionTypes, collectionItem.compositionTypes) && Intrinsics.areEqual(this.compositionOptions, collectionItem.compositionOptions) && Intrinsics.areEqual(this.mintMarkV2, collectionItem.mintMarkV2) && Intrinsics.areEqual(this.subThemes, collectionItem.subThemes) && Intrinsics.areEqual(this.seriesList, collectionItem.seriesList);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.collectionId) * 31) + this.uid.hashCode()) * 31;
        Long l = this.itemId;
        int hashCode2 = (((((((hashCode + (l == null ? 0 : l.hashCode())) * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.userId)) * 31) + this.imageUrl.hashCode()) * 31;
        Date date = this.date;
        int hashCode3 = (hashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        String str = this.number;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.acquisitionPrice;
        int hashCode5 = (hashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.note;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.grade;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.priceUnit;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.year;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.mintMark;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.denominationSideUrl;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.subjectSideUrl;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.seriesIndexListUid;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.speciesUid;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.varietyUid;
        int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.issuerCountryCode;
        int hashCode16 = (hashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.issuer;
        int hashCode17 = (hashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num = this.customSeriesId;
        int hashCode18 = (hashCode17 + (num == null ? 0 : num.hashCode())) * 31;
        PriceValue priceValue = this.marketValue;
        int hashCode19 = (hashCode18 + (priceValue == null ? 0 : priceValue.hashCode())) * 31;
        String str14 = this.mintage;
        int hashCode20 = (hashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.denomination;
        int hashCode21 = (hashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        List<String> list = this.compositionTypes;
        int hashCode22 = (hashCode21 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.compositionOptions;
        int hashCode23 = (hashCode22 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str16 = this.mintMarkV2;
        int hashCode24 = (hashCode23 + (str16 == null ? 0 : str16.hashCode())) * 31;
        List<CoinTag> list3 = this.subThemes;
        int hashCode25 = (hashCode24 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<CoinTag> list4 = this.seriesList;
        return hashCode25 + (list4 != null ? list4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CollectionItem(collectionId=");
        sb.append(this.collectionId).append(", uid=").append(this.uid).append(", itemId=").append(this.itemId).append(", name=").append(this.name).append(", userId=").append(this.userId).append(", imageUrl=").append(this.imageUrl).append(", date=").append(this.date).append(", number=").append(this.number).append(", acquisitionPrice=").append(this.acquisitionPrice).append(", note=").append(this.note).append(", grade=").append(this.grade).append(", priceUnit=");
        sb.append(this.priceUnit).append(", year=").append(this.year).append(", mintMark=").append(this.mintMark).append(", denominationSideUrl=").append(this.denominationSideUrl).append(", subjectSideUrl=").append(this.subjectSideUrl).append(", seriesIndexListUid=").append(this.seriesIndexListUid).append(", speciesUid=").append(this.speciesUid).append(", varietyUid=").append(this.varietyUid).append(", issuerCountryCode=").append(this.issuerCountryCode).append(", issuer=").append(this.issuer).append(", customSeriesId=").append(this.customSeriesId).append(", marketValue=").append(this.marketValue);
        sb.append(", mintage=").append(this.mintage).append(", denomination=").append(this.denomination).append(", compositionTypes=").append(this.compositionTypes).append(", compositionOptions=").append(this.compositionOptions).append(", mintMarkV2=").append(this.mintMarkV2).append(", subThemes=").append(this.subThemes).append(", seriesList=").append(this.seriesList).append(')');
        return sb.toString();
    }

    public CollectionItem(int i, String uid, Long l, String name, long j, List<String> imageUrl, Date date, String str, Double d, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num, PriceValue priceValue, String str14, String str15, List<String> list, List<String> list2, String str16, List<CoinTag> list3, List<CoinTag> list4) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.collectionId = i;
        this.uid = uid;
        this.itemId = l;
        this.name = name;
        this.userId = j;
        this.imageUrl = imageUrl;
        this.date = date;
        this.number = str;
        this.acquisitionPrice = d;
        this.note = str2;
        this.grade = str3;
        this.priceUnit = str4;
        this.year = str5;
        this.mintMark = str6;
        this.denominationSideUrl = str7;
        this.subjectSideUrl = str8;
        this.seriesIndexListUid = str9;
        this.speciesUid = str10;
        this.varietyUid = str11;
        this.issuerCountryCode = str12;
        this.issuer = str13;
        this.customSeriesId = num;
        this.marketValue = priceValue;
        this.mintage = str14;
        this.denomination = str15;
        this.compositionTypes = list;
        this.compositionOptions = list2;
        this.mintMarkV2 = str16;
        this.subThemes = list3;
        this.seriesList = list4;
    }

    public /* synthetic */ CollectionItem(int i, String str, Long l, String str2, long j, List list, Date date, String str3, Double d, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Integer num, PriceValue priceValue, String str16, String str17, List list2, List list3, String str18, List list4, List list5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, l, str2, j, list, date, str3, d, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, num, (i2 & 4194304) != 0 ? null : priceValue, (i2 & 8388608) != 0 ? null : str16, (i2 & 16777216) != 0 ? null : str17, (i2 & 33554432) != 0 ? null : list2, (i2 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : list3, (i2 & 134217728) != 0 ? null : str18, (i2 & 268435456) != 0 ? null : list4, (i2 & 536870912) != 0 ? null : list5);
    }

    public final int getCollectionId() {
        return this.collectionId;
    }

    public final String getUid() {
        return this.uid;
    }

    public final Long getItemId() {
        return this.itemId;
    }

    public final String getName() {
        return this.name;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final List<String> getImageUrl() {
        return this.imageUrl;
    }

    public final void setImageUrl(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.imageUrl = list;
    }

    public final Date getDate() {
        return this.date;
    }

    public final String getNumber() {
        return this.number;
    }

    public final Double getAcquisitionPrice() {
        return this.acquisitionPrice;
    }

    public final String getNote() {
        return this.note;
    }

    public final String getGrade() {
        return this.grade;
    }

    public final void setGrade(String str) {
        this.grade = str;
    }

    public final String getPriceUnit() {
        return this.priceUnit;
    }

    public final void setPriceUnit(String str) {
        this.priceUnit = str;
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

    public final String getSeriesIndexListUid() {
        return this.seriesIndexListUid;
    }

    public final void setSeriesIndexListUid(String str) {
        this.seriesIndexListUid = str;
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

    public final String getCustomSeriesName() {
        return this.customSeriesName;
    }

    public final void setCustomSeriesName(String str) {
        this.customSeriesName = str;
    }

    public final Collection toCollection() {
        Collection collection = new Collection(0, 1, null);
        collection.setCollectionId(Integer.valueOf(this.collectionId));
        collection.setUid(this.uid);
        collection.setItemId(this.itemId);
        collection.setNames(CollectionsKt.mutableListOf(this.name));
        collection.setNote(this.note);
        collection.setImageUrl(CollectionsKt.toMutableList((java.util.Collection) this.imageUrl));
        collection.setAcquisitionDate(this.date);
        collection.setAcquisitionPrice(this.acquisitionPrice);
        collection.setNumber(this.number);
        collection.setFormula(this.grade);
        collection.setPriceUnit(this.priceUnit);
        collection.setYear(this.year);
        collection.setMintMark(this.mintMark);
        collection.setDenominationSideUrl(this.denominationSideUrl);
        collection.setSubjectSideUrl(this.subjectSideUrl);
        collection.setSeriesIndexListUid(this.seriesIndexListUid);
        collection.setSpeciesUid(this.speciesUid);
        collection.setVarietyUid(this.varietyUid);
        collection.setIssuerCountryCode(this.issuerCountryCode);
        collection.setCustomSeriesId(this.customSeriesId);
        collection.setIssuer(this.issuer);
        collection.setMarketValue(this.marketValue);
        collection.setMintage(this.mintage);
        collection.setDenomination(this.denomination);
        collection.setCompositionTypes(this.compositionTypes);
        collection.setCompositionOptions(this.compositionOptions);
        collection.setMintMarkV2(this.mintMarkV2);
        collection.setSubThemes(this.subThemes);
        collection.setSeriesList(this.seriesList);
        return collection;
    }

    public final String getFormatDate() {
        if (this.date == null) {
            return null;
        }
        return new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault()).format(this.date);
    }

    public final String getDisplayName() {
        try {
            String str = this.name;
            if (this.mintMark != null) {
                StringBuilder append = new StringBuilder().append(str).append('-');
                String str2 = this.mintMark;
                Intrinsics.checkNotNull(str2);
                str = append.append(str2).toString();
            } else if (this.year != null) {
                str = str + ' ' + this.year;
            }
            return StringsKt.replace(str, "No mintmark", "", true);
        } catch (Throwable unused) {
            return this.name;
        }
    }

    /* compiled from: CollectionItem.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/glority/android/database/entities/CollectionItem$Companion;", "", "<init>", "()V", "fromCollection", "Lcom/glority/android/database/entities/CollectionItem;", "userId", "", "collection", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/Collection;", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CollectionItem fromCollection(long userId, Collection collection) {
            Intrinsics.checkNotNullParameter(collection, "collection");
            Integer collectionId = collection.getCollectionId();
            int intValue = collectionId != null ? collectionId.intValue() : 0;
            String uid = collection.getUid();
            Long itemId = collection.getItemId();
            Long valueOf = Long.valueOf(itemId != null ? itemId.longValue() : 0L);
            String str = (String) CollectionsKt.firstOrNull((List) collection.getNames());
            if (str == null) {
                str = "";
            }
            return new CollectionItem(intValue, uid, valueOf, str, userId, collection.getImageUrl(), collection.getAcquisitionDate(), collection.getNumber(), collection.getAcquisitionPrice(), collection.getNote(), collection.getFormula(), collection.getPriceUnit(), collection.getYear(), collection.getMintMark(), collection.getDenominationSideUrl(), collection.getSubjectSideUrl(), collection.getSeriesIndexListUid(), collection.getSpeciesUid(), collection.getVarietyUid(), collection.getIssuerCountryCode(), collection.getIssuer(), collection.getCustomSeriesId(), collection.getMarketValue(), collection.getMintage(), collection.getDenomination(), collection.getCompositionTypes(), collection.getCompositionOptions(), collection.getMintMarkV2(), collection.getSubThemes(), collection.getSeriesList());
        }
    }
}
