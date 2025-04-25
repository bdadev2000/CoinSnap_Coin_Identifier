package com.glority.android.cmsui;

import android.content.Context;
import com.glority.android.chatbot2.views.ChatbotFragment;
import com.glority.android.cms.base.BaseItem;
import com.glority.android.cms.base.CmsMultiEntity;
import com.glority.android.cmsui.adapter.InfoHeaderVpAdapter;
import com.glority.android.cmsui.common.CmsUILogEvents;
import com.glority.android.cmsui.common.DateTimeFormatter;
import com.glority.android.cmsui.entity.BookNameCardItem;
import com.glority.android.cmsui.entity.CardItem;
import com.glority.android.cmsui.entity.ConditionItem;
import com.glority.android.cmsui.entity.DetailHeaderItem;
import com.glority.android.cmsui.entity.DiagnoseItem;
import com.glority.android.cmsui.entity.DiseaseItem;
import com.glority.android.cmsui.entity.FaqItem;
import com.glority.android.cmsui.entity.FaqSubItem;
import com.glority.android.cmsui.entity.FeaturesItem;
import com.glority.android.cmsui.entity.FlowerImagesItem;
import com.glority.android.cmsui.entity.InfoHeaderItem;
import com.glority.android.cmsui.entity.LikeItem;
import com.glority.android.cmsui.entity.MainImageItem;
import com.glority.android.cmsui.entity.MultiLevelWaterFallItem;
import com.glority.android.cmsui.entity.NoMatchItem;
import com.glority.android.cmsui.entity.PlantCareItem;
import com.glority.android.cmsui.entity.ScientificItem;
import com.glority.android.cmsui.entity.SelfSuggestNameItem;
import com.glority.android.cmsui.entity.StreamSectionItem;
import com.glority.android.cmsui.entity.TitleItem;
import com.glority.android.cmsui.entity.WebViewItem;
import com.glority.android.cmsui.model.CmsDisease;
import com.glority.android.cmsui.model.CmsLayout;
import com.glority.android.cmsui.model.CmsObject;
import com.glority.android.cmsui.model.CmsTag;
import com.glority.android.cmsui.model.CmsTitle;
import com.glority.android.cmsui.model.LayoutType;
import com.glority.android.cmsui.model.LayoutTypeSet;
import com.glority.android.cmsui.util.CmsContentUtil;
import com.glority.android.cmsui.util.CmsTagValueUtil;
import com.glority.android.cmsui.util.NameCardUtil;
import com.glority.android.cmsui.widget.NameCardItemView;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.xx.constants.Args;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import com.glority.utils.app.ResUtils;
import io.noties.markwon.Markwon;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CmsFactory.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006J.\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\n\u001a\u00020\u0006J$\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\n\u001a\u00020\u0006JS\u0010\u0016\u001a\u00020\u00042\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u00062!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\"0\u001dJ \u0010#\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006JH\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010\u00062\b\u0010*\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010+\u001a\u00020\u000f2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010,\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006J)\u0010-\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010\u001e2\b\u0010/\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0002\u00100J\u0018\u00101\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006J@\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00062\b\b\u0002\u00106\u001a\u00020\u000f2\b\b\u0002\u00107\u001a\u00020\u000f2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u00108\u001a\u00020\u000fJ&\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\n\u001a\u00020\u0006J\\\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010;2\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010;2\b\u0010?\u001a\u0004\u0018\u00010@2\b\u0010 \u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010A\u001a\u00020\u000f¨\u0006B"}, d2 = {"Lcom/glority/android/cmsui/CmsFactory;", "", "()V", "createDetailHeader", "Lcom/glority/android/cms/base/CmsMultiEntity;", "imageUrl", "", "shootAt", "Ljava/util/Date;", Args.title, Args.pageName, "createDiagnoseItem", CmsUILogEvents.CMS_DISEASE, "Lcom/glority/android/cmsui/model/CmsDisease;", "newStyle", "", "markdown", "Lio/noties/markwon/Markwon;", "createFlowerImageItem", "cmsObject", "Lcom/glority/android/cmsui/model/CmsObject;", "feedbackEnable", "createInfoHeader", "headerDataList", "", "Lcom/glority/android/cmsui/BaseMultiEntity;", "showNoMatch", "rawImg", "onItemSelected", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "position", "", "createLikeItem", ChatbotFragment.MESSAGE_TAG_LIKE, "createNameCard", "memoNo", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "isInfoCard", "customName", "customNote", "editEnable", "createNoMatch", "createPlantCare", "waterFrequency", "fertilizeFrequency", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/glority/android/cms/base/CmsMultiEntity;", "createSelfSuggest", "createWebView", "context", "Landroid/content/Context;", "url", "feedBackEnable", "downloadEnable", "showSeparator", "parseLayout", "layouts", "", "Lcom/glority/android/cmsui/model/CmsLayout;", "cmsTags", "Lcom/glority/android/cmsui/model/CmsTag;", "scientificItem", "Lcom/glority/android/cmsui/entity/ScientificItem;", "forceExpend", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class CmsFactory {
    public static final CmsFactory INSTANCE = new CmsFactory();

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[LayoutType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[LayoutType.NAME_TAGS.ordinal()] = 1;
            int[] iArr2 = new int[LayoutType.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[LayoutType.SUB_PAGE.ordinal()] = 1;
            iArr2[LayoutType.NAME_TAGS.ordinal()] = 2;
            int[] iArr3 = new int[LayoutType.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[LayoutType.CUSTOM.ordinal()] = 1;
            int[] iArr4 = new int[LayoutType.values().length];
            $EnumSwitchMapping$3 = iArr4;
            iArr4[LayoutType.NAME_TAGS.ordinal()] = 1;
            iArr4[LayoutType.SUB_PAGE.ordinal()] = 2;
            int[] iArr5 = new int[LayoutType.values().length];
            $EnumSwitchMapping$4 = iArr5;
            iArr5[LayoutType.NAME_TAGS.ordinal()] = 1;
            int[] iArr6 = new int[LayoutTypeSet.values().length];
            $EnumSwitchMapping$5 = iArr6;
            iArr6[LayoutTypeSet.FAQ.ordinal()] = 1;
            iArr6[LayoutTypeSet.KV_GRID.ordinal()] = 2;
            iArr6[LayoutTypeSet.TAXON_GRID.ordinal()] = 3;
            iArr6[LayoutTypeSet.WATERFALL.ordinal()] = 4;
            iArr6[LayoutTypeSet.WATERFALL_GRID.ordinal()] = 5;
            iArr6[LayoutTypeSet.NAME_CARD.ordinal()] = 6;
            iArr6[LayoutTypeSet.MAIN_IMAGE.ordinal()] = 7;
            iArr6[LayoutTypeSet.MULTI_LEVEL_WATERFALL.ordinal()] = 8;
            iArr6[LayoutTypeSet.TITLE.ordinal()] = 9;
            iArr6[LayoutTypeSet.ILLUSTRATION.ordinal()] = 10;
        }
    }

    private CmsFactory() {
    }

    public final List<CmsMultiEntity> parseLayout(CmsObject cmsObject, Markwon markdown, String pageName) {
        Intrinsics.checkNotNullParameter(cmsObject, "cmsObject");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        return parseLayout$default(this, cmsObject.getLayouts(), cmsObject.getTags(), ScientificItem.INSTANCE.create(cmsObject, markdown, pageName), NameCardUtil.INSTANCE.getName(cmsObject), markdown, pageName, false, 64, null);
    }

    public static /* synthetic */ List parseLayout$default(CmsFactory cmsFactory, List list, List list2, ScientificItem scientificItem, String str, Markwon markwon, String str2, boolean z, int i, Object obj) {
        return cmsFactory.parseLayout(list, list2, scientificItem, str, markwon, str2, (i & 64) != 0 ? false : z);
    }

    public final List<CmsMultiEntity> parseLayout(List<CmsLayout> layouts, List<CmsTag> cmsTags, ScientificItem scientificItem, String name, Markwon markdown, String pageName, boolean forceExpend) {
        List<CmsTag> list;
        Object obj;
        List<FaqSubItem> childes;
        Object obj2;
        List<FaqSubItem> childes2;
        Object obj3;
        FaqItem create;
        FeaturesItem create2;
        String lightModeIconUrl;
        String displayName;
        CardItem create3;
        ConditionItem create4;
        Object obj4;
        Integer intOrNull;
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        ArrayList arrayList = new ArrayList();
        List<CmsLayout> list2 = layouts;
        if (list2 != null && !list2.isEmpty() && (list = cmsTags) != null && !list.isEmpty()) {
            Iterator<T> it = cmsTags.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                CmsTag cmsTag = (CmsTag) it.next();
                if (Intrinsics.areEqual(cmsTag.getTagName(), "Cultivation:DiffcultyRating") && (!cmsTag.getTagValues().isEmpty())) {
                    Iterator<T> it2 = cmsTag.getTagValues().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj4 = null;
                            break;
                        }
                        obj4 = it2.next();
                        if (CmsTagValueUtil.INSTANCE.isCmsTagString((Map) obj4)) {
                            break;
                        }
                    }
                    Map map = (Map) obj4;
                    if (map != null) {
                        Object obj5 = map.get("value");
                        String str = (String) (obj5 instanceof String ? obj5 : null);
                        if (str != null && (intOrNull = StringsKt.toIntOrNull(str)) != null) {
                            int intValue = intOrNull.intValue();
                            Map<String, Object> mutableMap = MapsKt.toMutableMap(cmsTag.getTagValues().get(0));
                            mutableMap.put("value", ResUtils.getString(CmsContentUtil.INSTANCE.getDifficultyRateContents().get(intValue).intValue(), name, name));
                            cmsTag.getTagValues().set(0, mutableMap);
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                }
            }
            boolean z = false;
            boolean z2 = false;
            for (CmsLayout cmsLayout : layouts) {
                switch (WhenMappings.$EnumSwitchMapping$5[cmsLayout.getTypeSet().ordinal()]) {
                    case 1:
                        if (WhenMappings.$EnumSwitchMapping$0[cmsLayout.getType().ordinal()] == 1 && (create = FaqItem.INSTANCE.create(cmsLayout, cmsTags, markdown, pageName)) != null) {
                            Boolean.valueOf(arrayList.add(new CmsMultiEntity(18, create.getTitle(), create)));
                            break;
                        }
                        break;
                    case 2:
                        int i = WhenMappings.$EnumSwitchMapping$1[cmsLayout.getType().ordinal()];
                        if ((i == 1 || i == 2) && (create2 = FeaturesItem.INSTANCE.create(cmsLayout, cmsTags, markdown, forceExpend, pageName)) != null) {
                            Boolean.valueOf(arrayList.add(new CmsMultiEntity(16, create2.getTitle(), create2)));
                            break;
                        }
                        break;
                    case 3:
                        if (WhenMappings.$EnumSwitchMapping$2[cmsLayout.getType().ordinal()] == 1 && scientificItem != null) {
                            CmsTitle cmsTitle = cmsLayout.getCmsTitle();
                            if (cmsTitle != null && (displayName = cmsTitle.getDisplayName()) != null) {
                                scientificItem.setTitle(displayName);
                                Unit unit2 = Unit.INSTANCE;
                            }
                            CmsTitle cmsTitle2 = cmsLayout.getCmsTitle();
                            if (cmsTitle2 != null && (lightModeIconUrl = cmsTitle2.getLightModeIconUrl()) != null) {
                                scientificItem.setIcon(lightModeIconUrl);
                                Unit unit3 = Unit.INSTANCE;
                            }
                            Boolean.valueOf(arrayList.add(new CmsMultiEntity(17, scientificItem.getTitle(), scientificItem)));
                            break;
                        }
                        break;
                    case 4:
                        int i2 = WhenMappings.$EnumSwitchMapping$3[cmsLayout.getType().ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2 && (create3 = CardItem.INSTANCE.create(cmsLayout, cmsTags, markdown, pageName)) != null) {
                                z = CardItem.INSTANCE.getHasCareArticle();
                                z2 = CardItem.INSTANCE.getHasWeedArticle();
                                arrayList.add(new CmsMultiEntity(14, create3.getTitle(), create3));
                                new LogEventRequest(pageName + CmsUILogEvents.CMS_CARE_CARD, null, 2, null).post();
                                break;
                            }
                        } else if (Intrinsics.areEqual(cmsLayout.getName(), "PestAndDiseaseControl")) {
                            DiseaseItem create5 = DiseaseItem.INSTANCE.create(cmsLayout, cmsTags, markdown, pageName);
                            if (create5 != null) {
                                Boolean.valueOf(arrayList.add(new CmsMultiEntity(10, create5.getDisplayTagName(), create5)));
                                break;
                            } else {
                                break;
                            }
                        } else {
                            StreamSectionItem create6 = StreamSectionItem.INSTANCE.create(cmsLayout, cmsTags, markdown, forceExpend, pageName);
                            if (create6 != null) {
                                Boolean.valueOf(arrayList.add(new CmsMultiEntity(13, create6.getDisplayName(), create6)));
                                break;
                            } else {
                                break;
                            }
                        }
                        break;
                    case 5:
                        if (WhenMappings.$EnumSwitchMapping$4[cmsLayout.getType().ordinal()] == 1 && (create4 = ConditionItem.INSTANCE.create(cmsLayout, cmsTags, markdown, pageName)) != null) {
                            Boolean.valueOf(arrayList.add(new CmsMultiEntity(15, create4.getTitle(), create4)));
                            break;
                        }
                        break;
                    case 6:
                        arrayList.add(new CmsMultiEntity(26, "", BookNameCardItem.INSTANCE.create(cmsLayout, cmsTags, pageName)));
                        break;
                    case 7:
                        arrayList.add(new CmsMultiEntity(25, "", MainImageItem.INSTANCE.create(cmsLayout, cmsTags, pageName)));
                        break;
                    case 8:
                        arrayList.add(new CmsMultiEntity(24, "", MultiLevelWaterFallItem.INSTANCE.create(cmsLayout, cmsTags, markdown, pageName)));
                        break;
                    case 9:
                        arrayList.add(new CmsMultiEntity(23, "", TitleItem.INSTANCE.create(cmsLayout, cmsTags, pageName)));
                        break;
                }
            }
            if (z) {
                ArrayList arrayList2 = arrayList;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj3 = it3.next();
                        if (((CmsMultiEntity) obj3).getItemType() == 10) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                CmsMultiEntity cmsMultiEntity = (CmsMultiEntity) obj3;
                if (cmsMultiEntity != null) {
                    BaseItem item = cmsMultiEntity.getItem();
                    if (!(item instanceof DiseaseItem)) {
                        item = null;
                    }
                    DiseaseItem diseaseItem = (DiseaseItem) item;
                    if (diseaseItem != null) {
                        diseaseItem.setHasCareDetail(true);
                    }
                    Unit unit4 = Unit.INSTANCE;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj6 : arrayList2) {
                    if (((CmsMultiEntity) obj6).getItemType() == 15) {
                        arrayList3.add(obj6);
                    }
                }
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    BaseItem item2 = ((CmsMultiEntity) it4.next()).getItem();
                    if (!(item2 instanceof ConditionItem)) {
                        item2 = null;
                    }
                    ConditionItem conditionItem = (ConditionItem) item2;
                    if (conditionItem != null) {
                        conditionItem.setHasCareDetail(true);
                    }
                }
            } else {
                Iterator it5 = arrayList.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        obj = it5.next();
                        if (((CmsMultiEntity) obj).getItemType() == 18) {
                        }
                    } else {
                        obj = null;
                    }
                }
                CmsMultiEntity cmsMultiEntity2 = (CmsMultiEntity) obj;
                if (cmsMultiEntity2 != null) {
                    BaseItem item3 = cmsMultiEntity2.getItem();
                    if (!(item3 instanceof FaqItem)) {
                        item3 = null;
                    }
                    FaqItem faqItem = (FaqItem) item3;
                    if (faqItem != null && (childes = faqItem.getChildes()) != null) {
                        for (FaqSubItem faqSubItem : childes) {
                            if (faqSubItem.getAction() == 2) {
                                faqSubItem.setAction(0);
                            }
                        }
                        Unit unit5 = Unit.INSTANCE;
                    }
                }
            }
            if (!z2) {
                Iterator it6 = arrayList.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        obj2 = it6.next();
                        if (((CmsMultiEntity) obj2).getItemType() == 18) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                CmsMultiEntity cmsMultiEntity3 = (CmsMultiEntity) obj2;
                if (cmsMultiEntity3 != null) {
                    BaseItem item4 = cmsMultiEntity3.getItem();
                    FaqItem faqItem2 = (FaqItem) (item4 instanceof FaqItem ? item4 : null);
                    if (faqItem2 != null && (childes2 = faqItem2.getChildes()) != null) {
                        for (FaqSubItem faqSubItem2 : childes2) {
                            if (faqSubItem2.getAction() == 1) {
                                faqSubItem2.setAction(0);
                            }
                        }
                        Unit unit6 = Unit.INSTANCE;
                    }
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ CmsMultiEntity createNameCard$default(CmsFactory cmsFactory, String str, CmsName cmsName, boolean z, String str2, String str3, boolean z2, String str4, int i, Object obj) {
        String str5;
        boolean z3 = (i & 32) != 0 ? true : z2;
        if ((i & 64) != 0) {
            str5 = null;
        } else {
            str5 = str4;
        }
        return cmsFactory.createNameCard(str, cmsName, z, str2, str3, z3, str5);
    }

    public final CmsMultiEntity createNameCard(String memoNo, CmsName cmsObject, boolean isInfoCard, String customName, String customNote, boolean editEnable, String pageName) {
        Intrinsics.checkNotNullParameter(memoNo, "memoNo");
        Intrinsics.checkNotNullParameter(cmsObject, "cmsObject");
        return new CmsMultiEntity(1, NameCardUtil.INSTANCE.getName(cmsObject), new NameCardItemView(memoNo, cmsObject, isInfoCard, customName, customNote, editEnable, pageName));
    }

    public static /* synthetic */ CmsMultiEntity createPlantCare$default(CmsFactory cmsFactory, Integer num, Integer num2, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        return cmsFactory.createPlantCare(num, num2, str);
    }

    public final CmsMultiEntity createPlantCare(Integer waterFrequency, Integer fertilizeFrequency, String pageName) {
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        return new CmsMultiEntity(11, null, new PlantCareItem(waterFrequency, fertilizeFrequency, pageName));
    }

    public static /* synthetic */ CmsMultiEntity createSelfSuggest$default(CmsFactory cmsFactory, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return cmsFactory.createSelfSuggest(str, str2);
    }

    public final CmsMultiEntity createSelfSuggest(String name, String pageName) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        return new CmsMultiEntity(12, name, new SelfSuggestNameItem(name, pageName));
    }

    public static /* synthetic */ CmsMultiEntity createFlowerImageItem$default(CmsFactory cmsFactory, CmsObject cmsObject, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str = "";
        }
        return cmsFactory.createFlowerImageItem(cmsObject, z, str);
    }

    public final CmsMultiEntity createFlowerImageItem(CmsObject cmsObject, boolean feedbackEnable, String pageName) {
        Intrinsics.checkNotNullParameter(cmsObject, "cmsObject");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        String name = NameCardUtil.INSTANCE.getName(cmsObject);
        if (cmsObject.getMatchedSimilarImages().isEmpty()) {
            return null;
        }
        return new CmsMultiEntity(2, name, new FlowerImagesItem(cmsObject.getMatchedSimilarImages(), name, Intrinsics.areEqual(name, cmsObject.getName().getLatinName()), feedbackEnable, pageName));
    }

    public final CmsMultiEntity createInfoHeader(List<BaseMultiEntity> headerDataList, boolean showNoMatch, String rawImg, String pageName, final Function1<? super Integer, Unit> onItemSelected) {
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        Intrinsics.checkNotNullParameter(onItemSelected, "onItemSelected");
        InfoHeaderVpAdapter infoHeaderVpAdapter = new InfoHeaderVpAdapter();
        if (showNoMatch && headerDataList != null) {
            headerDataList.add(new BaseMultiEntity(1, rawImg));
        }
        infoHeaderVpAdapter.setNewData(headerDataList);
        return new CmsMultiEntity(0, null, new InfoHeaderItem(rawImg, infoHeaderVpAdapter, pageName, new Function1<Integer, Unit>() { // from class: com.glority.android.cmsui.CmsFactory$createInfoHeader$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                Function1.this.invoke(Integer.valueOf(i));
            }
        }));
    }

    public static /* synthetic */ CmsMultiEntity createDetailHeader$default(CmsFactory cmsFactory, String str, Date date, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = "detail";
        }
        return cmsFactory.createDetailHeader(str, date, str2, str3);
    }

    public final CmsMultiEntity createDetailHeader(String imageUrl, Date shootAt, String title, String pageName) {
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        return new CmsMultiEntity(9, title, new DetailHeaderItem(imageUrl, DateTimeFormatter.getItemDetailTimeFormat(shootAt), false, null, pageName, 12, null));
    }

    public static /* synthetic */ CmsMultiEntity createNoMatch$default(CmsFactory cmsFactory, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return cmsFactory.createNoMatch(str);
    }

    public final CmsMultiEntity createNoMatch(String pageName) {
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        return new CmsMultiEntity(8, "", new NoMatchItem(pageName));
    }

    public static /* synthetic */ CmsMultiEntity createDiagnoseItem$default(CmsFactory cmsFactory, CmsDisease cmsDisease, boolean z, Markwon markwon, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            markwon = null;
        }
        if ((i & 8) != 0) {
            str = "";
        }
        return cmsFactory.createDiagnoseItem(cmsDisease, z, markwon, str);
    }

    public final CmsMultiEntity createDiagnoseItem(CmsDisease disease, boolean newStyle, Markwon markdown, String pageName) {
        Intrinsics.checkNotNullParameter(disease, "disease");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        if (DiagnoseItem.INSTANCE.isSick(disease)) {
            return new CmsMultiEntity(6, ResUtils.getString(R.string.text_diagnose), new DiagnoseItem(disease, newStyle, markdown, pageName));
        }
        return null;
    }

    public static /* synthetic */ CmsMultiEntity createWebView$default(CmsFactory cmsFactory, Context context, String str, boolean z, boolean z2, String str2, boolean z3, int i, Object obj) {
        String str3;
        boolean z4 = (i & 4) != 0 ? false : z;
        boolean z5 = (i & 8) != 0 ? false : z2;
        if ((i & 16) != 0) {
            str3 = null;
        } else {
            str3 = str2;
        }
        return cmsFactory.createWebView(context, str, z4, z5, str3, (i & 32) != 0 ? true : z3);
    }

    public final CmsMultiEntity createWebView(Context context, String url, boolean feedBackEnable, boolean downloadEnable, String pageName, boolean showSeparator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        return new CmsMultiEntity(21, "", new WebViewItem(context, url, feedBackEnable, downloadEnable, pageName, showSeparator));
    }

    public static /* synthetic */ CmsMultiEntity createLikeItem$default(CmsFactory cmsFactory, CmsObject cmsObject, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return cmsFactory.createLikeItem(cmsObject, str, str2);
    }

    public final CmsMultiEntity createLikeItem(CmsObject cmsObject, String like, String pageName) {
        Intrinsics.checkNotNullParameter(cmsObject, "cmsObject");
        Intrinsics.checkNotNullParameter(like, "like");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        return new CmsMultiEntity(22, "", new LikeItem(cmsObject, like, pageName));
    }
}
