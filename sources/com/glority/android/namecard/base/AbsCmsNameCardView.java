package com.glority.android.namecard.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.glority.android.namecard.base.entity.SimpleCmsObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AbsCmsNameCardView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006J,\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u0019H&R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/glority/android/namecard/base/AbsCmsNameCardView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cmsNameCardClickListener", "Lcom/glority/android/namecard/base/AbsCmsNameCardView$CmsNameCardClickListener;", "getLayout", "", "initView", "", "rootView", "Landroid/view/View;", "onClick", "view", "clickType", "Lcom/glority/android/namecard/base/AbsCmsNameCardView$ClickType;", "setCmsNameCardClickListener", "setData", "simpleCmsObject", "Lcom/glority/android/namecard/base/entity/SimpleCmsObject;", "customName", "", "customNotes", "showEdit", "", "ClickType", "CmsNameCardClickListener", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public abstract class AbsCmsNameCardView extends FrameLayout {
    private CmsNameCardClickListener cmsNameCardClickListener;

    /* compiled from: AbsCmsNameCardView.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/glority/android/namecard/base/AbsCmsNameCardView$ClickType;", "", "(Ljava/lang/String;I)V", "EDIT", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes3.dex */
    public enum ClickType {
        EDIT
    }

    /* compiled from: AbsCmsNameCardView.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/glority/android/namecard/base/AbsCmsNameCardView$CmsNameCardClickListener;", "", "onClick", "", "view", "Landroid/view/View;", "clickType", "Lcom/glority/android/namecard/base/AbsCmsNameCardView$ClickType;", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes3.dex */
    public interface CmsNameCardClickListener {
        void onClick(View view, ClickType clickType);
    }

    public abstract int getLayout();

    public abstract void initView(View rootView);

    public abstract void setData(SimpleCmsObject simpleCmsObject, String customName, String customNotes, boolean showEdit);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsCmsNameCardView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View rootView = LayoutInflater.from(context).inflate(getLayout(), this);
        Intrinsics.checkNotNullExpressionValue(rootView, "rootView");
        initView(rootView);
    }

    public final void onClick(View view, ClickType clickType) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(clickType, "clickType");
        CmsNameCardClickListener cmsNameCardClickListener = this.cmsNameCardClickListener;
        if (cmsNameCardClickListener != null) {
            cmsNameCardClickListener.onClick(view, clickType);
        }
    }

    public final void setCmsNameCardClickListener(CmsNameCardClickListener cmsNameCardClickListener) {
        Intrinsics.checkNotNullParameter(cmsNameCardClickListener, "cmsNameCardClickListener");
        this.cmsNameCardClickListener = cmsNameCardClickListener;
    }
}
