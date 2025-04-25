package com.glority.android.cmsui2.view;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewGroupKt;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.glority.android.cmsui2.common.CmsUILogEvents;
import com.glority.android.cmsui2.entity.CmsItemEntity;
import com.glority.android.cmsui2.entity.CmsLogEventInfo;
import com.glority.android.cmsui2.entity.ExtraData;
import com.glority.android.cmsui2.model.JsReportLayoutSubpageRectParam;
import com.glority.android.cmsui2.view.child.WebViewItemView;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.xx.constants.Args;
import com.glority.base.widget.webview.JsbWebView;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ViewUtils;
import com.glority.widget.scrollview.GlNestedScrollView;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CmsView.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u0002042\u0006\u00105\u001a\u000206H\u0016J\b\u00108\u001a\u000204H\u0016J\u0018\u00109\u001a\u0002042\u0006\u0010:\u001a\u00020\b2\u0006\u0010;\u001a\u00020\bH\u0016J\u0012\u0010<\u001a\u0002042\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010=\u001a\u0004\u0018\u00010\u00112\u0006\u0010>\u001a\u00020\bJ\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u001f\u0010@\u001a\u0002042\u0006\u0010A\u001a\u00020\u00112\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010CJ\u000e\u0010D\u001a\u0002042\u0006\u0010>\u001a\u00020\bJ\u000e\u0010E\u001a\u0002042\u0006\u0010>\u001a\u00020\bJ\u000e\u0010F\u001a\u0002042\u0006\u0010>\u001a\u00020\bJ\u0016\u0010G\u001a\u0002042\u0006\u0010>\u001a\u00020\b2\u0006\u0010H\u001a\u00020\bJ\u001a\u0010G\u001a\u0002042\b\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010H\u001a\u00020\bH\u0016J\u0010\u0010K\u001a\u0002042\u0006\u0010L\u001a\u00020\bH\u0016J\u0018\u0010M\u001a\u0002042\u0006\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\bH\u0014J\u000e\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010H\u0002J\u0018\u0010Q\u001a\u0002042\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bH\u0002J(\u0010R\u001a\u0002042\u0006\u0010S\u001a\u00020\u000e2\u0006\u0010T\u001a\u00020\b2\u0006\u0010U\u001a\u00020\b2\u0006\u0010V\u001a\u00020 H\u0002J \u0010W\u001a\u0002042\u0006\u0010A\u001a\u00020\u00112\u0006\u0010I\u001a\u00020J2\u0006\u0010X\u001a\u00020YH\u0002J\u0006\u0010Z\u001a\u000204J\u0012\u0010[\u001a\u00020\u001e2\b\u0010I\u001a\u0004\u0018\u00010JH\u0002J\b\u0010\\\u001a\u000204H\u0002J\"\u0010]\u001a\u0002042\u0006\u0010^\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020\u000e2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\"J&\u0010a\u001a\u0002042\u0006\u0010b\u001a\u00020\u000e2\b\u0010_\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\"H\u0002J\u001a\u0010c\u001a\u00020\u000e2\u0006\u0010b\u001a\u00020\u000e2\b\u0010d\u001a\u0004\u0018\u00010\u000eH\u0002J\u0016\u0010e\u001a\u0002042\u0006\u0010^\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020\u000eJ$\u0010f\u001a\u0002042\u0006\u0010b\u001a\u00020\u000e2\b\u0010_\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\"J\u000e\u0010g\u001a\u0002042\u0006\u0010h\u001a\u00020\u000eJ\u000e\u0010i\u001a\u0002042\u0006\u0010^\u001a\u00020\u000eJ\u0006\u0010j\u001a\u00020\bJ\u0006\u0010k\u001a\u00020lJ\u0010\u0010m\u001a\u00020 2\u0006\u0010n\u001a\u00020\u001eH\u0002J\b\u0010o\u001a\u000204H\u0014J\u0016\u0010p\u001a\u0002042\f\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010H\u0002J\u0016\u0010r\u001a\u0002042\f\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010H\u0002J$\u0010s\u001a\u0002042\u0006\u0010h\u001a\u00020\u000e2\b\u0010t\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\"J\u0014\u0010u\u001a\u0004\u0018\u00010\u000e2\b\u0010t\u001a\u0004\u0018\u00010\u000eH\u0002J\u0016\u0010v\u001a\u0002042\f\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010H\u0002J\u0016\u0010w\u001a\u0002042\f\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010H\u0002J\u0016\u0010x\u001a\u0002042\f\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00100\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b1\u00102¨\u0006y"}, d2 = {"Lcom/glority/android/cmsui2/view/CmsView;", "Lcom/glority/widget/scrollview/GlNestedScrollView;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "exposureTime", "", "TAG", "", "dataList", "", "Lcom/glority/android/cmsui2/entity/CmsItemEntity;", "inflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "Landroid/view/LayoutInflater;", "childViewRectMap", "Ljava/util/LinkedHashMap;", "Lcom/glority/android/cmsui2/entity/CmsLogEventInfo;", "childSubpageViewRectMap", "Lcom/glority/android/cmsui2/model/JsReportLayoutSubpageRectParam$SubpageRectParam;", "webViewHeight", "webviewContainerHeight", "cmsViewRect", "Landroid/graphics/Rect;", "isAutoScroll", "", "commonLogEventBundle", "Landroid/os/Bundle;", "getCommonLogEventBundle", "()Landroid/os/Bundle;", "setCommonLogEventBundle", "(Landroid/os/Bundle;)V", "mainThreadHandler", "Landroid/os/Handler;", "realScrollHeight", "pause", "reportedScroll", "reportedScrollToBottom", "logName", "maxScrollY", "value", "topCoverHeight", "setTopCoverHeight", "(I)V", "onResume", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onPause", "removeAllViewsInLayout", "removeViews", "start", "count", "reset", "getItemByType", "type", "getAllItems", "addItem", "itemEntity", "index", "(Lcom/glority/android/cmsui2/entity/CmsItemEntity;Ljava/lang/Integer;)V", "removeItem", "invalidateItem", "scrollToChild", "scrollToChildWithOffset", TypedValues.CycleType.S_WAVE_OFFSET, "view", "Landroid/view/View;", "onScrollStateChanged", "state", "scrollChange", "scrollY", "oldScrollY", "getAllLogEventInfoEntity", "updateChildMapAfterWebViewHeight", "addWebViewChildItem", "id", "offsetTop", "offsetHeight", "hasLearnMore", "addLogEventInfoMap", "baseCmsItemView", "Lcom/glority/android/cmsui2/view/BaseCmsItemView;", "reComputerViewRect", "computerRect", "updateViewState", "sendNewClickEvent", "eventName", "layoutName", "bundle", "logNewEvent", NotificationCompat.CATEGORY_EVENT, "getClickEventName", Args.title, "sendClickEvent", "logEvent", "sendNewScrollLogeEvent", "eventType", "sendScrollLogeEvent", "cmsViewRealHeight", "cmsViewScrollPercent", "", "isExposure", "childRect", "onDetachedFromWindow", "reportContentExposure", "allLogEventInfoEntity", "reportContentExposureOver", "logEventExposure", "content", "getSubpageParentId", "reportExposureOver", "reportReviewNew", "reportExposure", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public final class CmsView extends GlNestedScrollView implements DefaultLifecycleObserver {
    private final String TAG;
    private LinkedHashMap<String, List<JsReportLayoutSubpageRectParam.SubpageRectParam>> childSubpageViewRectMap;
    private LinkedHashMap<CmsItemEntity, CmsLogEventInfo> childViewRectMap;
    private Rect cmsViewRect;
    private Bundle commonLogEventBundle;
    private List<CmsItemEntity> dataList;
    private long exposureTime;
    private final LayoutInflater inflater;
    private boolean isAutoScroll;
    private String logName;
    private final Handler mainThreadHandler;
    private int maxScrollY;
    private boolean pause;
    private int realScrollHeight;
    private boolean reportedScroll;
    private boolean reportedScrollToBottom;
    private int topCoverHeight;
    private int webViewHeight;
    private int webviewContainerHeight;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CmsView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CmsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CmsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CmsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.exposureTime = 3000L;
        this.TAG = "CmsView";
        this.dataList = new ArrayList();
        this.inflater = LayoutInflater.from(context);
        this.childViewRectMap = new LinkedHashMap<>();
        this.childSubpageViewRectMap = new LinkedHashMap<>();
        this.cmsViewRect = new Rect();
        this.mainThreadHandler = new Handler(Looper.getMainLooper());
        try {
            if (context instanceof LifecycleOwner) {
                ((LifecycleOwner) context).getLifecycleRegistry().addObserver(this);
            }
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    public final Bundle getCommonLogEventBundle() {
        return this.commonLogEventBundle;
    }

    public final void setCommonLogEventBundle(Bundle bundle) {
        this.commonLogEventBundle = bundle;
    }

    private final void setTopCoverHeight(int i) {
        this.cmsViewRect.set(0, this.realScrollHeight + i, getWidth(), this.realScrollHeight + getHeight());
        this.topCoverHeight = i;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onResume(owner);
        if (this.pause) {
            updateViewState();
            this.pause = false;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onPause(owner);
        this.pause = true;
        updateViewState();
        List<CmsLogEventInfo> allLogEventInfoEntity = getAllLogEventInfoEntity();
        ArrayList<CmsLogEventInfo> arrayList = new ArrayList();
        for (Object obj : allLogEventInfoEntity) {
            CmsLogEventInfo cmsLogEventInfo = (CmsLogEventInfo) obj;
            if (isExposure(cmsLogEventInfo.getViewRect()) && !Intrinsics.areEqual((Object) cmsLogEventInfo.getHasRead(), (Object) true)) {
                arrayList.add(obj);
            }
        }
        for (CmsLogEventInfo cmsLogEventInfo2 : arrayList) {
            cmsLogEventInfo2.setLastVisibleTime(0L);
            cmsLogEventInfo2.setLastInVisibleTime(0L);
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        super.removeAllViewsInLayout();
        this.dataList.clear();
        this.childViewRectMap.clear();
    }

    @Override // android.view.ViewGroup
    public void removeViews(int start, int count) {
        super.removeViews(start, count);
        int i = count + start;
        int i2 = 0;
        if (start > 0 && i <= this.dataList.size()) {
            this.dataList = this.dataList.subList(0, start);
        }
        LinkedHashMap<CmsItemEntity, CmsLogEventInfo> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<CmsItemEntity, CmsLogEventInfo> entry : this.childViewRectMap.entrySet()) {
            if (start > i2 || i2 >= i) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            i2++;
        }
        this.childViewRectMap = linkedHashMap;
    }

    public static /* synthetic */ void reset$default(CmsView cmsView, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        cmsView.reset(str);
    }

    public final void reset(String logName) {
        this.logName = logName;
        Log.d(this.TAG, "logName = " + logName);
        removeAllViews();
    }

    public final CmsItemEntity getItemByType(int type) {
        Object obj;
        Iterator<T> it = this.dataList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CmsItemEntity) obj).getItemType() == type) {
                break;
            }
        }
        return (CmsItemEntity) obj;
    }

    public final List<CmsItemEntity> getAllItems() {
        return this.dataList;
    }

    public static /* synthetic */ void addItem$default(CmsView cmsView, CmsItemEntity cmsItemEntity, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        cmsView.addItem(cmsItemEntity, num);
    }

    public final void addItem(CmsItemEntity itemEntity, Integer index) {
        Intrinsics.checkNotNullParameter(itemEntity, "itemEntity");
        BaseCmsItemView item = itemEntity.getItem();
        item.setCmsView(this);
        View inflate = this.inflater.inflate(item.getLayoutId(), (ViewGroup) this, false);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNull(inflate);
        item.render(context, inflate, new ExtraData(itemEntity, this.dataList));
        if (index != null) {
            this.dataList.add(index.intValue(), itemEntity);
            addView(inflate, index.intValue());
        } else {
            this.dataList.add(itemEntity);
            addView(inflate);
        }
        addLogEventInfoMap(itemEntity, inflate, item);
        this.mainThreadHandler.removeCallbacksAndMessages(null);
        this.mainThreadHandler.postDelayed(new Runnable() { // from class: com.glority.android.cmsui2.view.CmsView$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                CmsView.addItem$lambda$6(CmsView.this);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addItem$lambda$6(final CmsView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.post(new Runnable() { // from class: com.glority.android.cmsui2.view.CmsView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                CmsView.addItem$lambda$6$lambda$5(CmsView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addItem$lambda$6$lambda$5(CmsView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cmsViewRect.set(0, this$0.realScrollHeight + this$0.topCoverHeight, this$0.getWidth(), this$0.realScrollHeight + this$0.getHeight());
        this$0.updateViewState();
    }

    public final void removeItem(int type) {
        Iterator<CmsItemEntity> it = this.dataList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().getItemType() == type) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            removeViewAt(i);
            this.dataList.remove(i);
        }
    }

    public final void invalidateItem(int type) {
        Iterator<CmsItemEntity> it = this.dataList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().getItemType() == type) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            CmsItemEntity cmsItemEntity = this.dataList.get(i);
            BaseCmsItemView item = cmsItemEntity.getItem();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            View childAt = getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            item.render(context, childAt, new ExtraData(cmsItemEntity, this.dataList));
        }
    }

    public final void scrollToChild(int type) {
        Iterator<CmsItemEntity> it = this.dataList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().getItemType() == type) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            super.scrollToChild(getChildAt(i));
        }
    }

    public final void scrollToChildWithOffset(int type, int offset) {
        this.isAutoScroll = true;
        Iterator<CmsItemEntity> it = this.dataList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().getItemType() == type) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            super.scrollToChildWithOffset(getChildAt(i), offset);
        }
    }

    @Override // com.glority.widget.scrollview.GlNestedScrollView
    public void scrollToChildWithOffset(View view, int offset) {
        this.isAutoScroll = true;
        Log.e(this.TAG, "isAutoScroll");
        super.scrollToChildWithOffset(view, offset);
    }

    @Override // com.glority.widget.scrollview.GlNestedScrollView
    public void onScrollStateChanged(int state) {
        super.onScrollStateChanged(state);
        if (this.isAutoScroll) {
            if (state == 0) {
                reComputerViewRect();
                updateViewState();
                this.isAutoScroll = false;
                return;
            }
            return;
        }
        if (state == 0) {
            if (!this.reportedScroll) {
                String str = this.logName;
                if (str == null || str.length() == 0) {
                    sendScrollLogeEvent(CmsUILogEvents.CMS_RESULT_SCROLL);
                } else {
                    sendNewScrollLogeEvent(CmsUILogEvents.SCROLL);
                }
                this.reportedScroll = true;
            }
            if (this.reportedScrollToBottom || this.realScrollHeight > (cmsViewRealHeight() - getHeight()) + 10 || this.realScrollHeight < (cmsViewRealHeight() - getHeight()) - 10) {
                return;
            }
            String str2 = this.logName;
            if (str2 == null || str2.length() == 0) {
                sendScrollLogeEvent(CmsUILogEvents.CMS_RESULT_SCROLL_TO_BOTTOM);
            } else {
                sendNewScrollLogeEvent(CmsUILogEvents.SCROLLTOBOTTOM);
            }
            this.reportedScrollToBottom = true;
        }
    }

    @Override // com.glority.widget.scrollview.GlNestedScrollView
    protected void scrollChange(int scrollY, int oldScrollY) {
        super.scrollChange(scrollY, oldScrollY);
        int i = this.realScrollHeight + (scrollY - oldScrollY);
        this.realScrollHeight = i;
        this.maxScrollY = Math.max(i, this.maxScrollY);
        this.cmsViewRect.set(0, this.realScrollHeight + this.topCoverHeight, getWidth(), this.realScrollHeight + getHeight());
        if (this.isAutoScroll) {
            return;
        }
        reComputerViewRect();
        updateViewState();
    }

    private final List<CmsLogEventInfo> getAllLogEventInfoEntity() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<CmsItemEntity, CmsLogEventInfo>> it = this.childViewRectMap.entrySet().iterator();
        while (it.hasNext()) {
            CmsLogEventInfo value = it.next().getValue();
            if (value.getItemType() != 29) {
                List<CmsLogEventInfo> children = value.getChildren();
                if (children == null || children.isEmpty()) {
                    arrayList.add(value);
                } else {
                    List<CmsLogEventInfo> children2 = value.getChildren();
                    if (children2 != null) {
                        Iterator<T> it2 = children2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add((CmsLogEventInfo) it2.next());
                        }
                    }
                }
            }
        }
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ((CmsLogEventInfo) obj).setIndex(i);
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateChildMapAfterWebViewHeight(int webViewHeight, int webviewContainerHeight) {
        this.webViewHeight = webViewHeight;
        Set<CmsItemEntity> keySet = this.childViewRectMap.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
        Iterator<T> it = keySet.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (((CmsItemEntity) next).getItem() instanceof WebViewItemView) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        Collection<CmsLogEventInfo> values = this.childViewRectMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        List mutableList = CollectionsKt.toMutableList((Collection) values);
        if (i == -1 || i2 >= mutableList.size()) {
            return;
        }
        int size = mutableList.size();
        while (i2 < size) {
            CmsLogEventInfo cmsLogEventInfo = (CmsLogEventInfo) mutableList.get(i2);
            Rect viewRect = cmsLogEventInfo.getViewRect();
            cmsLogEventInfo.setViewRect(new Rect(viewRect.left, (cmsLogEventInfo.getTop() + webViewHeight) - webviewContainerHeight, viewRect.right, (cmsLogEventInfo.getBottom() + webViewHeight) - webviewContainerHeight));
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addWebViewChildItem(String id, int offsetTop, int offsetHeight, boolean hasLearnMore) {
        Object obj;
        Object obj2;
        if (id.length() == 0) {
            return;
        }
        Set<CmsItemEntity> keySet = this.childViewRectMap.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
        Iterator<T> it = keySet.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (((CmsItemEntity) obj2).getItem() instanceof WebViewItemView) {
                    break;
                }
            }
        }
        CmsItemEntity cmsItemEntity = (CmsItemEntity) obj2;
        Log.e(this.TAG, "addWebViewChildItem: " + id);
        if (cmsItemEntity != null) {
            CmsLogEventInfo cmsLogEventInfo = this.childViewRectMap.get(cmsItemEntity);
            Intrinsics.checkNotNull(cmsLogEventInfo);
            CmsLogEventInfo cmsLogEventInfo2 = cmsLogEventInfo;
            ArrayList children = cmsLogEventInfo2.getChildren();
            if (children == null) {
                children = new ArrayList();
            }
            List<CmsLogEventInfo> list = children;
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.areEqual(((CmsLogEventInfo) next).getTitle1(), id)) {
                    obj = next;
                    break;
                }
            }
            CmsLogEventInfo cmsLogEventInfo3 = (CmsLogEventInfo) obj;
            if (cmsLogEventInfo3 != null) {
                cmsLogEventInfo3.setViewRect(new Rect(0, cmsLogEventInfo2.getViewRect().top + offsetTop, getWidth(), cmsLogEventInfo2.getViewRect().top + offsetHeight + offsetTop));
            } else {
                list.add(new CmsLogEventInfo(cmsItemEntity.getItemType(), id, 0, new Rect(0, cmsLogEventInfo2.getViewRect().top + offsetTop, getWidth(), cmsLogEventInfo2.getViewRect().top + offsetHeight + offsetTop), hasLearnMore));
            }
            if (list.size() > 1) {
                CollectionsKt.sortWith(list, new Comparator() { // from class: com.glority.android.cmsui2.view.CmsView$addWebViewChildItem$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Integer.valueOf(((CmsLogEventInfo) t).getViewRect().top), Integer.valueOf(((CmsLogEventInfo) t2).getViewRect().top));
                    }
                });
            }
            cmsLogEventInfo2.setChildren(list);
        }
    }

    private final void addLogEventInfoMap(final CmsItemEntity itemEntity, final View view, final BaseCmsItemView baseCmsItemView) {
        view.post(new Runnable() { // from class: com.glority.android.cmsui2.view.CmsView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CmsView.addLogEventInfoMap$lambda$18(CmsView.this, view, itemEntity);
            }
        });
        if (baseCmsItemView instanceof WebViewItemView) {
            WebViewItemView webViewItemView = (WebViewItemView) baseCmsItemView;
            webViewItemView.addChildItemLayoutChangedListener(new WebViewItemView.ChildItemLayoutChangedListener() { // from class: com.glority.android.cmsui2.view.CmsView$addLogEventInfoMap$2
                @Override // com.glority.android.cmsui2.view.child.WebViewItemView.ChildItemLayoutChangedListener
                public void onChildLayoutChanged(String id, int offsetTop, int offsetHeight, boolean hasLearnMore) {
                    Intrinsics.checkNotNullParameter(id, "id");
                    CmsView.this.addWebViewChildItem(id, offsetTop, offsetHeight, hasLearnMore);
                }

                @Override // com.glority.android.cmsui2.view.child.WebViewItemView.ChildItemLayoutChangedListener
                public void onChildSubpageLayoutChanged(String id, int parentOffsetTop, List<JsReportLayoutSubpageRectParam.SubpageRectParam> subpages) {
                    LinkedHashMap linkedHashMap;
                    Intrinsics.checkNotNullParameter(id, "id");
                    Intrinsics.checkNotNullParameter(subpages, "subpages");
                    linkedHashMap = CmsView.this.childSubpageViewRectMap;
                    linkedHashMap.put(id, subpages);
                    CmsView cmsView = CmsView.this;
                    for (JsReportLayoutSubpageRectParam.SubpageRectParam subpageRectParam : subpages) {
                        String id2 = subpageRectParam.getId();
                        if (id2 == null) {
                            id2 = "";
                        }
                        float f = 0.0f;
                        int dp2px = ViewUtils.dp2px(parentOffsetTop) + ViewUtils.dp2px(subpageRectParam.getOffsetTop() != null ? r3.intValue() : 0.0f);
                        Integer offsetHeight = subpageRectParam.getOffsetHeight();
                        if (offsetHeight != null) {
                            f = offsetHeight.intValue();
                        }
                        cmsView.addWebViewChildItem(id2, dp2px, ViewUtils.dp2px(f), true);
                    }
                }
            });
            webViewItemView.addScrollHeightChangedListener(new WebViewItemView.OnScrollHeightChangedListener() { // from class: com.glority.android.cmsui2.view.CmsView$addLogEventInfoMap$3
                @Override // com.glority.android.cmsui2.view.child.WebViewItemView.OnScrollHeightChangedListener
                public void onScrollHeightChange(int oldScrollHeight, int newScrollHeight) {
                    String str;
                    int i;
                    str = CmsView.this.TAG;
                    Log.e(str, "webview height :" + newScrollHeight);
                    CmsView cmsView = CmsView.this;
                    JsbWebView webView = ((WebViewItemView) baseCmsItemView).getWebView();
                    cmsView.webviewContainerHeight = webView != null ? webView.getHeight() : 0;
                    CmsView cmsView2 = CmsView.this;
                    i = cmsView2.webviewContainerHeight;
                    cmsView2.updateChildMapAfterWebViewHeight(newScrollHeight, i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addLogEventInfoMap$lambda$18(CmsView this$0, View view, CmsItemEntity itemEntity) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNullParameter(itemEntity, "$itemEntity");
        Rect computerRect = this$0.computerRect(view);
        LinkedHashMap<CmsItemEntity, CmsLogEventInfo> linkedHashMap = this$0.childViewRectMap;
        CmsLogEventInfo cmsLogEventInfo = new CmsLogEventInfo(itemEntity.getItemType(), itemEntity.getTitle(), this$0.childViewRectMap.size(), computerRect, false, 16, null);
        cmsLogEventInfo.setView(view);
        linkedHashMap.put(itemEntity, cmsLogEventInfo);
        String str = this$0.TAG;
        int itemType = itemEntity.getItemType();
        CmsLogEventInfo cmsLogEventInfo2 = this$0.childViewRectMap.get(itemEntity);
        Log.e(str, "itemType:" + itemType + "  title:" + (cmsLogEventInfo2 != null ? cmsLogEventInfo2.getTitle1() : null) + " childRect:" + computerRect);
    }

    public final void reComputerViewRect() {
        for (Map.Entry<CmsItemEntity, CmsLogEventInfo> entry : this.childViewRectMap.entrySet()) {
            entry.getValue().setViewRect(computerRect(entry.getValue().getView()));
        }
        updateChildMapAfterWebViewHeight(this.webViewHeight, this.webviewContainerHeight);
    }

    private final Rect computerRect(View view) {
        if ((view instanceof ScrollView) || (view instanceof NestedScrollView)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                FrameLayout frameLayout = (FrameLayout) view;
                return new Rect(0, frameLayout.getTop(), frameLayout.getWidth(), frameLayout.getTop() + ViewGroupKt.get(viewGroup, 0).getHeight());
            }
        }
        if (view != null) {
            return new Rect(0, view.getTop(), view.getWidth(), view.getTop() + view.getHeight());
        }
        return new Rect();
    }

    private final void updateViewState() {
        for (CmsLogEventInfo cmsLogEventInfo : getAllLogEventInfoEntity()) {
            Boolean exposure = cmsLogEventInfo.getExposure();
            if (!Intrinsics.areEqual((Object) exposure, (Object) true) && isExposure(cmsLogEventInfo.getViewRect())) {
                cmsLogEventInfo.setExposure(true);
                Log.e(this.TAG, "exposure: " + cmsLogEventInfo.getTitle1());
                cmsLogEventInfo.setLastVisibleTime(System.currentTimeMillis());
            } else if (Intrinsics.areEqual((Object) exposure, (Object) true) && isExposure(cmsLogEventInfo.getViewRect())) {
                cmsLogEventInfo.setLastInVisibleTime(System.currentTimeMillis());
            }
            if (!Intrinsics.areEqual((Object) cmsLogEventInfo.getHasRead(), (Object) true) && cmsLogEventInfo.getLastInVisibleTime() - cmsLogEventInfo.getLastVisibleTime() >= this.exposureTime) {
                cmsLogEventInfo.setHasRead(true);
                Log.e(this.TAG, "hasRead: " + cmsLogEventInfo.getTitle1());
            }
        }
    }

    public static /* synthetic */ void sendNewClickEvent$default(CmsView cmsView, String str, String str2, Bundle bundle, int i, Object obj) {
        if ((i & 4) != 0) {
            bundle = null;
        }
        cmsView.sendNewClickEvent(str, str2, bundle);
    }

    public final void sendNewClickEvent(String eventName, String layoutName, Bundle bundle) {
        Object obj;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(layoutName, "layoutName");
        String str = this.logName;
        if (str == null || str.length() == 0) {
            return;
        }
        updateViewState();
        Iterator<T> it = getAllLogEventInfoEntity().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((CmsLogEventInfo) obj).getTitle1(), layoutName)) {
                    break;
                }
            }
        }
        CmsLogEventInfo cmsLogEventInfo = (CmsLogEventInfo) obj;
        if (cmsLogEventInfo == null) {
            return;
        }
        cmsLogEventInfo.setHasRead(true);
        logNewEvent(eventName, layoutName, bundle);
    }

    static /* synthetic */ void logNewEvent$default(CmsView cmsView, String str, String str2, Bundle bundle, int i, Object obj) {
        if ((i & 4) != 0) {
            bundle = null;
        }
        cmsView.logNewEvent(str, str2, bundle);
    }

    private final void logNewEvent(String event, String layoutName, Bundle bundle) {
        Object obj;
        Iterator<T> it = getAllLogEventInfoEntity().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((CmsLogEventInfo) obj).getTitle1(), layoutName)) {
                    break;
                }
            }
        }
        CmsLogEventInfo cmsLogEventInfo = (CmsLogEventInfo) obj;
        if (cmsLogEventInfo == null) {
            return;
        }
        Integer valueOf = bundle != null ? Integer.valueOf(bundle.getInt(LogEventArguments.ARG_INTEGER_2, -1)) : null;
        String string = bundle != null ? bundle.getString("content") : null;
        Bundle bundle2 = new Bundle();
        if (string == null) {
            string = cmsLogEventInfo.getTitle1();
        }
        bundle2.putString("code", string);
        bundle2.putString("index", String.valueOf(cmsLogEventInfo.getIndex()));
        String title1 = cmsLogEventInfo.getTitle1();
        if (title1 == null) {
            title1 = "";
        }
        bundle2.putString("content", title1);
        bundle2.putString("name", event != null ? event : "");
        Boolean hasRead = cmsLogEventInfo.getHasRead();
        int i = 0;
        bundle2.putString("status", String.valueOf(hasRead != null ? hasRead.booleanValue() : false));
        if (valueOf != null && valueOf.intValue() > 0) {
            i = valueOf.intValue() - 1;
        }
        bundle2.putInt(LogEventArguments.ARG_INTEGER_1, i);
        bundle2.putInt(LogEventArguments.ARG_INTEGER_2, cmsLogEventInfo.getHasLearnMore() ? 1 : 0);
        Bundle bundle3 = this.commonLogEventBundle;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        new LogEventRequest(getClickEventName(event, cmsLogEventInfo.getTitle1()), bundle2).post();
    }

    private final String getClickEventName(String event, String title) {
        int hashCode = event.hashCode();
        if (hashCode != -1939100487) {
            if (hashCode != -632085587) {
                if (hashCode == 972484720 && event.equals(CmsUILogEvents.CMS_NAME_TYPE_LEARN_MORE)) {
                    return this.logName + "_learnmoreitemcontent_click";
                }
            } else if (event.equals(CmsUILogEvents.CMS_NAME_TYPE_COLLAPSE)) {
                return this.logName + "_collapseitemcontent_click";
            }
        } else if (event.equals(CmsUILogEvents.CMS_NAME_TYPE_EXPANDED)) {
            return this.logName + "_expanditemcontent_click";
        }
        if (Intrinsics.areEqual(title, "toxic")) {
            return this.logName + "_moreitemcontent_click";
        }
        if (Intrinsics.areEqual(title, "conditions")) {
            return this.logName + "_itemcontent_click";
        }
        return this.logName + "_itemcontent_click";
    }

    public final void sendClickEvent(String eventName, String layoutName) {
        Object obj;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(layoutName, "layoutName");
        updateViewState();
        Iterator<T> it = getAllLogEventInfoEntity().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((CmsLogEventInfo) obj).getTitle1(), layoutName)) {
                    break;
                }
            }
        }
        CmsLogEventInfo cmsLogEventInfo = (CmsLogEventInfo) obj;
        if (cmsLogEventInfo == null) {
            return;
        }
        cmsLogEventInfo.setHasRead(true);
        logEvent(eventName, layoutName, BundleKt.bundleOf(new Pair[0]));
    }

    public static /* synthetic */ void logEvent$default(CmsView cmsView, String str, String str2, Bundle bundle, int i, Object obj) {
        if ((i & 4) != 0) {
            bundle = null;
        }
        cmsView.logEvent(str, str2, bundle);
    }

    public final void logEvent(String event, String layoutName, Bundle bundle) {
        Object obj;
        Intrinsics.checkNotNullParameter(event, "event");
        Iterator<T> it = getAllLogEventInfoEntity().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((CmsLogEventInfo) obj).getTitle1(), layoutName)) {
                    break;
                }
            }
        }
        CmsLogEventInfo cmsLogEventInfo = (CmsLogEventInfo) obj;
        if (cmsLogEventInfo == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("index", String.valueOf(cmsLogEventInfo.getIndex()));
        String title1 = cmsLogEventInfo.getTitle1();
        if (title1 == null) {
            title1 = "";
        }
        bundle2.putString("group", title1);
        bundle2.putString("name", event);
        Boolean hasRead = cmsLogEventInfo.getHasRead();
        bundle2.putString("status", String.valueOf(hasRead != null ? hasRead.booleanValue() : false));
        Bundle bundle3 = this.commonLogEventBundle;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        new LogEventRequest(CmsUILogEvents.CMS_RESULT_REVIEW_NEW, bundle2).post();
    }

    public final void sendNewScrollLogeEvent(String eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.commonLogEventBundle;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        new LogEventRequest(this.logName + "_" + eventType, bundle).post();
    }

    public final void sendScrollLogeEvent(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.commonLogEventBundle;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        new LogEventRequest(eventName, bundle).post();
    }

    public final int cmsViewRealHeight() {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (!(childAt instanceof WebView)) {
                i += childAt.getHeight();
            }
        }
        return i + this.webViewHeight;
    }

    public final float cmsViewScrollPercent() {
        int cmsViewRealHeight = cmsViewRealHeight();
        if (cmsViewRealHeight == 0) {
            return 0.0f;
        }
        return Math.min((this.maxScrollY + getHeight()) / cmsViewRealHeight, 1.0f);
    }

    private final boolean isExposure(Rect childRect) {
        try {
            if (!this.cmsViewRect.contains(childRect) && !childRect.contains(this.cmsViewRect)) {
                if (this.cmsViewRect.top <= childRect.top && childRect.bottom >= this.cmsViewRect.bottom) {
                    return (((((float) (this.cmsViewRect.bottom - childRect.top)) / ((float) childRect.height())) > 0.8f ? 1 : ((((float) (this.cmsViewRect.bottom - childRect.top)) / ((float) childRect.height())) == 0.8f ? 0 : -1)) >= 0) || (((((float) (this.cmsViewRect.bottom - childRect.top)) / ((float) this.cmsViewRect.height())) > 0.8f ? 1 : ((((float) (this.cmsViewRect.bottom - childRect.top)) / ((float) this.cmsViewRect.height())) == 0.8f ? 0 : -1)) >= 0);
                }
                if (this.cmsViewRect.top < childRect.top || childRect.bottom > this.cmsViewRect.bottom) {
                    return false;
                }
                return (((((float) (childRect.bottom - this.cmsViewRect.top)) / ((float) childRect.height())) > 0.8f ? 1 : ((((float) (childRect.bottom - this.cmsViewRect.top)) / ((float) childRect.height())) == 0.8f ? 0 : -1)) >= 0) || (((((float) (childRect.bottom - this.cmsViewRect.top)) / ((float) this.cmsViewRect.height())) > 0.8f ? 1 : ((((float) (childRect.bottom - this.cmsViewRect.top)) / ((float) this.cmsViewRect.height())) == 0.8f ? 0 : -1)) >= 0);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            updateViewState();
            List<CmsLogEventInfo> allLogEventInfoEntity = getAllLogEventInfoEntity();
            String str = this.logName;
            if (str != null && str.length() != 0) {
                reportContentExposure(allLogEventInfoEntity);
                reportContentExposureOver(allLogEventInfoEntity);
                Unit unit = Unit.INSTANCE;
            }
            reportExposure(allLogEventInfoEntity);
            reportReviewNew(allLogEventInfoEntity);
            Unit unit2 = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    private final void reportContentExposure(List<CmsLogEventInfo> allLogEventInfoEntity) {
        for (CmsLogEventInfo cmsLogEventInfo : allLogEventInfoEntity) {
            if (Intrinsics.areEqual((Object) cmsLogEventInfo.getExposure(), (Object) true)) {
                logEventExposure(CmsUILogEvents.EXPOSURE, cmsLogEventInfo.getTitle1(), null);
            }
        }
    }

    private final void reportContentExposureOver(List<CmsLogEventInfo> allLogEventInfoEntity) {
        for (CmsLogEventInfo cmsLogEventInfo : allLogEventInfoEntity) {
            if (Intrinsics.areEqual((Object) cmsLogEventInfo.getExposure(), (Object) true)) {
                logEventExposure(CmsUILogEvents.EXPOSUREOVER, cmsLogEventInfo.getTitle1(), null);
            }
        }
    }

    public static /* synthetic */ void logEventExposure$default(CmsView cmsView, String str, String str2, Bundle bundle, int i, Object obj) {
        if ((i & 4) != 0) {
            bundle = null;
        }
        cmsView.logEventExposure(str, str2, bundle);
    }

    public final void logEventExposure(String eventType, String content, Bundle bundle) {
        Object obj;
        Object obj2;
        List<JsReportLayoutSubpageRectParam.SubpageRectParam> list;
        Integer order;
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Iterator<T> it = getAllLogEventInfoEntity().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (Intrinsics.areEqual(((CmsLogEventInfo) obj2).getTitle1(), content)) {
                    break;
                }
            }
        }
        CmsLogEventInfo cmsLogEventInfo = (CmsLogEventInfo) obj2;
        if (cmsLogEventInfo == null) {
            return;
        }
        String subpageParentId = getSubpageParentId(content);
        int i = 0;
        if (subpageParentId != null && (list = this.childSubpageViewRectMap.get(subpageParentId)) != null) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.areEqual(((JsReportLayoutSubpageRectParam.SubpageRectParam) next).getId(), content)) {
                    obj = next;
                    break;
                }
            }
            JsReportLayoutSubpageRectParam.SubpageRectParam subpageRectParam = (JsReportLayoutSubpageRectParam.SubpageRectParam) obj;
            if (subpageRectParam != null && (order = subpageRectParam.getOrder()) != null) {
                i = order.intValue();
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("code", content);
        bundle2.putInt(LogEventArguments.ARG_INTEGER_1, i);
        bundle2.putInt(LogEventArguments.ARG_INTEGER_2, cmsLogEventInfo.getHasLearnMore() ? 1 : 0);
        if (subpageParentId != null) {
            content = subpageParentId;
        }
        bundle2.putString("content", content);
        bundle2.putString("index", String.valueOf(cmsLogEventInfo.getIndex()));
        if (Intrinsics.areEqual(eventType, CmsUILogEvents.EXPOSUREOVER)) {
            bundle2.putDouble("time", (cmsLogEventInfo.getLastInVisibleTime() - cmsLogEventInfo.getLastVisibleTime()) / 1000.0d);
        }
        Bundle bundle3 = this.commonLogEventBundle;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        new LogEventRequest(this.logName + "_itemcontent_" + eventType, bundle2).post();
    }

    private final String getSubpageParentId(String content) {
        Object obj;
        Map.Entry<String, List<JsReportLayoutSubpageRectParam.SubpageRectParam>> next;
        Iterator<Map.Entry<String, List<JsReportLayoutSubpageRectParam.SubpageRectParam>>> it = this.childSubpageViewRectMap.entrySet().iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                return null;
            }
            next = it.next();
            Iterator<T> it2 = next.getValue().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (Intrinsics.areEqual(((JsReportLayoutSubpageRectParam.SubpageRectParam) next2).getId(), content)) {
                    obj = next2;
                    break;
                }
            }
        } while (((JsReportLayoutSubpageRectParam.SubpageRectParam) obj) == null);
        return next.getKey();
    }

    private final void reportExposureOver(List<CmsLogEventInfo> allLogEventInfoEntity) {
        for (CmsLogEventInfo cmsLogEventInfo : allLogEventInfoEntity) {
            if (Intrinsics.areEqual((Object) cmsLogEventInfo.getExposure(), (Object) true)) {
                logEvent(CmsUILogEvents.CMS_NAME_TYPE_SHOWN, cmsLogEventInfo.getTitle1(), null);
            }
        }
    }

    private final void reportReviewNew(List<CmsLogEventInfo> allLogEventInfoEntity) {
        for (CmsLogEventInfo cmsLogEventInfo : allLogEventInfoEntity) {
            if (Intrinsics.areEqual((Object) cmsLogEventInfo.getExposure(), (Object) true)) {
                logEvent(CmsUILogEvents.CMS_NAME_TYPE_SHOWN, cmsLogEventInfo.getTitle1(), null);
            }
        }
    }

    private final void reportExposure(List<CmsLogEventInfo> allLogEventInfoEntity) {
        double d;
        List<CmsLogEventInfo> list = allLogEventInfoEntity;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual((Object) ((CmsLogEventInfo) obj).getExposure(), (Object) true)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (true) {
            String str = "";
            if (!it.hasNext()) {
                break;
            }
            String title1 = ((CmsLogEventInfo) it.next()).getTitle1();
            if (title1 != null) {
                str = title1;
            }
            arrayList3.add(str);
        }
        String joinToString$default = CollectionsKt.joinToString$default(arrayList3, ",", null, null, 0, null, null, 62, null);
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            String title12 = ((CmsLogEventInfo) it2.next()).getTitle1();
            if (title12 == null) {
                title12 = "";
            }
            arrayList4.add(title12);
        }
        String joinToString$default2 = CollectionsKt.joinToString$default(arrayList4, ",", null, null, 0, null, null, 62, null);
        try {
            d = r2.size() / allLogEventInfoEntity.size();
        } catch (Throwable unused) {
            d = -1.0d;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        linkedHashMap2.put("group", joinToString$default);
        linkedHashMap2.put(LogEventArguments.ARG_STRING_1, joinToString$default2);
        Log.e(this.TAG, "exposedRate: " + d);
        Bundle bundleOf = BundleKt.bundleOf(TuplesKt.to("content", new Gson().toJson(linkedHashMap)), TuplesKt.to("double1", Double.valueOf(d)));
        Bundle bundle = this.commonLogEventBundle;
        if (bundle != null) {
            bundleOf.putAll(bundle);
        }
        new LogEventRequest(CmsUILogEvents.CMS_RESULT_EXPOSURE, bundleOf).post();
    }
}
