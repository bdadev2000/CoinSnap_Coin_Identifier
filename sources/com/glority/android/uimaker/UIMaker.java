package com.glority.android.uimaker;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.core.view.ViewGroupKt;
import androidx.exifinterface.media.ExifInterface;
import com.glority.android.uimaker.parameter.IUIMakerView;
import com.glority.android.uimaker.parameter.UiMakerOnClickListener;
import com.glority.android.uimaker.parameter.baseview.WindowParameter;
import com.glority.android.uimaker.uimaker.BaseUiMaker;
import com.glority.android.uimaker.uimaker.UIMakerV1;
import com.glority.android.uimaker.uimaker.UIMakerV2;
import com.glority.android.xx.constants.LogEvents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UIMaker.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J+\u0010\u0010\u001a\u0004\u0018\u0001H\u0011\"\f\b\u0000\u0010\u0011*\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0002\u0010\u0016J4\u0010\u0010\u001a\u00020\u0017\"\f\b\u0000\u0010\u0011*\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\u0007\u001a\u00020\u0001X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/glority/android/uimaker/UIMaker;", "Lcom/glority/android/uimaker/uimaker/BaseUiMaker;", "context", "Landroid/content/Context;", "localResources", "", "(Landroid/content/Context;Z)V", "baseUiMaker", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "scrollView", "Landroid/widget/ScrollView;", "getScrollView", "()Landroid/widget/ScrollView;", "findViewByUiMakerTag", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/glority/android/uimaker/parameter/IUIMakerView;", "tag", "", "view", "(Ljava/lang/String;Landroid/view/View;)Lcom/glority/android/uimaker/parameter/IUIMakerView;", "", LogEvents.result, "", "toView", "json", "onClickListener", "Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;", "uimaker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class UIMaker implements BaseUiMaker {
    private BaseUiMaker baseUiMaker;
    private final Context context;
    private final boolean localResources;

    public UIMaker(Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.localResources = z;
    }

    public /* synthetic */ UIMaker(Context context, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? true : z);
    }

    @Override // com.glority.android.uimaker.uimaker.BaseUiMaker
    public View toView(String json, UiMakerOnClickListener onClickListener) {
        UIMakerV2 uIMakerV2;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        WindowParameter parse = UiJsonParser.INSTANCE.parse(json);
        if (parse.getVersion() == 1) {
            uIMakerV2 = new UIMakerV1(this.context, parse, this.localResources);
        } else {
            uIMakerV2 = new UIMakerV2(this.context, parse, this.localResources);
        }
        this.baseUiMaker = uIMakerV2;
        uIMakerV2.toView(json, onClickListener);
        BaseUiMaker baseUiMaker = this.baseUiMaker;
        if (baseUiMaker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseUiMaker");
        }
        return baseUiMaker.mo7943getRootView();
    }

    public final <T extends IUIMakerView<?>> T findViewByUiMakerTag(String tag, View view) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(view, "view");
        ArrayList arrayList = new ArrayList();
        findViewByUiMakerTag(tag, view, arrayList);
        return (T) CollectionsKt.firstOrNull((List) arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends IUIMakerView<?>> void findViewByUiMakerTag(String tag, View view, List<T> result) {
        if (view instanceof IUIMakerView) {
            IUIMakerView iUIMakerView = (IUIMakerView) view;
            if (Intrinsics.areEqual(iUIMakerView.getUiMakerViewTag(), tag)) {
                result.add(iUIMakerView);
                return;
            }
        }
        if (view instanceof ViewGroup) {
            Iterator<View> it = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it.hasNext()) {
                findViewByUiMakerTag(tag, it.next(), result);
            }
        }
    }

    @Override // com.glority.android.uimaker.uimaker.BaseUiMaker
    /* renamed from: getRootView */
    public View mo7943getRootView() {
        BaseUiMaker baseUiMaker = this.baseUiMaker;
        if (baseUiMaker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseUiMaker");
        }
        return baseUiMaker.mo7943getRootView();
    }

    @Override // com.glority.android.uimaker.uimaker.BaseUiMaker
    public ScrollView getScrollView() {
        BaseUiMaker baseUiMaker = this.baseUiMaker;
        if (baseUiMaker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseUiMaker");
        }
        return baseUiMaker.getScrollView();
    }
}
