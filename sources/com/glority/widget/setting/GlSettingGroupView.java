package com.glority.widget.setting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.glority.android.xx.constants.Args;
import com.glority.widget.GlTextView;
import com.glority.widget.databinding.GlSettingGroupBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlSettingGroupView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/glority/widget/setting/GlSettingGroupView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/glority/widget/databinding/GlSettingGroupBinding;", "getBinding", "()Lcom/glority/widget/databinding/GlSettingGroupBinding;", "addItem", "", "view", "Landroid/view/View;", "tag", "", "removeItem", "setTile", Args.title, "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlSettingGroupView extends LinearLayout {
    private final GlSettingGroupBinding binding;

    public GlSettingGroupView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ GlSettingGroupView(android.content.Context r1, android.util.AttributeSet r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L8
            r2 = 0
            r3 = r2
            android.util.AttributeSet r3 = (android.util.AttributeSet) r3
        L8:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.setting.GlSettingGroupView.<init>(android.content.Context, android.util.AttributeSet, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlSettingGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        GlSettingGroupBinding inflate = GlSettingGroupBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "GlSettingGroupBinding.in….from(context),this,true)");
        this.binding = inflate;
    }

    public final GlSettingGroupBinding getBinding() {
        return this.binding;
    }

    public final void setTile(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        GlTextView glTextView = this.binding.titleTv;
        Intrinsics.checkNotNullExpressionValue(glTextView, "binding.titleTv");
        glTextView.setText(title);
    }

    public final void addItem(View view, String tag) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tag, "tag");
        view.setTag(tag);
        this.binding.containerV.addView(view);
        setVisibility(0);
    }

    public final void removeItem(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        View findViewWithTag = findViewWithTag(tag);
        if (findViewWithTag != null) {
            removeView(findViewWithTag);
        }
        if (getChildCount() == 0) {
            setVisibility(8);
        }
    }
}
