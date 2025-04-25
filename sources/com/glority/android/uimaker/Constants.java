package com.glority.android.uimaker;

import com.glority.android.uimaker.parameter.baseview.ImageViewParameter;
import com.glority.android.uimaker.parameter.baseview.TextViewParameter;
import com.glority.android.uimaker.parameter.baseview.ViewGroupParameter;
import com.glority.android.uimaker.parameter.baseview.ViewParameter;
import com.glority.android.uimaker.parameter.componentview.GlPolicyView1Parameter;
import com.glority.android.uimaker.parameter.componentview.GlPolicyView2Parameter;
import com.glority.android.uimaker.parameter.componentview.GlPolicyView3Parameter;
import com.glority.android.uimaker.parameter.componentview.GlPurchaseView10Parameter;
import com.glority.android.uimaker.parameter.componentview.GlPurchaseView11Parameter;
import com.glority.android.uimaker.parameter.componentview.GlPurchaseView12Parameter;
import com.glority.android.uimaker.parameter.componentview.GlPurchaseView13Parameter;
import com.glority.android.uimaker.parameter.componentview.GlPurchaseView1Parameter;
import com.glority.android.uimaker.parameter.componentview.GlPurchaseView2Parameter;
import com.glority.android.uimaker.parameter.componentview.GlPurchaseView3Parameter;
import com.glority.android.uimaker.parameter.componentview.GlPurchaseView4Parameter;
import com.glority.android.uimaker.parameter.componentview.GlPurchaseView5Parameter;
import com.glority.android.uimaker.parameter.componentview.GlPurchaseView6Parameter;
import com.glority.android.uimaker.parameter.componentview.GlPurchaseView7Parameter;
import com.glority.android.uimaker.parameter.componentview.GlPurchaseView8Parameter;
import com.glority.android.uimaker.parameter.componentview.GlPurchaseView9Parameter;
import com.glority.widget.GlConstraintLayout;
import com.glority.widget.GlImageView;
import com.glority.widget.GlTextView;
import com.glority.widget.purchase.policy.GlPolicyView1;
import com.glority.widget.purchase.policy.GlPolicyView2;
import com.glority.widget.purchase.policy.GlPolicyView3;
import com.glority.widget.purchase.purchase.GlPurchaseView1;
import com.glority.widget.purchase.purchase.GlPurchaseView10;
import com.glority.widget.purchase.purchase.GlPurchaseView11;
import com.glority.widget.purchase.purchase.GlPurchaseView12;
import com.glority.widget.purchase.purchase.GlPurchaseView13;
import com.glority.widget.purchase.purchase.GlPurchaseView2;
import com.glority.widget.purchase.purchase.GlPurchaseView3;
import com.glority.widget.purchase.purchase.GlPurchaseView4;
import com.glority.widget.purchase.purchase.GlPurchaseView5;
import com.glority.widget.purchase.purchase.GlPurchaseView6;
import com.glority.widget.purchase.purchase.GlPurchaseView7;
import com.glority.widget.purchase.purchase.GlPurchaseView8;
import com.glority.widget.purchase.purchase.GlPurchaseView9;
import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Constants.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n`\u000bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/glority/android/uimaker/Constants;", "", "()V", "allViewParameters", "", "Lcom/glority/android/uimaker/parameter/baseview/ViewParameter;", "getAllViewParameters", "()Ljava/util/Set;", "getViewNameAndViewMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "uimaker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class Constants {
    public static final Constants INSTANCE;
    private static final Set<ViewParameter> allViewParameters;

    static {
        Constants constants = new Constants();
        INSTANCE = constants;
        Set<ViewParameter> keySet = constants.getViewNameAndViewMap().keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "getViewNameAndViewMap().keys");
        allViewParameters = keySet;
    }

    private Constants() {
    }

    public final Set<ViewParameter> getAllViewParameters() {
        return allViewParameters;
    }

    public final HashMap<ViewParameter, String> getViewNameAndViewMap() {
        return MapsKt.hashMapOf(TuplesKt.to(new ImageViewParameter(), GlImageView.class.getName()), TuplesKt.to(new TextViewParameter(), GlTextView.class.getName()), TuplesKt.to(new ViewGroupParameter(), GlConstraintLayout.class.getName()), TuplesKt.to(new GlPurchaseView1Parameter(), GlPurchaseView1.class.getName()), TuplesKt.to(new GlPurchaseView2Parameter(), GlPurchaseView2.class.getName()), TuplesKt.to(new GlPurchaseView3Parameter(), GlPurchaseView3.class.getName()), TuplesKt.to(new GlPurchaseView4Parameter(), GlPurchaseView4.class.getName()), TuplesKt.to(new GlPurchaseView5Parameter(), GlPurchaseView5.class.getName()), TuplesKt.to(new GlPurchaseView6Parameter(), GlPurchaseView6.class.getName()), TuplesKt.to(new GlPurchaseView7Parameter(), GlPurchaseView7.class.getName()), TuplesKt.to(new GlPurchaseView8Parameter(), GlPurchaseView8.class.getName()), TuplesKt.to(new GlPurchaseView9Parameter(), GlPurchaseView9.class.getName()), TuplesKt.to(new GlPurchaseView10Parameter(), GlPurchaseView10.class.getName()), TuplesKt.to(new GlPurchaseView11Parameter(), GlPurchaseView11.class.getName()), TuplesKt.to(new GlPurchaseView12Parameter(), GlPurchaseView12.class.getName()), TuplesKt.to(new GlPurchaseView13Parameter(), GlPurchaseView13.class.getName()), TuplesKt.to(new GlPolicyView1Parameter(), GlPolicyView1.class.getName()), TuplesKt.to(new GlPolicyView2Parameter(), GlPolicyView2.class.getName()), TuplesKt.to(new GlPolicyView3Parameter(), GlPolicyView3.class.getName()));
    }
}
