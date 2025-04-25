package com.glority.android.core.utils.page;

import android.app.Activity;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.EnvironmentCompat;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.analysis.SendErrorEventRequest;
import com.glority.android.xx.constants.Args;
import com.glority.utils.stability.LogUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AnalysisManage.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0004J\u0016\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0004J\u0016\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0004J\u001e\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0004J\u0006\u0010\"\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R>\u0010\u000e\u001a&\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u0010 \u0011*\u0012\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u0010\u0018\u00010\u00120\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/glority/android/core/utils/page/AnalysisManage;", "", "()V", "DEFAULT_FROM", "", "FORM_LIST_MAX", "", "INTERVAL", "PREVIEW_LEFT", "PREVIEW_MAX", "currentActivityName", "currentAnyName", "isBack", "", "preViewNameList", "", "Lcom/glority/android/core/utils/page/PageBean;", "kotlin.jvm.PlatformType", "", "getPreViewNameList", "()Ljava/util/List;", "setPreViewNameList", "(Ljava/util/List;)V", "getLastSpit", Args.pageName, "pageClose", "", "pageType", "Lcom/glority/android/core/utils/page/PAGETYPE;", "pageHide", "pageOpen", "pagetype", "pageShow", "objectId", "preview", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class AnalysisManage {
    private static final String DEFAULT_FROM = "splash";
    private static final int FORM_LIST_MAX = 6;
    private static final int INTERVAL = 200;
    private static final int PREVIEW_LEFT = 10;
    private static final int PREVIEW_MAX = 50;
    private static boolean isBack;
    public static final AnalysisManage INSTANCE = new AnalysisManage();
    private static String currentActivityName = "";
    private static String currentAnyName = "";
    private static List<PageBean> preViewNameList = Collections.synchronizedList(new ArrayList());

    public final void pageClose(PAGETYPE pageType, String pageName) {
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
    }

    private AnalysisManage() {
    }

    public final List<PageBean> getPreViewNameList() {
        return preViewNameList;
    }

    public final void setPreViewNameList(List<PageBean> list) {
        preViewNameList = list;
    }

    public final void pageOpen(PAGETYPE pagetype, String pageName) {
        Intrinsics.checkNotNullParameter(pagetype, "pagetype");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        if (pagetype == PAGETYPE.ACTIVITY) {
            if (pageName.length() == 0) {
                try {
                    AnalysisManage analysisManage = INSTANCE;
                    String localClassName = ((Activity) AppContext.INSTANCE.peekContext()).getLocalClassName();
                    Intrinsics.checkNotNullExpressionValue(localClassName, "AppContext.peekContext()… Activity).localClassName");
                    currentActivityName = analysisManage.getLastSpit(localClassName);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e) {
                    if (AppContext.INSTANCE.isDebugMode()) {
                        LogUtils.e(Log.getStackTraceString(e));
                    }
                }
            } else {
                currentActivityName = pageName;
            }
            isBack = false;
        }
        currentAnyName = pageName;
    }

    public final void pageShow(String objectId, PAGETYPE pageType, String pageName) {
        int size;
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        if (preViewNameList.size() > 50 && preViewNameList.size() - 10 > 0) {
            int i = 0;
            do {
                i++;
                try {
                    preViewNameList.remove(0);
                } catch (Exception e) {
                    LogUtils.e(e.toString());
                }
            } while (i < size);
        }
        if (pageName.length() == 0) {
            try {
                AnalysisManage analysisManage = INSTANCE;
                String localClassName = ((Activity) AppContext.INSTANCE.peekContext()).getLocalClassName();
                Intrinsics.checkNotNullExpressionValue(localClassName, "AppContext.peekContext()… Activity).localClassName");
                pageName = analysisManage.getLastSpit(localClassName);
                Unit unit = Unit.INSTANCE;
            } catch (Exception e2) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e2));
                }
            }
        }
        String str = pageName;
        if (preViewNameList.size() == 0) {
            preViewNameList.add(new PageBean(objectId, pageType, str, System.currentTimeMillis()));
            return;
        }
        List<PageBean> preViewNameList2 = preViewNameList;
        Intrinsics.checkNotNullExpressionValue(preViewNameList2, "preViewNameList");
        if (Intrinsics.areEqual(objectId, ((PageBean) CollectionsKt.last((List) preViewNameList2)).getObjectId())) {
            return;
        }
        preViewNameList.add(new PageBean(objectId, pageType, str, System.currentTimeMillis()));
    }

    public final void pageHide(PAGETYPE pageType, String pageName) {
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        if (pageType == PAGETYPE.ACTIVITY) {
            isBack = true;
        }
    }

    private final String getLastSpit(String pageName) {
        List split$default = StringsKt.split$default((CharSequence) pageName, new String[]{InstructionFileId.DOT}, false, 0, 6, (Object) null);
        if (!split$default.isEmpty()) {
            return (String) split$default.get(split$default.size() - 1);
        }
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    public final String preview() {
        PageBean pageBean;
        int size = preViewNameList.size();
        ArrayList arrayList = new ArrayList();
        if (size < 1) {
            arrayList.add("splash");
            String arrayList2 = arrayList.toString();
            Intrinsics.checkNotNullExpressionValue(arrayList2, "list.toString()");
            String arrayList3 = arrayList.toString();
            Intrinsics.checkNotNullExpressionValue(arrayList3, "list.toString()");
            String substring = arrayList2.substring(1, StringsKt.getLastIndex(arrayList3) - 1);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        List<PageBean> preViewNameList2 = preViewNameList;
        Intrinsics.checkNotNullExpressionValue(preViewNameList2, "preViewNameList");
        synchronized (preViewNameList2) {
            List<PageBean> preViewNameList3 = INSTANCE.getPreViewNameList();
            Intrinsics.checkNotNullExpressionValue(preViewNameList3, "preViewNameList");
            pageBean = (PageBean) CollectionsKt.lastOrNull((List) preViewNameList3);
        }
        if (pageBean == null) {
            return "splash";
        }
        int i = size - 1;
        if (i >= 0) {
            while (true) {
                int i2 = i - 1;
                try {
                    if (pageBean.getCreteTime() - preViewNameList.get(i).getCreteTime() >= 200) {
                        arrayList.add(preViewNameList.get(i).getPageName());
                        PageBean pageBean2 = preViewNameList.get(i);
                        Intrinsics.checkNotNullExpressionValue(pageBean2, "preViewNameList[i]");
                        pageBean = pageBean2;
                        if (arrayList.size() > 6) {
                            break;
                        }
                    }
                    if (i == 0) {
                        break;
                    }
                    i = i2;
                } catch (Exception e) {
                    new SendErrorEventRequest("AnalysisManage::preview", e.toString()).post();
                }
            }
        }
        if (arrayList.size() < 1) {
            arrayList.add("splash");
        }
        if (arrayList.size() < 2) {
            String arrayList4 = arrayList.toString();
            Intrinsics.checkNotNullExpressionValue(arrayList4, "list.toString()");
            String arrayList5 = arrayList.toString();
            Intrinsics.checkNotNullExpressionValue(arrayList5, "list.toString()");
            String substring2 = arrayList4.substring(1, StringsKt.getLastIndex(arrayList5) - 1);
            Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring2;
        }
        String arrayList6 = arrayList.toString();
        Intrinsics.checkNotNullExpressionValue(arrayList6, "list.toString()");
        String arrayList7 = arrayList.toString();
        Intrinsics.checkNotNullExpressionValue(arrayList7, "list.toString()");
        String substring3 = arrayList6.substring(1, StringsKt.getLastIndex(arrayList7) - 2);
        Intrinsics.checkNotNullExpressionValue(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring3;
    }
}
