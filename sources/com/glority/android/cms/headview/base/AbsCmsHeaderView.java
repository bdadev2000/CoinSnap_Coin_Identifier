package com.glority.android.cms.headview.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AbsCmsHeaderView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H&J \u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H&J\u000e\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0006J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aH&R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/glority/android/cms/headview/base/AbsCmsHeaderView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cmsHeaderViewListener", "Lcom/glority/android/cms/headview/base/AbsCmsHeaderView$HeaderViewListener;", "initView", "", "layoutInflater", "Landroid/view/LayoutInflater;", "onClick", "clickType", "Lcom/glority/android/cms/headview/base/AbsCmsHeaderView$ClickType;", "view", "Landroid/view/View;", "uri", "", "onSelected", "position", "", "select", "setCmsHeaderViewListener", "headerViewListener", "setData", "headerViewEntity", "Lcom/glority/android/cms/headview/base/HeaderViewEntity;", "ClickType", "HeaderViewListener", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public abstract class AbsCmsHeaderView extends FrameLayout {
    private HeaderViewListener cmsHeaderViewListener;

    /* compiled from: AbsCmsHeaderView.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/glority/android/cms/headview/base/AbsCmsHeaderView$HeaderViewListener;", "", "onClick", "", "clickType", "Lcom/glority/android/cms/headview/base/AbsCmsHeaderView$ClickType;", "view", "Landroid/view/View;", "uri", "", "onSelected", "position", "", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public interface HeaderViewListener {
        void onClick(ClickType clickType, View view, String uri);

        void onSelected(int position);
    }

    public abstract void initView(LayoutInflater layoutInflater, Context context);

    public abstract void select(int position);

    public abstract void setData(HeaderViewEntity headerViewEntity);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsCmsHeaderView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        Intrinsics.checkNotNullExpressionValue(from, "LayoutInflater.from(context)");
        initView(from, context);
    }

    public final void onSelected(int position) {
        HeaderViewListener headerViewListener = this.cmsHeaderViewListener;
        if (headerViewListener != null) {
            headerViewListener.onSelected(position);
        }
    }

    public final void onClick(ClickType clickType, View view, String uri) {
        Intrinsics.checkNotNullParameter(clickType, "clickType");
        Intrinsics.checkNotNullParameter(view, "view");
        HeaderViewListener headerViewListener = this.cmsHeaderViewListener;
        if (headerViewListener != null) {
            headerViewListener.onClick(clickType, view, uri);
        }
    }

    public final void setCmsHeaderViewListener(HeaderViewListener headerViewListener) {
        Intrinsics.checkNotNullParameter(headerViewListener, "headerViewListener");
        this.cmsHeaderViewListener = headerViewListener;
    }

    /* compiled from: AbsCmsHeaderView.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/glority/android/cms/headview/base/AbsCmsHeaderView$ClickType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "USER_IMAGE", "SIMILAR_IMAGE", "NO_MATCH", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public enum ClickType {
        USER_IMAGE("user_image"),
        SIMILAR_IMAGE("similar_image"),
        NO_MATCH("no_match");

        private final String value;

        ClickType(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }
}
