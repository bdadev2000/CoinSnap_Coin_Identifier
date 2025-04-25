package com.glority.android.picturexx.extensions;

import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CmsNameExt.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0018\u001a\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0001\u001a\u001a\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u0001*\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018\"\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u0001*\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018\"\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u0001*\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018\"\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u0001*\u00020\u00128F¢\u0006\u0006\u001a\u0004\b \u0010\u0018\"\u0017\u0010!\u001a\u0004\u0018\u00010\u0001*\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0018\"\u0017\u0010#\u001a\u0004\u0018\u00010\u0001*\u00020\u00128F¢\u0006\u0006\u001a\u0004\b$\u0010\u0018\"\u0017\u0010%\u001a\u0004\u0018\u00010\u0001*\u00020\u00128F¢\u0006\u0006\u001a\u0004\b&\u0010\u0018\"\u0017\u0010'\u001a\u0004\u0018\u00010\u0001*\u00020\u00128F¢\u0006\u0006\u001a\u0004\b(\u0010\u0018\"\u0017\u0010)\u001a\u0004\u0018\u00010\u0001*\u00020\u00128F¢\u0006\u0006\u001a\u0004\b*\u0010\u0018\"\u0017\u0010+\u001a\u0004\u0018\u00010\u0001*\u00020\u00128F¢\u0006\u0006\u001a\u0004\b,\u0010\u0018¨\u0006-"}, d2 = {"APIImageSubjectSideKey", "", "APIImageDenominationSideKey", "APIFlagCodeKey", "APICountryCodeKey", "APIIssuerNameKey", "APIHunterMapKey", "APIYearWithMintmarkV2Key", "APIPreferredSeriesKey", "APISeriesTitleKey", "APIImageNonDenominationSideDesignKey", "APIImageDenominationSideDesignKey", "APINonDenominationSideDesignDescKey", "APIDenominationSideDesignDescKey", "APISeriesShortDescriptionKey", "APISeriesImageRecommendationPlaceholderKey", "APISeriesCompositionKey", "getTagValue", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "tagName", "getTagValues", "", "denominationSide", "getDenominationSide", "(Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;)Ljava/lang/String;", "subjectSide", "getSubjectSide", "preferredSeries", "getPreferredSeries", "seriesTitle", "getSeriesTitle", "imageNonDenominationSideDesign", "getImageNonDenominationSideDesign", "imageDenominationSideDesign", "getImageDenominationSideDesign", "nonDenominationSideDesignDesc", "getNonDenominationSideDesignDesc", "denominationSideDesignDesc", "getDenominationSideDesignDesc", "seriesShortDescription", "getSeriesShortDescription", "seriesImageRecommendationPlaceholder", "getSeriesImageRecommendationPlaceholder", "seriesComposition", "getSeriesComposition", "businessMod_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class CmsNameExtKt {
    private static final String APICountryCodeKey = "IssuerCountryCode3";
    private static final String APIDenominationSideDesignDescKey = "DenominationSideDesignDesc";
    private static final String APIFlagCodeKey = "IssuerCountryCode2";
    private static final String APIHunterMapKey = "Image:HunterMap";
    private static final String APIImageDenominationSideDesignKey = "Image:DenominationSideDesign";
    private static final String APIImageDenominationSideKey = "Image:DenominationSide";
    private static final String APIImageNonDenominationSideDesignKey = "Image:NonDenominationSideDesign";
    private static final String APIImageSubjectSideKey = "Image:SubjectSide";
    private static final String APIIssuerNameKey = "Issuer";
    private static final String APINonDenominationSideDesignDescKey = "NonDenominationSideDesignDesc";
    private static final String APIPreferredSeriesKey = "PreferredSeries";
    private static final String APISeriesCompositionKey = "Series:Composition";
    private static final String APISeriesImageRecommendationPlaceholderKey = "Series:ImageRecommendationPlaceholder";
    private static final String APISeriesShortDescriptionKey = "Series:ShortDescription";
    private static final String APISeriesTitleKey = "Series:Title";
    private static final String APIYearWithMintmarkV2Key = "YearWithMintmarkV2";

    public static final String getTagValue(CmsName cmsName, String tagName) {
        Intrinsics.checkNotNullParameter(cmsName, "<this>");
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        List<CmsTag> tags = cmsName.getTags();
        if (tags == null) {
            return null;
        }
        for (CmsTag cmsTag : tags) {
            if (Intrinsics.areEqual(cmsTag.getTagName(), tagName)) {
                Iterator<Map<String, Object>> it = cmsTag.getTagValues().iterator();
                if (it.hasNext()) {
                    Object obj = it.next().get("value");
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    return null;
                }
            }
        }
        return null;
    }

    public static final List<String> getTagValues(CmsName cmsName, String tagName) {
        Intrinsics.checkNotNullParameter(cmsName, "<this>");
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        List<CmsTag> tags = cmsName.getTags();
        if (tags == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (CmsTag cmsTag : tags) {
            if (Intrinsics.areEqual(cmsTag.getTagName(), tagName)) {
                Iterator<Map<String, Object>> it = cmsTag.getTagValues().iterator();
                while (it.hasNext()) {
                    Object obj = it.next().get("value");
                    String str = obj instanceof String ? (String) obj : null;
                    if (str == null) {
                        str = "";
                    }
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    public static final String getDenominationSide(CmsName cmsName) {
        Intrinsics.checkNotNullParameter(cmsName, "<this>");
        return getTagValue(cmsName, APIImageDenominationSideKey);
    }

    public static final String getSubjectSide(CmsName cmsName) {
        Intrinsics.checkNotNullParameter(cmsName, "<this>");
        return getTagValue(cmsName, APIImageSubjectSideKey);
    }

    public static final String getPreferredSeries(CmsName cmsName) {
        Intrinsics.checkNotNullParameter(cmsName, "<this>");
        return getTagValue(cmsName, APIPreferredSeriesKey);
    }

    public static final String getSeriesTitle(CmsName cmsName) {
        Intrinsics.checkNotNullParameter(cmsName, "<this>");
        return getTagValue(cmsName, APISeriesTitleKey);
    }

    public static final String getImageNonDenominationSideDesign(CmsName cmsName) {
        Intrinsics.checkNotNullParameter(cmsName, "<this>");
        return getTagValue(cmsName, APIImageNonDenominationSideDesignKey);
    }

    public static final String getImageDenominationSideDesign(CmsName cmsName) {
        Intrinsics.checkNotNullParameter(cmsName, "<this>");
        return getTagValue(cmsName, APIImageDenominationSideDesignKey);
    }

    public static final String getNonDenominationSideDesignDesc(CmsName cmsName) {
        Intrinsics.checkNotNullParameter(cmsName, "<this>");
        return getTagValue(cmsName, APINonDenominationSideDesignDescKey);
    }

    public static final String getDenominationSideDesignDesc(CmsName cmsName) {
        Intrinsics.checkNotNullParameter(cmsName, "<this>");
        return getTagValue(cmsName, APIDenominationSideDesignDescKey);
    }

    public static final String getSeriesShortDescription(CmsName cmsName) {
        Intrinsics.checkNotNullParameter(cmsName, "<this>");
        return getTagValue(cmsName, APISeriesShortDescriptionKey);
    }

    public static final String getSeriesImageRecommendationPlaceholder(CmsName cmsName) {
        Intrinsics.checkNotNullParameter(cmsName, "<this>");
        return getTagValue(cmsName, APISeriesImageRecommendationPlaceholderKey);
    }

    public static final String getSeriesComposition(CmsName cmsName) {
        Intrinsics.checkNotNullParameter(cmsName, "<this>");
        return getTagValue(cmsName, APISeriesCompositionKey);
    }
}
