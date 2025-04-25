package com.glority.android.picturexx.extensions;

import com.glority.android.cmsui2.entity.GradeItem;
import com.glority.android.cmsui2.util.GradingLevelScaleConvertor;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.picturexx.utils.PriceUtils;
import com.glority.android.xx.constants.Args;
import com.glority.base.viewmodel.AppViewModel;
import com.picturecoin.generatedAPI.kotlinAPI.model.PriceValue;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* compiled from: CollectionItemExt.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a/\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0007j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0006`\u0005*\u00020\u0002¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"getDisplayGrade", "", "Lcom/glority/android/database/entities/CollectionItem;", "getDisplayPrice", "toJsJson", "Lkotlin/collections/HashMap;", "", "Ljava/util/HashMap;", "(Lcom/glority/android/database/entities/CollectionItem;)Ljava/util/HashMap;", "businessMod_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class CollectionItemExtKt {
    public static final String getDisplayGrade(CollectionItem collectionItem) {
        String shortName;
        Intrinsics.checkNotNullParameter(collectionItem, "<this>");
        String grade = collectionItem.getGrade();
        if (grade != null) {
            GradeItem gradeConvertShortName = GradingLevelScaleConvertor.INSTANCE.gradeConvertShortName(grade, GradingLevelScaleConvertor.INSTANCE.getDefaultScaleType(AppViewModel.INSTANCE.getInstance().getCountryCode()));
            return (gradeConvertShortName == null || (shortName = gradeConvertShortName.getShortName(null)) == null) ? grade : shortName;
        }
        return collectionItem.getGrade();
    }

    public static final String getDisplayPrice(CollectionItem collectionItem) {
        Intrinsics.checkNotNullParameter(collectionItem, "<this>");
        PriceValue marketValue = collectionItem.getMarketValue();
        if (marketValue == null) {
            return null;
        }
        return marketValue.getCurrencyCode() + " " + PriceUtils.INSTANCE.formatPrice(new BigDecimal(String.valueOf(marketValue.getValue())).setScale(2, RoundingMode.HALF_UP).doubleValue());
    }

    public static final HashMap<String, Object> toJsJson(CollectionItem collectionItem) {
        Intrinsics.checkNotNullParameter(collectionItem, "<this>");
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("collectionId", String.valueOf(collectionItem.getCollectionId()));
        hashMap.put(Args.uid, collectionItem.getUid());
        Long itemId = collectionItem.getItemId();
        hashMap.put("itemId", itemId != null ? itemId.toString() : null);
        hashMap.put("name", collectionItem.getName());
        hashMap.put("userId", Long.valueOf(collectionItem.getUserId()));
        hashMap.put("imageUrl", new JSONArray((Collection) collectionItem.getImageUrl()));
        Date date = collectionItem.getDate();
        Long valueOf = date != null ? Long.valueOf(date.getTime()) : null;
        if (valueOf != null) {
            hashMap.put("acquisitionDate", Long.valueOf(valueOf.longValue() / 1000));
        } else {
            hashMap.put("acquisitionDate", null);
        }
        hashMap.put(LogEventArguments.ARG_NUMBER, collectionItem.getNumber());
        hashMap.put("acquisitionPrice", collectionItem.getAcquisitionPrice());
        hashMap.put("note", collectionItem.getNote());
        hashMap.put("grade", getDisplayGrade(collectionItem));
        hashMap.put("priceUnit", collectionItem.getPriceUnit());
        hashMap.put(Args.year, collectionItem.getYear());
        hashMap.put("mintMark", collectionItem.getMintMark());
        hashMap.put(Args.denominationSideUrl, collectionItem.getDenominationSideUrl());
        hashMap.put(Args.subjectSideUrl, collectionItem.getSubjectSideUrl());
        hashMap.put("seriesIndexListUid", collectionItem.getSeriesIndexListUid());
        hashMap.put(Args.speciesUid, collectionItem.getSpeciesUid());
        hashMap.put(Args.varietyUid, collectionItem.getVarietyUid());
        hashMap.put("issuerCountryCode", collectionItem.getIssuerCountryCode());
        hashMap.put("issuer", collectionItem.getIssuer());
        hashMap.put(Args.customSeriesId, collectionItem.getCustomSeriesId());
        hashMap.put("customSeries", collectionItem.getCustomSeriesName());
        return hashMap;
    }
}
