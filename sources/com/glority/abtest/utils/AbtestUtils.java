package com.glority.abtest.utils;

import android.os.Bundle;
import android.util.Base64;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.glority.abtest.repository.AbtestRepository;
import com.glority.abtesting.generatedAPI.kotlinAPI.config.Abtesting;
import com.glority.abtesting.generatedAPI.kotlinAPI.config.AbtestingCondition;
import com.glority.abtesting.generatedAPI.kotlinAPI.config.AbtestingGroup;
import com.glority.abtesting.generatedAPI.kotlinAPI.config.AbtestingVariable;
import com.glority.abtesting.generatedAPI.kotlinAPI.config.GetAbtestingDefinitionsMessage;
import com.glority.abtesting.generatedAPI.kotlinAPI.enums.AbtestingStatus;
import com.glority.abtesting.generatedAPI.kotlinAPI.enums.ConditionOperator;
import com.glority.abtesting.generatedAPI.kotlinAPI.enums.RecordType;
import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.cmsui.entity.LikeItem;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.route.analysis.SendErrorEventRequest;
import com.glority.android.core.route.utils.PersistDataReadRequest;
import com.glority.android.core.route.utils.PersistDataWriteRequest;
import com.glority.android.core.utils.device.CorePersistKey;
import com.glority.base.utils.AbTestUtil;
import com.glority.bean.AbtestLog;
import com.glority.bean.AbtestLogLocalRecord;
import com.glority.bean.ConversionPageBean;
import com.glority.network.exception.NetworkException;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.stability.LogUtils;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: AbtestUtils.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010?\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020\u001aH\u0007J \u0010A\u001a\u00020B2\u0006\u0010@\u001a\u00020\u001a2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0002J\u0018\u0010G\u001a\u00020B2\u0006\u0010@\u001a\u00020\u001a2\u0006\u0010C\u001a\u00020DH\u0002J2\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010J\u001a\u00020D2\u0006\u0010K\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\u00042\u0006\u0010M\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020\u000bH\u0002J\u0010\u0010O\u001a\u00020B2\b\u0010K\u001a\u0004\u0018\u00010\u000bJ\u0018\u0010P\u001a\u0004\u0018\u00010\u000b2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020\u000bJ$\u0010T\u001a\u00020\u00042\u0006\u0010U\u001a\u00020F2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010:H\u0002J\"\u0010V\u001a\u00020\u00042\n\u0010W\u001a\u0006\u0012\u0002\b\u00030X2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u000b0XH\u0002J\u0018\u0010Z\u001a\u00020\u00042\u0006\u0010[\u001a\u00020\u000b2\u0006\u0010\\\u001a\u00020\u000bH\u0002J(\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010:2\u0012\u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010:H\u0002J2\u0010_\u001a\u00020B2\u0006\u0010J\u001a\u00020D2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010:2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020F0XH\u0002J\u0018\u0010a\u001a\u0004\u0018\u00010F2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020F0XH\u0002J\u001a\u0010c\u001a\u00020B2\u0012\u0010d\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020B0eJ0\u0010f\u001a\u0004\u0018\u00010I2\b\u0010K\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010L\u001a\u00020\u00042\b\b\u0002\u0010M\u001a\u00020\u000b2\b\b\u0002\u0010N\u001a\u00020\u000bJ$\u0010g\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b082\u0006\u0010K\u001a\u00020\u000b2\b\b\u0002\u0010L\u001a\u00020&J \u0010h\u001a\u00020i2\u0006\u0010J\u001a\u00020D2\u0006\u0010j\u001a\u00020F2\u0006\u0010k\u001a\u00020IH\u0002J\u0015\u0010l\u001a\u0004\u0018\u00010\u00042\u0006\u0010m\u001a\u00020\u0004¢\u0006\u0002\u0010nJ0\u0010o\u001a\u00020i2\u0006\u0010J\u001a\u00020D2\u0006\u0010j\u001a\u00020F2\u0006\u0010k\u001a\u00020I2\u0006\u0010M\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020\u000bH\u0002J\u0012\u0010p\u001a\u0004\u0018\u00010\u000b2\b\u0010K\u001a\u0004\u0018\u00010\u000bJ!\u0010q\u001a\u0004\u0018\u00010\u00042\b\u0010K\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010L\u001a\u00020&¢\u0006\u0002\u0010rJ\u0018\u0010s\u001a\u0004\u0018\u00010\u000b2\u0006\u0010K\u001a\u00020\u000b2\u0006\u0010t\u001a\u00020\u000bJ\u0018\u0010u\u001a\u00020\u000b2\b\u0010K\u001a\u0004\u0018\u00010\u000b2\u0006\u0010t\u001a\u00020\u000bJR\u0010v\u001a\u00020B2\b\u0010K\u001a\u0004\u0018\u00010\u000b2\u0006\u0010w\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\u00042\u0006\u0010x\u001a\u00020\u00042\b\b\u0002\u0010t\u001a\u00020\u000b2\b\b\u0002\u0010y\u001a\u00020\u000b2\b\b\u0002\u0010M\u001a\u00020\u000b2\b\b\u0002\u0010N\u001a\u00020\u000bH\u0002J\u0017\u0010z\u001a\u0004\u0018\u00010\u00042\u0006\u0010t\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010{J\u0012\u0010|\u001a\u0004\u0018\u00010I2\u0006\u0010}\u001a\u00020FH\u0002J \u0010~\u001a\u00020&2\u0006\u0010}\u001a\u00020F2\u0006\u0010k\u001a\u00020I2\u0006\u0010K\u001a\u00020\u000bH\u0002J;\u0010\u007f\u001a\u00020B2\u0006\u0010x\u001a\u00020\u00042\u0007\u0010\u0080\u0001\u001a\u00020\u000b2\b\u0010K\u001a\u0004\u0018\u00010\u000b2\u0006\u0010w\u001a\u00020\u000b2\u0006\u0010t\u001a\u00020\u000b2\u0006\u0010y\u001a\u00020\u000bH\u0002JL\u0010\u0081\u0001\u001a\u00020B2\u0006\u0010x\u001a\u00020\u00042\u0007\u0010\u0080\u0001\u001a\u00020\u000b2\b\u0010K\u001a\u0004\u0018\u00010\u000b2\u0006\u0010w\u001a\u00020\u000b2\u0006\u0010t\u001a\u00020\u000b2\u0006\u0010y\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020\u000bH\u0002J!\u0010\u0082\u0001\u001a\u00020B2\b\u0010K\u001a\u0004\u0018\u00010\u000b2\u0006\u0010M\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020\u000bJ5\u0010\u0083\u0001\u001a\u00020&2\u0015\u0010\u0084\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010:2\u0013\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010:H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010\u000fR\u001a\u0010.\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\r\"\u0004\b0\u0010\u000fR\u001a\u00101\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\r\"\u0004\b3\u0010\u000fR\u001a\u00104\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\r\"\u0004\b6\u0010\u000fR\u001a\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000108X\u0082\u0004¢\u0006\u0002\n\u0000R(\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010:X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006\u0086\u0001"}, d2 = {"Lcom/glority/abtest/utils/AbtestUtils;", "", "()V", "ABTEST_ACTIVATE", "", "ABTEST_EXIST_TAG_MISMATCH", "ABTEST_FORM_SERVER_CONFIG", "ABTEST_MORE_DATA", "ABTEST_NOT_EXIST", "ABTEST_UNKNOWN_ERROR", "CONVERSION_PAGE", "", "getCONVERSION_PAGE", "()Ljava/lang/String;", "setCONVERSION_PAGE", "(Ljava/lang/String;)V", "INTERVAL", "SEPARATE", "VARIABLE_DEFAULT_FLAG", "abtestLogLocalRecord", "Lcom/glority/bean/AbtestLogLocalRecord;", "getAbtestLogLocalRecord", "()Lcom/glority/bean/AbtestLogLocalRecord;", "setAbtestLogLocalRecord", "(Lcom/glority/bean/AbtestLogLocalRecord;)V", "abtestingDefinitionsMessage", "Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/GetAbtestingDefinitionsMessage;", "getAbtestingDefinitionsMessage", "()Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/GetAbtestingDefinitionsMessage;", "setAbtestingDefinitionsMessage", "(Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/GetAbtestingDefinitionsMessage;)V", "conversionPageBean", "Lcom/glority/bean/ConversionPageBean;", "getConversionPageBean", "()Lcom/glority/bean/ConversionPageBean;", "setConversionPageBean", "(Lcom/glority/bean/ConversionPageBean;)V", "hadGetHttp", "", "getHadGetHttp", "()Z", "setHadGetHttp", "(Z)V", "prefBindSurvey", "getPrefBindSurvey", "setPrefBindSurvey", "prefixConvertPage", "getPrefixConvertPage", "setPrefixConvertPage", "prefixLogin", "getPrefixLogin", "setPrefixLogin", "prefixWebview", "getPrefixWebview", "setPrefixWebview", "recordVariableDataMap", "Ljava/util/HashMap;", "tagsMap", "", "getTagsMap", "()Ljava/util/Map;", "setTagsMap", "(Ljava/util/Map;)V", "abtestingDefinitionsMerge", "abtestingDefinitions", "abtestingRecordMerge", "", "groupLocal", "Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/AbtestingGroup;", "abtestLocal", "Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/Abtesting;", "abtestingRecordMergeABOnGroup", "abtestingVariable", "Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/AbtestingVariable;", "group", "testName", "activateMode", "key", LogEventArguments.ARG_STRING_1, "activateTheEvent", "assetFile2Str", "c", "Landroid/content/Context;", "urlStr", "checkCondition", "abtest", "compareMutableListString", "localTagList", "", "abConfigList", "compareVersionName", "src", "dec", "filterTagForApi", "tags", "findAbtestingByTag", "abtestingsTemp", "findLargestPriority", "abtestings", "getAbtestingDefinitions", "cb", "Lkotlin/Function1;", "getAbtestingVariable", "getAllEngineAbMap", "getBundle", "Landroid/os/Bundle;", "abtestingLargestPriority", "record", "getLoginUiMemo", "pageType", "(I)Ljava/lang/Integer;", "getMoreDataBundle", "getStringVariableByTest", "getVariableByTest", "(Ljava/lang/String;Z)Ljava/lang/Integer;", "getVariableData", "variable", "getVariableTestId", "logEventAndRecordMode", "abtestingId", "mode", "variableDate", "parserVariable", "(Ljava/lang/String;)Ljava/lang/Integer;", "randomVariable", AbtestLogEvent.ABTEST, "recordLocal", "sendEvent", "eventName", "sendEventMoreData", "setAbtestMoreData", "tagsIsCompare", "tagsSrc", "tagsDes", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class AbtestUtils {
    private static final int ABTEST_ACTIVATE = 1;
    private static final int ABTEST_EXIST_TAG_MISMATCH = 3;
    private static final int ABTEST_FORM_SERVER_CONFIG = 1;
    private static final int ABTEST_MORE_DATA = 2;
    private static final int ABTEST_NOT_EXIST = 2;
    private static final int ABTEST_UNKNOWN_ERROR = 4;
    private static final String INTERVAL = "--";
    private static final String SEPARATE = "::";
    private static final String VARIABLE_DEFAULT_FLAG = "__default";
    private static AbtestLogLocalRecord abtestLogLocalRecord;
    private static GetAbtestingDefinitionsMessage abtestingDefinitionsMessage;
    private static boolean hadGetHttp;
    private static Map<String, ? extends Object> tagsMap;
    public static final AbtestUtils INSTANCE = new AbtestUtils();
    private static final HashMap<String, Object> recordVariableDataMap = new HashMap<>();
    private static ConversionPageBean conversionPageBean = new ConversionPageBean(null, null, null, null, null, null, 63, null);
    private static String CONVERSION_PAGE = AbTestUtil.tag_conversion_page;
    private static String prefixConvertPage = "convert";
    private static String prefixWebview = "webview";
    private static String prefixLogin = FirebaseAnalytics.Event.LOGIN;
    private static String prefBindSurvey = "bindSurvey";

    private AbtestUtils() {
    }

    public final GetAbtestingDefinitionsMessage getAbtestingDefinitionsMessage() {
        return abtestingDefinitionsMessage;
    }

    public final void setAbtestingDefinitionsMessage(GetAbtestingDefinitionsMessage getAbtestingDefinitionsMessage) {
        abtestingDefinitionsMessage = getAbtestingDefinitionsMessage;
    }

    public final AbtestLogLocalRecord getAbtestLogLocalRecord() {
        return abtestLogLocalRecord;
    }

    public final void setAbtestLogLocalRecord(AbtestLogLocalRecord abtestLogLocalRecord2) {
        abtestLogLocalRecord = abtestLogLocalRecord2;
    }

    public final boolean getHadGetHttp() {
        return hadGetHttp;
    }

    public final void setHadGetHttp(boolean z) {
        hadGetHttp = z;
    }

    public final ConversionPageBean getConversionPageBean() {
        return conversionPageBean;
    }

    public final void setConversionPageBean(ConversionPageBean conversionPageBean2) {
        Intrinsics.checkNotNullParameter(conversionPageBean2, "<set-?>");
        conversionPageBean = conversionPageBean2;
    }

    public final String getCONVERSION_PAGE() {
        return CONVERSION_PAGE;
    }

    public final void setCONVERSION_PAGE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        CONVERSION_PAGE = str;
    }

    public final String getPrefixConvertPage() {
        return prefixConvertPage;
    }

    public final void setPrefixConvertPage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        prefixConvertPage = str;
    }

    public final String getPrefixWebview() {
        return prefixWebview;
    }

    public final void setPrefixWebview(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        prefixWebview = str;
    }

    public final String getPrefixLogin() {
        return prefixLogin;
    }

    public final void setPrefixLogin(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        prefixLogin = str;
    }

    public final String getPrefBindSurvey() {
        return prefBindSurvey;
    }

    public final void setPrefBindSurvey(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        prefBindSurvey = str;
    }

    public final Map<String, Object> getTagsMap() {
        return tagsMap;
    }

    public final void setTagsMap(Map<String, ? extends Object> map) {
        tagsMap = map;
    }

    public final Integer getLoginUiMemo(int pageType) {
        Integer convertPageId = conversionPageBean.getConvertPageId();
        if (convertPageId == null || pageType != convertPageId.intValue()) {
            return null;
        }
        Integer loginUi = conversionPageBean.getLoginUi();
        return loginUi != null ? loginUi : StringsKt.toIntOrNull(AppContext.INSTANCE.getConfig("LOGIN_UI_DEFAULT_MEMO"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r1 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean tagsIsCompare(java.util.Map<java.lang.String, ? extends java.lang.Object> r1, java.util.Map<java.lang.String, ? extends java.lang.Object> r2) {
        /*
            r0 = this;
            if (r1 == 0) goto L3
            goto L8
        L3:
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L8:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.abtest.utils.AbtestUtils.tagsIsCompare(java.util.Map, java.util.Map):boolean");
    }

    public static /* synthetic */ Integer getVariableByTest$default(AbtestUtils abtestUtils, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return abtestUtils.getVariableByTest(str, z);
    }

    public final synchronized Integer getVariableByTest(String testName, boolean activateMode) {
        if (Intrinsics.areEqual(testName, CONVERSION_PAGE)) {
            Map<String, Object> aBTagMap = AbTestTagManage.INSTANCE.getABTagMap();
            boolean tagsIsCompare = tagsIsCompare(tagsMap, aBTagMap);
            if (!tagsIsCompare) {
                tagsMap = aBTagMap;
            }
            if (tagsIsCompare && (conversionPageBean.getConvertPageId() != null || conversionPageBean.getUrl() != null)) {
                return conversionPageBean.getConvertPageId();
            }
        }
        AbtestingVariable abtestingVariable$default = getAbtestingVariable$default(this, testName, activateMode ? 1 : 0, null, null, 12, null);
        if (abtestingVariable$default == null) {
            return null;
        }
        String variableData = abtestingVariable$default.getVariableData();
        if (variableData != null && testName != null) {
            recordVariableDataMap.put(testName, variableData);
        }
        if (Intrinsics.areEqual(testName, CONVERSION_PAGE)) {
            conversionPageBean.setVariableData(abtestingVariable$default.getVariableData());
            Integer parserVariable = parserVariable(abtestingVariable$default.getVariable());
            if (parserVariable != null) {
                return parserVariable;
            }
        }
        return StringsKt.toIntOrNull(abtestingVariable$default.getVariable());
    }

    public final String getStringVariableByTest(String testName) {
        if (Intrinsics.areEqual(testName, CONVERSION_PAGE) && (conversionPageBean.getConvertPageId() != null || conversionPageBean.getUrl() != null)) {
            return String.valueOf(conversionPageBean.getConvertPageId());
        }
        AbtestingVariable abtestingVariable$default = getAbtestingVariable$default(this, testName, 0, null, null, 14, null);
        if (abtestingVariable$default == null) {
            return null;
        }
        String variableData = abtestingVariable$default.getVariableData();
        if (variableData != null && testName != null) {
            recordVariableDataMap.put(testName, variableData);
        }
        if (Intrinsics.areEqual(testName, CONVERSION_PAGE)) {
            conversionPageBean.setVariableData(abtestingVariable$default.getVariableData());
            Integer parserVariable = parserVariable(abtestingVariable$default.getVariable());
            if (parserVariable != null) {
                return String.valueOf(parserVariable.intValue());
            }
        }
        return abtestingVariable$default.getVariable();
    }

    private final Integer parserVariable(String variable) {
        if (variable == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        List split$default = StringsKt.split$default((CharSequence) StringsKt.trim((CharSequence) variable).toString(), new String[]{"--"}, false, 0, 6, (Object) null);
        if (split$default.size() <= 1) {
            conversionPageBean.setConvertPageId(StringsKt.toIntOrNull(variable));
            return StringsKt.toIntOrNull(variable);
        }
        try {
            Iterator it = split$default.iterator();
            while (it.hasNext()) {
                List split$default2 = StringsKt.split$default((CharSequence) it.next(), new String[]{"::"}, false, 0, 6, (Object) null);
                if (Intrinsics.areEqual((String) split$default2.get(0), prefixConvertPage)) {
                    conversionPageBean.setConvertPageId(StringsKt.toIntOrNull((String) split$default2.get(1)));
                } else if (Intrinsics.areEqual((String) split$default2.get(0), prefixLogin)) {
                    conversionPageBean.setLoginUi(StringsKt.toIntOrNull((String) split$default2.get(1)));
                } else if (Intrinsics.areEqual((String) split$default2.get(0), prefixWebview)) {
                    conversionPageBean.setUrl((String) split$default2.get(1));
                } else if (Intrinsics.areEqual((String) split$default2.get(0), prefBindSurvey)) {
                    conversionPageBean.setBindSurvey(StringsKt.toIntOrNull((String) split$default2.get(1)));
                }
            }
        } catch (Exception e) {
            LogUtils.e("" + e.toString());
        }
        return conversionPageBean.getConvertPageId();
    }

    public final String getVariableData(String testName, String variable) {
        List<AbtestingGroup> abtestingGroups;
        Intrinsics.checkNotNullParameter(testName, "testName");
        Intrinsics.checkNotNullParameter(variable, "variable");
        GetAbtestingDefinitionsMessage getAbtestingDefinitionsMessage = abtestingDefinitionsMessage;
        if (getAbtestingDefinitionsMessage != null && (abtestingGroups = getAbtestingDefinitionsMessage.getAbtestingGroups()) != null) {
            HashMap<String, Object> hashMap = recordVariableDataMap;
            if (hashMap.get(testName) != null) {
                return String.valueOf(hashMap.get(testName));
            }
            for (AbtestingGroup abtestingGroup : abtestingGroups) {
                if (!(!Intrinsics.areEqual(abtestingGroup.getTest(), testName))) {
                    Iterator<Abtesting> it = abtestingGroup.getAbtestings().iterator();
                    while (it.hasNext()) {
                        for (AbtestingVariable abtestingVariable : it.next().getAbtestingVariables()) {
                            if (Intrinsics.areEqual(abtestingVariable.getVariable(), variable)) {
                                return abtestingVariable.getVariableData();
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final String getVariableTestId(String testName, String variable) {
        List<AbtestingGroup> abtestingGroups;
        Intrinsics.checkNotNullParameter(variable, "variable");
        GetAbtestingDefinitionsMessage getAbtestingDefinitionsMessage = abtestingDefinitionsMessage;
        if (getAbtestingDefinitionsMessage != null && (abtestingGroups = getAbtestingDefinitionsMessage.getAbtestingGroups()) != null) {
            if (Intrinsics.areEqual(testName, CONVERSION_PAGE)) {
                String abtestId = conversionPageBean.getAbtestId();
                return abtestId != null ? abtestId : "";
            }
            for (AbtestingGroup abtestingGroup : abtestingGroups) {
                if (!(!Intrinsics.areEqual(abtestingGroup.getTest(), testName))) {
                    if (abtestingGroup.getRecordType() != RecordType.NOT_RECORD && abtestingGroup.getAbtestingId() != null && Intrinsics.areEqual(variable, abtestingGroup.getRecordInGroupVariable())) {
                        String abtestingId = abtestingGroup.getAbtestingId();
                        Intrinsics.checkNotNull(abtestingId);
                        return abtestingId;
                    }
                    for (Abtesting abtesting : abtestingGroup.getAbtestings()) {
                        Iterator<AbtestingVariable> it = abtesting.getAbtestingVariables().iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.areEqual(it.next().getVariable(), variable)) {
                                return abtesting.getAbtestingId();
                            }
                        }
                    }
                }
            }
        }
        return "";
    }

    public final void activateTheEvent(String testName) {
        getAbtestingVariable$default(this, testName, 1, null, null, 12, null);
    }

    public final void setAbtestMoreData(String testName, String key, String r4) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(r4, "string1");
        getAbtestingVariable(testName, 2, key, r4);
    }

    public static /* synthetic */ HashMap getAllEngineAbMap$default(AbtestUtils abtestUtils, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return abtestUtils.getAllEngineAbMap(str, z);
    }

    public final HashMap<String, String> getAllEngineAbMap(String testName, boolean activateMode) {
        List<AbtestingGroup> abtestingGroups;
        Intrinsics.checkNotNullParameter(testName, "testName");
        HashMap<String, String> hashMap = new HashMap<>();
        GetAbtestingDefinitionsMessage getAbtestingDefinitionsMessage = abtestingDefinitionsMessage;
        if (getAbtestingDefinitionsMessage != null && (abtestingGroups = getAbtestingDefinitionsMessage.getAbtestingGroups()) != null) {
            ArrayList<AbtestingGroup> arrayList = new ArrayList();
            for (Object obj : abtestingGroups) {
                if (StringsKt.contains$default((CharSequence) ((AbtestingGroup) obj).getTest(), (CharSequence) testName, false, 2, (Object) null)) {
                    arrayList.add(obj);
                }
            }
            for (AbtestingGroup abtestingGroup : arrayList) {
                AbtestUtils abtestUtils = INSTANCE;
                AbtestingVariable abtestingVariable = abtestUtils.abtestingVariable(abtestingGroup, abtestingGroup.getTest(), activateMode ? 1 : 0, "", "");
                if (abtestingVariable != null) {
                    String test = abtestingGroup.getTest();
                    Locale locale = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
                    if (test == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String upperCase = test.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
                    HashMap<String, String> hashMap2 = hashMap;
                    String variableData = abtestingVariable.getVariableData();
                    if (variableData == null) {
                        variableData = " ";
                    }
                    hashMap2.put(upperCase, variableData);
                    try {
                        String str = StringsKt.replace$default(upperCase, "ABTESTING", "ABNAME", false, 4, (Object) null) + "-BASE64";
                        HashMap<String, String> hashMap3 = hashMap;
                        String variableTestId = abtestUtils.getVariableTestId(abtestingGroup.getTest(), abtestingVariable.getVariable());
                        Charset charset = Charsets.UTF_8;
                        if (variableTestId != null) {
                            byte[] bytes = variableTestId.getBytes(charset);
                            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                            byte[] encode = Base64.encode(bytes, 2);
                            Intrinsics.checkNotNullExpressionValue(encode, "Base64.encode(\n         …                        )");
                            hashMap3.put(str, new String(encode, Charsets.UTF_8));
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            break;
                        }
                    } catch (Exception e) {
                        new SendErrorEventRequest("Abtesting", e.toString()).post();
                    }
                }
            }
        }
        return hashMap;
    }

    private final AbtestingVariable abtestingVariable(AbtestingGroup group, String testName, int activateMode, String key, String r27) {
        AbtestingVariable abtestingVariable;
        int i;
        Map<String, Object> aBTagMap = AbTestTagManage.INSTANCE.getABTagMap();
        ArrayList arrayList = new ArrayList();
        AbtestingVariable abtestingVariable2 = new AbtestingVariable(0, 1, null);
        if (group.getRecordType() == RecordType.RECORD_ON_GROUP && (group.getRecordInGroupVariable() != null || group.getRecordInGroupVariableData() != null)) {
            for (Abtesting abtesting : group.getAbtestings()) {
                for (AbtestingVariable abtestingVariable3 : abtesting.getAbtestingVariables()) {
                    if (Intrinsics.areEqual(group.getRecordInGroupVariable(), abtestingVariable3.getVariable()) && Intrinsics.areEqual(group.getRecordInGroupVariableData(), abtestingVariable3.getVariableData()) && Intrinsics.areEqual(group.getAbtestingId(), abtesting.getAbtestingId())) {
                        String recordInGroupVariable = group.getRecordInGroupVariable();
                        if (recordInGroupVariable == null) {
                            recordInGroupVariable = LikeItem.DISLIKE;
                        }
                        abtestingVariable2.setVariable(recordInGroupVariable);
                        abtestingVariable2.setVariableData(group.getRecordInGroupVariableData());
                        String test = group.getTest();
                        String abtestingId = abtesting.getAbtestingId();
                        String variable = abtestingVariable3.getVariable();
                        String variableData = abtestingVariable3.getVariableData();
                        logEventAndRecordMode(test, abtestingId, activateMode, 1, variable, variableData != null ? variableData : "", key, r27);
                        return abtestingVariable2;
                    }
                }
            }
        }
        findAbtestingByTag(group, aBTagMap, arrayList);
        if (arrayList.isEmpty()) {
            abtestingVariable = null;
            i = 0;
            logEventAndRecordMode$default(this, testName, "", activateMode, 3, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
        } else {
            abtestingVariable = null;
            i = 0;
        }
        Abtesting findLargestPriority = findLargestPriority(arrayList);
        if (findLargestPriority != null) {
            if (Intrinsics.areEqual(testName, CONVERSION_PAGE)) {
                conversionPageBean.setAbtestId(findLargestPriority.getAbtestingId());
            }
            if (findLargestPriority.getStatus() == AbtestingStatus.COMPLETED) {
                try {
                    abtestingVariable2.setVariable(findLargestPriority.getAbtestingVariables().get(i).getVariable());
                    abtestingVariable2.setVariableData(findLargestPriority.getAbtestingVariables().get(i).getVariableData());
                    String test2 = group.getTest();
                    String abtestingId2 = findLargestPriority.getAbtestingId();
                    String variable2 = abtestingVariable2.getVariable();
                    String variableData2 = abtestingVariable2.getVariableData();
                    logEventAndRecordMode$default(this, test2, abtestingId2, activateMode, 1, variable2, variableData2 != null ? variableData2 : "", null, null, PsExtractor.AUDIO_STREAM, null);
                    return abtestingVariable2;
                } catch (Exception e) {
                    new LogEventRequest(ABTesting.ABTESTING_VARIABLE_ALLOCATION, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("name", testName), TuplesKt.to("error", e.toString()), TuplesKt.to("mode", String.valueOf(4)))).post();
                    return abtestingVariable;
                }
            }
            if (group.getRecordType() == RecordType.RECORD_ON_AB && findLargestPriority.getRecordVariable() != null) {
                String recordVariable = findLargestPriority.getRecordVariable();
                if (recordVariable == null) {
                    recordVariable = LikeItem.DISLIKE;
                }
                abtestingVariable2.setVariable(recordVariable);
                abtestingVariable2.setVariableData(findLargestPriority.getRecordVariableData());
                String test3 = group.getTest();
                String abtestingId3 = findLargestPriority.getAbtestingId();
                String variable3 = abtestingVariable2.getVariable();
                String variableData3 = abtestingVariable2.getVariableData();
                logEventAndRecordMode$default(this, test3, abtestingId3, activateMode, 1, variable3, variableData3 != null ? variableData3 : "", null, null, PsExtractor.AUDIO_STREAM, null);
                return abtestingVariable2;
            }
            AbtestingVariable randomVariable = randomVariable(findLargestPriority);
            if (randomVariable != null) {
                if (group.getRecordType() == RecordType.NOT_RECORD) {
                    if ((activateMode & 1) == 1) {
                        new LogEventRequest(ABTesting.ABTESTING_VARIABLE_ALLOCATION, getBundle(group, findLargestPriority, randomVariable)).post();
                    }
                    if ((activateMode & 2) == 2) {
                        new LogEventRequest(ABTesting.ABTESTING_MORE_DATA, getMoreDataBundle(group, findLargestPriority, randomVariable, key, r27)).post();
                    }
                    return randomVariable;
                }
                recordLocal(findLargestPriority, randomVariable, testName);
                String test4 = group.getTest();
                String abtestingId4 = findLargestPriority.getAbtestingId();
                String variable4 = randomVariable.getVariable();
                String variableData4 = randomVariable.getVariableData();
                logEventAndRecordMode$default(this, test4, abtestingId4, activateMode, 1, variable4, variableData4 != null ? variableData4 : "", null, null, PsExtractor.AUDIO_STREAM, null);
                return randomVariable;
            }
        }
        return abtestingVariable;
    }

    public static /* synthetic */ AbtestingVariable getAbtestingVariable$default(AbtestUtils abtestUtils, String str, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        if ((i2 & 8) != 0) {
            str3 = "";
        }
        return abtestUtils.getAbtestingVariable(str, i, str2, str3);
    }

    public final synchronized AbtestingVariable getAbtestingVariable(String testName, int activateMode, String key, String r14) {
        List<AbtestingGroup> abtestingGroups;
        String variable;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(r14, "string1");
        GetAbtestingDefinitionsMessage getAbtestingDefinitionsMessage = abtestingDefinitionsMessage;
        if (getAbtestingDefinitionsMessage == null || (abtestingGroups = getAbtestingDefinitionsMessage.getAbtestingGroups()) == null) {
            return null;
        }
        for (AbtestingGroup abtestingGroup : abtestingGroups) {
            if (!(!Intrinsics.areEqual(testName, abtestingGroup.getTest()))) {
                AbtestingVariable abtestingVariable = abtestingVariable(abtestingGroup, testName, activateMode, key, r14);
                if (abtestingVariable != null && (variable = abtestingVariable.getVariable()) != null && StringsKt.endsWith$default(variable, VARIABLE_DEFAULT_FLAG, false, 2, (Object) null)) {
                    String variable2 = abtestingVariable.getVariable();
                    int length = abtestingVariable.getVariable().length() - 9;
                    if (variable2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String substring = variable2.substring(0, length);
                    Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    abtestingVariable.setVariable(substring);
                }
                return abtestingVariable;
            }
        }
        return null;
    }

    private final Bundle getBundle(AbtestingGroup group, Abtesting abtestingLargestPriority, AbtestingVariable record) {
        Pair[] pairArr = new Pair[5];
        pairArr[0] = TuplesKt.to("group", group.getTest());
        pairArr[1] = TuplesKt.to("name", abtestingLargestPriority.getAbtestingId());
        pairArr[2] = TuplesKt.to("value", record.getVariable());
        String variableData = record.getVariableData();
        if (variableData == null) {
            variableData = "";
        }
        pairArr[3] = TuplesKt.to("content", variableData);
        pairArr[4] = TuplesKt.to("mode", String.valueOf(1));
        return LogEventArgumentsKt.logEventBundleOf(pairArr);
    }

    private final Bundle getMoreDataBundle(AbtestingGroup group, Abtesting abtestingLargestPriority, AbtestingVariable record, String key, String r7) {
        Pair[] pairArr = new Pair[7];
        pairArr[0] = TuplesKt.to("group", group.getTest());
        pairArr[1] = TuplesKt.to("name", abtestingLargestPriority.getAbtestingId());
        pairArr[2] = TuplesKt.to("value", record.getVariable());
        String variableData = record.getVariableData();
        if (variableData == null) {
            variableData = "";
        }
        pairArr[3] = TuplesKt.to("content", variableData);
        pairArr[4] = TuplesKt.to("mode", String.valueOf(1));
        pairArr[5] = TuplesKt.to("key", key);
        pairArr[6] = TuplesKt.to(LogEventArguments.ARG_STRING_1, r7);
        return LogEventArgumentsKt.logEventBundleOf(pairArr);
    }

    static /* synthetic */ void logEventAndRecordMode$default(AbtestUtils abtestUtils, String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, int i3, Object obj) {
        abtestUtils.logEventAndRecordMode(str, str2, i, i2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? "" : str5, (i3 & 128) != 0 ? "" : str6);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:3|4|(2:(1:7)(1:120)|(17:9|10|(1:12)(1:117)|13|14|(5:20|(1:50)(3:22|23|(2:25|(1:46)(7:27|28|(1:32)|33|34|(1:38)|(3:40|41|42)(1:44)))(3:47|48|49))|45|15|16)|52|53|54|(1:109)(3:58|(2:59|(2:61|(2:63|64)(1:106))(2:107|108))|65)|66|(3:(2:69|(1:73))(1:91)|74|(3:76|(3:80|(2:81|(2:83|(2:85|86)(1:88))(1:89))|87)|90))|92|(2:(2:95|(1:99))(1:101)|100)|102|103|104))|121|122|53|54|(1:56)|109|66|(0)|92|(0)|102|103|104) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0175, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0176, code lost:
    
        new com.glority.android.core.route.analysis.SendErrorEventRequest("logEventAndRecordMode", r0.toString()).post();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1 A[Catch: Exception -> 0x0175, all -> 0x0186, TryCatch #3 {Exception -> 0x0175, blocks: (B:54:0x009d, B:56:0x00a1, B:58:0x00a7, B:59:0x00ad, B:61:0x00b3, B:65:0x00c6, B:66:0x00cb, B:69:0x00d1, B:71:0x00d5, B:73:0x00db, B:74:0x00ed, B:76:0x0100, B:78:0x0104, B:80:0x010a, B:81:0x0110, B:83:0x0116, B:87:0x0128, B:91:0x00e4, B:92:0x012b, B:95:0x0130, B:97:0x0134, B:99:0x013a, B:100:0x014b, B:101:0x0143, B:102:0x015f), top: B:53:0x009d, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void logEventAndRecordMode(java.lang.String r16, java.lang.String r17, int r18, int r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.abtest.utils.AbtestUtils.logEventAndRecordMode(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    private final void sendEvent(int mode, String eventName, String testName, String abtestingId, String variable, String variableDate) {
        if (3 == mode) {
            new LogEventRequest(eventName, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("group", testName), TuplesKt.to("mode", String.valueOf(mode)), TuplesKt.to("value", VARIABLE_DEFAULT_FLAG))).post();
        } else {
            new LogEventRequest(eventName, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("group", testName), TuplesKt.to("name", abtestingId), TuplesKt.to("value", variable), TuplesKt.to("content", variableDate), TuplesKt.to("mode", String.valueOf(mode)))).post();
        }
    }

    private final void sendEventMoreData(int mode, String eventName, String testName, String abtestingId, String variable, String variableDate, String key, String r25) {
        if (3 == mode) {
            new LogEventRequest(eventName, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("group", testName), TuplesKt.to("mode", String.valueOf(mode)), TuplesKt.to("value", VARIABLE_DEFAULT_FLAG), TuplesKt.to("key", key), TuplesKt.to(LogEventArguments.ARG_STRING_1, r25))).post();
        } else {
            new LogEventRequest(eventName, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("group", testName), TuplesKt.to("name", abtestingId), TuplesKt.to("value", variable), TuplesKt.to("content", variableDate), TuplesKt.to("mode", String.valueOf(mode)), TuplesKt.to("key", key), TuplesKt.to(LogEventArguments.ARG_STRING_1, r25))).post();
        }
    }

    private final void findAbtestingByTag(AbtestingGroup group, Map<String, ? extends Object> tagsMap2, List<Abtesting> abtestingsTemp) {
        for (Abtesting abtesting : group.getAbtestings()) {
            if (checkCondition(abtesting, tagsMap2) == abtesting.getAbtestingConditions().size()) {
                abtestingsTemp.add(abtesting);
            }
        }
    }

    private final int checkCondition(Abtesting abtest, Map<String, ? extends Object> tagsMap2) {
        int i = 0;
        for (AbtestingCondition abtestingCondition : abtest.getAbtestingConditions()) {
            if (abtestingCondition.getOp() == ConditionOperator.EQUAL) {
                if (!Intrinsics.areEqual(tagsMap2.get(abtestingCondition.getTagAbtest()), (String) CollectionsKt.first((List) abtestingCondition.getValues()))) {
                    return i;
                }
            } else {
                if (abtestingCondition.getOp() == ConditionOperator.IN) {
                    Iterator<String> it = abtestingCondition.getValues().iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(tagsMap2.get(abtestingCondition.getTagAbtest()), it.next())) {
                        }
                    }
                    return i;
                }
                if (abtestingCondition.getOp() == ConditionOperator.RANGE) {
                    String valueOf = String.valueOf(tagsMap2.get(abtestingCondition.getTagAbtest()));
                    try {
                        if (compareVersionName(valueOf, abtestingCondition.getValues().get(0)) >= 0 && compareVersionName(valueOf, abtestingCondition.getValues().get(1)) == -1) {
                        }
                    } catch (Exception unused) {
                        return i;
                    }
                } else if (abtestingCondition.getOp() == ConditionOperator.NOT_EQUAL) {
                    if (Intrinsics.areEqual(String.valueOf(tagsMap2.get(abtestingCondition.getTagAbtest())), (String) CollectionsKt.first((List) abtestingCondition.getValues()))) {
                        return i;
                    }
                } else if (abtestingCondition.getOp() == ConditionOperator.GREATER_THAN) {
                    if (compareVersionName(String.valueOf(tagsMap2.get(abtestingCondition.getTagAbtest())), (String) CollectionsKt.first((List) abtestingCondition.getValues())) <= 0) {
                        return i;
                    }
                } else if (abtestingCondition.getOp() == ConditionOperator.GREATER_EQUAL) {
                    if (compareVersionName(String.valueOf(tagsMap2.get(abtestingCondition.getTagAbtest())), (String) CollectionsKt.first((List) abtestingCondition.getValues())) < 0) {
                        return i;
                    }
                } else if (abtestingCondition.getOp() == ConditionOperator.LESS_THAN) {
                    if (compareVersionName(String.valueOf(tagsMap2.get(abtestingCondition.getTagAbtest())), (String) CollectionsKt.first((List) abtestingCondition.getValues())) >= 0) {
                        return i;
                    }
                } else if (abtestingCondition.getOp() == ConditionOperator.LESS_EQUAL) {
                    if (compareVersionName(String.valueOf(tagsMap2.get(abtestingCondition.getTagAbtest())), (String) CollectionsKt.first((List) abtestingCondition.getValues())) > 0) {
                        return i;
                    }
                } else if (abtestingCondition.getOp() == ConditionOperator.INCLUDE_ANY) {
                    Object obj = tagsMap2.get(abtestingCondition.getTagAbtest());
                    if (!TypeIntrinsics.isMutableList(obj)) {
                        if (!(obj instanceof String) || !abtestingCondition.getValues().contains(obj)) {
                            return i;
                        }
                        return i + 1;
                    }
                    if (compareMutableListString((List) obj, abtestingCondition.getValues()) >= 1) {
                    }
                } else if (abtestingCondition.getOp() == ConditionOperator.INCLUDE_ALL) {
                    Object obj2 = tagsMap2.get(abtestingCondition.getTagAbtest());
                    if (!TypeIntrinsics.isMutableList(obj2)) {
                        if (!(obj2 instanceof String) || abtestingCondition.getValues().size() != 1 || !Intrinsics.areEqual((String) CollectionsKt.first((List) abtestingCondition.getValues()), obj2)) {
                            return i;
                        }
                        return i + 1;
                    }
                    if (((Collection) obj2).containsAll(abtestingCondition.getValues())) {
                    }
                } else if (abtestingCondition.getOp() == ConditionOperator.NOT_INCLUDE_ANY) {
                    Object obj3 = tagsMap2.get(abtestingCondition.getTagAbtest());
                    if (!TypeIntrinsics.isMutableList(obj3)) {
                        if (CollectionsKt.contains(abtestingCondition.getValues(), obj3)) {
                            return i;
                        }
                        return i + 1;
                    }
                    if (compareMutableListString((List) obj3, abtestingCondition.getValues()) < 1) {
                    }
                } else {
                    if (abtestingCondition.getOp() != ConditionOperator.NOT_INCLUDE_ALL) {
                        return i;
                    }
                    Object obj4 = tagsMap2.get(abtestingCondition.getTagAbtest());
                    if (!TypeIntrinsics.isMutableList(obj4)) {
                        if (abtestingCondition.getValues().size() == 1 && Intrinsics.areEqual((String) CollectionsKt.first((List) abtestingCondition.getValues()), obj4)) {
                            return i;
                        }
                        return i + 1;
                    }
                    if (!((Collection) obj4).containsAll(abtestingCondition.getValues())) {
                    }
                }
            }
            i++;
        }
        return i;
    }

    private final int compareMutableListString(List<?> localTagList, List<String> abConfigList) {
        Iterator<T> it = abConfigList.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (CollectionsKt.contains(localTagList, (String) it.next())) {
                i++;
            }
        }
        return i;
    }

    private final Abtesting findLargestPriority(List<Abtesting> abtestings) {
        Abtesting abtesting = null;
        int i = -1;
        for (Abtesting abtesting2 : abtestings) {
            if (abtesting2.getPriority() > i) {
                i = abtesting2.getPriority();
                abtesting = abtesting2;
            }
        }
        return abtesting;
    }

    private final boolean recordLocal(Abtesting r10, AbtestingVariable record, String testName) {
        GetAbtestingDefinitionsMessage getAbtestingDefinitionsMessage = abtestingDefinitionsMessage;
        if (getAbtestingDefinitionsMessage == null) {
            return false;
        }
        Intrinsics.checkNotNull(getAbtestingDefinitionsMessage);
        for (AbtestingGroup abtestingGroup : getAbtestingDefinitionsMessage.getAbtestingGroups()) {
            for (Abtesting abtesting : abtestingGroup.getAbtestings()) {
                if (abtestingGroup.getRecordType() != RecordType.NOT_RECORD || abtesting.getRecordVariable() != null) {
                    if (abtestingGroup.getRecordType() == RecordType.RECORD_ON_GROUP) {
                        if (Intrinsics.areEqual(abtestingGroup.getTest(), testName)) {
                            abtestingGroup.setRecordInGroupVariable(record.getVariable());
                            String recordInGroupVariable = abtestingGroup.getRecordInGroupVariable();
                            if (recordInGroupVariable != null && StringsKt.endsWith$default(recordInGroupVariable, VARIABLE_DEFAULT_FLAG, false, 2, (Object) null)) {
                                String recordInGroupVariable2 = abtestingGroup.getRecordInGroupVariable();
                                Intrinsics.checkNotNull(recordInGroupVariable2);
                                String recordInGroupVariable3 = abtestingGroup.getRecordInGroupVariable();
                                Intrinsics.checkNotNull(recordInGroupVariable3);
                                int length = recordInGroupVariable3.length() - 9;
                                if (recordInGroupVariable2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                }
                                String substring = recordInGroupVariable2.substring(0, length);
                                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                abtestingGroup.setRecordInGroupVariable(substring);
                            }
                            abtestingGroup.setRecordInGroupVariableData(record.getVariableData());
                            abtestingGroup.setAbtestingId(r10.getAbtestingId());
                            new PersistDataWriteRequest(CorePersistKey.ABTESTING_DEFINITIONS, new Gson().toJson(abtestingDefinitionsMessage)).post();
                            return true;
                        }
                    } else if (Intrinsics.areEqual(abtesting.getAbtestingId(), r10.getAbtestingId())) {
                        abtesting.setRecordVariable(record.getVariable());
                        abtesting.setRecordVariableData(record.getVariableData());
                        new PersistDataWriteRequest(CorePersistKey.ABTESTING_DEFINITIONS, new Gson().toJson(abtestingDefinitionsMessage)).post();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final AbtestingVariable randomVariable(Abtesting r7) {
        int random = (int) (1 + (Math.random() * 2147483646));
        Iterator<AbtestingVariable> it = r7.getAbtestingVariables().iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            i2 += it.next().getWeight();
        }
        if (i2 == 0) {
            return null;
        }
        int i3 = random % i2;
        for (AbtestingVariable abtestingVariable : r7.getAbtestingVariables()) {
            if (abtestingVariable.getWeight() != 0) {
                i += abtestingVariable.getWeight();
                if (i3 - i < 0) {
                    return abtestingVariable;
                }
            }
        }
        return null;
    }

    @JvmStatic
    public static final synchronized GetAbtestingDefinitionsMessage abtestingDefinitionsMerge(GetAbtestingDefinitionsMessage abtestingDefinitions) {
        GetAbtestingDefinitionsMessage getAbtestingDefinitionsMessage;
        synchronized (AbtestUtils.class) {
            Intrinsics.checkNotNullParameter(abtestingDefinitions, "abtestingDefinitions");
            try {
                getAbtestingDefinitionsMessage = (GetAbtestingDefinitionsMessage) new Gson().fromJson(new PersistDataReadRequest(CorePersistKey.ABTESTING_DEFINITIONS).toResult(), GetAbtestingDefinitionsMessage.class);
            } catch (Exception unused) {
                getAbtestingDefinitionsMessage = null;
            }
            if ((getAbtestingDefinitionsMessage != null ? getAbtestingDefinitionsMessage.getAbtestingGroups() : null) == null) {
                return abtestingDefinitions;
            }
            for (AbtestingGroup abtestingGroup : getAbtestingDefinitionsMessage.getAbtestingGroups()) {
                for (Abtesting abtesting : abtestingGroup.getAbtestings()) {
                    if (abtesting.getRecordVariable() != null || abtesting.getRecordVariableData() != null) {
                        INSTANCE.abtestingRecordMerge(abtestingDefinitions, abtestingGroup, abtesting);
                    }
                }
                if (abtestingGroup.getRecordType() == RecordType.RECORD_ON_GROUP) {
                    INSTANCE.abtestingRecordMergeABOnGroup(abtestingDefinitions, abtestingGroup);
                }
            }
            return abtestingDefinitions;
        }
    }

    private final void abtestingRecordMergeABOnGroup(GetAbtestingDefinitionsMessage abtestingDefinitions, AbtestingGroup groupLocal) {
        List<AbtestLog> abtestLogArray;
        Object obj;
        for (AbtestingGroup abtestingGroup : abtestingDefinitions.getAbtestingGroups()) {
            if (groupLocal.getRecordType() != RecordType.RECORD_ON_GROUP || groupLocal.getRecordInGroupVariable() == null) {
                return;
            }
            if (Intrinsics.areEqual(abtestingGroup.getTest(), groupLocal.getTest())) {
                if (abtestingGroup.getRecordType() == RecordType.RECORD_ON_GROUP) {
                    abtestingGroup.setRecordInGroupVariable(groupLocal.getRecordInGroupVariable());
                    abtestingGroup.setRecordInGroupVariableData(groupLocal.getRecordInGroupVariableData());
                    abtestingGroup.setAbtestingId(groupLocal.getAbtestingId());
                    return;
                }
                try {
                    AbtestLogLocalRecord abtestLogLocalRecord2 = abtestLogLocalRecord;
                    if (abtestLogLocalRecord2 == null || (abtestLogArray = abtestLogLocalRecord2.getAbtestLogArray()) == null) {
                        return;
                    }
                    Iterator<T> it = abtestLogArray.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        AbtestLog abtestLog = (AbtestLog) obj;
                        if (Intrinsics.areEqual(abtestLog.getAbtestingId(), groupLocal.getAbtestingId()) && Intrinsics.areEqual(abtestLog.getGroup(), groupLocal.getTest())) {
                            break;
                        }
                    }
                    AbtestLog abtestLog2 = (AbtestLog) obj;
                    if (abtestLog2 != null) {
                        abtestLogArray.remove(abtestLog2);
                        new PersistDataWriteRequest(ABTesting.ABTESTING_LOG_EVENT_LOCAL, new Gson().toJson(abtestLogLocalRecord)).post();
                    }
                } catch (Exception e) {
                    new SendErrorEventRequest("Abtesting", e.toString()).post();
                }
            }
        }
    }

    private final void abtestingRecordMerge(GetAbtestingDefinitionsMessage abtestingDefinitions, AbtestingGroup groupLocal, Abtesting abtestLocal) {
        List<AbtestLog> abtestLogArray;
        Object obj;
        for (AbtestingGroup abtestingGroup : abtestingDefinitions.getAbtestingGroups()) {
            if (!(!Intrinsics.areEqual(abtestingGroup.getTest(), groupLocal.getTest()))) {
                if (abtestingGroup.getRecordType() == RecordType.RECORD_ON_GROUP) {
                    abtestingGroup.setAbtestingId(abtestLocal.getAbtestingId());
                    abtestingGroup.setRecordInGroupVariable(abtestLocal.getRecordVariable());
                    abtestingGroup.setRecordInGroupVariableData(abtestLocal.getRecordVariableData());
                    return;
                } else {
                    for (Abtesting abtesting : abtestingGroup.getAbtestings()) {
                        if (Intrinsics.areEqual(abtestLocal.getAbtestingId(), abtesting.getAbtestingId())) {
                            abtesting.setRecordVariable(abtestLocal.getRecordVariable());
                            abtesting.setRecordVariableData(abtestLocal.getRecordVariableData());
                            return;
                        }
                    }
                }
            }
        }
        try {
            AbtestLogLocalRecord abtestLogLocalRecord2 = abtestLogLocalRecord;
            if (abtestLogLocalRecord2 == null || (abtestLogArray = abtestLogLocalRecord2.getAbtestLogArray()) == null) {
                return;
            }
            Iterator<T> it = abtestLogArray.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                AbtestLog abtestLog = (AbtestLog) obj;
                if (Intrinsics.areEqual(abtestLog.getAbtestingId(), abtestLocal.getAbtestingId()) && Intrinsics.areEqual(abtestLog.getGroup(), groupLocal.getTest())) {
                    break;
                }
            }
            AbtestLog abtestLog2 = (AbtestLog) obj;
            if (abtestLog2 != null) {
                abtestLogArray.remove(abtestLog2);
                new PersistDataWriteRequest(ABTesting.ABTESTING_LOG_EVENT_LOCAL, new Gson().toJson(abtestLogLocalRecord)).post();
            }
        } catch (Exception e) {
            new SendErrorEventRequest("Abtesting", e.toString()).post();
        }
    }

    public final void getAbtestingDefinitions(Function1<? super Boolean, Unit> cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        Resource<GetAbtestingDefinitionsMessage> abtestingDefinitions = AbtestRepository.INSTANCE.getAbtestingDefinitions(filterTagForApi(AbTestTagManage.INSTANCE.getABTagMap()));
        if (abtestingDefinitions.getStatus() == Status.SUCCESS) {
            try {
                GetAbtestingDefinitionsMessage data = abtestingDefinitions.getData();
                abtestingDefinitionsMessage = data != null ? abtestingDefinitionsMerge(data) : null;
                new PersistDataWriteRequest(CorePersistKey.ABTESTING_DEFINITIONS, new Gson().toJson(abtestingDefinitionsMessage)).post();
                hadGetHttp = true;
                cb.invoke(true);
                return;
            } catch (Exception e) {
                LogUtils.e(" update getAbtestingVariables eer = " + e);
                new LogEventRequest(AbtestLogEvent.ABTEST_EXCEPTION, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("error", e))).post();
                cb.invoke(false);
                return;
            }
        }
        LogUtils.e("getAbtestingVariables eer");
        Pair[] pairArr = new Pair[1];
        NetworkException exception = abtestingDefinitions.getException();
        pairArr[0] = TuplesKt.to("code", exception != null ? Integer.valueOf(exception.getCode()) : null);
        new LogEventRequest("http_request", LogEventArgumentsKt.logEventBundleOf(pairArr)).post();
        cb.invoke(false);
    }

    private final Map<String, Object> filterTagForApi(Map<String, ? extends Object> tags) {
        HashMap hashMap = new HashMap();
        String[] strArr = {"app_version", "init_app_version", "device_type"};
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            Object obj = tags.get(str);
            if (obj != null) {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String assetFile2Str(android.content.Context r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "AbtestUtils"
            java.lang.String r1 = "c"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            java.lang.String r1 = "urlStr"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            r1 = 0
            r2 = r1
            java.io.InputStream r2 = (java.io.InputStream) r2
            android.content.res.AssetManager r8 = r8.getAssets()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            java.io.InputStream r8 = r8.open(r9)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L61
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7e
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7e
            r2.<init>(r8)     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7e
            java.io.Reader r2 = (java.io.Reader) r2     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7e
            r9.<init>(r2)     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7e
            r2.<init>()     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7e
        L29:
            java.lang.String r3 = r9.readLine()     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7e
            if (r3 == 0) goto L42
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7e
            java.lang.String r5 = "^\\s*\\/\\/.*"
            kotlin.text.Regex r6 = new kotlin.text.Regex     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7e
            r6.<init>(r5)     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7e
            boolean r4 = r6.matches(r4)     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7e
            if (r4 != 0) goto L42
            r2.append(r3)     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7e
        L42:
            if (r3 != 0) goto L29
            r9.close()     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7e
            r8.close()     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7e
            java.lang.String r9 = r2.toString()     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7e
            if (r8 == 0) goto L5c
            r8.close()     // Catch: java.io.IOException -> L54
            goto L5c
        L54:
            r8 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r0}
            com.glority.utils.stability.LogUtils.e(r8)
        L5c:
            return r9
        L5d:
            r9 = move-exception
            goto L63
        L5f:
            r9 = move-exception
            goto L80
        L61:
            r9 = move-exception
            r8 = r1
        L63:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L7e
            r3 = 0
            r2[r3] = r9     // Catch: java.lang.Throwable -> L7e
            r9 = 1
            r2[r9] = r0     // Catch: java.lang.Throwable -> L7e
            com.glority.utils.stability.LogUtils.e(r2)     // Catch: java.lang.Throwable -> L7e
            if (r8 == 0) goto L7d
            r8.close()     // Catch: java.io.IOException -> L75
            goto L7d
        L75:
            r8 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r0}
            com.glority.utils.stability.LogUtils.e(r8)
        L7d:
            return r1
        L7e:
            r9 = move-exception
            r1 = r8
        L80:
            if (r1 == 0) goto L8e
            r1.close()     // Catch: java.io.IOException -> L86
            goto L8e
        L86:
            r8 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r0}
            com.glority.utils.stability.LogUtils.e(r8)
        L8e:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.abtest.utils.AbtestUtils.assetFile2Str(android.content.Context, java.lang.String):java.lang.String");
    }

    private final int compareVersionName(String src, String dec) {
        int parseInt;
        if (src == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        String obj = StringsKt.trim((CharSequence) src).toString();
        if (dec != null) {
            String obj2 = StringsKt.trim((CharSequence) dec).toString();
            try {
                List split$default = StringsKt.split$default((CharSequence) obj, new String[]{InstructionFileId.DOT}, false, 0, 6, (Object) null);
                List split$default2 = StringsKt.split$default((CharSequence) obj2, new String[]{InstructionFileId.DOT}, false, 0, 6, (Object) null);
                int size = split$default.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int parseInt2 = Integer.parseInt((String) split$default.get(i2));
                    if (i2 >= split$default2.size() || parseInt2 > (parseInt = Integer.parseInt((String) split$default2.get(i2)))) {
                        return 1;
                    }
                    if (parseInt2 < parseInt) {
                        return -1;
                    }
                    i++;
                }
                return i < split$default2.size() ? -1 : 0;
            } catch (Exception e) {
                new SendErrorEventRequest("compareVersionName", e.toString()).post();
                return -1;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
    }
}
