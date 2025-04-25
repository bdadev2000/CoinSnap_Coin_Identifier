package com.glority.base.manager;

import android.content.SharedPreferences;
import androidx.core.os.BundleKt;
import com.glority.abtest.utils.AbtestUtils;
import com.glority.abtesting.generatedAPI.kotlinAPI.config.AbtestingVariable;
import com.glority.android.app.BuildConfig;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.utils.stability.LogUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: AppInstallQueryManager.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132+\b\u0002\u0010\u0014\u001a%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016H\u0002J\u0010\u0010\u0010\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0005H\u0002J$\u0010\u001c\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016H\u0002J$\u0010\u001e\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016H\u0002J$\u0010\u001f\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/glority/base/manager/AppInstallQueryManager;", "", "<init>", "()V", "first_queryinstallstate_click", "", "new_appinstall_click", "new_appuninstall_click", "sp_key_installedList", "sp_key_uninstalledList", "abKeyList", "", "getAbKeyList", "()Ljava/util/List;", "defaultAppList", "", "queryAppIsInstalled", "", "needReportLog", "", "onResult", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "installedList", "queryRemoteNameList", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "cacheFirstInstallState", "uninstalledList", "cacheInstallData", "diffReport", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class AppInstallQueryManager {
    public static final AppInstallQueryManager INSTANCE = new AppInstallQueryManager();
    private static final String first_queryinstallstate_click = "first_queryinstallstate_click";
    private static final String new_appinstall_click = "new_appinstall_click";
    private static final String new_appuninstall_click = "new_appuninstall_click";
    private static final String sp_key_installedList = "installedList";
    private static final String sp_key_uninstalledList = "uninstalledList";
    private static final List<String> abKeyList = CollectionsKt.listOf((Object[]) new String[]{"appconfig_install_query_outer", "appconfig_install_query_outer1", "appconfig_install_query_outer2", "appconfig_install_query_inner"});
    private static final List<String> defaultAppList = CollectionsKt.mutableListOf("com.picturerock.rock", "com.glority.pictureinsect", "com.glority.picturemushroom", "com.glority.picturefish", "cn.danatech.xingseus", "com.plantparentai.app", "com.banknote.ai", BuildConfig.APPLICATION_ID, "com.glority.picturebird");
    public static final int $stable = 8;

    private AppInstallQueryManager() {
    }

    public final List<String> getAbKeyList() {
        return abKeyList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void queryAppIsInstalled$default(AppInstallQueryManager appInstallQueryManager, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        appInstallQueryManager.queryAppIsInstalled(z, function1);
    }

    public final void queryAppIsInstalled(boolean needReportLog, Function1<? super Set<String>, Unit> onResult) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AppInstallQueryManager$queryAppIsInstalled$1(needReportLog, onResult, null), 3, null);
    }

    public final Set<String> queryRemoteNameList() {
        String str;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = abKeyList.iterator();
        while (it.hasNext()) {
            AbtestingVariable abtestingVariable$default = AbtestUtils.getAbtestingVariable$default(AbtestUtils.INSTANCE, (String) it.next(), 0, null, null, 14, null);
            if (abtestingVariable$default == null || (str = abtestingVariable$default.getVariableData()) == null) {
                str = "";
            }
            linkedHashSet.addAll(StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null));
        }
        linkedHashSet.addAll(defaultAppList);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.toSet(arrayList);
    }

    public final boolean queryAppIsInstalled(String r3) {
        try {
            return AppContext.INSTANCE.peekContext().getPackageManager().getPackageInfo(r3, 0) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void cacheFirstInstallState(Set<String> installedList, Set<String> uninstalledList) {
        SharedPreferences sharedPreferences = AppContext.INSTANCE.peekContext().getSharedPreferences("app_install_query", 0);
        Set<String> stringSet = sharedPreferences.getStringSet(sp_key_installedList, new LinkedHashSet());
        Intrinsics.checkNotNull(stringSet);
        Set<String> stringSet2 = sharedPreferences.getStringSet(sp_key_uninstalledList, new LinkedHashSet());
        Intrinsics.checkNotNull(stringSet2);
        Set plus = SetsKt.plus((Set) stringSet, (Iterable) stringSet2);
        Set minus = SetsKt.minus((Set) installedList, (Iterable) plus);
        Set minus2 = SetsKt.minus((Set) uninstalledList, (Iterable) plus);
        cacheInstallData(SetsKt.plus((Set) stringSet, (Iterable) minus), SetsKt.plus((Set) stringSet2, (Iterable) minus2));
        LogUtils.d("AppInstallQueryManager", "cacheFirstInstallState: uncontainsInstalled:" + CollectionsKt.joinToString$default(minus, ",", null, null, 0, null, null, 62, null));
        Iterator it = minus.iterator();
        while (it.hasNext()) {
            new LogEventRequest(first_queryinstallstate_click, BundleKt.bundleOf(TuplesKt.to("name", (String) it.next()), TuplesKt.to("status", "installed"))).post();
        }
        LogUtils.d("AppInstallQueryManager", "cacheFirstInstallState: uncontainsUninstalled:" + CollectionsKt.joinToString$default(minus2, ",", null, null, 0, null, null, 62, null));
        Iterator it2 = minus2.iterator();
        while (it2.hasNext()) {
            new LogEventRequest(first_queryinstallstate_click, BundleKt.bundleOf(TuplesKt.to("name", (String) it2.next()), TuplesKt.to("status", "uninstalled"))).post();
        }
    }

    private final void cacheInstallData(Set<String> installedList, Set<String> uninstalledList) {
        SharedPreferences.Editor edit = AppContext.INSTANCE.peekContext().getSharedPreferences("app_install_query", 0).edit();
        edit.putStringSet(sp_key_installedList, installedList);
        edit.putStringSet(sp_key_uninstalledList, uninstalledList);
        edit.commit();
    }

    public final void diffReport(Set<String> installedList, Set<String> uninstalledList) {
        SharedPreferences sharedPreferences = AppContext.INSTANCE.peekContext().getSharedPreferences("app_install_query", 0);
        Set<String> stringSet = sharedPreferences.getStringSet(sp_key_installedList, new LinkedHashSet());
        Intrinsics.checkNotNull(stringSet);
        Set<String> stringSet2 = sharedPreferences.getStringSet(sp_key_uninstalledList, new LinkedHashSet());
        Intrinsics.checkNotNull(stringSet2);
        Set minus = SetsKt.minus((Set) installedList, (Iterable) CollectionsKt.toSet(stringSet));
        Set minus2 = SetsKt.minus((Set) uninstalledList, (Iterable) CollectionsKt.toSet(stringSet2));
        Set set = minus;
        LogUtils.d("AppInstallQueryManager", "diffReport: newInstallSet:" + CollectionsKt.joinToString$default(set, ",", null, null, 0, null, null, 62, null));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            new LogEventRequest(new_appinstall_click, BundleKt.bundleOf(TuplesKt.to("name", (String) it.next()))).post();
        }
        Set set2 = minus2;
        LogUtils.d("AppInstallQueryManager", "diffReport: newUninstallSet:" + CollectionsKt.joinToString$default(set2, ",", null, null, 0, null, null, 62, null));
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            new LogEventRequest(new_appuninstall_click, BundleKt.bundleOf(TuplesKt.to("name", (String) it2.next()))).post();
        }
        cacheInstallData(installedList, uninstalledList);
    }
}
