package com.glority.android.picturexx.business;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.databinding.ActivityBanknoteCongratsBindingImpl;
import com.glority.android.picturexx.business.databinding.ActivityChatbotBindingImpl;
import com.glority.android.picturexx.business.databinding.ActivityCollectionDistributionBindingImpl;
import com.glority.android.picturexx.business.databinding.ActivityCustomIdentificationResultBindingImpl;
import com.glority.android.picturexx.business.databinding.ActivityGradingGuideBindingImpl;
import com.glority.android.picturexx.business.databinding.ActivityMainBindingImpl;
import com.glority.android.picturexx.business.databinding.ActivityPurchase10002aBindingImpl;
import com.glority.android.picturexx.business.databinding.ActivityPurchase10002bBindingImpl;
import com.glority.android.picturexx.business.databinding.ActivityPurchase10003aBindingImpl;
import com.glority.android.picturexx.business.databinding.ActivityPurchase10003bBindingImpl;
import com.glority.android.picturexx.business.databinding.ActivityPurchase10004aBindingImpl;
import com.glority.android.picturexx.business.databinding.ActivityPurchase10004bBindingImpl;
import com.glority.android.picturexx.business.databinding.ActivityPurchase1BindingImpl;
import com.glority.android.picturexx.business.databinding.ActivitySuggestAddBindingImpl;
import com.glority.android.picturexx.business.databinding.CmsDetailBottomBar1BindingImpl;
import com.glority.android.picturexx.business.databinding.CmsDetailBottomBar2BindingImpl;
import com.glority.android.picturexx.business.databinding.CmsDetailBottomBar3BindingImpl;
import com.glority.android.picturexx.business.databinding.CoinWidgetCommonMenuBarBindingImpl;
import com.glority.android.picturexx.business.databinding.CustomFragmentFaqAndHelpBindingImpl;
import com.glority.android.picturexx.business.databinding.CustomFragmentSettingBindingImpl;
import com.glority.android.picturexx.business.databinding.DialogAddWishSuccessBindingImpl;
import com.glority.android.picturexx.business.databinding.DialogBusinessJsWebviewBindingImpl;
import com.glority.android.picturexx.business.databinding.DialogChangeCurrencyBindingImpl;
import com.glority.android.picturexx.business.databinding.DialogChatbotSurveyBindingImpl;
import com.glority.android.picturexx.business.databinding.DialogChooseCustomSeriesBindingImpl;
import com.glority.android.picturexx.business.databinding.DialogChooseCustomSeriesEmptyBindingImpl;
import com.glority.android.picturexx.business.databinding.DialogCreateSeriesBindingImpl;
import com.glority.android.picturexx.business.databinding.DialogEmptyComposeLayoutBindingImpl;
import com.glority.android.picturexx.business.databinding.DialogExportIntroduceBindingImpl;
import com.glority.android.picturexx.business.databinding.DialogExportSuccessBindingImpl;
import com.glority.android.picturexx.business.databinding.DialogExportWriteinfoBindingImpl;
import com.glority.android.picturexx.business.databinding.DialogGradeLevelBindingImpl;
import com.glority.android.picturexx.business.databinding.DialogJsContentBindingImpl;
import com.glority.android.picturexx.business.databinding.DialogMeltPriceHintBindingImpl;
import com.glority.android.picturexx.business.databinding.DialogNotesnap30freeBindingImpl;
import com.glority.android.picturexx.business.databinding.DialogPriceFeedbackBindingImpl;
import com.glority.android.picturexx.business.databinding.DialogRemoveWishSuccessBindingImpl;
import com.glority.android.picturexx.business.databinding.DialogRenameCustomSeriesBindingImpl;
import com.glority.android.picturexx.business.databinding.DialogSyncCollectionsBindingImpl;
import com.glority.android.picturexx.business.databinding.DialogTrailPruchaseBindingImpl;
import com.glority.android.picturexx.business.databinding.DialogVarietySelectBindingImpl;
import com.glority.android.picturexx.business.databinding.DialogVarietyTipsBindingImpl;
import com.glority.android.picturexx.business.databinding.DialogWebSurveyBindingImpl;
import com.glority.android.picturexx.business.databinding.DialogYearSelectBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentAboutBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentBusinessJsWebviewBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentCoinSecondLevelBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentCollectDetailBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentCollectionDistributionBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentCollectionDistributionListBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentCollectionSearchBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentCollectionShareBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentConsultBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentCustomDetailBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentCustomHomeBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentCustomHomeContainerBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentCustomIdentificationResultsBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentCustomMeCollectionBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentCustomMySeriesBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentCustomSearchBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentCustomSearchDetailBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentCustomSeriesCollectionListBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentCustomSnapHistoryBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentCustomWishListBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentDeleteAccountBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentEditCollectionDetailBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentGradingDetailBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentGradingLoadingBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentHomeBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentMeCollectionAllBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentMeCollectionMySetPageBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentMeCollectionOfficialSetPageBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentMeCollectionSetsBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentMeCollectionSummaryBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentMeOfficialSeriesBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentRecognizeErrorBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentRecognizeLoadingBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentRecommendSeriesBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentSeriesCoinListBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentSeriesDetailBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentSeriesIntroduceBindingImpl;
import com.glority.android.picturexx.business.databinding.FragmentSimpleCollectionListBindingImpl;
import com.glority.android.picturexx.business.databinding.GlSearchViewBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemAddCollectionNoticeBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemAddImageBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemAddImageBtBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemChangeCurrencyBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemChangeCurrencyTitleBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemCoinTalkRvBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemCollectionSearchEmptyBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemCustomMeTabLayoutBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemCustomSeriesBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemCustomSeriesCardBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemCustomSeriesEmptyBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemCustomSeriesSelectedBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemCustomSeriesTopBarBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemCustomSeriesTopBarNewBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemExpertPicksBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemExpertTagBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemExportbarBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemHomeBannerVipBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemHomeCollectionBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemHomeCollectionDeBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemHomeCollectionEmptyBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemHomeCollectionEmptyDeBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemHomeGradeCardDeBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemHomeHeaderExpertPicksBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemHomeOptionCardDeBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemIdentifyResultsFlagBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemLongFootViewBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemMeCollectionBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemMeCollectionCardBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemMeCollectionEmptyBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemMeCollectionTopBarInpageBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemMeCollectionTopBarOutpageBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemMeHistoryBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemMeHistoryEmptyBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemMeSeriesEmptyBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemMeTabbarBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemMeWishBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemMeWishEmptyBindingImpl;
import com.glority.android.picturexx.business.databinding.ItemSeriesCollectionEmptyBindingImpl;
import com.glority.android.picturexx.business.databinding.LayoutCmsGradingReportBindingImpl;
import com.glority.android.picturexx.business.databinding.LayoutCollectionAllListHeaderBindingImpl;
import com.glority.android.picturexx.business.databinding.LayoutCollectionSetsTabViewBindingImpl;
import com.glority.android.picturexx.business.databinding.LayoutEmptyComposeViewWrapHeightBindingImpl;
import com.glority.android.picturexx.business.databinding.LayoutEmptyDialogBindingImpl;
import com.glority.android.picturexx.business.databinding.LayoutGradeYearSelectorAttentionBindingImpl;
import com.glority.android.picturexx.business.databinding.LayoutNoneCollectionEmptyViewBindingImpl;
import com.glority.android.picturexx.business.databinding.LayoutNoneCustomSeriesEmptyViewBindingImpl;
import com.glority.android.picturexx.business.databinding.LayoutNoneOfficialSeriesEmptyViewBindingImpl;
import com.glority.android.picturexx.business.databinding.LayoutOfficialSetPageItemViewBindingImpl;
import com.glority.android.picturexx.business.databinding.LayoutOfficialSetProgressBaseViewBindingImpl;
import com.glority.android.picturexx.business.databinding.LayoutSummaryCardBindingImpl;
import com.glority.android.picturexx.business.databinding.LayoutSummuryMapMarkerBindingImpl;
import com.glority.android.picturexx.business.databinding.ViewMeCollectionFunctionZoneBindingImpl;
import com.glority.android.picturexx.business.databinding.ViewMeCollectionPageSwitchBindingImpl;
import com.glority.android.picturexx.business.databinding.ViewMeCollectionSummaryBestOfficialSetBindingImpl;
import com.glority.android.picturexx.business.databinding.ViewMeCollectionSummaryBestVarietiesBindingImpl;
import com.glority.android.picturexx.business.databinding.ViewMeCollectionSummaryGeoDistributionBindingImpl;
import com.glority.android.picturexx.business.databinding.ViewMeCollectionSummaryMeltPriceBindingImpl;
import com.glority.android.picturexx.business.databinding.ViewRecognizeHeaderBindingImpl;
import com.glority.android.picturexx.business.databinding.ViewRecognizeHeaderNewBindingImpl;
import com.glority.android.picturexx.business.databinding.ViewSerialCollectionProgressLayoutBindingImpl;
import com.glority.android.picturexx.business.databinding.ViewSeriesCollectionFolderLayoutBindingImpl;
import com.glority.android.picturexx.business.databinding.ViewSummaryBestVarietiesPageBindingImpl;
import com.glority.android.picturexx.business.databinding.ViewSummaryGeoDistributionEntryLayoutBindingImpl;
import com.glority.android.picturexx.business.databinding.ViewSummaryMeltPriceRowLayoutBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP;
    private static final int LAYOUT_ACTIVITYBANKNOTECONGRATS = 1;
    private static final int LAYOUT_ACTIVITYCHATBOT = 2;
    private static final int LAYOUT_ACTIVITYCOLLECTIONDISTRIBUTION = 3;
    private static final int LAYOUT_ACTIVITYCUSTOMIDENTIFICATIONRESULT = 4;
    private static final int LAYOUT_ACTIVITYGRADINGGUIDE = 5;
    private static final int LAYOUT_ACTIVITYMAIN = 6;
    private static final int LAYOUT_ACTIVITYPURCHASE1 = 7;
    private static final int LAYOUT_ACTIVITYPURCHASE10002A = 8;
    private static final int LAYOUT_ACTIVITYPURCHASE10002B = 9;
    private static final int LAYOUT_ACTIVITYPURCHASE10003A = 10;
    private static final int LAYOUT_ACTIVITYPURCHASE10003B = 11;
    private static final int LAYOUT_ACTIVITYPURCHASE10004A = 12;
    private static final int LAYOUT_ACTIVITYPURCHASE10004B = 13;
    private static final int LAYOUT_ACTIVITYSUGGESTADD = 14;
    private static final int LAYOUT_CMSDETAILBOTTOMBAR1 = 15;
    private static final int LAYOUT_CMSDETAILBOTTOMBAR2 = 16;
    private static final int LAYOUT_CMSDETAILBOTTOMBAR3 = 17;
    private static final int LAYOUT_COINWIDGETCOMMONMENUBAR = 18;
    private static final int LAYOUT_CUSTOMFRAGMENTFAQANDHELP = 19;
    private static final int LAYOUT_CUSTOMFRAGMENTSETTING = 20;
    private static final int LAYOUT_DIALOGADDWISHSUCCESS = 21;
    private static final int LAYOUT_DIALOGBUSINESSJSWEBVIEW = 22;
    private static final int LAYOUT_DIALOGCHANGECURRENCY = 23;
    private static final int LAYOUT_DIALOGCHATBOTSURVEY = 24;
    private static final int LAYOUT_DIALOGCHOOSECUSTOMSERIES = 25;
    private static final int LAYOUT_DIALOGCHOOSECUSTOMSERIESEMPTY = 26;
    private static final int LAYOUT_DIALOGCREATESERIES = 27;
    private static final int LAYOUT_DIALOGEMPTYCOMPOSELAYOUT = 28;
    private static final int LAYOUT_DIALOGEXPORTINTRODUCE = 29;
    private static final int LAYOUT_DIALOGEXPORTSUCCESS = 30;
    private static final int LAYOUT_DIALOGEXPORTWRITEINFO = 31;
    private static final int LAYOUT_DIALOGGRADELEVEL = 32;
    private static final int LAYOUT_DIALOGJSCONTENT = 33;
    private static final int LAYOUT_DIALOGMELTPRICEHINT = 34;
    private static final int LAYOUT_DIALOGNOTESNAP30FREE = 35;
    private static final int LAYOUT_DIALOGPRICEFEEDBACK = 36;
    private static final int LAYOUT_DIALOGREMOVEWISHSUCCESS = 37;
    private static final int LAYOUT_DIALOGRENAMECUSTOMSERIES = 38;
    private static final int LAYOUT_DIALOGSYNCCOLLECTIONS = 39;
    private static final int LAYOUT_DIALOGTRAILPRUCHASE = 40;
    private static final int LAYOUT_DIALOGVARIETYSELECT = 41;
    private static final int LAYOUT_DIALOGVARIETYTIPS = 42;
    private static final int LAYOUT_DIALOGWEBSURVEY = 43;
    private static final int LAYOUT_DIALOGYEARSELECT = 44;
    private static final int LAYOUT_FRAGMENTABOUT = 45;
    private static final int LAYOUT_FRAGMENTBUSINESSJSWEBVIEW = 46;
    private static final int LAYOUT_FRAGMENTCOINSECONDLEVEL = 47;
    private static final int LAYOUT_FRAGMENTCOLLECTDETAIL = 48;
    private static final int LAYOUT_FRAGMENTCOLLECTIONDISTRIBUTION = 49;
    private static final int LAYOUT_FRAGMENTCOLLECTIONDISTRIBUTIONLIST = 50;
    private static final int LAYOUT_FRAGMENTCOLLECTIONSEARCH = 51;
    private static final int LAYOUT_FRAGMENTCOLLECTIONSHARE = 52;
    private static final int LAYOUT_FRAGMENTCONSULT = 53;
    private static final int LAYOUT_FRAGMENTCUSTOMDETAIL = 54;
    private static final int LAYOUT_FRAGMENTCUSTOMHOME = 55;
    private static final int LAYOUT_FRAGMENTCUSTOMHOMECONTAINER = 56;
    private static final int LAYOUT_FRAGMENTCUSTOMIDENTIFICATIONRESULTS = 57;
    private static final int LAYOUT_FRAGMENTCUSTOMMECOLLECTION = 58;
    private static final int LAYOUT_FRAGMENTCUSTOMMYSERIES = 59;
    private static final int LAYOUT_FRAGMENTCUSTOMSEARCH = 60;
    private static final int LAYOUT_FRAGMENTCUSTOMSEARCHDETAIL = 61;
    private static final int LAYOUT_FRAGMENTCUSTOMSERIESCOLLECTIONLIST = 62;
    private static final int LAYOUT_FRAGMENTCUSTOMSNAPHISTORY = 63;
    private static final int LAYOUT_FRAGMENTCUSTOMWISHLIST = 64;
    private static final int LAYOUT_FRAGMENTDELETEACCOUNT = 65;
    private static final int LAYOUT_FRAGMENTEDITCOLLECTIONDETAIL = 66;
    private static final int LAYOUT_FRAGMENTGRADINGDETAIL = 67;
    private static final int LAYOUT_FRAGMENTGRADINGLOADING = 68;
    private static final int LAYOUT_FRAGMENTHOME = 69;
    private static final int LAYOUT_FRAGMENTMECOLLECTIONALL = 70;
    private static final int LAYOUT_FRAGMENTMECOLLECTIONMYSETPAGE = 71;
    private static final int LAYOUT_FRAGMENTMECOLLECTIONOFFICIALSETPAGE = 72;
    private static final int LAYOUT_FRAGMENTMECOLLECTIONSETS = 73;
    private static final int LAYOUT_FRAGMENTMECOLLECTIONSUMMARY = 74;
    private static final int LAYOUT_FRAGMENTMEOFFICIALSERIES = 75;
    private static final int LAYOUT_FRAGMENTRECOGNIZEERROR = 76;
    private static final int LAYOUT_FRAGMENTRECOGNIZELOADING = 77;
    private static final int LAYOUT_FRAGMENTRECOMMENDSERIES = 78;
    private static final int LAYOUT_FRAGMENTSERIESCOINLIST = 79;
    private static final int LAYOUT_FRAGMENTSERIESDETAIL = 80;
    private static final int LAYOUT_FRAGMENTSERIESINTRODUCE = 81;
    private static final int LAYOUT_FRAGMENTSIMPLECOLLECTIONLIST = 82;
    private static final int LAYOUT_GLSEARCHVIEW = 83;
    private static final int LAYOUT_ITEMADDCOLLECTIONNOTICE = 84;
    private static final int LAYOUT_ITEMADDIMAGE = 85;
    private static final int LAYOUT_ITEMADDIMAGEBT = 86;
    private static final int LAYOUT_ITEMCHANGECURRENCY = 87;
    private static final int LAYOUT_ITEMCHANGECURRENCYTITLE = 88;
    private static final int LAYOUT_ITEMCOINTALKRV = 89;
    private static final int LAYOUT_ITEMCOLLECTIONSEARCHEMPTY = 90;
    private static final int LAYOUT_ITEMCUSTOMMETABLAYOUT = 91;
    private static final int LAYOUT_ITEMCUSTOMSERIES = 92;
    private static final int LAYOUT_ITEMCUSTOMSERIESCARD = 93;
    private static final int LAYOUT_ITEMCUSTOMSERIESEMPTY = 94;
    private static final int LAYOUT_ITEMCUSTOMSERIESSELECTED = 95;
    private static final int LAYOUT_ITEMCUSTOMSERIESTOPBAR = 96;
    private static final int LAYOUT_ITEMCUSTOMSERIESTOPBARNEW = 97;
    private static final int LAYOUT_ITEMEXPERTPICKS = 98;
    private static final int LAYOUT_ITEMEXPERTTAG = 99;
    private static final int LAYOUT_ITEMEXPORTBAR = 100;
    private static final int LAYOUT_ITEMHOMEBANNERVIP = 101;
    private static final int LAYOUT_ITEMHOMECOLLECTION = 102;
    private static final int LAYOUT_ITEMHOMECOLLECTIONDE = 103;
    private static final int LAYOUT_ITEMHOMECOLLECTIONEMPTY = 104;
    private static final int LAYOUT_ITEMHOMECOLLECTIONEMPTYDE = 105;
    private static final int LAYOUT_ITEMHOMEGRADECARDDE = 106;
    private static final int LAYOUT_ITEMHOMEHEADEREXPERTPICKS = 107;
    private static final int LAYOUT_ITEMHOMEOPTIONCARDDE = 108;
    private static final int LAYOUT_ITEMIDENTIFYRESULTSFLAG = 109;
    private static final int LAYOUT_ITEMLONGFOOTVIEW = 110;
    private static final int LAYOUT_ITEMMECOLLECTION = 111;
    private static final int LAYOUT_ITEMMECOLLECTIONCARD = 112;
    private static final int LAYOUT_ITEMMECOLLECTIONEMPTY = 113;
    private static final int LAYOUT_ITEMMECOLLECTIONTOPBARINPAGE = 114;
    private static final int LAYOUT_ITEMMECOLLECTIONTOPBAROUTPAGE = 115;
    private static final int LAYOUT_ITEMMEHISTORY = 116;
    private static final int LAYOUT_ITEMMEHISTORYEMPTY = 117;
    private static final int LAYOUT_ITEMMESERIESEMPTY = 118;
    private static final int LAYOUT_ITEMMETABBAR = 119;
    private static final int LAYOUT_ITEMMEWISH = 120;
    private static final int LAYOUT_ITEMMEWISHEMPTY = 121;
    private static final int LAYOUT_ITEMSERIESCOLLECTIONEMPTY = 122;
    private static final int LAYOUT_LAYOUTCMSGRADINGREPORT = 123;
    private static final int LAYOUT_LAYOUTCOLLECTIONALLLISTHEADER = 124;
    private static final int LAYOUT_LAYOUTCOLLECTIONSETSTABVIEW = 125;
    private static final int LAYOUT_LAYOUTEMPTYCOMPOSEVIEWWRAPHEIGHT = 126;
    private static final int LAYOUT_LAYOUTEMPTYDIALOG = 127;
    private static final int LAYOUT_LAYOUTGRADEYEARSELECTORATTENTION = 128;
    private static final int LAYOUT_LAYOUTNONECOLLECTIONEMPTYVIEW = 129;
    private static final int LAYOUT_LAYOUTNONECUSTOMSERIESEMPTYVIEW = 130;
    private static final int LAYOUT_LAYOUTNONEOFFICIALSERIESEMPTYVIEW = 131;
    private static final int LAYOUT_LAYOUTOFFICIALSETPAGEITEMVIEW = 132;
    private static final int LAYOUT_LAYOUTOFFICIALSETPROGRESSBASEVIEW = 133;
    private static final int LAYOUT_LAYOUTSUMMARYCARD = 134;
    private static final int LAYOUT_LAYOUTSUMMURYMAPMARKER = 135;
    private static final int LAYOUT_VIEWMECOLLECTIONFUNCTIONZONE = 136;
    private static final int LAYOUT_VIEWMECOLLECTIONPAGESWITCH = 137;
    private static final int LAYOUT_VIEWMECOLLECTIONSUMMARYBESTOFFICIALSET = 138;
    private static final int LAYOUT_VIEWMECOLLECTIONSUMMARYBESTVARIETIES = 139;
    private static final int LAYOUT_VIEWMECOLLECTIONSUMMARYGEODISTRIBUTION = 140;
    private static final int LAYOUT_VIEWMECOLLECTIONSUMMARYMELTPRICE = 141;
    private static final int LAYOUT_VIEWRECOGNIZEHEADER = 142;
    private static final int LAYOUT_VIEWRECOGNIZEHEADERNEW = 143;
    private static final int LAYOUT_VIEWSERIALCOLLECTIONPROGRESSLAYOUT = 144;
    private static final int LAYOUT_VIEWSERIESCOLLECTIONFOLDERLAYOUT = 145;
    private static final int LAYOUT_VIEWSUMMARYBESTVARIETIESPAGE = 146;
    private static final int LAYOUT_VIEWSUMMARYGEODISTRIBUTIONENTRYLAYOUT = 147;
    private static final int LAYOUT_VIEWSUMMARYMELTPRICEROWLAYOUT = 148;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(LAYOUT_VIEWSUMMARYMELTPRICEROWLAYOUT);
        INTERNAL_LAYOUT_ID_LOOKUP = sparseIntArray;
        sparseIntArray.put(R.layout.activity_banknote_congrats, 1);
        sparseIntArray.put(R.layout.activity_chatbot, 2);
        sparseIntArray.put(R.layout.activity_collection_distribution, 3);
        sparseIntArray.put(R.layout.activity_custom_identification_result, 4);
        sparseIntArray.put(R.layout.activity_grading_guide, 5);
        sparseIntArray.put(R.layout.activity_main, 6);
        sparseIntArray.put(R.layout.activity_purchase1, 7);
        sparseIntArray.put(R.layout.activity_purchase_10002a, 8);
        sparseIntArray.put(R.layout.activity_purchase_10002b, 9);
        sparseIntArray.put(R.layout.activity_purchase_10003a, 10);
        sparseIntArray.put(R.layout.activity_purchase_10003b, 11);
        sparseIntArray.put(R.layout.activity_purchase_10004a, 12);
        sparseIntArray.put(R.layout.activity_purchase_10004b, 13);
        sparseIntArray.put(R.layout.activity_suggest_add, 14);
        sparseIntArray.put(R.layout.cms_detail_bottom_bar1, 15);
        sparseIntArray.put(R.layout.cms_detail_bottom_bar2, 16);
        sparseIntArray.put(R.layout.cms_detail_bottom_bar3, 17);
        sparseIntArray.put(R.layout.coin_widget_common_menu_bar, 18);
        sparseIntArray.put(R.layout.custom_fragment_faq_and_help, 19);
        sparseIntArray.put(R.layout.custom_fragment_setting, 20);
        sparseIntArray.put(R.layout.dialog_add_wish_success, 21);
        sparseIntArray.put(R.layout.dialog_business_js_webview, 22);
        sparseIntArray.put(R.layout.dialog_change_currency, 23);
        sparseIntArray.put(R.layout.dialog_chatbot_survey, 24);
        sparseIntArray.put(R.layout.dialog_choose_custom_series, 25);
        sparseIntArray.put(R.layout.dialog_choose_custom_series_empty, 26);
        sparseIntArray.put(R.layout.dialog_create_series, 27);
        sparseIntArray.put(R.layout.dialog_empty_compose_layout, 28);
        sparseIntArray.put(R.layout.dialog_export_introduce, 29);
        sparseIntArray.put(R.layout.dialog_export_success, 30);
        sparseIntArray.put(R.layout.dialog_export_writeinfo, 31);
        sparseIntArray.put(R.layout.dialog_grade_level, 32);
        sparseIntArray.put(R.layout.dialog_js_content, 33);
        sparseIntArray.put(R.layout.dialog_melt_price_hint, 34);
        sparseIntArray.put(R.layout.dialog_notesnap_30free, 35);
        sparseIntArray.put(R.layout.dialog_price_feedback, 36);
        sparseIntArray.put(R.layout.dialog_remove_wish_success, 37);
        sparseIntArray.put(R.layout.dialog_rename_custom_series, 38);
        sparseIntArray.put(R.layout.dialog_sync_collections, 39);
        sparseIntArray.put(R.layout.dialog_trail_pruchase, 40);
        sparseIntArray.put(R.layout.dialog_variety_select, 41);
        sparseIntArray.put(R.layout.dialog_variety_tips, 42);
        sparseIntArray.put(R.layout.dialog_web_survey, 43);
        sparseIntArray.put(R.layout.dialog_year_select, 44);
        sparseIntArray.put(R.layout.fragment_about, 45);
        sparseIntArray.put(R.layout.fragment_business_js_webview, 46);
        sparseIntArray.put(R.layout.fragment_coin_second_level, 47);
        sparseIntArray.put(R.layout.fragment_collect_detail, 48);
        sparseIntArray.put(R.layout.fragment_collection_distribution, 49);
        sparseIntArray.put(R.layout.fragment_collection_distribution_list, 50);
        sparseIntArray.put(R.layout.fragment_collection_search, 51);
        sparseIntArray.put(R.layout.fragment_collection_share, 52);
        sparseIntArray.put(R.layout.fragment_consult, 53);
        sparseIntArray.put(R.layout.fragment_custom_detail, 54);
        sparseIntArray.put(R.layout.fragment_custom_home, 55);
        sparseIntArray.put(R.layout.fragment_custom_home_container, LAYOUT_FRAGMENTCUSTOMHOMECONTAINER);
        sparseIntArray.put(R.layout.fragment_custom_identification_results, LAYOUT_FRAGMENTCUSTOMIDENTIFICATIONRESULTS);
        sparseIntArray.put(R.layout.fragment_custom_me_collection, LAYOUT_FRAGMENTCUSTOMMECOLLECTION);
        sparseIntArray.put(R.layout.fragment_custom_my_series, LAYOUT_FRAGMENTCUSTOMMYSERIES);
        sparseIntArray.put(R.layout.fragment_custom_search, 60);
        sparseIntArray.put(R.layout.fragment_custom_search_detail, 61);
        sparseIntArray.put(R.layout.fragment_custom_series_collection_list, LAYOUT_FRAGMENTCUSTOMSERIESCOLLECTIONLIST);
        sparseIntArray.put(R.layout.fragment_custom_snap_history, 63);
        sparseIntArray.put(R.layout.fragment_custom_wish_list, 64);
        sparseIntArray.put(R.layout.fragment_delete_account, 65);
        sparseIntArray.put(R.layout.fragment_edit_collection_detail, 66);
        sparseIntArray.put(R.layout.fragment_grading_detail, 67);
        sparseIntArray.put(R.layout.fragment_grading_loading, LAYOUT_FRAGMENTGRADINGLOADING);
        sparseIntArray.put(R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
        sparseIntArray.put(R.layout.fragment_me_collection_all, LAYOUT_FRAGMENTMECOLLECTIONALL);
        sparseIntArray.put(R.layout.fragment_me_collection_my_set_page, 71);
        sparseIntArray.put(R.layout.fragment_me_collection_official_set_page, LAYOUT_FRAGMENTMECOLLECTIONOFFICIALSETPAGE);
        sparseIntArray.put(R.layout.fragment_me_collection_sets, LAYOUT_FRAGMENTMECOLLECTIONSETS);
        sparseIntArray.put(R.layout.fragment_me_collection_summary, LAYOUT_FRAGMENTMECOLLECTIONSUMMARY);
        sparseIntArray.put(R.layout.fragment_me_official_series, 75);
        sparseIntArray.put(R.layout.fragment_recognize_error, 76);
        sparseIntArray.put(R.layout.fragment_recognize_loading, LAYOUT_FRAGMENTRECOGNIZELOADING);
        sparseIntArray.put(R.layout.fragment_recommend_series, LAYOUT_FRAGMENTRECOMMENDSERIES);
        sparseIntArray.put(R.layout.fragment_series_coin_list, LAYOUT_FRAGMENTSERIESCOINLIST);
        sparseIntArray.put(R.layout.fragment_series_detail, 80);
        sparseIntArray.put(R.layout.fragment_series_introduce, LAYOUT_FRAGMENTSERIESINTRODUCE);
        sparseIntArray.put(R.layout.fragment_simple_collection_list, LAYOUT_FRAGMENTSIMPLECOLLECTIONLIST);
        sparseIntArray.put(R.layout.gl_search_view, LAYOUT_GLSEARCHVIEW);
        sparseIntArray.put(R.layout.item_add_collection_notice, LAYOUT_ITEMADDCOLLECTIONNOTICE);
        sparseIntArray.put(R.layout.item_add_image, LAYOUT_ITEMADDIMAGE);
        sparseIntArray.put(R.layout.item_add_image_bt, LAYOUT_ITEMADDIMAGEBT);
        sparseIntArray.put(R.layout.item_change_currency, LAYOUT_ITEMCHANGECURRENCY);
        sparseIntArray.put(R.layout.item_change_currency_title, LAYOUT_ITEMCHANGECURRENCYTITLE);
        sparseIntArray.put(R.layout.item_coin_talk_rv, 89);
        sparseIntArray.put(R.layout.item_collection_search_empty, LAYOUT_ITEMCOLLECTIONSEARCHEMPTY);
        sparseIntArray.put(R.layout.item_custom_me_tab_layout, LAYOUT_ITEMCUSTOMMETABLAYOUT);
        sparseIntArray.put(R.layout.item_custom_series, LAYOUT_ITEMCUSTOMSERIES);
        sparseIntArray.put(R.layout.item_custom_series_card, LAYOUT_ITEMCUSTOMSERIESCARD);
        sparseIntArray.put(R.layout.item_custom_series_empty, LAYOUT_ITEMCUSTOMSERIESEMPTY);
        sparseIntArray.put(R.layout.item_custom_series_selected, LAYOUT_ITEMCUSTOMSERIESSELECTED);
        sparseIntArray.put(R.layout.item_custom_series_top_bar, LAYOUT_ITEMCUSTOMSERIESTOPBAR);
        sparseIntArray.put(R.layout.item_custom_series_top_bar_new, LAYOUT_ITEMCUSTOMSERIESTOPBARNEW);
        sparseIntArray.put(R.layout.item_expert_picks, LAYOUT_ITEMEXPERTPICKS);
        sparseIntArray.put(R.layout.item_expert_tag, LAYOUT_ITEMEXPERTTAG);
        sparseIntArray.put(R.layout.item_exportbar, 100);
        sparseIntArray.put(R.layout.item_home_banner_vip, 101);
        sparseIntArray.put(R.layout.item_home_collection, 102);
        sparseIntArray.put(R.layout.item_home_collection_de, 103);
        sparseIntArray.put(R.layout.item_home_collection_empty, 104);
        sparseIntArray.put(R.layout.item_home_collection_empty_de, LAYOUT_ITEMHOMECOLLECTIONEMPTYDE);
        sparseIntArray.put(R.layout.item_home_grade_card_de, LAYOUT_ITEMHOMEGRADECARDDE);
        sparseIntArray.put(R.layout.item_home_header_expert_picks, LAYOUT_ITEMHOMEHEADEREXPERTPICKS);
        sparseIntArray.put(R.layout.item_home_option_card_de, 108);
        sparseIntArray.put(R.layout.item_identify_results_flag, 109);
        sparseIntArray.put(R.layout.item_long_foot_view, LAYOUT_ITEMLONGFOOTVIEW);
        sparseIntArray.put(R.layout.item_me_collection, LAYOUT_ITEMMECOLLECTION);
        sparseIntArray.put(R.layout.item_me_collection_card, 112);
        sparseIntArray.put(R.layout.item_me_collection_empty, LAYOUT_ITEMMECOLLECTIONEMPTY);
        sparseIntArray.put(R.layout.item_me_collection_top_bar_inpage, LAYOUT_ITEMMECOLLECTIONTOPBARINPAGE);
        sparseIntArray.put(R.layout.item_me_collection_top_bar_outpage, LAYOUT_ITEMMECOLLECTIONTOPBAROUTPAGE);
        sparseIntArray.put(R.layout.item_me_history, 116);
        sparseIntArray.put(R.layout.item_me_history_empty, LAYOUT_ITEMMEHISTORYEMPTY);
        sparseIntArray.put(R.layout.item_me_series_empty, LAYOUT_ITEMMESERIESEMPTY);
        sparseIntArray.put(R.layout.item_me_tabbar, LAYOUT_ITEMMETABBAR);
        sparseIntArray.put(R.layout.item_me_wish, 120);
        sparseIntArray.put(R.layout.item_me_wish_empty, LAYOUT_ITEMMEWISHEMPTY);
        sparseIntArray.put(R.layout.item_series_collection_empty, LAYOUT_ITEMSERIESCOLLECTIONEMPTY);
        sparseIntArray.put(R.layout.layout_cms_grading_report, LAYOUT_LAYOUTCMSGRADINGREPORT);
        sparseIntArray.put(R.layout.layout_collection_all_list_header, LAYOUT_LAYOUTCOLLECTIONALLLISTHEADER);
        sparseIntArray.put(R.layout.layout_collection_sets_tab_view, LAYOUT_LAYOUTCOLLECTIONSETSTABVIEW);
        sparseIntArray.put(R.layout.layout_empty_compose_view_wrap_height, LAYOUT_LAYOUTEMPTYCOMPOSEVIEWWRAPHEIGHT);
        sparseIntArray.put(R.layout.layout_empty_dialog, 127);
        sparseIntArray.put(R.layout.layout_grade_year_selector_attention, 128);
        sparseIntArray.put(R.layout.layout_none_collection_empty_view, 129);
        sparseIntArray.put(R.layout.layout_none_custom_series_empty_view, 130);
        sparseIntArray.put(R.layout.layout_none_official_series_empty_view, LAYOUT_LAYOUTNONEOFFICIALSERIESEMPTYVIEW);
        sparseIntArray.put(R.layout.layout_official_set_page_item_view, LAYOUT_LAYOUTOFFICIALSETPAGEITEMVIEW);
        sparseIntArray.put(R.layout.layout_official_set_progress_base_view, LAYOUT_LAYOUTOFFICIALSETPROGRESSBASEVIEW);
        sparseIntArray.put(R.layout.layout_summary_card, 134);
        sparseIntArray.put(R.layout.layout_summury_map_marker, 135);
        sparseIntArray.put(R.layout.view_me_collection_function_zone, LAYOUT_VIEWMECOLLECTIONFUNCTIONZONE);
        sparseIntArray.put(R.layout.view_me_collection_page_switch, LAYOUT_VIEWMECOLLECTIONPAGESWITCH);
        sparseIntArray.put(R.layout.view_me_collection_summary_best_official_set, 138);
        sparseIntArray.put(R.layout.view_me_collection_summary_best_varieties, LAYOUT_VIEWMECOLLECTIONSUMMARYBESTVARIETIES);
        sparseIntArray.put(R.layout.view_me_collection_summary_geo_distribution, LAYOUT_VIEWMECOLLECTIONSUMMARYGEODISTRIBUTION);
        sparseIntArray.put(R.layout.view_me_collection_summary_melt_price, LAYOUT_VIEWMECOLLECTIONSUMMARYMELTPRICE);
        sparseIntArray.put(R.layout.view_recognize_header, LAYOUT_VIEWRECOGNIZEHEADER);
        sparseIntArray.put(R.layout.view_recognize_header_new, LAYOUT_VIEWRECOGNIZEHEADERNEW);
        sparseIntArray.put(R.layout.view_serial_collection_progress_layout, LAYOUT_VIEWSERIALCOLLECTIONPROGRESSLAYOUT);
        sparseIntArray.put(R.layout.view_series_collection_folder_layout, LAYOUT_VIEWSERIESCOLLECTIONFOLDERLAYOUT);
        sparseIntArray.put(R.layout.view_summary_best_varieties_page, LAYOUT_VIEWSUMMARYBESTVARIETIESPAGE);
        sparseIntArray.put(R.layout.view_summary_geo_distribution_entry_layout, LAYOUT_VIEWSUMMARYGEODISTRIBUTIONENTRYLAYOUT);
        sparseIntArray.put(R.layout.view_summary_melt_price_row_layout, LAYOUT_VIEWSUMMARYMELTPRICEROWLAYOUT);
    }

    private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent component, View view, int internalId, Object tag) {
        switch (internalId) {
            case 1:
                if ("layout/activity_banknote_congrats_0".equals(tag)) {
                    return new ActivityBanknoteCongratsBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_banknote_congrats is invalid. Received: " + tag);
            case 2:
                if ("layout/activity_chatbot_0".equals(tag)) {
                    return new ActivityChatbotBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_chatbot is invalid. Received: " + tag);
            case 3:
                if ("layout/activity_collection_distribution_0".equals(tag)) {
                    return new ActivityCollectionDistributionBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_collection_distribution is invalid. Received: " + tag);
            case 4:
                if ("layout/activity_custom_identification_result_0".equals(tag)) {
                    return new ActivityCustomIdentificationResultBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_custom_identification_result is invalid. Received: " + tag);
            case 5:
                if ("layout/activity_grading_guide_0".equals(tag)) {
                    return new ActivityGradingGuideBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_grading_guide is invalid. Received: " + tag);
            case 6:
                if ("layout/activity_main_0".equals(tag)) {
                    return new ActivityMainBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
            case 7:
                if ("layout/activity_purchase1_0".equals(tag)) {
                    return new ActivityPurchase1BindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_purchase1 is invalid. Received: " + tag);
            case 8:
                if ("layout/activity_purchase_10002a_0".equals(tag)) {
                    return new ActivityPurchase10002aBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_purchase_10002a is invalid. Received: " + tag);
            case 9:
                if ("layout/activity_purchase_10002b_0".equals(tag)) {
                    return new ActivityPurchase10002bBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_purchase_10002b is invalid. Received: " + tag);
            case 10:
                if ("layout/activity_purchase_10003a_0".equals(tag)) {
                    return new ActivityPurchase10003aBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_purchase_10003a is invalid. Received: " + tag);
            case 11:
                if ("layout/activity_purchase_10003b_0".equals(tag)) {
                    return new ActivityPurchase10003bBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_purchase_10003b is invalid. Received: " + tag);
            case 12:
                if ("layout/activity_purchase_10004a_0".equals(tag)) {
                    return new ActivityPurchase10004aBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_purchase_10004a is invalid. Received: " + tag);
            case 13:
                if ("layout/activity_purchase_10004b_0".equals(tag)) {
                    return new ActivityPurchase10004bBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_purchase_10004b is invalid. Received: " + tag);
            case 14:
                if ("layout/activity_suggest_add_0".equals(tag)) {
                    return new ActivitySuggestAddBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for activity_suggest_add is invalid. Received: " + tag);
            case 15:
                if ("layout/cms_detail_bottom_bar1_0".equals(tag)) {
                    return new CmsDetailBottomBar1BindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for cms_detail_bottom_bar1 is invalid. Received: " + tag);
            case 16:
                if ("layout/cms_detail_bottom_bar2_0".equals(tag)) {
                    return new CmsDetailBottomBar2BindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for cms_detail_bottom_bar2 is invalid. Received: " + tag);
            case 17:
                if ("layout/cms_detail_bottom_bar3_0".equals(tag)) {
                    return new CmsDetailBottomBar3BindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for cms_detail_bottom_bar3 is invalid. Received: " + tag);
            case 18:
                if ("layout/coin_widget_common_menu_bar_0".equals(tag)) {
                    return new CoinWidgetCommonMenuBarBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for coin_widget_common_menu_bar is invalid. Received: " + tag);
            case 19:
                if ("layout/custom_fragment_faq_and_help_0".equals(tag)) {
                    return new CustomFragmentFaqAndHelpBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for custom_fragment_faq_and_help is invalid. Received: " + tag);
            case 20:
                if ("layout/custom_fragment_setting_0".equals(tag)) {
                    return new CustomFragmentSettingBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for custom_fragment_setting is invalid. Received: " + tag);
            case 21:
                if ("layout/dialog_add_wish_success_0".equals(tag)) {
                    return new DialogAddWishSuccessBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for dialog_add_wish_success is invalid. Received: " + tag);
            case 22:
                if ("layout/dialog_business_js_webview_0".equals(tag)) {
                    return new DialogBusinessJsWebviewBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for dialog_business_js_webview is invalid. Received: " + tag);
            case 23:
                if ("layout/dialog_change_currency_0".equals(tag)) {
                    return new DialogChangeCurrencyBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for dialog_change_currency is invalid. Received: " + tag);
            case 24:
                if ("layout/dialog_chatbot_survey_0".equals(tag)) {
                    return new DialogChatbotSurveyBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for dialog_chatbot_survey is invalid. Received: " + tag);
            case 25:
                if ("layout/dialog_choose_custom_series_0".equals(tag)) {
                    return new DialogChooseCustomSeriesBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for dialog_choose_custom_series is invalid. Received: " + tag);
            case 26:
                if ("layout/dialog_choose_custom_series_empty_0".equals(tag)) {
                    return new DialogChooseCustomSeriesEmptyBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for dialog_choose_custom_series_empty is invalid. Received: " + tag);
            case 27:
                if ("layout/dialog_create_series_0".equals(tag)) {
                    return new DialogCreateSeriesBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for dialog_create_series is invalid. Received: " + tag);
            case 28:
                if ("layout/dialog_empty_compose_layout_0".equals(tag)) {
                    return new DialogEmptyComposeLayoutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for dialog_empty_compose_layout is invalid. Received: " + tag);
            case 29:
                if ("layout/dialog_export_introduce_0".equals(tag)) {
                    return new DialogExportIntroduceBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for dialog_export_introduce is invalid. Received: " + tag);
            case 30:
                if ("layout/dialog_export_success_0".equals(tag)) {
                    return new DialogExportSuccessBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for dialog_export_success is invalid. Received: " + tag);
            case 31:
                if ("layout/dialog_export_writeinfo_0".equals(tag)) {
                    return new DialogExportWriteinfoBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for dialog_export_writeinfo is invalid. Received: " + tag);
            case 32:
                if ("layout/dialog_grade_level_0".equals(tag)) {
                    return new DialogGradeLevelBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for dialog_grade_level is invalid. Received: " + tag);
            case 33:
                if ("layout/dialog_js_content_0".equals(tag)) {
                    return new DialogJsContentBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for dialog_js_content is invalid. Received: " + tag);
            case 34:
                if ("layout/dialog_melt_price_hint_0".equals(tag)) {
                    return new DialogMeltPriceHintBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for dialog_melt_price_hint is invalid. Received: " + tag);
            case 35:
                if ("layout/dialog_notesnap_30free_0".equals(tag)) {
                    return new DialogNotesnap30freeBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for dialog_notesnap_30free is invalid. Received: " + tag);
            case 36:
                if ("layout/dialog_price_feedback_0".equals(tag)) {
                    return new DialogPriceFeedbackBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for dialog_price_feedback is invalid. Received: " + tag);
            case 37:
                if ("layout/dialog_remove_wish_success_0".equals(tag)) {
                    return new DialogRemoveWishSuccessBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for dialog_remove_wish_success is invalid. Received: " + tag);
            case 38:
                if ("layout/dialog_rename_custom_series_0".equals(tag)) {
                    return new DialogRenameCustomSeriesBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for dialog_rename_custom_series is invalid. Received: " + tag);
            case 39:
                if ("layout/dialog_sync_collections_0".equals(tag)) {
                    return new DialogSyncCollectionsBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for dialog_sync_collections is invalid. Received: " + tag);
            case 40:
                if ("layout/dialog_trail_pruchase_0".equals(tag)) {
                    return new DialogTrailPruchaseBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for dialog_trail_pruchase is invalid. Received: " + tag);
            case 41:
                if ("layout/dialog_variety_select_0".equals(tag)) {
                    return new DialogVarietySelectBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for dialog_variety_select is invalid. Received: " + tag);
            case 42:
                if ("layout/dialog_variety_tips_0".equals(tag)) {
                    return new DialogVarietyTipsBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for dialog_variety_tips is invalid. Received: " + tag);
            case 43:
                if ("layout/dialog_web_survey_0".equals(tag)) {
                    return new DialogWebSurveyBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for dialog_web_survey is invalid. Received: " + tag);
            case 44:
                if ("layout/dialog_year_select_0".equals(tag)) {
                    return new DialogYearSelectBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for dialog_year_select is invalid. Received: " + tag);
            case 45:
                if ("layout/fragment_about_0".equals(tag)) {
                    return new FragmentAboutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_about is invalid. Received: " + tag);
            case 46:
                if ("layout/fragment_business_js_webview_0".equals(tag)) {
                    return new FragmentBusinessJsWebviewBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_business_js_webview is invalid. Received: " + tag);
            case 47:
                if ("layout/fragment_coin_second_level_0".equals(tag)) {
                    return new FragmentCoinSecondLevelBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_coin_second_level is invalid. Received: " + tag);
            case 48:
                if ("layout/fragment_collect_detail_0".equals(tag)) {
                    return new FragmentCollectDetailBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_collect_detail is invalid. Received: " + tag);
            case 49:
                if ("layout/fragment_collection_distribution_0".equals(tag)) {
                    return new FragmentCollectionDistributionBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_collection_distribution is invalid. Received: " + tag);
            case 50:
                if ("layout/fragment_collection_distribution_list_0".equals(tag)) {
                    return new FragmentCollectionDistributionListBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_collection_distribution_list is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component, View view, int internalId, Object tag) {
        switch (internalId) {
            case 51:
                if ("layout/fragment_collection_search_0".equals(tag)) {
                    return new FragmentCollectionSearchBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_collection_search is invalid. Received: " + tag);
            case 52:
                if ("layout/fragment_collection_share_0".equals(tag)) {
                    return new FragmentCollectionShareBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_collection_share is invalid. Received: " + tag);
            case 53:
                if ("layout/fragment_consult_0".equals(tag)) {
                    return new FragmentConsultBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_consult is invalid. Received: " + tag);
            case 54:
                if ("layout/fragment_custom_detail_0".equals(tag)) {
                    return new FragmentCustomDetailBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_custom_detail is invalid. Received: " + tag);
            case 55:
                if ("layout/fragment_custom_home_0".equals(tag)) {
                    return new FragmentCustomHomeBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_custom_home is invalid. Received: " + tag);
            case LAYOUT_FRAGMENTCUSTOMHOMECONTAINER /* 56 */:
                if ("layout/fragment_custom_home_container_0".equals(tag)) {
                    return new FragmentCustomHomeContainerBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_custom_home_container is invalid. Received: " + tag);
            case LAYOUT_FRAGMENTCUSTOMIDENTIFICATIONRESULTS /* 57 */:
                if ("layout/fragment_custom_identification_results_0".equals(tag)) {
                    return new FragmentCustomIdentificationResultsBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_custom_identification_results is invalid. Received: " + tag);
            case LAYOUT_FRAGMENTCUSTOMMECOLLECTION /* 58 */:
                if ("layout/fragment_custom_me_collection_0".equals(tag)) {
                    return new FragmentCustomMeCollectionBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_custom_me_collection is invalid. Received: " + tag);
            case LAYOUT_FRAGMENTCUSTOMMYSERIES /* 59 */:
                if ("layout/fragment_custom_my_series_0".equals(tag)) {
                    return new FragmentCustomMySeriesBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_custom_my_series is invalid. Received: " + tag);
            case 60:
                if ("layout/fragment_custom_search_0".equals(tag)) {
                    return new FragmentCustomSearchBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_custom_search is invalid. Received: " + tag);
            case 61:
                if ("layout/fragment_custom_search_detail_0".equals(tag)) {
                    return new FragmentCustomSearchDetailBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_custom_search_detail is invalid. Received: " + tag);
            case LAYOUT_FRAGMENTCUSTOMSERIESCOLLECTIONLIST /* 62 */:
                if ("layout/fragment_custom_series_collection_list_0".equals(tag)) {
                    return new FragmentCustomSeriesCollectionListBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_custom_series_collection_list is invalid. Received: " + tag);
            case 63:
                if ("layout/fragment_custom_snap_history_0".equals(tag)) {
                    return new FragmentCustomSnapHistoryBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_custom_snap_history is invalid. Received: " + tag);
            case 64:
                if ("layout/fragment_custom_wish_list_0".equals(tag)) {
                    return new FragmentCustomWishListBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_custom_wish_list is invalid. Received: " + tag);
            case 65:
                if ("layout/fragment_delete_account_0".equals(tag)) {
                    return new FragmentDeleteAccountBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_delete_account is invalid. Received: " + tag);
            case 66:
                if ("layout/fragment_edit_collection_detail_0".equals(tag)) {
                    return new FragmentEditCollectionDetailBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_edit_collection_detail is invalid. Received: " + tag);
            case 67:
                if ("layout/fragment_grading_detail_0".equals(tag)) {
                    return new FragmentGradingDetailBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_grading_detail is invalid. Received: " + tag);
            case LAYOUT_FRAGMENTGRADINGLOADING /* 68 */:
                if ("layout/fragment_grading_loading_0".equals(tag)) {
                    return new FragmentGradingLoadingBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_grading_loading is invalid. Received: " + tag);
            case LAYOUT_FRAGMENTHOME /* 69 */:
                if ("layout/fragment_home_0".equals(tag)) {
                    return new FragmentHomeBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
            case LAYOUT_FRAGMENTMECOLLECTIONALL /* 70 */:
                if ("layout/fragment_me_collection_all_0".equals(tag)) {
                    return new FragmentMeCollectionAllBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_me_collection_all is invalid. Received: " + tag);
            case 71:
                if ("layout/fragment_me_collection_my_set_page_0".equals(tag)) {
                    return new FragmentMeCollectionMySetPageBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_me_collection_my_set_page is invalid. Received: " + tag);
            case LAYOUT_FRAGMENTMECOLLECTIONOFFICIALSETPAGE /* 72 */:
                if ("layout/fragment_me_collection_official_set_page_0".equals(tag)) {
                    return new FragmentMeCollectionOfficialSetPageBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_me_collection_official_set_page is invalid. Received: " + tag);
            case LAYOUT_FRAGMENTMECOLLECTIONSETS /* 73 */:
                if ("layout/fragment_me_collection_sets_0".equals(tag)) {
                    return new FragmentMeCollectionSetsBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_me_collection_sets is invalid. Received: " + tag);
            case LAYOUT_FRAGMENTMECOLLECTIONSUMMARY /* 74 */:
                if ("layout/fragment_me_collection_summary_0".equals(tag)) {
                    return new FragmentMeCollectionSummaryBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_me_collection_summary is invalid. Received: " + tag);
            case 75:
                if ("layout/fragment_me_official_series_0".equals(tag)) {
                    return new FragmentMeOfficialSeriesBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_me_official_series is invalid. Received: " + tag);
            case 76:
                if ("layout/fragment_recognize_error_0".equals(tag)) {
                    return new FragmentRecognizeErrorBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_recognize_error is invalid. Received: " + tag);
            case LAYOUT_FRAGMENTRECOGNIZELOADING /* 77 */:
                if ("layout/fragment_recognize_loading_0".equals(tag)) {
                    return new FragmentRecognizeLoadingBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_recognize_loading is invalid. Received: " + tag);
            case LAYOUT_FRAGMENTRECOMMENDSERIES /* 78 */:
                if ("layout/fragment_recommend_series_0".equals(tag)) {
                    return new FragmentRecommendSeriesBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_recommend_series is invalid. Received: " + tag);
            case LAYOUT_FRAGMENTSERIESCOINLIST /* 79 */:
                if ("layout/fragment_series_coin_list_0".equals(tag)) {
                    return new FragmentSeriesCoinListBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_series_coin_list is invalid. Received: " + tag);
            case 80:
                if ("layout/fragment_series_detail_0".equals(tag)) {
                    return new FragmentSeriesDetailBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_series_detail is invalid. Received: " + tag);
            case LAYOUT_FRAGMENTSERIESINTRODUCE /* 81 */:
                if ("layout/fragment_series_introduce_0".equals(tag)) {
                    return new FragmentSeriesIntroduceBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_series_introduce is invalid. Received: " + tag);
            case LAYOUT_FRAGMENTSIMPLECOLLECTIONLIST /* 82 */:
                if ("layout/fragment_simple_collection_list_0".equals(tag)) {
                    return new FragmentSimpleCollectionListBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for fragment_simple_collection_list is invalid. Received: " + tag);
            case LAYOUT_GLSEARCHVIEW /* 83 */:
                if ("layout/gl_search_view_0".equals(tag)) {
                    return new GlSearchViewBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for gl_search_view is invalid. Received: " + tag);
            case LAYOUT_ITEMADDCOLLECTIONNOTICE /* 84 */:
                if ("layout/item_add_collection_notice_0".equals(tag)) {
                    return new ItemAddCollectionNoticeBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_add_collection_notice is invalid. Received: " + tag);
            case LAYOUT_ITEMADDIMAGE /* 85 */:
                if ("layout/item_add_image_0".equals(tag)) {
                    return new ItemAddImageBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_add_image is invalid. Received: " + tag);
            case LAYOUT_ITEMADDIMAGEBT /* 86 */:
                if ("layout/item_add_image_bt_0".equals(tag)) {
                    return new ItemAddImageBtBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_add_image_bt is invalid. Received: " + tag);
            case LAYOUT_ITEMCHANGECURRENCY /* 87 */:
                if ("layout/item_change_currency_0".equals(tag)) {
                    return new ItemChangeCurrencyBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_change_currency is invalid. Received: " + tag);
            case LAYOUT_ITEMCHANGECURRENCYTITLE /* 88 */:
                if ("layout/item_change_currency_title_0".equals(tag)) {
                    return new ItemChangeCurrencyTitleBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_change_currency_title is invalid. Received: " + tag);
            case 89:
                if ("layout/item_coin_talk_rv_0".equals(tag)) {
                    return new ItemCoinTalkRvBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_coin_talk_rv is invalid. Received: " + tag);
            case LAYOUT_ITEMCOLLECTIONSEARCHEMPTY /* 90 */:
                if ("layout/item_collection_search_empty_0".equals(tag)) {
                    return new ItemCollectionSearchEmptyBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_collection_search_empty is invalid. Received: " + tag);
            case LAYOUT_ITEMCUSTOMMETABLAYOUT /* 91 */:
                if ("layout/item_custom_me_tab_layout_0".equals(tag)) {
                    return new ItemCustomMeTabLayoutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_custom_me_tab_layout is invalid. Received: " + tag);
            case LAYOUT_ITEMCUSTOMSERIES /* 92 */:
                if ("layout/item_custom_series_0".equals(tag)) {
                    return new ItemCustomSeriesBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_custom_series is invalid. Received: " + tag);
            case LAYOUT_ITEMCUSTOMSERIESCARD /* 93 */:
                if ("layout/item_custom_series_card_0".equals(tag)) {
                    return new ItemCustomSeriesCardBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_custom_series_card is invalid. Received: " + tag);
            case LAYOUT_ITEMCUSTOMSERIESEMPTY /* 94 */:
                if ("layout/item_custom_series_empty_0".equals(tag)) {
                    return new ItemCustomSeriesEmptyBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_custom_series_empty is invalid. Received: " + tag);
            case LAYOUT_ITEMCUSTOMSERIESSELECTED /* 95 */:
                if ("layout/item_custom_series_selected_0".equals(tag)) {
                    return new ItemCustomSeriesSelectedBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_custom_series_selected is invalid. Received: " + tag);
            case LAYOUT_ITEMCUSTOMSERIESTOPBAR /* 96 */:
                if ("layout/item_custom_series_top_bar_0".equals(tag)) {
                    return new ItemCustomSeriesTopBarBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_custom_series_top_bar is invalid. Received: " + tag);
            case LAYOUT_ITEMCUSTOMSERIESTOPBARNEW /* 97 */:
                if ("layout/item_custom_series_top_bar_new_0".equals(tag)) {
                    return new ItemCustomSeriesTopBarNewBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_custom_series_top_bar_new is invalid. Received: " + tag);
            case LAYOUT_ITEMEXPERTPICKS /* 98 */:
                if ("layout/item_expert_picks_0".equals(tag)) {
                    return new ItemExpertPicksBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_expert_picks is invalid. Received: " + tag);
            case LAYOUT_ITEMEXPERTTAG /* 99 */:
                if ("layout/item_expert_tag_0".equals(tag)) {
                    return new ItemExpertTagBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_expert_tag is invalid. Received: " + tag);
            case 100:
                if ("layout/item_exportbar_0".equals(tag)) {
                    return new ItemExportbarBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_exportbar is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    private final ViewDataBinding internalGetViewDataBinding2(DataBindingComponent component, View view, int internalId, Object tag) {
        switch (internalId) {
            case 101:
                if ("layout/item_home_banner_vip_0".equals(tag)) {
                    return new ItemHomeBannerVipBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_home_banner_vip is invalid. Received: " + tag);
            case 102:
                if ("layout/item_home_collection_0".equals(tag)) {
                    return new ItemHomeCollectionBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_home_collection is invalid. Received: " + tag);
            case 103:
                if ("layout/item_home_collection_de_0".equals(tag)) {
                    return new ItemHomeCollectionDeBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_home_collection_de is invalid. Received: " + tag);
            case 104:
                if ("layout/item_home_collection_empty_0".equals(tag)) {
                    return new ItemHomeCollectionEmptyBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_home_collection_empty is invalid. Received: " + tag);
            case LAYOUT_ITEMHOMECOLLECTIONEMPTYDE /* 105 */:
                if ("layout/item_home_collection_empty_de_0".equals(tag)) {
                    return new ItemHomeCollectionEmptyDeBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_home_collection_empty_de is invalid. Received: " + tag);
            case LAYOUT_ITEMHOMEGRADECARDDE /* 106 */:
                if ("layout/item_home_grade_card_de_0".equals(tag)) {
                    return new ItemHomeGradeCardDeBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_home_grade_card_de is invalid. Received: " + tag);
            case LAYOUT_ITEMHOMEHEADEREXPERTPICKS /* 107 */:
                if ("layout/item_home_header_expert_picks_0".equals(tag)) {
                    return new ItemHomeHeaderExpertPicksBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_home_header_expert_picks is invalid. Received: " + tag);
            case 108:
                if ("layout/item_home_option_card_de_0".equals(tag)) {
                    return new ItemHomeOptionCardDeBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_home_option_card_de is invalid. Received: " + tag);
            case 109:
                if ("layout/item_identify_results_flag_0".equals(tag)) {
                    return new ItemIdentifyResultsFlagBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_identify_results_flag is invalid. Received: " + tag);
            case LAYOUT_ITEMLONGFOOTVIEW /* 110 */:
                if ("layout/item_long_foot_view_0".equals(tag)) {
                    return new ItemLongFootViewBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_long_foot_view is invalid. Received: " + tag);
            case LAYOUT_ITEMMECOLLECTION /* 111 */:
                if ("layout/item_me_collection_0".equals(tag)) {
                    return new ItemMeCollectionBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_me_collection is invalid. Received: " + tag);
            case 112:
                if ("layout/item_me_collection_card_0".equals(tag)) {
                    return new ItemMeCollectionCardBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_me_collection_card is invalid. Received: " + tag);
            case LAYOUT_ITEMMECOLLECTIONEMPTY /* 113 */:
                if ("layout/item_me_collection_empty_0".equals(tag)) {
                    return new ItemMeCollectionEmptyBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_me_collection_empty is invalid. Received: " + tag);
            case LAYOUT_ITEMMECOLLECTIONTOPBARINPAGE /* 114 */:
                if ("layout/item_me_collection_top_bar_inpage_0".equals(tag)) {
                    return new ItemMeCollectionTopBarInpageBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_me_collection_top_bar_inpage is invalid. Received: " + tag);
            case LAYOUT_ITEMMECOLLECTIONTOPBAROUTPAGE /* 115 */:
                if ("layout/item_me_collection_top_bar_outpage_0".equals(tag)) {
                    return new ItemMeCollectionTopBarOutpageBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_me_collection_top_bar_outpage is invalid. Received: " + tag);
            case 116:
                if ("layout/item_me_history_0".equals(tag)) {
                    return new ItemMeHistoryBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_me_history is invalid. Received: " + tag);
            case LAYOUT_ITEMMEHISTORYEMPTY /* 117 */:
                if ("layout/item_me_history_empty_0".equals(tag)) {
                    return new ItemMeHistoryEmptyBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_me_history_empty is invalid. Received: " + tag);
            case LAYOUT_ITEMMESERIESEMPTY /* 118 */:
                if ("layout/item_me_series_empty_0".equals(tag)) {
                    return new ItemMeSeriesEmptyBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_me_series_empty is invalid. Received: " + tag);
            case LAYOUT_ITEMMETABBAR /* 119 */:
                if ("layout/item_me_tabbar_0".equals(tag)) {
                    return new ItemMeTabbarBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_me_tabbar is invalid. Received: " + tag);
            case 120:
                if ("layout/item_me_wish_0".equals(tag)) {
                    return new ItemMeWishBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_me_wish is invalid. Received: " + tag);
            case LAYOUT_ITEMMEWISHEMPTY /* 121 */:
                if ("layout/item_me_wish_empty_0".equals(tag)) {
                    return new ItemMeWishEmptyBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_me_wish_empty is invalid. Received: " + tag);
            case LAYOUT_ITEMSERIESCOLLECTIONEMPTY /* 122 */:
                if ("layout/item_series_collection_empty_0".equals(tag)) {
                    return new ItemSeriesCollectionEmptyBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for item_series_collection_empty is invalid. Received: " + tag);
            case LAYOUT_LAYOUTCMSGRADINGREPORT /* 123 */:
                if ("layout/layout_cms_grading_report_0".equals(tag)) {
                    return new LayoutCmsGradingReportBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for layout_cms_grading_report is invalid. Received: " + tag);
            case LAYOUT_LAYOUTCOLLECTIONALLLISTHEADER /* 124 */:
                if ("layout/layout_collection_all_list_header_0".equals(tag)) {
                    return new LayoutCollectionAllListHeaderBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for layout_collection_all_list_header is invalid. Received: " + tag);
            case LAYOUT_LAYOUTCOLLECTIONSETSTABVIEW /* 125 */:
                if ("layout/layout_collection_sets_tab_view_0".equals(tag)) {
                    return new LayoutCollectionSetsTabViewBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for layout_collection_sets_tab_view is invalid. Received: " + tag);
            case LAYOUT_LAYOUTEMPTYCOMPOSEVIEWWRAPHEIGHT /* 126 */:
                if ("layout/layout_empty_compose_view_wrap_height_0".equals(tag)) {
                    return new LayoutEmptyComposeViewWrapHeightBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for layout_empty_compose_view_wrap_height is invalid. Received: " + tag);
            case 127:
                if ("layout/layout_empty_dialog_0".equals(tag)) {
                    return new LayoutEmptyDialogBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for layout_empty_dialog is invalid. Received: " + tag);
            case 128:
                if ("layout/layout_grade_year_selector_attention_0".equals(tag)) {
                    return new LayoutGradeYearSelectorAttentionBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for layout_grade_year_selector_attention is invalid. Received: " + tag);
            case 129:
                if ("layout/layout_none_collection_empty_view_0".equals(tag)) {
                    return new LayoutNoneCollectionEmptyViewBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for layout_none_collection_empty_view is invalid. Received: " + tag);
            case 130:
                if ("layout/layout_none_custom_series_empty_view_0".equals(tag)) {
                    return new LayoutNoneCustomSeriesEmptyViewBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for layout_none_custom_series_empty_view is invalid. Received: " + tag);
            case LAYOUT_LAYOUTNONEOFFICIALSERIESEMPTYVIEW /* 131 */:
                if ("layout/layout_none_official_series_empty_view_0".equals(tag)) {
                    return new LayoutNoneOfficialSeriesEmptyViewBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for layout_none_official_series_empty_view is invalid. Received: " + tag);
            case LAYOUT_LAYOUTOFFICIALSETPAGEITEMVIEW /* 132 */:
                if ("layout/layout_official_set_page_item_view_0".equals(tag)) {
                    return new LayoutOfficialSetPageItemViewBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for layout_official_set_page_item_view is invalid. Received: " + tag);
            case LAYOUT_LAYOUTOFFICIALSETPROGRESSBASEVIEW /* 133 */:
                if ("layout/layout_official_set_progress_base_view_0".equals(tag)) {
                    return new LayoutOfficialSetProgressBaseViewBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for layout_official_set_progress_base_view is invalid. Received: " + tag);
            case 134:
                if ("layout/layout_summary_card_0".equals(tag)) {
                    return new LayoutSummaryCardBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for layout_summary_card is invalid. Received: " + tag);
            case 135:
                if ("layout/layout_summury_map_marker_0".equals(tag)) {
                    return new LayoutSummuryMapMarkerBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for layout_summury_map_marker is invalid. Received: " + tag);
            case LAYOUT_VIEWMECOLLECTIONFUNCTIONZONE /* 136 */:
                if ("layout/view_me_collection_function_zone_0".equals(tag)) {
                    return new ViewMeCollectionFunctionZoneBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for view_me_collection_function_zone is invalid. Received: " + tag);
            case LAYOUT_VIEWMECOLLECTIONPAGESWITCH /* 137 */:
                if ("layout/view_me_collection_page_switch_0".equals(tag)) {
                    return new ViewMeCollectionPageSwitchBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for view_me_collection_page_switch is invalid. Received: " + tag);
            case 138:
                if ("layout/view_me_collection_summary_best_official_set_0".equals(tag)) {
                    return new ViewMeCollectionSummaryBestOfficialSetBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for view_me_collection_summary_best_official_set is invalid. Received: " + tag);
            case LAYOUT_VIEWMECOLLECTIONSUMMARYBESTVARIETIES /* 139 */:
                if ("layout/view_me_collection_summary_best_varieties_0".equals(tag)) {
                    return new ViewMeCollectionSummaryBestVarietiesBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for view_me_collection_summary_best_varieties is invalid. Received: " + tag);
            case LAYOUT_VIEWMECOLLECTIONSUMMARYGEODISTRIBUTION /* 140 */:
                if ("layout/view_me_collection_summary_geo_distribution_0".equals(tag)) {
                    return new ViewMeCollectionSummaryGeoDistributionBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for view_me_collection_summary_geo_distribution is invalid. Received: " + tag);
            case LAYOUT_VIEWMECOLLECTIONSUMMARYMELTPRICE /* 141 */:
                if ("layout/view_me_collection_summary_melt_price_0".equals(tag)) {
                    return new ViewMeCollectionSummaryMeltPriceBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for view_me_collection_summary_melt_price is invalid. Received: " + tag);
            case LAYOUT_VIEWRECOGNIZEHEADER /* 142 */:
                if ("layout/view_recognize_header_0".equals(tag)) {
                    return new ViewRecognizeHeaderBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for view_recognize_header is invalid. Received: " + tag);
            case LAYOUT_VIEWRECOGNIZEHEADERNEW /* 143 */:
                if ("layout/view_recognize_header_new_0".equals(tag)) {
                    return new ViewRecognizeHeaderNewBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for view_recognize_header_new is invalid. Received: " + tag);
            case LAYOUT_VIEWSERIALCOLLECTIONPROGRESSLAYOUT /* 144 */:
                if ("layout/view_serial_collection_progress_layout_0".equals(tag)) {
                    return new ViewSerialCollectionProgressLayoutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for view_serial_collection_progress_layout is invalid. Received: " + tag);
            case LAYOUT_VIEWSERIESCOLLECTIONFOLDERLAYOUT /* 145 */:
                if ("layout/view_series_collection_folder_layout_0".equals(tag)) {
                    return new ViewSeriesCollectionFolderLayoutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for view_series_collection_folder_layout is invalid. Received: " + tag);
            case LAYOUT_VIEWSUMMARYBESTVARIETIESPAGE /* 146 */:
                if ("layout/view_summary_best_varieties_page_0".equals(tag)) {
                    return new ViewSummaryBestVarietiesPageBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for view_summary_best_varieties_page is invalid. Received: " + tag);
            case LAYOUT_VIEWSUMMARYGEODISTRIBUTIONENTRYLAYOUT /* 147 */:
                if ("layout/view_summary_geo_distribution_entry_layout_0".equals(tag)) {
                    return new ViewSummaryGeoDistributionEntryLayoutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for view_summary_geo_distribution_entry_layout is invalid. Received: " + tag);
            case LAYOUT_VIEWSUMMARYMELTPRICEROWLAYOUT /* 148 */:
                if ("layout/view_summary_melt_price_row_layout_0".equals(tag)) {
                    return new ViewSummaryMeltPriceRowLayoutBindingImpl(component, view);
                }
                throw new IllegalArgumentException("The tag for view_summary_melt_price_row_layout is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
        int i = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
        if (i <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        int i2 = (i - 1) / 50;
        if (i2 == 0) {
            return internalGetViewDataBinding0(component, view, i, tag);
        }
        if (i2 == 1) {
            return internalGetViewDataBinding1(component, view, i, tag);
        }
        if (i2 != 2) {
            return null;
        }
        return internalGetViewDataBinding2(component, view, i, tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
        if (views == null || views.length == 0 || INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId) <= 0 || views[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String tag) {
        Integer num;
        if (tag == null || (num = InnerLayoutIdLookup.sKeys.get(tag)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int localId) {
        return InnerBrLookup.sKeys.get(localId);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(13);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.apis.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.cmsui2.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.core.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.netpromoterscore.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.picturexx.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.picturexx.payment.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.picturexx.recognize.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.picturexx.settings.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.picturexx.splash.DataBinderMapperImpl());
        arrayList.add(new com.glority.base.DataBinderMapperImpl());
        arrayList.add(new com.glority.chatbot2.DataBinderMapperImpl());
        arrayList.add(new com.glority.purchase.ui.DataBinderMapperImpl());
        return arrayList;
    }

    /* loaded from: classes2.dex */
    private static class InnerBrLookup {
        static final SparseArray<String> sKeys;

        private InnerBrLookup() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(9);
            sKeys = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "metalType");
            sparseArray.put(2, "percentage");
            sparseArray.put(3, "price_per_week");
            sparseArray.put(4, "redDotVisible");
            sparseArray.put(5, "selected_index");
            sparseArray.put(6, "trialDays");
            sparseArray.put(7, "weekly_price");
            sparseArray.put(8, "yearly_price");
        }
    }

    /* loaded from: classes2.dex */
    private static class InnerLayoutIdLookup {
        static final HashMap<String, Integer> sKeys;

        private InnerLayoutIdLookup() {
        }

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(DataBinderMapperImpl.LAYOUT_VIEWSUMMARYMELTPRICEROWLAYOUT);
            sKeys = hashMap;
            hashMap.put("layout/activity_banknote_congrats_0", Integer.valueOf(R.layout.activity_banknote_congrats));
            hashMap.put("layout/activity_chatbot_0", Integer.valueOf(R.layout.activity_chatbot));
            hashMap.put("layout/activity_collection_distribution_0", Integer.valueOf(R.layout.activity_collection_distribution));
            hashMap.put("layout/activity_custom_identification_result_0", Integer.valueOf(R.layout.activity_custom_identification_result));
            hashMap.put("layout/activity_grading_guide_0", Integer.valueOf(R.layout.activity_grading_guide));
            hashMap.put("layout/activity_main_0", Integer.valueOf(R.layout.activity_main));
            hashMap.put("layout/activity_purchase1_0", Integer.valueOf(R.layout.activity_purchase1));
            hashMap.put("layout/activity_purchase_10002a_0", Integer.valueOf(R.layout.activity_purchase_10002a));
            hashMap.put("layout/activity_purchase_10002b_0", Integer.valueOf(R.layout.activity_purchase_10002b));
            hashMap.put("layout/activity_purchase_10003a_0", Integer.valueOf(R.layout.activity_purchase_10003a));
            hashMap.put("layout/activity_purchase_10003b_0", Integer.valueOf(R.layout.activity_purchase_10003b));
            hashMap.put("layout/activity_purchase_10004a_0", Integer.valueOf(R.layout.activity_purchase_10004a));
            hashMap.put("layout/activity_purchase_10004b_0", Integer.valueOf(R.layout.activity_purchase_10004b));
            hashMap.put("layout/activity_suggest_add_0", Integer.valueOf(R.layout.activity_suggest_add));
            hashMap.put("layout/cms_detail_bottom_bar1_0", Integer.valueOf(R.layout.cms_detail_bottom_bar1));
            hashMap.put("layout/cms_detail_bottom_bar2_0", Integer.valueOf(R.layout.cms_detail_bottom_bar2));
            hashMap.put("layout/cms_detail_bottom_bar3_0", Integer.valueOf(R.layout.cms_detail_bottom_bar3));
            hashMap.put("layout/coin_widget_common_menu_bar_0", Integer.valueOf(R.layout.coin_widget_common_menu_bar));
            hashMap.put("layout/custom_fragment_faq_and_help_0", Integer.valueOf(R.layout.custom_fragment_faq_and_help));
            hashMap.put("layout/custom_fragment_setting_0", Integer.valueOf(R.layout.custom_fragment_setting));
            hashMap.put("layout/dialog_add_wish_success_0", Integer.valueOf(R.layout.dialog_add_wish_success));
            hashMap.put("layout/dialog_business_js_webview_0", Integer.valueOf(R.layout.dialog_business_js_webview));
            hashMap.put("layout/dialog_change_currency_0", Integer.valueOf(R.layout.dialog_change_currency));
            hashMap.put("layout/dialog_chatbot_survey_0", Integer.valueOf(R.layout.dialog_chatbot_survey));
            hashMap.put("layout/dialog_choose_custom_series_0", Integer.valueOf(R.layout.dialog_choose_custom_series));
            hashMap.put("layout/dialog_choose_custom_series_empty_0", Integer.valueOf(R.layout.dialog_choose_custom_series_empty));
            hashMap.put("layout/dialog_create_series_0", Integer.valueOf(R.layout.dialog_create_series));
            hashMap.put("layout/dialog_empty_compose_layout_0", Integer.valueOf(R.layout.dialog_empty_compose_layout));
            hashMap.put("layout/dialog_export_introduce_0", Integer.valueOf(R.layout.dialog_export_introduce));
            hashMap.put("layout/dialog_export_success_0", Integer.valueOf(R.layout.dialog_export_success));
            hashMap.put("layout/dialog_export_writeinfo_0", Integer.valueOf(R.layout.dialog_export_writeinfo));
            hashMap.put("layout/dialog_grade_level_0", Integer.valueOf(R.layout.dialog_grade_level));
            hashMap.put("layout/dialog_js_content_0", Integer.valueOf(R.layout.dialog_js_content));
            hashMap.put("layout/dialog_melt_price_hint_0", Integer.valueOf(R.layout.dialog_melt_price_hint));
            hashMap.put("layout/dialog_notesnap_30free_0", Integer.valueOf(R.layout.dialog_notesnap_30free));
            hashMap.put("layout/dialog_price_feedback_0", Integer.valueOf(R.layout.dialog_price_feedback));
            hashMap.put("layout/dialog_remove_wish_success_0", Integer.valueOf(R.layout.dialog_remove_wish_success));
            hashMap.put("layout/dialog_rename_custom_series_0", Integer.valueOf(R.layout.dialog_rename_custom_series));
            hashMap.put("layout/dialog_sync_collections_0", Integer.valueOf(R.layout.dialog_sync_collections));
            hashMap.put("layout/dialog_trail_pruchase_0", Integer.valueOf(R.layout.dialog_trail_pruchase));
            hashMap.put("layout/dialog_variety_select_0", Integer.valueOf(R.layout.dialog_variety_select));
            hashMap.put("layout/dialog_variety_tips_0", Integer.valueOf(R.layout.dialog_variety_tips));
            hashMap.put("layout/dialog_web_survey_0", Integer.valueOf(R.layout.dialog_web_survey));
            hashMap.put("layout/dialog_year_select_0", Integer.valueOf(R.layout.dialog_year_select));
            hashMap.put("layout/fragment_about_0", Integer.valueOf(R.layout.fragment_about));
            hashMap.put("layout/fragment_business_js_webview_0", Integer.valueOf(R.layout.fragment_business_js_webview));
            hashMap.put("layout/fragment_coin_second_level_0", Integer.valueOf(R.layout.fragment_coin_second_level));
            hashMap.put("layout/fragment_collect_detail_0", Integer.valueOf(R.layout.fragment_collect_detail));
            hashMap.put("layout/fragment_collection_distribution_0", Integer.valueOf(R.layout.fragment_collection_distribution));
            hashMap.put("layout/fragment_collection_distribution_list_0", Integer.valueOf(R.layout.fragment_collection_distribution_list));
            hashMap.put("layout/fragment_collection_search_0", Integer.valueOf(R.layout.fragment_collection_search));
            hashMap.put("layout/fragment_collection_share_0", Integer.valueOf(R.layout.fragment_collection_share));
            hashMap.put("layout/fragment_consult_0", Integer.valueOf(R.layout.fragment_consult));
            hashMap.put("layout/fragment_custom_detail_0", Integer.valueOf(R.layout.fragment_custom_detail));
            hashMap.put("layout/fragment_custom_home_0", Integer.valueOf(R.layout.fragment_custom_home));
            hashMap.put("layout/fragment_custom_home_container_0", Integer.valueOf(R.layout.fragment_custom_home_container));
            hashMap.put("layout/fragment_custom_identification_results_0", Integer.valueOf(R.layout.fragment_custom_identification_results));
            hashMap.put("layout/fragment_custom_me_collection_0", Integer.valueOf(R.layout.fragment_custom_me_collection));
            hashMap.put("layout/fragment_custom_my_series_0", Integer.valueOf(R.layout.fragment_custom_my_series));
            hashMap.put("layout/fragment_custom_search_0", Integer.valueOf(R.layout.fragment_custom_search));
            hashMap.put("layout/fragment_custom_search_detail_0", Integer.valueOf(R.layout.fragment_custom_search_detail));
            hashMap.put("layout/fragment_custom_series_collection_list_0", Integer.valueOf(R.layout.fragment_custom_series_collection_list));
            hashMap.put("layout/fragment_custom_snap_history_0", Integer.valueOf(R.layout.fragment_custom_snap_history));
            hashMap.put("layout/fragment_custom_wish_list_0", Integer.valueOf(R.layout.fragment_custom_wish_list));
            hashMap.put("layout/fragment_delete_account_0", Integer.valueOf(R.layout.fragment_delete_account));
            hashMap.put("layout/fragment_edit_collection_detail_0", Integer.valueOf(R.layout.fragment_edit_collection_detail));
            hashMap.put("layout/fragment_grading_detail_0", Integer.valueOf(R.layout.fragment_grading_detail));
            hashMap.put("layout/fragment_grading_loading_0", Integer.valueOf(R.layout.fragment_grading_loading));
            hashMap.put("layout/fragment_home_0", Integer.valueOf(R.layout.fragment_home));
            hashMap.put("layout/fragment_me_collection_all_0", Integer.valueOf(R.layout.fragment_me_collection_all));
            hashMap.put("layout/fragment_me_collection_my_set_page_0", Integer.valueOf(R.layout.fragment_me_collection_my_set_page));
            hashMap.put("layout/fragment_me_collection_official_set_page_0", Integer.valueOf(R.layout.fragment_me_collection_official_set_page));
            hashMap.put("layout/fragment_me_collection_sets_0", Integer.valueOf(R.layout.fragment_me_collection_sets));
            hashMap.put("layout/fragment_me_collection_summary_0", Integer.valueOf(R.layout.fragment_me_collection_summary));
            hashMap.put("layout/fragment_me_official_series_0", Integer.valueOf(R.layout.fragment_me_official_series));
            hashMap.put("layout/fragment_recognize_error_0", Integer.valueOf(R.layout.fragment_recognize_error));
            hashMap.put("layout/fragment_recognize_loading_0", Integer.valueOf(R.layout.fragment_recognize_loading));
            hashMap.put("layout/fragment_recommend_series_0", Integer.valueOf(R.layout.fragment_recommend_series));
            hashMap.put("layout/fragment_series_coin_list_0", Integer.valueOf(R.layout.fragment_series_coin_list));
            hashMap.put("layout/fragment_series_detail_0", Integer.valueOf(R.layout.fragment_series_detail));
            hashMap.put("layout/fragment_series_introduce_0", Integer.valueOf(R.layout.fragment_series_introduce));
            hashMap.put("layout/fragment_simple_collection_list_0", Integer.valueOf(R.layout.fragment_simple_collection_list));
            hashMap.put("layout/gl_search_view_0", Integer.valueOf(R.layout.gl_search_view));
            hashMap.put("layout/item_add_collection_notice_0", Integer.valueOf(R.layout.item_add_collection_notice));
            hashMap.put("layout/item_add_image_0", Integer.valueOf(R.layout.item_add_image));
            hashMap.put("layout/item_add_image_bt_0", Integer.valueOf(R.layout.item_add_image_bt));
            hashMap.put("layout/item_change_currency_0", Integer.valueOf(R.layout.item_change_currency));
            hashMap.put("layout/item_change_currency_title_0", Integer.valueOf(R.layout.item_change_currency_title));
            hashMap.put("layout/item_coin_talk_rv_0", Integer.valueOf(R.layout.item_coin_talk_rv));
            hashMap.put("layout/item_collection_search_empty_0", Integer.valueOf(R.layout.item_collection_search_empty));
            hashMap.put("layout/item_custom_me_tab_layout_0", Integer.valueOf(R.layout.item_custom_me_tab_layout));
            hashMap.put("layout/item_custom_series_0", Integer.valueOf(R.layout.item_custom_series));
            hashMap.put("layout/item_custom_series_card_0", Integer.valueOf(R.layout.item_custom_series_card));
            hashMap.put("layout/item_custom_series_empty_0", Integer.valueOf(R.layout.item_custom_series_empty));
            hashMap.put("layout/item_custom_series_selected_0", Integer.valueOf(R.layout.item_custom_series_selected));
            hashMap.put("layout/item_custom_series_top_bar_0", Integer.valueOf(R.layout.item_custom_series_top_bar));
            hashMap.put("layout/item_custom_series_top_bar_new_0", Integer.valueOf(R.layout.item_custom_series_top_bar_new));
            hashMap.put("layout/item_expert_picks_0", Integer.valueOf(R.layout.item_expert_picks));
            hashMap.put("layout/item_expert_tag_0", Integer.valueOf(R.layout.item_expert_tag));
            hashMap.put("layout/item_exportbar_0", Integer.valueOf(R.layout.item_exportbar));
            hashMap.put("layout/item_home_banner_vip_0", Integer.valueOf(R.layout.item_home_banner_vip));
            hashMap.put("layout/item_home_collection_0", Integer.valueOf(R.layout.item_home_collection));
            hashMap.put("layout/item_home_collection_de_0", Integer.valueOf(R.layout.item_home_collection_de));
            hashMap.put("layout/item_home_collection_empty_0", Integer.valueOf(R.layout.item_home_collection_empty));
            hashMap.put("layout/item_home_collection_empty_de_0", Integer.valueOf(R.layout.item_home_collection_empty_de));
            hashMap.put("layout/item_home_grade_card_de_0", Integer.valueOf(R.layout.item_home_grade_card_de));
            hashMap.put("layout/item_home_header_expert_picks_0", Integer.valueOf(R.layout.item_home_header_expert_picks));
            hashMap.put("layout/item_home_option_card_de_0", Integer.valueOf(R.layout.item_home_option_card_de));
            hashMap.put("layout/item_identify_results_flag_0", Integer.valueOf(R.layout.item_identify_results_flag));
            hashMap.put("layout/item_long_foot_view_0", Integer.valueOf(R.layout.item_long_foot_view));
            hashMap.put("layout/item_me_collection_0", Integer.valueOf(R.layout.item_me_collection));
            hashMap.put("layout/item_me_collection_card_0", Integer.valueOf(R.layout.item_me_collection_card));
            hashMap.put("layout/item_me_collection_empty_0", Integer.valueOf(R.layout.item_me_collection_empty));
            hashMap.put("layout/item_me_collection_top_bar_inpage_0", Integer.valueOf(R.layout.item_me_collection_top_bar_inpage));
            hashMap.put("layout/item_me_collection_top_bar_outpage_0", Integer.valueOf(R.layout.item_me_collection_top_bar_outpage));
            hashMap.put("layout/item_me_history_0", Integer.valueOf(R.layout.item_me_history));
            hashMap.put("layout/item_me_history_empty_0", Integer.valueOf(R.layout.item_me_history_empty));
            hashMap.put("layout/item_me_series_empty_0", Integer.valueOf(R.layout.item_me_series_empty));
            hashMap.put("layout/item_me_tabbar_0", Integer.valueOf(R.layout.item_me_tabbar));
            hashMap.put("layout/item_me_wish_0", Integer.valueOf(R.layout.item_me_wish));
            hashMap.put("layout/item_me_wish_empty_0", Integer.valueOf(R.layout.item_me_wish_empty));
            hashMap.put("layout/item_series_collection_empty_0", Integer.valueOf(R.layout.item_series_collection_empty));
            hashMap.put("layout/layout_cms_grading_report_0", Integer.valueOf(R.layout.layout_cms_grading_report));
            hashMap.put("layout/layout_collection_all_list_header_0", Integer.valueOf(R.layout.layout_collection_all_list_header));
            hashMap.put("layout/layout_collection_sets_tab_view_0", Integer.valueOf(R.layout.layout_collection_sets_tab_view));
            hashMap.put("layout/layout_empty_compose_view_wrap_height_0", Integer.valueOf(R.layout.layout_empty_compose_view_wrap_height));
            hashMap.put("layout/layout_empty_dialog_0", Integer.valueOf(R.layout.layout_empty_dialog));
            hashMap.put("layout/layout_grade_year_selector_attention_0", Integer.valueOf(R.layout.layout_grade_year_selector_attention));
            hashMap.put("layout/layout_none_collection_empty_view_0", Integer.valueOf(R.layout.layout_none_collection_empty_view));
            hashMap.put("layout/layout_none_custom_series_empty_view_0", Integer.valueOf(R.layout.layout_none_custom_series_empty_view));
            hashMap.put("layout/layout_none_official_series_empty_view_0", Integer.valueOf(R.layout.layout_none_official_series_empty_view));
            hashMap.put("layout/layout_official_set_page_item_view_0", Integer.valueOf(R.layout.layout_official_set_page_item_view));
            hashMap.put("layout/layout_official_set_progress_base_view_0", Integer.valueOf(R.layout.layout_official_set_progress_base_view));
            hashMap.put("layout/layout_summary_card_0", Integer.valueOf(R.layout.layout_summary_card));
            hashMap.put("layout/layout_summury_map_marker_0", Integer.valueOf(R.layout.layout_summury_map_marker));
            hashMap.put("layout/view_me_collection_function_zone_0", Integer.valueOf(R.layout.view_me_collection_function_zone));
            hashMap.put("layout/view_me_collection_page_switch_0", Integer.valueOf(R.layout.view_me_collection_page_switch));
            hashMap.put("layout/view_me_collection_summary_best_official_set_0", Integer.valueOf(R.layout.view_me_collection_summary_best_official_set));
            hashMap.put("layout/view_me_collection_summary_best_varieties_0", Integer.valueOf(R.layout.view_me_collection_summary_best_varieties));
            hashMap.put("layout/view_me_collection_summary_geo_distribution_0", Integer.valueOf(R.layout.view_me_collection_summary_geo_distribution));
            hashMap.put("layout/view_me_collection_summary_melt_price_0", Integer.valueOf(R.layout.view_me_collection_summary_melt_price));
            hashMap.put("layout/view_recognize_header_0", Integer.valueOf(R.layout.view_recognize_header));
            hashMap.put("layout/view_recognize_header_new_0", Integer.valueOf(R.layout.view_recognize_header_new));
            hashMap.put("layout/view_serial_collection_progress_layout_0", Integer.valueOf(R.layout.view_serial_collection_progress_layout));
            hashMap.put("layout/view_series_collection_folder_layout_0", Integer.valueOf(R.layout.view_series_collection_folder_layout));
            hashMap.put("layout/view_summary_best_varieties_page_0", Integer.valueOf(R.layout.view_summary_best_varieties_page));
            hashMap.put("layout/view_summary_geo_distribution_entry_layout_0", Integer.valueOf(R.layout.view_summary_geo_distribution_entry_layout));
            hashMap.put("layout/view_summary_melt_price_row_layout_0", Integer.valueOf(R.layout.view_summary_melt_price_row_layout));
        }
    }
}
