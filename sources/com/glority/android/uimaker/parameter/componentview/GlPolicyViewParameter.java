package com.glority.android.uimaker.parameter.componentview;

import com.glority.android.uimaker.parameter.baseview.TextViewParameter;
import com.glority.android.xx.constants.Args;
import kotlin.Metadata;

/* compiled from: GlPolicyViewParameter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/glority/android/uimaker/parameter/componentview/GlPolicyViewParameter;", "Lcom/glority/android/uimaker/parameter/componentview/ComponentViewParameter;", "()V", "desc", "Lcom/glority/android/uimaker/parameter/baseview/TextViewParameter;", "getDesc", "()Lcom/glority/android/uimaker/parameter/baseview/TextViewParameter;", "setDesc", "(Lcom/glority/android/uimaker/parameter/baseview/TextViewParameter;)V", Args.title, "getTitle", "setTitle", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public abstract class GlPolicyViewParameter extends ComponentViewParameter {
    private TextViewParameter desc;
    private TextViewParameter title;

    public final TextViewParameter getTitle() {
        return this.title;
    }

    public final void setTitle(TextViewParameter textViewParameter) {
        this.title = textViewParameter;
    }

    public final TextViewParameter getDesc() {
        return this.desc;
    }

    public final void setDesc(TextViewParameter textViewParameter) {
        this.desc = textViewParameter;
    }
}
