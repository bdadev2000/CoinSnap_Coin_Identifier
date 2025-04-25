package com.glority.android.cms;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.cms.adapter.CmsAdapter;
import com.glority.android.cms.base.CmsMultiEntity;
import com.glority.android.cms.common.CmsMarkdown;
import com.glority.android.cms.listener.CmsLinkClickListener;
import com.glority.android.xx.constants.Args;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.noties.markwon.Markwon;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CmsView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0016J\u0014\u0010)\u001a\u00020'2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\u0010\u0010+\u001a\u0004\u0018\u00010\u00162\u0006\u0010,\u001a\u00020\u0007J\u0010\u0010-\u001a\u0004\u0018\u00010\u00162\u0006\u0010.\u001a\u00020\u0007J\u000e\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0007J\u0006\u00100\u001a\u00020\u0007J\u0016\u00101\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000e2\u0006\u0010.\u001a\u00020\u0007J\u0016\u00102\u001a\u00020'2\u0006\u00103\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0016J\u0016\u00104\u001a\u00020'2\u0006\u00105\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\u0007J\u000e\u00107\u001a\u00020'2\u0006\u0010,\u001a\u00020\u0007J\u000e\u00108\u001a\u00020'2\u0006\u0010.\u001a\u00020\u0007J\u000e\u00109\u001a\u00020:2\u0006\u0010.\u001a\u00020\u0007J\u0006\u0010;\u001a\u00020'J\u000e\u0010<\u001a\u00020'2\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010=\u001a\u00020'2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\u000e\u0010?\u001a\u00020'2\u0006\u0010@\u001a\u00020AJ\u0006\u0010B\u001a\u00020'J\u0018\u0010C\u001a\u00020'2\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000eH\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0011\"\u0004\b\u0018\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR)\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000e0 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u000e\u0010%\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lcom/glority/android/cms/CmsView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cmsAdapter", "Lcom/glority/android/cms/adapter/CmsAdapter;", "cmsLinkClickListener", "Lcom/glority/android/cms/listener/CmsLinkClickListener;", "indexData", "", "", "getIndexData", "()Ljava/util/List;", "setIndexData", "(Ljava/util/List;)V", "layoutDataList", "", "Lcom/glority/android/cms/base/CmsMultiEntity;", "getLayoutDataList", "setLayoutDataList", "markdown", "Lio/noties/markwon/Markwon;", "getMarkdown", "()Lio/noties/markwon/Markwon;", "setMarkdown", "(Lio/noties/markwon/Markwon;)V", "observerList", "Landroidx/lifecycle/MutableLiveData;", "getObserverList", "()Landroidx/lifecycle/MutableLiveData;", "observerList$delegate", "Lkotlin/Lazy;", Args.pageName, "addItem", "", "cmsMultiEntity", "addItems", FirebaseAnalytics.Param.ITEMS, "getItem", "position", "getItemByType", "type", "getItemIndex", "getItemSize", "getItemsByType", "insert", "index", "nav2ItemByTitle", Args.title, TypedValues.CycleType.S_WAVE_OFFSET, "notifyItemChanged", "notifyItemChangedByType", "removeItem", "", "reset", "setCmsLinkClickListener", "setData", "data", "setFooterView", "footerView", "Landroid/view/View;", "show", "updateIndexData", "base-cms_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class CmsView extends RecyclerView {
    private HashMap _$_findViewCache;
    private CmsAdapter cmsAdapter;
    private CmsLinkClickListener cmsLinkClickListener;
    private List<String> indexData;
    private List<CmsMultiEntity> layoutDataList;
    private Markwon markdown;

    /* renamed from: observerList$delegate, reason: from kotlin metadata */
    private final Lazy observerList;
    private String pageName;

    public CmsView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CmsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MutableLiveData<List<CmsMultiEntity>> getObserverList() {
        return (MutableLiveData) this.observerList.getValue();
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ CmsView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L8
            r2 = 0
            r5 = r2
            android.util.AttributeSet r5 = (android.util.AttributeSet) r5
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cms.CmsView.<init>(android.content.Context, android.util.AttributeSet, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CmsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.observerList = LazyKt.lazy(new Function0<MutableLiveData<List<? extends CmsMultiEntity>>>() { // from class: com.glority.android.cms.CmsView$observerList$2
            @Override // kotlin.jvm.functions.Function0
            public final MutableLiveData<List<? extends CmsMultiEntity>> invoke() {
                return new MutableLiveData<>();
            }
        });
        this.layoutDataList = new ArrayList();
        this.pageName = "";
        this.markdown = CmsMarkdown.INSTANCE.create(this.cmsLinkClickListener);
        setOverScrollMode(2);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.cmsAdapter = new CmsAdapter(null, this.pageName);
        LifecycleOwner lifecycleOwner = (LifecycleOwner) (context instanceof LifecycleOwner ? context : null);
        if (lifecycleOwner != null) {
            getObserverList().observe(lifecycleOwner, new Observer<List<? extends CmsMultiEntity>>() { // from class: com.glority.android.cms.CmsView$$special$$inlined$let$lambda$1
                @Override // androidx.lifecycle.Observer
                public /* bridge */ /* synthetic */ void onChanged(List<? extends CmsMultiEntity> list) {
                    onChanged2((List<CmsMultiEntity>) list);
                }

                /* renamed from: onChanged, reason: avoid collision after fix types in other method */
                public final void onChanged2(List<CmsMultiEntity> list) {
                    CmsAdapter cmsAdapter;
                    CmsAdapter cmsAdapter2;
                    MutableLiveData observerList;
                    if (list == null || !(!list.isEmpty())) {
                        return;
                    }
                    cmsAdapter = CmsView.this.cmsAdapter;
                    if (cmsAdapter != null) {
                        cmsAdapter2 = CmsView.this.cmsAdapter;
                        if (cmsAdapter2 != null) {
                            cmsAdapter2.setNewDiffData(new CmsMultiEntity.CmsMultiDiffCallback(list));
                        }
                        CmsView cmsView = CmsView.this;
                        observerList = cmsView.getObserverList();
                        cmsView.updateIndexData((List) observerList.getValue());
                    }
                }
            });
        }
        setAdapter(this.cmsAdapter);
    }

    public final List<CmsMultiEntity> getLayoutDataList() {
        return this.layoutDataList;
    }

    public final void setLayoutDataList(List<CmsMultiEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.layoutDataList = list;
    }

    public final List<String> getIndexData() {
        return this.indexData;
    }

    public final void setIndexData(List<String> list) {
        this.indexData = list;
    }

    public final Markwon getMarkdown() {
        return this.markdown;
    }

    public final void setMarkdown(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markdown = markwon;
    }

    public final void setCmsLinkClickListener(CmsLinkClickListener cmsLinkClickListener) {
        Intrinsics.checkNotNullParameter(cmsLinkClickListener, "cmsLinkClickListener");
        this.markdown = CmsMarkdown.INSTANCE.create(cmsLinkClickListener);
    }

    public final void reset() {
        this.layoutDataList = new ArrayList();
        show();
    }

    public final void addItem(CmsMultiEntity cmsMultiEntity) {
        Intrinsics.checkNotNullParameter(cmsMultiEntity, "cmsMultiEntity");
        this.layoutDataList.add(cmsMultiEntity);
    }

    public final void addItems(List<CmsMultiEntity> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.layoutDataList.addAll(items);
    }

    public final void setData(List<CmsMultiEntity> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.layoutDataList = data;
    }

    public final void show() {
        getObserverList().setValue(this.layoutDataList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateIndexData(List<CmsMultiEntity> data) {
        if (data != null) {
            ArrayList arrayList = new ArrayList();
            for (CmsMultiEntity cmsMultiEntity : data) {
                String title = cmsMultiEntity.getTitle();
                String title2 = (title == null || title.length() == 0) ? null : cmsMultiEntity.getTitle();
                if (title2 != null) {
                    arrayList.add(title2);
                }
            }
            List<String> distinct = CollectionsKt.distinct(arrayList);
            if (distinct != null) {
                this.indexData = distinct;
            }
        }
    }

    public final void insert(int index, CmsMultiEntity cmsMultiEntity) {
        Intrinsics.checkNotNullParameter(cmsMultiEntity, "cmsMultiEntity");
        if (index >= this.layoutDataList.size() || index < 0) {
            return;
        }
        this.layoutDataList.add(index, cmsMultiEntity);
    }

    public final boolean removeItem(int type) {
        List<CmsMultiEntity> mutableList;
        List<CmsMultiEntity> value = getObserverList().getValue();
        if (value != null && (mutableList = CollectionsKt.toMutableList((Collection) value)) != null) {
            Iterator<CmsMultiEntity> it = mutableList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (it.next().getItemType() == type) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                mutableList.remove(i);
                getObserverList().setValue(mutableList);
                return true;
            }
        }
        return false;
    }

    public final int getItemSize() {
        List<CmsMultiEntity> value = getObserverList().getValue();
        if (value != null) {
            return value.size();
        }
        return 0;
    }

    public final CmsMultiEntity getItem(int position) {
        List<CmsMultiEntity> value;
        CmsMultiEntity cmsMultiEntity;
        if (position < 0 || (value = getObserverList().getValue()) == null || (cmsMultiEntity = value.get(position)) == null) {
            return null;
        }
        return cmsMultiEntity;
    }

    public final int getItemIndex(int type) {
        List<CmsMultiEntity> value = getObserverList().getValue();
        if (value == null) {
            return -1;
        }
        Iterator<CmsMultiEntity> it = value.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().getItemType() == type) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final CmsMultiEntity getItemByType(int type) {
        List<CmsMultiEntity> value = getObserverList().getValue();
        Object obj = null;
        if (value == null) {
            return null;
        }
        Iterator<T> it = value.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((CmsMultiEntity) next).getItemType() == type) {
                obj = next;
                break;
            }
        }
        return (CmsMultiEntity) obj;
    }

    public final List<CmsMultiEntity> getItemsByType(int type) {
        List<CmsMultiEntity> value = getObserverList().getValue();
        if (value == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : value) {
            if (((CmsMultiEntity) obj).getItemType() == type) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void notifyItemChanged(int position) {
        CmsAdapter cmsAdapter;
        if (position >= 0 && (cmsAdapter = this.cmsAdapter) != null) {
            cmsAdapter.notifyItemChanged(position);
        }
    }

    public final void notifyItemChangedByType(int type) {
        CmsAdapter cmsAdapter;
        int itemIndex = getItemIndex(type);
        if (itemIndex >= 0 && (cmsAdapter = this.cmsAdapter) != null) {
            cmsAdapter.notifyItemChanged(itemIndex);
        }
    }

    public final void nav2ItemByTitle(String title, int offset) {
        Intrinsics.checkNotNullParameter(title, "title");
        List<CmsMultiEntity> value = getObserverList().getValue();
        if (value != null) {
            Iterator<CmsMultiEntity> it = value.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.areEqual(it.next().getTitle(), title)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                layoutManager = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager != null) {
                linearLayoutManager.scrollToPositionWithOffset(i, offset);
            }
        }
    }

    public final void setFooterView(View footerView) {
        Intrinsics.checkNotNullParameter(footerView, "footerView");
        CmsAdapter cmsAdapter = this.cmsAdapter;
        if (cmsAdapter != null) {
            cmsAdapter.setFooterView(footerView);
        }
    }
}
