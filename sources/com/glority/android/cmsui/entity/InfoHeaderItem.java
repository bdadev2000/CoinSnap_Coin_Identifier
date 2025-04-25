package com.glority.android.cmsui.entity;

import androidx.viewpager2.widget.ViewPager2;
import com.glority.android.cms.base.BaseItem;
import com.glority.android.cms.listener.ClickListener;
import com.glority.android.cmsui.R;
import com.glority.android.cmsui.adapter.InfoHeaderVpAdapter;
import com.glority.android.xx.constants.Args;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InfoHeaderItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BF\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0002\u0010\u000eJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J$\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bHÆ\u0003JP\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032#\b\u0002\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bHÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\b\u00103\u001a\u00020\tH\u0016J\t\u00104\u001a\u00020\tHÖ\u0001J \u00105\u001a\u00020\r2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0016J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u000f\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R,\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\"\u0010%\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0017\"\u0004\b'\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006="}, d2 = {"Lcom/glority/android/cmsui/entity/InfoHeaderItem;", "Lcom/glority/android/cms/base/BaseItem;", "path", "", "vpAdapter", "Lcom/glority/android/cmsui/adapter/InfoHeaderVpAdapter;", Args.pageName, "onItemSelected", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "position", "", "(Ljava/lang/String;Lcom/glority/android/cmsui/adapter/InfoHeaderVpAdapter;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "currentIndex", "getCurrentIndex", "()I", "setCurrentIndex", "(I)V", "imageClick", "Lcom/glority/android/cms/listener/ClickListener;", "getImageClick", "()Lcom/glority/android/cms/listener/ClickListener;", "setImageClick", "(Lcom/glority/android/cms/listener/ClickListener;)V", "getOnItemSelected", "()Lkotlin/jvm/functions/Function1;", "pageChangeCallback", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "getPageChangeCallback", "()Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "setPageChangeCallback", "(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V", "getPageName", "()Ljava/lang/String;", "getPath", "rawClick", "getRawClick", "setRawClick", "getVpAdapter", "()Lcom/glority/android/cmsui/adapter/InfoHeaderVpAdapter;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "getLayoutId", "hashCode", "render", "context", "Landroid/content/Context;", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "Lcom/glority/android/cms/base/ExtraData;", "toString", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class InfoHeaderItem extends BaseItem {
    private int currentIndex;
    private ClickListener<Integer> imageClick;
    private final Function1<Integer, Unit> onItemSelected;
    private ViewPager2.OnPageChangeCallback pageChangeCallback;
    private final String pageName;
    private final String path;
    private ClickListener<Integer> rawClick;
    private final InfoHeaderVpAdapter vpAdapter;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InfoHeaderItem copy$default(InfoHeaderItem infoHeaderItem, String str, InfoHeaderVpAdapter infoHeaderVpAdapter, String str2, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = infoHeaderItem.path;
        }
        if ((i & 2) != 0) {
            infoHeaderVpAdapter = infoHeaderItem.vpAdapter;
        }
        if ((i & 4) != 0) {
            str2 = infoHeaderItem.pageName;
        }
        if ((i & 8) != 0) {
            function1 = infoHeaderItem.onItemSelected;
        }
        return infoHeaderItem.copy(str, infoHeaderVpAdapter, str2, function1);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component2, reason: from getter */
    public final InfoHeaderVpAdapter getVpAdapter() {
        return this.vpAdapter;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPageName() {
        return this.pageName;
    }

    public final Function1<Integer, Unit> component4() {
        return this.onItemSelected;
    }

    public final InfoHeaderItem copy(String path, InfoHeaderVpAdapter vpAdapter, String pageName, Function1<? super Integer, Unit> onItemSelected) {
        Intrinsics.checkNotNullParameter(vpAdapter, "vpAdapter");
        Intrinsics.checkNotNullParameter(onItemSelected, "onItemSelected");
        return new InfoHeaderItem(path, vpAdapter, pageName, onItemSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoHeaderItem)) {
            return false;
        }
        InfoHeaderItem infoHeaderItem = (InfoHeaderItem) other;
        return Intrinsics.areEqual(this.path, infoHeaderItem.path) && Intrinsics.areEqual(this.vpAdapter, infoHeaderItem.vpAdapter) && Intrinsics.areEqual(this.pageName, infoHeaderItem.pageName) && Intrinsics.areEqual(this.onItemSelected, infoHeaderItem.onItemSelected);
    }

    public int hashCode() {
        String str = this.path;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        InfoHeaderVpAdapter infoHeaderVpAdapter = this.vpAdapter;
        int hashCode2 = (hashCode + (infoHeaderVpAdapter != null ? infoHeaderVpAdapter.hashCode() : 0)) * 31;
        String str2 = this.pageName;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Function1<Integer, Unit> function1 = this.onItemSelected;
        return hashCode3 + (function1 != null ? function1.hashCode() : 0);
    }

    public String toString() {
        return "InfoHeaderItem(path=" + this.path + ", vpAdapter=" + this.vpAdapter + ", pageName=" + this.pageName + ", onItemSelected=" + this.onItemSelected + ")";
    }

    public final String getPath() {
        return this.path;
    }

    public final InfoHeaderVpAdapter getVpAdapter() {
        return this.vpAdapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InfoHeaderItem(String str, InfoHeaderVpAdapter vpAdapter, String str2, Function1<? super Integer, Unit> onItemSelected) {
        super(str2);
        Intrinsics.checkNotNullParameter(vpAdapter, "vpAdapter");
        Intrinsics.checkNotNullParameter(onItemSelected, "onItemSelected");
        this.path = str;
        this.vpAdapter = vpAdapter;
        this.pageName = str2;
        this.onItemSelected = onItemSelected;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ InfoHeaderItem(java.lang.String r1, com.glority.android.cmsui.adapter.InfoHeaderVpAdapter r2, java.lang.String r3, kotlin.jvm.functions.Function1 r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r5 = r5 & 4
            if (r5 == 0) goto L8
            r3 = 0
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
        L8:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui.entity.InfoHeaderItem.<init>(java.lang.String, com.glority.android.cmsui.adapter.InfoHeaderVpAdapter, java.lang.String, kotlin.jvm.functions.Function1, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Function1<Integer, Unit> getOnItemSelected() {
        return this.onItemSelected;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    public final void setCurrentIndex(int i) {
        this.currentIndex = i;
    }

    public final ViewPager2.OnPageChangeCallback getPageChangeCallback() {
        return this.pageChangeCallback;
    }

    public final void setPageChangeCallback(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.pageChangeCallback = onPageChangeCallback;
    }

    public final ClickListener<Integer> getImageClick() {
        return this.imageClick;
    }

    public final void setImageClick(ClickListener<Integer> clickListener) {
        this.imageClick = clickListener;
    }

    public final ClickListener<Integer> getRawClick() {
        return this.rawClick;
    }

    public final void setRawClick(ClickListener<Integer> clickListener) {
        this.rawClick = clickListener;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public int getLayoutId() {
        return R.layout.item_info_header;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x00ce, code lost:
    
        if (r3.getItemType() == 1) goto L10;
     */
    @Override // com.glority.android.cms.base.BaseItem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void render(android.content.Context r7, com.glority.android.adapterhelper.BaseViewHolder r8, com.glority.android.cms.base.ExtraData r9) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui.entity.InfoHeaderItem.render(android.content.Context, com.glority.android.adapterhelper.BaseViewHolder, com.glority.android.cms.base.ExtraData):void");
    }
}
